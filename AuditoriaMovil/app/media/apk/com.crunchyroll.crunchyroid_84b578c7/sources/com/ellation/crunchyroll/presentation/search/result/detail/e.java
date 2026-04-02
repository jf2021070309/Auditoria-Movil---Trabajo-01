package com.ellation.crunchyroll.presentation.search.result.detail;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: SearchResultDetailActivity.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class e extends com.amazon.aps.iva.yb0.i implements l<Panel, q> {
    public e(com.amazon.aps.iva.gn.d dVar) {
        super(1, dVar, com.amazon.aps.iva.gn.c.class, "onPanelShare", "onPanelShare(Lcom/ellation/crunchyroll/model/Panel;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Panel panel) {
        Panel panel2 = panel;
        j.f(panel2, "p0");
        ((com.amazon.aps.iva.gn.c) this.receiver).V(panel2);
        return q.a;
    }
}
