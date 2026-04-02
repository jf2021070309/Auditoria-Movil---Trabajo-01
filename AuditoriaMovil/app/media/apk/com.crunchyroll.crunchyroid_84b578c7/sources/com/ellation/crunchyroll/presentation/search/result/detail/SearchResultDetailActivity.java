package com.ellation.crunchyroll.presentation.search.result.detail;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.p;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.c00.f;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.ct.j;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.p30.f;
import com.amazon.aps.iva.q30.k;
import com.amazon.aps.iva.r30.a;
import com.amazon.aps.iva.u70.c;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.v30.o;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.t;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.search.SearchItemsContainerType;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.watchlist.a;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SearchResultDetailActivity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/presentation/search/result/detail/SearchResultDetailActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/v30/m;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/f60/k;", "Lcom/amazon/aps/iva/oh/i;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SearchResultDetailActivity extends com.amazon.aps.iva.i60.b implements com.amazon.aps.iva.v30.m, com.amazon.aps.iva.gn.e, com.amazon.aps.iva.f60.k, com.amazon.aps.iva.oh.i {
    public final com.amazon.aps.iva.ez.a A;
    public final LifecycleAwareLazy B;
    public final i C;
    public final int k = R.layout.activity_search_result_detail;
    public final v l = com.amazon.aps.iva.xw.g.d(this, R.id.error_layout);
    public final v m = com.amazon.aps.iva.xw.g.d(this, R.id.retry_text);
    public final v n = com.amazon.aps.iva.xw.g.d(this, R.id.toolbar);
    public final v o = com.amazon.aps.iva.xw.g.d(this, R.id.progress);
    public final v p = com.amazon.aps.iva.xw.g.d(this, R.id.search_list);
    public final v q = com.amazon.aps.iva.xw.g.d(this, R.id.errors_layout);
    public final v r = com.amazon.aps.iva.xw.g.d(this, R.id.snackbar_container);
    public final com.amazon.aps.iva.yh.d s = new com.amazon.aps.iva.yh.d(new com.amazon.aps.iva.yh.b(this));
    public final com.amazon.aps.iva.kb0.m t = com.amazon.aps.iva.kb0.f.b(new d());
    public final com.amazon.aps.iva.kb0.m u = com.amazon.aps.iva.kb0.f.b(new h());
    public final com.amazon.aps.iva.ez.a v = new com.amazon.aps.iva.ez.a(o.class, new l(this), new k());
    public GridLayoutManager w;
    public com.amazon.aps.iva.f60.e x;
    public final com.amazon.aps.iva.gn.d y;
    public final com.amazon.aps.iva.kb0.m z;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] E = {q.a(SearchResultDetailActivity.class, "errorLayout", "getErrorLayout()Landroid/view/ViewGroup;", 0), q.a(SearchResultDetailActivity.class, "retryButton", "getRetryButton()Landroid/view/View;", 0), q.a(SearchResultDetailActivity.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), q.a(SearchResultDetailActivity.class, "progressLayout", "getProgressLayout()Landroid/view/View;", 0), q.a(SearchResultDetailActivity.class, "searchList", "getSearchList()Landroidx/recyclerview/widget/RecyclerView;", 0), q.a(SearchResultDetailActivity.class, "errorsLayout", "getErrorsLayout()Landroid/widget/FrameLayout;", 0), q.a(SearchResultDetailActivity.class, "snackbarContainer", "getSnackbarContainer()Landroid/view/ViewGroup;", 0), q.a(SearchResultDetailActivity.class, "searchResultsDetailViewModel", "getSearchResultsDetailViewModel()Lcom/ellation/crunchyroll/presentation/search/result/detail/SearchResultDetailViewModelImpl;", 0), q.a(SearchResultDetailActivity.class, "cardWatchlistItemToggleViewModel", "getCardWatchlistItemToggleViewModel()Lcom/ellation/crunchyroll/watchlisttoggle/CardWatchlistItemToggleViewModelImpl;", 0)};
    public static final a D = new a();

    /* compiled from: SearchResultDetailActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: SearchResultDetailActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.f60.c> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.f60.c invoke() {
            int i = com.amazon.aps.iva.f60.c.a;
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.SEARCH_RESULTS;
            EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            com.amazon.aps.iva.yb0.j.f(aVar, "screen");
            com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
            SearchResultDetailActivity searchResultDetailActivity = SearchResultDetailActivity.this;
            com.amazon.aps.iva.yb0.j.f(searchResultDetailActivity, "view");
            return new com.amazon.aps.iva.f60.d(aVar, etpContentService, searchResultDetailActivity);
        }
    }

    /* compiled from: SearchResultDetailActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.f60.m> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.f60.m invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            a aVar = SearchResultDetailActivity.D;
            return ((com.amazon.aps.iva.f60.c) SearchResultDetailActivity.this.z.getValue()).b();
        }
    }

    /* compiled from: SearchResultDetailActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oh.g> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oh.g invoke() {
            return ((d0) com.ellation.crunchyroll.application.e.a()).y.b(SearchResultDetailActivity.this, com.amazon.aps.iva.ls.a.SEARCH_RESULTS);
        }
    }

    /* compiled from: SearchResultDetailActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, com.ellation.crunchyroll.presentation.search.result.detail.a.h, 251);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultDetailActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final f h = new f();

        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, true, false, false, com.ellation.crunchyroll.presentation.search.result.detail.b.h, 253);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultDetailActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final g h = new g();

        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, true, false, false, com.ellation.crunchyroll.presentation.search.result.detail.c.h, 253);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultDetailActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.v30.g> {
        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.v30.g invoke() {
            a aVar = SearchResultDetailActivity.D;
            SearchResultDetailActivity searchResultDetailActivity = SearchResultDetailActivity.this;
            searchResultDetailActivity.getClass();
            o oVar = (o) searchResultDetailActivity.v.getValue(searchResultDetailActivity, SearchResultDetailActivity.E[7]);
            com.amazon.aps.iva.q30.m a = k.a.a();
            com.amazon.aps.iva.c00.g a2 = f.a.a(searchResultDetailActivity);
            com.amazon.aps.iva.p30.g a3 = f.a.a(searchResultDetailActivity.s, d.a.a(com.amazon.aps.iva.ls.a.SEARCH_RESULTS));
            com.amazon.aps.iva.v30.a mi = SearchResultDetailActivity.mi(searchResultDetailActivity);
            com.amazon.aps.iva.ii.a aVar2 = new com.amazon.aps.iva.ii.a(searchResultDetailActivity);
            com.amazon.aps.iva.oh.g gVar = (com.amazon.aps.iva.oh.g) searchResultDetailActivity.t.getValue();
            com.ellation.crunchyroll.watchlist.a.u0.getClass();
            com.ellation.crunchyroll.watchlist.a aVar3 = a.C0975a.b;
            com.amazon.aps.iva.yb0.j.f(aVar3, "watchlistChangeRegister");
            com.amazon.aps.iva.yb0.j.f(gVar, "markAsWatchedToggleViewModel");
            return new com.amazon.aps.iva.v30.k(gVar, a2, a3, a, mi, searchResultDetailActivity, oVar, aVar2, aVar3);
        }
    }

    /* compiled from: SearchResultDetailActivity.kt */
    /* loaded from: classes2.dex */
    public static final class i extends RecyclerView.u {
        public i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(recyclerView, "recyclerView");
            a aVar = SearchResultDetailActivity.D;
            SearchResultDetailActivity searchResultDetailActivity = SearchResultDetailActivity.this;
            com.amazon.aps.iva.v30.g ni = searchResultDetailActivity.ni();
            RecyclerView.p layoutManager = searchResultDetailActivity.oi().getLayoutManager();
            com.amazon.aps.iva.yb0.j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ni.p3(((LinearLayoutManager) layoutManager).findLastVisibleItemPosition(), searchResultDetailActivity.pi().getItemCount() - 1);
        }
    }

    /* compiled from: SearchResultDetailActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.s30.g> {
        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.s30.g invoke() {
            a aVar = SearchResultDetailActivity.D;
            SearchResultDetailActivity searchResultDetailActivity = SearchResultDetailActivity.this;
            com.amazon.aps.iva.v30.g ni = searchResultDetailActivity.ni();
            com.amazon.aps.iva.f60.e eVar = searchResultDetailActivity.x;
            if (eVar != null) {
                com.ellation.crunchyroll.presentation.search.result.detail.d dVar = new com.ellation.crunchyroll.presentation.search.result.detail.d(eVar);
                com.amazon.aps.iva.gn.d dVar2 = searchResultDetailActivity.y;
                return new com.amazon.aps.iva.s30.g(ni, new com.amazon.aps.iva.nt.a(dVar, new com.ellation.crunchyroll.presentation.search.result.detail.e(dVar2), new com.ellation.crunchyroll.presentation.search.result.detail.f(searchResultDetailActivity), new com.ellation.crunchyroll.presentation.search.result.detail.g(searchResultDetailActivity)), new com.amazon.aps.iva.gi.e(com.ellation.crunchyroll.presentation.search.result.detail.h.h, dVar2, new com.amazon.aps.iva.ii.a(searchResultDetailActivity)), DurationFormatter.Companion.create(searchResultDetailActivity), null, a.C0662a.a(searchResultDetailActivity), new com.amazon.aps.iva.mt.o(searchResultDetailActivity, new com.amazon.aps.iva.mt.m(searchResultDetailActivity)), 80);
            }
            com.amazon.aps.iva.yb0.j.m("watchlistItemTogglePresenter");
            throw null;
        }
    }

    /* compiled from: SearchResultDetailActivity.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, o> {
        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final o invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            final com.amazon.aps.iva.ct.k a = com.ellation.crunchyroll.application.f.a(null, 3);
            EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            com.amazon.aps.iva.at.f fVar = new com.amazon.aps.iva.at.f(new t(a) { // from class: com.ellation.crunchyroll.presentation.search.result.detail.i
                @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                public final Object get() {
                    return Boolean.valueOf(((j) this.receiver).R1());
                }
            });
            SearchResultDetailActivity searchResultDetailActivity = SearchResultDetailActivity.this;
            com.amazon.aps.iva.yh.d dVar = searchResultDetailActivity.s;
            com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
            com.amazon.aps.iva.yb0.j.f(dVar, "multipleArtistsFormatter");
            return new o(new com.amazon.aps.iva.v30.e(etpContentService, fVar, dVar), SearchResultDetailActivity.mi(searchResultDetailActivity).b, SearchResultDetailActivity.mi(searchResultDetailActivity).c);
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    public SearchResultDetailActivity() {
        com.amazon.aps.iva.ts.b.a.getClass();
        this.y = c.a.a(this, com.amazon.aps.iva.ts.a.j);
        this.z = com.amazon.aps.iva.kb0.f.b(new b());
        this.A = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.f60.m.class, new m(this), new c());
        this.B = com.amazon.aps.iva.aq.j.F(this, new j());
        this.C = new i();
    }

    public static final com.amazon.aps.iva.v30.a mi(SearchResultDetailActivity searchResultDetailActivity) {
        com.amazon.aps.iva.v30.a aVar;
        Object obj;
        Bundle extras = searchResultDetailActivity.getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = extras.getSerializable("search_detail_data", com.amazon.aps.iva.v30.a.class);
            } else {
                obj = (com.amazon.aps.iva.v30.a) extras.getSerializable("search_detail_data");
            }
            aVar = (com.amazon.aps.iva.v30.a) obj;
        } else {
            aVar = null;
        }
        com.amazon.aps.iva.yb0.j.c(aVar);
        return aVar;
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void Ce(List<String> list) {
        com.amazon.aps.iva.yb0.j.f(list, "assetIds");
    }

    @Override // com.amazon.aps.iva.v30.m
    public final void Eg() {
        AnimationUtil.fadeSwap((View) this.o.getValue(this, E[3]), oi());
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void F2() {
    }

    @Override // com.amazon.aps.iva.f60.k
    public final void Jc(com.amazon.aps.iva.b60.j jVar) {
        ni().U0(jVar);
    }

    @Override // com.amazon.aps.iva.v30.m
    public final void Mb(SearchItemsContainerType searchItemsContainerType) {
        com.amazon.aps.iva.yb0.j.f(searchItemsContainerType, "searchItemsContainerType");
        String string = getResources().getString(com.amazon.aps.iva.w30.c.a(searchItemsContainerType));
        com.amazon.aps.iva.yb0.j.e(string, "resources.getString(sear…ontainerType.displayName)");
        ((Toolbar) this.n.getValue(this, E[2])).setTitle(getResources().getString(R.string.search_result_detail_toolbar_title, string));
    }

    @Override // com.amazon.aps.iva.v30.m
    public final void O0() {
        ((ViewGroup) this.l.getValue(this, E[0])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        startActivity(com.amazon.aps.iva.gd0.j.i(this, str));
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        ((View) this.o.getValue(this, E[3])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        ((View) this.o.getValue(this, E[3])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void bg() {
        showSnackbar(com.amazon.aps.iva.bt.c.b);
    }

    @Override // com.amazon.aps.iva.v30.m
    public final void e(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        com.amazon.aps.iva.yb0.j.f(aVar2, "onUndoClicked");
        int i2 = com.amazon.aps.iva.u70.c.a;
        com.amazon.aps.iva.u70.c a2 = c.a.a((ViewGroup) this.r.getValue(this, E[6]), 0, R.style.ActionSnackBarTextStyle, R.style.ActionSnackBarActionTextStyle);
        a2.b(aVar, aVar2);
        String string = a2.getContext().getString(R.string.mark_as_watched_actionbar_title, str);
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(\n     …  title\n                )");
        com.amazon.aps.iva.u70.c.c(a2, string, R.string.mark_as_watched_actionbar_undo, 0, 12);
    }

    @Override // com.amazon.aps.iva.v30.m
    public final void e8(List<? extends com.amazon.aps.iva.s30.h> list) {
        com.amazon.aps.iva.yb0.j.f(list, "searchResults");
        pi().e(list);
    }

    @Override // com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return Integer.valueOf(this.k);
    }

    public final com.amazon.aps.iva.v30.g ni() {
        return (com.amazon.aps.iva.v30.g) this.u.getValue();
    }

    public final RecyclerView oi() {
        return (RecyclerView) this.p.getValue(this, E[4]);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.amazon.aps.iva.xw.b.d(this, false);
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = E;
        com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[2];
        v vVar = this.n;
        ((Toolbar) vVar.getValue(this, lVar)).setNavigationOnClickListener(new com.amazon.aps.iva.c8.k(this, 17));
        f1.i((Toolbar) vVar.getValue(this, lVarArr[2]), e.h);
        f1.i((FrameLayout) this.q.getValue(this, lVarArr[5]), f.h);
        f1.i(oi(), g.h);
        ((View) this.m.getValue(this, lVarArr[1])).setOnClickListener(new r(this, 17));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, getResources().getInteger(R.integer.search_result_list_spans));
        gridLayoutManager.g = new com.amazon.aps.iva.v30.c(this);
        this.w = gridLayoutManager;
        RecyclerView oi = oi();
        oi.setItemAnimator(null);
        GridLayoutManager gridLayoutManager2 = this.w;
        if (gridLayoutManager2 != null) {
            oi.setLayoutManager(gridLayoutManager2);
            oi.setAdapter(pi());
            oi.addOnScrollListener(this.C);
            oi.addItemDecoration(new com.amazon.aps.iva.r30.d(this));
            ((d0) com.ellation.crunchyroll.application.e.a()).y.a(this, this, (com.amazon.aps.iva.oh.g) this.t.getValue());
            return;
        }
        com.amazon.aps.iva.yb0.j.m("gridLayoutManager");
        throw null;
    }

    @Override // com.amazon.aps.iva.k.c, androidx.fragment.app.h, android.app.Activity
    public final void onDestroy() {
        oi().removeOnScrollListener(this.C);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        com.amazon.aps.iva.yb0.j.f(bundle, "savedInstanceState");
        GridLayoutManager gridLayoutManager = this.w;
        if (gridLayoutManager != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable2 = bundle.getParcelable("grid_layout_manager_state", Parcelable.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = bundle.getParcelable("grid_layout_manager_state");
            }
            gridLayoutManager.onRestoreInstanceState(parcelable);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("gridLayoutManager");
        throw null;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        com.amazon.aps.iva.yb0.j.f(bundle, "outState");
        com.amazon.aps.iva.yb0.j.f(persistableBundle, "outPersistentState");
        GridLayoutManager gridLayoutManager = this.w;
        if (gridLayoutManager != null) {
            bundle.putParcelable("grid_layout_manager_state", gridLayoutManager.onSaveInstanceState());
        } else {
            com.amazon.aps.iva.yb0.j.m("gridLayoutManager");
            throw null;
        }
    }

    public final com.amazon.aps.iva.s30.g pi() {
        return (com.amazon.aps.iva.s30.g) this.B.getValue();
    }

    @Override // com.amazon.aps.iva.v30.m
    public final void s(int i2) {
        pi().notifyItemChanged(i2);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        this.x = ((com.amazon.aps.iva.f60.c) this.z.getValue()).a((com.amazon.aps.iva.f60.m) this.A.getValue(this, E[8]));
        com.amazon.aps.iva.wy.k[] kVarArr = new com.amazon.aps.iva.wy.k[3];
        kVarArr[0] = ni();
        com.amazon.aps.iva.f60.e eVar = this.x;
        if (eVar != null) {
            kVarArr[1] = eVar;
            kVarArr[2] = this.y;
            return l1.I(kVarArr);
        }
        com.amazon.aps.iva.yb0.j.m("watchlistItemTogglePresenter");
        throw null;
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i2 = com.amazon.aps.iva.u70.h.a;
        h.a.a((FrameLayout) this.q.getValue(this, E[5]), iVar);
    }

    @Override // com.amazon.aps.iva.v30.m
    public final void x() {
        getOnBackPressedDispatcher().c();
    }

    @Override // com.amazon.aps.iva.v30.m
    public final void y0() {
        ((ViewGroup) this.l.getValue(this, E[0])).setVisibility(0);
    }
}
