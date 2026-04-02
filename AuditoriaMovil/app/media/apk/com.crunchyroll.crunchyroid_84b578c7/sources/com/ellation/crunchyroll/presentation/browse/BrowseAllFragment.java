package com.ellation.crunchyroll.presentation.browse;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.lifecycle.p;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.n60.b;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.tz.b0;
import com.amazon.aps.iva.tz.d1;
import com.amazon.aps.iva.tz.e1;
import com.amazon.aps.iva.tz.f1;
import com.amazon.aps.iva.tz.g1;
import com.amazon.aps.iva.tz.h0;
import com.amazon.aps.iva.tz.h1;
import com.amazon.aps.iva.tz.i1;
import com.amazon.aps.iva.tz.o0;
import com.amazon.aps.iva.tz.p0;
import com.amazon.aps.iva.tz.y0;
import com.amazon.aps.iva.tz.z;
import com.amazon.aps.iva.u70.c;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.vz.b;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.xw.u;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.sortandfilters.currentfilters.CurrentFiltersLayout;
import com.crunchyroll.sortandfilters.filters.empty.EmptyFilterResultLayout;
import com.crunchyroll.sortandfilters.header.SortAndFiltersHeaderLayout;
import com.crunchyroll.sortandfilters.screen.SortAndFilterActivity;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.browse.c;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import com.ellation.crunchyroll.watchlist.a;
import com.ellation.widgets.alphabet.AlphabetSelectorView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: BrowseAllFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0004\t\n\u000b\fB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/BrowseAllFragment;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/tz/o0;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/f60/k;", "Lcom/amazon/aps/iva/w70/i;", "Lcom/amazon/aps/iva/oh/i;", "<init>", "()V", "BrowseAllLayoutManager", "a", "b", "c", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class BrowseAllFragment extends com.amazon.aps.iva.qy.a implements o0, com.amazon.aps.iva.gn.e, com.amazon.aps.iva.f60.k, com.amazon.aps.iva.w70.i, com.amazon.aps.iva.oh.i {
    public final v c = com.amazon.aps.iva.xw.g.f(this, R.id.content_layout);
    public final v d = com.amazon.aps.iva.xw.g.f(this, R.id.browse_all_recycler_view);
    public final v e = com.amazon.aps.iva.xw.g.f(this, R.id.browse_all_header_layout);
    public final v f;
    public final v g;
    public final v h;
    public final v i;
    public final m j;
    public final u k;
    public final com.amazon.aps.iva.ez.f l;
    public final String m;
    public final com.amazon.aps.iva.ls.a n;
    public final com.amazon.aps.iva.ws.a o;
    public b0 p;
    public com.amazon.aps.iva.gn.d q;
    public com.amazon.aps.iva.f60.e r;
    public final int s;
    public final m t;
    public final com.amazon.aps.iva.ez.f u;
    public static final /* synthetic */ l<Object>[] w = {q.a(BrowseAllFragment.class, "contentLayout", "getContentLayout()Landroid/view/ViewGroup;", 0), q.a(BrowseAllFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), q.a(BrowseAllFragment.class, "headerLayout", "getHeaderLayout()Lcom/crunchyroll/sortandfilters/header/SortAndFiltersHeaderLayout;", 0), q.a(BrowseAllFragment.class, "headerContainer", "getHeaderContainer()Landroid/view/View;", 0), q.a(BrowseAllFragment.class, "alphabetSelectorView", "getAlphabetSelectorView()Lcom/ellation/widgets/alphabet/AlphabetSelectorView;", 0), q.a(BrowseAllFragment.class, "currentFiltersLayout", "getCurrentFiltersLayout()Lcom/crunchyroll/sortandfilters/currentfilters/CurrentFiltersLayout;", 0), q.a(BrowseAllFragment.class, "emptyFilterResultLayout", "getEmptyFilterResultLayout()Lcom/crunchyroll/sortandfilters/filters/empty/EmptyFilterResultLayout;", 0), q.a(BrowseAllFragment.class, "emptyCardsRecyclerView", "getEmptyCardsRecyclerView()Lcom/ellation/crunchyroll/presentation/browse/EmptyBrowseAllCardsRecyclerView;", 0), defpackage.e.b(BrowseAllFragment.class, "preselectedSortOption", "getPreselectedSortOption()Lcom/ellation/crunchyroll/presentation/browse/sorting/BrowseSortOption;", 0), q.a(BrowseAllFragment.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/browse/BrowseAllViewModel;", 0), q.a(BrowseAllFragment.class, "cardWatchlistItemToggleViewModel", "getCardWatchlistItemToggleViewModel()Lcom/ellation/crunchyroll/watchlisttoggle/CardWatchlistItemToggleViewModelImpl;", 0)};
    public static final a v = new a();

    /* compiled from: BrowseAllFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/BrowseAllFragment$BrowseAllLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class BrowseAllLayoutManager extends GridLayoutManager {
        public final com.amazon.aps.iva.uz.c i;
        public final boolean j;

        /* compiled from: BrowseAllFragment.kt */
        /* loaded from: classes2.dex */
        public static final class a extends GridLayoutManager.c {
            public a() {
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int c(int i) {
                BrowseAllLayoutManager browseAllLayoutManager = BrowseAllLayoutManager.this;
                com.amazon.aps.iva.uz.c cVar = browseAllLayoutManager.i;
                int i2 = browseAllLayoutManager.b;
                int itemViewType = cVar.getItemViewType(i);
                if (itemViewType != 10 && itemViewType != 11) {
                    if (itemViewType != 31 && itemViewType != 32) {
                        switch (itemViewType) {
                            case 21:
                            case 22:
                            case ConnectionResult.API_DISABLED /* 23 */:
                                break;
                            default:
                                throw new IllegalArgumentException(c0.a("Unsupported type ", itemViewType));
                        }
                    }
                    return 1;
                }
                return i2;
            }
        }

        public BrowseAllLayoutManager(Context context, com.amazon.aps.iva.uz.c cVar, boolean z) {
            super(context, context.getResources().getInteger(R.integer.panel_card_number_of_columns));
            this.i = cVar;
            this.j = z;
            this.g = new a();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
        public final boolean canScrollVertically() {
            return this.j;
        }
    }

    /* compiled from: BrowseAllFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: BrowseAllFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements com.amazon.aps.iva.sn.a {
        public final String b;

        public b(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "browseModuleKey");
            this.b = str;
        }

        @Override // com.amazon.aps.iva.sn.a
        public final com.amazon.aps.iva.o3.e C() {
            com.amazon.aps.iva.yz.a.h.getClass();
            String str = this.b;
            com.amazon.aps.iva.yb0.j.f(str, "browseModuleKey");
            com.amazon.aps.iva.yz.a aVar = new com.amazon.aps.iva.yz.a();
            aVar.g.b(aVar, com.amazon.aps.iva.yz.a.i[0], str);
            return new com.amazon.aps.iva.o3.e(aVar, R.string.sort_and_filters_filter);
        }
    }

    /* compiled from: BrowseAllFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements com.amazon.aps.iva.sn.a {
        public final String b;

        public c(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "browseModuleKey");
            this.b = str;
        }

        @Override // com.amazon.aps.iva.sn.a
        public final com.amazon.aps.iva.o3.e C() {
            com.amazon.aps.iva.a00.a.k.getClass();
            String str = this.b;
            com.amazon.aps.iva.yb0.j.f(str, "browseModuleKey");
            com.amazon.aps.iva.a00.a aVar = new com.amazon.aps.iva.a00.a();
            aVar.j.b(aVar, com.amazon.aps.iva.a00.a.l[0], str);
            return new com.amazon.aps.iva.o3.e(aVar, R.string.sort_and_filters_sort);
        }
    }

    /* compiled from: BrowseAllFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.f60.c> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.f60.c invoke() {
            int i = com.amazon.aps.iva.f60.c.a;
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.BROWSE;
            EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            com.amazon.aps.iva.yb0.j.f(aVar, "screen");
            com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
            BrowseAllFragment browseAllFragment = BrowseAllFragment.this;
            com.amazon.aps.iva.yb0.j.f(browseAllFragment, "view");
            return new com.amazon.aps.iva.f60.d(aVar, etpContentService, browseAllFragment);
        }
    }

    /* compiled from: BrowseAllFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.f60.m> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.f60.m invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            return BrowseAllFragment.di(BrowseAllFragment.this).b();
        }
    }

    /* compiled from: BrowseAllFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.ellation.crunchyroll.presentation.browse.c> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.ellation.crunchyroll.presentation.browse.c invoke() {
            c.a aVar = com.ellation.crunchyroll.presentation.browse.c.a;
            BrowseAllFragment browseAllFragment = BrowseAllFragment.this;
            String gi = browseAllFragment.gi();
            l<?> lVar = BrowseAllFragment.w[8];
            aVar.getClass();
            return c.a.a(browseAllFragment, gi, (com.amazon.aps.iva.a00.b) browseAllFragment.k.getValue(browseAllFragment, lVar));
        }
    }

    /* compiled from: BrowseAllFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class g extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public g(b0 b0Var) {
            super(0, b0Var, z.class, "onFilterClick", "onFilterClick()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((z) this.receiver).z();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BrowseAllFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class h extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public h(b0 b0Var) {
            super(0, b0Var, z.class, "onSortClick", "onSortClick()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((z) this.receiver).J();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BrowseAllFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i implements com.amazon.aps.iva.k50.h {
        public i() {
        }

        @Override // com.amazon.aps.iva.k50.h
        public final void t(Panel panel) {
            com.amazon.aps.iva.yb0.j.f(panel, "panel");
            ShowPageActivity.a aVar = ShowPageActivity.K;
            Context requireContext = BrowseAllFragment.this.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            aVar.getClass();
            ShowPageActivity.a.a(requireContext, panel);
        }
    }

    /* compiled from: BrowseAllFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class j extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public j(b0 b0Var) {
            super(0, b0Var, z.class, "onRetry", "onRetry()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((z) this.receiver).b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BrowseAllFragment.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.ellation.crunchyroll.presentation.browse.a> {
        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.ellation.crunchyroll.presentation.browse.a invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            a aVar = BrowseAllFragment.v;
            return BrowseAllFragment.this.ei(null, null);
        }
    }

    public BrowseAllFragment() {
        com.amazon.aps.iva.xw.g.f(this, R.id.browse_all_header_container);
        this.f = com.amazon.aps.iva.xw.g.f(this, R.id.alphabet_selector_view);
        this.g = com.amazon.aps.iva.xw.g.f(this, R.id.browse_all_current_filters_layout);
        this.h = com.amazon.aps.iva.xw.g.f(this, R.id.empty_filter_result_layout);
        this.i = com.amazon.aps.iva.xw.g.f(this, R.id.browse_all_empty_cards_recycler_view);
        this.j = com.amazon.aps.iva.kb0.f.b(new f());
        this.k = new u("sort_option");
        this.l = new com.amazon.aps.iva.ez.f(this, com.ellation.crunchyroll.presentation.browse.a.class, new k());
        this.m = "BROWSE_ALL";
        this.n = com.amazon.aps.iva.ls.a.BROWSE_ALL;
        this.o = new com.amazon.aps.iva.ws.a();
        this.s = R.string.all_tab_name;
        this.t = com.amazon.aps.iva.kb0.f.b(new d());
        this.u = new com.amazon.aps.iva.ez.f(this, com.amazon.aps.iva.f60.m.class, new e());
    }

    public static final com.amazon.aps.iva.f60.c di(BrowseAllFragment browseAllFragment) {
        return (com.amazon.aps.iva.f60.c) browseAllFragment.t.getValue();
    }

    private final com.ellation.crunchyroll.presentation.browse.c ji() {
        return (com.ellation.crunchyroll.presentation.browse.c) this.j.getValue();
    }

    private final RecyclerView li() {
        return (RecyclerView) this.d.getValue(this, w[1]);
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void Ce(List<String> list) {
        com.amazon.aps.iva.yb0.j.f(list, "assetIds");
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void F2() {
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int G() {
        return 0;
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void G0(List<? extends com.amazon.aps.iva.uz.h> list) {
        EmptyBrowseAllCardsRecyclerView hi = hi();
        y0 c2 = ji().c();
        hi.getClass();
        com.amazon.aps.iva.yb0.j.f(c2, "sectionIndexer");
        com.amazon.aps.iva.uz.c cVar = new com.amazon.aps.iva.uz.c(c2, new com.amazon.aps.iva.nt.a(d1.h, e1.h, f1.h, g1.h), h1.h);
        hi.setAdapter(cVar);
        Context context = hi.getContext();
        com.amazon.aps.iva.yb0.j.e(context, "context");
        hi.setLayoutManager(new BrowseAllLayoutManager(context, cVar, false));
        h.d dVar = new h.d(new i1(list), list.size());
        dVar.d = com.amazon.aps.iva.vu.a.a;
        dVar.c = com.amazon.aps.iva.vu.a.b;
        cVar.e(dVar.a());
        AnimationUtil.INSTANCE.fadeInAndOut(li(), hi());
        fi().b();
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int H6() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void I0() {
        int i2 = SortAndFilterActivity.n;
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        SortAndFilterActivity.a.a(requireActivity, new c(gi()));
    }

    @Override // com.amazon.aps.iva.f60.k
    public final void Jc(com.amazon.aps.iva.b60.j jVar) {
        b0 b0Var = this.p;
        if (b0Var != null) {
            b0Var.U0(jVar);
        } else {
            com.amazon.aps.iva.yb0.j.m("presenter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void T5() {
        RecyclerView.h adapter = li().getAdapter();
        com.amazon.aps.iva.yb0.j.d(adapter, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.browse.adapter.BrowseAllAdapter");
        ((com.amazon.aps.iva.uz.c) adapter).e(null);
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        startActivity(com.amazon.aps.iva.gd0.j.i(requireActivity, str));
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void b2() {
        ((EmptyFilterResultLayout) this.h.getValue(this, w[6])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void bg() {
        showSnackbar(com.amazon.aps.iva.bt.c.b);
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void c() {
        ViewGroup viewGroup = (ViewGroup) this.c.getValue(this, w[0]);
        b0 b0Var = this.p;
        if (b0Var != null) {
            com.amazon.aps.iva.k60.a.d(viewGroup, new j(b0Var), null, 0, 0, 0L, 0L, 254);
        } else {
            com.amazon.aps.iva.yb0.j.m("presenter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void d2(com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h> hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "pagedList");
        RecyclerView.h adapter = li().getAdapter();
        com.amazon.aps.iva.yb0.j.d(adapter, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.browse.adapter.BrowseAllAdapter");
        ((com.amazon.aps.iva.uz.c) adapter).e(hVar);
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void e(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        ViewParent viewParent;
        com.amazon.aps.iva.yb0.j.f(aVar2, "onUndoClicked");
        int i2 = com.amazon.aps.iva.u70.c.a;
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        com.amazon.aps.iva.yb0.j.d(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
        com.amazon.aps.iva.u70.c a2 = c.a.a((ViewGroup) viewParent, 0, R.style.ActionSnackBarTextStyle, R.style.ActionSnackBarActionTextStyle);
        a2.b(aVar, aVar2);
        String string = requireContext().getString(R.string.mark_as_watched_actionbar_title, str);
        com.amazon.aps.iva.yb0.j.e(string, "requireContext().getStri…itle, title\n            )");
        com.amazon.aps.iva.u70.c.c(a2, string, R.string.mark_as_watched_actionbar_undo, 0, 12);
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void ed() {
        ((CurrentFiltersLayout) this.g.getValue(this, w[5])).setVisibility(0);
    }

    public final com.ellation.crunchyroll.presentation.browse.a ei(com.amazon.aps.iva.l10.a aVar, com.amazon.aps.iva.l10.a aVar2) {
        return new com.ellation.crunchyroll.presentation.browse.a(gi(), aVar, aVar2, ji().e(), ji().a());
    }

    public final AlphabetSelectorView fi() {
        return (AlphabetSelectorView) this.f.getValue(this, w[4]);
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void g0() {
        AnimationUtil.INSTANCE.fadeInAndOut(hi(), li());
        fi().b();
    }

    public String gi() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void h2() {
        hi().setVisibility(8);
    }

    public final EmptyBrowseAllCardsRecyclerView hi() {
        return (EmptyBrowseAllCardsRecyclerView) this.i.getValue(this, w[7]);
    }

    public final SortAndFiltersHeaderLayout ii() {
        return (SortAndFiltersHeaderLayout) this.e.getValue(this, w[2]);
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void k2() {
        AnimationUtil.INSTANCE.fadeInAndOut(hi(), (EmptyFilterResultLayout) this.h.getValue(this, w[6]));
    }

    public com.amazon.aps.iva.ws.b ki() {
        return this.o;
    }

    public final void ld() {
        ImageView imageView = ii().b.e;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.sortAndFiltersHeaderSortButton");
        imageView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void m2() {
        int i2 = SortAndFilterActivity.n;
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        SortAndFilterActivity.a.a(requireActivity, new b(gi()));
    }

    public com.amazon.aps.iva.ls.a mi() {
        return this.n;
    }

    public p0 ni() {
        return (p0) this.l.getValue(this, w[9]);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_browse_all, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        y0 c2 = ji().c();
        com.amazon.aps.iva.f60.e eVar = this.r;
        if (eVar != null) {
            com.amazon.aps.iva.tz.h hVar = new com.amazon.aps.iva.tz.h(eVar);
            com.amazon.aps.iva.gn.d dVar = this.q;
            if (dVar != null) {
                com.amazon.aps.iva.nt.a aVar = new com.amazon.aps.iva.nt.a(hVar, new com.amazon.aps.iva.tz.i(dVar), new com.amazon.aps.iva.tz.j(this), new com.amazon.aps.iva.tz.k(this));
                b0 b0Var = this.p;
                if (b0Var != null) {
                    com.amazon.aps.iva.uz.c cVar = new com.amazon.aps.iva.uz.c(c2, aVar, new com.amazon.aps.iva.tz.l(b0Var));
                    RecyclerView li = li();
                    Context requireContext = requireContext();
                    com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
                    li.setLayoutManager(new BrowseAllLayoutManager(requireContext, cVar, true));
                    fi().setIndexer(ji().c());
                    li().setAdapter(cVar);
                    AlphabetSelectorView fi = fi();
                    RecyclerView li2 = li();
                    b0 b0Var2 = this.p;
                    if (b0Var2 != null) {
                        fi.getClass();
                        com.amazon.aps.iva.yb0.j.f(li2, "recyclerView");
                        fi.b = li2;
                        fi.E = b0Var2;
                        li2.addOnScrollListener(new com.amazon.aps.iva.b70.a(fi));
                        li().addItemDecoration(new h0());
                        l<?>[] lVarArr = w;
                        ((CurrentFiltersLayout) this.g.getValue(this, lVarArr[5])).b1(ji().a(), ji().d());
                        ((EmptyFilterResultLayout) this.h.getValue(this, lVarArr[6])).b1(ji().a(), ji().d());
                        SortAndFiltersHeaderLayout ii = ii();
                        com.amazon.aps.iva.mn.j a2 = ji().a();
                        ii.getClass();
                        com.amazon.aps.iva.yb0.j.f(a2, "interactor");
                        com.ellation.crunchyroll.mvp.lifecycle.a.b(new com.amazon.aps.iva.rn.b(ii, a2), ii);
                        ii.getClass();
                        SortAndFiltersHeaderLayout ii2 = ii();
                        b0 b0Var3 = this.p;
                        if (b0Var3 != null) {
                            ii2.setOnFilterClick(new g(b0Var3));
                            SortAndFiltersHeaderLayout ii3 = ii();
                            b0 b0Var4 = this.p;
                            if (b0Var4 != null) {
                                ii3.setOnSortClick(new h(b0Var4));
                                Activity a3 = com.amazon.aps.iva.xw.q.a(requireContext());
                                com.amazon.aps.iva.yb0.j.d(a3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                com.amazon.aps.iva.oh.g b2 = ji().b();
                                ((d0) com.ellation.crunchyroll.application.e.a()).y.a((androidx.fragment.app.h) a3, this, b2);
                                return;
                            }
                            com.amazon.aps.iva.yb0.j.m("presenter");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("presenter");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("presenter");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("presenter");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("sharePresenter");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("watchlistItemTogglePresenter");
        throw null;
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final boolean q0() {
        if (getView() == null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void rf() {
        ((CurrentFiltersLayout) this.g.getValue(this, w[5])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.tz.o0
    public final void s(int i2) {
        RecyclerView.h adapter = li().getAdapter();
        com.amazon.aps.iva.yb0.j.d(adapter, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.browse.adapter.BrowseAllAdapter");
        ((com.amazon.aps.iva.uz.c) adapter).notifyItemChanged(i2);
    }

    public Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        p0 ni = ni();
        com.amazon.aps.iva.vz.c a2 = b.a.a();
        com.amazon.aps.iva.ws.f a3 = d.a.a(mi());
        com.amazon.aps.iva.ws.b ki = ki();
        i iVar = new i();
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c2 = aVar.c().c(com.amazon.aps.iva.cx.p.class, "app_resume_screens_reload_intervals");
            if (c2 != null) {
                com.amazon.aps.iva.n60.c a4 = b.a.a((com.amazon.aps.iva.cx.p) c2);
                com.amazon.aps.iva.oh.g b2 = ji().b();
                com.ellation.crunchyroll.watchlist.a.u0.getClass();
                com.ellation.crunchyroll.watchlist.a aVar2 = a.C0975a.b;
                com.amazon.aps.iva.yb0.j.f(ni, "viewModel");
                com.amazon.aps.iva.yb0.j.f(ki, "panelAnalyticsDataFactory");
                com.amazon.aps.iva.yb0.j.f(aVar2, "watchlistChangeRegister");
                com.amazon.aps.iva.yb0.j.f(b2, "markAsWatchedToggleViewModel");
                this.p = new b0(this, ni, a2, a3, ki, iVar, a4, aVar2, b2);
                com.amazon.aps.iva.ts.b.a.getClass();
                this.q = c.a.a(this, com.amazon.aps.iva.ts.a.j);
                com.amazon.aps.iva.f60.h a5 = ((com.amazon.aps.iva.f60.c) this.t.getValue()).a((com.amazon.aps.iva.f60.m) this.u.getValue(this, w[10]));
                this.r = a5;
                com.amazon.aps.iva.wy.k[] kVarArr = new com.amazon.aps.iva.wy.k[3];
                b0 b0Var = this.p;
                if (b0Var != null) {
                    kVarArr[0] = b0Var;
                    com.amazon.aps.iva.gn.d dVar = this.q;
                    if (dVar != null) {
                        kVarArr[1] = dVar;
                        if (a5 != null) {
                            kVarArr[2] = a5;
                            return l1.I(kVarArr);
                        }
                        com.amazon.aps.iva.yb0.j.m("watchlistItemTogglePresenter");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("sharePresenter");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("presenter");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.ScreenReloadIntervalsImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i2 = com.amazon.aps.iva.u70.h.a;
        View findViewById = requireActivity().findViewById(R.id.errors_layout);
        com.amazon.aps.iva.yb0.j.e(findViewById, "requireActivity().findViewById(R.id.errors_layout)");
        h.a.a((ViewGroup) findViewById, iVar);
    }
}
