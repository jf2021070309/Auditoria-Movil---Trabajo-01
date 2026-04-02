package com.ellation.crunchyroll.presentation.watchlist;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.g;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.b50.d0;
import com.amazon.aps.iva.b50.f0;
import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.b50.x;
import com.amazon.aps.iva.b50.y;
import com.amazon.aps.iva.b50.z;
import com.amazon.aps.iva.b60.s;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.e60.c;
import com.amazon.aps.iva.f50.b;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.n60.b;
import com.amazon.aps.iva.nz.b;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.u70.c;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.connectivity.d;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.sortandfilters.currentfilters.CurrentFiltersLayout;
import com.crunchyroll.sortandfilters.filters.empty.EmptyFilterResultLayout;
import com.crunchyroll.sortandfilters.header.SortAndFiltersHeaderLayout;
import com.crunchyroll.sortandfilters.screen.SortAndFilterActivity;
import com.crunchyroll.usermigration.progress.WatchDataProgress;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
import com.ellation.crunchyroll.presentation.main.browse.BrowseBottomBarActivity;
import com.ellation.crunchyroll.presentation.watchlist.f;
import com.ellation.crunchyroll.ui.recycler.GridLoadMoreScrollListener;
import com.ellation.crunchyroll.ui.recycler.LoadMoreScrollListener;
import com.ellation.crunchyroll.watchlist.a;
import com.ellation.feature.empty.EmptyCtaLayout;
import com.ellation.feature.empty.EmptyLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: WatchlistFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\t\nB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/watchlist/a;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/b50/d0;", "Lcom/amazon/aps/iva/w70/i;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/f50/c;", "Lcom/amazon/aps/iva/us/a;", "<init>", "()V", "a", "b", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.qy.a implements d0, com.amazon.aps.iva.w70.i, com.amazon.aps.iva.gn.e, com.amazon.aps.iva.f50.c, com.amazon.aps.iva.us.a {
    public final com.amazon.aps.iva.ls.a c;
    public final v d;
    public final v e;
    public final v f;
    public final v g;
    public final v h;
    public final v i;
    public final v j;
    public final v k;
    public final v l;
    public final v m;
    public final com.amazon.aps.iva.kb0.m n;
    public final com.amazon.aps.iva.b50.d o;
    public final com.amazon.aps.iva.ez.f p;
    public final com.amazon.aps.iva.kb0.m q;
    public final com.amazon.aps.iva.kb0.m r;
    public final com.amazon.aps.iva.kb0.m s;
    public final LifecycleAwareLazy t;
    public final x u;
    public final int v;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] x = {q.a(a.class, "snackbarContainer", "getSnackbarContainer()Landroid/view/ViewGroup;", 0), q.a(a.class, "headerContainer", "getHeaderContainer()Landroid/widget/LinearLayout;", 0), q.a(a.class, "headerLayout", "getHeaderLayout()Lcom/crunchyroll/sortandfilters/header/SortAndFiltersHeaderLayout;", 0), q.a(a.class, "currentFiltersLayout", "getCurrentFiltersLayout()Lcom/crunchyroll/sortandfilters/currentfilters/CurrentFiltersLayout;", 0), q.a(a.class, "emptyFilterResultLayout", "getEmptyFilterResultLayout()Lcom/crunchyroll/sortandfilters/filters/empty/EmptyFilterResultLayout;", 0), q.a(a.class, "emptyWatchlistView", "getEmptyWatchlistView()Landroid/view/View;", 0), q.a(a.class, "watchlistRecycler", "getWatchlistRecycler()Lcom/ellation/crunchyroll/presentation/watchlist/WatchlistRecyclerView;", 0), q.a(a.class, "emptyCtaView", "getEmptyCtaView()Lcom/ellation/feature/empty/EmptyCtaLayout;", 0), q.a(a.class, "emptyView", "getEmptyView()Lcom/ellation/feature/empty/EmptyLayout;", 0), q.a(a.class, "watchDataMigrationProgress", "getWatchDataMigrationProgress()Lcom/crunchyroll/usermigration/progress/WatchDataProgress;", 0), q.a(a.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/watchlist/WatchlistViewModelImpl;", 0)};
    public static final C0973a w = new C0973a();

    /* compiled from: WatchlistFragment.kt */
    /* renamed from: com.ellation.crunchyroll.presentation.watchlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0973a {
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.u {
        public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> b;

        public b(a aVar, com.amazon.aps.iva.b50.j jVar) {
            this.b = jVar;
            C0973a c0973a = a.w;
            aVar.ei().addOnScrollListener(this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (i2 > 0) {
                this.b.invoke();
            }
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.nz.a>, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.nz.a> list) {
            com.amazon.aps.iva.yb0.j.f(list, "it");
            C0973a c0973a = a.w;
            a.this.di().R();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d(y yVar) {
            super(0, yVar, y.class, "onFilterClick", "onFilterClick()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((y) this.receiver).z();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public e(y yVar) {
            super(0, yVar, y.class, "onSortClick", "onSortClick()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((y) this.receiver).J();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "it");
            C0973a c0973a = a.w;
            a.this.di().l();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g implements com.amazon.aps.iva.sn.a {
        @Override // com.amazon.aps.iva.sn.a
        public final com.amazon.aps.iva.o3.e C() {
            return new com.amazon.aps.iva.o3.e(new com.amazon.aps.iva.e50.a(), R.string.sort_and_filters_filter);
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h implements com.amazon.aps.iva.sn.a {
        @Override // com.amazon.aps.iva.sn.a
        public final com.amazon.aps.iva.o3.e C() {
            return new com.amazon.aps.iva.o3.e(new com.amazon.aps.iva.g50.a(), R.string.sort_and_filters_sort);
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<y> {
        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final y invoke() {
            a aVar = a.this;
            com.amazon.aps.iva.b50.d dVar = aVar.o;
            f0 f0Var = (f0) aVar.p.getValue(aVar, a.x[10]);
            com.ellation.crunchyroll.watchlist.a.u0.getClass();
            com.ellation.crunchyroll.watchlist.a aVar2 = a.C0975a.b;
            com.amazon.aps.iva.b50.v vVar = f.a.a;
            if (vVar != null) {
                com.ellation.crunchyroll.application.a aVar3 = a.C0959a.a;
                if (aVar3 != null) {
                    Object c = aVar3.c().c(com.amazon.aps.iva.cx.p.class, "app_resume_screens_reload_intervals");
                    if (c != null) {
                        com.amazon.aps.iva.n60.c a = b.a.a((com.amazon.aps.iva.cx.p) c);
                        com.amazon.aps.iva.yb0.j.f(dVar, "analytics");
                        com.amazon.aps.iva.yb0.j.f(aVar2, "watchlistChangeRegister");
                        return new z(aVar, dVar, f0Var, aVar2, vVar, a);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.ScreenReloadIntervalsImpl");
                }
                com.amazon.aps.iva.yb0.j.m("instance");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.f50.a> {
        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.f50.a invoke() {
            a aVar = a.this;
            Context requireContext = aVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            boolean c = com.amazon.aps.iva.aq.k.n(requireContext).c();
            com.amazon.aps.iva.fc0.l<?> lVar = a.x[10];
            com.amazon.aps.iva.b60.n nVar = aVar.u.d;
            com.amazon.aps.iva.yb0.j.f(nVar, "watchlistItemAnalytics");
            return new com.amazon.aps.iva.f50.b(aVar, c, (f0) aVar.p.getValue(aVar, lVar), nVar);
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<GridLoadMoreScrollListener> {
        public k() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final GridLoadMoreScrollListener invoke() {
            C0973a c0973a = a.w;
            a aVar = a.this;
            return new GridLoadMoreScrollListener(aVar.ei().getLayoutManager(), aVar.di());
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.gn.c> {
        public l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.gn.c invoke() {
            com.amazon.aps.iva.ts.b.a.getClass();
            return c.a.a(a.this, com.amazon.aps.iva.ts.a.j);
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class m extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public m(y yVar) {
            super(0, yVar, y.class, "onRetry", "onRetry()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((y) this.receiver).b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, f0> {
        public n() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final f0 invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            a aVar = a.this;
            x xVar = aVar.u;
            com.amazon.aps.iva.b60.n nVar = xVar.d;
            com.amazon.aps.iva.b50.n nVar2 = (com.amazon.aps.iva.b50.n) xVar.e.getValue();
            x xVar2 = aVar.u;
            com.amazon.aps.iva.h50.a aVar2 = (com.amazon.aps.iva.h50.a) xVar2.f.getValue();
            xVar2.getClass();
            CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
            EtpContentService etpContentService = CrunchyrollApplication.a.a().e().getEtpContentService();
            com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
            if (c.a.a == null) {
                c.a.a = new com.amazon.aps.iva.e60.d(etpContentService);
            }
            com.amazon.aps.iva.e60.d dVar = c.a.a;
            com.amazon.aps.iva.yb0.j.c(dVar);
            return new f0(nVar, nVar2, aVar2, dVar, xVar2.b);
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.c50.b> {
        public o() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.c50.b invoke() {
            a aVar = a.this;
            com.amazon.aps.iva.b50.d dVar = aVar.o;
            com.amazon.aps.iva.b50.h hVar = new com.amazon.aps.iva.b50.h(new com.ellation.crunchyroll.presentation.watchlist.b(aVar), new com.ellation.crunchyroll.presentation.watchlist.c((com.amazon.aps.iva.gn.c) aVar.r.getValue()), new com.ellation.crunchyroll.presentation.watchlist.d(aVar), com.ellation.crunchyroll.presentation.watchlist.e.h);
            com.amazon.aps.iva.yb0.j.f(dVar, "watchlistAnalytics");
            return new com.amazon.aps.iva.c50.b(new com.amazon.aps.iva.c50.d(dVar, hVar));
        }
    }

    /* compiled from: WatchlistFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class p extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
        public p(Object obj) {
            super(0, obj, a.class, "isResumed", "isResumed()Z", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.valueOf(((a) this.receiver).isResumed());
        }
    }

    public a() {
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.WATCHLIST;
        this.c = aVar;
        this.d = com.amazon.aps.iva.xw.g.f(this, R.id.snackbar_container);
        this.e = com.amazon.aps.iva.xw.g.f(this, R.id.watchlist_header_container);
        this.f = com.amazon.aps.iva.xw.g.f(this, R.id.header_layout);
        this.g = com.amazon.aps.iva.xw.g.f(this, R.id.current_filters_layout);
        this.h = com.amazon.aps.iva.xw.g.f(this, R.id.empty_filter_result_layout);
        this.i = com.amazon.aps.iva.xw.g.f(this, R.id.watchlist_empty_view_container);
        this.j = com.amazon.aps.iva.xw.g.f(this, R.id.watchlist_recycler_view);
        this.k = com.amazon.aps.iva.xw.g.f(this, R.id.watchlist_empty_cta_view);
        this.l = com.amazon.aps.iva.xw.g.f(this, R.id.watchlist_empty_view);
        this.m = com.amazon.aps.iva.xw.g.f(this, R.id.watch_data_migration_progress);
        this.n = com.amazon.aps.iva.kb0.f.b(new k());
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.ws.f a = d.a.a(aVar);
        p pVar = new p(this);
        com.amazon.aps.iva.b50.a aVar2 = com.amazon.aps.iva.b50.a.h;
        com.amazon.aps.iva.yb0.j.f(aVar2, "createTimer");
        this.o = new com.amazon.aps.iva.b50.d(a, pVar, aVar2);
        this.p = new com.amazon.aps.iva.ez.f(this, f0.class, new n());
        this.q = com.amazon.aps.iva.kb0.f.b(new i());
        this.r = com.amazon.aps.iva.kb0.f.b(new l());
        this.s = com.amazon.aps.iva.kb0.f.b(new j());
        this.t = com.amazon.aps.iva.aq.j.F(this, new o());
        x xVar = w.b;
        if (xVar == null) {
            xVar = new x();
            w.b = xVar;
        }
        this.u = xVar;
        this.v = R.string.watchlist;
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void A8() {
        ((CurrentFiltersLayout) this.g.getValue(this, x[3])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void C() {
        int i2 = BrowseBottomBarActivity.v;
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        BrowseBottomBarActivity.a.a(requireActivity);
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void C0() {
        ((View) this.i.getValue(this, x[5])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void C4() {
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) this.e.getValue(this, x[1])).getLayoutParams();
        com.amazon.aps.iva.yb0.j.d(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        ((AppBarLayout.LayoutParams) layoutParams).setScrollFlags(21);
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void D8() {
        ei().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int G() {
        return 0;
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int H6() {
        return this.v;
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void I0() {
        int i2 = SortAndFilterActivity.n;
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        SortAndFilterActivity.a.a(requireActivity, new h());
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void L() {
        ((EmptyLayout) this.l.getValue(this, x[8])).b1(com.amazon.aps.iva.n1.c.a);
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final boolean L7() {
        return getViewLifecycleOwner().getLifecycle().getCurrentState().isAtLeast(g.b.RESUMED);
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void Sf(List<? extends s> list) {
        com.amazon.aps.iva.yb0.j.f(list, "data");
        ((com.amazon.aps.iva.c50.b) this.t.getValue()).e(list);
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        startActivity(com.amazon.aps.iva.gd0.j.i(requireActivity, str));
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void Uc() {
        ((com.amazon.aps.iva.c50.b) this.t.getValue()).e(com.amazon.aps.iva.lb0.z.b);
        ((LoadMoreScrollListener) this.n.getValue()).reset();
        ei().getRecycledViewPool().a();
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void W() {
        com.amazon.aps.iva.j60.a aVar = ((EmptyCtaLayout) this.k.getValue(this, x[7])).e;
        aVar.getClass();
        if (aVar.b) {
            aVar.getView().setPrimaryButtonText(R.string.empty_cta_primary_text);
        } else {
            aVar.getView().setPrimaryButtonText(R.string.empty_cta_primary_text);
        }
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void b2() {
        ((EmptyFilterResultLayout) this.h.getValue(this, x[4])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void bd() {
        ((CurrentFiltersLayout) this.g.getValue(this, x[3])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void c() {
        com.amazon.aps.iva.k60.a.c(this, new m(di()));
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void cc() {
        ei().setVisibility(0);
    }

    public final y di() {
        return (y) this.q.getValue();
    }

    public final WatchlistRecyclerView ei() {
        return (WatchlistRecyclerView) this.j.getValue(this, x[6]);
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void k2() {
        ((EmptyFilterResultLayout) this.h.getValue(this, x[4])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void m() {
        View view = getView();
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        viewGroup.removeView(viewGroup.findViewWithTag("OverlayRetryError"));
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void m2() {
        int i2 = SortAndFilterActivity.n;
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        SortAndFilterActivity.a.a(requireActivity, new g());
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void n7() {
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) this.e.getValue(this, x[1])).getLayoutParams();
        com.amazon.aps.iva.yb0.j.d(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        ((AppBarLayout.LayoutParams) layoutParams).setScrollFlags(0);
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [T, com.ellation.crunchyroll.presentation.watchlist.a$b] */
    @Override // com.amazon.aps.iva.f50.c
    public final void o8(String str, boolean z, b.a aVar, b.C0241b c0241b) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
        int i2 = com.amazon.aps.iva.u70.c.a;
        com.amazon.aps.iva.u70.c a = c.a.a((ViewGroup) this.d.getValue(this, x[0]), 0, R.style.ActionSnackBarTextStyle, R.style.ActionSnackBarActionTextStyle);
        if (z) {
            d0Var.b = new b(this, new com.amazon.aps.iva.b50.j(a));
        }
        a.b(new com.amazon.aps.iva.b50.k(this, d0Var, aVar), new com.amazon.aps.iva.b50.m(this, c0241b));
        String string = getString(R.string.remove_snackbar_title, str);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.remove_snackbar_title, title)");
        com.amazon.aps.iva.u70.c.c(a, string, R.string.remove_snackbar_undo, 0, 12);
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void ob() {
        ((LoadMoreScrollListener) this.n.getValue()).reset();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_watchlist, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.qy.a, com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ei().removeOnScrollListener((LoadMoreScrollListener) this.n.getValue());
        super.onDestroyView();
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        WatchlistRecyclerView ei = ei();
        ei.setAdapter((com.amazon.aps.iva.c50.b) this.t.getValue());
        ei.addOnScrollListener((LoadMoreScrollListener) this.n.getValue());
        Context requireContext = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        ei.addItemDecoration(new com.amazon.aps.iva.r30.d(requireContext));
        com.amazon.aps.iva.ye0.c cVar = r0.a;
        t1 t1Var = com.amazon.aps.iva.xe0.k.a;
        com.amazon.aps.iva.yb0.j.f(t1Var, "dispatcher");
        com.amazon.aps.iva.nz.c cVar2 = b.a.a;
        if (cVar2 == null) {
            cVar2 = new com.amazon.aps.iva.nz.c(t1Var);
            b.a.a = cVar2;
        }
        cVar2.a(this, new c());
        Context requireContext2 = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext2, "requireContext()");
        androidx.lifecycle.g lifecycle = getLifecycle();
        com.amazon.aps.iva.yb0.j.e(lifecycle, "this.lifecycle");
        d.a.a(requireContext2, lifecycle).a(di());
        com.amazon.aps.iva.fo.h hVar = ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).q.d;
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        androidx.fragment.app.h requireActivity2 = requireActivity();
        com.amazon.aps.iva.yb0.j.d(requireActivity2, "null cannot be cast to non-null type com.ellation.widgets.snackbar.SnackbarMessageView");
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.WATCHLIST;
        hVar.e(requireActivity, (com.amazon.aps.iva.u70.j) requireActivity2, aVar);
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = x;
        ((WatchDataProgress) this.m.getValue(this, lVarArr[9])).setScreen(aVar);
        com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[2];
        v vVar = this.f;
        SortAndFiltersHeaderLayout sortAndFiltersHeaderLayout = (SortAndFiltersHeaderLayout) vVar.getValue(this, lVar);
        x xVar = this.u;
        com.amazon.aps.iva.mn.j jVar = xVar.b;
        sortAndFiltersHeaderLayout.getClass();
        com.amazon.aps.iva.yb0.j.f(jVar, "interactor");
        com.ellation.crunchyroll.mvp.lifecycle.a.b(new com.amazon.aps.iva.rn.b(sortAndFiltersHeaderLayout, jVar), sortAndFiltersHeaderLayout);
        sortAndFiltersHeaderLayout.getClass();
        ((SortAndFiltersHeaderLayout) vVar.getValue(this, lVarArr[2])).setOnFilterClick(new d(di()));
        ((SortAndFiltersHeaderLayout) vVar.getValue(this, lVarArr[2])).setOnSortClick(new e(di()));
        ((CurrentFiltersLayout) this.g.getValue(this, lVarArr[3])).b1(xVar.b, xVar.c);
        ((EmptyFilterResultLayout) this.h.getValue(this, lVarArr[4])).b1(xVar.b, xVar.c);
        ((EmptyCtaLayout) this.k.getValue(this, lVarArr[7])).setPrimaryButtonClickListener(new f());
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.I(di(), (com.amazon.aps.iva.gn.c) this.r.getValue(), (com.amazon.aps.iva.f50.a) this.s.getValue());
    }

    @Override // com.amazon.aps.iva.b50.d0
    public final void v0() {
        ((View) this.i.getValue(this, x[5])).setVisibility(0);
    }
}
