package com.amazon.aps.iva.t2;

import com.amazon.aps.iva.b6.x;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
/* compiled from: TimeCycleSplineSet.java */
/* loaded from: classes.dex */
public abstract class l {
    public b a;
    public int e;
    public String f;
    public long i;
    public int b = 0;
    public final int[] c = new int[10];
    public final float[][] d = (float[][]) Array.newInstance(Float.TYPE, 10, 3);
    public final float[] g = new float[3];
    public boolean h = false;
    public float j = Float.NaN;

    public final float a(float f) {
        float abs;
        switch (this.b) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - abs;
    }

    public void b(float f, float f2, float f3, int i, int i2) {
        int i3 = this.e;
        this.c[i3] = i;
        float[] fArr = this.d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.b = Math.max(this.b, i2);
        this.e++;
    }

    public void c(int i) {
        float[][] fArr;
        int i2 = this.e;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f);
            return;
        }
        int[] iArr = this.c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (true) {
            fArr = this.d;
            if (i3 <= 0) {
                break;
            }
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
                        float[] fArr2 = fArr[i9];
                        fArr[i9] = fArr[i8];
                        fArr[i8] = fArr2;
                        i9++;
                    }
                    i8++;
                }
                int i12 = iArr[i9];
                iArr[i9] = iArr[i6];
                iArr[i6] = i12;
                float[] fArr3 = fArr[i9];
                fArr[i9] = fArr[i6];
                fArr[i6] = fArr3;
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
        int i16 = 0;
        for (int i17 = 1; i17 < iArr.length; i17++) {
            if (iArr[i17] != iArr[i17 - 1]) {
                i16++;
            }
        }
        if (i16 == 0) {
            i16 = 1;
        }
        double[] dArr = new double[i16];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i16, 3);
        int i18 = 0;
        for (int i19 = 0; i19 < this.e; i19++) {
            if (i19 <= 0 || iArr[i19] != iArr[i19 - 1]) {
                dArr[i18] = iArr[i19] * 0.01d;
                double[] dArr3 = dArr2[i18];
                float[] fArr4 = fArr[i19];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i18++;
            }
        }
        this.a = b.a(i, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.e; i++) {
            StringBuilder b = x.b(str, "[");
            b.append(this.c[i]);
            b.append(" , ");
            b.append(decimalFormat.format(this.d[i]));
            b.append("] ");
            str = b.toString();
        }
        return str;
    }
}
