package com.amazon.aps.iva.b50;

import android.content.Intent;
import java.util.List;
/* compiled from: WatchlistPresenter.kt */
/* loaded from: classes2.dex */
public final class z extends com.amazon.aps.iva.wy.b<d0> implements y {
    public final com.amazon.aps.iva.b50.b b;
    public final e0 c;
    public final com.ellation.crunchyroll.watchlist.a d;
    public final com.ellation.crunchyroll.presentation.watchlist.f e;
    public final com.amazon.aps.iva.n60.b f;

    /* compiled from: WatchlistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            z.this.q6();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.j<? extends List<? extends com.amazon.aps.iva.b60.s>, ? extends com.amazon.aps.iva.mn.g>>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.j<? extends List<? extends com.amazon.aps.iva.b60.s>, ? extends com.amazon.aps.iva.mn.g>> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.j<? extends List<? extends com.amazon.aps.iva.b60.s>, ? extends com.amazon.aps.iva.mn.g>> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeWatchlist");
            z zVar = z.this;
            gVar2.e(new a0(zVar));
            gVar2.b(new b0(zVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            z.this.q6();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            z.this.q6();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public z(com.ellation.crunchyroll.presentation.watchlist.a aVar, com.amazon.aps.iva.b50.d dVar, f0 f0Var, com.ellation.crunchyroll.watchlist.a aVar2, v vVar, com.amazon.aps.iva.n60.c cVar) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = dVar;
        this.c = f0Var;
        this.d = aVar2;
        this.e = vVar;
        this.f = cVar;
    }

    @Override // com.amazon.aps.iva.b50.y
    public final void J() {
        getView().I0();
    }

    @Override // com.amazon.aps.iva.b50.y
    public final void R() {
        q6();
    }

    @Override // com.amazon.aps.iva.b60.i
    public final void U0(com.amazon.aps.iva.b60.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        if (!getView().L7()) {
            q6();
        }
    }

    @Override // com.amazon.aps.iva.b50.y
    public final void b() {
        q6();
    }

    @Override // com.amazon.aps.iva.b50.y
    public final void l() {
        getView().C();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
        if (this.c.n()) {
            q6();
        }
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        a aVar = new a();
        e0 e0Var = this.c;
        e0Var.i3(getView(), aVar);
        e0Var.h6(getView(), new b());
        this.d.a(this, getView());
        getView().L();
        getView().W();
    }

    @Override // com.ellation.crunchyroll.ui.recycler.OnLoadMoreScrollListener
    public final void onLoadMore() {
        this.c.r4();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        this.b.onNewIntent(intent);
        this.f.a(new c());
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onPause() {
        this.b.p(false);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        this.e.invalidate();
        this.b.p(true);
        this.f.a(new d());
    }

    public final void q6() {
        e0 e0Var = this.c;
        e0Var.reset();
        getView().Uc();
        getView().m();
        e0Var.r4();
    }

    public final void r6(com.amazon.aps.iva.mn.g gVar, List<? extends com.amazon.aps.iva.b60.s> list) {
        boolean z = false;
        if (gVar != null && !gVar.c) {
            z = true;
        }
        if (z && (!list.isEmpty())) {
            getView().bd();
        } else {
            getView().A8();
        }
    }

    @Override // com.amazon.aps.iva.b50.y
    public final void z() {
        getView().m2();
    }
}
