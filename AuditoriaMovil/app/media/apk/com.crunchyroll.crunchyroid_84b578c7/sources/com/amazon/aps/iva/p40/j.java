package com.amazon.aps.iva.p40;

import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.ws.d;
import com.ellation.crunchyroll.presentation.showpage.similar.SimilarShowsLayout;
import com.ellation.crunchyroll.watchlist.a;
/* compiled from: SimilarShowsLayout.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<d> {
    public final /* synthetic */ SimilarShowsLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SimilarShowsLayout similarShowsLayout) {
        super(0);
        this.h = similarShowsLayout;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final d invoke() {
        n viewModel;
        SimilarShowsLayout similarShowsLayout = this.h;
        viewModel = similarShowsLayout.getViewModel();
        w wVar = new w(com.amazon.aps.iva.ds.c.b);
        com.amazon.aps.iva.ws.f a = d.a.a(com.amazon.aps.iva.ls.a.MEDIA);
        com.ellation.crunchyroll.watchlist.a.u0.getClass();
        com.ellation.crunchyroll.watchlist.a aVar = a.C0975a.b;
        com.amazon.aps.iva.yb0.j.f(viewModel, "similarViewModel");
        com.amazon.aps.iva.yb0.j.f(aVar, "watchlistChangeRegister");
        h hVar = new h(similarShowsLayout, viewModel, wVar, a, aVar);
        com.ellation.crunchyroll.mvp.lifecycle.a.b(hVar, similarShowsLayout);
        return hVar;
    }
}
