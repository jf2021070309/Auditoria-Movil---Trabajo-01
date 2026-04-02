package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzgdm {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long zzc = zzc(bArr, 0, 0);
        long zzc2 = zzc(bArr, 3, 2) & 67108611;
        long zzc3 = zzc(bArr, 6, 4) & 67092735;
        long zzc4 = zzc(bArr, 9, 6) & 66076671;
        long zzc5 = zzc(bArr, 12, 8) & 1048575;
        long j2 = zzc2 * 5;
        long j3 = zzc3 * 5;
        long j4 = zzc4 * 5;
        long j5 = zzc5 * 5;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i3 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 >= length) {
                long j11 = j6 + (j7 >> 26);
                long j12 = j11 & 67108863;
                long j13 = j8 + (j11 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j9 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = ((j15 >> 26) * 5) + j10;
                long j18 = j17 & 67108863;
                long j19 = (j7 & 67108863) + (j17 >> 26);
                long j20 = j18 + 5;
                long j21 = (j20 >> 26) + j19;
                long j22 = j12 + (j21 >> 26);
                long j23 = j14 + (j22 >> 26);
                long j24 = (j16 + (j23 >> 26)) - 67108864;
                long j25 = j24 >> 63;
                long j26 = j25 ^ (-1);
                long j27 = (j21 & 67108863 & j26) | (j19 & j25);
                long j28 = (j12 & j25) | (j22 & 67108863 & j26);
                long j29 = (j14 & j25) | (j23 & 67108863 & j26);
                long zzb = (((j18 & j25) | (j20 & 67108863 & j26) | (j27 << 26)) & 4294967295L) + zzb(bArr, 16);
                long zzb2 = (((j27 >> 6) | (j28 << 20)) & 4294967295L) + zzb(bArr, 20) + (zzb >> 32);
                long zzb3 = (((j28 >> 12) | (j29 << 14)) & 4294967295L) + zzb(bArr, 24) + (zzb2 >> 32);
                long zzb4 = zzb(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, zzb & 4294967295L, 0);
                zzd(bArr4, zzb2 & 4294967295L, 4);
                zzd(bArr4, zzb3 & 4294967295L, 8);
                zzd(bArr4, ((((j29 >> 18) | (((j16 & j25) | (j24 & j26)) << 8)) & 4294967295L) + zzb4 + (zzb3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i2, (byte) 0);
            }
            long zzc6 = j10 + zzc(bArr3, 0, 0);
            long zzc7 = j7 + zzc(bArr3, 3, 2);
            long zzc8 = j6 + zzc(bArr3, 6, 4);
            long zzc9 = j8 + zzc(bArr3, 9, 6);
            long zzc10 = j9 + (zzc(bArr3, 12, 8) | (bArr3[16] << 24));
            long j30 = (zzc10 * j2) + (zzc9 * j3) + (zzc8 * j4) + (zzc7 * j5) + (zzc6 * zzc);
            long j31 = (zzc10 * j3) + (zzc9 * j4) + (zzc8 * j5) + (zzc7 * zzc) + (zzc6 * zzc2) + (j30 >> 26);
            long j32 = (zzc10 * j4) + (zzc9 * j5) + (zzc8 * zzc) + (zzc7 * zzc2) + (zzc6 * zzc3) + (j31 >> 26);
            long j33 = (zzc10 * j5) + (zzc9 * zzc) + (zzc8 * zzc2) + (zzc7 * zzc3) + (zzc6 * zzc4) + (j32 >> 26);
            long j34 = zzc9 * zzc2;
            long j35 = zzc10 * zzc;
            long j36 = j35 + j34 + (zzc8 * zzc3) + (zzc7 * zzc4) + (zzc6 * zzc5) + (j33 >> 26);
            long j37 = ((j36 >> 26) * 5) + (j30 & 67108863);
            j10 = j37 & 67108863;
            j7 = (j31 & 67108863) + (j37 >> 26);
            i3 += 16;
            j9 = j36 & 67108863;
            j8 = j33 & 67108863;
            j6 = j32 & 67108863;
            i2 = 17;
        }
    }

    private static long zzb(byte[] bArr, int i2) {
        return (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16)) & 4294967295L;
    }

    private static long zzc(byte[] bArr, int i2, int i3) {
        return (zzb(bArr, i2) >> i3) & 67108863;
    }

    private static void zzd(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) (255 & j2);
            i3++;
            j2 >>= 8;
        }
    }
}
