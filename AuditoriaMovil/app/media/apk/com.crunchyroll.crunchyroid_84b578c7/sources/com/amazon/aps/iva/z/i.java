package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/* compiled from: AnimationState.kt */
/* loaded from: classes.dex */
public final class i<T, V extends p> {
    public final l1<T, V> a;
    public final T b;
    public final long c;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> d;
    public final com.amazon.aps.iva.o0.y1 e;
    public V f;
    public long g;
    public long h;
    public final com.amazon.aps.iva.o0.y1 i;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Object obj, l1 l1Var, p pVar, long j, Object obj2, long j2, com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(l1Var, "typeConverter");
        com.amazon.aps.iva.yb0.j.f(pVar, "initialVelocityVector");
        this.a = l1Var;
        this.b = obj2;
        this.c = j2;
        this.d = aVar;
        this.e = com.amazon.aps.iva.cq.b.c0(obj);
        this.f = (V) com.amazon.aps.iva.e.z.n(pVar);
        this.g = j;
        this.h = Long.MIN_VALUE;
        this.i = com.amazon.aps.iva.cq.b.c0(Boolean.TRUE);
    }

    public final T a() {
        return this.e.getValue();
    }
}
