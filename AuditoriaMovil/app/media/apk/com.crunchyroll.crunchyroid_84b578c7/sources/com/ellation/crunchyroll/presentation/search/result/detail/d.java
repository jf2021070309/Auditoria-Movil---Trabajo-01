package com.ellation.crunchyroll.presentation.search.result.detail;

import com.amazon.aps.iva.nt.o;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SearchResultDetailActivity.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class d extends com.amazon.aps.iva.yb0.i implements q<Panel, o, com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> {
    public d(com.amazon.aps.iva.f60.e eVar) {
        super(3, eVar, com.amazon.aps.iva.f60.e.class, "onToggle", "onToggle(Lcom/ellation/crunchyroll/model/Panel;Lcom/ellation/crunchyroll/cards/overflow/WatchlistToggleMenuItem;Lcom/ellation/analytics/helpers/AnalyticsClickedView;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel, o oVar, com.amazon.aps.iva.fs.b bVar) {
        Panel panel2 = panel;
        o oVar2 = oVar;
        com.amazon.aps.iva.fs.b bVar2 = bVar;
        j.f(panel2, "p0");
        j.f(oVar2, "p1");
        j.f(bVar2, "p2");
        ((com.amazon.aps.iva.f60.e) this.receiver).o1(panel2, oVar2, bVar2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
