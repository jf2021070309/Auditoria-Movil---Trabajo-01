package com.amazon.aps.iva.qv;

import com.amazon.aps.iva.gv.i;
/* compiled from: ModifyCrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.wy.b<x> implements k {
    public final y b;
    public final com.amazon.aps.iva.yu.v c;
    public final com.amazon.aps.iva.gv.i d;
    public final com.amazon.aps.iva.gv.f e;
    public final b0 f;
    public final boolean g;

    /* compiled from: ModifyCrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.nv.e>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.nv.e> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.nv.e> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "it");
            r rVar = r.this;
            gVar2.c(new o(rVar));
            gVar2.e(new p(rVar));
            gVar2.b(new q(rVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ModifyCrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.nv.e>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.nv.e> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.nv.e> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "it");
            r rVar = r.this;
            gVar2.c(new s(rVar));
            gVar2.e(new t(rVar));
            gVar2.b(new u(rVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ModifyCrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(n nVar) {
            this.a = nVar;
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

    public r(com.amazon.aps.iva.qv.c cVar, z zVar, com.amazon.aps.iva.yu.w wVar, com.amazon.aps.iva.gv.i iVar, com.amazon.aps.iva.gv.f fVar, c0 c0Var, boolean z) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = zVar;
        this.c = wVar;
        this.d = iVar;
        this.e = fVar;
        this.f = c0Var;
        this.g = z;
    }

    @Override // com.amazon.aps.iva.qv.k
    public final void e() {
        boolean z = this.g;
        com.amazon.aps.iva.gv.f fVar = this.e;
        if (z) {
            fVar.b();
        } else {
            fVar.closeScreen();
        }
    }

    @Override // com.amazon.aps.iva.qv.k
    public final void g0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "listTitle");
        com.amazon.aps.iva.gv.i iVar = this.d;
        boolean z = iVar instanceof i.c;
        y yVar = this.b;
        if (z) {
            yVar.H3(str, ((i.c) iVar).b);
        } else {
            yVar.x1(str);
        }
        getView().r0();
    }

    @Override // com.amazon.aps.iva.qv.k
    public final void l5(boolean z) {
        if (z) {
            getView().B1();
        } else {
            getView().J();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.gv.i iVar = this.d;
        if (iVar instanceof i.c) {
            getView().x7(((i.c) iVar).b.e);
        } else {
            getView().Z7();
        }
        y yVar = this.b;
        yVar.v0().a(getView().getLifecycle(), new a());
        yVar.d5().a(getView().getLifecycle(), new b());
        this.f.c();
    }
}
