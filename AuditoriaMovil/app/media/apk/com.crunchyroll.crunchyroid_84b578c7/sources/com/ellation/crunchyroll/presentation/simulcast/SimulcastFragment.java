package com.ellation.crunchyroll.presentation.simulcast;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.p;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f60.k;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.n60.b;
import com.amazon.aps.iva.tz.h0;
import com.amazon.aps.iva.tz.i1;
import com.amazon.aps.iva.u70.c;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.w40.b0;
import com.amazon.aps.iva.w40.l0;
import com.amazon.aps.iva.w40.n0;
import com.amazon.aps.iva.w40.o0;
import com.amazon.aps.iva.w40.p0;
import com.amazon.aps.iva.w40.t;
import com.amazon.aps.iva.w40.u;
import com.amazon.aps.iva.w40.w;
import com.amazon.aps.iva.w40.z;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.connectivity.d;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.simulcast.SimulcastSeason;
import com.ellation.crunchyroll.presentation.content.seasons.SelectedSeasonFragment;
import com.ellation.crunchyroll.presentation.content.seasons.SimulcastSeasonPicker;
import com.ellation.crunchyroll.presentation.content.seasons.a;
import com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryActivity;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import com.ellation.crunchyroll.watchlist.a;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SimulcastFragment.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002\f\rB\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ellation/crunchyroll/presentation/simulcast/SimulcastFragment;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/w40/n0;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/f60/k;", "Landroidx/appcompat/widget/Toolbar$h;", "Lcom/amazon/aps/iva/v10/k;", "Lcom/amazon/aps/iva/oh/i;", "Lcom/amazon/aps/iva/us/a;", "Lcom/amazon/aps/iva/w70/i;", "<init>", "()V", "a", "SimulcastLayoutManager", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SimulcastFragment extends com.amazon.aps.iva.qy.a implements n0, com.amazon.aps.iva.gn.e, k, Toolbar.h, com.amazon.aps.iva.v10.k, com.amazon.aps.iva.oh.i, com.amazon.aps.iva.us.a, com.amazon.aps.iva.w70.i {
    public final int c = R.string.bottom_navigation_tab_simulcast;
    public final v d = com.amazon.aps.iva.xw.g.f(this, R.id.toolbar);
    public final v e = com.amazon.aps.iva.xw.g.f(this, R.id.content_layout);
    public final v f = com.amazon.aps.iva.xw.g.f(this, R.id.simulcast_list);
    public final v g = com.amazon.aps.iva.xw.g.f(this, R.id.simulcast_picker_container);
    public final v h = com.amazon.aps.iva.xw.g.f(this, R.id.overlay_progress);
    public final v i = com.amazon.aps.iva.xw.g.f(this, R.id.empty_results_text);
    public final v j = com.amazon.aps.iva.xw.g.f(this, R.id.simulcast_empty_cards_recycler_view);
    public final com.amazon.aps.iva.ez.f k = new com.amazon.aps.iva.ez.f(this, p0.class, new i());
    public final com.amazon.aps.iva.f60.d l;
    public final com.amazon.aps.iva.ez.f m;
    public final s n;
    public b0 o;
    public com.amazon.aps.iva.gn.d p;
    public com.amazon.aps.iva.f60.e q;
    public final com.amazon.aps.iva.ls.a r;
    public final m s;
    public static final /* synthetic */ l<Object>[] u = {q.a(SimulcastFragment.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), q.a(SimulcastFragment.class, "contentLayout", "getContentLayout()Landroid/view/ViewGroup;", 0), q.a(SimulcastFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), q.a(SimulcastFragment.class, "seasonPickerContainer", "getSeasonPickerContainer()Landroid/view/ViewGroup;", 0), q.a(SimulcastFragment.class, "overlayProgress", "getOverlayProgress()Landroid/view/View;", 0), q.a(SimulcastFragment.class, "emptyResultsView", "getEmptyResultsView()Landroid/view/View;", 0), q.a(SimulcastFragment.class, "emptyCardsRecyclerView", "getEmptyCardsRecyclerView()Lcom/ellation/crunchyroll/presentation/simulcast/EmptySimulcastCardsRecyclerView;", 0), q.a(SimulcastFragment.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/simulcast/SimulcastViewModel;", 0), q.a(SimulcastFragment.class, "cardWatchlistItemToggleViewModel", "getCardWatchlistItemToggleViewModel()Lcom/ellation/crunchyroll/watchlisttoggle/CardWatchlistItemToggleViewModelImpl;", 0), defpackage.e.b(SimulcastFragment.class, "showToolbar", "getShowToolbar()Z", 0)};
    public static final a t = new a();

    /* compiled from: SimulcastFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ellation/crunchyroll/presentation/simulcast/SimulcastFragment$SimulcastLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class SimulcastLayoutManager extends GridLayoutManager {
        public final boolean i;

        public SimulcastLayoutManager(Context context, boolean z) {
            super(context, context.getResources().getInteger(R.integer.panel_card_number_of_columns));
            this.i = z;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
        public final boolean canScrollVertically() {
            return this.i;
        }
    }

    /* compiled from: SimulcastFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: SimulcastFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.f60.m> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.f60.m invoke(p pVar) {
            j.f(pVar, "it");
            return SimulcastFragment.this.l.b();
        }
    }

    /* compiled from: SimulcastFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oh.g> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oh.g invoke() {
            SimulcastFragment simulcastFragment = SimulcastFragment.this;
            Context requireContext = simulcastFragment.requireContext();
            j.e(requireContext, "requireContext()");
            return ((d0) com.ellation.crunchyroll.application.e.a()).y.b(requireContext, simulcastFragment.r);
        }
    }

    /* compiled from: SeasonsDialog.kt */
    /* loaded from: classes2.dex */
    public static final class d implements com.amazon.aps.iva.n4.v {
        public final /* synthetic */ z b;

        public d(b0 b0Var) {
            this.b = b0Var;
        }

        @Override // com.amazon.aps.iva.n4.v
        public final void i6(Bundle bundle, String str) {
            Object obj;
            j.f(str, "<anonymous parameter 0>");
            if (bundle.containsKey("selected_season_result")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = bundle.getSerializable("selected_season_result", SimulcastSeason.class);
                } else {
                    obj = (SimulcastSeason) bundle.getSerializable("selected_season_result");
                }
                j.c(obj);
                this.b.V0((SimulcastSeason) obj);
            }
        }
    }

    /* compiled from: SimulcastFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, com.ellation.crunchyroll.presentation.simulcast.a.h, 251);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SimulcastFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f implements com.amazon.aps.iva.k50.h {
        public f() {
        }

        @Override // com.amazon.aps.iva.k50.h
        public final void t(Panel panel) {
            j.f(panel, "panel");
            ShowPageActivity.a aVar = ShowPageActivity.K;
            Context requireContext = SimulcastFragment.this.requireContext();
            j.e(requireContext, "requireContext()");
            aVar.getClass();
            ShowPageActivity.a.a(requireContext, panel);
        }
    }

    /* compiled from: SimulcastFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class g extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
        public g(Object obj) {
            super(0, obj, SimulcastFragment.class, "isResumed", "isResumed()Z", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.valueOf(((SimulcastFragment) this.receiver).isResumed());
        }
    }

    /* compiled from: SimulcastFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class h extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public h(b0 b0Var) {
            super(0, b0Var, z.class, "onRetry", "onRetry()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((z) this.receiver).b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SimulcastFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, p0> {
        public i() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final p0 invoke(p pVar) {
            j.f(pVar, "it");
            EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            j.f(etpContentService, "contentApi");
            l0 l0Var = new l0(etpContentService);
            SimulcastFragment simulcastFragment = SimulcastFragment.this;
            Context requireContext = simulcastFragment.requireContext();
            j.e(requireContext, "requireContext()");
            androidx.lifecycle.g lifecycle = simulcastFragment.getLifecycle();
            j.e(lifecycle, "this.lifecycle");
            com.crunchyroll.connectivity.d a = d.a.a(requireContext, lifecycle);
            EtpContentService etpContentService2 = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            j.f(etpContentService2, "contentService");
            return new p0(l0Var, new com.amazon.aps.iva.w40.h(a, etpContentService2));
        }
    }

    public SimulcastFragment() {
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.WATCHLIST;
        EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
        j.f(aVar, "screen");
        j.f(etpContentService, "etpContentService");
        this.l = new com.amazon.aps.iva.f60.d(aVar, etpContentService, this);
        this.m = new com.amazon.aps.iva.ez.f(this, com.amazon.aps.iva.f60.m.class, new b());
        this.n = new s("showToolBar");
        this.r = com.amazon.aps.iva.ls.a.SIMULCAST;
        this.s = com.amazon.aps.iva.kb0.f.b(new c());
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void C0() {
        ei().setVisibility(0);
        ((View) this.i.getValue(this, u[5])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void Ce(List<String> list) {
        j.f(list, "assetIds");
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void F2() {
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int G() {
        return 0;
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void G0(List<? extends com.amazon.aps.iva.uz.h> list) {
        j.f(list, "emptyCards");
        EmptySimulcastCardsRecyclerView di = di();
        di.getClass();
        com.amazon.aps.iva.w40.l lVar = new com.amazon.aps.iva.w40.l(new com.amazon.aps.iva.nt.a(com.amazon.aps.iva.w40.a.h, com.amazon.aps.iva.w40.b.h, com.amazon.aps.iva.w40.c.h, com.amazon.aps.iva.w40.d.h), com.amazon.aps.iva.w40.e.h);
        di.setAdapter(lVar);
        Context context = di.getContext();
        j.e(context, "context");
        di.setLayoutManager(new SimulcastLayoutManager(context, false));
        h.d dVar = new h.d(new i1(list), list.size());
        dVar.d = com.amazon.aps.iva.vu.a.a;
        dVar.c = com.amazon.aps.iva.vu.a.b;
        lVar.e(dVar.a());
        AnimationUtil.INSTANCE.fadeInAndOut(ei(), di());
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void G2(List<SimulcastSeason> list) {
        Fragment B = getChildFragmentManager().B(R.id.simulcast_picker);
        j.d(B, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.content.seasons.SimulcastSeasonPicker");
        l<Object>[] lVarArr = SelectedSeasonFragment.f;
        ((com.amazon.aps.iva.m00.k) ((SimulcastSeasonPicker) B).e.getValue()).B2(list, null);
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int H6() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.f60.k
    public final void Jc(com.amazon.aps.iva.b60.j jVar) {
        b0 b0Var = this.o;
        if (b0Var != null) {
            b0Var.U0(jVar);
        } else {
            j.m("presenter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void K() {
        ((View) this.h.getValue(this, u[4])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void Mh() {
        ((ViewGroup) this.g.getValue(this, u[3])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void N() {
        ((View) this.h.getValue(this, u[4])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void Q8(SimulcastSeason simulcastSeason) {
        j.f(simulcastSeason, "season");
        Fragment B = getChildFragmentManager().B(R.id.simulcast_picker);
        j.d(B, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.content.seasons.SimulcastSeasonPicker");
        ((com.amazon.aps.iva.m00.k) ((SimulcastSeasonPicker) B).e.getValue()).U1(simulcastSeason);
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        j.f(str, ImagesContract.URL);
        androidx.fragment.app.h requireActivity = requireActivity();
        j.e(requireActivity, "requireActivity()");
        startActivity(com.amazon.aps.iva.gd0.j.i(requireActivity, str));
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void Zh() {
        ((ViewGroup) this.g.getValue(this, u[3])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void bg() {
        showSnackbar(com.amazon.aps.iva.bt.c.b);
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void c() {
        ViewGroup viewGroup = (ViewGroup) this.e.getValue(this, u[1]);
        b0 b0Var = this.o;
        if (b0Var != null) {
            com.amazon.aps.iva.k60.a.d(viewGroup, new h(b0Var), null, 0, 0, 0L, 0L, 254);
        } else {
            j.m("presenter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void d2(com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h> hVar) {
        j.f(hVar, "pagedList");
        RecyclerView.h adapter = ei().getAdapter();
        j.d(adapter, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.simulcast.SimulcastAdapter");
        ((com.amazon.aps.iva.w40.l) adapter).e(hVar);
    }

    public final EmptySimulcastCardsRecyclerView di() {
        return (EmptySimulcastCardsRecyclerView) this.j.getValue(this, u[6]);
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void e(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        ViewParent viewParent;
        j.f(aVar2, "onUndoClicked");
        int i2 = com.amazon.aps.iva.u70.c.a;
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        j.d(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
        com.amazon.aps.iva.u70.c a2 = c.a.a((ViewGroup) viewParent, 0, R.style.ActionSnackBarTextStyle, R.style.ActionSnackBarActionTextStyle);
        a2.b(aVar, aVar2);
        String string = a2.getContext().getString(R.string.mark_as_watched_actionbar_title, str);
        j.e(string, "context.getString(\n     …  title\n                )");
        com.amazon.aps.iva.u70.c.c(a2, string, R.string.mark_as_watched_actionbar_undo, 0, 12);
    }

    public final RecyclerView ei() {
        return (RecyclerView) this.f.getValue(this, u[2]);
    }

    public final Toolbar fi() {
        return (Toolbar) this.d.getValue(this, u[0]);
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void g0() {
        AnimationUtil.INSTANCE.fadeInAndOut(di(), ei());
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void h2() {
        di().setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_simulcast, viewGroup, false);
        j.e(inflate, "inflater.inflate(R.layou…ulcast, container, false)");
        return inflate;
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public final boolean onMenuItemClick(MenuItem menuItem) {
        j.f(menuItem, "menuItem");
        if (menuItem.getItemId() == R.id.menu_item_search) {
            SearchResultSummaryActivity.a aVar = SearchResultSummaryActivity.r;
            androidx.fragment.app.h requireActivity = requireActivity();
            j.e(requireActivity, "requireActivity()");
            aVar.getClass();
            SearchResultSummaryActivity.a.a(requireActivity);
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        l<?>[] lVarArr = u;
        l<?> lVar = lVarArr[9];
        s sVar = this.n;
        if (((Boolean) sVar.getValue(this, lVar)).booleanValue()) {
            fi().inflateMenu(R.menu.menu_main);
            fi().setOnMenuItemClickListener(this);
        }
        super.onViewCreated(view, bundle);
        if (((Boolean) sVar.getValue(this, lVarArr[9])).booleanValue()) {
            ((d0) com.ellation.crunchyroll.application.e.a()).j.addCastButton(fi());
            f1.i(fi(), e.h);
        } else {
            fi().setVisibility(8);
        }
        com.amazon.aps.iva.f60.e eVar = this.q;
        if (eVar != null) {
            com.amazon.aps.iva.w40.s sVar2 = new com.amazon.aps.iva.w40.s(eVar);
            com.amazon.aps.iva.gn.d dVar = this.p;
            if (dVar != null) {
                com.amazon.aps.iva.nt.a aVar = new com.amazon.aps.iva.nt.a(sVar2, new t(dVar), new u(this), new com.amazon.aps.iva.w40.v(this));
                b0 b0Var = this.o;
                if (b0Var != null) {
                    com.amazon.aps.iva.w40.l lVar2 = new com.amazon.aps.iva.w40.l(aVar, new w(b0Var));
                    RecyclerView ei = ei();
                    Context requireContext = requireContext();
                    j.e(requireContext, "requireContext()");
                    ei.setLayoutManager(new SimulcastLayoutManager(requireContext, true));
                    ei().setAdapter(lVar2);
                    ei().addItemDecoration(new h0());
                    a.C0969a c0969a = com.ellation.crunchyroll.presentation.content.seasons.a.h;
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    j.e(childFragmentManager, "childFragmentManager");
                    b0 b0Var2 = this.o;
                    if (b0Var2 != null) {
                        childFragmentManager.b0("season_dialog", this, new d(b0Var2));
                        Activity a2 = com.amazon.aps.iva.xw.q.a(requireContext());
                        j.d(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        ((d0) com.ellation.crunchyroll.application.e.a()).y.a((androidx.fragment.app.h) a2, this, (com.amazon.aps.iva.oh.g) this.s.getValue());
                        return;
                    }
                    j.m("presenter");
                    throw null;
                }
                j.m("presenter");
                throw null;
            }
            j.m("sharePresenter");
            throw null;
        }
        j.m("watchlistItemTogglePresenter");
        throw null;
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void s(int i2) {
        RecyclerView.h adapter = ei().getAdapter();
        j.d(adapter, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.simulcast.SimulcastAdapter");
        ((com.amazon.aps.iva.w40.l) adapter).notifyItemChanged(i2);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        com.amazon.aps.iva.ts.b.a.getClass();
        this.p = c.a.a(this, com.amazon.aps.iva.ts.a.j);
        l<?>[] lVarArr = u;
        l<?> lVar = lVarArr[8];
        this.q = this.l.a((com.amazon.aps.iva.f60.m) this.m.getValue(this, lVar));
        o0 o0Var = (o0) this.k.getValue(this, lVarArr[7]);
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c2 = aVar.c().c(com.amazon.aps.iva.cx.p.class, "app_resume_screens_reload_intervals");
            if (c2 != null) {
                com.amazon.aps.iva.n60.c a2 = b.a.a((com.amazon.aps.iva.cx.p) c2);
                f fVar = new f();
                com.amazon.aps.iva.oh.g gVar = (com.amazon.aps.iva.oh.g) this.s.getValue();
                com.amazon.aps.iva.ws.f a3 = d.a.a(this.r);
                com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                g gVar2 = new g(this);
                com.amazon.aps.iva.w40.m mVar = com.amazon.aps.iva.w40.m.h;
                j.f(mVar, "createTimer");
                com.amazon.aps.iva.w40.p pVar = new com.amazon.aps.iva.w40.p(a3, mVar, gVar2);
                com.ellation.crunchyroll.watchlist.a.u0.getClass();
                com.ellation.crunchyroll.watchlist.a aVar2 = a.C0975a.b;
                j.f(aVar2, "watchlistChangeRegister");
                j.f(gVar, "markAsWatchedToggleViewModel");
                b0 b0Var = new b0(o0Var, a2, this, fVar, aVar2, gVar, pVar);
                this.o = b0Var;
                com.amazon.aps.iva.wy.k[] kVarArr = new com.amazon.aps.iva.wy.k[3];
                kVarArr[0] = b0Var;
                com.amazon.aps.iva.gn.d dVar = this.p;
                if (dVar != null) {
                    kVarArr[1] = dVar;
                    com.amazon.aps.iva.f60.e eVar = this.q;
                    if (eVar != null) {
                        kVarArr[2] = eVar;
                        return l1.I(kVarArr);
                    }
                    j.m("watchlistItemTogglePresenter");
                    throw null;
                }
                j.m("sharePresenter");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.ScreenReloadIntervalsImpl");
        }
        j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        j.f(iVar, "message");
        int i2 = com.amazon.aps.iva.u70.h.a;
        View findViewById = requireActivity().findViewById(R.id.errors_layout);
        j.e(findViewById, "requireActivity().findViewById(R.id.errors_layout)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.amazon.aps.iva.w40.n0
    public final void v0() {
        ((View) this.i.getValue(this, u[5])).setVisibility(0);
        ei().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.v10.k
    public final void yh() {
        ei().smoothScrollToPosition(0);
    }
}
