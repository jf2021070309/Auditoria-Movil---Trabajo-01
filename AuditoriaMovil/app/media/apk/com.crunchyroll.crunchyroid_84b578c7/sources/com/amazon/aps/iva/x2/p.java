package com.amazon.aps.iva.x2;

import com.amazon.aps.iva.e4.t0;
import java.util.LinkedHashMap;
/* compiled from: MotionPaths.java */
/* loaded from: classes.dex */
public final class p implements Comparable<p> {
    public static final String[] o = {"position", "x", "y", "width", "height", "pathRotate"};
    public com.amazon.aps.iva.t2.c b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final float i;
    public int j;
    public int k;
    public final LinkedHashMap<String, androidx.constraintlayout.widget.a> l;
    public double[] m;
    public double[] n;

    public p() {
        this.i = Float.NaN;
        this.j = -1;
        this.k = -1;
        this.l = new LinkedHashMap<>();
        this.m = new double[18];
        this.n = new double[18];
    }

    public static boolean a(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) > 1.0E-6f) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f) != Float.isNaN(f2)) {
            return true;
        } else {
            return false;
        }
    }

    public final void b(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.e;
        float f2 = this.f;
        float f3 = this.g;
        float f4 = this.h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        fArr[i] = (f3 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(p pVar) {
        return Float.compare(this.d, pVar.d);
    }

    public p(int i, int i2, h hVar, p pVar, p pVar2) {
        float min;
        float f;
        this.i = Float.NaN;
        this.j = -1;
        this.k = -1;
        this.l = new LinkedHashMap<>();
        this.m = new double[18];
        this.n = new double[18];
        if (pVar.k != -1) {
            float f2 = hVar.a / 100.0f;
            this.c = f2;
            float f3 = Float.isNaN(hVar.h) ? f2 : hVar.h;
            float f4 = Float.isNaN(hVar.i) ? f2 : hVar.i;
            float f5 = pVar2.g;
            float f6 = pVar.g;
            float f7 = pVar2.h;
            float f8 = pVar.h;
            this.d = this.c;
            this.g = (int) (((f5 - f6) * f3) + f6);
            this.h = (int) (((f7 - f8) * f4) + f8);
            int i3 = hVar.n;
            if (i3 == 1) {
                float f9 = Float.isNaN(hVar.j) ? f2 : hVar.j;
                float f10 = pVar2.e;
                float f11 = pVar.e;
                this.e = t0.a(f10, f11, f9, f11);
                f2 = Float.isNaN(hVar.k) ? f2 : hVar.k;
                float f12 = pVar2.f;
                float f13 = pVar.f;
                this.f = t0.a(f12, f13, f2, f13);
            } else if (i3 != 2) {
                float f14 = Float.isNaN(hVar.j) ? f2 : hVar.j;
                float f15 = pVar2.e;
                float f16 = pVar.e;
                this.e = t0.a(f15, f16, f14, f16);
                f2 = Float.isNaN(hVar.k) ? f2 : hVar.k;
                float f17 = pVar2.f;
                float f18 = pVar.f;
                this.f = t0.a(f17, f18, f2, f18);
            } else {
                if (Float.isNaN(hVar.j)) {
                    float f19 = pVar2.e;
                    float f20 = pVar.e;
                    min = t0.a(f19, f20, f2, f20);
                } else {
                    min = Math.min(f4, f3) * hVar.j;
                }
                this.e = min;
                if (Float.isNaN(hVar.k)) {
                    float f21 = pVar2.f;
                    float f22 = pVar.f;
                    f = t0.a(f21, f22, f2, f22);
                } else {
                    f = hVar.k;
                }
                this.f = f;
            }
            this.k = pVar.k;
            this.b = com.amazon.aps.iva.t2.c.c(hVar.e);
            this.j = hVar.f;
            return;
        }
        int i4 = hVar.n;
        if (i4 == 1) {
            float f23 = hVar.a / 100.0f;
            this.c = f23;
            float f24 = Float.isNaN(hVar.h) ? f23 : hVar.h;
            float f25 = Float.isNaN(hVar.i) ? f23 : hVar.i;
            float f26 = pVar2.g - pVar.g;
            float f27 = pVar2.h - pVar.h;
            this.d = this.c;
            f23 = Float.isNaN(hVar.j) ? f23 : hVar.j;
            float f28 = pVar.e;
            float f29 = pVar.g;
            float f30 = pVar.f;
            float f31 = pVar.h;
            float f32 = ((pVar2.g / 2.0f) + pVar2.e) - ((f29 / 2.0f) + f28);
            float f33 = ((pVar2.h / 2.0f) + pVar2.f) - ((f31 / 2.0f) + f30);
            float f34 = f32 * f23;
            float f35 = f26 * f24;
            float f36 = f35 / 2.0f;
            this.e = (int) ((f28 + f34) - f36);
            float f37 = f23 * f33;
            float f38 = f27 * f25;
            float f39 = f38 / 2.0f;
            this.f = (int) ((f30 + f37) - f39);
            this.g = (int) (f29 + f35);
            this.h = (int) (f31 + f38);
            float f40 = Float.isNaN(hVar.k) ? 0.0f : hVar.k;
            this.e = ((int) ((pVar.e + f34) - f36)) + ((-f33) * f40);
            this.f = ((int) ((pVar.f + f37) - f39)) + (f32 * f40);
            this.k = this.k;
            this.b = com.amazon.aps.iva.t2.c.c(hVar.e);
            this.j = hVar.f;
        } else if (i4 != 2) {
            float f41 = hVar.a / 100.0f;
            this.c = f41;
            float f42 = Float.isNaN(hVar.h) ? f41 : hVar.h;
            float f43 = Float.isNaN(hVar.i) ? f41 : hVar.i;
            float f44 = pVar2.g;
            float f45 = pVar.g;
            float f46 = f44 - f45;
            float f47 = pVar2.h;
            float f48 = pVar.h;
            float f49 = f47 - f48;
            this.d = this.c;
            float f50 = pVar.e;
            float f51 = pVar.f;
            float f52 = ((f44 / 2.0f) + pVar2.e) - ((f45 / 2.0f) + f50);
            float f53 = ((f47 / 2.0f) + pVar2.f) - ((f48 / 2.0f) + f51);
            float f54 = f46 * f42;
            float f55 = f54 / 2.0f;
            this.e = (int) (((f52 * f41) + f50) - f55);
            float f56 = (f53 * f41) + f51;
            float f57 = f49 * f43;
            float f58 = f57 / 2.0f;
            this.f = (int) (f56 - f58);
            this.g = (int) (f45 + f54);
            this.h = (int) (f48 + f57);
            float f59 = Float.isNaN(hVar.j) ? f41 : hVar.j;
            float f60 = Float.isNaN(hVar.m) ? 0.0f : hVar.m;
            f41 = Float.isNaN(hVar.k) ? f41 : hVar.k;
            this.e = (int) ((((Float.isNaN(hVar.l) ? 0.0f : hVar.l) * f53) + ((f59 * f52) + pVar.e)) - f55);
            this.f = (int) (((f53 * f41) + ((f52 * f60) + pVar.f)) - f58);
            this.b = com.amazon.aps.iva.t2.c.c(hVar.e);
            this.j = hVar.f;
        } else {
            float f61 = hVar.a / 100.0f;
            this.c = f61;
            float f62 = Float.isNaN(hVar.h) ? f61 : hVar.h;
            float f63 = Float.isNaN(hVar.i) ? f61 : hVar.i;
            float f64 = pVar2.g;
            float f65 = pVar.g;
            float f66 = f64 - f65;
            float f67 = pVar2.h;
            float f68 = pVar.h;
            float f69 = f67 - f68;
            this.d = this.c;
            float f70 = pVar.e;
            float f71 = pVar.f;
            float f72 = (f64 / 2.0f) + pVar2.e;
            float f73 = (f67 / 2.0f) + pVar2.f;
            float f74 = f66 * f62;
            this.e = (int) ((((f72 - ((f65 / 2.0f) + f70)) * f61) + f70) - (f74 / 2.0f));
            float f75 = f69 * f63;
            this.f = (int) ((((f73 - ((f68 / 2.0f) + f71)) * f61) + f71) - (f75 / 2.0f));
            this.g = (int) (f65 + f74);
            this.h = (int) (f68 + f75);
            if (!Float.isNaN(hVar.j)) {
                this.e = (int) (hVar.j * ((int) (i - this.g)));
            }
            if (!Float.isNaN(hVar.k)) {
                this.f = (int) (hVar.k * ((int) (i2 - this.h)));
            }
            this.k = this.k;
            this.b = com.amazon.aps.iva.t2.c.c(hVar.e);
            this.j = hVar.f;
        }
    }
}
