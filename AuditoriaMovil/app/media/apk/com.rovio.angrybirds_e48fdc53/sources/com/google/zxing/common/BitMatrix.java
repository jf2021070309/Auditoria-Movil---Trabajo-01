package com.google.zxing.common;

import java.util.Arrays;
/* loaded from: classes2.dex */
public final class BitMatrix implements Cloneable {
    private final int a;
    private final int b;
    private final int c;
    private final int[] d;

    public BitMatrix(int i) {
        this(i, i);
    }

    public BitMatrix(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.a = i;
        this.b = i2;
        this.c = (i + 31) / 32;
        this.d = new int[this.c * i2];
    }

    private BitMatrix(int i, int i2, int i3, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }

    public static BitMatrix parse(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        boolean[] zArr = new boolean[str.length()];
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '\n' || str.charAt(i) == '\r') {
                if (i5 > i4) {
                    if (i3 == -1) {
                        i3 = i5 - i4;
                    } else if (i5 - i4 != i3) {
                        throw new IllegalArgumentException("row lengths do not match");
                    }
                    i2++;
                    i4 = i5;
                }
                i++;
            } else if (str.substring(i, str2.length() + i).equals(str2)) {
                i += str2.length();
                zArr[i5] = true;
                i5++;
            } else if (str.substring(i, str3.length() + i).equals(str3)) {
                i += str3.length();
                zArr[i5] = false;
                i5++;
            } else {
                throw new IllegalArgumentException("illegal character encountered: " + str.substring(i));
            }
        }
        if (i5 > i4) {
            if (i3 == -1) {
                i3 = i5 - i4;
            } else if (i5 - i4 != i3) {
                throw new IllegalArgumentException("row lengths do not match");
            }
            i2++;
        }
        BitMatrix bitMatrix = new BitMatrix(i3, i2);
        for (int i6 = 0; i6 < i5; i6++) {
            if (zArr[i6]) {
                bitMatrix.set(i6 % i3, i6 / i3);
            }
        }
        return bitMatrix;
    }

    public boolean get(int i, int i2) {
        return ((this.d[(this.c * i2) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public void set(int i, int i2) {
        int i3 = (this.c * i2) + (i / 32);
        int[] iArr = this.d;
        iArr[i3] = iArr[i3] | (1 << (i & 31));
    }

    public void unset(int i, int i2) {
        int i3 = (this.c * i2) + (i / 32);
        int[] iArr = this.d;
        iArr[i3] = iArr[i3] & ((1 << (i & 31)) ^ (-1));
    }

    public void flip(int i, int i2) {
        int i3 = (this.c * i2) + (i / 32);
        int[] iArr = this.d;
        iArr[i3] = iArr[i3] ^ (1 << (i & 31));
    }

    public void xor(BitMatrix bitMatrix) {
        if (this.a != bitMatrix.getWidth() || this.b != bitMatrix.getHeight() || this.c != bitMatrix.getRowSize()) {
            throw new IllegalArgumentException("input matrix dimensions do not match");
        }
        BitArray bitArray = new BitArray((this.a / 32) + 1);
        for (int i = 0; i < this.b; i++) {
            int i2 = i * this.c;
            int[] bitArray2 = bitMatrix.getRow(i, bitArray).getBitArray();
            for (int i3 = 0; i3 < this.c; i3++) {
                int[] iArr = this.d;
                int i4 = i2 + i3;
                iArr[i4] = iArr[i4] ^ bitArray2[i3];
            }
        }
    }

    public void clear() {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            this.d[i] = 0;
        }
    }

    public void setRegion(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i + i3;
        int i6 = i2 + i4;
        if (i6 > this.b || i5 > this.a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = i2 * this.c;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.d;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public BitArray getRow(int i, BitArray bitArray) {
        if (bitArray == null || bitArray.getSize() < this.a) {
            bitArray = new BitArray(this.a);
        } else {
            bitArray.clear();
        }
        int i2 = i * this.c;
        for (int i3 = 0; i3 < this.c; i3++) {
            bitArray.setBulk(i3 << 5, this.d[i2 + i3]);
        }
        return bitArray;
    }

    public void setRow(int i, BitArray bitArray) {
        System.arraycopy(bitArray.getBitArray(), 0, this.d, this.c * i, this.c);
    }

    public void rotate180() {
        int width = getWidth();
        int height = getHeight();
        BitArray bitArray = new BitArray(width);
        BitArray bitArray2 = new BitArray(width);
        for (int i = 0; i < (height + 1) / 2; i++) {
            bitArray = getRow(i, bitArray);
            bitArray2 = getRow((height - 1) - i, bitArray2);
            bitArray.reverse();
            bitArray2.reverse();
            setRow(i, bitArray2);
            setRow((height - 1) - i, bitArray);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] getEnclosingRectangle() {
        /*
            r10 = this;
            r0 = -1
            r1 = 0
            int r3 = r10.a
            int r2 = r10.b
            r4 = r2
            r5 = r3
            r3 = r0
            r2 = r0
            r0 = r1
        Lb:
            int r6 = r10.b
            if (r0 >= r6) goto L60
            r6 = r1
        L10:
            int r7 = r10.c
            if (r6 >= r7) goto L5d
            int[] r7 = r10.d
            int r8 = r10.c
            int r8 = r8 * r0
            int r8 = r8 + r6
            r8 = r7[r8]
            if (r8 == 0) goto L81
            if (r0 >= r4) goto L21
            r4 = r0
        L21:
            if (r0 <= r2) goto L24
            r2 = r0
        L24:
            int r7 = r6 << 5
            if (r7 >= r5) goto L7f
            r7 = r1
        L29:
            int r9 = 31 - r7
            int r9 = r8 << r9
            if (r9 != 0) goto L32
            int r7 = r7 + 1
            goto L29
        L32:
            int r9 = r6 << 5
            int r9 = r9 + r7
            if (r9 >= r5) goto L7f
            int r5 = r6 << 5
            int r5 = r5 + r7
            r7 = r5
        L3b:
            int r5 = r6 << 5
            int r5 = r5 + 31
            if (r5 <= r3) goto L7b
            r5 = 31
        L43:
            int r9 = r8 >>> r5
            if (r9 != 0) goto L4a
            int r5 = r5 + (-1)
            goto L43
        L4a:
            int r8 = r6 << 5
            int r8 = r8 + r5
            if (r8 <= r3) goto L7b
            int r3 = r6 << 5
            int r3 = r3 + r5
            r5 = r4
            r4 = r3
            r3 = r2
        L55:
            int r2 = r6 + 1
            r6 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            goto L10
        L5d:
            int r0 = r0 + 1
            goto Lb
        L60:
            if (r3 < r5) goto L64
            if (r2 >= r4) goto L66
        L64:
            r0 = 0
        L65:
            return r0
        L66:
            r0 = 4
            int[] r0 = new int[r0]
            r0[r1] = r5
            r1 = 1
            r0[r1] = r4
            r1 = 2
            int r3 = r3 - r5
            int r3 = r3 + 1
            r0[r1] = r3
            r1 = 3
            int r2 = r2 - r4
            int r2 = r2 + 1
            r0[r1] = r2
            goto L65
        L7b:
            r5 = r4
            r4 = r3
            r3 = r2
            goto L55
        L7f:
            r7 = r5
            goto L3b
        L81:
            r7 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.common.BitMatrix.getEnclosingRectangle():int[]");
    }

    public int[] getTopLeftOnBit() {
        int i = 0;
        while (i < this.d.length && this.d[i] == 0) {
            i++;
        }
        if (i == this.d.length) {
            return null;
        }
        int i2 = i / this.c;
        int i3 = (i % this.c) << 5;
        int i4 = this.d[i];
        int i5 = 0;
        while ((i4 << (31 - i5)) == 0) {
            i5++;
        }
        return new int[]{i3 + i5, i2};
    }

    public int[] getBottomRightOnBit() {
        int length = this.d.length - 1;
        while (length >= 0 && this.d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = length / this.c;
        int i2 = (length % this.c) << 5;
        int i3 = this.d[length];
        int i4 = 31;
        while ((i3 >>> i4) == 0) {
            i4--;
        }
        return new int[]{i2 + i4, i};
    }

    public int getWidth() {
        return this.a;
    }

    public int getHeight() {
        return this.b;
    }

    public int getRowSize() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BitMatrix) {
            BitMatrix bitMatrix = (BitMatrix) obj;
            return this.a == bitMatrix.a && this.b == bitMatrix.b && this.c == bitMatrix.c && Arrays.equals(this.d, bitMatrix.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a * 31) + this.a) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
    }

    public String toString() {
        return toString("X ", "  ");
    }

    public String toString(String str, String str2) {
        return a(str, str2, "\n");
    }

    @Deprecated
    public String toString(String str, String str2, String str3) {
        return a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.b * (this.a + 1));
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                sb.append(get(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: clone */
    public BitMatrix m14clone() {
        return new BitMatrix(this.a, this.b, this.c, (int[]) this.d.clone());
    }
}
