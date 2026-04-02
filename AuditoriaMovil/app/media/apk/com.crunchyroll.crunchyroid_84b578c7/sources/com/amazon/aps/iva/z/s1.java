package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public interface s1<V extends p> extends t1<V> {
    @Override // com.amazon.aps.iva.z.o1
    default long b(V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        com.amazon.aps.iva.yb0.j.f(v3, "initialVelocity");
        return (d() + c()) * 1000000;
    }

    int c();

    int d();
}
