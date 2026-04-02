package com.amazon.aps.iva.cv;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: CrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar) {
        super(1);
        this.h = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "panel");
        p pVar = this.h;
        if (pVar.getView().Hc()) {
            pVar.getView().a1();
        }
        pVar.getView().showSnackbar(new com.amazon.aps.iva.yu.a(new String[]{panel2.getTitle()}, 1));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
