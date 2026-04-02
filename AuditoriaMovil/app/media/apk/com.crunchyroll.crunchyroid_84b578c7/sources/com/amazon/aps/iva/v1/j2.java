package com.amazon.aps.iva.v1;
/* compiled from: ShapeContainingUtil.kt */
/* loaded from: classes.dex */
public final class j2 {
    public static final boolean a(com.amazon.aps.iva.f1.m0 m0Var, float f, float f2) {
        com.amazon.aps.iva.e1.e eVar = new com.amazon.aps.iva.e1.e(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        com.amazon.aps.iva.f1.m j = com.amazon.aps.iva.cq.b.j();
        j.p(eVar);
        com.amazon.aps.iva.f1.m j2 = com.amazon.aps.iva.cq.b.j();
        j2.k(m0Var, j, 1);
        boolean q = j2.q();
        j2.reset();
        j.reset();
        return !q;
    }

    public static final boolean b(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = com.amazon.aps.iva.e1.a.b(j);
        float c = com.amazon.aps.iva.e1.a.c(j);
        if (((f6 * f6) / (c * c)) + ((f5 * f5) / (b * b)) <= 1.0f) {
            return true;
        }
        return false;
    }
}
