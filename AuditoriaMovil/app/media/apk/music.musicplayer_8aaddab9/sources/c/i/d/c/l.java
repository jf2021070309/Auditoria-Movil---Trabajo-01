package c.i.d.c;
/* loaded from: classes.dex */
public final class l {
    public static final l a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2025b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2026c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2027d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2028e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2029f;

    /* renamed from: g  reason: collision with root package name */
    public final float f2030g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f2031h;

    /* renamed from: i  reason: collision with root package name */
    public final float f2032i;

    /* renamed from: j  reason: collision with root package name */
    public final float f2033j;

    /* renamed from: k  reason: collision with root package name */
    public final float f2034k;

    static {
        float[] fArr = b.f2004c;
        double c2 = b.c(50.0f);
        Double.isNaN(c2);
        float f2 = (float) ((c2 * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.a;
        float f3 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f4 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f5 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f6 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-f2) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f3) * exp) + 1.0f) - exp, (((100.0f / f4) * exp) + 1.0f) - exp, (((100.0f / f5) * exp) + 1.0f) - exp};
        float f7 = 1.0f / ((5.0f * f2) + 1.0f);
        float f8 = f7 * f7 * f7 * f7;
        float f9 = 1.0f - f8;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d3);
        float cbrt = (0.1f * f9 * f9 * ((float) Math.cbrt(d3 * 5.0d))) + (f8 * f2);
        float c3 = b.c(50.0f) / fArr[1];
        double d4 = c3;
        float pow = 0.725f / ((float) Math.pow(d4, 0.2d));
        double d5 = fArr3[0] * cbrt * f3;
        Double.isNaN(d5);
        Double.isNaN(d5);
        double d6 = fArr3[1] * cbrt * f4;
        Double.isNaN(d6);
        Double.isNaN(d6);
        double d7 = fArr3[2] * cbrt * f5;
        Double.isNaN(d7);
        Double.isNaN(d7);
        float[] fArr4 = {(float) Math.pow(d5 / 100.0d, 0.42d), (float) Math.pow(d6 / 100.0d, 0.42d), (float) Math.pow(d7 / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        a = new l(c3, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, f6, 1.0f, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), ((float) Math.sqrt(d4)) + 1.48f);
    }

    public l(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f2030g = f2;
        this.f2025b = f3;
        this.f2026c = f4;
        this.f2027d = f5;
        this.f2028e = f6;
        this.f2029f = f7;
        this.f2031h = fArr;
        this.f2032i = f8;
        this.f2033j = f9;
        this.f2034k = f10;
    }
}
