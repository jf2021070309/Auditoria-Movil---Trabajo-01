package com.amazon.aps.iva.ob0;

import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes4.dex */
public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> cVar) {
        j.f(cVar, "key");
        this.key = cVar;
    }

    @Override // com.amazon.aps.iva.ob0.g
    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(r, this);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.a(this, cVar);
    }

    @Override // com.amazon.aps.iva.ob0.g.b
    public g.c<?> getKey() {
        return this.key;
    }

    @Override // com.amazon.aps.iva.ob0.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public g plus(g gVar) {
        j.f(gVar, "context");
        return g.a.a(this, gVar);
    }
}
