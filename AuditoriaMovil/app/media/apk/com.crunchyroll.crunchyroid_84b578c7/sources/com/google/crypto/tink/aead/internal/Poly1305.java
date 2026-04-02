package com.google.crypto.tink.aead.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes4.dex */
public class Poly1305 {
    public static final int MAC_KEY_SIZE_IN_BYTES = 32;
    public static final int MAC_TAG_SIZE_IN_BYTES = 16;

    private Poly1305() {
    }

    public static byte[] computeMac(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            int i = 0;
            long load26 = load26(bArr, 0, 0) & 67108863;
            int i2 = 3;
            long load262 = load26(bArr, 3, 2) & 67108611;
            long load263 = load26(bArr, 6, 4) & 67092735;
            long load264 = load26(bArr, 9, 6) & 66076671;
            long load265 = load26(bArr, 12, 8) & 1048575;
            long j = load262 * 5;
            long j2 = load263 * 5;
            long j3 = load264 * 5;
            long j4 = load265 * 5;
            byte[] bArr3 = new byte[17];
            long j5 = 0;
            int i3 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            while (i3 < bArr2.length) {
                copyBlockSize(bArr3, bArr2, i3);
                long load266 = j9 + load26(bArr3, i, i);
                long load267 = j5 + load26(bArr3, i2, 2);
                long load268 = j6 + load26(bArr3, 6, 4);
                long load269 = j7 + load26(bArr3, 9, 6);
                long load2610 = j8 + (load26(bArr3, 12, 8) | (bArr3[16] << Ascii.CAN));
                long j10 = (load2610 * j) + (load269 * j2) + (load268 * j3) + (load267 * j4) + (load266 * load26);
                long j11 = (load2610 * j2) + (load269 * j3) + (load268 * j4) + (load267 * load26) + (load266 * load262);
                long j12 = (load2610 * j3) + (load269 * j4) + (load268 * load26) + (load267 * load262) + (load266 * load263);
                long j13 = (load269 * load26) + (load268 * load262) + (load267 * load263) + (load266 * load264);
                long j14 = load269 * load262;
                long j15 = load2610 * load26;
                long j16 = j11 + (j10 >> 26);
                long j17 = j12 + (j16 >> 26);
                long j18 = (load2610 * j4) + j13 + (j17 >> 26);
                long j19 = j15 + j14 + (load268 * load263) + (load267 * load264) + (load266 * load265) + (j18 >> 26);
                long j20 = j19 >> 26;
                j8 = j19 & 67108863;
                long j21 = (j20 * 5) + (j10 & 67108863);
                i3 += 16;
                j6 = j17 & 67108863;
                j7 = j18 & 67108863;
                i2 = 3;
                j9 = j21 & 67108863;
                j5 = (j16 & 67108863) + (j21 >> 26);
                i = 0;
            }
            long j22 = j6 + (j5 >> 26);
            long j23 = j22 & 67108863;
            long j24 = j7 + (j22 >> 26);
            long j25 = j24 & 67108863;
            long j26 = j8 + (j24 >> 26);
            long j27 = j26 & 67108863;
            long j28 = ((j26 >> 26) * 5) + j9;
            long j29 = j28 >> 26;
            long j30 = j28 & 67108863;
            long j31 = (j5 & 67108863) + j29;
            long j32 = j30 + 5;
            long j33 = j32 & 67108863;
            long j34 = j31 + (j32 >> 26);
            long j35 = j23 + (j34 >> 26);
            long j36 = j25 + (j35 >> 26);
            long j37 = (j27 + (j36 >> 26)) - 67108864;
            long j38 = j37 >> 63;
            long j39 = j30 & j38;
            long j40 = j31 & j38;
            long j41 = j23 & j38;
            long j42 = j25 & j38;
            long j43 = j27 & j38;
            long j44 = ~j38;
            long j45 = j40 | (j34 & 67108863 & j44);
            long j46 = j41 | (j35 & 67108863 & j44);
            long j47 = j42 | (j36 & 67108863 & j44);
            long j48 = (j37 & j44) | j43;
            long load32 = ((j39 | (j33 & j44) | (j45 << 26)) & 4294967295L) + load32(bArr, 16);
            long j49 = load32 & 4294967295L;
            long load322 = (((j45 >> 6) | (j46 << 20)) & 4294967295L) + load32(bArr, 20) + (load32 >> 32);
            long load323 = (((j46 >> 12) | (j47 << 14)) & 4294967295L) + load32(bArr, 24) + (load322 >> 32);
            byte[] bArr4 = new byte[16];
            toByteArray(bArr4, j49, 0);
            toByteArray(bArr4, load322 & 4294967295L, 4);
            toByteArray(bArr4, load323 & 4294967295L, 8);
            toByteArray(bArr4, ((((j47 >> 18) | (j48 << 8)) & 4294967295L) + load32(bArr, 28) + (load323 >> 32)) & 4294967295L, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    private static void copyBlockSize(byte[] bArr, byte[] bArr2, int i) {
        int min = Math.min(16, bArr2.length - i);
        System.arraycopy(bArr2, i, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    private static long load26(byte[] bArr, int i, int i2) {
        return (load32(bArr, i) >> i2) & 67108863;
    }

    private static long load32(byte[] bArr, int i) {
        return (((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16)) & 4294967295L;
    }

    private static void toByteArray(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static void verifyMac(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (Bytes.equal(computeMac(bArr, bArr2), bArr3)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
