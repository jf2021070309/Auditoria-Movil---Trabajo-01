package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgiz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(byte b) {
        return b >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzb(byte b) {
        return b < -32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzc(byte b) {
        return b < -16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(byte b, byte b2, char[] cArr, int i) throws zzggm {
        if (b < -62 || zzg(b2)) {
            throw zzggm.zzl();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzggm {
        if (zzg(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || zzg(b3) || zzg(b4)) {
            throw zzggm.zzl();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(byte b, byte b2, byte b3, char[] cArr, int i) throws zzggm {
        if (!zzg(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!zzg(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzggm.zzl();
    }
}
