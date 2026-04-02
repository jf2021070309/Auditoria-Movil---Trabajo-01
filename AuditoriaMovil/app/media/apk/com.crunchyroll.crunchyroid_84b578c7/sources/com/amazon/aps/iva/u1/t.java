package com.amazon.aps.iva.u1;

import java.util.Arrays;
/* compiled from: MyersDiff.kt */
/* loaded from: classes.dex */
public final class t {
    public int[] a;
    public int b;

    public t(int i) {
        this.a = new int[i];
    }

    public final void a(int i, int i2, int i3) {
        int i4 = this.b;
        int i5 = i4 + 3;
        int[] iArr = this.a;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        iArr2[i4 + 0] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.b = i5;
    }

    public final void b(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        int i6 = i5 + 4;
        int[] iArr = this.a;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        iArr2[i5 + 0] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.b = i6;
    }

    public final void c(int i, int i2) {
        boolean z;
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.a;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 >= i6 && (i5 != i6 || iArr[i4 + 1] > iArr[i2 + 1])) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i3 += 3;
                    d(i3, i4);
                }
            }
            int i7 = i3 + 3;
            d(i7, i2);
            c(i, i7 - 3);
            c(i7 + 3, i2);
        }
    }

    public final void d(int i, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }
}
