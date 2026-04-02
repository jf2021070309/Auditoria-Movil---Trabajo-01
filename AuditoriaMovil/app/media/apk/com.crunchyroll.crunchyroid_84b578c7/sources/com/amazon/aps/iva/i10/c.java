package com.amazon.aps.iva.i10;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: DownloadsFragment.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Panel, q> {
    public c(com.amazon.aps.iva.gn.c cVar) {
        super(1, cVar, com.amazon.aps.iva.gn.c.class, "onPanelShare", "onPanelShare(Lcom/ellation/crunchyroll/model/Panel;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "p0");
        ((com.amazon.aps.iva.gn.c) this.receiver).V(panel2);
        return q.a;
    }
}
