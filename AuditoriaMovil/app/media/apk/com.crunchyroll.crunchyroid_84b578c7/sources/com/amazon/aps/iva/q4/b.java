package com.amazon.aps.iva.q4;

import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.r4.y0;
import com.amazon.aps.iva.s4.j;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
/* compiled from: Action.kt */
/* loaded from: classes.dex */
public final class b implements n.c {
    public final a b;

    public b(j jVar) {
        this.b = jVar;
    }

    @Override // com.amazon.aps.iva.p4.n
    public final <R> R a(R r, p<? super R, ? super n.c, ? extends R> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "operation");
        return pVar.invoke(r, this);
    }

    @Override // com.amazon.aps.iva.p4.n
    public final boolean b(y0.c cVar) {
        return n.c.a.a(this, cVar);
    }

    @Override // com.amazon.aps.iva.p4.n
    public final boolean c(l<? super n.c, Boolean> lVar) {
        return n.c.a.b(this, lVar);
    }

    @Override // com.amazon.aps.iva.p4.n
    public final n d(n nVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "other");
        return n.b.a(this, nVar);
    }

    public final String toString() {
        return "ActionModifier(action=" + this.b + ')';
    }
}
