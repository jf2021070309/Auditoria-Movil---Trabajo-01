package com.amazon.aps.iva.z;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.z.p;
/* compiled from: AnimationState.kt */
/* loaded from: classes.dex */
public final class l<T, V extends p> implements p3<T> {
    public final l1<T, V> b;
    public final com.amazon.aps.iva.o0.y1 c;
    public V d;
    public long e;
    public long f;
    public boolean g;

    public /* synthetic */ l(l1 l1Var, Object obj, p pVar, int i) {
        this(l1Var, obj, (i & 4) != 0 ? null : pVar, (i & 8) != 0 ? Long.MIN_VALUE : 0L, (i & 16) != 0 ? Long.MIN_VALUE : 0L, false);
    }

    @Override // com.amazon.aps.iva.o0.p3
    public final T getValue() {
        return this.c.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + this.b.b().invoke(this.d) + ", isRunning=" + this.g + ", lastFrameTimeNanos=" + this.e + ", finishedTimeNanos=" + this.f + ')';
    }

    public l(l1<T, V> l1Var, T t, V v, long j, long j2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(l1Var, "typeConverter");
        this.b = l1Var;
        this.c = com.amazon.aps.iva.cq.b.c0(t);
        this.d = v != null ? (V) com.amazon.aps.iva.e.z.n(v) : (V) com.amazon.aps.iva.cq.b.J(l1Var, t);
        this.e = j;
        this.f = j2;
        this.g = z;
    }
}
