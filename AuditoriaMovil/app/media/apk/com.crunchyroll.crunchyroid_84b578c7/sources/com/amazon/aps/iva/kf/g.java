package com.amazon.aps.iva.kf;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.g70.f;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.thirtpartyoauth.ThirdPartyOauthService;
import com.ellation.crunchyroll.application.d;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ConnectedAppsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/kf/g;", "Lcom/amazon/aps/iva/wy/e;", "Lcom/amazon/aps/iva/kf/v;", "<init>", "()V", "connected-apps_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.wy.e implements v {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] g = {com.amazon.aps.iva.k.q.a(g.class, "binding", "getBinding()Lcom/crunchyroll/connectedapps/databinding/FragmentConnectedAppsBinding;", 0), com.amazon.aps.iva.k.q.a(g.class, "viewModel", "getViewModel()Lcom/crunchyroll/connectedapps/ConnectedAppsViewModelImpl;", 0)};
    public final FragmentViewBindingDelegate c;
    public final com.amazon.aps.iva.ez.f d;
    public final com.amazon.aps.iva.kf.d e;
    public final com.amazon.aps.iva.kb0.m f;

    /* compiled from: ConnectedAppsFragment.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.lf.a> {
        public static final a b = new a();

        public a() {
            super(1, com.amazon.aps.iva.lf.a.class, "bind", "bind(Landroid/view/View;)Lcom/crunchyroll/connectedapps/databinding/FragmentConnectedAppsBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.lf.a invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "p0");
            RelativeLayout relativeLayout = (RelativeLayout) view2;
            int i = R.id.connected_apps_progress;
            FrameLayout frameLayout = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.connected_apps_progress, view2);
            if (frameLayout != null) {
                i = R.id.connected_apps_recycler_view;
                RecyclerView recyclerView = (RecyclerView) com.amazon.aps.iva.e.z.u(R.id.connected_apps_recycler_view, view2);
                if (recyclerView != null) {
                    return new com.amazon.aps.iva.lf.a(relativeLayout, relativeLayout, frameLayout, recyclerView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: ConnectedAppsFragment.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<c0, com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(c0 c0Var, com.amazon.aps.iva.fs.b bVar) {
            c0 c0Var2 = c0Var;
            com.amazon.aps.iva.fs.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(c0Var2, "uiModel");
            com.amazon.aps.iva.yb0.j.f(bVar2, "clickedView");
            com.amazon.aps.iva.fc0.l<Object>[] lVarArr = g.g;
            ((j) g.this.f.getValue()).B0(c0Var2, bVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ConnectedAppsFragment.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.g70.j, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.g70.j jVar) {
            com.amazon.aps.iva.g70.j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "it");
            com.amazon.aps.iva.fc0.l<Object>[] lVarArr = g.g;
            Serializable serializable = jVar2.c;
            com.amazon.aps.iva.yb0.j.d(serializable, "null cannot be cast to non-null type com.crunchyroll.connectedapps.ThirdPartyAppUiModel");
            ((j) g.this.f.getValue()).t4((c0) serializable);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ConnectedAppsFragment.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<j> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final j invoke() {
            com.amazon.aps.iva.fc0.l<Object>[] lVarArr = g.g;
            g gVar = g.this;
            gVar.getClass();
            com.amazon.aps.iva.fc0.l<?> lVar = g.g[1];
            com.ellation.crunchyroll.application.d a = d.a.a();
            com.amazon.aps.iva.kf.d dVar = gVar.e;
            com.amazon.aps.iva.yb0.j.f(dVar, "analytics");
            com.amazon.aps.iva.yb0.j.f(a, "appLifecycle");
            return new o(gVar, (y) gVar.d.getValue(gVar, lVar), dVar, a);
        }
    }

    /* compiled from: ConnectedAppsFragment.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, y> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final y invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            f fVar = f1.b;
            if (fVar != null) {
                ThirdPartyOauthService thirdPartyOauthService = fVar.getThirdPartyOauthService();
                com.amazon.aps.iva.yb0.j.f(thirdPartyOauthService, "thirdPartyService");
                return new y(new i(thirdPartyOauthService));
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    public g() {
        super(R.layout.fragment_connected_apps);
        this.c = com.amazon.aps.iva.a60.b.A(this, a.b);
        this.d = new com.amazon.aps.iva.ez.f(this, y.class, e.h);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.CONNECTED_APPS;
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        com.amazon.aps.iva.kf.b bVar = com.amazon.aps.iva.kf.b.h;
        com.amazon.aps.iva.yb0.j.f(bVar, "createTimer");
        this.e = new com.amazon.aps.iva.kf.d(aVar, bVar);
        this.f = com.amazon.aps.iva.kb0.f.b(new d());
    }

    @Override // com.amazon.aps.iva.kf.v
    public final void Dd(m mVar) {
        RelativeLayout relativeLayout = di().b;
        com.amazon.aps.iva.yb0.j.e(relativeLayout, "binding.connectedAppsContainer");
        com.amazon.aps.iva.k60.a.d(relativeLayout, mVar, null, 0, 0, 0L, 0L, 254);
    }

    @Override // com.amazon.aps.iva.kf.v
    public final void Nc(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "uri");
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public final com.amazon.aps.iva.lf.a di() {
        return (com.amazon.aps.iva.lf.a) this.c.getValue(this, g[0]);
    }

    @Override // com.amazon.aps.iva.kf.v
    public final void j() {
        FrameLayout frameLayout = di().c;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.connectedAppsProgress");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.kf.v
    public final void o() {
        FrameLayout frameLayout = di().c;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.connectedAppsProgress");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        di().d.setAdapter(new com.amazon.aps.iva.kf.a(new b()));
        FragmentManager childFragmentManager = getChildFragmentManager();
        com.amazon.aps.iva.yb0.j.e(childFragmentManager, "childFragmentManager");
        com.amazon.aps.iva.bo.e.h(childFragmentManager, "disconnect_app_dialog", this, new c(), com.amazon.aps.iva.g70.i.h);
    }

    @Override // com.amazon.aps.iva.kf.v
    public final void pd(c0 c0Var) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "uiModel");
        f.a aVar = com.amazon.aps.iva.g70.f.e;
        com.amazon.aps.iva.g70.g gVar = new com.amazon.aps.iva.g70.g(0, getString(c0Var.h), getString(c0Var.i), getString(R.string.connected_apps_disconnect), c0Var, getString(R.string.connected_apps_cancel), 1);
        aVar.getClass();
        f.a.a(gVar).show(getChildFragmentManager(), "disconnect_app_dialog");
    }

    @Override // com.amazon.aps.iva.kf.v
    public final void r1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "uri");
        Context requireContext = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        new com.amazon.aps.iva.k50.c(requireContext, "").s1(str, "", "");
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((j) this.f.getValue());
    }

    @Override // com.amazon.aps.iva.kf.v
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.d(requireActivity, "null cannot be cast to non-null type com.ellation.widgets.snackbar.SnackbarMessageView");
        ((com.amazon.aps.iva.u70.j) requireActivity).showSnackbar(iVar);
    }

    @Override // com.amazon.aps.iva.kf.v
    public final void t5() {
        RecyclerView recyclerView = di().d;
        com.amazon.aps.iva.yb0.j.e(recyclerView, "binding.connectedAppsRecyclerView");
        recyclerView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.kf.v
    public final void v9(List<? extends c0> list) {
        com.amazon.aps.iva.kf.a aVar;
        com.amazon.aps.iva.yb0.j.f(list, "apps");
        RecyclerView.h adapter = di().d.getAdapter();
        if (adapter instanceof com.amazon.aps.iva.kf.a) {
            aVar = (com.amazon.aps.iva.kf.a) adapter;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.e(list);
        }
    }

    @Override // com.amazon.aps.iva.kf.v
    public final void zc() {
        RecyclerView recyclerView = di().d;
        com.amazon.aps.iva.yb0.j.e(recyclerView, "binding.connectedAppsRecyclerView");
        recyclerView.setVisibility(8);
    }
}
