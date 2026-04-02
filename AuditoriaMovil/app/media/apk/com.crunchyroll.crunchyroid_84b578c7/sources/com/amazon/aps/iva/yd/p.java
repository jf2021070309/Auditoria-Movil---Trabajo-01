package com.amazon.aps.iva.yd;

import com.crunchyroll.auth.emailmandatory.EmailMandatoryActivity;
import com.google.android.gms.common.Scopes;
/* compiled from: EmailMandatoryPresenter.kt */
/* loaded from: classes.dex */
public final class p extends com.amazon.aps.iva.wy.b<w> implements l {
    public final g b;
    public final x c;
    public final com.amazon.aps.iva.de.b d;
    public final e e;
    public final com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> f;

    /* compiled from: EmailMandatoryPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.j<? extends String, ? extends Boolean>>>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.j<? extends String, ? extends Boolean>>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.j<? extends String, ? extends Boolean>>> dVar2 = dVar;
            p pVar = p.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new m(pVar));
            com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.kb0.j<? extends String, ? extends Boolean>> a = dVar2.a();
            if (a != null) {
                a.e(new n(pVar));
                a.b(new o(pVar));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: EmailMandatoryPresenter.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            Boolean bool2 = bool;
            w q6 = p.q6(p.this);
            com.amazon.aps.iva.yb0.j.e(bool2, "defaultMarketingOptInState");
            q6.j2(bool2.booleanValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: EmailMandatoryPresenter.kt */
    /* loaded from: classes.dex */
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

    public p(EmailMandatoryActivity emailMandatoryActivity, g gVar, z zVar, com.amazon.aps.iva.de.c cVar, f fVar, j jVar) {
        super(emailMandatoryActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = gVar;
        this.c = zVar;
        this.d = cVar;
        this.e = fVar;
        this.f = jVar;
    }

    public static final /* synthetic */ w q6(p pVar) {
        return pVar.getView();
    }

    @Override // com.amazon.aps.iva.yd.l
    public final void a() {
        if (this.b.a) {
            getView().b0();
            return;
        }
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q> d = this.d.a().d();
        if (d != null) {
            d.a();
        }
        getView().closeScreen();
    }

    @Override // com.amazon.aps.iva.yd.l
    public final void i2(String str, boolean z, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        this.c.F3(str, z);
        this.e.d(bVar);
    }

    @Override // com.amazon.aps.iva.yd.l
    public final void o0() {
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q> d = this.d.a().d();
        if (d != null) {
            d.a();
        }
        getView().closeScreen();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        x xVar = this.c;
        xVar.C8().e(getView(), new c(new a()));
        xVar.e2().e(getView(), new c(new b()));
        this.e.a();
    }
}
