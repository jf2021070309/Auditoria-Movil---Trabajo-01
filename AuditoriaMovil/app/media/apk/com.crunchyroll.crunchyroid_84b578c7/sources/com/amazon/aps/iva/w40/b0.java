package com.amazon.aps.iva.w40;

import android.content.Intent;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.simulcast.SimulcastSeason;
import com.ellation.crunchyroll.presentation.simulcast.SimulcastFragment;
import java.util.List;
/* compiled from: SimulcastPresenter.kt */
/* loaded from: classes2.dex */
public final class b0 extends com.amazon.aps.iva.wy.b<n0> implements z {
    public final o0 b;
    public final com.amazon.aps.iva.n60.b c;
    public final com.amazon.aps.iva.k50.h d;
    public final com.ellation.crunchyroll.watchlist.a e;
    public final com.amazon.aps.iva.oh.g f;
    public final n g;

    /* compiled from: SimulcastPresenter.kt */
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

    /* compiled from: SimulcastPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.uz.h>>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.uz.h>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.uz.h>> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeItems");
            b0 b0Var = b0.this;
            gVar2.c(new c0(b0Var));
            gVar2.e(new d0(b0Var));
            gVar2.b(new e0(b0Var));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SimulcastPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends SimulcastSeason>>, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends SimulcastSeason>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends SimulcastSeason>> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeSeasons");
            b0 b0Var = b0.this;
            gVar2.c(new f0(b0Var));
            gVar2.e(new g0(b0Var));
            gVar2.b(new h0(b0Var));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SimulcastPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<SimulcastSeason, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(SimulcastSeason simulcastSeason) {
            SimulcastSeason simulcastSeason2 = simulcastSeason;
            if (simulcastSeason2 != null) {
                b0.q6(b0.this).Q8(simulcastSeason2);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SimulcastPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            b0.this.b.z0();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SimulcastPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends Integer>, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "positions");
            n0 q6 = b0.q6(b0.this);
            for (Number number : list2) {
                q6.s(number.intValue());
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SimulcastPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public g(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(o0 o0Var, com.amazon.aps.iva.n60.c cVar, n0 n0Var, SimulcastFragment.f fVar, com.ellation.crunchyroll.watchlist.a aVar, com.amazon.aps.iva.oh.g gVar, p pVar) {
        super(n0Var, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(n0Var, "view");
        this.b = o0Var;
        this.c = cVar;
        this.d = fVar;
        this.e = aVar;
        this.f = gVar;
        this.g = pVar;
    }

    public static final /* synthetic */ n0 q6(b0 b0Var) {
        return b0Var.getView();
    }

    @Override // com.amazon.aps.iva.b60.i
    public final void U0(com.amazon.aps.iva.b60.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        this.b.a(jVar, new f());
    }

    @Override // com.amazon.aps.iva.w40.z
    public final void V0(SimulcastSeason simulcastSeason) {
        this.b.v4(simulcastSeason);
    }

    @Override // com.amazon.aps.iva.w40.z
    public final void b() {
        this.b.z0();
    }

    @Override // com.amazon.aps.iva.w40.z
    public final void i(Panel panel, int i) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.d.t(panel);
        T d2 = this.b.e8().d();
        com.amazon.aps.iva.yb0.j.c(d2);
        this.g.N(panel, i, (SimulcastSeason) d2);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.g.b();
        a aVar = new a();
        o0 o0Var = this.b;
        o0Var.t0(getView(), aVar);
        o0Var.U(getView(), new b());
        o0Var.I0(getView(), new c());
        o0Var.e8().e(getView(), new g(new d()));
        this.e.a(this, getView());
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        this.g.onNewIntent(intent);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        this.c.b(new e());
    }
}
