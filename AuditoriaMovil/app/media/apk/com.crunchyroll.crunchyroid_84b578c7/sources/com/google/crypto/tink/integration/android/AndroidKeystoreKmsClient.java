package com.google.crypto.tink.integration.android;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KmsClient;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
/* loaded from: classes4.dex */
public final class AndroidKeystoreKmsClient implements KmsClient {
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 40;
    public static final String PREFIX = "android-keystore://";
    private static final String TAG = "AndroidKeystoreKmsClient";
    private static final Object keyCreationLock = new Object();
    private KeyStore keyStore;
    private final String keyUri;

    /* loaded from: classes4.dex */
    public static final class Builder {
        KeyStore keyStore;
        String keyUri = null;

        public Builder() {
            this.keyStore = null;
            if (AndroidKeystoreKmsClient.access$000()) {
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.keyStore = keyStore;
                    keyStore.load(null);
                    return;
                } catch (IOException | GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }

        public AndroidKeystoreKmsClient build() {
            return new AndroidKeystoreKmsClient(this);
        }

        @CanIgnoreReturnValue
        public Builder setKeyStore(KeyStore keyStore) {
            if (keyStore != null) {
                this.keyStore = keyStore;
                return this;
            }
            throw new IllegalArgumentException("val cannot be null");
        }

        @CanIgnoreReturnValue
        public Builder setKeyUri(String str) {
            if (str != null && str.toLowerCase(Locale.US).startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                this.keyUri = str;
                return this;
            }
            throw new IllegalArgumentException("val must start with android-keystore://");
        }
    }

    public static /* synthetic */ boolean access$000() {
        return isAtLeastM();
    }

    public static boolean generateKeyIfNotExist(String str) throws GeneralSecurityException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        synchronized (keyCreationLock) {
            if (!androidKeystoreKmsClient.hasKey(str)) {
                generateNewAesGcmKeyWithoutExistenceCheck(str);
                return true;
            }
            return false;
        }
    }

    public static void generateNewAeadKey(String str) throws GeneralSecurityException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        synchronized (keyCreationLock) {
            if (!androidKeystoreKmsClient.hasKey(str)) {
                generateNewAesGcmKeyWithoutExistenceCheck(str);
            } else {
                throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
            }
        }
    }

    public static void generateNewAesGcmKeyWithoutExistenceCheck(String str) throws GeneralSecurityException {
        String validateKmsKeyUriAndRemovePrefix = Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(validateKmsKeyUriAndRemovePrefix, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public static Aead getOrGenerateNewAeadKey(String str) throws GeneralSecurityException, IOException {
        AndroidKeystoreKmsClient androidKeystoreKmsClient = new AndroidKeystoreKmsClient();
        synchronized (keyCreationLock) {
            if (!androidKeystoreKmsClient.hasKey(str)) {
                generateNewAesGcmKeyWithoutExistenceCheck(str);
            }
        }
        return androidKeystoreKmsClient.getAead(str);
    }

    private static boolean isAtLeastM() {
        return true;
    }

    private static void sleepRandomAmount() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    private static Aead validateAead(Aead aead) throws GeneralSecurityException {
        byte[] randBytes = Random.randBytes(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(randBytes, aead.decrypt(aead.encrypt(randBytes, bArr), bArr))) {
            return aead;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    public synchronized void deleteKey(String str) throws GeneralSecurityException {
        this.keyStore.deleteEntry(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r3.toLowerCase(java.util.Locale.US).startsWith(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.PREFIX) != false) goto L14;
     */
    @Override // com.google.crypto.tink.KmsClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean doesSupport(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.keyUri     // Catch: java.lang.Throwable -> L24
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Le
            monitor-exit(r2)
            return r1
        Le:
            java.lang.String r0 = r2.keyUri     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L21
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            monitor-exit(r2)
            return r1
        L24:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.doesSupport(java.lang.String):boolean");
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized Aead getAead(String str) throws GeneralSecurityException {
        String str2 = this.keyUri;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.keyUri, str));
        }
        return validateAead(new AndroidKeystoreAesGcm(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str), this.keyStore));
    }

    public synchronized boolean hasKey(String str) throws GeneralSecurityException {
        String str2;
        try {
            try {
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        } catch (NullPointerException unused) {
            sleepRandomAmount();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.keyStore = keyStore;
            keyStore.load(null);
            return this.keyStore.containsAlias(str2);
        }
        return this.keyStore.containsAlias(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, str));
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withCredentials(String str) throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withDefaultCredentials() throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }

    public AndroidKeystoreKmsClient() throws GeneralSecurityException {
        this(new Builder());
    }

    @Deprecated
    public AndroidKeystoreKmsClient(String str) {
        this(new Builder().setKeyUri(str));
    }

    private AndroidKeystoreKmsClient(Builder builder) {
        this.keyUri = builder.keyUri;
        this.keyStore = builder.keyStore;
    }
}
