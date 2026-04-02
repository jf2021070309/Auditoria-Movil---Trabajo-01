package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
public final class zzfwp {
    public static void zza(zzfzs zzfzsVar) throws GeneralSecurityException {
        zzgcz.zzd(zzc(zzfzsVar.zza().zzg()));
        zzb(zzfzsVar.zza().zzh());
        if (zzfzsVar.zzi() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzfum.zzg(zzfzsVar.zzc().zza());
    }

    public static String zzb(int i2) throws NoSuchAlgorithmException {
        int i3 = i2 - 2;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return "HmacSha224";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzgaf.zza(i2))));
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    public static int zzc(int i2) throws GeneralSecurityException {
        int i3 = i2 - 2;
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zzgad.zza(i2))));
            }
            return 2;
        }
        return 1;
    }

    public static int zzd(int i2) throws GeneralSecurityException {
        int i3 = i2 - 2;
        int i4 = 1;
        if (i3 != 1) {
            i4 = 2;
            if (i3 != 2) {
                if (i3 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zzfzj.zza(i2))));
            }
        }
        return i4;
    }
}
