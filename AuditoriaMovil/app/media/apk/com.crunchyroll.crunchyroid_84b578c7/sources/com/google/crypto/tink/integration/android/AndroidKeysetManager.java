package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.BinaryKeysetReader;
import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeysetManager;
import com.google.crypto.tink.KeysetWriter;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Hex;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
/* loaded from: classes4.dex */
public final class AndroidKeysetManager {
    private static final String TAG = "AndroidKeysetManager";
    private static final Object lock = new Object();
    private KeysetManager keysetManager;
    private final Aead masterAead;
    private final KeysetWriter writer;

    /* renamed from: com.google.crypto.tink.integration.android.AndroidKeysetManager$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public /* synthetic */ AndroidKeysetManager(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    public static /* synthetic */ boolean access$700() {
        return isAtLeastM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyTemplate.OutputPrefixType fromProto(OutputPrefixType outputPrefixType) {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return KeyTemplate.OutputPrefixType.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return KeyTemplate.OutputPrefixType.RAW;
            }
            return KeyTemplate.OutputPrefixType.LEGACY;
        }
        return KeyTemplate.OutputPrefixType.TINK;
    }

    private static boolean isAtLeastM() {
        return true;
    }

    private boolean shouldUseKeystore() {
        if (this.masterAead != null && isAtLeastM()) {
            return true;
        }
        return false;
    }

    private void write(KeysetManager keysetManager) throws GeneralSecurityException {
        try {
            if (shouldUseKeystore()) {
                keysetManager.getKeysetHandle().write(this.writer, this.masterAead);
            } else {
                CleartextKeysetHandle.write(keysetManager.getKeysetHandle(), this.writer);
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    @CanIgnoreReturnValue
    @Deprecated
    public synchronized AndroidKeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager add = this.keysetManager.add(keyTemplate);
        this.keysetManager = add;
        write(add);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized AndroidKeysetManager delete(int i) throws GeneralSecurityException {
        KeysetManager delete = this.keysetManager.delete(i);
        this.keysetManager = delete;
        write(delete);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized AndroidKeysetManager destroy(int i) throws GeneralSecurityException {
        KeysetManager destroy = this.keysetManager.destroy(i);
        this.keysetManager = destroy;
        write(destroy);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized AndroidKeysetManager disable(int i) throws GeneralSecurityException {
        KeysetManager disable = this.keysetManager.disable(i);
        this.keysetManager = disable;
        write(disable);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized AndroidKeysetManager enable(int i) throws GeneralSecurityException {
        KeysetManager enable = this.keysetManager.enable(i);
        this.keysetManager = enable;
        write(enable);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() throws GeneralSecurityException {
        return this.keysetManager.getKeysetHandle();
    }

    public synchronized boolean isUsingKeystore() {
        return shouldUseKeystore();
    }

    @CanIgnoreReturnValue
    @InlineMe(replacement = "this.setPrimary(keyId)")
    @Deprecated
    public synchronized AndroidKeysetManager promote(int i) throws GeneralSecurityException {
        return setPrimary(i);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public synchronized AndroidKeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager rotate = this.keysetManager.rotate(keyTemplate);
        this.keysetManager = rotate;
        write(rotate);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized AndroidKeysetManager setPrimary(int i) throws GeneralSecurityException {
        KeysetManager primary = this.keysetManager.setPrimary(i);
        this.keysetManager = primary;
        write(primary);
        return this;
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private KeysetManager keysetManager;
        private Context context = null;
        private String keysetName = null;
        private String prefFileName = null;
        private String masterKeyUri = null;
        private Aead masterAead = null;
        private boolean useKeystore = true;
        private KeyTemplate keyTemplate = null;

        private KeysetManager generateKeysetAndWriteToPrefs() throws GeneralSecurityException, IOException {
            if (this.keyTemplate != null) {
                KeysetManager add = KeysetManager.withEmptyKeyset().add(this.keyTemplate);
                KeysetManager primary = add.setPrimary(add.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
                SharedPrefKeysetWriter sharedPrefKeysetWriter = new SharedPrefKeysetWriter(this.context, this.keysetName, this.prefFileName);
                if (this.masterAead != null) {
                    primary.getKeysetHandle().write(sharedPrefKeysetWriter, this.masterAead);
                } else {
                    CleartextKeysetHandle.write(primary.getKeysetHandle(), sharedPrefKeysetWriter);
                }
                return primary;
            }
            throw new GeneralSecurityException("cannot read or generate keyset");
        }

        private static byte[] readKeysetFromPrefs(Context context, String str, String str2) throws IOException {
            SharedPreferences sharedPreferences;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                try {
                    String string = sharedPreferences.getString(str, null);
                    if (string == null) {
                        return null;
                    }
                    return Hex.decode(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
                }
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }

        private KeysetManager readKeysetInCleartext(byte[] bArr) throws GeneralSecurityException, IOException {
            return KeysetManager.withKeysetHandle(CleartextKeysetHandle.read(BinaryKeysetReader.withBytes(bArr)));
        }

        private KeysetManager readMasterkeyDecryptAndParseKeyset(byte[] bArr) throws GeneralSecurityException, IOException {
            try {
                this.masterAead = new AndroidKeystoreKmsClient().getAead(this.masterKeyUri);
                try {
                    return KeysetManager.withKeysetHandle(KeysetHandle.read(BinaryKeysetReader.withBytes(bArr), this.masterAead));
                } catch (IOException | GeneralSecurityException e) {
                    try {
                        return readKeysetInCleartext(bArr);
                    } catch (IOException unused) {
                        throw e;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                try {
                    KeysetManager readKeysetInCleartext = readKeysetInCleartext(bArr);
                    String unused2 = AndroidKeysetManager.TAG;
                    return readKeysetInCleartext;
                } catch (IOException unused3) {
                    throw e2;
                }
            }
        }

        private Aead readOrGenerateNewMasterKey() throws GeneralSecurityException {
            if (!AndroidKeysetManager.access$700()) {
                String unused = AndroidKeysetManager.TAG;
                return null;
            }
            AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
            try {
                boolean generateKeyIfNotExist = AndroidKeystoreKmsClient.generateKeyIfNotExist(this.masterKeyUri);
                try {
                    return androidKeystoreKmsClient.getAead(this.masterKeyUri);
                } catch (GeneralSecurityException | ProviderException e) {
                    if (generateKeyIfNotExist) {
                        String unused2 = AndroidKeysetManager.TAG;
                        return null;
                    }
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.masterKeyUri), e);
                }
            } catch (GeneralSecurityException | ProviderException unused3) {
                String unused4 = AndroidKeysetManager.TAG;
                return null;
            }
        }

        public synchronized AndroidKeysetManager build() throws GeneralSecurityException, IOException {
            AndroidKeysetManager androidKeysetManager;
            if (this.keysetName != null) {
                synchronized (AndroidKeysetManager.lock) {
                    byte[] readKeysetFromPrefs = readKeysetFromPrefs(this.context, this.keysetName, this.prefFileName);
                    if (readKeysetFromPrefs == null) {
                        if (this.masterKeyUri != null) {
                            this.masterAead = readOrGenerateNewMasterKey();
                        }
                        this.keysetManager = generateKeysetAndWriteToPrefs();
                    } else {
                        if (this.masterKeyUri != null && AndroidKeysetManager.access$700()) {
                            this.keysetManager = readMasterkeyDecryptAndParseKeyset(readKeysetFromPrefs);
                        }
                        this.keysetManager = readKeysetInCleartext(readKeysetFromPrefs);
                    }
                    androidKeysetManager = new AndroidKeysetManager(this, null);
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            return androidKeysetManager;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder doNotUseKeystore() {
            this.masterKeyUri = null;
            this.useKeystore = false;
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public Builder withKeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
            this.keyTemplate = KeyTemplate.create(keyTemplate.getTypeUrl(), keyTemplate.getValue().toByteArray(), AndroidKeysetManager.fromProto(keyTemplate.getOutputPrefixType()));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withMasterKeyUri(String str) {
            if (str.startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                if (this.useKeystore) {
                    this.masterKeyUri = str;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        @CanIgnoreReturnValue
        public Builder withSharedPref(Context context, String str, String str2) throws IOException {
            if (context != null) {
                if (str != null) {
                    this.context = context;
                    this.keysetName = str;
                    this.prefFileName = str2;
                    return this;
                }
                throw new IllegalArgumentException("need a keyset name");
            }
            throw new IllegalArgumentException("need an Android context");
        }

        @CanIgnoreReturnValue
        public Builder withKeyTemplate(KeyTemplate keyTemplate) {
            this.keyTemplate = keyTemplate;
            return this;
        }
    }

    private AndroidKeysetManager(Builder builder) {
        this.writer = new SharedPrefKeysetWriter(builder.context, builder.keysetName, builder.prefFileName);
        this.masterAead = builder.masterAead;
        this.keysetManager = builder.keysetManager;
    }

    @CanIgnoreReturnValue
    public synchronized AndroidKeysetManager add(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager add = this.keysetManager.add(keyTemplate);
        this.keysetManager = add;
        write(add);
        return this;
    }
}
