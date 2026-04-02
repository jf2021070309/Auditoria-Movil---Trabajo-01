package com.amazon.aps.iva.g1;
/* compiled from: Oklab.kt */
/* loaded from: classes.dex */
public final class l extends c {
    public static final float[] d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;

    static {
        float[] e2 = d.e(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.b(a.b.a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        d = e2;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr;
        f = d.d(e2);
        g = d.d(fArr);
    }

    public l() {
        super(17, b.c, "Oklab");
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float[] a(float[] fArr) {
        d.g(d, fArr);
        double d2 = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d2));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d2));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d2));
        d.g(e, fArr);
        return fArr;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float b(int i) {
        if (i == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float c(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final long e(float f2, float f3, float f4) {
        float i = com.amazon.aps.iva.aq.j.i(f2, 0.0f, 1.0f);
        float i2 = com.amazon.aps.iva.aq.j.i(f3, -0.5f, 0.5f);
        float i3 = com.amazon.aps.iva.aq.j.i(f4, -0.5f, 0.5f);
        float[] fArr = g;
        float h = d.h(i, i2, i3, fArr);
        float i4 = d.i(i, i2, i3, fArr);
        float j = d.j(i, i2, i3, fArr);
        float f5 = h * h * h;
        float f6 = i4 * i4 * i4;
        float f7 = j * j * j;
        float[] fArr2 = f;
        return (Float.floatToIntBits(d.h(f5, f6, f7, fArr2)) << 32) | (Float.floatToIntBits(d.i(f5, f6, f7, fArr2)) & 4294967295L);
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float[] f(float[] fArr) {
        fArr[0] = com.amazon.aps.iva.aq.j.i(fArr[0], 0.0f, 1.0f);
        fArr[1] = com.amazon.aps.iva.aq.j.i(fArr[1], -0.5f, 0.5f);
        fArr[2] = com.amazon.aps.iva.aq.j.i(fArr[2], -0.5f, 0.5f);
        d.g(g, fArr);
        float f2 = fArr[0];
        fArr[0] = f2 * f2 * f2;
        float f3 = fArr[1];
        fArr[1] = f3 * f3 * f3;
        float f4 = fArr[2];
        fArr[2] = f4 * f4 * f4;
        d.g(f, fArr);
        return fArr;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float g(float f2, float f3, float f4) {
        float i = com.amazon.aps.iva.aq.j.i(f2, 0.0f, 1.0f);
        float i2 = com.amazon.aps.iva.aq.j.i(f3, -0.5f, 0.5f);
        float i3 = com.amazon.aps.iva.aq.j.i(f4, -0.5f, 0.5f);
        float[] fArr = g;
        float h = d.h(i, i2, i3, fArr);
        float i4 = d.i(i, i2, i3, fArr);
        float j = d.j(i, i2, i3, fArr);
        return d.j(h * h * h, i4 * i4 * i4, j * j * j, f);
    }

    @Override // com.amazon.aps.iva.g1.c
    public final long h(float f2, float f3, float f4, float f5, c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "colorSpace");
        float[] fArr = d;
        float h = d.h(f2, f3, f4, fArr);
        float i = d.i(f2, f3, f4, fArr);
        float j = d.j(f2, f3, f4, fArr);
        double d2 = 0.33333334f;
        float signum = Math.signum(h) * ((float) Math.pow(Math.abs(h), d2));
        float signum2 = Math.signum(i) * ((float) Math.pow(Math.abs(i), d2));
        float signum3 = Math.signum(j) * ((float) Math.pow(Math.abs(j), d2));
        float[] fArr2 = e;
        return defpackage.i.b(d.h(signum, signum2, signum3, fArr2), d.i(signum, signum2, signum3, fArr2), d.j(signum, signum2, signum3, fArr2), f5, cVar);
    }
}
