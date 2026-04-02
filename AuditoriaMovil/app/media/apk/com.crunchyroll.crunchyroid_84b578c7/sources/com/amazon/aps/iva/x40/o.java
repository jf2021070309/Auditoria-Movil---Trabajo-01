package com.amazon.aps.iva.x40;

import com.amazon.aps.iva.cg.p;
import com.amazon.aps.iva.cg.s;
import com.amazon.aps.iva.us.w;
import com.amazon.aps.iva.x50.r;
import com.ellation.crunchyroll.api.AccountPendingRestrictions;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.presentation.startup.StartupActivity;
/* compiled from: StartupPresenter.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.wy.b<q> implements h {
    public final s b;
    public final com.amazon.aps.iva.ys.h c;
    public final com.amazon.aps.iva.q60.b d;
    public final com.amazon.aps.iva.x50.q e;
    public final f f;
    public final com.amazon.aps.iva.cg.d g;
    public final com.amazon.aps.iva.s40.c h;
    public final com.amazon.aps.iva.s40.c i;
    public final com.amazon.aps.iva.ho.c j;
    public final d k;
    public final w l;
    public final com.amazon.aps.iva.mh.a m;
    public final UserTokenInteractor n;
    public final com.amazon.aps.iva.ys.o o;
    public final AccountStateProvider p;
    public final p q;
    public boolean r;
    public boolean s;

    /* compiled from: StartupPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.cg.p i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.cg.p pVar) {
            super(0);
            this.i = pVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            o oVar = o.this;
            if (!oVar.getView().isFinishing()) {
                if (oVar.s) {
                    if (this.i instanceof p.m) {
                        i iVar = new i(oVar);
                        oVar.i.b(new j(oVar), iVar, new k(oVar.getView()));
                    } else {
                        l lVar = new l(oVar);
                        oVar.h.b(new m(oVar), lVar, new n(oVar.getView()));
                    }
                } else {
                    oVar.getView().Cc();
                    oVar.getView().finish();
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public o(com.amazon.aps.iva.cg.e eVar, s sVar, com.amazon.aps.iva.mh.a aVar, com.amazon.aps.iva.ho.c cVar, w wVar, AccountStateProvider accountStateProvider, UserTokenInteractor userTokenInteractor, CrunchyrollApplication crunchyrollApplication, com.amazon.aps.iva.ys.p pVar, com.amazon.aps.iva.s40.h hVar, com.amazon.aps.iva.s40.h hVar2, e eVar2, g gVar, StartupActivity startupActivity, r rVar, com.amazon.aps.iva.o60.i iVar) {
        super(startupActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = sVar;
        this.c = crunchyrollApplication;
        this.d = iVar;
        this.e = rVar;
        this.f = gVar;
        this.g = eVar;
        this.h = hVar;
        this.i = hVar2;
        this.j = cVar;
        this.k = eVar2;
        this.l = wVar;
        this.m = aVar;
        this.n = userTokenInteractor;
        this.o = pVar;
        this.p = accountStateProvider;
        this.q = new p();
    }

    @Override // com.amazon.aps.iva.x40.h
    public final void A() {
        r6();
    }

    @Override // com.amazon.aps.iva.x40.h
    public final void O4() {
        this.m.b();
        s6();
    }

    @Override // com.amazon.aps.iva.cg.q
    public final void T0(com.amazon.aps.iva.cg.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "deepLinkInput");
        com.amazon.aps.iva.a0.k.c = pVar;
        this.s = true;
        this.q.a = true;
        q6();
    }

    @Override // com.amazon.aps.iva.x40.h
    public final void X4() {
        getView().finish();
    }

    @Override // com.amazon.aps.iva.ys.l
    public final void b0() {
        this.q.b = true;
        q6();
    }

    @Override // com.amazon.aps.iva.ys.l
    public final void k2(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        getView().ph();
        getView().zh(true);
        this.f.b();
    }

    @Override // com.amazon.aps.iva.q60.a
    public final void m2() {
        this.q.c = true;
        q6();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
        this.c.d(this);
        k2(new com.amazon.aps.iva.x50.s("No network onNetworkConnectionLost"));
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
        if (!this.r) {
            r6();
        }
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onDestroy() {
        this.c.d(this);
        this.b.a(null);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onStart() {
        this.r = false;
        s sVar = this.b;
        sVar.a(this);
        sVar.init();
        if (this.e.c()) {
            r6();
        } else {
            k2(new com.amazon.aps.iva.x50.s("No network onStart"));
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onStop() {
        this.r = true;
        this.c.d(this);
    }

    public final void q6() {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.k.a()) {
            getView().finish();
            return;
        }
        p pVar = this.q;
        boolean z4 = true;
        if (pVar.a && pVar.b && pVar.c) {
            z = true;
        } else {
            z = false;
        }
        if (z && !getView().isFinishing()) {
            com.amazon.aps.iva.cg.p pVar2 = com.amazon.aps.iva.a0.k.c;
            if (this.s && ((pVar2 instanceof p.m) || (pVar2 instanceof p.l))) {
                String str = pVar2.a().a;
                if (str != null && com.amazon.aps.iva.oe0.q.i0(str, "launch_source=app_widget", false)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    this.g.b(pVar2);
                }
            }
            boolean a2 = this.m.a();
            com.amazon.aps.iva.ys.h hVar = this.c;
            if (a2) {
                if (hVar.b().m0() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    getView().W9();
                    this.f.a();
                    this.l.c();
                }
            }
            if (hVar.b().m0() == null) {
                z4 = false;
            }
            if (z4) {
                if (this.p.getPendingRestrictions().contains(AccountPendingRestrictions.SET_EMAIL)) {
                    RefreshTokenProvider.DefaultImpls.signOut$default(this.n, true, null, null, 6, null);
                    this.o.d();
                    getView().Cc();
                    getView().finish();
                } else {
                    s6();
                }
            } else {
                getView().dg(new a(pVar2));
            }
            this.f.a();
            this.l.c();
        }
    }

    public final void r6() {
        this.f.c();
        q view = getView();
        view.zh(false);
        view.a();
        this.d.a(getView(), this);
        com.amazon.aps.iva.ys.h hVar = this.c;
        hVar.a(this);
        hVar.initialize();
    }

    public final void s6() {
        com.amazon.aps.iva.ho.c cVar = this.j;
        if (cVar.c()) {
            getView().n0();
            return;
        }
        getView().A();
        cVar.a();
        getView().finish();
    }

    @Override // com.amazon.aps.iva.cg.q
    public final void t0() {
        this.q.a = true;
        q6();
    }

    @Override // com.amazon.aps.iva.x40.h
    public final void u2() {
        getView().mc();
    }
}
