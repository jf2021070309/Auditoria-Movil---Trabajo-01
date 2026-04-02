package com.ellation.crunchyroll.api.etp.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.t8.a;
import com.amazon.aps.iva.t8.b;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.stats.CodePackage;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.daead.DeterministicAeadConfig;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import kotlin.Metadata;
/* compiled from: SharedPreferencesTokenStorage.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010&\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/SharedPreferencesTokenStorage;", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenStorage;", "Lcom/amazon/aps/iva/kb0/q;", "migrateToEncryptedStorage", "Landroid/content/SharedPreferences;", "buildSharedPreferences", "createSharedPreferences", "deleteSharedPreferences", "saveLastUsedTime", "clearToken", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/amazon/aps/iva/t50/c;", "systemTimeProvider", "Lcom/amazon/aps/iva/t50/c;", "Lcom/amazon/aps/iva/t8/b;", "masterKey", "Lcom/amazon/aps/iva/t8/b;", "sharedPreferences", "Landroid/content/SharedPreferences;", "", "refreshTokenKey", "Ljava/lang/String;", "refreshTokenUsedTimeKey", "", "isPresent", "()Z", "value", "getRefreshToken", "()Ljava/lang/String;", "setRefreshToken", "(Ljava/lang/String;)V", "refreshToken", "", "getLastUsedSeconds", "()J", "lastUsedSeconds", "environment", "<init>", "(Landroid/content/Context;Lcom/amazon/aps/iva/t50/c;Ljava/lang/String;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SharedPreferencesTokenStorage implements RefreshTokenStorage {
    public static final int $stable = 8;
    private final Context context;
    private final b masterKey;
    private final String refreshTokenKey;
    private final String refreshTokenUsedTimeKey;
    private final SharedPreferences sharedPreferences;
    private final c systemTimeProvider;

    public SharedPreferencesTokenStorage(Context context, c cVar, String str) {
        j.f(context, "context");
        j.f(cVar, "systemTimeProvider");
        j.f(str, "environment");
        this.context = context;
        this.systemTimeProvider = cVar;
        context.getApplicationContext();
        b.EnumC0737b enumC0737b = b.EnumC0737b.AES256_GCM;
        if (b.a.a[enumC0737b.ordinal()] == 1) {
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
            if (build != null) {
                Object obj = com.amazon.aps.iva.t8.c.a;
                if (build.getKeySize() == 256) {
                    if (Arrays.equals(build.getBlockModes(), new String[]{CodePackage.GCM})) {
                        if (build.getPurposes() == 3) {
                            if (Arrays.equals(build.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                                if (build.isUserAuthenticationRequired() && build.getUserAuthenticationValidityDurationSeconds() < 1) {
                                    throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                                }
                                synchronized (com.amazon.aps.iva.t8.c.a) {
                                    String keystoreAlias = build.getKeystoreAlias();
                                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                    keyStore.load(null);
                                    if (!keyStore.containsAlias(keystoreAlias)) {
                                        try {
                                            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                            keyGenerator.init(build);
                                            keyGenerator.generateKey();
                                        } catch (ProviderException e) {
                                            throw new GeneralSecurityException(e.getMessage(), e);
                                        }
                                    }
                                }
                                this.masterKey = new b(build.getKeystoreAlias(), build);
                                this.sharedPreferences = buildSharedPreferences();
                                this.refreshTokenKey = str.concat("_etp_rt");
                                this.refreshTokenUsedTimeKey = str.concat("_etp_rt_used_time_sec");
                                migrateToEncryptedStorage();
                                return;
                            }
                            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(build.getEncryptionPaddings()));
                        }
                        throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + build.getPurposes());
                    }
                    throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(build.getBlockModes()));
                }
                throw new IllegalArgumentException("invalid key size, want 256 bits got " + build.getKeySize() + " bits");
            }
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }
        throw new IllegalArgumentException("Unsupported scheme: " + enumC0737b);
    }

    private final SharedPreferences buildSharedPreferences() {
        try {
            return createSharedPreferences();
        } catch (GeneralSecurityException unused) {
            deleteSharedPreferences();
            return createSharedPreferences();
        }
    }

    private final SharedPreferences createSharedPreferences() {
        Context context = this.context;
        b bVar = this.masterKey;
        a.d dVar = a.d.AES256_SIV;
        a.e eVar = a.e.AES256_GCM;
        String str = bVar.a;
        DeterministicAeadConfig.register();
        AeadConfig.register();
        Context applicationContext = context.getApplicationContext();
        AndroidKeysetManager.Builder withSharedPref = new AndroidKeysetManager.Builder().withKeyTemplate(dVar.getKeyTemplate()).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", "rt_store_secure");
        KeysetHandle keysetHandle = withSharedPref.withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str).build().getKeysetHandle();
        AndroidKeysetManager.Builder withSharedPref2 = new AndroidKeysetManager.Builder().withKeyTemplate(eVar.getKeyTemplate()).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", "rt_store_secure");
        Aead aead = (Aead) withSharedPref2.withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str).build().getKeysetHandle().getPrimitive(Aead.class);
        return new a(applicationContext.getSharedPreferences("rt_store_secure", 0), aead, (DeterministicAead) keysetHandle.getPrimitive(DeterministicAead.class));
    }

    private final void deleteSharedPreferences() {
        try {
            this.context.getSharedPreferences("rt_store_secure", 0).edit().clear().apply();
            this.context.deleteSharedPreferences("rt_store_secure");
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry("_androidx_security_master_key_");
        } catch (Exception unused) {
        }
    }

    private final void migrateToEncryptedStorage() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences("rt_store", 0);
        String string = sharedPreferences.getString(this.refreshTokenKey, null);
        if (string != null) {
            this.sharedPreferences.edit().putString(this.refreshTokenKey, string).apply();
            sharedPreferences.edit().remove(this.refreshTokenKey).apply();
        }
        if (sharedPreferences.contains(this.refreshTokenUsedTimeKey)) {
            this.sharedPreferences.edit().putLong(this.refreshTokenUsedTimeKey, sharedPreferences.getLong(this.refreshTokenUsedTimeKey, 0L)).apply();
            sharedPreferences.edit().remove(this.refreshTokenUsedTimeKey).apply();
        }
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage
    public void clearToken() {
        this.sharedPreferences.edit().remove(this.refreshTokenKey).remove(this.refreshTokenUsedTimeKey).apply();
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage
    public long getLastUsedSeconds() {
        return this.systemTimeProvider.b() - this.sharedPreferences.getLong(this.refreshTokenUsedTimeKey, 0L);
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage
    public String getRefreshToken() {
        String string = this.sharedPreferences.getString(this.refreshTokenKey, "");
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage
    public boolean isPresent() {
        return this.sharedPreferences.contains(this.refreshTokenKey);
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage
    public void saveLastUsedTime() {
        this.sharedPreferences.edit().putLong(this.refreshTokenUsedTimeKey, this.systemTimeProvider.b()).apply();
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage
    public void setRefreshToken(String str) {
        j.f(str, "value");
        this.sharedPreferences.edit().putString(this.refreshTokenKey, str).apply();
    }

    public /* synthetic */ SharedPreferencesTokenStorage(Context context, c cVar, String str, int i, e eVar) {
        this(context, (i & 2) != 0 ? c.b.a : cVar, str);
    }
}
