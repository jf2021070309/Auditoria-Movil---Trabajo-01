package com.google.zxing.aztec.encoder;

import com.amazon.aps.iva.q.c0;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
/* loaded from: classes4.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int[] WORD_SIZE = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private Encoder() {
    }

    private static int[] bitsToWords(BitArray bitArray, int i, int i2) {
        int i3;
        int[] iArr = new int[i2];
        int size = bitArray.getSize() / i;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                if (bitArray.get((i4 * i) + i6)) {
                    i3 = 1 << ((i - i6) - 1);
                } else {
                    i3 = 0;
                }
                i5 |= i3;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    private static void drawBullsEye(BitMatrix bitMatrix, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    bitMatrix.set(i5, i4);
                    bitMatrix.set(i5, i6);
                    bitMatrix.set(i4, i5);
                    bitMatrix.set(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        bitMatrix.set(i7, i7);
        int i8 = i7 + 1;
        bitMatrix.set(i8, i7);
        bitMatrix.set(i7, i8);
        int i9 = i + i2;
        bitMatrix.set(i9, i7);
        bitMatrix.set(i9, i8);
        bitMatrix.set(i9, i9 - 1);
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean z, int i, BitArray bitArray) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (bitArray.get(i3)) {
                    bitMatrix.set(i4, i2 - 5);
                }
                if (bitArray.get(i3 + 7)) {
                    bitMatrix.set(i2 + 5, i4);
                }
                if (bitArray.get(20 - i3)) {
                    bitMatrix.set(i4, i2 + 5);
                }
                if (bitArray.get(27 - i3)) {
                    bitMatrix.set(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i3 / 5) + (i2 - 5) + i3;
            if (bitArray.get(i3)) {
                bitMatrix.set(i5, i2 - 7);
            }
            if (bitArray.get(i3 + 10)) {
                bitMatrix.set(i2 + 7, i5);
            }
            if (bitArray.get(29 - i3)) {
                bitMatrix.set(i5, i2 + 7);
            }
            if (bitArray.get(39 - i3)) {
                bitMatrix.set(i2 - 7, i5);
            }
            i3++;
        }
    }

    public static AztecCode encode(String str) {
        return encode(str.getBytes(StandardCharsets.ISO_8859_1));
    }

    private static BitArray generateCheckWords(BitArray bitArray, int i, int i2) {
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(getGF(i2));
        int i3 = i / i2;
        int[] bitsToWords = bitsToWords(bitArray, i2, i3);
        reedSolomonEncoder.encode(bitsToWords, i3 - (bitArray.getSize() / i2));
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(0, i % i2);
        for (int i4 : bitsToWords) {
            bitArray2.appendBits(i4, i2);
        }
        return bitArray2;
    }

    public static BitArray generateModeMessage(boolean z, int i, int i2) {
        BitArray bitArray = new BitArray();
        if (z) {
            bitArray.appendBits(i - 1, 2);
            bitArray.appendBits(i2 - 1, 6);
            return generateCheckWords(bitArray, 28, 4);
        }
        bitArray.appendBits(i - 1, 5);
        bitArray.appendBits(i2 - 1, 11);
        return generateCheckWords(bitArray, 40, 4);
    }

    private static GenericGF getGF(int i) {
        if (i != 4) {
            if (i != 6) {
                if (i != 8) {
                    if (i != 10) {
                        if (i == 12) {
                            return GenericGF.AZTEC_DATA_12;
                        }
                        throw new IllegalArgumentException(c0.a("Unsupported word size ", i));
                    }
                    return GenericGF.AZTEC_DATA_10;
                }
                return GenericGF.AZTEC_DATA_8;
            }
            return GenericGF.AZTEC_DATA_6;
        }
        return GenericGF.AZTEC_PARAM;
    }

    public static BitArray stuffBits(BitArray bitArray, int i) {
        BitArray bitArray2 = new BitArray();
        int size = bitArray.getSize();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < size) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= size || bitArray.get(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                bitArray2.appendBits(i7, i);
            } else if (i7 == 0) {
                bitArray2.appendBits(i4 | 1, i);
            } else {
                bitArray2.appendBits(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return bitArray2;
    }

    private static int totalBitsInLayer(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 88;
        } else {
            i2 = 112;
        }
        return ((i * 16) + i2) * i;
    }

    public static AztecCode encode(String str, int i, int i2) {
        return encode(str.getBytes(StandardCharsets.ISO_8859_1), i, i2, (Charset) null);
    }

    public static AztecCode encode(String str, int i, int i2, Charset charset) {
        return encode(str.getBytes(charset != null ? charset : StandardCharsets.ISO_8859_1), i, i2, charset);
    }

    public static AztecCode encode(byte[] bArr) {
        return encode(bArr, 33, 0, (Charset) null);
    }

    public static AztecCode encode(byte[] bArr, int i, int i2) {
        return encode(bArr, i, i2, (Charset) null);
    }

    public static AztecCode encode(byte[] bArr, int i, int i2, Charset charset) {
        BitArray bitArray;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        BitArray encode = new HighLevelEncoder(bArr, charset).encode();
        int size = ((encode.getSize() * i) / 100) + 11;
        int size2 = encode.getSize() + size;
        int i7 = 4;
        if (i2 != 0) {
            z = i2 < 0;
            i4 = Math.abs(i2);
            if (i4 <= (z ? 4 : 32)) {
                i5 = totalBitsInLayer(i4, z);
                i3 = WORD_SIZE[i4];
                int i8 = i5 - (i5 % i3);
                bitArray = stuffBits(encode, i3);
                if (bitArray.getSize() + size <= i8) {
                    if (z && bitArray.getSize() > i3 * 64) {
                        throw new IllegalArgumentException("Data to large for user specified layer");
                    }
                } else {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
        } else {
            BitArray bitArray2 = null;
            int i9 = 0;
            int i10 = 0;
            while (i9 <= 32) {
                boolean z2 = i9 <= 3;
                int i11 = z2 ? i9 + 1 : i9;
                int i12 = totalBitsInLayer(i11, z2);
                if (size2 <= i12) {
                    if (bitArray2 == null || i10 != WORD_SIZE[i11]) {
                        int i13 = WORD_SIZE[i11];
                        i10 = i13;
                        bitArray2 = stuffBits(encode, i13);
                    }
                    int i14 = i12 - (i12 % i10);
                    if ((!z2 || bitArray2.getSize() <= i10 * 64) && bitArray2.getSize() + size <= i14) {
                        bitArray = bitArray2;
                        i3 = i10;
                        z = z2;
                        i4 = i11;
                        i5 = i12;
                    }
                }
                i9++;
                i7 = 4;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        BitArray generateCheckWords = generateCheckWords(bitArray, i5, i3);
        int size3 = bitArray.getSize() / i3;
        BitArray generateModeMessage = generateModeMessage(z, i4, size3);
        int i15 = (i4 * 4) + (z ? 11 : 14);
        int[] iArr = new int[i15];
        int i16 = 2;
        if (z) {
            for (int i17 = 0; i17 < i15; i17++) {
                iArr[i17] = i17;
            }
            i6 = i15;
        } else {
            int i18 = i15 / 2;
            i6 = (((i18 - 1) / 15) * 2) + i15 + 1;
            int i19 = i6 / 2;
            for (int i20 = 0; i20 < i18; i20++) {
                int i21 = (i20 / 15) + i20;
                iArr[(i18 - i20) - 1] = (i19 - i21) - 1;
                iArr[i18 + i20] = i21 + i19 + 1;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i6);
        int i22 = 0;
        int i23 = 0;
        while (i22 < i4) {
            int i24 = ((i4 - i22) * i7) + (z ? 9 : 12);
            int i25 = 0;
            while (i25 < i24) {
                int i26 = i25 * 2;
                int i27 = 0;
                while (i27 < i16) {
                    if (generateCheckWords.get(i23 + i26 + i27)) {
                        int i28 = i22 * 2;
                        bitMatrix.set(iArr[i28 + i27], iArr[i28 + i25]);
                    }
                    if (generateCheckWords.get((i24 * 2) + i23 + i26 + i27)) {
                        int i29 = i22 * 2;
                        bitMatrix.set(iArr[i29 + i25], iArr[((i15 - 1) - i29) - i27]);
                    }
                    if (generateCheckWords.get((i24 * 4) + i23 + i26 + i27)) {
                        int i30 = (i15 - 1) - (i22 * 2);
                        bitMatrix.set(iArr[i30 - i27], iArr[i30 - i25]);
                    }
                    if (generateCheckWords.get((i24 * 6) + i23 + i26 + i27)) {
                        int i31 = i22 * 2;
                        bitMatrix.set(iArr[((i15 - 1) - i31) - i25], iArr[i31 + i27]);
                    }
                    i27++;
                    i16 = 2;
                }
                i25++;
                i16 = 2;
            }
            i23 += i24 * 8;
            i22++;
            i7 = 4;
            i16 = 2;
        }
        drawModeMessage(bitMatrix, z, i6, generateModeMessage);
        if (z) {
            drawBullsEye(bitMatrix, i6 / 2, 5);
        } else {
            int i32 = i6 / 2;
            drawBullsEye(bitMatrix, i32, 7);
            int i33 = 0;
            int i34 = 0;
            while (i34 < (i15 / 2) - 1) {
                for (int i35 = i32 & 1; i35 < i6; i35 += 2) {
                    int i36 = i32 - i33;
                    bitMatrix.set(i36, i35);
                    int i37 = i32 + i33;
                    bitMatrix.set(i37, i35);
                    bitMatrix.set(i35, i36);
                    bitMatrix.set(i35, i37);
                }
                i34 += 15;
                i33 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.setCompact(z);
        aztecCode.setSize(i6);
        aztecCode.setLayers(i4);
        aztecCode.setCodeWords(size3);
        aztecCode.setMatrix(bitMatrix);
        return aztecCode;
    }
}
