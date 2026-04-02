package com.amazon.aps.iva.v40;

import android.content.res.Configuration;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.js.e;
import com.amazon.aps.iva.js.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.us.p;
import com.amazon.aps.iva.yd.r;
import com.amazon.aps.iva.ys.o;
import com.ellation.crunchyroll.api.AccountPendingRestrictions;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.presentation.signing.signup.SignUpFlowActivity;
/* compiled from: SignUpPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.t40.a<k> implements com.amazon.aps.iva.v40.c {
    public final com.crunchyroll.auth.c d;
    public final l e;
    public final boolean f;
    public final com.amazon.aps.iva.ee.i g;
    public final com.amazon.aps.iva.us.n h;
    public final p i;
    public final com.amazon.aps.iva.v70.d j;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.v70.b> k;
    public final CountryCodeProvider l;
    public final AccountStateProvider m;
    public final r n;
    public final UserTokenInteractor o;
    public final o p;

    /* compiled from: SignUpPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            k s6 = d.s6(d.this);
            com.amazon.aps.iva.yb0.j.e(bool2, "defaultMarketingOptInState");
            s6.j2(bool2.booleanValue());
            return q.a;
        }
    }

    /* compiled from: SignUpPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>>, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(1);
            this.i = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>> dVar2 = dVar;
            d dVar3 = d.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new com.amazon.aps.iva.v40.e(dVar3));
            com.amazon.aps.iva.ez.g<? extends q> a = dVar2.a();
            if (a != null) {
                a.e(new com.amazon.aps.iva.v40.f(this.i));
                a.b(new com.amazon.aps.iva.v40.g(dVar3));
            }
            return q.a;
        }
    }

    /* compiled from: SignUpPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends String>>, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends String>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends String>> dVar2 = dVar;
            d dVar3 = d.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new h(dVar3));
            com.amazon.aps.iva.ez.g<? extends String> a = dVar2.a();
            if (a != null) {
                a.e(new i(dVar3));
                a.b(new j(dVar3));
            }
            return q.a;
        }
    }

    /* compiled from: SignUpPresenter.kt */
    /* renamed from: com.amazon.aps.iva.v40.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0784d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0784d(f fVar) {
            super(0);
            this.i = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            d dVar = d.this;
            if (dVar.m.getPendingRestrictions().contains(AccountPendingRestrictions.SET_EMAIL)) {
                dVar.n.b(new com.amazon.aps.iva.yd.g(true));
            } else {
                this.i.invoke();
            }
            return q.a;
        }
    }

    /* compiled from: SignUpPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            d dVar = d.this;
            RefreshTokenProvider.DefaultImpls.signOut$default(dVar.o, true, null, null, 6, null);
            dVar.p.d();
            ((k) dVar.getView()).qc(new com.crunchyroll.auth.c(false, false, null, ((k) dVar.getView()).Yf(), false, 23));
            ((k) dVar.getView()).closeScreen();
            return q.a;
        }
    }

    /* compiled from: SignUpPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            d dVar = d.this;
            ((com.amazon.aps.iva.t40.e) dVar.getView()).U1();
            ((k) dVar.getView()).f0();
            ((k) dVar.getView()).closeScreen();
            return q.a;
        }
    }

    /* compiled from: SignUpPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class g implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public g(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
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

    public d(SignUpFlowActivity signUpFlowActivity, com.amazon.aps.iva.h70.d dVar, com.amazon.aps.iva.h70.f fVar, com.crunchyroll.auth.c cVar, m mVar, boolean z, com.amazon.aps.iva.ee.i iVar, com.amazon.aps.iva.us.n nVar, p pVar, com.amazon.aps.iva.v70.d dVar2, com.ellation.crunchyroll.presentation.signing.signup.b bVar, CountryCodeProvider countryCodeProvider, AccountStateProvider accountStateProvider, r rVar, UserTokenInteractor userTokenInteractor, com.amazon.aps.iva.ys.p pVar2) {
        super(signUpFlowActivity, dVar, fVar, new com.amazon.aps.iva.wy.j[0]);
        this.d = cVar;
        this.e = mVar;
        this.f = z;
        this.g = iVar;
        this.h = nVar;
        this.i = pVar;
        this.j = dVar2;
        this.k = bVar;
        this.l = countryCodeProvider;
        this.m = accountStateProvider;
        this.n = rVar;
        this.o = userTokenInteractor;
        this.p = pVar2;
    }

    public static final /* synthetic */ k s6(d dVar) {
        return (k) dVar.getView();
    }

    @Override // com.amazon.aps.iva.v40.c
    public final void G3(boolean z, com.amazon.aps.iva.fs.b bVar) {
        boolean z2 = this.f;
        l lVar = this.e;
        p pVar = this.i;
        if (z2 && com.amazon.aps.iva.yb0.j.a(this.k.invoke(), this.j.a)) {
            String Yf = ((k) getView()).Yf();
            ((k) getView()).d();
            lVar.t6(Yf);
            pVar.g(com.amazon.aps.iva.ls.a.REGISTRATION, bVar, e.b.a, null);
            return;
        }
        String t1 = ((k) getView()).t1();
        String Gb = ((k) getView()).Gb();
        ((k) getView()).d();
        pVar.g(com.amazon.aps.iva.ls.a.REGISTRATION, bVar, e.a.a, t1);
        lVar.L1(t1, Gb, z);
    }

    @Override // com.amazon.aps.iva.v70.a
    public final void h5(com.amazon.aps.iva.v70.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "currentItem");
        com.amazon.aps.iva.v70.d dVar = this.j;
        boolean a2 = com.amazon.aps.iva.yb0.j.a(bVar, dVar.a);
        p pVar = this.i;
        if (a2) {
            ((k) getView()).Zg();
            ((k) getView()).N3();
            ((k) getView()).g5();
            ((k) getView()).A4();
            ((k) getView()).x1();
            ((k) getView()).n1();
            pVar.h(x.b.a);
            ((k) getView()).r2();
        } else if (com.amazon.aps.iva.yb0.j.a(bVar, dVar.b)) {
            ((k) getView()).Fa();
            ((k) getView()).B5();
            ((k) getView()).R3();
            ((k) getView()).y3();
            ((k) getView()).x1();
            ((k) getView()).A0();
            pVar.h(x.a.a);
            ((k) getView()).q2();
        }
    }

    @Override // com.amazon.aps.iva.v40.c
    public final void l6(com.amazon.aps.iva.fs.b bVar) {
        ((k) getView()).qc(this.d);
        ((k) getView()).closeScreen();
        this.h.e(bVar, com.amazon.aps.iva.ls.a.REGISTRATION);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        ((k) getView()).n();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (this.d.b) {
            ((k) getView()).Y2();
        }
        l lVar = this.e;
        lVar.X7().e((com.amazon.aps.iva.i5.o) getView(), new g(new a()));
        lVar.T7();
        f fVar = new f();
        lVar.K8().e((com.amazon.aps.iva.i5.o) getView(), new g(new b(fVar)));
        lVar.M1().e((com.amazon.aps.iva.i5.o) getView(), new g(new c()));
        this.g.a(new C0784d(fVar), com.amazon.aps.iva.ee.h.h);
        this.n.a(fVar, new e());
        if (this.f) {
            ((k) getView()).Y1(this.j);
            ((k) getView()).B0();
            ((k) getView()).setUserCountry(this.l.getCountryCode());
            h5(this.k.invoke());
            return;
        }
        ((k) getView()).A0();
        this.i.h(x.a.a);
        ((k) getView()).q2();
    }
}
