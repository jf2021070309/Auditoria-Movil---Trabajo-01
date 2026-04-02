package com.google.zxing.qrcode.encoder;

import androidx.renderscript.ScriptIntrinsicBLAS;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Version;
/* loaded from: classes2.dex */
final class c {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, ScriptIntrinsicBLAS.RIGHT, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, ScriptIntrinsicBLAS.UNIT, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, TTAdConstant.IMAGE_MODE_LIVE}, new int[]{6, 30, 58, 86, 114, ScriptIntrinsicBLAS.RIGHT, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private c() {
    }

    static void a(ByteMatrix byteMatrix) {
        byteMatrix.clear((byte) -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, int i, ByteMatrix byteMatrix) {
        a(byteMatrix);
        a(version, byteMatrix);
        a(errorCorrectionLevel, i, byteMatrix);
        b(version, byteMatrix);
        a(bitArray, i, byteMatrix);
    }

    static void a(Version version, ByteMatrix byteMatrix) {
        d(byteMatrix);
        c(byteMatrix);
        c(version, byteMatrix);
        b(byteMatrix);
    }

    static void a(ErrorCorrectionLevel errorCorrectionLevel, int i, ByteMatrix byteMatrix) {
        BitArray bitArray = new BitArray();
        a(errorCorrectionLevel, i, bitArray);
        for (int i2 = 0; i2 < bitArray.getSize(); i2++) {
            boolean z = bitArray.get((bitArray.getSize() - 1) - i2);
            byteMatrix.set(d[i2][0], d[i2][1], z);
            if (i2 < 8) {
                byteMatrix.set((byteMatrix.getWidth() - i2) - 1, 8, z);
            } else {
                byteMatrix.set(8, (byteMatrix.getHeight() - 7) + (i2 - 8), z);
            }
        }
    }

    static void b(Version version, ByteMatrix byteMatrix) {
        if (version.getVersionNumber() >= 7) {
            BitArray bitArray = new BitArray();
            a(version, bitArray);
            int i = 17;
            int i2 = 0;
            while (i2 < 6) {
                int i3 = i;
                for (int i4 = 0; i4 < 3; i4++) {
                    boolean z = bitArray.get(i3);
                    i3--;
                    byteMatrix.set(i2, (byteMatrix.getHeight() - 11) + i4, z);
                    byteMatrix.set((byteMatrix.getHeight() - 11) + i4, i2, z);
                }
                i2++;
                i = i3;
            }
        }
    }

    static void a(BitArray bitArray, int i, ByteMatrix byteMatrix) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int width = byteMatrix.getWidth() - 1;
        int height = byteMatrix.getHeight() - 1;
        int i6 = -1;
        int i7 = 0;
        while (width > 0) {
            if (width == 6) {
                i2 = height;
                i3 = width - 1;
                i4 = i7;
            } else {
                i2 = height;
                i3 = width;
                i4 = i7;
            }
            while (i2 >= 0 && i2 < byteMatrix.getHeight()) {
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i3 - i8;
                    if (b(byteMatrix.get(i9, i2))) {
                        if (i4 < bitArray.getSize()) {
                            i5 = i4 + 1;
                            z = bitArray.get(i4);
                        } else {
                            i5 = i4;
                            z = false;
                        }
                        if (i != -1 && b.a(i, i9, i2)) {
                            z = !z;
                        }
                        byteMatrix.set(i9, i2, z);
                        i4 = i5;
                    }
                }
                i2 += i6;
            }
            i6 = -i6;
            width = i3 - 2;
            i7 = i4;
            height = i2 + i6;
        }
        if (i7 != bitArray.getSize()) {
            throw new WriterException("Not all bits consumed: " + i7 + '/' + bitArray.getSize());
        }
    }

    static int a(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    static int a(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int a2 = a(i2);
        int i3 = i << (a2 - 1);
        while (a(i3) >= a2) {
            i3 ^= i2 << (a(i3) - a2);
        }
        return i3;
    }

    static void a(ErrorCorrectionLevel errorCorrectionLevel, int i, BitArray bitArray) {
        if (!QRCode.isValidMaskPattern(i)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i;
        bitArray.appendBits(bits, 5);
        bitArray.appendBits(a(bits, 1335), 10);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(21522, 15);
        bitArray.xor(bitArray2);
        if (bitArray.getSize() != 15) {
            throw new WriterException("should not happen but we got: " + bitArray.getSize());
        }
    }

    static void a(Version version, BitArray bitArray) {
        bitArray.appendBits(version.getVersionNumber(), 6);
        bitArray.appendBits(a(version.getVersionNumber(), 7973), 12);
        if (bitArray.getSize() != 18) {
            throw new WriterException("should not happen but we got: " + bitArray.getSize());
        }
    }

    private static boolean b(int i) {
        return i == -1;
    }

    private static void b(ByteMatrix byteMatrix) {
        for (int i = 8; i < byteMatrix.getWidth() - 8; i++) {
            int i2 = (i + 1) % 2;
            if (b(byteMatrix.get(i, 6))) {
                byteMatrix.set(i, 6, i2);
            }
            if (b(byteMatrix.get(6, i))) {
                byteMatrix.set(6, i, i2);
            }
        }
    }

    private static void c(ByteMatrix byteMatrix) {
        if (byteMatrix.get(8, byteMatrix.getHeight() - 8) == 0) {
            throw new WriterException();
        }
        byteMatrix.set(8, byteMatrix.getHeight() - 8, 1);
    }

    private static void a(int i, int i2, ByteMatrix byteMatrix) {
        for (int i3 = 0; i3 < 8; i3++) {
            if (!b(byteMatrix.get(i + i3, i2))) {
                throw new WriterException();
            }
            byteMatrix.set(i + i3, i2, 0);
        }
    }

    private static void b(int i, int i2, ByteMatrix byteMatrix) {
        for (int i3 = 0; i3 < 7; i3++) {
            if (!b(byteMatrix.get(i, i2 + i3))) {
                throw new WriterException();
            }
            byteMatrix.set(i, i2 + i3, 0);
        }
    }

    private static void c(int i, int i2, ByteMatrix byteMatrix) {
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                byteMatrix.set(i + i4, i2 + i3, b[i3][i4]);
            }
        }
    }

    private static void d(int i, int i2, ByteMatrix byteMatrix) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                byteMatrix.set(i + i4, i2 + i3, a[i3][i4]);
            }
        }
    }

    private static void d(ByteMatrix byteMatrix) {
        int length = a[0].length;
        d(0, 0, byteMatrix);
        d(byteMatrix.getWidth() - length, 0, byteMatrix);
        d(0, byteMatrix.getWidth() - length, byteMatrix);
        a(0, 7, byteMatrix);
        a(byteMatrix.getWidth() - 8, 7, byteMatrix);
        a(0, byteMatrix.getWidth() - 8, byteMatrix);
        b(7, 0, byteMatrix);
        b((byteMatrix.getHeight() - 7) - 1, 0, byteMatrix);
        b(7, byteMatrix.getHeight() - 7, byteMatrix);
    }

    private static void c(Version version, ByteMatrix byteMatrix) {
        if (version.getVersionNumber() >= 2) {
            int versionNumber = version.getVersionNumber() - 1;
            int[] iArr = c[versionNumber];
            int length = c[versionNumber].length;
            for (int i = 0; i < length; i++) {
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr[i];
                    int i4 = iArr[i2];
                    if (i4 != -1 && i3 != -1 && b(byteMatrix.get(i4, i3))) {
                        c(i4 - 2, i3 - 2, byteMatrix);
                    }
                }
            }
        }
    }
}
