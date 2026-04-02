package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfwp {
    public static void zza(zzfzs zzfzsVar) throws GeneralSecurityException {
        zzgcz.zzd(zzc(zzfzsVar.zza().zzg()));
        zzb(zzfzsVar.zza().zzh());
        if (zzfzsVar.zzi() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzfum.zzg(zzfzsVar.zzc().zza());
    }

    public static String zzb(int i) throws NoSuchAlgorithmException {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return "HmacSha224";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzgaf.zza(i))));
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    public static int zzc(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zzgad.zza(i))));
            }
            return 2;
        }
        return 1;
    }

    public static int zzd(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zzfzj.zza(i))));
            }
        }
        return i3;
    }
}
