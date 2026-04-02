package com.amazon.aps.iva.o0;
/* compiled from: ProduceState.kt */
/* loaded from: classes.dex */
public final class f2<T> implements e2<T>, q1<T> {
    public final com.amazon.aps.iva.ob0.g b;
    public final /* synthetic */ q1<T> c;

    public f2(q1<T> q1Var, com.amazon.aps.iva.ob0.g gVar) {
        com.amazon.aps.iva.yb0.j.f(q1Var, "state");
        com.amazon.aps.iva.yb0.j.f(gVar, "coroutineContext");
        this.b = gVar;
        this.c = q1Var;
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.o0.p3
    public final T getValue() {
        return this.c.getValue();
    }

    @Override // com.amazon.aps.iva.o0.q1
    public final void setValue(T t) {
        this.c.setValue(t);
    }
}
