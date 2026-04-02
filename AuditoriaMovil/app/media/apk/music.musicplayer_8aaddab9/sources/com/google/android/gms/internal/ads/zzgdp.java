package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class zzgdp implements zzfxc {
    private final ThreadLocal<Mac> zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzgdp(String str, Key key) throws GeneralSecurityException {
        char c2;
        int i2;
        zzgdo zzgdoVar = new zzgdo(this);
        this.zza = zzgdoVar;
        if (!zzfvw.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = str;
        this.zzc = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            i2 = 20;
        } else if (c2 == 1) {
            i2 = 28;
        } else if (c2 == 2) {
            i2 = 32;
        } else if (c2 != 3) {
            if (c2 != 4) {
                throw new NoSuchAlgorithmException(str.length() != 0 ? "unknown Hmac algorithm: ".concat(str) : new String("unknown Hmac algorithm: "));
            }
            this.zzd = 64;
            zzgdoVar.get();
        } else {
            i2 = 48;
        }
        this.zzd = i2;
        zzgdoVar.get();
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final byte[] zza(byte[] bArr, int i2) throws GeneralSecurityException {
        if (i2 <= this.zzd) {
            this.zza.get().update(bArr);
            return Arrays.copyOf(this.zza.get().doFinal(), i2);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
