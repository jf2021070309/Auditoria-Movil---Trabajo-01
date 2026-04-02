package com.amazon.aps.iva.mt;

import com.amazon.aps.iva.ws.d;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: ContinueWatchingCardClickHandler.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ws.d a;
    public final com.amazon.aps.iva.k50.n b;

    public b(com.amazon.aps.iva.ws.d dVar, com.amazon.aps.iva.k50.n nVar) {
        this.a = dVar;
        this.b = nVar;
    }

    @Override // com.amazon.aps.iva.mt.a
    public final void a(com.amazon.aps.iva.yx.g gVar, com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.jt.a aVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "model");
        com.amazon.aps.iva.yb0.j.f(bVar, "analyticsView");
        long z = com.amazon.aps.iva.gr.n.z(gVar.b);
        boolean z2 = gVar.c;
        com.amazon.aps.iva.k50.n nVar = this.b;
        Panel panel = gVar.a;
        nVar.c(z, panel, z2);
        d.b.a(this.a, gVar.a, aVar, null, null, null, 28);
        this.a.g(panel, bVar);
    }
}
