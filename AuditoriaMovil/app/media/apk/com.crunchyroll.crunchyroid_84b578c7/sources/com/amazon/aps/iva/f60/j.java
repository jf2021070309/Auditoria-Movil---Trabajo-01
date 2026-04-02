package com.amazon.aps.iva.f60;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.xw.f0;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: CardWatchlistItemTogglePresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.ez.g<Panel> h;
    public final /* synthetic */ h i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.amazon.aps.iva.ez.g<Panel> gVar, h hVar) {
        super(1);
        this.h = gVar;
        this.i = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        k view;
        k view2;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        com.amazon.aps.iva.ez.g<Panel> gVar = this.h;
        com.amazon.aps.iva.yb0.j.d(gVar, "null cannot be cast to non-null type com.ellation.crunchyroll.mvp.viewmodel.Resource.Failure<com.ellation.crunchyroll.model.Panel>");
        T t = ((g.a) gVar).b;
        com.amazon.aps.iva.yb0.j.c(t);
        Panel panel = (Panel) t;
        h hVar = this.i;
        view = hVar.getView();
        view.Jc(new com.amazon.aps.iva.b60.j(panel.getId(), WatchlistStatus.IN_WATCHLIST));
        view2 = hVar.getView();
        view2.showSnackbar(new o(f0.d(panel)));
        hVar.c.b(panel, th2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
