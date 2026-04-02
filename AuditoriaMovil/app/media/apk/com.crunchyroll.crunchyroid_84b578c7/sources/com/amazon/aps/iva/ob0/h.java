package com.amazon.aps.iva.ob0;

import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes4.dex */
public final class h implements g, Serializable {
    public static final h b = new h();

    @Override // com.amazon.aps.iva.ob0.g
    public final <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return r;
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <E extends g.b> E get(g.c<E> cVar) {
        j.f(cVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final g minusKey(g.c<?> cVar) {
        j.f(cVar, "key");
        return this;
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final g plus(g gVar) {
        j.f(gVar, "context");
        return gVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
