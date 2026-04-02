package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.ks.n;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.simulcast.SimulcastSeason;
import com.ellation.crunchyroll.presentation.simulcast.SimulcastFragment;
/* compiled from: SimulcastAnalytics.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.us.f implements n {
    public final com.amazon.aps.iva.ws.d g;
    public final com.amazon.aps.iva.ds.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.amazon.aps.iva.ws.f fVar, com.amazon.aps.iva.xb0.a aVar, SimulcastFragment.g gVar) {
        super(aVar, gVar, o.h);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.g = fVar;
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.w40.n
    public final void N(Panel panel, int i, SimulcastSeason simulcastSeason) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.g.b(new com.amazon.aps.iva.ws.e(0, i, com.amazon.aps.iva.js.v.SIMULCAST, com.amazon.aps.iva.js.t.GRID, new n.c(com.amazon.aps.iva.e.w.w(panel), simulcastSeason.getId())));
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.h.c(defpackage.i.s(com.amazon.aps.iva.ls.a.SIMULCAST, f, null, null, null, new com.amazon.aps.iva.is.a[0], 28));
    }
}
