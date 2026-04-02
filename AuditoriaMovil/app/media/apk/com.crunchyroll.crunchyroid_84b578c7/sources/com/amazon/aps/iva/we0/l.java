package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.ob0.g;
/* compiled from: SafeCollector.kt */
/* loaded from: classes4.dex */
public final class l implements com.amazon.aps.iva.ob0.g {
    public final Throwable b;
    public final /* synthetic */ com.amazon.aps.iva.ob0.g c;

    public l(com.amazon.aps.iva.ob0.g gVar, Throwable th) {
        this.b = th;
        this.c = gVar;
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <R> R fold(R r, com.amazon.aps.iva.xb0.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) this.c.fold(r, pVar);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <E extends g.b> E get(g.c<E> cVar) {
        return (E) this.c.get(cVar);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final com.amazon.aps.iva.ob0.g minusKey(g.c<?> cVar) {
        return this.c.minusKey(cVar);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final com.amazon.aps.iva.ob0.g plus(com.amazon.aps.iva.ob0.g gVar) {
        return this.c.plus(gVar);
    }
}
