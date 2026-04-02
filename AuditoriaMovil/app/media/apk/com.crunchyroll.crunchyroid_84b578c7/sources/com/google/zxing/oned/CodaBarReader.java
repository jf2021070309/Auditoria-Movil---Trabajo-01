package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes4.dex */
public final class CodaBarReader extends OneDReader {
    private static final float MAX_ACCEPTABLE = 2.0f;
    private static final int MIN_CHARACTER_LENGTH = 3;
    private static final float PADDING = 1.5f;
    private static final String ALPHABET_STRING = "0123456789-$:/.+ABCD";
    static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    static final int[] CHARACTER_ENCODINGS = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] STARTEND_ENCODING = {'A', 'B', 'C', 'D'};
    private final StringBuilder decodeRowResult = new StringBuilder(20);
    private int[] counters = new int[80];
    private int counterLength = 0;

    public static boolean arrayContains(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    private void counterAppend(int i) {
        int[] iArr = this.counters;
        int i2 = this.counterLength;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.counterLength = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[i3 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.counters = iArr2;
        }
    }

    private int findStartPattern() throws NotFoundException {
        for (int i = 1; i < this.counterLength; i += 2) {
            int narrowWidePattern = toNarrowWidePattern(i);
            if (narrowWidePattern != -1 && arrayContains(STARTEND_ENCODING, ALPHABET[narrowWidePattern])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.counters[i3];
                }
                if (i == 1 || this.counters[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void setCounters(BitArray bitArray) throws NotFoundException {
        int i = 0;
        this.counterLength = 0;
        int nextUnset = bitArray.getNextUnset(0);
        int size = bitArray.getSize();
        if (nextUnset < size) {
            boolean z = true;
            while (nextUnset < size) {
                if (bitArray.get(nextUnset) != z) {
                    i++;
                } else {
                    counterAppend(i);
                    z = !z;
                    i = 1;
                }
                nextUnset++;
            }
            counterAppend(i);
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private int toNarrowWidePattern(int i) {
        int i2;
        int i3 = i + 7;
        if (i3 >= this.counterLength) {
            return -1;
        }
        int[] iArr = this.counters;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        for (int i8 = i; i8 < i3; i8 += 2) {
            int i9 = iArr[i8];
            if (i9 < i6) {
                i6 = i9;
            }
            if (i9 > i7) {
                i7 = i9;
            }
        }
        int i10 = (i6 + i7) / 2;
        int i11 = 0;
        for (int i12 = i + 1; i12 < i3; i12 += 2) {
            int i13 = iArr[i12];
            if (i13 < i4) {
                i4 = i13;
            }
            if (i13 > i11) {
                i11 = i13;
            }
        }
        int i14 = (i4 + i11) / 2;
        int i15 = 128;
        int i16 = 0;
        for (int i17 = 0; i17 < 7; i17++) {
            if ((i17 & 1) == 0) {
                i2 = i10;
            } else {
                i2 = i14;
            }
            i15 >>= 1;
            if (iArr[i + i17] > i2) {
                i16 |= i15;
            }
        }
        while (true) {
            int[] iArr2 = CHARACTER_ENCODINGS;
            if (i5 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i5] == i16) {
                return i5;
            }
            i5++;
        }
    }

    private void validatePattern(int i) throws NotFoundException {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.decodeRowResult.length() - 1;
        int i2 = i;
        int i3 = 0;
        while (true) {
            if (i3 > length) {
                break;
            }
            int i4 = CHARACTER_ENCODINGS[this.decodeRowResult.charAt(i3)];
            for (int i5 = 6; i5 >= 0; i5--) {
                int i6 = ((i4 & 1) * 2) + (i5 & 1);
                iArr[i6] = iArr[i6] + this.counters[i2 + i5];
                iArr2[i6] = iArr2[i6] + 1;
                i4 >>= 1;
            }
            i2 += 8;
            i3++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i7 = 0; i7 < 2; i7++) {
            fArr2[i7] = 0.0f;
            int i8 = i7 + 2;
            int i9 = iArr[i8];
            int i10 = iArr2[i8];
            float f = ((i9 / i10) + (iArr[i7] / iArr2[i7])) / MAX_ACCEPTABLE;
            fArr2[i8] = f;
            fArr[i7] = f;
            fArr[i8] = ((i9 * MAX_ACCEPTABLE) + PADDING) / i10;
        }
        int i11 = i;
        for (int i12 = 0; i12 <= length; i12++) {
            int i13 = CHARACTER_ENCODINGS[this.decodeRowResult.charAt(i12)];
            for (int i14 = 6; i14 >= 0; i14--) {
                int i15 = ((i13 & 1) * 2) + (i14 & 1);
                float f2 = this.counters[i11 + i14];
                if (f2 >= fArr2[i15] && f2 <= fArr[i15]) {
                    i13 >>= 1;
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            i11 += 8;
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        Arrays.fill(this.counters, 0);
        setCounters(bitArray);
        int findStartPattern = findStartPattern();
        this.decodeRowResult.setLength(0);
        int i2 = findStartPattern;
        do {
            int narrowWidePattern = toNarrowWidePattern(i2);
            if (narrowWidePattern != -1) {
                this.decodeRowResult.append((char) narrowWidePattern);
                i2 += 8;
                if (this.decodeRowResult.length() > 1 && arrayContains(STARTEND_ENCODING, ALPHABET[narrowWidePattern])) {
                    break;
                }
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        } while (i2 < this.counterLength);
        int i3 = i2 - 1;
        int i4 = this.counters[i3];
        int i5 = 0;
        for (int i6 = -8; i6 < -1; i6++) {
            i5 += this.counters[i2 + i6];
        }
        if (i2 < this.counterLength && i4 < i5 / 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        validatePattern(findStartPattern);
        for (int i7 = 0; i7 < this.decodeRowResult.length(); i7++) {
            StringBuilder sb = this.decodeRowResult;
            sb.setCharAt(i7, ALPHABET[sb.charAt(i7)]);
        }
        char charAt = this.decodeRowResult.charAt(0);
        char[] cArr = STARTEND_ENCODING;
        if (arrayContains(cArr, charAt)) {
            StringBuilder sb2 = this.decodeRowResult;
            if (arrayContains(cArr, sb2.charAt(sb2.length() - 1))) {
                if (this.decodeRowResult.length() > 3) {
                    if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
                        StringBuilder sb3 = this.decodeRowResult;
                        sb3.deleteCharAt(sb3.length() - 1);
                        this.decodeRowResult.deleteCharAt(0);
                    }
                    int i8 = 0;
                    for (int i9 = 0; i9 < findStartPattern; i9++) {
                        i8 += this.counters[i9];
                    }
                    float f = i8;
                    while (findStartPattern < i3) {
                        i8 += this.counters[findStartPattern];
                        findStartPattern++;
                    }
                    float f2 = i;
                    Result result = new Result(this.decodeRowResult.toString(), null, new ResultPoint[]{new ResultPoint(f, f2), new ResultPoint(i8, f2)}, BarcodeFormat.CODABAR);
                    result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]F0");
                    return result;
                }
                throw NotFoundException.getNotFoundInstance();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
