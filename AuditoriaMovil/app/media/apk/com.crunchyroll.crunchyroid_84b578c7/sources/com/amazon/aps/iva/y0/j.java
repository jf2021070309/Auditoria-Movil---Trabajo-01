package com.amazon.aps.iva.y0;
/* compiled from: SnapshotDoubleIndexHeap.kt */
/* loaded from: classes.dex */
public final class j {
    public int a;
    public int[] b = new int[16];
    public int[] c = new int[16];
    public int[] d;
    public int e;

    public j() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.d = iArr;
    }

    public final int a(int i) {
        int i2 = this.a + 1;
        int[] iArr = this.b;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            com.amazon.aps.iva.lb0.m.G(iArr, iArr2, 0, 14);
            com.amazon.aps.iva.lb0.m.G(this.c, iArr3, 0, 14);
            this.b = iArr2;
            this.c = iArr3;
        }
        int i4 = this.a;
        this.a = i4 + 1;
        int length2 = this.d.length;
        if (this.e >= length2) {
            int i5 = length2 * 2;
            int[] iArr4 = new int[i5];
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i6 + 1;
                iArr4[i6] = i7;
                i6 = i7;
            }
            com.amazon.aps.iva.lb0.m.G(this.d, iArr4, 0, 14);
            this.d = iArr4;
        }
        int i8 = this.e;
        int[] iArr5 = this.d;
        this.e = iArr5[i8];
        int[] iArr6 = this.b;
        iArr6[i4] = i;
        this.c[i4] = i8;
        iArr5[i8] = i4;
        int i9 = iArr6[i4];
        while (i4 > 0) {
            int i10 = ((i4 + 1) >> 1) - 1;
            if (iArr6[i10] <= i9) {
                break;
            }
            b(i10, i4);
            i4 = i10;
        }
        return i8;
    }

    public final void b(int i, int i2) {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        int[] iArr3 = this.d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
