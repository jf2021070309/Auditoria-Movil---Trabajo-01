package com.ellation.crunchyroll.presentation.search.result.summary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.p;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.c00.f;
import com.amazon.aps.iva.ct.j;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.mt.o;
import com.amazon.aps.iva.p30.f;
import com.amazon.aps.iva.q30.k;
import com.amazon.aps.iva.r30.a;
import com.amazon.aps.iva.u70.c;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.x30.t;
import com.amazon.aps.iva.x30.v;
import com.amazon.aps.iva.x30.y;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.presentation.search.result.detail.SearchResultDetailActivity;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.watchlist.a;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SearchResultSummaryFragment.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/presentation/search/result/summary/c;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/x30/v;", "Lcom/amazon/aps/iva/f60/k;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/oh/i;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qy.a implements v, com.amazon.aps.iva.f60.k, com.amazon.aps.iva.gn.e, com.amazon.aps.iva.oh.i {
    public com.amazon.aps.iva.s30.g j;
    public GridLayoutManager k;
    public View l;
    public final com.amazon.aps.iva.gn.d r;
    public com.amazon.aps.iva.f60.e s;
    public final m t;
    public static final /* synthetic */ l<Object>[] v = {q.a(c.class, "searchResultList", "getSearchResultList()Landroidx/recyclerview/widget/RecyclerView;", 0), q.a(c.class, "emptyView", "getEmptyView()Landroid/view/View;", 0), q.a(c.class, "errorLayout", "getErrorLayout()Landroid/view/ViewGroup;", 0), q.a(c.class, "progress", "getProgress()Landroid/view/View;", 0), q.a(c.class, "retry", "getRetry()Landroid/view/View;", 0), q.a(c.class, "snackbarContainer", "getSnackbarContainer()Landroid/view/ViewGroup;", 0), defpackage.e.b(c.class, "initialSearchString", "getInitialSearchString()Ljava/lang/String;", 0), q.a(c.class, "cardWatchlistItemToggleViewModel", "getCardWatchlistItemToggleViewModel()Lcom/ellation/crunchyroll/watchlisttoggle/CardWatchlistItemToggleViewModelImpl;", 0), q.a(c.class, "searchResultSummaryViewModel", "getSearchResultSummaryViewModel()Lcom/ellation/crunchyroll/presentation/search/result/summary/SearchResultSummaryViewModelImpl;", 0)};
    public static final a u = new a();
    public final com.amazon.aps.iva.xw.v c = com.amazon.aps.iva.xw.g.f(this, R.id.search_list);
    public final com.amazon.aps.iva.xw.v d = com.amazon.aps.iva.xw.g.f(this, R.id.search_results_summary_empty);
    public final com.amazon.aps.iva.xw.v e = com.amazon.aps.iva.xw.g.f(this, R.id.error_layout);
    public final com.amazon.aps.iva.xw.v f = com.amazon.aps.iva.xw.g.f(this, R.id.progress);
    public final com.amazon.aps.iva.xw.v g = new com.amazon.aps.iva.xw.v(new com.amazon.aps.iva.xw.f(R.id.retry_text, com.amazon.aps.iva.xw.m.h));
    public final com.amazon.aps.iva.xw.v h = com.amazon.aps.iva.xw.g.f(this, R.id.snackbar_container);
    public final s i = new s("search_string");
    public final m m = com.amazon.aps.iva.kb0.f.b(new b());
    public final m n = com.amazon.aps.iva.kb0.f.b(new d());
    public final com.amazon.aps.iva.ez.f o = new com.amazon.aps.iva.ez.f(this, com.amazon.aps.iva.f60.m.class, new C0972c());
    public final com.amazon.aps.iva.ez.f p = new com.amazon.aps.iva.ez.f(this, y.class, new k());
    public final m q = com.amazon.aps.iva.kb0.f.b(new j());

    /* compiled from: SearchResultSummaryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: SearchResultSummaryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.f60.c> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.f60.c invoke() {
            int i = com.amazon.aps.iva.f60.c.a;
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.SEARCH;
            EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            com.amazon.aps.iva.yb0.j.f(aVar, "screen");
            com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
            c cVar = c.this;
            com.amazon.aps.iva.yb0.j.f(cVar, "view");
            return new com.amazon.aps.iva.f60.d(aVar, etpContentService, cVar);
        }
    }

    /* compiled from: SearchResultSummaryFragment.kt */
    /* renamed from: com.ellation.crunchyroll.presentation.search.result.summary.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0972c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.f60.m> {
        public C0972c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.f60.m invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            a aVar = c.u;
            return ((com.amazon.aps.iva.f60.c) c.this.m.getValue()).b();
        }
    }

    /* compiled from: SearchResultSummaryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oh.g> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oh.g invoke() {
            Context requireContext = c.this.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            return ((d0) com.ellation.crunchyroll.application.e.a()).y.b(requireContext, com.amazon.aps.iva.ls.a.SEARCH_RESULTS);
        }
    }

    /* compiled from: SearchResultSummaryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Integer> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Integer invoke() {
            return Integer.valueOf(c.this.getResources().getInteger(R.integer.maximum_items_in_search_category_result));
        }
    }

    /* compiled from: SearchResultSummaryFragment.kt */
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
            com.amazon.aps.iva.xa0.f.a(fVar2, true, false, false, false, com.ellation.crunchyroll.presentation.search.result.summary.d.h, 254);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultSummaryFragment.kt */
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
            com.amazon.aps.iva.xa0.f.a(fVar2, true, false, false, false, com.ellation.crunchyroll.presentation.search.result.summary.e.h, 254);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultSummaryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final h h = new h();

        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, true, false, false, false, com.ellation.crunchyroll.presentation.search.result.summary.f.h, 254);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultSummaryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final i h = new i();

        public i() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, true, false, false, com.ellation.crunchyroll.presentation.search.result.summary.g.h, 253);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultSummaryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.x30.p> {
        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.x30.p invoke() {
            a aVar = c.u;
            c cVar = c.this;
            cVar.getClass();
            l<?>[] lVarArr = c.v;
            String str = (String) cVar.i.getValue(cVar, lVarArr[6]);
            y yVar = (y) cVar.p.getValue(cVar, lVarArr[8]);
            com.amazon.aps.iva.q30.m a = k.a.a();
            Context requireContext = cVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            com.amazon.aps.iva.c00.g a2 = f.a.a(requireContext);
            Context requireContext2 = cVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext2, "requireContext()");
            com.amazon.aps.iva.p30.g a3 = f.a.a(new com.amazon.aps.iva.yh.d(new com.amazon.aps.iva.yh.b(requireContext2)), d.a.a(com.amazon.aps.iva.ls.a.SEARCH_RESULTS));
            androidx.fragment.app.h requireActivity = cVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            com.amazon.aps.iva.ty.d dVar = new com.amazon.aps.iva.ty.d(requireActivity);
            Context requireContext3 = cVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext3, "requireContext()");
            com.amazon.aps.iva.ii.a aVar2 = new com.amazon.aps.iva.ii.a(requireContext3);
            com.amazon.aps.iva.oh.g gVar = (com.amazon.aps.iva.oh.g) cVar.n.getValue();
            com.ellation.crunchyroll.watchlist.a.u0.getClass();
            com.ellation.crunchyroll.watchlist.a aVar3 = a.C0975a.b;
            com.amazon.aps.iva.yb0.j.f(aVar3, "watchlistChangeRegister");
            com.amazon.aps.iva.yb0.j.f(gVar, "markAsWatchedToggleViewModel");
            return new t(gVar, dVar, a2, a3, a, cVar, yVar, aVar2, aVar3, str);
        }
    }

    /* compiled from: SearchResultSummaryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, y> {
        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final y invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            final com.amazon.aps.iva.ct.k a = com.ellation.crunchyroll.application.f.a(null, 3);
            c cVar = c.this;
            int intValue = ((Number) cVar.t.getValue()).intValue();
            EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            com.amazon.aps.iva.at.f fVar = new com.amazon.aps.iva.at.f(new com.amazon.aps.iva.yb0.t(a) { // from class: com.ellation.crunchyroll.presentation.search.result.summary.h
                @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                public final Object get() {
                    return Boolean.valueOf(((j) this.receiver).getHasPremiumBenefit());
                }
            });
            Context requireContext = cVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            com.amazon.aps.iva.yh.d dVar = new com.amazon.aps.iva.yh.d(new com.amazon.aps.iva.yh.b(requireContext));
            com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
            return new y(intValue, new com.amazon.aps.iva.x30.k(etpContentService, fVar, dVar));
        }
    }

    public c() {
        com.amazon.aps.iva.ts.b.a.getClass();
        this.r = c.a.a(this, com.amazon.aps.iva.ts.a.j);
        this.t = com.amazon.aps.iva.kb0.f.b(new e());
    }

    @Override // com.amazon.aps.iva.x30.v
    public final void Af(com.amazon.aps.iva.v30.a aVar) {
        SearchResultDetailActivity.a aVar2 = SearchResultDetailActivity.D;
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        aVar2.getClass();
        Intent intent = new Intent(requireActivity, SearchResultDetailActivity.class);
        intent.putExtra("search_detail_data", aVar);
        requireActivity.startActivity(intent);
    }

    @Override // com.amazon.aps.iva.x30.v
    public final void Ca() {
        fi((View) this.d.getValue(this, v[1]));
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void Ce(List<String> list) {
        com.amazon.aps.iva.yb0.j.f(list, "assetIds");
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void F2() {
    }

    @Override // com.amazon.aps.iva.x30.v
    public final void Id() {
        com.amazon.aps.iva.s30.g gVar = this.j;
        if (gVar != null) {
            gVar.e(z.b);
            ((View) this.d.getValue(this, v[1])).setVisibility(8);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("searchResultAdapter");
        throw null;
    }

    @Override // com.amazon.aps.iva.f60.k
    public final void Jc(com.amazon.aps.iva.b60.j jVar) {
        di().U0(jVar);
    }

    @Override // com.amazon.aps.iva.x30.v
    public final void Me(List<? extends com.amazon.aps.iva.s30.h> list) {
        com.amazon.aps.iva.yb0.j.f(list, "searchResults");
        fi(ei());
        com.amazon.aps.iva.s30.g gVar = this.j;
        if (gVar != null) {
            gVar.e(list);
        } else {
            com.amazon.aps.iva.yb0.j.m("searchResultAdapter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.x30.v
    public final void O0() {
        ((ViewGroup) this.e.getValue(this, v[2])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        startActivity(com.amazon.aps.iva.gd0.j.i(requireActivity, str));
    }

    @Override // com.amazon.aps.iva.x30.v
    public final void a() {
        fi((View) this.f.getValue(this, v[3]));
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void bg() {
        showSnackbar(com.amazon.aps.iva.bt.c.b);
    }

    public final com.amazon.aps.iva.x30.p di() {
        return (com.amazon.aps.iva.x30.p) this.q.getValue();
    }

    @Override // com.amazon.aps.iva.x30.v
    public final void e(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        com.amazon.aps.iva.yb0.j.f(aVar2, "onUndoClicked");
        int i2 = com.amazon.aps.iva.u70.c.a;
        com.amazon.aps.iva.u70.c a2 = c.a.a((ViewGroup) this.h.getValue(this, v[5]), 0, R.style.ActionSnackBarTextStyle, R.style.ActionSnackBarActionTextStyle);
        a2.b(aVar, aVar2);
        String string = a2.getContext().getString(R.string.mark_as_watched_actionbar_title, str);
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(\n     …  title\n                )");
        com.amazon.aps.iva.u70.c.c(a2, string, R.string.mark_as_watched_actionbar_undo, 0, 12);
    }

    public final RecyclerView ei() {
        return (RecyclerView) this.c.getValue(this, v[0]);
    }

    public final void fi(View view) {
        View view2 = this.l;
        if (view2 != null) {
            view2.animate().alpha(0.0f).withEndAction(new com.amazon.aps.iva.bc.b(view2, 1)).start();
        }
        view.setVisibility(0);
        view.animate().alpha(1.0f).start();
        this.l = view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_search_result_summary, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        com.amazon.aps.iva.x30.p di = di();
        com.amazon.aps.iva.f60.e eVar = this.s;
        if (eVar != null) {
            com.amazon.aps.iva.x30.c cVar = new com.amazon.aps.iva.x30.c(eVar);
            com.amazon.aps.iva.gn.d dVar = this.r;
            com.amazon.aps.iva.nt.a aVar = new com.amazon.aps.iva.nt.a(cVar, new com.amazon.aps.iva.x30.d(dVar), new com.amazon.aps.iva.x30.e(this), new com.amazon.aps.iva.x30.f(this));
            androidx.fragment.app.h requireActivity = requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            com.amazon.aps.iva.gi.e eVar2 = new com.amazon.aps.iva.gi.e(com.amazon.aps.iva.x30.g.h, dVar, new com.amazon.aps.iva.ii.a(requireActivity));
            DurationFormatter.Companion companion = DurationFormatter.Companion;
            Context requireContext = requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            DurationFormatter create = companion.create(requireContext);
            com.amazon.aps.iva.x30.p di2 = di();
            Context requireContext2 = requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext2, "requireContext()");
            com.amazon.aps.iva.r30.b a2 = a.C0662a.a(requireContext2);
            Context requireContext3 = requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext3, "requireContext()");
            this.j = new com.amazon.aps.iva.s30.g(di, aVar, eVar2, create, di2, a2, new o(requireContext3, new com.amazon.aps.iva.mt.m(requireContext3)), 64);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), getResources().getInteger(R.integer.search_result_list_spans));
            gridLayoutManager.g = new com.amazon.aps.iva.x30.h(this);
            this.k = gridLayoutManager;
            RecyclerView ei = ei();
            GridLayoutManager gridLayoutManager2 = this.k;
            if (gridLayoutManager2 != null) {
                ei.setLayoutManager(gridLayoutManager2);
                RecyclerView ei2 = ei();
                com.amazon.aps.iva.s30.g gVar = this.j;
                if (gVar != null) {
                    ei2.setAdapter(gVar);
                    RecyclerView ei3 = ei();
                    Context requireContext4 = requireContext();
                    com.amazon.aps.iva.yb0.j.e(requireContext4, "requireContext()");
                    ei3.addItemDecoration(new com.amazon.aps.iva.r30.d(requireContext4));
                    ei().setItemAnimator(null);
                    ei().addOnScrollListener(new com.amazon.aps.iva.x30.i(this));
                    l<?>[] lVarArr = v;
                    View view2 = (View) this.g.getValue(this, lVarArr[4]);
                    if (view2 != null) {
                        view2.setOnClickListener(new com.amazon.aps.iva.fe.a(this, 18));
                        f1.i(view2, f.h);
                    }
                    f1.i((View) this.d.getValue(this, lVarArr[1]), g.h);
                    f1.i((View) this.f.getValue(this, lVarArr[3]), h.h);
                    f1.i(ei(), i.h);
                    androidx.fragment.app.h requireActivity2 = requireActivity();
                    com.amazon.aps.iva.yb0.j.e(requireActivity2, "requireActivity()");
                    ((d0) com.ellation.crunchyroll.application.e.a()).y.a(requireActivity2, this, (com.amazon.aps.iva.oh.g) this.n.getValue());
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("searchResultAdapter");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("layoutManager");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("watchlistItemTogglePresenter");
        throw null;
    }

    @Override // com.amazon.aps.iva.x30.v
    public final void s(int i2) {
        com.amazon.aps.iva.s30.g gVar = this.j;
        if (gVar != null) {
            gVar.notifyItemChanged(i2);
        } else {
            com.amazon.aps.iva.yb0.j.m("searchResultAdapter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        this.s = ((com.amazon.aps.iva.f60.c) this.m.getValue()).a((com.amazon.aps.iva.f60.m) this.o.getValue(this, v[7]));
        com.amazon.aps.iva.wy.k[] kVarArr = new com.amazon.aps.iva.wy.k[3];
        kVarArr[0] = di();
        kVarArr[1] = this.r;
        com.amazon.aps.iva.f60.e eVar = this.s;
        if (eVar != null) {
            kVarArr[2] = eVar;
            return l1.I(kVarArr);
        }
        com.amazon.aps.iva.yb0.j.m("watchlistItemTogglePresenter");
        throw null;
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        androidx.fragment.app.h activity = getActivity();
        com.amazon.aps.iva.yb0.j.d(activity, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.search.SearchMessagingView");
        ((com.amazon.aps.iva.p30.d) activity).F(iVar);
    }

    @Override // com.amazon.aps.iva.x30.v
    public final void y0() {
        fi((ViewGroup) this.e.getValue(this, v[2]));
    }
}
