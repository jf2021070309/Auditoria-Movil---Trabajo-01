package com.google.android.gms.internal.pal;

import com.google.common.base.Ascii;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzaft {
    public static /* bridge */ /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!zze(b2)) {
            if ((((b2 + 112) + (b << Ascii.FS)) >> 30) == 0 && !zze(b3) && !zze(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw zzadi.zzd();
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!zze(b2)) {
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
            if (!zze(b3)) {
                cArr[i] = (char) (((b & Ascii.SI) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzadi.zzd();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !zze(b2)) {
            cArr[i] = (char) (((b & Ascii.US) << 6) | (b2 & 63));
            return;
        }
        throw zzadi.zzd();
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b) {
        if (b >= 0) {
            return true;
        }
        return false;
    }

    private static boolean zze(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}
