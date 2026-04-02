package com.amazon.aps.iva.k20;

import com.amazon.aps.iva.i5.w;
import com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue.CancellationRescueActivity;
/* compiled from: CancellationRescuePresenter.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.wy.b<r> implements l {
    public final k b;
    public final com.amazon.aps.iva.rv.a c;
    public final com.amazon.aps.iva.i20.a d;
    public final s e;

    /* compiled from: CancellationRescuePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a> gVar) {
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.wh.a> gVar2 = gVar;
            p pVar = p.this;
            gVar2.c(new m(pVar));
            gVar2.e(new n(pVar));
            gVar2.b(new o(pVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CancellationRescuePresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
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

    public p(CancellationRescueActivity cancellationRescueActivity, k kVar, com.amazon.aps.iva.rv.e eVar, com.amazon.aps.iva.i20.b bVar, t tVar) {
        super(cancellationRescueActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = kVar;
        this.c = eVar;
        this.d = bVar;
        this.e = tVar;
    }

    @Override // com.amazon.aps.iva.k20.l
    public final void C0(com.amazon.aps.iva.fs.b bVar) {
        k kVar = this.b;
        String str = kVar.d;
        if (str == null) {
            str = "";
        }
        this.d.b(bVar, str);
        this.e.x3(kVar.b, bVar);
    }

    @Override // com.amazon.aps.iva.k20.l
    public final void K2(com.amazon.aps.iva.fs.b bVar) {
        this.d.a(bVar);
        getView().close();
    }

    @Override // com.amazon.aps.iva.k20.l
    public final void l0(com.amazon.aps.iva.fs.b bVar) {
        this.d.e(bVar);
        if (this.c.c()) {
            getView().u7();
        } else {
            getView().a8();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        k kVar = this.b;
        this.d.f(kVar.b, kVar.c);
        String str = kVar.b;
        switch (str.hashCode()) {
            case -1666493765:
                if (str.equals("crunchyroll.google.fanpack.monthly") && kVar.e) {
                    getView().S9(com.amazon.aps.iva.k20.b.STORE_DISCOUNTS);
                    break;
                }
                break;
            case -1574954394:
                if (str.equals("crunchyroll.google.premium.monthly")) {
                    getView().b3();
                    getView().x6();
                    break;
                }
                break;
            case -447375682:
                if (str.equals("crunchyroll.google.fanpack.annually")) {
                    getView().S9(com.amazon.aps.iva.k20.b.ANNUAL_DISCOUNT);
                    break;
                }
                break;
            case 1568935424:
                if (str.equals("crunchyroll.google.superfanpack.monthly")) {
                    getView().S9(com.amazon.aps.iva.k20.b.STORE_DISCOUNTS_AND_GIFTS);
                    break;
                }
                break;
        }
        this.e.e1().e(getView(), new b(new a()));
    }

    @Override // com.amazon.aps.iva.k20.l
    public final void u3(com.amazon.aps.iva.fs.b bVar) {
        this.d.d(bVar);
        getView().setResult(10);
        getView().close();
    }
}
