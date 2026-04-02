package com.amazon.aps.iva.x;
/* compiled from: CircularArray.java */
/* loaded from: classes.dex */
public final class c<E> {
    public E[] a;
    public int b;
    public int c;
    public int d;

    public c() {
        int highestOneBit = Integer.bitCount(64) != 1 ? Integer.highestOneBit(63) << 1 : 64;
        this.d = highestOneBit - 1;
        this.a = (E[]) new Object[highestOneBit];
    }

    public final void a() {
        E[] eArr = this.a;
        int length = eArr.length;
        int i = this.b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            E[] eArr2 = (E[]) new Object[i3];
            System.arraycopy(eArr, i, eArr2, 0, i2);
            System.arraycopy(this.a, 0, eArr2, i2, this.b);
            this.a = eArr2;
            this.b = 0;
            this.c = length;
            this.d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final void b(int i) {
        int i2;
        int i3;
        if (i <= 0) {
            return;
        }
        if (i <= d()) {
            int i4 = this.c;
            if (i < i4) {
                i2 = i4 - i;
            } else {
                i2 = 0;
            }
            int i5 = i2;
            while (true) {
                i3 = this.c;
                if (i5 >= i3) {
                    break;
                }
                this.a[i5] = null;
                i5++;
            }
            int i6 = i3 - i2;
            int i7 = i - i6;
            this.c = i3 - i6;
            if (i7 > 0) {
                int length = this.a.length;
                this.c = length;
                int i8 = length - i7;
                for (int i9 = i8; i9 < this.c; i9++) {
                    this.a[i9] = null;
                }
                this.c = i8;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void c(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= d()) {
            int length = this.a.length;
            int i2 = this.b;
            if (i < length - i2) {
                length = i2 + i;
            }
            while (i2 < length) {
                this.a[i2] = null;
                i2++;
            }
            int i3 = this.b;
            int i4 = length - i3;
            int i5 = i - i4;
            this.b = this.d & (i3 + i4);
            if (i5 > 0) {
                for (int i6 = 0; i6 < i5; i6++) {
                    this.a[i6] = null;
                }
                this.b = i5;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int d() {
        return (this.c - this.b) & this.d;
    }
}
