package com.amazon.aps.iva.h50;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.h50.a;
import com.amazon.aps.iva.u70.h;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.ContentContainer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: WatchlistItemToggleFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/h50/g;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/h50/v;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qy.a implements v {
    public final com.amazon.aps.iva.xw.v c = new com.amazon.aps.iva.xw.v(new com.amazon.aps.iva.xw.f(R.id.toggle_watchlist_text, com.amazon.aps.iva.xw.m.h));
    public final com.amazon.aps.iva.xw.v d = com.amazon.aps.iva.xw.g.f(this, R.id.toggle_watchlist_icon);
    public final com.amazon.aps.iva.xw.s e = new com.amazon.aps.iva.xw.s("content_container");
    public final com.amazon.aps.iva.b60.n f;
    public final com.amazon.aps.iva.ez.f g;
    public final com.amazon.aps.iva.kb0.m h;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] j = {com.amazon.aps.iva.k.q.a(g.class, "watchlistButtonText", "getWatchlistButtonText()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(g.class, "watchlistButtonIcon", "getWatchlistButtonIcon()Landroid/widget/ImageView;", 0), defpackage.e.b(g.class, FirebaseAnalytics.Param.CONTENT, "getContent()Lcom/ellation/crunchyroll/model/ContentContainer;", 0), com.amazon.aps.iva.k.q.a(g.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/watchlist/toggle/WatchlistItemToggleViewModelImpl;", 0)};
    public static final a i = new a();

    /* compiled from: WatchlistItemToggleFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: WatchlistItemToggleFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<u> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final u invoke() {
            a aVar = g.i;
            g gVar = g.this;
            gVar.getClass();
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = g.j;
            return new u(gVar, (ContentContainer) gVar.e.getValue(gVar, lVarArr[2]), (x) gVar.g.getValue(gVar, lVarArr[3]), gVar.f);
        }
    }

    /* compiled from: WatchlistItemToggleFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, x> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final x invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            g gVar = g.this;
            return new x(a.C0324a.a(etpContentService, gVar.f), ((ContentContainer) gVar.e.getValue(gVar, g.j[2])).getId());
        }
    }

    public g() {
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.MEDIA;
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        this.f = new com.amazon.aps.iva.b60.n(aVar);
        this.g = new com.amazon.aps.iva.ez.f(this, x.class, new c());
        this.h = com.amazon.aps.iva.kb0.f.b(new b());
    }

    @Override // com.amazon.aps.iva.h50.v
    public final void ba() {
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = j;
        ((ImageView) this.d.getValue(this, lVarArr[1])).setSelected(false);
        TextView textView = (TextView) this.c.getValue(this, lVarArr[0]);
        if (textView != null) {
            textView.setText(R.string.add_to_watchlist);
        }
        di().setContentDescription(getString(R.string.add_to_watchlist));
    }

    public final ViewGroup di() {
        View view = getView();
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_watch_list_toggle_button, viewGroup, false);
        com.amazon.aps.iva.yb0.j.e(inflate, "inflater.inflate(R.layou…button, container, false)");
        return inflate;
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        di().setOnClickListener(new com.amazon.aps.iva.c8.h(this, 22));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((h) this.h.getValue());
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i2 = com.amazon.aps.iva.u70.h.a;
        View findViewById = requireActivity().findViewById(R.id.snackbar_container);
        com.amazon.aps.iva.yb0.j.e(findViewById, "requireActivity().findVi…(R.id.snackbar_container)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.amazon.aps.iva.h50.v
    public final void th() {
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = j;
        ((ImageView) this.d.getValue(this, lVarArr[1])).setSelected(true);
        TextView textView = (TextView) this.c.getValue(this, lVarArr[0]);
        if (textView != null) {
            textView.setText(R.string.in_watchlist);
        }
        di().setContentDescription(getString(R.string.in_watchlist));
    }

    @Override // com.amazon.aps.iva.h50.v
    public final void wg() {
        di().setEnabled(true);
    }

    @Override // com.amazon.aps.iva.h50.v
    public final void x3() {
        di().setEnabled(false);
    }
}
