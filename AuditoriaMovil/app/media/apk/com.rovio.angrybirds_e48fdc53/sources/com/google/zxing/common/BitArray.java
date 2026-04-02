package com.google.zxing.common;

import java.util.Arrays;
/* loaded from: classes2.dex */
public final class BitArray implements Cloneable {
    private int[] a;
    private int b;

    public BitArray() {
        this.b = 0;
        this.a = new int[1];
    }

    public BitArray(int i) {
        this.b = i;
        this.a = b(i);
    }

    BitArray(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }

    public int getSize() {
        return this.b;
    }

    public int getSizeInBytes() {
        return (this.b + 7) / 8;
    }

    private void a(int i) {
        if (i > (this.a.length << 5)) {
            int[] b = b(i);
            System.arraycopy(this.a, 0, b, 0, this.a.length);
            this.a = b;
        }
    }

    public boolean get(int i) {
        return (this.a[i / 32] & (1 << (i & 31))) != 0;
    }

    public void set(int i) {
        int[] iArr = this.a;
        int i2 = i / 32;
        iArr[i2] = iArr[i2] | (1 << (i & 31));
    }

    public void flip(int i) {
        int[] iArr = this.a;
        int i2 = i / 32;
        iArr[i2] = iArr[i2] ^ (1 << (i & 31));
    }

    public int getNextSet(int i) {
        if (i >= this.b) {
            return this.b;
        }
        int i2 = i / 32;
        int i3 = this.a[i2] & (((1 << (i & 31)) - 1) ^ (-1));
        while (i3 == 0) {
            i2++;
            if (i2 == this.a.length) {
                return this.b;
            }
            i3 = this.a[i2];
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i3) + (i2 << 5);
        return numberOfTrailingZeros > this.b ? this.b : numberOfTrailingZeros;
    }

    public int getNextUnset(int i) {
        if (i >= this.b) {
            return this.b;
        }
        int i2 = i / 32;
        int i3 = (this.a[i2] ^ (-1)) & (((1 << (i & 31)) - 1) ^ (-1));
        while (i3 == 0) {
            i2++;
            if (i2 == this.a.length) {
                return this.b;
            }
            i3 = this.a[i2] ^ (-1);
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i3) + (i2 << 5);
        return numberOfTrailingZeros > this.b ? this.b : numberOfTrailingZeros;
    }

    public void setBulk(int i, int i2) {
        this.a[i / 32] = i2;
    }

    public void setRange(int i, int i2) {
        if (i2 < i || i < 0 || i2 > this.b) {
            throw new IllegalArgumentException();
        }
        if (i2 != i) {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = (2 << (i6 < i5 ? 31 : i3 & 31)) - (1 << (i6 > i4 ? 0 : i & 31));
                int[] iArr = this.a;
                iArr[i6] = i7 | iArr[i6];
                i6++;
            }
        }
    }

    public void clear() {
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            this.a[i] = 0;
        }
    }

    public boolean isRange(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.b) {
            throw new IllegalArgumentException();
        }
        if (i2 == i) {
            return true;
        }
        int i3 = i2 - 1;
        int i4 = i / 32;
        int i5 = i3 / 32;
        int i6 = i4;
        while (i6 <= i5) {
            int i7 = (2 << (i6 < i5 ? 31 : i3 & 31)) - (1 << (i6 > i4 ? 0 : i & 31));
            int i8 = this.a[i6] & i7;
            if (!z) {
                i7 = 0;
            }
            if (i8 != i7) {
                return false;
            }
            i6++;
        }
        return true;
    }

    public void appendBit(boolean z) {
        a(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b / 32;
            iArr[i] = iArr[i] | (1 << (this.b & 31));
        }
        this.b++;
    }

    public void appendBits(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        a(this.b + i2);
        while (i2 > 0) {
            appendBit(((i >> (i2 + (-1))) & 1) == 1);
            i2--;
        }
    }

    public void appendBitArray(BitArray bitArray) {
        int i = bitArray.b;
        a(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            appendBit(bitArray.get(i2));
        }
    }

    public void xor(BitArray bitArray) {
        if (this.b != bitArray.b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        for (int i = 0; i < this.a.length; i++) {
            int[] iArr = this.a;
            iArr[i] = iArr[i] ^ bitArray.a[i];
        }
    }

    public void toBytes(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        int i5 = i;
        while (i4 < i3) {
            int i6 = i5;
            int i7 = 0;
            for (int i8 = 0; i8 < 8; i8++) {
                if (get(i6)) {
                    i7 |= 1 << (7 - i8);
                }
                i6++;
            }
            bArr[i2 + i4] = (byte) i7;
            i4++;
            i5 = i6;
        }
    }

    public int[] getBitArray() {
        return this.a;
    }

    public void reverse() {
        int[] iArr = new int[this.a.length];
        int i = (this.b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = this.a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        if (this.b != (i2 << 5)) {
            int i4 = (i2 << 5) - this.b;
            int i5 = iArr[0] >>> i4;
            for (int i6 = 1; i6 < i2; i6++) {
                int i7 = iArr[i6];
                iArr[i6 - 1] = i5 | (i7 << (32 - i4));
                i5 = i7 >>> i4;
            }
            iArr[i2 - 1] = i5;
        }
        this.a = iArr;
    }

    private static int[] b(int i) {
        return new int[(i + 31) / 32];
    }

    public boolean equals(Object obj) {
        if (obj instanceof BitArray) {
            BitArray bitArray = (BitArray) obj;
            return this.b == bitArray.b && Arrays.equals(this.a, bitArray.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b * 31) + Arrays.hashCode(this.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        for (int i = 0; i < this.b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(get(i) ? 'X' : '.');
        }
        return sb.toString();
    }

    /* renamed from: clone */
    public BitArray m13clone() {
        return new BitArray((int[]) this.a.clone(), this.b);
    }
}
