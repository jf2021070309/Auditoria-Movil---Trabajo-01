package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public final class z1<V extends p> implements s1<V> {
    public final int a;
    public final int b;
    public final x c;
    public final u1<V> d;

    public z1(int i, int i2, x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "easing");
        this.a = i;
        this.b = i2;
        this.c = xVar;
        this.d = new u1<>(new d0(i, i2, xVar));
    }

    @Override // com.amazon.aps.iva.z.s1
    public final int c() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.z.s1
    public final int d() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V e(long j, V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        return this.d.e(j, v, v2, v3);
    }

    @Override // com.amazon.aps.iva.z.o1
    public final V f(long j, V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        return this.d.f(j, v, v2, v3);
    }
}
