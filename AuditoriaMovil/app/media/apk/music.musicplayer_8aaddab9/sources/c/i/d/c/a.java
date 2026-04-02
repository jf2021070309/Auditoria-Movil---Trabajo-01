package c.i.d.c;

import android.graphics.Color;
/* loaded from: classes.dex */
public class a {
    public final float a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1998b;

    /* renamed from: c  reason: collision with root package name */
    public final float f1999c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2000d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2001e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2002f;

    public a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.a = f2;
        this.f1998b = f3;
        this.f1999c = f4;
        this.f2000d = f8;
        this.f2001e = f9;
        this.f2002f = f10;
    }

    public static a a(int i2) {
        l lVar = l.a;
        float b2 = b.b(Color.red(i2));
        float b3 = b.b(Color.green(i2));
        float b4 = b.b(Color.blue(i2));
        float[][] fArr = b.f2005d;
        float[] fArr2 = {(fArr[0][2] * b4) + (fArr[0][1] * b3) + (fArr[0][0] * b2), (fArr[1][2] * b4) + (fArr[1][1] * b3) + (fArr[1][0] * b2), (b4 * fArr[2][2]) + (b3 * fArr[2][1]) + (b2 * fArr[2][0])};
        float[][] fArr3 = b.a;
        float f2 = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f3 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f4 = fArr2[0] * fArr3[2][0];
        float f5 = fArr2[2] * fArr3[2][2];
        float[] fArr4 = lVar.f2031h;
        float f6 = fArr4[0] * f2;
        float f7 = fArr4[1] * f3;
        float f8 = fArr4[2] * (f5 + (fArr2[1] * fArr3[2][1]) + f4);
        double abs = Math.abs(f6) * lVar.f2032i;
        Double.isNaN(abs);
        Double.isNaN(abs);
        float pow = (float) Math.pow(abs / 100.0d, 0.42d);
        double abs2 = Math.abs(f7) * lVar.f2032i;
        Double.isNaN(abs2);
        Double.isNaN(abs2);
        float pow2 = (float) Math.pow(abs2 / 100.0d, 0.42d);
        double abs3 = Math.abs(f8) * lVar.f2032i;
        Double.isNaN(abs3);
        Double.isNaN(abs3);
        float pow3 = (float) Math.pow(abs3 / 100.0d, 0.42d);
        float signum = ((Math.signum(f6) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f7) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f8) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = signum;
        Double.isNaN(d2);
        Double.isNaN(d2);
        double d3 = signum2;
        Double.isNaN(d3);
        Double.isNaN(d3);
        double d4 = signum3;
        Double.isNaN(d4);
        Double.isNaN(d4);
        float f9 = ((float) (((d3 * (-12.0d)) + (d2 * 11.0d)) + d4)) / 11.0f;
        double d5 = signum + signum2;
        Double.isNaN(d4);
        Double.isNaN(d4);
        Double.isNaN(d5);
        Double.isNaN(d5);
        float f10 = ((float) (d5 - (d4 * 2.0d))) / 9.0f;
        float f11 = signum2 * 20.0f;
        float f12 = ((21.0f * signum3) + ((signum * 20.0f) + f11)) / 20.0f;
        float f13 = (((signum * 40.0f) + f11) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f10, f9)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f14 = atan2;
        float f15 = (3.1415927f * f14) / 180.0f;
        float pow4 = ((float) Math.pow((f13 * lVar.f2026c) / lVar.f2025b, lVar.f2028e * lVar.f2034k)) * 100.0f;
        float sqrt = (lVar.f2025b + 4.0f) * (4.0f / lVar.f2028e) * ((float) Math.sqrt(pow4 / 100.0f)) * lVar.f2033j;
        double d6 = ((double) f14) < 20.14d ? 360.0f + f14 : f14;
        Double.isNaN(d6);
        Double.isNaN(d6);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f2030g), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((d6 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f2029f) * lVar.f2027d) * ((float) Math.sqrt((f10 * f10) + (f9 * f9)))) / (f12 + 0.305f), 0.9d));
        double d7 = pow4;
        Double.isNaN(d7);
        Double.isNaN(d7);
        float sqrt2 = pow5 * ((float) Math.sqrt(d7 / 100.0d));
        float f16 = sqrt2 * lVar.f2033j;
        float sqrt3 = ((float) Math.sqrt((pow5 * lVar.f2028e) / (lVar.f2025b + 4.0f))) * 50.0f;
        float f17 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * f16) + 1.0f)) * 43.85965f;
        double d8 = f15;
        return new a(f14, sqrt2, pow4, sqrt, f16, sqrt3, f17, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    public static a b(float f2, float f3, float f4) {
        double d2;
        l lVar = l.a;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d3);
        float sqrt = (lVar.f2025b + 4.0f) * (4.0f / lVar.f2028e) * ((float) Math.sqrt(d3 / 100.0d));
        float f5 = lVar.f2033j;
        float f6 = sqrt * f5;
        float f7 = f3 * f5;
        float sqrt2 = ((float) Math.sqrt(((f3 / ((float) Math.sqrt(d2))) * lVar.f2028e) / (lVar.f2025b + 4.0f))) * 50.0f;
        float f8 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        double d4 = f7;
        Double.isNaN(d4);
        Double.isNaN(d4);
        float log = ((float) Math.log((d4 * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f4) / 180.0f;
        return new a(f4, f3, f2, f6, f7, sqrt2, f8, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    public int c(l lVar) {
        float f2;
        float f3 = this.f1998b;
        if (f3 != 0.0d) {
            double d2 = this.f1999c;
            if (d2 != 0.0d) {
                Double.isNaN(d2);
                Double.isNaN(d2);
                f2 = f3 / ((float) Math.sqrt(d2 / 100.0d));
                double d3 = f2;
                double pow = Math.pow(1.64d - Math.pow(0.29d, lVar.f2030g), 0.73d);
                Double.isNaN(d3);
                Double.isNaN(d3);
                float pow2 = (float) Math.pow(d3 / pow, 1.1111111111111112d);
                double d4 = (this.a * 3.1415927f) / 180.0f;
                Double.isNaN(d4);
                Double.isNaN(d4);
                float f4 = lVar.f2025b;
                double d5 = this.f1999c;
                Double.isNaN(d5);
                Double.isNaN(d5);
                double d6 = lVar.f2028e;
                Double.isNaN(d6);
                Double.isNaN(d6);
                double d7 = 1.0d / d6;
                double d8 = lVar.f2034k;
                Double.isNaN(d8);
                Double.isNaN(d8);
                float pow3 = f4 * ((float) Math.pow(d5 / 100.0d, d7 / d8));
                float cos = ((float) (Math.cos(2.0d + d4) + 3.8d)) * 0.25f * 3846.1538f * lVar.f2029f * lVar.f2027d;
                float f5 = pow3 / lVar.f2026c;
                float sin = (float) Math.sin(d4);
                float cos2 = (float) Math.cos(d4);
                float f6 = (((0.305f + f5) * 23.0f) * pow2) / (((pow2 * 108.0f) * sin) + (((11.0f * pow2) * cos2) + (cos * 23.0f)));
                float f7 = cos2 * f6;
                float f8 = f6 * sin;
                float f9 = f5 * 460.0f;
                float f10 = ((288.0f * f8) + ((451.0f * f7) + f9)) / 1403.0f;
                float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
                float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
                double abs = Math.abs(f10);
                Double.isNaN(abs);
                Double.isNaN(abs);
                double abs2 = Math.abs(f10);
                Double.isNaN(abs2);
                Double.isNaN(abs2);
                float signum = (100.0f / lVar.f2032i) * Math.signum(f10) * ((float) Math.pow((float) Math.max(0.0d, (abs * 27.13d) / (400.0d - abs2)), 2.380952380952381d));
                double abs3 = Math.abs(f11);
                Double.isNaN(abs3);
                Double.isNaN(abs3);
                double abs4 = Math.abs(f11);
                Double.isNaN(abs4);
                Double.isNaN(abs4);
                float signum2 = (100.0f / lVar.f2032i) * Math.signum(f11) * ((float) Math.pow((float) Math.max(0.0d, (abs3 * 27.13d) / (400.0d - abs4)), 2.380952380952381d));
                double abs5 = Math.abs(f12);
                Double.isNaN(abs5);
                Double.isNaN(abs5);
                double abs6 = Math.abs(f12);
                Double.isNaN(abs6);
                Double.isNaN(abs6);
                float signum3 = Math.signum(f12);
                float[] fArr = lVar.f2031h;
                float f13 = signum / fArr[0];
                float f14 = signum2 / fArr[1];
                float pow4 = (((100.0f / lVar.f2032i) * signum3) * ((float) Math.pow((float) Math.max(0.0d, (abs5 * 27.13d) / (400.0d - abs6)), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = b.f2003b;
                float f15 = (fArr2[0][2] * pow4) + (fArr2[0][1] * f14) + (fArr2[0][0] * f13);
                float f16 = (fArr2[1][2] * pow4) + (fArr2[1][1] * f14) + (fArr2[1][0] * f13);
                float f17 = f13 * fArr2[2][0];
                return c.i.e.b.a(f15, f16, (pow4 * fArr2[2][2]) + (f14 * fArr2[2][1]) + f17);
            }
        }
        f2 = 0.0f;
        double d32 = f2;
        double pow5 = Math.pow(1.64d - Math.pow(0.29d, lVar.f2030g), 0.73d);
        Double.isNaN(d32);
        Double.isNaN(d32);
        float pow22 = (float) Math.pow(d32 / pow5, 1.1111111111111112d);
        double d42 = (this.a * 3.1415927f) / 180.0f;
        Double.isNaN(d42);
        Double.isNaN(d42);
        float f42 = lVar.f2025b;
        double d52 = this.f1999c;
        Double.isNaN(d52);
        Double.isNaN(d52);
        double d62 = lVar.f2028e;
        Double.isNaN(d62);
        Double.isNaN(d62);
        double d72 = 1.0d / d62;
        double d82 = lVar.f2034k;
        Double.isNaN(d82);
        Double.isNaN(d82);
        float pow32 = f42 * ((float) Math.pow(d52 / 100.0d, d72 / d82));
        float cos3 = ((float) (Math.cos(2.0d + d42) + 3.8d)) * 0.25f * 3846.1538f * lVar.f2029f * lVar.f2027d;
        float f52 = pow32 / lVar.f2026c;
        float sin2 = (float) Math.sin(d42);
        float cos22 = (float) Math.cos(d42);
        float f62 = (((0.305f + f52) * 23.0f) * pow22) / (((pow22 * 108.0f) * sin2) + (((11.0f * pow22) * cos22) + (cos3 * 23.0f)));
        float f72 = cos22 * f62;
        float f82 = f62 * sin2;
        float f92 = f52 * 460.0f;
        float f102 = ((288.0f * f82) + ((451.0f * f72) + f92)) / 1403.0f;
        float f112 = ((f92 - (891.0f * f72)) - (261.0f * f82)) / 1403.0f;
        float f122 = ((f92 - (f72 * 220.0f)) - (f82 * 6300.0f)) / 1403.0f;
        double abs7 = Math.abs(f102);
        Double.isNaN(abs7);
        Double.isNaN(abs7);
        double abs22 = Math.abs(f102);
        Double.isNaN(abs22);
        Double.isNaN(abs22);
        float signum4 = (100.0f / lVar.f2032i) * Math.signum(f102) * ((float) Math.pow((float) Math.max(0.0d, (abs7 * 27.13d) / (400.0d - abs22)), 2.380952380952381d));
        double abs32 = Math.abs(f112);
        Double.isNaN(abs32);
        Double.isNaN(abs32);
        double abs42 = Math.abs(f112);
        Double.isNaN(abs42);
        Double.isNaN(abs42);
        float signum22 = (100.0f / lVar.f2032i) * Math.signum(f112) * ((float) Math.pow((float) Math.max(0.0d, (abs32 * 27.13d) / (400.0d - abs42)), 2.380952380952381d));
        double abs52 = Math.abs(f122);
        Double.isNaN(abs52);
        Double.isNaN(abs52);
        double abs62 = Math.abs(f122);
        Double.isNaN(abs62);
        Double.isNaN(abs62);
        float signum32 = Math.signum(f122);
        float[] fArr3 = lVar.f2031h;
        float f132 = signum4 / fArr3[0];
        float f142 = signum22 / fArr3[1];
        float pow42 = (((100.0f / lVar.f2032i) * signum32) * ((float) Math.pow((float) Math.max(0.0d, (abs52 * 27.13d) / (400.0d - abs62)), 2.380952380952381d))) / fArr3[2];
        float[][] fArr22 = b.f2003b;
        float f152 = (fArr22[0][2] * pow42) + (fArr22[0][1] * f142) + (fArr22[0][0] * f132);
        float f162 = (fArr22[1][2] * pow42) + (fArr22[1][1] * f142) + (fArr22[1][0] * f132);
        float f172 = f132 * fArr22[2][0];
        return c.i.e.b.a(f152, f162, (pow42 * fArr22[2][2]) + (f142 * fArr22[2][1]) + f172);
    }
}
