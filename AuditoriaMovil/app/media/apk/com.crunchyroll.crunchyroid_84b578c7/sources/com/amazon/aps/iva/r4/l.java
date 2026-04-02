package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.b5.c;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.r4.y0;
/* compiled from: CornerRadius.kt */
/* loaded from: classes.dex */
public final class l implements n.c {
    public final com.amazon.aps.iva.b5.c b;

    public l(c.a aVar) {
        this.b = aVar;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && com.amazon.aps.iva.yb0.j.a(this.b, ((l) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.b + ')';
    }
}
