package com.amazon.aps.iva.t2;

import java.util.Arrays;
/* compiled from: ArcCurveFit.java */
/* loaded from: classes.dex */
public final class a extends b {
    public final C0726a[] a;

    /* compiled from: ArcCurveFit.java */
    /* renamed from: com.amazon.aps.iva.t2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0726a {
        public static final double[] s = new double[91];
        public final double[] a;
        public double b;
        public final double c;
        public final double d;
        public final double e;
        public final double f;
        public final double g;
        public final double h;
        public final double i;
        public final double j;
        public final double k;
        public final double l;
        public final double m;
        public final double n;
        public double o;
        public double p;
        public final boolean q;
        public final boolean r;

        public C0726a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2;
            double d7;
            double[] dArr;
            double d8 = d3;
            this.r = false;
            boolean z = i == 1;
            this.q = z;
            this.c = d;
            this.d = d2;
            double d9 = 1.0d / (d2 - d);
            this.i = d9;
            if (3 == i) {
                this.r = true;
            }
            double d10 = d5 - d8;
            double d11 = d6 - d4;
            if (!this.r && Math.abs(d10) >= 0.001d && Math.abs(d11) >= 0.001d) {
                this.a = new double[101];
                this.j = (z ? -1 : 1) * d10;
                if (z) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                this.k = d11 * i2;
                this.l = z ? d5 : d8;
                if (z) {
                    d7 = d4;
                } else {
                    d7 = d6;
                }
                this.m = d7;
                double d12 = d4 - d6;
                int i3 = 0;
                double d13 = 0.0d;
                double d14 = 0.0d;
                double d15 = 0.0d;
                while (true) {
                    dArr = s;
                    if (i3 >= 91) {
                        break;
                    }
                    double d16 = d10;
                    double radians = Math.toRadians((i3 * 90.0d) / 90);
                    double sin = Math.sin(radians) * d16;
                    double cos = Math.cos(radians) * d12;
                    if (i3 > 0) {
                        d13 += Math.hypot(sin - d14, cos - d15);
                        dArr[i3] = d13;
                    }
                    i3++;
                    d15 = cos;
                    d14 = sin;
                    d10 = d16;
                }
                this.b = d13;
                for (int i4 = 0; i4 < 91; i4++) {
                    dArr[i4] = dArr[i4] / d13;
                }
                int i5 = 0;
                while (true) {
                    double[] dArr2 = this.a;
                    if (i5 < dArr2.length) {
                        double length = i5 / (dArr2.length - 1);
                        int binarySearch = Arrays.binarySearch(dArr, length);
                        if (binarySearch >= 0) {
                            dArr2[i5] = binarySearch / 90;
                        } else if (binarySearch == -1) {
                            dArr2[i5] = 0.0d;
                        } else {
                            int i6 = -binarySearch;
                            int i7 = i6 - 2;
                            double d17 = dArr[i7];
                            dArr2[i5] = (((length - d17) / (dArr[i6 - 1] - d17)) + i7) / 90;
                        }
                        i5++;
                    } else {
                        this.n = this.b * this.i;
                        return;
                    }
                }
            } else {
                this.r = true;
                this.e = d8;
                this.f = d5;
                this.g = d4;
                this.h = d6;
                double hypot = Math.hypot(d11, d10);
                this.b = hypot;
                this.n = hypot * d9;
                this.l = d10 / (d2 - d);
                this.m = d11 / (d2 - d);
            }
        }

        public final double a() {
            double d = this.j * this.p;
            double hypot = this.n / Math.hypot(d, (-this.k) * this.o);
            if (this.q) {
                d = -d;
            }
            return d * hypot;
        }

        public final double b() {
            double d = this.j * this.p;
            double d2 = (-this.k) * this.o;
            double hypot = this.n / Math.hypot(d, d2);
            if (this.q) {
                return (-d2) * hypot;
            }
            return d2 * hypot;
        }

        public final double c(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.f;
            double d4 = this.e;
            return ((d3 - d4) * d2) + d4;
        }

        public final double d(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.h;
            double d4 = this.g;
            return ((d3 - d4) * d2) + d4;
        }

        public final double e() {
            return (this.j * this.o) + this.l;
        }

        public final double f() {
            return (this.k * this.p) + this.m;
        }

        public final void g(double d) {
            double d2;
            if (this.q) {
                d2 = this.d - d;
            } else {
                d2 = d - this.c;
            }
            double d3 = d2 * this.i;
            double d4 = 0.0d;
            if (d3 > 0.0d) {
                d4 = 1.0d;
                if (d3 < 1.0d) {
                    double[] dArr = this.a;
                    double length = d3 * (dArr.length - 1);
                    int i = (int) length;
                    double d5 = dArr[i];
                    d4 = ((dArr[i + 1] - d5) * (length - i)) + d5;
                }
            }
            double d6 = d4 * 1.5707963267948966d;
            this.o = Math.sin(d6);
            this.p = Math.cos(d6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r5 == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            com.amazon.aps.iva.t2.a$a[] r2 = new com.amazon.aps.iva.t2.a.C0726a[r2]
            r0.a = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L12:
            com.amazon.aps.iva.t2.a$a[] r7 = r0.a
            int r8 = r7.length
            if (r4 >= r8) goto L4b
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L2b
            if (r8 == r3) goto L28
            r10 = 2
            if (r8 == r10) goto L26
            if (r8 == r9) goto L24
            goto L2c
        L24:
            if (r5 != r3) goto L28
        L26:
            r5 = r10
            goto L29
        L28:
            r5 = r3
        L29:
            r6 = r5
            goto L2c
        L2b:
            r6 = r9
        L2c:
            com.amazon.aps.iva.t2.a$a r22 = new com.amazon.aps.iva.t2.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L12
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t2.a.<init>(int[], double[], double[][]):void");
    }

    @Override // com.amazon.aps.iva.t2.b
    public final double b(double d) {
        C0726a[] c0726aArr = this.a;
        C0726a c0726a = c0726aArr[0];
        double d2 = c0726a.c;
        if (d < d2) {
            double d3 = d - d2;
            if (c0726a.r) {
                return (d3 * c0726aArr[0].l) + c0726a.c(d2);
            }
            c0726a.g(d2);
            return (c0726aArr[0].a() * d3) + c0726aArr[0].e();
        } else if (d > c0726aArr[c0726aArr.length - 1].d) {
            double d4 = c0726aArr[c0726aArr.length - 1].d;
            double d5 = d - d4;
            int length = c0726aArr.length - 1;
            return (d5 * c0726aArr[length].l) + c0726aArr[length].c(d4);
        } else {
            for (int i = 0; i < c0726aArr.length; i++) {
                C0726a c0726a2 = c0726aArr[i];
                if (d <= c0726a2.d) {
                    if (c0726a2.r) {
                        return c0726a2.c(d);
                    }
                    c0726a2.g(d);
                    return c0726aArr[i].e();
                }
            }
            return Double.NaN;
        }
    }

    @Override // com.amazon.aps.iva.t2.b
    public final void c(double d, double[] dArr) {
        C0726a[] c0726aArr = this.a;
        C0726a c0726a = c0726aArr[0];
        double d2 = c0726a.c;
        if (d < d2) {
            double d3 = d - d2;
            if (c0726a.r) {
                double c = c0726a.c(d2);
                C0726a c0726a2 = c0726aArr[0];
                dArr[0] = (c0726a2.l * d3) + c;
                dArr[1] = (d3 * c0726aArr[0].m) + c0726a2.d(d2);
                return;
            }
            c0726a.g(d2);
            dArr[0] = (c0726aArr[0].a() * d3) + c0726aArr[0].e();
            dArr[1] = (c0726aArr[0].b() * d3) + c0726aArr[0].f();
        } else if (d > c0726aArr[c0726aArr.length - 1].d) {
            double d4 = c0726aArr[c0726aArr.length - 1].d;
            double d5 = d - d4;
            int length = c0726aArr.length - 1;
            C0726a c0726a3 = c0726aArr[length];
            if (c0726a3.r) {
                double c2 = c0726a3.c(d4);
                C0726a c0726a4 = c0726aArr[length];
                dArr[0] = (c0726a4.l * d5) + c2;
                dArr[1] = (d5 * c0726aArr[length].m) + c0726a4.d(d4);
                return;
            }
            c0726a3.g(d);
            dArr[0] = (c0726aArr[length].a() * d5) + c0726aArr[length].e();
            dArr[1] = (c0726aArr[length].b() * d5) + c0726aArr[length].f();
        } else {
            for (int i = 0; i < c0726aArr.length; i++) {
                C0726a c0726a5 = c0726aArr[i];
                if (d <= c0726a5.d) {
                    if (c0726a5.r) {
                        dArr[0] = c0726a5.c(d);
                        dArr[1] = c0726aArr[i].d(d);
                        return;
                    }
                    c0726a5.g(d);
                    dArr[0] = c0726aArr[i].e();
                    dArr[1] = c0726aArr[i].f();
                    return;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.t2.b
    public final void d(double d, float[] fArr) {
        C0726a[] c0726aArr = this.a;
        C0726a c0726a = c0726aArr[0];
        double d2 = c0726a.c;
        if (d < d2) {
            double d3 = d - d2;
            if (c0726a.r) {
                double c = c0726a.c(d2);
                C0726a c0726a2 = c0726aArr[0];
                fArr[0] = (float) ((c0726a2.l * d3) + c);
                fArr[1] = (float) ((d3 * c0726aArr[0].m) + c0726a2.d(d2));
                return;
            }
            c0726a.g(d2);
            fArr[0] = (float) ((c0726aArr[0].a() * d3) + c0726aArr[0].e());
            fArr[1] = (float) ((c0726aArr[0].b() * d3) + c0726aArr[0].f());
        } else if (d > c0726aArr[c0726aArr.length - 1].d) {
            double d4 = c0726aArr[c0726aArr.length - 1].d;
            double d5 = d - d4;
            int length = c0726aArr.length - 1;
            C0726a c0726a3 = c0726aArr[length];
            if (c0726a3.r) {
                double c2 = c0726a3.c(d4);
                C0726a c0726a4 = c0726aArr[length];
                fArr[0] = (float) ((c0726a4.l * d5) + c2);
                fArr[1] = (float) ((d5 * c0726aArr[length].m) + c0726a4.d(d4));
                return;
            }
            c0726a3.g(d);
            fArr[0] = (float) c0726aArr[length].e();
            fArr[1] = (float) c0726aArr[length].f();
        } else {
            for (int i = 0; i < c0726aArr.length; i++) {
                C0726a c0726a5 = c0726aArr[i];
                if (d <= c0726a5.d) {
                    if (c0726a5.r) {
                        fArr[0] = (float) c0726a5.c(d);
                        fArr[1] = (float) c0726aArr[i].d(d);
                        return;
                    }
                    c0726a5.g(d);
                    fArr[0] = (float) c0726aArr[i].e();
                    fArr[1] = (float) c0726aArr[i].f();
                    return;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.t2.b
    public final void e(double d, double[] dArr) {
        C0726a[] c0726aArr = this.a;
        double d2 = c0726aArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > c0726aArr[c0726aArr.length - 1].d) {
            d = c0726aArr[c0726aArr.length - 1].d;
        }
        for (int i = 0; i < c0726aArr.length; i++) {
            C0726a c0726a = c0726aArr[i];
            if (d <= c0726a.d) {
                if (c0726a.r) {
                    dArr[0] = c0726a.l;
                    dArr[1] = c0726a.m;
                    return;
                }
                c0726a.g(d);
                dArr[0] = c0726aArr[i].a();
                dArr[1] = c0726aArr[i].b();
                return;
            }
        }
    }
}
