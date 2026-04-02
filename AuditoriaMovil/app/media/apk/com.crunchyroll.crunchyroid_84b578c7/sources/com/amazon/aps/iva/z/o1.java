package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes.dex */
public interface o1<V extends p> {
    boolean a();

    long b(V v, V v2, V v3);

    V e(long j, V v, V v2, V v3);

    V f(long j, V v, V v2, V v3);

    default V g(V v, V v2, V v3) {
        com.amazon.aps.iva.yb0.j.f(v, "initialValue");
        com.amazon.aps.iva.yb0.j.f(v2, "targetValue");
        return f(b(v, v2, v3), v, v2, v3);
    }
}
