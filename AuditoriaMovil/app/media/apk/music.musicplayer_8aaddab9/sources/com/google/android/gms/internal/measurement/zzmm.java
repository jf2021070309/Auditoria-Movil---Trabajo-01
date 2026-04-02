package com.google.android.gms.internal.measurement;
/* loaded from: classes2.dex */
public final class zzmm {
    public static /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws zzkh {
        if (!zze(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !zze(b4) && !zze(b5)) {
                int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw zzkh.zzc();
    }

    public static /* synthetic */ void zzb(byte b2, byte b3, char[] cArr, int i2) throws zzkh {
        if (b2 < -62 || zze(b3)) {
            throw zzkh.zzc();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static /* synthetic */ void zzc(byte b2, byte b3, byte b4, char[] cArr, int i2) throws zzkh {
        if (!zze(b3)) {
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
            if (!zze(b4)) {
                cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                return;
            }
        }
        throw zzkh.zzc();
    }

    public static /* synthetic */ boolean zzd(byte b2) {
        return b2 >= 0;
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }
}
