package com.amazon.aps.iva.t2;

import com.amazon.aps.iva.b6.x;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
/* compiled from: SplineSet.java */
/* loaded from: classes.dex */
public abstract class j {
    public b a;
    public int[] b = new int[10];
    public float[] c = new float[10];
    public int d;
    public String e;

    public final float a(float f) {
        return (float) this.a.b(f);
    }

    public void b(float f, int i) {
        int[] iArr = this.b;
        if (iArr.length < this.d + 1) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.c;
            this.c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.d;
        iArr2[i2] = i;
        this.c[i2] = f;
        this.d = i2 + 1;
    }

    public void c(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.b;
        float[] fArr = this.c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (i3 > 0) {
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            i3 = i4 - 1;
            int i6 = iArr2[i3];
            if (i5 < i6) {
                int i7 = iArr[i6];
                int i8 = i5;
                int i9 = i8;
                while (i8 < i6) {
                    int i10 = iArr[i8];
                    if (i10 <= i7) {
                        int i11 = iArr[i9];
                        iArr[i9] = i10;
                        iArr[i8] = i11;
                        float f = fArr[i9];
                        fArr[i9] = fArr[i8];
                        fArr[i8] = f;
                        i9++;
                    }
                    i8++;
                }
                int i12 = iArr[i9];
                iArr[i9] = iArr[i6];
                iArr[i6] = i12;
                float f2 = fArr[i9];
                fArr[i9] = fArr[i6];
                fArr[i6] = f2;
                int i13 = i3 + 1;
                iArr2[i3] = i9 - 1;
                int i14 = i13 + 1;
                iArr2[i13] = i5;
                int i15 = i14 + 1;
                iArr2[i14] = i6;
                i3 = i15 + 1;
                iArr2[i15] = i9 + 1;
            }
        }
        int i16 = 1;
        for (int i17 = 1; i17 < this.d; i17++) {
            int[] iArr3 = this.b;
            if (iArr3[i17 - 1] != iArr3[i17]) {
                i16++;
            }
        }
        double[] dArr = new double[i16];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i16, 1);
        int i18 = 0;
        for (int i19 = 0; i19 < this.d; i19++) {
            if (i19 > 0) {
                int[] iArr4 = this.b;
                if (iArr4[i19] == iArr4[i19 - 1]) {
                }
            }
            dArr[i18] = this.b[i19] * 0.01d;
            dArr2[i18][0] = this.c[i19];
            i18++;
        }
        this.a = b.a(i, dArr, dArr2);
    }

    public final String toString() {
        String str = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.d; i++) {
            StringBuilder b = x.b(str, "[");
            b.append(this.b[i]);
            b.append(" , ");
            b.append(decimalFormat.format(this.c[i]));
            b.append("] ");
            str = b.toString();
        }
        return str;
    }
}
