package com.amazon.aps.iva.x;

import com.google.common.primitives.UnsignedBytes;
/* compiled from: CircularIntArray.java */
/* loaded from: classes.dex */
public final class d {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public Object e;

    public d(byte[] bArr) {
        this.e = bArr;
        this.b = bArr.length;
    }

    public final void a(int i) {
        Object obj = this.e;
        int i2 = this.c;
        ((int[]) obj)[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 >= 0) {
                int[] iArr2 = new int[i6];
                System.arraycopy(iArr, i4, iArr2, 0, i5);
                System.arraycopy((int[]) this.e, 0, iArr2, i5, this.b);
                this.e = iArr2;
                this.b = 0;
                this.c = length;
                this.d = i6 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public final int b(int i) {
        if (i >= 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = this.d;
            if (i < ((i2 - i3) & i4)) {
                return ((int[]) this.e)[i4 & (i3 + i)];
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final boolean c() {
        boolean z;
        if ((((((byte[]) this.e)[this.c] & UnsignedBytes.MAX_VALUE) >> this.d) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        e(1);
        return z;
    }

    public final int d(int i) {
        int i2 = this.c;
        int min = Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        int i4 = ((((byte[]) this.e)[i2] & UnsignedBytes.MAX_VALUE) >> this.d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (((byte[]) this.e)[i3] & UnsignedBytes.MAX_VALUE) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        e(i);
        return i5;
    }

    public final void e(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.c + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        int i6 = this.c;
        if (i6 < 0 || (i6 >= (i2 = this.b) && (i6 != i2 || this.d != 0))) {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "";
            default:
                return super.toString();
        }
    }

    public d() {
        this(0);
    }

    public d(char[] cArr, int i, int i2) {
        this.b = cArr.length;
        this.e = cArr;
        this.c = i;
        this.d = i2;
    }

    public d(int i) {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.d = highestOneBit - 1;
        this.e = new int[highestOneBit];
    }
}
