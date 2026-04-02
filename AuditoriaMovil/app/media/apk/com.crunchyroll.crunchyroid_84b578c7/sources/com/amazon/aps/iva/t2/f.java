package com.amazon.aps.iva.t2;
/* compiled from: LinearCurveFit.java */
/* loaded from: classes.dex */
public final class f extends b {
    public final double[] a;
    public final double[][] b;
    public final double[] c;

    public f(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.c = new double[length2];
        this.a = dArr;
        this.b = dArr2;
        if (length2 > 2) {
            double d = 0.0d;
            int i = 0;
            while (i < dArr.length) {
                double d2 = dArr2[i][0];
                if (i > 0) {
                    double d3 = d2 - d;
                    Math.hypot(d3, d3);
                }
                i++;
                d = d2;
            }
        }
    }

    @Override // com.amazon.aps.iva.t2.b
    public final double b(double d) {
        double d2;
        double d3;
        double f;
        double[] dArr = this.a;
        int length = dArr.length;
        double d4 = dArr[0];
        int i = (d > d4 ? 1 : (d == d4 ? 0 : -1));
        double[][] dArr2 = this.b;
        if (i <= 0) {
            d2 = dArr2[0][0];
            d3 = d - d4;
            f = f(d4);
        } else {
            int i2 = length - 1;
            double d5 = dArr[i2];
            if (d >= d5) {
                d2 = dArr2[i2][0];
                d3 = d - d5;
                f = f(d5);
            } else {
                int i3 = 0;
                while (i3 < i2) {
                    double d6 = dArr[i3];
                    if (d == d6) {
                        return dArr2[i3][0];
                    }
                    int i4 = i3 + 1;
                    double d7 = dArr[i4];
                    if (d < d7) {
                        double d8 = (d - d6) / (d7 - d6);
                        return (dArr2[i4][0] * d8) + ((1.0d - d8) * dArr2[i3][0]);
                    }
                    i3 = i4;
                }
                return 0.0d;
            }
        }
        return (f * d3) + d2;
    }

    @Override // com.amazon.aps.iva.t2.b
    public final void c(double d, double[] dArr) {
        double[] dArr2 = this.a;
        int length = dArr2.length;
        double[][] dArr3 = this.b;
        int i = 0;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        int i2 = (d > d2 ? 1 : (d == d2 ? 0 : -1));
        double[] dArr4 = this.c;
        if (i2 <= 0) {
            e(d2, dArr4);
            for (int i3 = 0; i3 < length2; i3++) {
                dArr[i3] = ((d - dArr2[0]) * dArr4[i3]) + dArr3[0][i3];
            }
            return;
        }
        int i4 = length - 1;
        double d3 = dArr2[i4];
        if (d >= d3) {
            e(d3, dArr4);
            while (i < length2) {
                dArr[i] = ((d - dArr2[i4]) * dArr4[i]) + dArr3[i4][i];
                i++;
            }
            return;
        }
        int i5 = 0;
        while (i5 < length - 1) {
            if (d == dArr2[i5]) {
                for (int i6 = 0; i6 < length2; i6++) {
                    dArr[i6] = dArr3[i5][i6];
                }
            }
            int i7 = i5 + 1;
            double d4 = dArr2[i7];
            if (d < d4) {
                double d5 = dArr2[i5];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    dArr[i] = (dArr3[i7][i] * d6) + ((1.0d - d6) * dArr3[i5][i]);
                    i++;
                }
                return;
            }
            i5 = i7;
        }
    }

    @Override // com.amazon.aps.iva.t2.b
    public final void d(double d, float[] fArr) {
        double[] dArr = this.a;
        int length = dArr.length;
        double[][] dArr2 = this.b;
        int i = 0;
        int length2 = dArr2[0].length;
        double d2 = dArr[0];
        int i2 = (d > d2 ? 1 : (d == d2 ? 0 : -1));
        double[] dArr3 = this.c;
        if (i2 <= 0) {
            e(d2, dArr3);
            for (int i3 = 0; i3 < length2; i3++) {
                fArr[i3] = (float) (((d - dArr[0]) * dArr3[i3]) + dArr2[0][i3]);
            }
            return;
        }
        int i4 = length - 1;
        double d3 = dArr[i4];
        if (d >= d3) {
            e(d3, dArr3);
            while (i < length2) {
                fArr[i] = (float) (((d - dArr[i4]) * dArr3[i]) + dArr2[i4][i]);
                i++;
            }
            return;
        }
        int i5 = 0;
        while (i5 < i4) {
            if (d == dArr[i5]) {
                for (int i6 = 0; i6 < length2; i6++) {
                    fArr[i6] = (float) dArr2[i5][i6];
                }
            }
            int i7 = i5 + 1;
            double d4 = dArr[i7];
            if (d < d4) {
                double d5 = dArr[i5];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    fArr[i] = (float) ((dArr2[i7][i] * d6) + ((1.0d - d6) * dArr2[i5][i]));
                    i++;
                }
                return;
            }
            i5 = i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r12 >= r5) goto L3;
     */
    @Override // com.amazon.aps.iva.t2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(double r12, double[] r14) {
        /*
            r11 = this;
            double[] r0 = r11.a
            int r1 = r0.length
            double[][] r2 = r11.b
            r3 = 0
            r4 = r2[r3]
            int r4 = r4.length
            r5 = r0[r3]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 > 0) goto L11
        Lf:
            r12 = r5
            goto L1a
        L11:
            int r5 = r1 + (-1)
            r5 = r0[r5]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 < 0) goto L1a
            goto Lf
        L1a:
            r5 = r3
        L1b:
            int r6 = r1 + (-1)
            if (r5 >= r6) goto L3d
            int r6 = r5 + 1
            r7 = r0[r6]
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 > 0) goto L3b
            r12 = r0[r5]
            double r7 = r7 - r12
        L2a:
            if (r3 >= r4) goto L3d
            r12 = r2[r5]
            r0 = r12[r3]
            r12 = r2[r6]
            r9 = r12[r3]
            double r9 = r9 - r0
            double r9 = r9 / r7
            r14[r3] = r9
            int r3 = r3 + 1
            goto L2a
        L3b:
            r5 = r6
            goto L1b
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t2.f.e(double, double[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r9 >= r3) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double f(double r9) {
        /*
            r8 = this;
            double[] r0 = r8.a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r9 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L15
            goto La
        L15:
            r3 = r2
        L16:
            int r4 = r1 + (-1)
            if (r3 >= r4) goto L34
            int r4 = r3 + 1
            r5 = r0[r4]
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L32
            r9 = r0[r3]
            double r5 = r5 - r9
            double[][] r9 = r8.b
            r10 = r9[r3]
            r0 = r10[r2]
            r9 = r9[r4]
            r2 = r9[r2]
            double r2 = r2 - r0
            double r2 = r2 / r5
            return r2
        L32:
            r3 = r4
            goto L16
        L34:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t2.f.f(double):double");
    }
}
