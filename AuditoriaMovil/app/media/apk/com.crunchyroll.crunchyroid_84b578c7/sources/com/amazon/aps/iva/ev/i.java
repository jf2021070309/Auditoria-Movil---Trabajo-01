package com.amazon.aps.iva.ev;

import com.amazon.aps.iva.dv.m;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ev.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: CrunchylistShowOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.n70.d<com.amazon.aps.iva.dv.a> {
    public final l<com.amazon.aps.iva.dv.g, q> a;
    public final l<com.amazon.aps.iva.dv.g, q> b;
    public final l<com.amazon.aps.iva.dv.a, q> c;

    public i(com.amazon.aps.iva.cv.g gVar, com.amazon.aps.iva.cv.h hVar, com.amazon.aps.iva.cv.i iVar) {
        this.a = gVar;
        this.b = hVar;
        this.c = iVar;
    }

    @Override // com.amazon.aps.iva.n70.d
    public final List a(com.amazon.aps.iva.dv.a aVar) {
        com.amazon.aps.iva.dv.a aVar2 = aVar;
        j.f(aVar2, "data");
        if (aVar2 instanceof com.amazon.aps.iva.dv.g) {
            return f1.K(new com.amazon.aps.iva.n70.b(b.d.e, new c(this, aVar2)), new com.amazon.aps.iva.n70.b(b.C0232b.e, new d(this, aVar2)), new com.amazon.aps.iva.n70.b(b.a.e, new e(this, aVar2)));
        }
        if (aVar2 instanceof m) {
            return f1.K(new com.amazon.aps.iva.n70.b(b.e.e, f.h), new com.amazon.aps.iva.n70.b(b.c.e, g.h), new com.amazon.aps.iva.n70.b(b.a.e, new h(this, aVar2)));
        }
        return z.b;
    }
}
