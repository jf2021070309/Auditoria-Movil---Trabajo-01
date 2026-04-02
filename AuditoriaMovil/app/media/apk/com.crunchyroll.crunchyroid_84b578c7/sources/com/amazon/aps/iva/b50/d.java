package com.amazon.aps.iva.b50;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.jt.a;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.watchlist.a;
/* compiled from: WatchlistAnalytics.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.us.f implements b {
    public final com.amazon.aps.iva.ds.a g;
    public final com.amazon.aps.iva.ws.d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.ws.f fVar, a.p pVar, com.amazon.aps.iva.xb0.a aVar) {
        super(aVar, pVar, c.h);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.g = cVar;
        this.h = fVar;
    }

    @Override // com.amazon.aps.iva.b50.b
    public final void F(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "e");
        l1.L(this.g, th, new com.amazon.aps.iva.es.w(th.toString(), com.amazon.aps.iva.ls.a.WATCHLIST, null, null, null, 60));
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.g.c(defpackage.i.s(com.amazon.aps.iva.ls.a.WATCHLIST, f, null, null, null, new com.amazon.aps.iva.is.a[0], 28));
    }

    @Override // com.amazon.aps.iva.b50.b
    public final void x(int i, Panel panel, boolean z) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.h.d(panel, a.C0423a.a(com.amazon.aps.iva.js.k.CARD, 0, i, null, null, 32), null, Boolean.valueOf(z), Boolean.TRUE);
    }
}
