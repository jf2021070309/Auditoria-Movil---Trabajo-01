package com.amazon.aps.iva.z;
/* compiled from: FloatAnimationSpec.kt */
/* loaded from: classes.dex */
public final class d0 implements a0 {
    public final int a;
    public final int b;
    public final x c;

    public d0(int i, int i2, x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "easing");
        this.a = i;
        this.b = i2;
        this.c = xVar;
    }

    @Override // com.amazon.aps.iva.z.a0
    public final float c(long j, float f, float f2, float f3) {
        float f4;
        int i = this.a;
        long k = com.amazon.aps.iva.aq.j.k((j / 1000000) - this.b, i);
        if (i == 0) {
            f4 = 1.0f;
        } else {
            f4 = ((float) k) / i;
        }
        float a = this.c.a(com.amazon.aps.iva.aq.j.i(f4, 0.0f, 1.0f));
        m1 m1Var = n1.a;
        return (f2 * a) + ((1 - a) * f);
    }

    @Override // com.amazon.aps.iva.z.a0
    public final float d(long j, float f, float f2, float f3) {
        long k = com.amazon.aps.iva.aq.j.k((j / 1000000) - this.b, this.a);
        int i = (k > 0L ? 1 : (k == 0L ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        if (i == 0) {
            return f3;
        }
        return (c(k * 1000000, f, f2, f3) - c((k - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // com.amazon.aps.iva.z.a0
    public final long e(float f, float f2, float f3) {
        return (this.b + this.a) * 1000000;
    }
}
