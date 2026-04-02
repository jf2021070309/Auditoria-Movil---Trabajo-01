package com.amazon.aps.iva.p4;

import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.r4.y0;
/* compiled from: Background.kt */
/* loaded from: classes.dex */
public final class c implements n.c {
    public final com.amazon.aps.iva.b5.a b = null;
    public final r c;
    public final int d;

    public c(a aVar, int i) {
        this.c = aVar;
        this.d = i;
        if (true) {
            return;
        }
        throw new IllegalArgumentException("Exactly one of colorProvider and imageProvider must be non-null".toString());
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
    public final n d(n nVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "other");
        return n.b.a(this, nVar);
    }

    public final String toString() {
        return "BackgroundModifier(colorProvider=" + this.b + ", imageProvider=" + this.c + ", contentScale=" + ((Object) com.amazon.aps.iva.y4.f.a(this.d)) + ')';
    }
}
