package com.amazon.aps.iva.j30;

import com.amazon.aps.iva.c30.a;
import com.amazon.aps.iva.i20.e;
import com.amazon.aps.iva.js.f;
import com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.UpsellV2Activity;
import java.util.List;
/* compiled from: UpsellV2Presenter.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.wy.b<z> implements n {
    public final com.amazon.aps.iva.j30.g b;
    public final a0 c;
    public final com.amazon.aps.iva.f20.b d;
    public final com.amazon.aps.iva.xh.b e;
    public final com.amazon.aps.iva.g30.g f;
    public final com.amazon.aps.iva.j30.c g;
    public final com.amazon.aps.iva.i20.e h;
    public final com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> i;
    public final com.amazon.aps.iva.xb0.a<Boolean> j;
    public final com.amazon.aps.iva.xb0.a<Boolean> k;

    /* compiled from: UpsellV2Presenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            o oVar = o.this;
            oVar.c.Q7(o.q6(oVar).Ke());
            oVar.getView().s9();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpsellV2Presenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            com.amazon.aps.iva.b30.c cVar;
            o oVar = o.this;
            if (oVar.k.invoke().booleanValue()) {
                oVar.getView().M0();
                com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d = oVar.c.R7().d();
                if (d != null && (cVar = d.b) != null) {
                    oVar.e.a(cVar.b);
                }
            }
            oVar.getView().s9();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpsellV2Presenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke() {
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpsellV2Presenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>>, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>> gVar2 = gVar;
            o oVar = o.this;
            gVar2.c(new p(oVar));
            gVar2.e(new q(oVar));
            gVar2.b(new s(oVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpsellV2Presenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a>, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a> gVar2 = gVar;
            o oVar = o.this;
            gVar2.c(new t(oVar));
            gVar2.e(new u(oVar));
            gVar2.b(new v(oVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpsellV2Presenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.b30.c>, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.b30.c> dVar) {
            com.amazon.aps.iva.c30.a aVar = ((com.amazon.aps.iva.b30.c) dVar.b).d;
            o oVar = o.this;
            if (aVar != null) {
                oVar.getView().Dc();
                w wVar = new w(oVar.getView());
                x xVar = new x(oVar.getView());
                com.amazon.aps.iva.c30.c cVar = com.amazon.aps.iva.c30.c.h;
                com.amazon.aps.iva.yb0.j.f(cVar, "showInYears");
                if (aVar instanceof a.C0161a) {
                    wVar.invoke(Integer.valueOf(aVar.a()));
                } else if (aVar instanceof a.b) {
                    xVar.invoke(Integer.valueOf(aVar.a()));
                } else if (aVar instanceof a.c) {
                    cVar.invoke(Integer.valueOf(aVar.a()));
                }
            } else {
                o.q6(oVar).Eh();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpsellV2Presenter.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e30.a, com.amazon.aps.iva.kb0.q> {
        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e30.a aVar) {
            com.amazon.aps.iva.e30.a aVar2 = aVar;
            o oVar = o.this;
            z q6 = o.q6(oVar);
            com.amazon.aps.iva.yb0.j.e(aVar2, "ctaModel");
            q6.H0(aVar2);
            com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d = oVar.c.R7().d();
            com.amazon.aps.iva.yb0.j.c(d);
            o.q6(oVar).w0(d.b, aVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpsellV2Presenter.kt */
    /* loaded from: classes2.dex */
    public static final class h implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public h(com.amazon.aps.iva.xb0.l lVar) {
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

    public o(UpsellV2Activity upsellV2Activity, com.amazon.aps.iva.j30.g gVar, e0 e0Var, com.amazon.aps.iva.f20.b bVar, com.amazon.aps.iva.xh.b bVar2, com.amazon.aps.iva.g30.g gVar2, com.amazon.aps.iva.j30.c cVar, com.amazon.aps.iva.i20.e eVar, com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.a aVar, com.amazon.aps.iva.xb0.a aVar2, com.amazon.aps.iva.xb0.a aVar3) {
        super(upsellV2Activity, new com.amazon.aps.iva.wy.j[0]);
        this.b = gVar;
        this.c = e0Var;
        this.d = bVar;
        this.e = bVar2;
        this.f = gVar2;
        this.g = cVar;
        this.h = eVar;
        this.i = aVar;
        this.j = aVar2;
        this.k = aVar3;
    }

    public static final /* synthetic */ z q6(o oVar) {
        return oVar.getView();
    }

    @Override // com.amazon.aps.iva.j30.n
    public final void B1(com.amazon.aps.iva.fs.b bVar) {
        this.g.a(bVar);
        getView().closeScreen();
    }

    @Override // com.amazon.aps.iva.j30.n
    public final void a() {
        this.h.e();
    }

    @Override // com.amazon.aps.iva.j30.n
    public final void c() {
        getView().closeScreen();
        this.h.e();
    }

    @Override // com.amazon.aps.iva.j30.n
    public final void j(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.b30.c cVar;
        String str;
        String str2;
        com.amazon.aps.iva.js.q qVar;
        a0 a0Var = this.c;
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d2 = a0Var.R7().d();
        com.amazon.aps.iva.ks.j jVar = null;
        if (d2 != null) {
            cVar = d2.b;
        } else {
            cVar = null;
        }
        com.amazon.aps.iva.i20.e eVar = this.h;
        if (cVar != null) {
            str = cVar.b;
        } else {
            str = null;
        }
        if (cVar != null) {
            str2 = cVar.c;
        } else {
            str2 = null;
        }
        f.d dVar = f.d.a;
        if (cVar != null) {
            qVar = com.amazon.aps.iva.b30.d.d(cVar);
        } else {
            qVar = null;
        }
        if (cVar != null) {
            jVar = com.amazon.aps.iva.b30.d.b(cVar);
        }
        eVar.a(bVar, str, str2, dVar, com.amazon.aps.iva.b30.d.a(cVar), qVar, jVar);
        if (this.j.invoke().booleanValue()) {
            a0Var.Q7(bVar);
        } else {
            this.d.a();
        }
    }

    @Override // com.amazon.aps.iva.j30.n
    public final void k(int i) {
        com.amazon.aps.iva.b30.c l = this.c.l(i);
        this.i.invoke(Integer.valueOf(i));
        if (l != null) {
            e.b.b(this.h, l.b, l.c, com.amazon.aps.iva.b30.d.a(l), com.amazon.aps.iva.b30.d.d(l), com.amazon.aps.iva.b30.d.b(l), 4);
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.d.c(new a(), new b(), c.h);
        a0 a0Var = this.c;
        a0Var.c().e(getView(), new h(new d()));
        a0Var.e1().e(getView(), new h(new e()));
        a0Var.R7().e(getView(), new h(new f()));
        a0Var.F().e(getView(), new h(new g()));
        if (this.b.a && this.j.invoke().booleanValue()) {
            getView().s9();
        } else {
            getView().k3();
        }
    }
}
