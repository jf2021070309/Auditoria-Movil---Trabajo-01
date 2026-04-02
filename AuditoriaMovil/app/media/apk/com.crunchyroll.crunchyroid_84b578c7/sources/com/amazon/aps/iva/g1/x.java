package com.amazon.aps.iva.g1;
/* compiled from: Xyz.kt */
/* loaded from: classes.dex */
public final class x extends c {
    public x() {
        super(14, b.b, "Generic XYZ");
    }

    public static float i(float f) {
        return com.amazon.aps.iva.aq.j.i(f, -2.0f, 2.0f);
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float[] a(float[] fArr) {
        fArr[0] = i(fArr[0]);
        fArr[1] = i(fArr[1]);
        fArr[2] = i(fArr[2]);
        return fArr;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float b(int i) {
        return 2.0f;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float c(int i) {
        return -2.0f;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final long e(float f, float f2, float f3) {
        float i = i(f);
        float i2 = i(f2);
        return (Float.floatToIntBits(i2) & 4294967295L) | (Float.floatToIntBits(i) << 32);
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float[] f(float[] fArr) {
        fArr[0] = i(fArr[0]);
        fArr[1] = i(fArr[1]);
        fArr[2] = i(fArr[2]);
        return fArr;
    }

    @Override // com.amazon.aps.iva.g1.c
    public final float g(float f, float f2, float f3) {
        return i(f3);
    }

    @Override // com.amazon.aps.iva.g1.c
    public final long h(float f, float f2, float f3, float f4, c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "colorSpace");
        return defpackage.i.b(i(f), i(f2), i(f3), f4, cVar);
    }
}
