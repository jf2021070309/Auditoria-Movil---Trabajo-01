package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.ob0.g;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes4.dex */
public final class m2 implements g.b, g.c<m2> {
    public static final m2 b = new m2();

    @Override // com.amazon.aps.iva.ob0.g
    public final <R> R fold(R r, com.amazon.aps.iva.xb0.p<? super R, ? super g.b, ? extends R> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "operation");
        return pVar.invoke(r, this);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.a(this, cVar);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final com.amazon.aps.iva.ob0.g minusKey(g.c<?> cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final com.amazon.aps.iva.ob0.g plus(com.amazon.aps.iva.ob0.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "context");
        return g.a.a(this, gVar);
    }

    @Override // com.amazon.aps.iva.ob0.g.b
    public final g.c<?> getKey() {
        return this;
    }
}
