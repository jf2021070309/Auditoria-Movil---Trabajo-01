package com.amazon.aps.iva.t2;
/* compiled from: CurveFit.java */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: CurveFit.java */
    /* loaded from: classes.dex */
    public static class a extends b {
        public final double[] a;

        public a(double d, double[] dArr) {
            this.a = dArr;
        }

        @Override // com.amazon.aps.iva.t2.b
        public final double b(double d) {
            return this.a[0];
        }

        @Override // com.amazon.aps.iva.t2.b
        public final void c(double d, double[] dArr) {
            double[] dArr2 = this.a;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // com.amazon.aps.iva.t2.b
        public final void d(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.a;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        @Override // com.amazon.aps.iva.t2.b
        public final void e(double d, double[] dArr) {
            for (int i = 0; i < this.a.length; i++) {
                dArr[i] = 0.0d;
            }
        }
    }

    public static b a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            if (i != 2) {
                return new f(dArr, dArr2);
            }
            return new a(dArr[0], dArr2[0]);
        }
        return new g(dArr, dArr2);
    }

    public abstract double b(double d);

    public abstract void c(double d, double[] dArr);

    public abstract void d(double d, float[] fArr);

    public abstract void e(double d, double[] dArr);
}
