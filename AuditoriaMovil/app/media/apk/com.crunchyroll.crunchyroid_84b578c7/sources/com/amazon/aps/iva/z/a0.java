package com.amazon.aps.iva.z;
/* compiled from: FloatAnimationSpec.kt */
/* loaded from: classes.dex */
public interface a0 extends j<Float> {
    default float b(float f, float f2, float f3) {
        return d(e(f, f2, f3), f, f2, f3);
    }

    float c(long j, float f, float f2, float f3);

    float d(long j, float f, float f2, float f3);

    long e(float f, float f2, float f3);

    @Override // com.amazon.aps.iva.z.j
    default <V extends p> u1<V> a(l1<Float, V> l1Var) {
        com.amazon.aps.iva.yb0.j.f(l1Var, "converter");
        return new u1<>(this);
    }
}
