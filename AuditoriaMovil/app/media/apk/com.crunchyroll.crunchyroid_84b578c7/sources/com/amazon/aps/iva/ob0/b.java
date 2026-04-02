package com.amazon.aps.iva.ob0;

import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.ob0.g.b;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes4.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {
    public final l<g.b, E> b;
    public final g.c<?> c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.g$b, ? extends E extends B>, com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.g$b, E extends B>, java.lang.Object] */
    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        j.f(cVar, "baseKey");
        j.f(lVar, "safeCast");
        this.b = lVar;
        this.c = cVar instanceof b ? (g.c<B>) ((b) cVar).c : cVar;
    }
}
