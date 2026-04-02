package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class y1<V extends p> implements t1<V> {
    public final /* synthetic */ u1<V> a;

    public y1(float f, float f2, V v) {
        q q1Var;
        if (v != null) {
            q1Var = new p1(f, f2, v);
        } else {
            q1Var = new q1(f, f2);
        }
        this.a = new u1<>(q1Var);
    }

    @Override // com.amazon.aps.iva.z.t1, com.amazon.aps.iva.z.o1
    public final boolean a() {
        this.a.getClass();
        return false;
    }

    @Override // com.amazon.aps.iva.z.o1
    public final long b(V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        return this.a.b(v, v2, v3);
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V e(long j, V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        return this.a.e(j, v, v2, v3);
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V f(long j, V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        return this.a.f(j, v, v2, v3);
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V g(V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        return this.a.g(v, v2, v3);
    }
}
