package com.amazon.aps.iva.t2;

import com.amazon.aps.iva.b6.x;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: KeyCycleOscillator.java */
/* loaded from: classes.dex */
public abstract class e {
    public a a;
    public String b;
    public int c = 0;
    public String d = null;
    public int e = 0;
    public final ArrayList<b> f = new ArrayList<>();

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class a {
        public final h a;
        public final float[] b;
        public final double[] c;
        public final float[] d;
        public final float[] e;
        public final float[] f;
        public com.amazon.aps.iva.t2.b g;
        public double[] h;

        public a(int i, String str, int i2) {
            long j;
            char c;
            h hVar = new h();
            this.a = hVar;
            hVar.e = i;
            if (str != null) {
                double[] dArr = new double[str.length() / 2];
                int indexOf = str.indexOf(40) + 1;
                int indexOf2 = str.indexOf(44, indexOf);
                char c2 = 0;
                int i3 = 0;
                while (indexOf2 != -1) {
                    dArr[i3] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                    indexOf = indexOf2 + 1;
                    indexOf2 = str.indexOf(44, indexOf);
                    i3++;
                }
                dArr[i3] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
                double[] copyOf = Arrays.copyOf(dArr, i3 + 1);
                int length = (copyOf.length * 3) - 2;
                int length2 = copyOf.length - 1;
                double d = 1.0d / length2;
                double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
                double[] dArr3 = new double[length];
                int i4 = 0;
                while (i4 < copyOf.length) {
                    double d2 = copyOf[i4];
                    int i5 = i4 + length2;
                    dArr2[i5][c2] = d2;
                    double d3 = i4 * d;
                    dArr3[i5] = d3;
                    if (i4 > 0) {
                        int i6 = (length2 * 2) + i4;
                        j = 4607182418800017408L;
                        c = 0;
                        dArr2[i6][0] = d2 + 1.0d;
                        dArr3[i6] = d3 + 1.0d;
                        int i7 = i4 - 1;
                        dArr2[i7][0] = (d2 - 1.0d) - d;
                        dArr3[i7] = (d3 - 1.0d) - d;
                    } else {
                        j = 4607182418800017408L;
                        c = 0;
                    }
                    i4++;
                    c2 = c;
                }
                hVar.d = new g(dArr3, dArr2);
            }
            this.b = new float[i2];
            this.c = new double[i2];
            this.d = new float[i2];
            this.e = new float[i2];
            this.f = new float[i2];
            float[] fArr = new float[i2];
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes.dex */
    public static class b {
        public final int a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;

        public b(float f, float f2, float f3, float f4, int i) {
            this.a = i;
            this.b = f4;
            this.c = f2;
            this.d = f;
            this.e = f3;
        }
    }

    public final float a(float f) {
        double signum;
        double d;
        double abs;
        a aVar = this.a;
        com.amazon.aps.iva.t2.b bVar = aVar.g;
        if (bVar != null) {
            bVar.c(f, aVar.h);
        } else {
            double[] dArr = aVar.h;
            dArr[0] = aVar.e[0];
            dArr[1] = aVar.f[0];
            dArr[2] = aVar.b[0];
        }
        double[] dArr2 = aVar.h;
        double d2 = dArr2[0];
        double d3 = dArr2[1];
        double d4 = f;
        h hVar = aVar.a;
        hVar.getClass();
        double d5 = 0.0d;
        if (d4 < 0.0d) {
            d4 = 0.0d;
        } else if (d4 > 1.0d) {
            d4 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(hVar.b, d4);
        if (binarySearch > 0) {
            d5 = 1.0d;
        } else if (binarySearch != 0) {
            int i = (-binarySearch) - 1;
            float[] fArr = hVar.a;
            float f2 = fArr[i];
            int i2 = i - 1;
            float f3 = fArr[i2];
            double d6 = f2 - f3;
            double[] dArr3 = hVar.b;
            double d7 = dArr3[i];
            double d8 = dArr3[i2];
            double d9 = d6 / (d7 - d8);
            d5 = ((((d4 * d4) - (d8 * d8)) * d9) / 2.0d) + ((d4 - d8) * (f3 - (d9 * d8))) + hVar.c[i2];
        }
        double d10 = d5 + d3;
        switch (hVar.e) {
            case 1:
                signum = Math.signum(0.5d - (d10 % 1.0d));
                break;
            case 2:
                d = 1.0d;
                abs = Math.abs((((d10 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                signum = d - abs;
                break;
            case 3:
                signum = (((d10 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                d = 1.0d;
                abs = ((d10 * 2.0d) + 1.0d) % 2.0d;
                signum = d - abs;
                break;
            case 5:
                signum = Math.cos((d3 + d10) * 6.283185307179586d);
                break;
            case 6:
                d = 1.0d;
                double abs2 = 1.0d - Math.abs(((d10 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                signum = d - abs;
                break;
            case 7:
                signum = hVar.d.b(d10 % 1.0d);
                break;
            default:
                signum = Math.sin(d10 * 6.283185307179586d);
                break;
        }
        return (float) ((signum * aVar.h[2]) + d2);
    }

    public final void c() {
        float[] fArr;
        float[] fArr2;
        int i;
        ArrayList<b> arrayList = this.f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new d());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, 3);
        this.a = new a(this.c, this.d, size);
        Iterator<b> it = arrayList.iterator();
        char c = 0;
        int i2 = 0;
        while (it.hasNext()) {
            b next = it.next();
            float f = next.d;
            dArr[i2] = f * 0.01d;
            double[] dArr3 = dArr2[i2];
            float f2 = next.b;
            dArr3[c] = f2;
            float f3 = next.c;
            dArr3[1] = f3;
            float f4 = next.e;
            dArr3[2] = f4;
            a aVar = this.a;
            aVar.c[i2] = next.a / 100.0d;
            aVar.d[i2] = f;
            aVar.e[i2] = f3;
            aVar.f[i2] = f4;
            aVar.b[i2] = f2;
            i2++;
            dArr = dArr;
            c = 0;
        }
        double[] dArr4 = dArr;
        a aVar2 = this.a;
        double[] dArr5 = aVar2.c;
        double[][] dArr6 = (double[][]) Array.newInstance(Double.TYPE, dArr5.length, 3);
        float[] fArr3 = aVar2.b;
        aVar2.h = new double[fArr3.length + 2];
        double[] dArr7 = new double[fArr3.length + 2];
        int i3 = (dArr5[0] > 0.0d ? 1 : (dArr5[0] == 0.0d ? 0 : -1));
        float[] fArr4 = aVar2.d;
        h hVar = aVar2.a;
        if (i3 > 0) {
            hVar.a(0.0d, fArr4[0]);
        }
        int length = dArr5.length - 1;
        if (dArr5[length] < 1.0d) {
            hVar.a(1.0d, fArr4[length]);
        }
        for (int i4 = 0; i4 < dArr6.length; i4++) {
            double[] dArr8 = dArr6[i4];
            dArr8[0] = aVar2.e[i4];
            dArr8[1] = aVar2.f[i4];
            dArr8[2] = fArr3[i4];
            hVar.a(dArr5[i4], fArr4[i4]);
        }
        int i5 = 0;
        double d = 0.0d;
        while (true) {
            if (i5 >= hVar.a.length) {
                break;
            }
            d += fArr[i5];
            i5++;
        }
        int i6 = 1;
        double d2 = 0.0d;
        while (true) {
            float[] fArr5 = hVar.a;
            if (i6 >= fArr5.length) {
                break;
            }
            int i7 = i6 - 1;
            float f5 = (fArr5[i7] + fArr5[i6]) / 2.0f;
            double[] dArr9 = hVar.b;
            d2 = ((dArr9[i6] - dArr9[i7]) * f5) + d2;
            i6++;
        }
        int i8 = 0;
        while (true) {
            float[] fArr6 = hVar.a;
            if (i8 >= fArr6.length) {
                break;
            }
            fArr6[i8] = (float) (fArr6[i8] * (d / d2));
            i8++;
        }
        hVar.c[0] = 0.0d;
        int i9 = 1;
        while (true) {
            if (i9 >= hVar.a.length) {
                break;
            }
            int i10 = i9 - 1;
            double[] dArr10 = hVar.b;
            double d3 = dArr10[i9] - dArr10[i10];
            double[] dArr11 = hVar.c;
            dArr11[i9] = (d3 * ((fArr2[i10] + fArr2[i9]) / 2.0f)) + dArr11[i10];
            i9++;
        }
        if (dArr5.length > 1) {
            i = 0;
            aVar2.g = com.amazon.aps.iva.t2.b.a(0, dArr5, dArr6);
        } else {
            i = 0;
            aVar2.g = null;
        }
        com.amazon.aps.iva.t2.b.a(i, dArr4, dArr2);
    }

    public final String toString() {
        String str = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            StringBuilder b2 = x.b(str, "[");
            b2.append(next.a);
            b2.append(" , ");
            b2.append(decimalFormat.format(next.b));
            b2.append("] ");
            str = b2.toString();
        }
        return str;
    }

    public void b(androidx.constraintlayout.widget.a aVar) {
    }
}
