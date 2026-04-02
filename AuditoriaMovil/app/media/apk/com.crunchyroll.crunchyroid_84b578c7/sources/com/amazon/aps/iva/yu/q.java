package com.amazon.aps.iva.yu;
/* compiled from: AddToCrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.wy.b<u> implements l {
    public final v b;
    public final com.amazon.aps.iva.gv.f c;
    public final com.amazon.aps.iva.yu.c d;

    /* compiled from: AddToCrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends x>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends x> gVar) {
            com.amazon.aps.iva.ez.g<? extends x> gVar2 = gVar;
            q qVar = q.this;
            gVar2.c(new m(qVar));
            gVar2.e(new n(qVar));
            gVar2.b(new p(qVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AddToCrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.nv.e i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.nv.e eVar) {
            super(1);
            this.i = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q> gVar2 = gVar;
            q qVar = q.this;
            com.amazon.aps.iva.nv.e eVar = this.i;
            gVar2.b(new r(qVar, eVar));
            gVar2.e(new s(qVar, eVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AddToCrunchylistPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(com.amazon.aps.iva.xb0.l lVar) {
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

    public q(e eVar, w wVar, com.amazon.aps.iva.gv.f fVar, d dVar) {
        super(eVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = wVar;
        this.c = fVar;
        this.d = dVar;
    }

    @Override // com.amazon.aps.iva.yu.l
    public final void D(com.amazon.aps.iva.nv.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "crunchylistItemUiModel");
        v vVar = this.b;
        vVar.H().e(getView(), new c(new b(eVar)));
        vVar.o7(eVar.d);
    }

    @Override // com.amazon.aps.iva.yu.l
    public final void U() {
        this.c.c();
    }

    @Override // com.amazon.aps.iva.yu.l
    public final void e() {
        this.c.closeScreen();
    }

    @Override // com.amazon.aps.iva.yu.l
    public final void g6() {
        getView().Ih();
    }

    @Override // com.amazon.aps.iva.yu.l
    public final void o3(int i, int i2) {
        if (i + 1 == i2) {
            getView().E6();
        } else {
            getView().J6();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.s().e(getView(), new c(new a()));
    }
}
