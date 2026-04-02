package com.amazon.aps.iva.i20;

import com.amazon.aps.iva.es.y;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ManageMembershipAnalytics.kt */
/* loaded from: classes2.dex */
public final class h implements g {
    public final com.amazon.aps.iva.ls.a a;
    public final com.amazon.aps.iva.ds.a b;
    public final com.amazon.aps.iva.vw.a c;

    public h(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.vw.a aVar2) {
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.a = aVar;
        this.b = cVar;
        this.c = aVar2;
    }

    @Override // com.amazon.aps.iva.i20.g
    public final void a(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.ks.a c = a.C0456a.c(this.a, bVar);
        com.amazon.aps.iva.vw.a aVar = this.c;
        if (aVar != null) {
            gVar = aVar.y();
        } else {
            gVar = null;
        }
        this.b.e(new y(c, gVar));
    }

    @Override // com.amazon.aps.iva.i20.g
    public final void b(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.ks.g gVar;
        j.f(bVar, "analyticsClickedView");
        com.amazon.aps.iva.ks.a c = a.C0456a.c(this.a, bVar);
        com.amazon.aps.iva.vw.a aVar = this.c;
        if (aVar != null) {
            gVar = aVar.y();
        } else {
            gVar = null;
        }
        this.b.e(new y(c, gVar, 4));
    }
}
