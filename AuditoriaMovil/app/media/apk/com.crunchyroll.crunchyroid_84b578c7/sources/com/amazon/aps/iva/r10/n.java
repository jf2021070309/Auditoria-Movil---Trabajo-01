package com.amazon.aps.iva.r10;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.f;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.g70.f;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.n60.b;
import com.amazon.aps.iva.nz.b;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.u70.c;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.xw.r0;
import com.crunchyroll.connectivity.d;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.usermigration.progress.WatchDataProgress;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
import com.ellation.crunchyroll.presentation.main.browse.BrowseBottomBarActivity;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import com.ellation.crunchyroll.ui.duration.SmallDurationFormatter;
import com.ellation.feature.empty.EmptyCtaLayout;
import com.ellation.feature.empty.EmptyLayout;
import com.ellation.widgets.ScrollToggleRecyclerView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: HistoryFragment.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/aps/iva/r10/n;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/r10/k0;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/w70/i;", "Lcom/amazon/aps/iva/us/a;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.qy.a implements k0, com.amazon.aps.iva.gn.e, com.amazon.aps.iva.w70.i, com.amazon.aps.iva.us.a {
    public final int c = R.string.history;
    public final com.amazon.aps.iva.ls.a d;
    public final com.amazon.aps.iva.r10.e e;
    public final com.amazon.aps.iva.ez.f f;
    public final com.amazon.aps.iva.ez.a g;
    public final com.amazon.aps.iva.kb0.m h;
    public final com.amazon.aps.iva.kb0.m i;
    public final LifecycleAwareLazy j;
    public final LifecycleAwareLazy k;
    public final LifecycleAwareLazy l;
    public final com.amazon.aps.iva.xw.v m;
    public final com.amazon.aps.iva.xw.v n;
    public final com.amazon.aps.iva.xw.v o;
    public final com.amazon.aps.iva.xw.v p;
    public final com.amazon.aps.iva.xw.v q;
    public final com.amazon.aps.iva.xw.v r;
    public final com.amazon.aps.iva.xw.v s;
    public final com.amazon.aps.iva.xw.v t;
    public final com.amazon.aps.iva.xw.v u;
    public final com.amazon.aps.iva.xw.v v;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] x = {com.amazon.aps.iva.k.q.a(n.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/history/HistoryViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(n.class, "editModeViewModel", "getEditModeViewModel()Lcom/ellation/crunchyroll/edit/EditModeViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(n.class, "recyclerView", "getRecyclerView()Lcom/ellation/widgets/ScrollToggleRecyclerView;", 0), com.amazon.aps.iva.k.q.a(n.class, "emptyHistoryView", "getEmptyHistoryView()Landroid/view/View;", 0), com.amazon.aps.iva.k.q.a(n.class, "emptyView", "getEmptyView()Lcom/ellation/feature/empty/EmptyLayout;", 0), com.amazon.aps.iva.k.q.a(n.class, "emptyCtaView", "getEmptyCtaView()Lcom/ellation/feature/empty/EmptyCtaLayout;", 0), com.amazon.aps.iva.k.q.a(n.class, "watchDataMigrationProgress", "getWatchDataMigrationProgress()Lcom/crunchyroll/usermigration/progress/WatchDataProgress;", 0), com.amazon.aps.iva.k.q.a(n.class, "snackbarContainer", "getSnackbarContainer()Landroid/view/ViewGroup;", 0), com.amazon.aps.iva.k.q.a(n.class, "manageButton", "getManageButton()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(n.class, "removeContainer", "getRemoveContainer()Landroid/view/ViewGroup;", 0), com.amazon.aps.iva.k.q.a(n.class, "removeItemsCount", "getRemoveItemsCount()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(n.class, "removeButton", "getRemoveButton()Landroid/widget/TextView;", 0)};
    public static final a w = new a();

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.recyclerview.widget.f> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.recyclerview.widget.f invoke() {
            f.a aVar = f.a.c;
            boolean z = aVar.a;
            f.a aVar2 = new f.a(false, aVar.b);
            a aVar3 = n.w;
            return new androidx.recyclerview.widget.f(aVar2, (com.amazon.aps.iva.s10.i) n.this.k.getValue());
        }
    }

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.uw.b> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.uw.b invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            return new com.amazon.aps.iva.uw.b();
        }
    }

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.s10.i> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.s10.i invoke() {
            a aVar = n.w;
            n nVar = n.this;
            p pVar = new p(nVar.ei());
            com.amazon.aps.iva.r10.i iVar = new com.amazon.aps.iva.r10.i(new q(nVar), new r(nVar), new s(nVar.ei()));
            d0 ei = nVar.ei();
            final com.amazon.aps.iva.ct.k a = com.ellation.crunchyroll.application.f.a(null, 3);
            com.amazon.aps.iva.at.c cVar = new com.amazon.aps.iva.at.c(new com.amazon.aps.iva.yb0.t(a) { // from class: com.amazon.aps.iva.r10.t
                @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                public final Object get() {
                    return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).getHasPremiumBenefit());
                }
            }, com.amazon.aps.iva.at.b.h);
            Context requireContext = nVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            com.amazon.aps.iva.mt.m mVar = new com.amazon.aps.iva.mt.m(requireContext);
            SmallDurationFormatter.Companion companion = SmallDurationFormatter.Companion;
            Context requireContext2 = nVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext2, "requireContext()");
            DurationFormatter.Companion companion2 = DurationFormatter.Companion;
            Context requireContext3 = nVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext3, "requireContext()");
            return new com.amazon.aps.iva.s10.i(pVar, iVar, ei, new z(mVar, companion.create(requireContext2, companion2.create(requireContext3))), cVar);
        }
    }

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
        public e(Object obj) {
            super(0, obj, n.class, "isResumed", "isResumed()Z", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.valueOf(((n) this.receiver).isResumed());
        }
    }

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.m70.b> {
        public static final f h = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.m70.b invoke() {
            return new com.amazon.aps.iva.m70.b();
        }
    }

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.nz.a>, com.amazon.aps.iva.kb0.q> {
        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.nz.a> list) {
            com.amazon.aps.iva.yb0.j.f(list, "it");
            a aVar = n.w;
            n.this.ei().R();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "it");
            a aVar = n.w;
            n.this.ei().l();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<d0> {
        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d0 invoke() {
            a aVar = n.w;
            n nVar = n.this;
            nVar.getClass();
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = n.x;
            m0 m0Var = (m0) nVar.f.getValue(nVar, lVarArr[0]);
            com.amazon.aps.iva.uw.b bVar = (com.amazon.aps.iva.uw.b) nVar.g.getValue(nVar, lVarArr[1]);
            com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
            if (aVar2 != null) {
                Object c = aVar2.c().c(com.amazon.aps.iva.cx.p.class, "app_resume_screens_reload_intervals");
                if (c != null) {
                    com.amazon.aps.iva.n60.c a = b.a.a((com.amazon.aps.iva.cx.p) c);
                    Context requireContext = nVar.requireContext();
                    com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
                    com.amazon.aps.iva.i50.c cVar = new com.amazon.aps.iva.i50.c(requireContext, new com.amazon.aps.iva.i50.a(requireContext, true));
                    PolicyChangeMonitor policyChangeMonitor = com.ellation.crunchyroll.application.e.b().e().getPolicyChangeMonitor();
                    com.amazon.aps.iva.r10.e eVar = nVar.e;
                    com.amazon.aps.iva.yb0.j.f(eVar, "historyAnalytics");
                    com.amazon.aps.iva.yb0.j.f(policyChangeMonitor, "policyChangeMonitor");
                    return new e0(nVar, m0Var, bVar, eVar, a, cVar, policyChangeMonitor);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.ScreenReloadIntervalsImpl");
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.gn.c> {
        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.gn.c invoke() {
            com.amazon.aps.iva.ts.b.a.getClass();
            return c.a.a(n.this, com.amazon.aps.iva.ts.a.j);
        }
    }

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class k extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public k(d0 d0Var) {
            super(0, d0Var, d0.class, "onRetry", "onRetry()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((d0) this.receiver).b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a70.b, com.amazon.aps.iva.kb0.q> {
        public l() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a70.b bVar) {
            com.amazon.aps.iva.a70.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "actionItem");
            a aVar = n.w;
            n.this.ei().Q3(bVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class m extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public m(Object obj) {
            super(0, obj, Fragment.class, "requireActivity", "requireActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return ((Fragment) this.receiver).requireActivity();
        }
    }

    /* compiled from: HistoryFragment.kt */
    /* renamed from: com.amazon.aps.iva.r10.n$n  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0659n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, m0> {
        public C0659n() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final m0 invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
            return new m0(new v(etpContentService), n.this.e);
        }
    }

    public n() {
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.HISTORY;
        this.d = aVar;
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.ws.f a2 = d.a.a(aVar);
        e eVar = new e(this);
        com.amazon.aps.iva.r10.b bVar = com.amazon.aps.iva.r10.b.h;
        com.amazon.aps.iva.yb0.j.f(bVar, "createTimer");
        this.e = new com.amazon.aps.iva.r10.e(a2, eVar, bVar);
        this.f = new com.amazon.aps.iva.ez.f(this, m0.class, new C0659n());
        this.g = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.uw.b.class, new m(this), c.h);
        this.h = com.amazon.aps.iva.kb0.f.b(new i());
        this.i = com.amazon.aps.iva.kb0.f.b(new j());
        this.j = com.amazon.aps.iva.aq.j.F(this, f.h);
        this.k = com.amazon.aps.iva.aq.j.F(this, new d());
        this.l = com.amazon.aps.iva.aq.j.F(this, new b());
        this.m = com.amazon.aps.iva.xw.g.f(this, R.id.history_recycler_view);
        this.n = com.amazon.aps.iva.xw.g.f(this, R.id.history_empty_view_container);
        this.o = com.amazon.aps.iva.xw.g.f(this, R.id.history_empty_view);
        this.p = com.amazon.aps.iva.xw.g.f(this, R.id.history_empty_cta_view);
        this.q = com.amazon.aps.iva.xw.g.f(this, R.id.watch_data_migration_progress);
        this.r = com.amazon.aps.iva.xw.g.f(this, R.id.snackbar_container);
        this.s = com.amazon.aps.iva.xw.g.f(this, R.id.history_manage_button);
        this.t = com.amazon.aps.iva.xw.g.f(this, R.id.history_remove_container);
        this.u = com.amazon.aps.iva.xw.g.f(this, R.id.history_selected_item_count);
        this.v = com.amazon.aps.iva.xw.g.f(this, R.id.history_remove_button);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void A6() {
        com.amazon.aps.iva.g70.g gVar = new com.amazon.aps.iva.g70.g(0, getString(R.string.clear_history_dialog_title), getString(R.string.clear_history_dialog_description), getString(R.string.clear_history), null, getString(R.string.cancel), 17);
        com.amazon.aps.iva.g70.f.e.getClass();
        f.a.a(gVar).show(getChildFragmentManager(), "clear_history_dialog_tag");
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void C() {
        int i2 = BrowseBottomBarActivity.v;
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        BrowseBottomBarActivity.a.a(requireActivity);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void E3() {
        di().setText(getString(R.string.cancel));
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int G() {
        return 0;
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void H() {
        fi().setScrollEnabled(true);
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int H6() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void I5(List<? extends com.amazon.aps.iva.a70.b> list) {
        Context requireContext = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        new com.amazon.aps.iva.a70.h(requireContext, list, Integer.valueOf((int) R.style.PopupActionMenuStyle), new l()).G(di());
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void L() {
        ((EmptyLayout) this.o.getValue(this, x[4])).b1(i0.a);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void M5() {
        gi().setEnabled(false);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void Mg() {
        gi().setEnabled(true);
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        startActivity(com.amazon.aps.iva.gd0.j.i(requireActivity, str));
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void U5() {
        hi().setText(getString(R.string.history_remove_no_items_selected));
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void V() {
        ((androidx.recyclerview.widget.f) this.l.getValue()).f((com.amazon.aps.iva.m70.b) this.j.getValue());
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void W() {
        com.amazon.aps.iva.j60.a aVar = ((EmptyCtaLayout) this.p.getValue(this, x[5])).e;
        aVar.getClass();
        if (aVar.b) {
            aVar.getView().setPrimaryButtonText(R.string.empty_cta_primary_text);
        } else {
            aVar.getView().setPrimaryButtonText(R.string.empty_cta_primary_text);
        }
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void Xe(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2, com.amazon.aps.iva.r10.l... lVarArr) {
        com.amazon.aps.iva.yb0.j.f(lVarArr, FirebaseAnalytics.Param.ITEMS);
        int length = lVarArr.length;
        int i2 = com.amazon.aps.iva.u70.c.a;
        com.amazon.aps.iva.u70.c a2 = c.a.a((ViewGroup) this.r.getValue(this, x[7]), 0, R.style.ActionSnackBarTextStyle, R.style.ActionSnackBarActionTextStyle);
        a2.b(aVar, aVar2);
        String quantityString = getResources().getQuantityString(R.plurals.history_items_removed, length, Integer.valueOf(length));
        com.amazon.aps.iva.yb0.j.e(quantityString, "resources.getQuantityStr…msCount\n                )");
        com.amazon.aps.iva.u70.c.c(a2, quantityString, R.string.remove_snackbar_undo, R.drawable.ic_info, 4);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void Y() {
        ((androidx.recyclerview.widget.f) this.l.getValue()).d((com.amazon.aps.iva.m70.b) this.j.getValue());
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void c() {
        com.amazon.aps.iva.k60.a.c(this, new k(ei()));
    }

    public final TextView di() {
        return (TextView) this.s.getValue(this, x[8]);
    }

    public final d0 ei() {
        return (d0) this.h.getValue();
    }

    public final ScrollToggleRecyclerView fi() {
        return (ScrollToggleRecyclerView) this.m.getValue(this, x[2]);
    }

    public final TextView gi() {
        return (TextView) this.v.getValue(this, x[11]);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void h() {
        ((View) this.n.getValue(this, x[3])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void ha() {
        di().setText(getString(R.string.manage));
    }

    public final TextView hi() {
        return (TextView) this.u.getValue(this, x[10]);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void i() {
        ((View) this.n.getValue(this, x[3])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void ic() {
        r0.c(hi(), R.color.cr_silver_chalice);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void l4() {
        r0.c(hi(), R.color.color_white);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void l5() {
        ((ViewGroup) this.t.getValue(this, x[9])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void m() {
        View view = getView();
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        viewGroup.removeView(viewGroup.findViewWithTag("OverlayRetryError"));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_history, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.qy.a, com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fi().clearOnScrollListeners();
        ((com.amazon.aps.iva.uw.b) this.g.getValue(this, x[1])).u();
        super.onDestroyView();
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        fi().setHasFixedSize(true);
        ScrollToggleRecyclerView fi = fi();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), getResources().getInteger(R.integer.history_number_of_columns));
        gridLayoutManager.g = new o(this);
        fi.setLayoutManager(gridLayoutManager);
        fi().setAdapter((androidx.recyclerview.widget.f) this.l.getValue());
        ScrollToggleRecyclerView fi2 = fi();
        Context requireContext = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        fi2.addItemDecoration(new x(requireContext));
        com.amazon.aps.iva.ye0.c cVar = com.amazon.aps.iva.se0.r0.a;
        t1 t1Var = com.amazon.aps.iva.xe0.k.a;
        com.amazon.aps.iva.yb0.j.f(t1Var, "dispatcher");
        com.amazon.aps.iva.nz.c cVar2 = b.a.a;
        if (cVar2 == null) {
            cVar2 = new com.amazon.aps.iva.nz.c(t1Var);
            b.a.a = cVar2;
        }
        cVar2.a(this, new g());
        Context requireContext2 = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext2, "requireContext()");
        androidx.lifecycle.g lifecycle = getLifecycle();
        com.amazon.aps.iva.yb0.j.e(lifecycle, "this.lifecycle");
        d.a.a(requireContext2, lifecycle).a(ei());
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = x;
        ((EmptyCtaLayout) this.p.getValue(this, lVarArr[5])).setPrimaryButtonClickListener(new h());
        com.amazon.aps.iva.fo.h hVar = ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).q.d;
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        androidx.fragment.app.h requireActivity2 = requireActivity();
        com.amazon.aps.iva.yb0.j.d(requireActivity2, "null cannot be cast to non-null type com.ellation.widgets.snackbar.SnackbarMessageView");
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.HISTORY;
        hVar.e(requireActivity, (com.amazon.aps.iva.u70.j) requireActivity2, aVar);
        di().setOnClickListener(new com.amazon.aps.iva.c8.j(this, 14));
        gi().setOnClickListener(new com.amazon.aps.iva.c8.k(this, 14));
        ((WatchDataProgress) this.q.getValue(this, lVarArr[6])).setScreen(aVar);
        getChildFragmentManager().b0("clear_history_dialog_tag", this, new com.amazon.aps.iva.n4.f0(this, 0));
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void rc(int i2) {
        hi().setText(getResources().getQuantityString(R.plurals.history_items_selected_plural, i2, Integer.valueOf(i2)));
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void sb(com.amazon.aps.iva.j8.h<a0> hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, FirebaseAnalytics.Param.ITEMS);
        ((com.amazon.aps.iva.s10.i) this.k.getValue()).e(hVar);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.I(ei(), (com.amazon.aps.iva.gn.c) this.i.getValue());
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i2 = com.amazon.aps.iva.u70.h.a;
        h.a.a((ViewGroup) this.r.getValue(this, x[7]), iVar);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void v() {
        fi().setScrollEnabled(false);
    }

    @Override // com.amazon.aps.iva.r10.k0
    public final void v4() {
        ((ViewGroup) this.t.getValue(this, x[9])).setVisibility(8);
    }
}
