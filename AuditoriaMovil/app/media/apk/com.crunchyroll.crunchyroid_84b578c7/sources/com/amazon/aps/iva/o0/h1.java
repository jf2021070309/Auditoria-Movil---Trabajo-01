package com.amazon.aps.iva.o0;
/* compiled from: ValueHolders.kt */
/* loaded from: classes.dex */
public final class h1<T> implements p3<T> {
    public final com.amazon.aps.iva.kb0.m b;

    public h1(com.amazon.aps.iva.xb0.a<? extends T> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "valueProducer");
        this.b = com.amazon.aps.iva.kb0.f.b(aVar);
    }

    @Override // com.amazon.aps.iva.o0.p3
    public final T getValue() {
        return (T) this.b.getValue();
    }
}
