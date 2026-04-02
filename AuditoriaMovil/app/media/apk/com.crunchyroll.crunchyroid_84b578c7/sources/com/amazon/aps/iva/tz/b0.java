package com.amazon.aps.iva.tz;

import android.content.Intent;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.browse.BrowseAllFragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: BrowseAllPresenter.kt */
/* loaded from: classes2.dex */
public final class b0 extends com.amazon.aps.iva.wy.b<o0> implements z {
    public final p0 b;
    public final com.amazon.aps.iva.vz.b c;
    public final com.amazon.aps.iva.ws.d d;
    public final com.amazon.aps.iva.ws.b e;
    public final com.amazon.aps.iva.k50.h f;
    public final com.amazon.aps.iva.n60.b g;
    public final com.ellation.crunchyroll.watchlist.a h;
    public final com.amazon.aps.iva.oh.g i;

    /* compiled from: BrowseAllPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observePagedList");
            gVar2.e(new a0(b0.this));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BrowseAllPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.j<? extends List<? extends com.amazon.aps.iva.uz.h>, ? extends com.amazon.aps.iva.mn.g>>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.j<? extends List<? extends com.amazon.aps.iva.uz.h>, ? extends com.amazon.aps.iva.mn.g>> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.j<? extends List<? extends com.amazon.aps.iva.uz.h>, ? extends com.amazon.aps.iva.mn.g>> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeItems");
            b0 b0Var = b0.this;
            gVar2.c(new c0(b0Var));
            gVar2.e(new d0(b0Var));
            gVar2.b(new e0(b0Var));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BrowseAllPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            b0.this.b.reset();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BrowseAllPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends Integer>, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "positions");
            b0 b0Var = b0.this;
            if (!b0.q6(b0Var).q0()) {
                o0 q6 = b0.q6(b0Var);
                for (Number number : list2) {
                    q6.s(number.intValue());
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(o0 o0Var, p0 p0Var, com.amazon.aps.iva.vz.c cVar, com.amazon.aps.iva.ws.f fVar, com.amazon.aps.iva.ws.b bVar, BrowseAllFragment.i iVar, com.amazon.aps.iva.n60.c cVar2, com.ellation.crunchyroll.watchlist.a aVar, com.amazon.aps.iva.oh.g gVar) {
        super(o0Var, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(o0Var, "view");
        this.b = p0Var;
        this.c = cVar;
        this.d = fVar;
        this.e = bVar;
        this.f = iVar;
        this.g = cVar2;
        this.h = aVar;
        this.i = gVar;
    }

    public static final /* synthetic */ o0 q6(b0 b0Var) {
        return b0Var.getView();
    }

    @Override // com.amazon.aps.iva.tz.z
    public final void J() {
        getView().I0();
    }

    @Override // com.amazon.aps.iva.b70.d
    public final void L3(String str) {
        com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.CHARACTER);
        this.c.D(str);
    }

    @Override // com.amazon.aps.iva.b60.i
    public final void U0(com.amazon.aps.iva.b60.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        this.b.a(jVar, new d());
    }

    @Override // com.amazon.aps.iva.tz.z
    public final void b() {
        this.b.reset();
    }

    @Override // com.amazon.aps.iva.tz.z
    public final void i(Panel panel, int i) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.f.t(panel);
        this.d.b(this.e.a(i, panel, this.b.N2()));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        a aVar = new a();
        p0 p0Var = this.b;
        p0Var.t0(getView(), aVar);
        p0Var.U(getView(), new b());
        this.h.a(this, getView());
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        this.c.onNewIntent(intent);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        this.g.b(new c());
    }

    public final void r6(com.amazon.aps.iva.mn.g gVar, List list) {
        boolean z = false;
        if (gVar != null && !gVar.c) {
            z = true;
        }
        if (z && (!list.isEmpty())) {
            getView().ed();
        } else {
            getView().rf();
        }
    }

    @Override // com.amazon.aps.iva.tz.z
    public final void z() {
        getView().m2();
    }
}
