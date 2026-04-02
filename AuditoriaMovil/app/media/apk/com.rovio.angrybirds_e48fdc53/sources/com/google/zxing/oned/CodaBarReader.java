package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes2.dex */
public final class CodaBarReader extends OneDReader {
    static final char[] a = "0123456789-$:/.+ABCD".toCharArray();
    static final int[] b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] c = {'A', 'B', 'C', 'D'};
    private final StringBuilder d = new StringBuilder(20);
    private int[] e = new int[80];
    private int f = 0;

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) {
        Arrays.fill(this.e, 0);
        a(bitArray);
        int a2 = a();
        this.d.setLength(0);
        int i2 = a2;
        do {
            int c2 = c(i2);
            if (c2 == -1) {
                throw NotFoundException.getNotFoundInstance();
            }
            this.d.append((char) c2);
            i2 += 8;
            if (this.d.length() > 1 && a(c, a[c2])) {
                break;
            }
        } while (i2 < this.f);
        int i3 = this.e[i2 - 1];
        int i4 = 0;
        for (int i5 = -8; i5 < -1; i5++) {
            i4 += this.e[i2 + i5];
        }
        if (i2 < this.f && i3 < i4 / 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        a(a2);
        for (int i6 = 0; i6 < this.d.length(); i6++) {
            this.d.setCharAt(i6, a[this.d.charAt(i6)]);
        }
        if (!a(c, this.d.charAt(0))) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (!a(c, this.d.charAt(this.d.length() - 1))) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (this.d.length() <= 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
            this.d.deleteCharAt(this.d.length() - 1);
            this.d.deleteCharAt(0);
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < a2) {
            int i9 = this.e[i7] + i8;
            i7++;
            i8 = i9;
        }
        float f = i8;
        while (a2 < i2 - 1) {
            i8 += this.e[a2];
            a2++;
        }
        return new Result(this.d.toString(), null, new ResultPoint[]{new ResultPoint(f, i), new ResultPoint(i8, i)}, BarcodeFormat.CODABAR);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r12) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.CodaBarReader.a(int):void");
    }

    private void a(BitArray bitArray) {
        this.f = 0;
        int nextUnset = bitArray.getNextUnset(0);
        int size = bitArray.getSize();
        if (nextUnset >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z = true;
        int i = 0;
        for (int i2 = nextUnset; i2 < size; i2++) {
            if (bitArray.get(i2) ^ z) {
                i++;
            } else {
                b(i);
                z = !z;
                i = 1;
            }
        }
        b(i);
    }

    private void b(int i) {
        this.e[this.f] = i;
        this.f++;
        if (this.f >= this.e.length) {
            int[] iArr = new int[this.f << 1];
            System.arraycopy(this.e, 0, iArr, 0, this.f);
            this.e = iArr;
        }
    }

    private int a() {
        for (int i = 1; i < this.f; i += 2) {
            int c2 = c(i);
            if (c2 != -1 && a(c, a[c2])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.e[i3];
                }
                if (i == 1 || this.e[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(char[] cArr, char c2) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c3 == c2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private int c(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = i + 7;
        if (i3 >= this.f) {
            return -1;
        }
        int[] iArr = this.e;
        int i4 = i;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        while (i4 < i3) {
            int i7 = iArr[i4];
            if (i7 < i5) {
                i5 = i7;
            }
            if (i7 <= i6) {
                i7 = i6;
            }
            i4 += 2;
            i6 = i7;
        }
        int i8 = (i5 + i6) / 2;
        int i9 = i + 1;
        int i10 = 0;
        while (i9 < i3) {
            int i11 = iArr[i9];
            if (i11 < i2) {
                i2 = i11;
            }
            if (i11 <= i10) {
                i11 = i10;
            }
            i9 += 2;
            i10 = i11;
        }
        int i12 = (i2 + i10) / 2;
        int i13 = 0;
        int i14 = 0;
        int i15 = 128;
        while (i13 < 7) {
            i15 >>= 1;
            int i16 = iArr[i + i13] > ((i13 & 1) == 0 ? i8 : i12) ? i14 | i15 : i14;
            i13++;
            i14 = i16;
        }
        for (int i17 = 0; i17 < b.length; i17++) {
            if (b[i17] == i14) {
                return i17;
            }
        }
        return -1;
    }
}
