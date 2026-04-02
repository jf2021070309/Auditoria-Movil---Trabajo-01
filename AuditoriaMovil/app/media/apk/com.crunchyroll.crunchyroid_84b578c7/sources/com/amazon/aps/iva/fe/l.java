package com.amazon.aps.iva.fe;

import com.crunchyroll.auth.otpview.a;
import com.crunchyroll.auth.screen.OtpActivity;
/* compiled from: OtpPresenter.kt */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.wy.b<p> implements i {
    public final com.amazon.aps.iva.ee.a b;
    public final q c;
    public final v d;
    public final a0 e;
    public final com.amazon.aps.iva.fe.d f;

    /* compiled from: OtpPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends Integer>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends Integer> gVar) {
            com.amazon.aps.iva.ez.g<? extends Integer> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$observeEvent");
            l lVar = l.this;
            gVar2.e(new j(lVar));
            gVar2.b(new k(lVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: OtpPresenter.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q>>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q>> dVar2 = dVar;
            l lVar = l.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new m(lVar));
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.q> a = dVar2.a();
            if (a != null) {
                a.e(new n(lVar));
                a.b(new o(lVar));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: OtpPresenter.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(str2, "$this$observeEvent");
            l lVar = l.this;
            l.q6(lVar).l6(str2);
            lVar.I0(str2, null);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: OtpPresenter.kt */
    /* loaded from: classes.dex */
    public static final class d implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public d(b bVar) {
            this.a = bVar;
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

    public l(OtpActivity otpActivity, com.amazon.aps.iva.ee.a aVar, t tVar, w wVar, b0 b0Var, e eVar) {
        super(otpActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = aVar;
        this.c = tVar;
        this.d = wVar;
        this.e = b0Var;
        this.f = eVar;
    }

    public static final /* synthetic */ p q6(l lVar) {
        return lVar.getView();
    }

    @Override // com.amazon.aps.iva.fe.i
    public final void H5() {
        com.amazon.aps.iva.ee.a aVar = this.b;
        boolean z = aVar.b;
        q qVar = this.c;
        if (z) {
            qVar.J6(aVar.a);
        } else {
            qVar.J5(aVar.a);
        }
        this.f.b();
    }

    @Override // com.amazon.aps.iva.fe.i
    public final void I0(String str, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "otp");
        com.amazon.aps.iva.ee.a aVar = this.b;
        this.c.p3(aVar.a, str, aVar.b);
        this.f.d(bVar);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.ee.a aVar = this.b;
        if (aVar.b) {
            getView().i4();
            getView().i7();
        } else {
            getView().P3();
            getView().xh();
        }
        getView().nb(this.d.a(aVar.a));
        q qVar = this.c;
        com.amazon.aps.iva.ez.e.a(qVar.L5(), getView(), new a());
        qVar.z6().e(getView(), new d(new b()));
        com.amazon.aps.iva.ez.e.a(this.e.a(), getView(), new c());
        getView().zf();
        this.f.a();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onDestroy() {
        getView().ue();
    }

    @Override // com.amazon.aps.iva.fe.i
    public final void r1(com.crunchyroll.auth.otpview.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "otpTextState");
        if (aVar instanceof a.C0951a) {
            getView().B1();
            return;
        }
        getView().i6();
        getView().J();
    }
}
