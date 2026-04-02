package com.amazon.aps.iva.t2;

import java.lang.reflect.Array;
import java.util.Arrays;
/* compiled from: StepCurve.java */
/* loaded from: classes.dex */
public final class k extends c {
    public final g d;

    public k(String str) {
        this.a = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        double[] copyOf = Arrays.copyOf(dArr, i + 1);
        int length = (copyOf.length * 3) - 2;
        int length2 = copyOf.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i2 = 0; i2 < copyOf.length; i2++) {
            double d2 = copyOf[i2];
            int i3 = i2 + length2;
            dArr2[i3][0] = d2;
            double d3 = i2 * d;
            dArr3[i3] = d3;
            if (i2 > 0) {
                int i4 = (length2 * 2) + i2;
                dArr2[i4][0] = d2 + 1.0d;
                dArr3[i4] = d3 + 1.0d;
                int i5 = i2 - 1;
                dArr2[i5][0] = (d2 - 1.0d) - d;
                dArr3[i5] = (d3 - 1.0d) - d;
            }
        }
        g gVar = new g(dArr3, dArr2);
        System.out.println(" 0 " + gVar.b(0.0d));
        System.out.println(" 1 " + gVar.b(1.0d));
        this.d = gVar;
    }

    @Override // com.amazon.aps.iva.t2.c
    public final double a(double d) {
        return this.d.b(d);
    }

    @Override // com.amazon.aps.iva.t2.c
    public final double b(double d) {
        return this.d.g(d);
    }
}
