package com.google.android.gms.internal.pal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzmx {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzb = zzb(bArr, 0, 0);
        long zzb2 = zzb(bArr, 3, 2) & 67108611;
        long zzb3 = zzb(bArr, 6, 4) & 67092735;
        long zzb4 = zzb(bArr, 9, 6) & 66076671;
        long zzb5 = zzb(bArr, 12, 8) & 1048575;
        long j = zzb2 * 5;
        long j2 = zzb3 * 5;
        long j3 = zzb4 * 5;
        long j4 = zzb5 * 5;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        int i2 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 < length) {
                int min = Math.min(16, length - i2);
                System.arraycopy(bArr2, i2, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i, (byte) 0);
                }
                long zzb6 = j9 + zzb(bArr3, 0, 0);
                long zzb7 = j6 + zzb(bArr3, 3, 2);
                long zzb8 = j5 + zzb(bArr3, 6, 4);
                long zzb9 = j7 + zzb(bArr3, 9, 6);
                long zzb10 = j8 + (zzb(bArr3, 12, 8) | (bArr3[16] << Ascii.CAN));
                long j10 = (zzb10 * j) + (zzb9 * j2) + (zzb8 * j3) + (zzb7 * j4) + (zzb6 * zzb);
                long j11 = (zzb10 * j2) + (zzb9 * j3) + (zzb8 * j4) + (zzb7 * zzb) + (zzb6 * zzb2) + (j10 >> 26);
                long j12 = (zzb10 * j3) + (zzb9 * j4) + (zzb8 * zzb) + (zzb7 * zzb2) + (zzb6 * zzb3) + (j11 >> 26);
                long j13 = (zzb10 * j4) + (zzb9 * zzb) + (zzb8 * zzb2) + (zzb7 * zzb3) + (zzb6 * zzb4) + (j12 >> 26);
                long j14 = zzb9 * zzb2;
                long j15 = zzb10 * zzb;
                long j16 = j15 + j14 + (zzb8 * zzb3) + (zzb7 * zzb4) + (zzb6 * zzb5) + (j13 >> 26);
                long j17 = ((j16 >> 26) * 5) + (j10 & 67108863);
                j9 = j17 & 67108863;
                j6 = (j11 & 67108863) + (j17 >> 26);
                i2 += 16;
                j8 = j16 & 67108863;
                j7 = j13 & 67108863;
                j5 = j12 & 67108863;
                i = 17;
            } else {
                long j18 = j5 + (j6 >> 26);
                long j19 = j18 & 67108863;
                long j20 = j7 + (j18 >> 26);
                long j21 = j20 & 67108863;
                long j22 = j8 + (j20 >> 26);
                long j23 = j22 & 67108863;
                long j24 = ((j22 >> 26) * 5) + j9;
                long j25 = j24 & 67108863;
                long j26 = (j6 & 67108863) + (j24 >> 26);
                long j27 = j25 + 5;
                long j28 = (j27 >> 26) + j26;
                long j29 = j19 + (j28 >> 26);
                long j30 = j21 + (j29 >> 26);
                long j31 = (j23 + (j30 >> 26)) - 67108864;
                long j32 = j31 >> 63;
                long j33 = ~j32;
                long j34 = (j28 & 67108863 & j33) | (j26 & j32);
                long j35 = (j19 & j32) | (j29 & 67108863 & j33);
                long j36 = (j21 & j32) | (j30 & 67108863 & j33);
                long zzc = (((j25 & j32) | (j27 & 67108863 & j33) | (j34 << 26)) & 4294967295L) + zzc(bArr, 16);
                long zzc2 = (((j34 >> 6) | (j35 << 20)) & 4294967295L) + zzc(bArr, 20) + (zzc >> 32);
                long zzc3 = (((j35 >> 12) | (j36 << 14)) & 4294967295L) + zzc(bArr, 24) + (zzc2 >> 32);
                long zzc4 = zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzc & 4294967295L, 0);
                zzd(bArr4, zzc2 & 4294967295L, 4);
                zzd(bArr4, zzc3 & 4294967295L, 8);
                zzd(bArr4, ((((((j31 & j33) | (j23 & j32)) << 8) | (j36 >> 18)) & 4294967295L) + zzc4 + (zzc3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
        }
    }

    private static long zzb(byte[] bArr, int i, int i2) {
        return (zzc(bArr, i) >> i2) & 67108863;
    }

    private static long zzc(byte[] bArr, int i) {
        return (((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
