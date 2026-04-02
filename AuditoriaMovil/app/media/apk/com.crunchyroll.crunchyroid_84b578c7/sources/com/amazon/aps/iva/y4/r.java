package com.amazon.aps.iva.y4;

import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.r4.y0;
/* compiled from: SizeModifiers.kt */
/* loaded from: classes.dex */
public final class r implements n.c {
    public final com.amazon.aps.iva.b5.c b;

    public r(com.amazon.aps.iva.b5.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "width");
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.p4.n
    public final <R> R a(R r, com.amazon.aps.iva.xb0.p<? super R, ? super n.c, ? extends R> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "operation");
        return pVar.invoke(r, this);
    }

    @Override // com.amazon.aps.iva.p4.n
    public final boolean b(y0.c cVar) {
        return n.c.a.a(this, cVar);
    }

    @Override // com.amazon.aps.iva.p4.n
    public final boolean c(com.amazon.aps.iva.xb0.l<? super n.c, Boolean> lVar) {
        return n.c.a.b(this, lVar);
    }

    @Override // com.amazon.aps.iva.p4.n
    public final com.amazon.aps.iva.p4.n d(com.amazon.aps.iva.p4.n nVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "other");
        return n.b.a(this, nVar);
    }
}
