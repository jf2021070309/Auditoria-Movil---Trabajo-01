package com.amazon.aps.iva.f3;
/* compiled from: ViewingConditions.java */
/* loaded from: classes.dex */
public final class k {
    public static final k k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float f;
        float f2;
        float[] fArr = com.amazon.aps.iva.e1.d.c;
        float m = (float) ((com.amazon.aps.iva.e1.d.m() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = com.amazon.aps.iva.e1.d.a;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr3[1] * f4;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5 + (fArr3[0] * f3);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f3 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f = 0.100000046f;
            f2 = 0.59f;
        } else {
            f = 0.12999998f;
            f2 = 0.525f;
        }
        float f10 = f + f2;
        float exp = (1.0f - (((float) Math.exp(((-m) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f11 = 1.0f / ((5.0f * m) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float cbrt = (0.1f * f13 * f13 * ((float) Math.cbrt(m * 5.0d))) + (f12 * m);
        float m2 = com.amazon.aps.iva.e1.d.m() / fArr[1];
        double d2 = m2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f9) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f8) / 100.0d, 0.42d), pow2};
        float f14 = fArr7[0];
        float f15 = fArr7[1];
        k = new k(m2, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f14 * 400.0f) / (f14 + 27.13f)) * 2.0f) + ((f15 * 400.0f) / (f15 + 27.13f))) * pow, pow, pow, f10, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public k(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f = f;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.g = fArr;
        this.h = f7;
        this.i = f8;
        this.j = f9;
    }
}
