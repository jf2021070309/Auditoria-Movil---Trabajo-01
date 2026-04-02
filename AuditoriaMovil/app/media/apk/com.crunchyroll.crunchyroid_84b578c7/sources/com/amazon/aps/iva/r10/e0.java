package com.amazon.aps.iva.r10;

import android.content.Intent;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.i50.b;
import com.amazon.aps.iva.r10.c0;
import com.amazon.aps.iva.r10.i0;
import com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayheadTimeProviderKt;
import java.util.Arrays;
import java.util.List;
/* compiled from: HistoryPresenter.kt */
/* loaded from: classes2.dex */
public final class e0 extends com.amazon.aps.iva.wy.b<k0> implements d0 {
    public final l0 b;
    public final com.amazon.aps.iva.uw.a c;
    public final com.amazon.aps.iva.r10.c d;
    public final com.amazon.aps.iva.n60.b e;
    public final com.amazon.aps.iva.i50.b f;
    public final PolicyChangeMonitor g;

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            e0.this.r6();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(c0 c0Var) {
            boolean a;
            c0 c0Var2 = c0Var;
            if (c0Var2 instanceof c0.c) {
                a = true;
            } else {
                a = com.amazon.aps.iva.yb0.j.a(c0Var2, c0.b.a);
            }
            e0 e0Var = e0.this;
            if (a) {
                e0.q6(e0Var).V();
            } else if (com.amazon.aps.iva.yb0.j.a(c0Var2, c0.a.a)) {
                e0.q6(e0Var).Y();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<a0>>, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<a0>> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<a0>> gVar2 = gVar;
            e0 e0Var = e0.this;
            gVar2.c(new f0(e0Var));
            gVar2.e(new g0(e0Var));
            gVar2.b(new h0(e0Var));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "$this$observeEvent");
            e0.q6(e0.this).showSnackbar(com.amazon.aps.iva.bt.c.b);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "$this$observeEvent");
            e0.q6(e0.this).showSnackbar(com.amazon.aps.iva.r10.k.b);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            Boolean bool2 = bool;
            com.amazon.aps.iva.yb0.j.e(bool2, "isInEditMode");
            boolean booleanValue = bool2.booleanValue();
            e0 e0Var = e0.this;
            if (booleanValue) {
                e0Var.b.z();
                e0Var.getView().E3();
                e0Var.getView().l5();
            } else {
                e0Var.b.u();
                e0Var.getView().ha();
                e0Var.getView().v4();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.r10.l>, com.amazon.aps.iva.kb0.q> {
        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.r10.l> list) {
            List<? extends com.amazon.aps.iva.r10.l> list2 = list;
            com.amazon.aps.iva.yb0.j.e(list2, "selectedItems");
            boolean z = !list2.isEmpty();
            e0 e0Var = e0.this;
            if (z) {
                e0Var.getView().rc(list2.size());
                e0Var.getView().l4();
                e0Var.getView().Mg();
            } else {
                e0Var.getView().U5();
                e0Var.getView().ic();
                e0Var.getView().M5();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            e0.this.r6();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<com.amazon.aps.iva.r10.l> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List<com.amazon.aps.iva.r10.l> list) {
            super(0);
            this.i = list;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            e0 e0Var = e0.this;
            e0Var.b.u6(this.i);
            if (!e0Var.b.m6() && com.amazon.aps.iva.yb0.j.a(e0Var.c.a1().d(), Boolean.TRUE)) {
                e0Var.getView().l5();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<com.amazon.aps.iva.r10.l> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List<com.amazon.aps.iva.r10.l> list) {
            super(0);
            this.i = list;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            e0 e0Var = e0.this;
            e0.q6(e0Var).l5();
            e0Var.b.M6(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.r10.l i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(com.amazon.aps.iva.r10.l lVar) {
            super(0);
            this.i = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            e0.this.b.u6(f1.J(this.i));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.r10.l i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.amazon.aps.iva.r10.l lVar) {
            super(0);
            this.i = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            e0.this.b.M6(f1.J(this.i));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HistoryPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public m() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            e0.this.r6();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e0(n nVar, m0 m0Var, com.amazon.aps.iva.uw.b bVar, com.amazon.aps.iva.r10.e eVar, com.amazon.aps.iva.n60.c cVar, com.amazon.aps.iva.i50.c cVar2, PolicyChangeMonitor policyChangeMonitor) {
        super(nVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = m0Var;
        this.c = bVar;
        this.d = eVar;
        this.e = cVar;
        this.f = cVar2;
        this.g = policyChangeMonitor;
    }

    public static final /* synthetic */ k0 q6(e0 e0Var) {
        return e0Var.getView();
    }

    @Override // com.amazon.aps.iva.r10.j
    public final void L2(com.amazon.aps.iva.r10.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "item");
        this.b.i7(lVar);
    }

    @Override // com.amazon.aps.iva.r10.d0
    public final void N5() {
        this.b.g7();
    }

    @Override // com.amazon.aps.iva.r10.d0
    public final void Q3(com.amazon.aps.iva.a70.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "actionItem");
        if (com.amazon.aps.iva.yb0.j.a(bVar, p0.e)) {
            this.c.z();
        } else if (com.amazon.aps.iva.yb0.j.a(bVar, com.amazon.aps.iva.r10.a.e)) {
            getView().A6();
        }
    }

    @Override // com.amazon.aps.iva.r10.d0
    public final void R() {
        r6();
    }

    @Override // com.amazon.aps.iva.r10.d0
    public final void T2(com.amazon.aps.iva.r10.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "item");
        this.b.I6(f1.J(lVar));
        getView().Xe(new k(lVar), new l(lVar), lVar);
    }

    @Override // com.amazon.aps.iva.r10.d0
    public final void b() {
        r6();
    }

    @Override // com.amazon.aps.iva.r10.d0
    public final void f3(int i2, com.amazon.aps.iva.r10.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "item");
        com.amazon.aps.iva.no.a aVar = com.amazon.aps.iva.no.a.HISTORY_ITEM;
        Long valueOf = Long.valueOf(PlayheadTimeProviderKt.getPlayheadMs(lVar));
        com.amazon.aps.iva.i50.b bVar = this.f;
        Panel panel = lVar.a;
        b.a.a(bVar, panel, aVar, valueOf, 8);
        this.d.u(panel, i2);
    }

    @Override // com.amazon.aps.iva.r10.d0
    public final void l() {
        getView().C();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
        if (this.b.G1()) {
            r6();
        }
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().i();
        a aVar = new a();
        this.g.observePolicyChange(getView(), aVar);
        l0 l0Var = this.b;
        l0Var.p6().e(getView(), new i0.a(new b()));
        l0Var.f8().e(getView(), new i0.a(new c()));
        getView().L();
        getView().W();
        com.amazon.aps.iva.ez.e.a(l0Var.w1(), getView(), new d());
        com.amazon.aps.iva.ez.e.a(l0Var.G3(), getView(), new e());
        this.c.a1().e(getView(), new i0.a(new f()));
        l0Var.A1().e(getView(), new i0.a(new g()));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        this.d.onNewIntent(intent);
        this.e.a(new h());
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onPause() {
        this.d.p(false);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        this.d.p(true);
        this.e.a(new m());
    }

    @Override // com.amazon.aps.iva.r10.d0
    public final void r3() {
        l0 l0Var = this.b;
        T d2 = l0Var.A1().d();
        com.amazon.aps.iva.yb0.j.c(d2);
        List<com.amazon.aps.iva.r10.l> list = (List) d2;
        l0Var.I6(list);
        getView().v4();
        i iVar = new i(list);
        j jVar = new j(list);
        com.amazon.aps.iva.r10.l[] lVarArr = (com.amazon.aps.iva.r10.l[]) list.toArray(new com.amazon.aps.iva.r10.l[0]);
        getView().Xe(iVar, jVar, (com.amazon.aps.iva.r10.l[]) Arrays.copyOf(lVarArr, lVarArr.length));
    }

    public final void r6() {
        getView().m();
        this.b.d2();
    }

    @Override // com.amazon.aps.iva.r10.d0
    public final void w() {
        com.amazon.aps.iva.uw.a aVar = this.c;
        T d2 = aVar.a1().d();
        com.amazon.aps.iva.yb0.j.c(d2);
        if (((Boolean) d2).booleanValue()) {
            aVar.u();
            this.b.b0();
            return;
        }
        getView().I5(f1.K(p0.e, com.amazon.aps.iva.r10.a.e));
    }
}
