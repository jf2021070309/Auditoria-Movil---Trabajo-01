package com.amazon.aps.iva.y;

import com.amazon.aps.iva.y.y0;
/* compiled from: SplineBasedFloatDecayAnimationSpec.kt */
/* loaded from: classes.dex */
public final class i1 implements com.amazon.aps.iva.z.b0 {
    public final y0 a;

    public i1(com.amazon.aps.iva.o2.c cVar) {
        this.a = new y0(j1.a, cVar);
    }

    @Override // com.amazon.aps.iva.z.b0
    public final float b(float f, long j) {
        float f2;
        long j2 = j / 1000000;
        y0.a a = this.a.a(f);
        long j3 = a.c;
        if (j3 > 0) {
            f2 = ((float) j2) / ((float) j3);
        } else {
            f2 = 1.0f;
        }
        return (((Math.signum(a.a) * a.a(f2).b) * a.b) / ((float) j3)) * 1000.0f;
    }

    @Override // com.amazon.aps.iva.z.b0
    public final float c(float f, float f2, long j) {
        float f3;
        long j2 = j / 1000000;
        y0.a a = this.a.a(f2);
        long j3 = a.c;
        if (j3 > 0) {
            f3 = ((float) j2) / ((float) j3);
        } else {
            f3 = 1.0f;
        }
        return (Math.signum(a.a) * a.b * a.a(f3).a) + f;
    }

    @Override // com.amazon.aps.iva.z.b0
    public final long d(float f) {
        return ((long) (Math.exp(this.a.b(f) / (z0.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // com.amazon.aps.iva.z.b0
    public final float e(float f, float f2) {
        y0 y0Var;
        double b = this.a.b(f2);
        double d = z0.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * b) * y0Var.a * y0Var.c))) + f;
    }

    @Override // com.amazon.aps.iva.z.b0
    public final void a() {
    }
}
