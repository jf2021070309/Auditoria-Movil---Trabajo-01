package com.amazon.aps.iva.u40;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.amazon.aps.iva.cx.s;
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
import com.ellation.crunchyroll.presentation.signing.signin.SignInActivity;
/* compiled from: SignInPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.t40.a<l> implements com.amazon.aps.iva.u40.c {
    public final boolean d;
    public final com.crunchyroll.auth.c e;
    public final m f;
    public final p g;
    public final com.amazon.aps.iva.us.n h;
    public final com.amazon.aps.iva.co.d i;
    public final boolean j;
    public final com.amazon.aps.iva.ee.i k;
    public final com.amazon.aps.iva.v70.d l;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.v70.b> m;
    public final CountryCodeProvider n;
    public final AccountStateProvider o;
    public final r p;
    public final UserTokenInteractor q;
    public final o r;
    public final com.amazon.aps.iva.co.b s;

    /* compiled from: SignInPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends k>>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends k>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends k>> dVar2 = dVar;
            g gVar = g.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new com.amazon.aps.iva.u40.d(gVar));
            com.amazon.aps.iva.ez.g<? extends k> a = dVar2.a();
            if (a != null) {
                a.e(new com.amazon.aps.iva.u40.e(gVar));
                a.b(new com.amazon.aps.iva.u40.f(gVar));
            }
            return q.a;
        }
    }

    /* compiled from: SignInPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends String>>, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends String>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends String>> dVar2 = dVar;
            g gVar = g.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new h(gVar));
            com.amazon.aps.iva.ez.g<? extends String> a = dVar2.a();
            if (a != null) {
                a.e(new i(gVar));
                a.b(new j(gVar, a));
            }
            return q.a;
        }
    }

    /* compiled from: SignInPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            g gVar = g.this;
            gVar.h.i(e.b.a, null, null);
            if (gVar.o.getPendingRestrictions().contains(AccountPendingRestrictions.SET_EMAIL)) {
                gVar.p.b(new com.amazon.aps.iva.yd.g(false));
            } else {
                ((l) gVar.getView()).f0();
                ((l) gVar.getView()).closeScreen();
            }
            return q.a;
        }
    }

    /* compiled from: SignInPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            g gVar = g.this;
            g.s6(gVar).f0();
            g.s6(gVar).closeScreen();
            return q.a;
        }
    }

    /* compiled from: SignInPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            g gVar = g.this;
            RefreshTokenProvider.DefaultImpls.signOut$default(gVar.q, true, null, null, 6, null);
            gVar.r.d();
            return q.a;
        }
    }

    /* compiled from: SignInPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class f implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public f(com.amazon.aps.iva.xb0.l lVar) {
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

    public g(SignInActivity signInActivity, com.amazon.aps.iva.h70.d dVar, com.amazon.aps.iva.h70.f fVar, boolean z, com.crunchyroll.auth.c cVar, m mVar, p pVar, com.amazon.aps.iva.us.n nVar, s sVar, boolean z2, com.amazon.aps.iva.ee.i iVar, com.amazon.aps.iva.v70.d dVar2, com.ellation.crunchyroll.presentation.signing.signin.e eVar, CountryCodeProvider countryCodeProvider, AccountStateProvider accountStateProvider, r rVar, UserTokenInteractor userTokenInteractor, com.amazon.aps.iva.ys.p pVar2, com.amazon.aps.iva.cx.h hVar) {
        super(signInActivity, dVar, fVar, new com.amazon.aps.iva.wy.j[0]);
        this.d = z;
        this.e = cVar;
        this.f = mVar;
        this.g = pVar;
        this.h = nVar;
        this.i = sVar;
        this.j = z2;
        this.k = iVar;
        this.l = dVar2;
        this.m = eVar;
        this.n = countryCodeProvider;
        this.o = accountStateProvider;
        this.p = rVar;
        this.q = userTokenInteractor;
        this.r = pVar2;
        this.s = hVar;
    }

    public static final /* synthetic */ l s6(g gVar) {
        return (l) gVar.getView();
    }

    @Override // com.amazon.aps.iva.u40.c
    public final void R2(com.amazon.aps.iva.fs.b bVar) {
        boolean z = this.j;
        m mVar = this.f;
        com.amazon.aps.iva.us.n nVar = this.h;
        if (z && com.amazon.aps.iva.yb0.j.a(this.m.invoke(), this.l.a)) {
            nVar.g(com.amazon.aps.iva.ls.a.LOGIN, bVar, e.b.a, null);
            mVar.n3(((l) getView()).Yf());
            return;
        }
        nVar.g(com.amazon.aps.iva.ls.a.LOGIN, bVar, e.a.a, ((l) getView()).t1());
        mVar.S(((l) getView()).t1(), ((l) getView()).Gb());
    }

    @Override // com.amazon.aps.iva.u40.c
    public final void X2() {
        String t1 = ((l) getView()).t1();
        if (!com.amazon.aps.iva.oe0.q.i0(t1, "@", false)) {
            t1 = null;
        }
        ((l) getView()).A1(t1);
    }

    @Override // com.amazon.aps.iva.v70.a
    public final void h5(com.amazon.aps.iva.v70.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "currentItem");
        com.amazon.aps.iva.v70.d dVar = this.l;
        boolean a2 = com.amazon.aps.iva.yb0.j.a(bVar, dVar.a);
        com.amazon.aps.iva.us.n nVar = this.h;
        if (a2) {
            ((l) getView()).Zg();
            ((l) getView()).N3();
            ((l) getView()).g5();
            ((l) getView()).x1();
            ((l) getView()).n1();
            ((l) getView()).r2();
            nVar.h(x.b.a);
        } else if (com.amazon.aps.iva.yb0.j.a(bVar, dVar.b)) {
            ((l) getView()).Fa();
            ((l) getView()).B5();
            ((l) getView()).R3();
            ((l) getView()).x1();
            ((l) getView()).A0();
            ((l) getView()).q2();
            nVar.h(x.a.a);
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10 && i2 == -1) {
            ((l) getView()).showSnackbar(com.amazon.aps.iva.k10.m.b);
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        ((l) getView()).n();
    }

    @Override // com.amazon.aps.iva.u40.c
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2 = this.d;
        if (z2) {
            ((l) getView()).Rh();
        } else {
            ((l) getView()).Ee();
        }
        com.crunchyroll.auth.c cVar = this.e;
        if (cVar.b) {
            ((l) getView()).Y2();
            ((l) getView()).ye();
        } else if (cVar.c) {
            ((l) getView()).zb();
        }
        boolean z3 = this.j;
        if (bundle == null && !z2) {
            if (z3) {
                ((l) getView()).T8();
            } else {
                ((l) getView()).G6();
            }
        }
        if (this.i.isEnabled()) {
            ((l) getView()).ad();
        } else {
            ((l) getView()).Yd();
        }
        m mVar = this.f;
        mVar.E().e((com.amazon.aps.iva.i5.o) getView(), new f(new a()));
        mVar.B8().e((com.amazon.aps.iva.i5.o) getView(), new f(new b()));
        this.k.a(new c(), com.amazon.aps.iva.ee.h.h);
        this.p.a(new d(), new e());
        if (z3) {
            ((l) getView()).Y1(this.l);
            ((l) getView()).B0();
            String str = cVar.e;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                com.amazon.aps.iva.yb0.j.c(str);
                ((l) getView()).setPhoneNumber(str);
            } else {
                ((l) getView()).setUserCountry(this.n.getCountryCode());
            }
            h5(this.m.invoke());
        } else {
            this.h.h(x.a.a);
            ((l) getView()).A0();
            ((l) getView()).q2();
        }
        if (this.s.isEnabled()) {
            ((l) getView()).te();
        }
    }

    @Override // com.amazon.aps.iva.u40.c
    public final void p2() {
        this.h.i(e.a.a, ((l) getView()).t1(), com.amazon.aps.iva.js.i.CR_VOD_PARENTAL_CONTROLS);
        ((l) getView()).f0();
        ((l) getView()).closeScreen();
    }

    @Override // com.amazon.aps.iva.u40.c
    public final void t1(com.amazon.aps.iva.fs.b bVar) {
        ((l) getView()).R7(this.e);
        ((l) getView()).closeScreen();
        this.g.e(bVar, com.amazon.aps.iva.ls.a.LOGIN);
    }
}
