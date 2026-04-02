package com.amazon.aps.iva.cv;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.ellation.crunchyroll.crunchylists.crunchylist.CrunchylistActivity;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: CrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.wy.b<x> implements com.amazon.aps.iva.cv.k {
    public final y b;
    public final com.amazon.aps.iva.fv.c c;
    public final com.amazon.aps.iva.xu.e d;
    public final com.amazon.aps.iva.qv.v e;
    public final u f;
    public final com.amazon.aps.iva.n60.b g;
    public final com.amazon.aps.iva.xu.d h;
    public final com.ellation.crunchyroll.watchlist.a i;

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends w>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends w> gVar) {
            com.amazon.aps.iva.ez.g<? extends w> gVar2 = gVar;
            p pVar = p.this;
            gVar2.c(new com.amazon.aps.iva.cv.l(pVar));
            gVar2.e(new m(pVar));
            gVar2.b(new o(pVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nv.e, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.nv.e eVar) {
            p.q6(p.this).U3(eVar.e);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "$this$observeEvent");
            p.q6(p.this).showSnackbar(com.amazon.aps.iva.bt.c.b);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.qv.a, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.qv.a aVar) {
            com.amazon.aps.iva.qv.a aVar2 = aVar;
            if (aVar2 != null) {
                p.q6(p.this).showSnackbar(aVar2);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends Panel>, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends Panel> gVar) {
            com.amazon.aps.iva.ez.g<? extends Panel> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeEvent");
            p pVar = p.this;
            gVar2.e(new q(pVar));
            gVar2.b(new r(pVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.nv.e>, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.nv.e> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.nv.e> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "it");
            gVar2.e(new s(p.this));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "$this$observeEvent");
            p.q6(p.this).showSnackbar(com.amazon.aps.iva.bt.c.b);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.dv.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.amazon.aps.iva.dv.a aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            p.this.b.G7(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.dv.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.dv.a aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            p.this.b.p4(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            p.this.b.W3();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
            p.q6(p.this).l3(num.intValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class l implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public l(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
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

    public p(CrunchylistActivity crunchylistActivity, z zVar, com.amazon.aps.iva.fv.b bVar, com.amazon.aps.iva.xu.e eVar, com.amazon.aps.iva.qv.w wVar, v vVar, com.amazon.aps.iva.n60.b bVar2, com.amazon.aps.iva.xu.a aVar, com.ellation.crunchyroll.watchlist.a aVar2) {
        super(crunchylistActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = zVar;
        this.c = bVar;
        this.d = eVar;
        this.e = wVar;
        this.f = vVar;
        this.g = bVar2;
        this.h = aVar;
        this.i = aVar2;
    }

    public static final /* synthetic */ x q6(p pVar) {
        return pVar.getView();
    }

    @Override // com.amazon.aps.iva.cv.k
    public final void J5() {
        getView().closeScreen();
        getView().h3();
    }

    @Override // com.amazon.aps.iva.cv.k
    public final void M(com.amazon.aps.iva.nv.e eVar) {
        this.f.V6().k(new com.amazon.aps.iva.ez.d<>(eVar));
        getView().closeScreen();
    }

    @Override // com.amazon.aps.iva.cv.k
    public final void O(com.amazon.aps.iva.a70.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "actionItem");
        boolean a2 = com.amazon.aps.iva.yb0.j.a(bVar, c0.e);
        y yVar = this.b;
        if (a2) {
            T d2 = yVar.o4().d();
            com.amazon.aps.iva.yb0.j.c(d2);
            getView().I1((com.amazon.aps.iva.nv.e) d2);
        } else if (com.amazon.aps.iva.yb0.j.a(bVar, b0.e)) {
            T d3 = yVar.o4().d();
            com.amazon.aps.iva.yb0.j.c(d3);
            getView().N1((com.amazon.aps.iva.nv.e) d3);
        }
    }

    @Override // com.amazon.aps.iva.b60.i
    public final void U0(com.amazon.aps.iva.b60.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        this.b.a(jVar, new k());
    }

    @Override // com.amazon.aps.iva.cv.k
    public final void Z5(com.amazon.aps.iva.dv.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "crunchylistUiModel");
        this.b.h5(aVar);
        getView().e(aVar.d, new h(aVar), new i(aVar));
    }

    @Override // com.amazon.aps.iva.cv.t
    public final void i3(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        this.d.t(panel);
    }

    @Override // com.amazon.aps.iva.cv.k
    public final void j3() {
        getView().p2();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        y yVar = this.b;
        yVar.d8().e(getView(), new l(new a()));
        yVar.o4().e(getView(), new l(new b()));
        com.amazon.aps.iva.ez.e.a(yVar.E8(), getView(), new c());
        com.amazon.aps.iva.ez.e.a(yVar.C4(), getView(), new d());
        com.amazon.aps.iva.ez.e.a(yVar.H(), getView(), new e());
        this.e.d5().a(getView().getLifecycle(), new f());
        com.amazon.aps.iva.ez.e.a(this.c.Y5(), getView(), new g());
        this.i.a(this, getView());
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        this.g.a(new j());
    }

    @Override // com.amazon.aps.iva.cv.k
    public final void p0(int i2) {
        g.c a2;
        w wVar;
        List<com.amazon.aps.iva.dv.a> list;
        com.amazon.aps.iva.dv.a aVar;
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.b.d8().d();
        if (gVar != null && (a2 = gVar.a()) != null && (wVar = (w) a2.a) != null && (list = wVar.a) != null && (aVar = (com.amazon.aps.iva.dv.a) com.amazon.aps.iva.lb0.x.w0(i2, list)) != null) {
            Z5(aVar);
        }
    }

    @Override // com.amazon.aps.iva.cv.k
    public final void v4(com.amazon.aps.iva.dv.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "crunchylistUiModel");
        this.d.b(gVar.h);
    }

    @Override // com.amazon.aps.iva.cv.k
    public final void x4(com.amazon.aps.iva.dv.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "crunchylistUiModel");
        this.d.a(gVar.h);
    }

    @Override // com.amazon.aps.iva.cv.k
    public final void y5() {
        getView().z9(f1.K(c0.e, b0.e));
    }
}
