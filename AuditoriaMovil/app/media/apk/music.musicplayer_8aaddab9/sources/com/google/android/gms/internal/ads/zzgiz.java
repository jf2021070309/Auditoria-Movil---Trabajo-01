package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgiz {
    public static /* synthetic */ boolean zza(byte b2) {
        return b2 >= 0;
    }

    public static /* synthetic */ boolean zzb(byte b2) {
        return b2 < -32;
    }

    public static /* synthetic */ boolean zzc(byte b2) {
        return b2 < -16;
    }

    public static /* synthetic */ void zzd(byte b2, byte b3, char[] cArr, int i2) throws zzggm {
        if (b2 < -62 || zzg(b3)) {
            throw zzggm.zzl();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static /* synthetic */ void zze(byte b2, byte b3, byte b4, char[] cArr, int i2) throws zzggm {
        if (!zzg(b3)) {
            if (b2 == -32) {
                if (b3 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b3 < -96) {
                    b2 = -19;
                }
            }
            if (!zzg(b4)) {
                cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                return;
            }
        }
        throw zzggm.zzl();
    }

    public static /* synthetic */ void zzf(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws zzggm {
        if (!zzg(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !zzg(b4) && !zzg(b5)) {
                int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw zzggm.zzl();
    }

    private static boolean zzg(byte b2) {
        return b2 > -65;
    }
}
