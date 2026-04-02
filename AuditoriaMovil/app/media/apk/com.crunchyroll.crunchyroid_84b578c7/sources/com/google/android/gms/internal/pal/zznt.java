package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zznt {
    public static void zza(zztz zztzVar) throws GeneralSecurityException {
        zzxx.zzk(zzc(zztzVar.zzf().zzg()));
        zzb(zztzVar.zzf().zzh());
        if (zztzVar.zzi() != 2) {
            zzlf.zzc(zztzVar.zza().zze());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
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
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzum.zza(i))));
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
            if (i2 == 3) {
                return 2;
            }
            if (i2 == 4) {
                return 3;
            }
            throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zzuk.zza(i))));
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
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zztq.zza(i))));
            }
        }
        return i3;
    }
}
