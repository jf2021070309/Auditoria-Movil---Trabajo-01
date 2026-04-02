package com.amazon.aps.iva.f60;

import com.ellation.crunchyroll.model.Panel;
/* compiled from: CardWatchlistItemTogglePresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
        k view;
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "panel");
        h hVar = this.h;
        hVar.c.a(panel2);
        view = hVar.getView();
        view.showSnackbar(n.b);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
