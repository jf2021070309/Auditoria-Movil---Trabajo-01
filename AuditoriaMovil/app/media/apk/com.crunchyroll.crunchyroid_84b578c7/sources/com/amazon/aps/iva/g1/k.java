package com.amazon.aps.iva.g1;
/* compiled from: Lab.kt */
/* loaded from: classes.dex */
public final class k extends c {
    public k() {
        super(15, b.c, "Generic L*a*b*");
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float[] a(float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4 = fArr[0];
        float[] fArr2 = com.amazon.aps.iva.aq.k.f;
        float f5 = f4 / fArr2[0];
        float f6 = fArr[1] / fArr2[1];
        float f7 = fArr[2] / fArr2[2];
        if (f5 > 0.008856452f) {
            f = (float) Math.pow(f5, 0.33333334f);
        } else {
            f = (f5 * 7.787037f) + 0.13793103f;
        }
        if (f6 > 0.008856452f) {
            f2 = (float) Math.pow(f6, 0.33333334f);
        } else {
            f2 = (f6 * 7.787037f) + 0.13793103f;
        }
        if (f7 > 0.008856452f) {
            f3 = (float) Math.pow(f7, 0.33333334f);
        } else {
            f3 = (f7 * 7.787037f) + 0.13793103f;
        }
        fArr[0] = com.amazon.aps.iva.aq.j.i((116.0f * f2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = com.amazon.aps.iva.aq.j.i((f - f2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = com.amazon.aps.iva.aq.j.i((f2 - f3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float b(int i) {
        if (i == 0) {
            return 100.0f;
        }
        return 128.0f;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float c(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return -128.0f;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final long e(float f, float f2, float f3) {
        float f4;
        float f5;
        float i = (com.amazon.aps.iva.aq.j.i(f, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float i2 = (com.amazon.aps.iva.aq.j.i(f, -128.0f, 128.0f) * 0.002f) + i;
        if (i2 > 0.20689656f) {
            f4 = i2 * i2 * i2;
        } else {
            f4 = (i2 - 0.13793103f) * 0.12841855f;
        }
        if (i > 0.20689656f) {
            f5 = i * i * i;
        } else {
            f5 = (i - 0.13793103f) * 0.12841855f;
        }
        float[] fArr = com.amazon.aps.iva.aq.k.f;
        return (Float.floatToIntBits(f4 * fArr[0]) << 32) | (Float.floatToIntBits(f5 * fArr[1]) & 4294967295L);
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float[] f(float[] fArr) {
        float f;
        float f2;
        float f3;
        fArr[0] = com.amazon.aps.iva.aq.j.i(fArr[0], 0.0f, 100.0f);
        fArr[1] = com.amazon.aps.iva.aq.j.i(fArr[1], -128.0f, 128.0f);
        float i = com.amazon.aps.iva.aq.j.i(fArr[2], -128.0f, 128.0f);
        fArr[2] = i;
        float f4 = (fArr[0] + 16.0f) / 116.0f;
        float f5 = (fArr[1] * 0.002f) + f4;
        float f6 = f4 - (i * 0.005f);
        if (f5 > 0.20689656f) {
            f = f5 * f5 * f5;
        } else {
            f = (f5 - 0.13793103f) * 0.12841855f;
        }
        if (f4 > 0.20689656f) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = (f4 - 0.13793103f) * 0.12841855f;
        }
        if (f6 > 0.20689656f) {
            f3 = f6 * f6 * f6;
        } else {
            f3 = (f6 - 0.13793103f) * 0.12841855f;
        }
        float[] fArr2 = com.amazon.aps.iva.aq.k.f;
        fArr[0] = f * fArr2[0];
        fArr[1] = f2 * fArr2[1];
        fArr[2] = f3 * fArr2[2];
        return fArr;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float g(float f, float f2, float f3) {
        float f4;
        float i = ((com.amazon.aps.iva.aq.j.i(f, 0.0f, 100.0f) + 16.0f) / 116.0f) - (com.amazon.aps.iva.aq.j.i(f3, -128.0f, 128.0f) * 0.005f);
        if (i > 0.20689656f) {
            f4 = i * i * i;
        } else {
            f4 = 0.12841855f * (i - 0.13793103f);
        }
        return f4 * com.amazon.aps.iva.aq.k.f[2];
    }

    @Override // com.amazon.aps.iva.g1.c
    public final long h(float f, float f2, float f3, float f4, c cVar) {
        float f5;
        float f6;
        float f7;
        com.amazon.aps.iva.yb0.j.f(cVar, "colorSpace");
        float[] fArr = com.amazon.aps.iva.aq.k.f;
        float f8 = f / fArr[0];
        float f9 = f2 / fArr[1];
        float f10 = f3 / fArr[2];
        if (f8 > 0.008856452f) {
            f5 = (float) Math.pow(f8, 0.33333334f);
        } else {
            f5 = (f8 * 7.787037f) + 0.13793103f;
        }
        if (f9 > 0.008856452f) {
            f6 = (float) Math.pow(f9, 0.33333334f);
        } else {
            f6 = (f9 * 7.787037f) + 0.13793103f;
        }
        if (f10 > 0.008856452f) {
            f7 = (float) Math.pow(f10, 0.33333334f);
        } else {
            f7 = (f10 * 7.787037f) + 0.13793103f;
        }
        return defpackage.i.b(com.amazon.aps.iva.aq.j.i((116.0f * f6) - 16.0f, 0.0f, 100.0f), com.amazon.aps.iva.aq.j.i((f5 - f6) * 500.0f, -128.0f, 128.0f), com.amazon.aps.iva.aq.j.i((f6 - f7) * 200.0f, -128.0f, 128.0f), f4, cVar);
    }
}
