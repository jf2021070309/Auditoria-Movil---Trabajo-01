package com.google.android.gms.internal.pal;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzyi {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zzc(jArr4, jArr);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j2 = jArr2[1];
        long j3 = jArr3[0];
        jArr[1] = (j2 * j3) + (jArr3[1] * j);
        long j4 = jArr2[1];
        long j5 = jArr3[1];
        jArr[2] = (jArr2[2] * j3) + (jArr3[2] * j) + ((j4 + j4) * j5);
        long j6 = jArr3[2];
        long j7 = jArr2[2];
        jArr[3] = (jArr2[3] * j3) + (jArr3[3] * j) + (j7 * j5) + (j4 * j6);
        long j8 = jArr3[3];
        long j9 = jArr2[3];
        long j10 = (j9 * j5) + (j4 * j8);
        jArr[4] = (jArr2[4] * j3) + (jArr3[4] * j) + j10 + j10 + (j7 * j6);
        long j11 = jArr3[4];
        long j12 = (j4 * j11) + (j9 * j6) + (j7 * j8);
        long j13 = jArr2[4];
        jArr[5] = (jArr2[5] * j3) + (jArr3[5] * j) + (j13 * j5) + j12;
        long j14 = jArr3[5];
        long j15 = jArr2[5];
        long j16 = (j15 * j5) + (j4 * j14) + (j9 * j8);
        jArr[6] = (jArr2[6] * j3) + (jArr3[6] * j) + (j13 * j6) + (j7 * j11) + j16 + j16;
        long j17 = (j15 * j6) + (j7 * j14) + (j13 * j8) + (j9 * j11);
        long j18 = jArr3[6];
        long j19 = (j4 * j18) + j17;
        long j20 = jArr2[6];
        jArr[7] = (jArr2[7] * j3) + (jArr3[7] * j) + (j20 * j5) + j19;
        long j21 = jArr3[7];
        long j22 = (j4 * j21) + (j15 * j8) + (j9 * j14);
        long j23 = jArr2[7];
        long j24 = (j23 * j5) + j22;
        jArr[8] = (jArr2[8] * j3) + (jArr3[8] * j) + (j20 * j6) + (j7 * j18) + j24 + j24 + (j13 * j11);
        long j25 = (j23 * j6) + (j7 * j21) + (j20 * j8) + (j9 * j18) + (j15 * j11) + (j13 * j14);
        long j26 = jArr3[8];
        long j27 = (j4 * j26) + j25;
        long j28 = jArr2[8];
        long j29 = (j28 * j5) + j27;
        jArr[9] = (jArr2[9] * j3) + (j * jArr3[9]) + j29;
        long j30 = (j23 * j8) + (j9 * j21) + (j15 * j14);
        long j31 = jArr3[9];
        long j32 = jArr2[9];
        long j33 = (j5 * j32) + (j4 * j31) + j30;
        long j34 = j20 * j11;
        jArr[10] = (j28 * j6) + (j7 * j26) + j34 + (j13 * j18) + j33 + j33;
        long j35 = j7 * j31;
        long j36 = j6 * j32;
        jArr[11] = j36 + j35 + (j28 * j8) + (j9 * j26) + (j23 * j11) + (j13 * j21) + (j20 * j14) + (j15 * j18);
        long j37 = j9 * j31;
        long j38 = j8 * j32;
        long j39 = j38 + j37 + (j23 * j14) + (j15 * j21);
        long j40 = j28 * j11;
        jArr[12] = j40 + (j13 * j26) + j39 + j39 + (j20 * j18);
        long j41 = j13 * j31;
        long j42 = j11 * j32;
        jArr[13] = j42 + j41 + (j28 * j14) + (j15 * j26) + (j23 * j18) + (j20 * j21);
        long j43 = j14 * j32;
        long j44 = j43 + (j15 * j31) + (j23 * j21);
        long j45 = j28 * j18;
        jArr[14] = j45 + (j20 * j26) + j44 + j44;
        long j46 = j20 * j31;
        long j47 = j18 * j32;
        jArr[15] = j47 + j46 + (j28 * j21) + (j23 * j26);
        long j48 = (j21 * j32) + (j23 * j31);
        jArr[16] = j48 + j48 + (j28 * j26);
        jArr[17] = (j26 * j32) + (j28 * j31);
        jArr[18] = (j32 + j32) * j31;
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zze(jArr);
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j6 + j6 + j7;
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void zze(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j2 + j2 + j3;
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j6 + j6 + j7;
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j10 + j10 + j11;
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j14 + j14 + j15;
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j18 + j18 + j19;
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j22 + j22 + j23;
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j26 + j26 + j27;
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j30 + j30 + j31;
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j34 + j34 + j35;
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    public static void zzf(long[] jArr, long[] jArr2, long j) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] * j;
        }
    }

    public static void zzg(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = jArr2[0];
        long j3 = jArr2[1];
        long j4 = (jArr2[2] * j2) + (j3 * j3);
        long j5 = jArr2[2];
        long j6 = (jArr2[3] * j2) + (j3 * j5);
        long j7 = jArr2[3];
        long j8 = jArr2[4];
        long j9 = (jArr2[5] * j2) + (j3 * j8) + (j5 * j7);
        long j10 = jArr2[5];
        long j11 = ((j3 + j3) * j10) + (jArr2[6] * j2) + (j5 * j8) + (j7 * j7);
        long j12 = jArr2[6];
        long j13 = (jArr2[7] * j2) + (j3 * j12) + (j5 * j10) + (j7 * j8);
        long j14 = jArr2[8];
        long j15 = jArr2[7];
        long j16 = (j7 * j10) + (j3 * j15);
        long j17 = j16 + j16 + (j14 * j2) + (j5 * j12);
        long j18 = jArr2[8];
        long j19 = (j2 * jArr2[9]) + (j3 * j18) + (j5 * j15) + (j7 * j12) + (j8 * j10);
        long j20 = jArr2[9];
        long j21 = (j3 * j20) + (j7 * j15);
        long j22 = j21 + j21 + (j5 * j18) + (j8 * j12) + (j10 * j10);
        long j23 = (j5 * j20) + (j7 * j18) + (j8 * j15) + (j10 * j12);
        long j24 = (j7 * j20) + (j10 * j15);
        long j25 = j24 + j24 + (j8 * j18);
        long j26 = (j8 * j20) + (j10 * j18) + (j12 * j15);
        long j27 = ((j10 + j10) * j20) + (j12 * j18) + (j15 * j15);
        long j28 = (j12 * j20) + (j15 * j18);
        zzc(new long[]{j * j, (j2 + j2) * jArr2[1], j4 + j4, j6 + j6, ((j2 + j2) * jArr2[4]) + (j3 * 4 * j7) + (j5 * j5), j9 + j9, j11 + j11, j13 + j13, j17 + j17 + (j8 * j8), j19 + j19, j22 + j22, j23 + j23, j25 + j25 + (j12 * j12), j26 + j26, j27 + j27, j28 + j28, (j15 * 4 * j20) + (j18 * j18), (j18 + j18) * j20, (j20 + j20) * j20}, jArr);
    }

    public static void zzh(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void zzi(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static byte[] zzj(long[] jArr) {
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                break;
            }
            int i10 = 0;
            while (i10 < 9) {
                long j3 = copyOf[i10];
                copyOf[i10] = j3 + (i8 << i7);
                i10++;
                copyOf[i10] = copyOf[i10] - (-((int) (((j3 >> 31) & j3) >> zzd[i10 & 1])));
            }
            long j4 = copyOf[9];
            int i11 = -((int) (((j4 >> 31) & j4) >> 25));
            copyOf[9] = j4 + (i11 << 25);
            copyOf[0] = copyOf[0] - (i11 * 19);
            i9++;
        }
        long j5 = copyOf[0];
        copyOf[0] = j5 + (i2 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j5 >> 31) & j5) >> 26)));
        for (int i12 = 0; i12 < 2; i12++) {
            int i13 = 0;
            while (i13 < 9) {
                long j6 = copyOf[i13];
                int i14 = zzd[i13 & 1];
                copyOf[i13] = zzc[i6] & j6;
                i13++;
                copyOf[i13] = copyOf[i13] + ((int) (j6 >> i14));
            }
        }
        copyOf[9] = 33554431 & copyOf[9];
        copyOf[0] = copyOf[0] + (((int) (j >> 25)) * 19);
        int i15 = ~((((int) j2) - 67108845) >> 31);
        for (int i16 = 1; i16 < 10; i16++) {
            int i17 = ~(((int) copyOf[i16]) ^ zzc[i16 & 1]);
            int i18 = i17 & (i17 << 16);
            int i19 = i18 & (i18 << 8);
            int i20 = i19 & (i19 << 4);
            int i21 = i20 & (i20 << 2);
            i15 &= (i21 & (i21 + i21)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i15);
        long j7 = 33554431 & i15;
        copyOf[1] = copyOf[1] - j7;
        for (i = 2; i < 10; i += 2) {
            copyOf[i] = copyOf[i] - (67108863 & i15);
            int i22 = i + 1;
            copyOf[i22] = copyOf[i22] - j7;
        }
        for (int i23 = 0; i23 < 10; i23++) {
            copyOf[i23] = copyOf[i23] << zzb[i23];
        }
        byte[] bArr = new byte[32];
        for (int i24 = 0; i24 < 10; i24++) {
            int i25 = zza[i24];
            byte b = bArr[i25];
            long j8 = copyOf[i24];
            bArr[i25] = (byte) (b | (j8 & 255));
            bArr[i25 + 1] = (byte) (bArr[i3] | ((j8 >> 8) & 255));
            bArr[i25 + 2] = (byte) (bArr[i4] | ((j8 >> 16) & 255));
            bArr[i25 + 3] = (byte) (((j8 >> 24) & 255) | bArr[i5]);
        }
        return bArr;
    }

    public static long[] zzk(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i2 = zza[i];
            jArr[i] = (((((bArr[i2] & UnsignedBytes.MAX_VALUE) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 8)) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 16)) | ((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24)) >> zzb[i]) & zzc[i & 1];
        }
        return jArr;
    }
}
