package com.amazon.aps.iva.yw;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.cj.b;
import com.amazon.aps.iva.co.f;
import com.amazon.aps.iva.ct.j;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.lo.c;
import com.amazon.aps.iva.se0.d1;
import com.amazon.aps.iva.sv.c;
import com.amazon.aps.iva.sv.h;
import com.amazon.aps.iva.sv.m2;
import com.amazon.aps.iva.sv.u1;
import com.amazon.aps.iva.sv.v1;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.vn.e;
import com.amazon.aps.iva.y30.h;
import com.amazon.aps.iva.yg.c;
import com.amazon.aps.iva.yh.f;
import com.amazon.aps.iva.zv.b;
import com.crunchyroll.connectivity.d;
import com.crunchyroll.credentialsprovider.a;
import com.crunchyroll.onboarding.d;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.EtpNetworkModule;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.contentreviews.ContentReviewsService;
import com.ellation.crunchyroll.api.etp.externalparteners.ExternalPartnersService;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.application.d;
import com.ellation.crunchyroll.cast.CastFeature;
import com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor;
import com.ellation.crunchyroll.presentation.main.home.HomeBottomBarActivity;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class d0 implements a {
    public final f1 A;
    public final com.amazon.aps.iva.vn.f B;
    public final com.amazon.aps.iva.bo.f a;
    public final EtpNetworkModule b;
    public final com.amazon.aps.iva.fm.g c;
    public final com.amazon.aps.iva.aj.j d;
    public final com.amazon.aps.iva.yg.d e;
    public final com.amazon.aps.iva.ut.c f;
    public final com.amazon.aps.iva.xu.f g;
    public final com.amazon.aps.iva.fz.i h;
    public final com.amazon.aps.iva.f20.j i;
    public final CastFeature j;
    public final com.amazon.aps.iva.cj.n k;
    public final com.amazon.aps.iva.sv.e l;
    public final com.amazon.aps.iva.jd.c m;
    public final com.amazon.aps.iva.yi.e n;
    public final com.amazon.aps.iva.ch.d o;
    public final com.amazon.aps.iva.me.b p;
    public final com.amazon.aps.iva.co.g q;
    public final com.amazon.aps.iva.kf.f r;
    public final com.amazon.aps.iva.yh.i s;
    public final com.amazon.aps.iva.kn.a t;
    public final com.amazon.aps.iva.rd.e u;
    public final com.amazon.aps.iva.lo.d v;
    public final com.amazon.aps.iva.my.d w;
    public final com.amazon.aps.iva.vd.e x;
    public final com.amazon.aps.iva.nh.e y;
    public final l1 z;

    /* JADX WARN: Type inference failed for: r10v4, types: [com.amazon.aps.iva.yw.s] */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.amazon.aps.iva.yw.t] */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.amazon.aps.iva.yw.u] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.amazon.aps.iva.yw.p] */
    /* JADX WARN: Type inference failed for: r8v15, types: [com.amazon.aps.iva.jx.b] */
    public d0(com.amazon.aps.iva.ya0.f fVar, com.amazon.aps.iva.bo.f fVar2, com.amazon.aps.iva.x50.a aVar, EtpNetworkModule etpNetworkModule, com.amazon.aps.iva.x50.p pVar) {
        com.amazon.aps.iva.sv.h m2Var;
        com.amazon.aps.iva.oy.b mVar;
        this.a = fVar2;
        this.b = etpNetworkModule;
        com.amazon.aps.iva.fm.g.e = new com.amazon.aps.iva.ox.d();
        com.amazon.aps.iva.fm.g gVar = new com.amazon.aps.iva.fm.g();
        com.amazon.aps.iva.fm.g.f = gVar;
        this.c = gVar;
        com.amazon.aps.iva.aj.j jVar = new com.amazon.aps.iva.aj.j(new z(this));
        com.amazon.aps.iva.aj.j.d = jVar;
        this.d = jVar;
        com.amazon.aps.iva.hx.b bVar = new com.amazon.aps.iva.hx.b(com.ellation.crunchyroll.application.e.b(), etpNetworkModule.getAccountService(), new b(this), c.h, new d(this), etpNetworkModule.getAccountStateProvider(), etpNetworkModule.getUserTokenInteractor());
        com.amazon.aps.iva.yg.d dVar = new com.amazon.aps.iva.yg.d(bVar);
        c.a.b = dVar;
        EtpAccountService etpAccountService = bVar.b;
        com.amazon.aps.iva.yb0.j.f(etpAccountService, "accountService");
        UserTokenInteractor userTokenInteractor = bVar.g;
        com.amazon.aps.iva.yb0.j.f(userTokenInteractor, "userTokenInteractor");
        com.amazon.aps.iva.zg.n nVar = new com.amazon.aps.iva.zg.n(etpAccountService, userTokenInteractor);
        c.b bVar2 = c.b.a;
        com.amazon.aps.iva.yg.j jVar2 = new com.amazon.aps.iva.yg.j(bVar.a, bVar.i, bVar.h);
        d1 d1Var = d1.b;
        com.amazon.aps.iva.xb0.a<String> aVar2 = bVar.c;
        com.amazon.aps.iva.yb0.j.f(aVar2, "getEmail");
        com.amazon.aps.iva.zg.e eVar = new com.amazon.aps.iva.zg.e(nVar, aVar2, jVar2, bVar2, d1Var);
        c.a.a = eVar;
        eVar.g.f(new c.b(new com.amazon.aps.iva.yg.b(bVar)));
        this.e = dVar;
        TalkboxService talkboxService = com.ellation.crunchyroll.application.e.c().getTalkboxService();
        com.amazon.aps.iva.bx.a aVar3 = new com.amazon.aps.iva.bx.a(com.amazon.aps.iva.uy.a.a);
        AccountStateProvider accountStateProvider = com.ellation.crunchyroll.application.e.c().getAccountStateProvider();
        com.amazon.aps.iva.bx.c cVar = new com.amazon.aps.iva.bx.c(dVar);
        com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
        com.amazon.aps.iva.bx.e eVar2 = com.amazon.aps.iva.bx.e.h;
        com.amazon.aps.iva.yb0.j.f(eVar2, "profileActivationRouterFactory");
        com.amazon.aps.iva.yb0.j.f(accountStateProvider, "accountStateProvider");
        com.amazon.aps.iva.ut.c cVar2 = new com.amazon.aps.iva.ut.c(talkboxService, aVar3, gVar, cVar, eVar2);
        com.amazon.aps.iva.ut.c.f = cVar2;
        com.amazon.aps.iva.ut.c.g = cVar2;
        com.amazon.aps.iva.ut.c.h = new com.amazon.aps.iva.iu.b(accountStateProvider);
        this.f = cVar2;
        com.amazon.aps.iva.ex.h hVar = com.amazon.aps.iva.ex.h.a;
        hVar.getClass();
        com.amazon.aps.iva.ex.b bVar3 = new com.amazon.aps.iva.ex.b(hVar);
        EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
        com.amazon.aps.iva.ex.c cVar3 = new com.amazon.aps.iva.ex.c(hVar);
        com.amazon.aps.iva.ex.d dVar2 = new com.amazon.aps.iva.ex.d(hVar);
        com.amazon.aps.iva.ex.a aVar4 = com.amazon.aps.iva.ex.a.h;
        com.amazon.aps.iva.yb0.j.f(aVar4, "navigateToBrowse");
        com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
        com.amazon.aps.iva.xu.f fVar3 = new com.amazon.aps.iva.xu.f(aVar4, bVar3, etpContentService, cVar3, dVar2);
        com.amazon.aps.iva.e1.d.f = fVar3;
        this.g = fVar3;
        this.h = new com.amazon.aps.iva.fz.i();
        ?? r5 = new com.amazon.aps.iva.yb0.t(this) { // from class: com.amazon.aps.iva.yw.p
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                boolean z;
                if (((d0) this.receiver).a.m0() != null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
        q qVar = new q(this);
        CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
        String packageName = CrunchyrollApplication.a.a().getPackageName();
        com.amazon.aps.iva.yb0.j.e(packageName, "CrunchyrollApplication.getInstance().packageName");
        ExternalPartnersService externalPartnersService = com.ellation.crunchyroll.application.e.c().getExternalPartnersService();
        JwtInvalidator jwtInvalidator = com.ellation.crunchyroll.application.e.c().getJwtInvalidator();
        com.amazon.aps.iva.ct.l userBenefitsSynchronizer = com.ellation.crunchyroll.application.e.c().getUserBenefitsSynchronizer();
        ChromecastUserStatusInteractor create = ChromecastUserStatusInteractor.Companion.create();
        com.amazon.aps.iva.yb0.j.f(externalPartnersService, "externalPartnersService");
        com.amazon.aps.iva.yb0.j.f(jwtInvalidator, "indexInvalidator");
        com.amazon.aps.iva.yb0.j.f(userBenefitsSynchronizer, "userBenefitsSynchronizer");
        com.amazon.aps.iva.yb0.j.f(create, "chromecastUserStatusInteractor");
        com.amazon.aps.iva.sz.b bVar4 = new com.amazon.aps.iva.sz.b(packageName, externalPartnersService, jwtInvalidator, userBenefitsSynchronizer, create);
        SubscriptionProcessorService subscriptionProcessorService = etpNetworkModule.getSubscriptionProcessorService();
        final com.amazon.aps.iva.ct.k a = com.ellation.crunchyroll.application.f.a(null, 3);
        ?? r10 = new com.amazon.aps.iva.yb0.t(a) { // from class: com.amazon.aps.iva.yw.s
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).getHasPremiumBenefit());
            }
        };
        final com.amazon.aps.iva.ct.k a2 = com.ellation.crunchyroll.application.f.a(null, 3);
        ?? r13 = new com.amazon.aps.iva.yb0.t(a2) { // from class: com.amazon.aps.iva.yw.t
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).m());
            }
        };
        final com.amazon.aps.iva.ct.k a3 = com.ellation.crunchyroll.application.f.a(null, 3);
        ?? r132 = new com.amazon.aps.iva.yb0.t(a3) { // from class: com.amazon.aps.iva.yw.u
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).R1());
            }
        };
        com.amazon.aps.iva.ct.k a4 = com.ellation.crunchyroll.application.f.a(fVar, 2);
        o oVar = new o(CrunchyrollApplication.a.a());
        com.amazon.aps.iva.yb0.j.f(subscriptionProcessorService, "subscriptionProcessorService");
        r rVar = r.h;
        com.amazon.aps.iva.yb0.j.f(rVar, "getBillingStatusProvider");
        v vVar = v.h;
        com.amazon.aps.iva.yb0.j.f(vVar, "getBillingNotificationConfig");
        w wVar = w.h;
        com.amazon.aps.iva.yb0.j.f(wVar, "getDisclaimerPresenter");
        x xVar = x.h;
        com.amazon.aps.iva.yb0.j.f(xVar, "isBentoEnabled");
        m mVar2 = m.h;
        com.amazon.aps.iva.yb0.j.f(mVar2, "isIntroOfferEnabled");
        n nVar2 = n.h;
        com.amazon.aps.iva.yb0.j.f(nVar2, "preselectedTierConfig");
        com.amazon.aps.iva.f20.j jVar3 = new com.amazon.aps.iva.f20.j(fVar, r5, qVar, bVar4, subscriptionProcessorService, rVar, r10, r13, r132, vVar, wVar, a4, xVar, mVar2, nVar2, oVar);
        i.a.a = jVar3;
        this.i = jVar3;
        CastFeature create2 = CastFeature.Companion.create(new com.amazon.aps.iva.ax.f(jVar3, gVar, etpNetworkModule, new i(this)));
        this.j = create2;
        com.ellation.crunchyroll.application.a aVar5 = a.C0959a.a;
        if (aVar5 != null) {
            Object c = aVar5.c().c(com.amazon.aps.iva.c20.a.class, "store_navigation");
            if (c != null) {
                com.amazon.aps.iva.c20.a aVar6 = (com.amazon.aps.iva.c20.a) c;
                com.ellation.crunchyroll.application.a aVar7 = a.C0959a.a;
                if (aVar7 != null) {
                    Object c2 = aVar7.c().c(com.amazon.aps.iva.cx.c.class, "bento");
                    if (c2 != null) {
                        defpackage.i.f = new com.amazon.aps.iva.vx.k(new com.amazon.aps.iva.ix.i(fVar, jVar3, etpNetworkModule, aVar6, (com.amazon.aps.iva.cx.c) c2));
                        ContentReviewsService contentReviewService = etpNetworkModule.getContentReviewService();
                        c0 c0Var = new c0(this);
                        com.amazon.aps.iva.yb0.j.f(contentReviewService, "contentReviewsService");
                        l1.b = new com.amazon.aps.iva.m50.c(contentReviewService, c0Var);
                        PlayService playService = etpNetworkModule.getPlayService();
                        a0 a0Var = new a0(this);
                        com.amazon.aps.iva.yb0.j.f(playService, "playService");
                        com.amazon.aps.iva.yb0.j.f(create2, "castFeature");
                        com.amazon.aps.iva.nx.f fVar4 = new com.amazon.aps.iva.nx.f(jVar3, jVar, playService, create2, a0Var);
                        com.amazon.aps.iva.cj.n.d = fVar4;
                        com.amazon.aps.iva.ye.f castStateProvider = create2.getCastStateProvider();
                        com.amazon.aps.iva.nx.h i = fVar4.i();
                        com.amazon.aps.iva.cj.o oVar2 = new com.amazon.aps.iva.cj.o(fVar4);
                        com.amazon.aps.iva.cj.c a5 = b.a.a(com.ellation.crunchyroll.application.e.b());
                        com.crunchyroll.connectivity.d a6 = d.a.a(com.ellation.crunchyroll.application.e.b(), d.a.a().getLifecycle());
                        String packageName2 = com.ellation.crunchyroll.application.e.b().getPackageName();
                        com.amazon.aps.iva.yb0.j.e(packageName2, "dependencies.applicationContext.packageName");
                        com.amazon.aps.iva.cj.n.e = new com.amazon.aps.iva.cj.s(castStateProvider, i, oVar2, a5, a6, packageName2, fVar4.g);
                        com.amazon.aps.iva.cj.n nVar3 = new com.amazon.aps.iva.cj.n();
                        com.amazon.aps.iva.cj.n.f = nVar3;
                        this.k = nVar3;
                        com.amazon.aps.iva.y30.i a7 = h.a.a(com.amazon.aps.iva.ds.c.b, 6);
                        com.amazon.aps.iva.ct.l userBenefitsSynchronizer2 = etpNetworkModule.getUserBenefitsSynchronizer();
                        com.amazon.aps.iva.ct.k a8 = com.ellation.crunchyroll.application.f.a(null, 3);
                        com.amazon.aps.iva.fx.m mVar3 = new com.amazon.aps.iva.yb0.v() { // from class: com.amazon.aps.iva.fx.m
                            @Override // com.amazon.aps.iva.yb0.v, com.amazon.aps.iva.fc0.n
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((com.amazon.aps.iva.ct.j) obj).r());
                            }
                        };
                        com.amazon.aps.iva.yb0.j.f(userBenefitsSynchronizer2, "benefitsSynchronizer");
                        com.amazon.aps.iva.yb0.j.f(mVar3, "hasBenefitInStore");
                        com.amazon.aps.iva.fx.f fVar5 = new com.amazon.aps.iva.fx.f(etpNetworkModule, jVar3, fVar, fVar2, new com.amazon.aps.iva.ct.c(userBenefitsSynchronizer2, a8, mVar3), jVar, aVar, a7, nVar3);
                        com.amazon.aps.iva.sv.e.e = fVar5;
                        com.amazon.aps.iva.sv.e eVar3 = new com.amazon.aps.iva.sv.e(fVar5);
                        com.amazon.aps.iva.sv.e.f = eVar3;
                        Context context = b.a.a;
                        if (context != null) {
                            com.amazon.aps.iva.dw.a.b = context;
                            if (context != null) {
                                com.amazon.aps.iva.zv.b bVar5 = com.amazon.aps.iva.sv.e.e;
                                if (bVar5 != null) {
                                    if (bVar5.h().j()) {
                                        try {
                                            m2Var = new com.amazon.aps.iva.sv.i(context);
                                        } catch (FileNotFoundException e) {
                                            com.amazon.aps.iva.mf0.a.a.m(e);
                                            m2Var = new m2();
                                        }
                                    } else {
                                        m2Var = new m2();
                                    }
                                    h.a.a = m2Var;
                                    Context context2 = b.a.a;
                                    if (context2 != null) {
                                        k0.d = new com.ellation.crunchyroll.downloading.bulk.g(context2);
                                        com.ellation.crunchyroll.application.d a9 = d.a.a();
                                        com.amazon.aps.iva.sk.a n = eVar3.a.n();
                                        v1 a10 = u1.a.a();
                                        com.amazon.aps.iva.sv.c.n0.getClass();
                                        com.amazon.aps.iva.kw.c cVar4 = new com.amazon.aps.iva.kw.c(a9, n, a10, c.a.b);
                                        cVar4.c.a().a(cVar4.b.getLifecycle(), new com.amazon.aps.iva.kw.b(cVar4));
                                        this.l = eVar3;
                                        EtpAccountService accountService = this.b.getAccountService();
                                        com.amazon.aps.iva.oz.a aVar8 = com.amazon.aps.iva.oz.a.a;
                                        com.amazon.aps.iva.yb0.j.f(accountService, "accountService");
                                        this.m = new com.amazon.aps.iva.jd.c(accountService);
                                        com.amazon.aps.iva.mx.h hVar2 = new com.amazon.aps.iva.mx.h(this.i, new y(HomeBottomBarActivity.x));
                                        com.amazon.aps.iva.mx.a aVar9 = new com.amazon.aps.iva.mx.a(hVar2);
                                        com.amazon.aps.iva.mx.b bVar6 = new com.amazon.aps.iva.mx.b(hVar2);
                                        com.amazon.aps.iva.mx.c cVar5 = new com.amazon.aps.iva.mx.c(hVar2);
                                        com.amazon.aps.iva.ph.a aVar10 = hVar2.a;
                                        com.amazon.aps.iva.wh.e l = aVar10.l();
                                        com.amazon.aps.iva.uh.a k = aVar10.k();
                                        com.amazon.aps.iva.mx.d dVar3 = com.amazon.aps.iva.mx.d.h;
                                        com.amazon.aps.iva.yb0.j.f(dVar3, "isUserLoggedIn");
                                        com.amazon.aps.iva.yb0.j.f(l, "unverifiedPurchaseProvider");
                                        com.amazon.aps.iva.yb0.j.f(k, "introductoryOfferProvider");
                                        com.amazon.aps.iva.yi.e eVar4 = new com.amazon.aps.iva.yi.e(aVar9, bVar6, cVar5, dVar3, l, k);
                                        d.a.a = eVar4;
                                        this.n = eVar4;
                                        com.ellation.crunchyroll.application.a aVar11 = a.C0959a.a;
                                        if (aVar11 != null) {
                                            Object c3 = aVar11.c().c(com.amazon.aps.iva.jx.a.class, "in_app_review");
                                            if (c3 != null) {
                                                com.amazon.aps.iva.jx.a aVar12 = (com.amazon.aps.iva.jx.a) c3;
                                                com.ellation.crunchyroll.application.d a11 = d.a.a();
                                                CrunchyrollApplication b = com.ellation.crunchyroll.application.e.b();
                                                Gson gsonHolder = GsonHolder.getInstance();
                                                final com.amazon.aps.iva.ct.k a12 = com.ellation.crunchyroll.application.f.a(null, 3);
                                                ?? r8 = new com.amazon.aps.iva.yb0.t(a12) { // from class: com.amazon.aps.iva.jx.b
                                                    @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                                                    public final Object get() {
                                                        return Boolean.valueOf(((j) this.receiver).R1());
                                                    }
                                                };
                                                com.amazon.aps.iva.yb0.j.f(a11, "appLifecycle");
                                                com.amazon.aps.iva.yb0.j.f(gsonHolder, "gson");
                                                this.o = new com.amazon.aps.iva.ch.d(aVar12, a11, b, gsonHolder, r8);
                                                com.amazon.aps.iva.b50.w.f = new com.amazon.aps.iva.sf.d(new k(this));
                                                com.amazon.aps.iva.me.b bVar7 = new com.amazon.aps.iva.me.b(new h(this, fVar));
                                                com.amazon.aps.iva.a60.b.b = bVar7;
                                                com.amazon.aps.iva.a60.b.c = bVar7;
                                                this.p = bVar7;
                                                com.amazon.aps.iva.rx.b bVar8 = com.amazon.aps.iva.rx.b.a;
                                                com.amazon.aps.iva.co.g gVar2 = new com.amazon.aps.iva.co.g();
                                                f.a.a = bVar8;
                                                com.amazon.aps.iva.eo.c cVar6 = gVar2.e;
                                                com.amazon.aps.iva.yb0.j.f(cVar6, "<set-?>");
                                                f.a.b = cVar6;
                                                com.amazon.aps.iva.fo.h hVar3 = gVar2.d;
                                                com.amazon.aps.iva.yb0.j.f(hVar3, "<set-?>");
                                                f.a.c = hVar3;
                                                com.amazon.aps.iva.fo.d dVar4 = gVar2.c;
                                                com.amazon.aps.iva.yb0.j.f(dVar4, "<set-?>");
                                                f.a.d = dVar4;
                                                this.q = gVar2;
                                                com.amazon.aps.iva.kf.f fVar6 = new com.amazon.aps.iva.kf.f(new com.amazon.aps.iva.dx.a());
                                                f1.b = fVar6;
                                                this.r = fVar6;
                                                com.amazon.aps.iva.lx.d dVar5 = com.amazon.aps.iva.lx.d.a;
                                                com.amazon.aps.iva.cj.n nVar4 = this.k;
                                                CastFeature castFeature = this.j;
                                                dVar5.getClass();
                                                com.amazon.aps.iva.yb0.j.f(nVar4, "playerFeature");
                                                com.amazon.aps.iva.yb0.j.f(castFeature, "castFeature");
                                                com.amazon.aps.iva.yh.i iVar = new com.amazon.aps.iva.yh.i(new com.amazon.aps.iva.lx.c(castFeature, nVar4));
                                                f.a.a = iVar;
                                                f.a.b = new com.amazon.aps.iva.a60.b();
                                                this.s = iVar;
                                                com.amazon.aps.iva.cg.v vVar2 = new com.amazon.aps.iva.cg.v();
                                                com.amazon.aps.iva.i5.v<Activity> vVar3 = pVar.c;
                                                com.amazon.aps.iva.yb0.j.f(vVar3, "topActivityLiveData");
                                                com.amazon.aps.iva.kn.a aVar13 = new com.amazon.aps.iva.kn.a(fVar, vVar3);
                                                com.amazon.aps.iva.e.w.b = aVar13;
                                                this.t = aVar13;
                                                com.amazon.aps.iva.rd.e eVar5 = new com.amazon.aps.iva.rd.e(new com.amazon.aps.iva.ux.e(vVar2, pVar));
                                                com.amazon.aps.iva.gd0.j.e = eVar5;
                                                this.u = eVar5;
                                                com.amazon.aps.iva.lo.d dVar6 = new com.amazon.aps.iva.lo.d(new com.amazon.aps.iva.sx.d(this.k, this.f, eVar3, this.j, this.d, this.i));
                                                c.a.a = dVar6;
                                                this.v = dVar6;
                                                com.ellation.crunchyroll.application.a aVar14 = a.C0959a.a;
                                                if (aVar14 != null) {
                                                    Object c4 = aVar14.c().c(com.amazon.aps.iva.kx.a.class, "in_app_updates");
                                                    if (c4 != null) {
                                                        com.amazon.aps.iva.kx.a aVar15 = (com.amazon.aps.iva.kx.a) c4;
                                                        com.amazon.aps.iva.kx.b bVar9 = new com.amazon.aps.iva.kx.b(com.amazon.aps.iva.kx.c.h);
                                                        com.amazon.aps.iva.kx.d dVar7 = new com.amazon.aps.iva.kx.d(dVar6, iVar, pVar);
                                                        com.amazon.aps.iva.kx.e eVar6 = new com.amazon.aps.iva.kx.e(pVar);
                                                        com.amazon.aps.iva.my.d dVar8 = new com.amazon.aps.iva.my.d(bVar9);
                                                        l1.d = dVar8;
                                                        if (aVar15.d()) {
                                                            com.amazon.aps.iva.xe0.d j = com.amazon.aps.iva.e.z.j();
                                                            long c5 = aVar15.c();
                                                            com.amazon.aps.iva.oy.j jVar4 = com.amazon.aps.iva.oy.j.h;
                                                            com.amazon.aps.iva.yb0.j.f(jVar4, "getCurrentTimeSec");
                                                            com.amazon.aps.iva.oy.l lVar = new com.amazon.aps.iva.oy.l(fVar, c5, jVar4);
                                                            com.amazon.aps.iva.oy.p pVar2 = new com.amazon.aps.iva.oy.p(fVar, eVar6);
                                                            mVar = new com.amazon.aps.iva.oy.d(aVar15, lVar, pVar2, new com.amazon.aps.iva.oy.i(aVar15, lVar, pVar2, j), dVar7, j, eVar3.H(j));
                                                        } else {
                                                            mVar = new com.amazon.aps.iva.oy.m();
                                                        }
                                                        l1.c = mVar;
                                                        this.w = dVar8;
                                                        com.amazon.aps.iva.vd.e eVar7 = new com.amazon.aps.iva.vd.e(new e(this));
                                                        l1.f = eVar7;
                                                        this.x = eVar7;
                                                        this.y = new com.amazon.aps.iva.nh.e(new l(this));
                                                        RefreshTokenStorage refreshTokenStorage = this.b.getRefreshTokenStorage();
                                                        com.amazon.aps.iva.yb0.j.f(refreshTokenStorage, "refreshTokenStorage");
                                                        a.C0955a.a = new com.amazon.aps.iva.zf.b(refreshTokenStorage);
                                                        com.amazon.aps.iva.bo.f fVar7 = this.a;
                                                        com.amazon.aps.iva.yb0.j.f(fVar7, "userState");
                                                        com.amazon.aps.iva.e.w.a = new com.amazon.aps.iva.zw.a(fVar7);
                                                        this.z = new l1();
                                                        com.amazon.aps.iva.px.a aVar16 = new com.amazon.aps.iva.px.a();
                                                        k0.c = aVar16;
                                                        this.A = new f1(aVar16);
                                                        com.ellation.crunchyroll.application.a aVar17 = a.C0959a.a;
                                                        if (aVar17 != null) {
                                                            Object c6 = aVar17.c().c(com.amazon.aps.iva.c20.a.class, "store_navigation");
                                                            if (c6 != null) {
                                                                e.a.a = new com.amazon.aps.iva.qx.a((com.amazon.aps.iva.c20.a) c6);
                                                                this.B = new com.amazon.aps.iva.vn.f();
                                                                return;
                                                            }
                                                            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.presentation.main.store.CrStoreConfigImpl");
                                                        }
                                                        com.amazon.aps.iva.yb0.j.m("instance");
                                                        throw null;
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.inappupdates.InAppUpdatesConfigImpl");
                                                }
                                                com.amazon.aps.iva.yb0.j.m("instance");
                                                throw null;
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.inappreview.InAppReviewConfigImpl");
                                        }
                                        com.amazon.aps.iva.yb0.j.m("instance");
                                        throw null;
                                    }
                                    com.amazon.aps.iva.yb0.j.m("internalContext");
                                    throw null;
                                }
                                com.amazon.aps.iva.yb0.j.m("dependencies");
                                throw null;
                            }
                            com.amazon.aps.iva.yb0.j.m("internalContext");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("internalContext");
                        throw null;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.BentoConfigImpl");
                }
                com.amazon.aps.iva.yb0.j.m("instance");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.presentation.main.store.CrStoreConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.yw.a
    public final CastFeature a() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.yw.a
    public final com.amazon.aps.iva.pm.a b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.yw.a
    public final com.amazon.aps.iva.yg.c c() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.yw.a
    public final com.amazon.aps.iva.ch.c d() {
        return this.o;
    }

    @Override // com.amazon.aps.iva.yw.a
    public final com.amazon.aps.iva.lo.c e() {
        return this.v;
    }

    @Override // com.amazon.aps.iva.yw.a
    public final com.crunchyroll.onboarding.d f() {
        return this.n;
    }
}
