package com.amazon.aps.iva.f60;

import com.amazon.aps.iva.nt.o;
import com.amazon.aps.iva.xw.f0;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: CardWatchlistItemTogglePresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.b<k> implements e {
    public final l b;
    public final com.amazon.aps.iva.g60.a c;

    /* compiled from: CardWatchlistItemTogglePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends Panel>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends Panel> gVar) {
            com.amazon.aps.iva.ez.g<? extends Panel> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeEvent");
            h hVar = h.this;
            gVar2.e(new f(hVar));
            gVar2.b(new g(gVar2, hVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CardWatchlistItemTogglePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends Panel>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends Panel> gVar) {
            com.amazon.aps.iva.ez.g<? extends Panel> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeEvent");
            h hVar = h.this;
            gVar2.e(new i(hVar));
            gVar2.b(new j(gVar2, hVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public h(l lVar, com.amazon.aps.iva.g60.b bVar, k kVar) {
        super(kVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = lVar;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.f60.e
    public final void o1(Panel panel, com.amazon.aps.iva.nt.o oVar, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.yb0.j.f(oVar, "actionItem");
        com.amazon.aps.iva.yb0.j.f(bVar, "analyticsClickedView");
        boolean a2 = com.amazon.aps.iva.yb0.j.a(oVar, o.a.e);
        l lVar = this.b;
        com.amazon.aps.iva.g60.a aVar = this.c;
        if (a2) {
            getView().Jc(new com.amazon.aps.iva.b60.j(f0.a(panel), WatchlistStatus.IN_WATCHLIST));
            aVar.e(panel, bVar);
            lVar.r5(panel);
        } else if (com.amazon.aps.iva.yb0.j.a(oVar, o.b.e)) {
            getView().Jc(new com.amazon.aps.iva.b60.j(f0.a(panel), WatchlistStatus.NOT_IN_WATCHLIST));
            aVar.c(panel, bVar);
            lVar.z8(panel);
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        l lVar = this.b;
        com.amazon.aps.iva.ez.e.a(lVar.o8(), getView(), new a());
        com.amazon.aps.iva.ez.e.a(lVar.A5(), getView(), new b());
    }
}
