package com.amazon.aps.iva.x50;
/* compiled from: Debouncer.kt */
/* loaded from: classes2.dex */
public abstract class l<T> implements k<T> {
    public final long b;
    public final m c;
    public final com.amazon.aps.iva.e.h d = new com.amazon.aps.iva.e.h(this, 9);
    public T e;

    public l(long j, m mVar) {
        this.b = j;
        this.c = mVar;
    }

    @Override // com.amazon.aps.iva.x50.k
    public final void cancel() {
        this.c.c(this.d);
    }

    @Override // com.amazon.aps.iva.x50.k
    public final void setValue(T t) {
        this.e = t;
        m mVar = this.c;
        com.amazon.aps.iva.e.h hVar = this.d;
        mVar.c(hVar);
        mVar.d(hVar, this.b);
    }
}
