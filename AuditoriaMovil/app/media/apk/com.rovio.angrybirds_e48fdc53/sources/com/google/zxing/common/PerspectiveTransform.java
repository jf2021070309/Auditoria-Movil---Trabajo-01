package com.google.zxing.common;
/* loaded from: classes2.dex */
public final class PerspectiveTransform {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    private PerspectiveTransform(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f4;
        this.c = f7;
        this.d = f2;
        this.e = f5;
        this.f = f8;
        this.g = f3;
        this.h = f6;
        this.i = f9;
    }

    public static PerspectiveTransform quadrilateralToQuadrilateral(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return squareToQuadrilateral(f9, f10, f11, f12, f13, f14, f15, f16).a(quadrilateralToSquare(f, f2, f3, f4, f5, f6, f7, f8));
    }

    public void transformPoints(float[] fArr) {
        int length = fArr.length;
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        float f5 = this.e;
        float f6 = this.f;
        float f7 = this.g;
        float f8 = this.h;
        float f9 = this.i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            float f11 = fArr[i + 1];
            float f12 = (f3 * f10) + (f6 * f11) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i + 1] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }

    public void transformPoints(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            float f2 = fArr2[i];
            float f3 = (this.c * f) + (this.f * f2) + this.i;
            fArr[i] = (((this.a * f) + (this.d * f2)) + this.g) / f3;
            fArr2[i] = (((f * this.b) + (f2 * this.e)) + this.h) / f3;
        }
    }

    public static PerspectiveTransform squareToQuadrilateral(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new PerspectiveTransform(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f10 * f11) - (f9 * f13)) / f15;
        return new PerspectiveTransform((f3 - f) + (f16 * f3), (f7 - f) + (f17 * f7), f, (f16 * f4) + (f4 - f2), (f17 * f8) + (f8 - f2), f2, f16, f17, 1.0f);
    }

    public static PerspectiveTransform quadrilateralToSquare(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return squareToQuadrilateral(f, f2, f3, f4, f5, f6, f7, f8).a();
    }

    PerspectiveTransform a() {
        return new PerspectiveTransform((this.e * this.i) - (this.f * this.h), (this.f * this.g) - (this.d * this.i), (this.d * this.h) - (this.e * this.g), (this.c * this.h) - (this.b * this.i), (this.a * this.i) - (this.c * this.g), (this.b * this.g) - (this.a * this.h), (this.b * this.f) - (this.c * this.e), (this.c * this.d) - (this.a * this.f), (this.a * this.e) - (this.b * this.d));
    }

    PerspectiveTransform a(PerspectiveTransform perspectiveTransform) {
        return new PerspectiveTransform((this.a * perspectiveTransform.a) + (this.d * perspectiveTransform.b) + (this.g * perspectiveTransform.c), (this.a * perspectiveTransform.d) + (this.d * perspectiveTransform.e) + (this.g * perspectiveTransform.f), (this.a * perspectiveTransform.g) + (this.d * perspectiveTransform.h) + (this.g * perspectiveTransform.i), (this.b * perspectiveTransform.a) + (this.e * perspectiveTransform.b) + (this.h * perspectiveTransform.c), (this.b * perspectiveTransform.d) + (this.e * perspectiveTransform.e) + (this.h * perspectiveTransform.f), (this.b * perspectiveTransform.g) + (this.e * perspectiveTransform.h) + (this.h * perspectiveTransform.i), (this.c * perspectiveTransform.a) + (this.f * perspectiveTransform.b) + (this.i * perspectiveTransform.c), (this.c * perspectiveTransform.d) + (this.f * perspectiveTransform.e) + (this.i * perspectiveTransform.f), (this.c * perspectiveTransform.g) + (this.f * perspectiveTransform.h) + (this.i * perspectiveTransform.i));
    }
}
