package com.amazon.aps.iva.n10;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: GenreFragment.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class k extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.q<Panel, com.amazon.aps.iva.nt.o, com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> {
    public k(com.amazon.aps.iva.f60.e eVar) {
        super(3, eVar, com.amazon.aps.iva.f60.e.class, "onToggle", "onToggle(Lcom/ellation/crunchyroll/model/Panel;Lcom/ellation/crunchyroll/cards/overflow/WatchlistToggleMenuItem;Lcom/ellation/analytics/helpers/AnalyticsClickedView;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel, com.amazon.aps.iva.nt.o oVar, com.amazon.aps.iva.fs.b bVar) {
        Panel panel2 = panel;
        com.amazon.aps.iva.nt.o oVar2 = oVar;
        com.amazon.aps.iva.fs.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(panel2, "p0");
        com.amazon.aps.iva.yb0.j.f(oVar2, "p1");
        com.amazon.aps.iva.yb0.j.f(bVar2, "p2");
        ((com.amazon.aps.iva.f60.e) this.receiver).o1(panel2, oVar2, bVar2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
