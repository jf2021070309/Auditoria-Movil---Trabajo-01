package com.amazon.aps.iva.yw;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.us.w;
import com.ellation.crunchyroll.api.etp.EtpNetworkModule;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider;
import com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.application.g;
import com.ellation.crunchyroll.presentation.forgotpassword.ForgotPasswordActivity;
import com.ellation.crunchyroll.presentation.main.home.HomeBottomBarActivity;
import com.google.android.gms.common.Scopes;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.vd.a {
    public final EtpAccountAuthService a;
    public final EtpAccountService b;
    public final CountryCodeProvider c;
    public final UserTokenInteractor d;
    public final com.amazon.aps.iva.bo.d e;
    public final EtpIndexProvider f;
    public final RefreshTokenProvider g;
    public final NotificationSettingsInteractor h;
    public final b i;
    public final c j;
    public final a k;
    public final d l;
    public final com.amazon.aps.iva.pm.b m;
    public final /* synthetic */ d0 n;

    /* compiled from: FeaturesProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<Context, com.amazon.aps.iva.wy.h, com.amazon.aps.iva.ls.a, com.amazon.aps.iva.mh.j> {
        public static final a h = new a();

        public a() {
            super(3);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.mh.j invoke(Context context, com.amazon.aps.iva.wy.h hVar, com.amazon.aps.iva.ls.a aVar) {
            Context context2 = context;
            com.amazon.aps.iva.wy.h hVar2 = hVar;
            com.amazon.aps.iva.ls.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(context2, "context");
            com.amazon.aps.iva.yb0.j.f(hVar2, "rootView");
            com.amazon.aps.iva.yb0.j.f(aVar2, "screen");
            com.ellation.crunchyroll.application.a aVar3 = a.C0959a.a;
            if (aVar3 != null) {
                Object c = aVar3.c().c(com.amazon.aps.iva.cx.b.class, "app_legal_links");
                if (c != null) {
                    return new com.amazon.aps.iva.mh.k(new com.amazon.aps.iva.mh.f(context2, (com.amazon.aps.iva.cx.b) c), new com.amazon.aps.iva.mh.i(com.amazon.aps.iva.ds.c.b, aVar2), hVar2);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.AppLegalLinksConfigImpl");
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    /* compiled from: FeaturesProvider.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.features.FeaturesProviderImpl$authFeature$1$onSignIn$1", f = "FeaturesProvider.kt", l = {397}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return new b(dVar).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.ys.n a = g.a.a();
                this.h = 1;
                if (a.a(this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FeaturesProvider.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Activity, String, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(Activity activity, String str) {
            Activity activity2 = activity;
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(activity2, "activity");
            com.amazon.aps.iva.yb0.j.f(str2, Scopes.EMAIL);
            ForgotPasswordActivity.t.getClass();
            ForgotPasswordActivity.a.a(activity2, str2, false);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FeaturesProvider.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Context, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Context context) {
            Context context2 = context;
            com.amazon.aps.iva.yb0.j.f(context2, "it");
            HomeBottomBarActivity.x.getClass();
            HomeBottomBarActivity.a.a(context2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FeaturesProvider.kt */
    /* renamed from: com.amazon.aps.iva.yw.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0900e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public static final C0900e h = new C0900e();

        public C0900e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            w.a.a.b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e(d0 d0Var) {
        this.n = d0Var;
        this.a = d0Var.b.getAccountAuthService();
        EtpNetworkModule etpNetworkModule = d0Var.b;
        EtpAccountService accountService = etpNetworkModule.getAccountService();
        this.b = accountService;
        this.c = etpNetworkModule.getCountryCodeProvider();
        this.d = etpNetworkModule.getUserTokenInteractor();
        com.amazon.aps.iva.jd.c cVar = d0Var.m;
        com.amazon.aps.iva.ct.l userBenefitsSynchronizer = etpNetworkModule.getUserBenefitsSynchronizer();
        com.amazon.aps.iva.fm.g gVar = d0Var.c;
        this.e = com.amazon.aps.iva.bo.e.c(cVar, userBenefitsSynchronizer, gVar.a, d0Var.p.d, d0Var.a, C0900e.h);
        EtpIndexProvider etpIndexProvider = etpNetworkModule.getEtpIndexProvider();
        this.f = etpIndexProvider;
        this.g = etpNetworkModule.getRefreshTokenProvider();
        this.h = NotificationSettingsInteractor.Companion.create(accountService, etpIndexProvider);
        this.i = new b(null);
        this.j = c.h;
        this.k = a.h;
        this.l = d.h;
        this.m = gVar.a;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.pm.b a() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.bo.f b() {
        return this.n.a;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.xb0.l<Context, com.amazon.aps.iva.kb0.q> c() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final NotificationSettingsInteractor d() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.xb0.q<Context, com.amazon.aps.iva.wy.h, com.amazon.aps.iva.ls.a, com.amazon.aps.iva.mh.j> e() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.vd.f f() {
        int i = com.ellation.crunchyroll.application.a.a;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c2 = aVar.c().c(com.amazon.aps.iva.cx.l.class, "otp");
            if (c2 != null) {
                return (com.amazon.aps.iva.cx.l) c2;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.OtpConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final void g(String str) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        com.amazon.aps.iva.us.z zVar = w.a.a;
        zVar.getClass();
        zVar.b.a(zVar.a.b(), zVar.c.b(str));
    }

    @Override // com.amazon.aps.iva.vd.a
    public final EtpAccountAuthService getAccountAuthService() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final EtpAccountService getAccountService() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final EtpIndexProvider getEtpIndexProvider() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final RefreshTokenProvider getRefreshTokenProvider() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final UserTokenInteractor getUserTokenInteractor() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.xb0.p<Activity, String, com.amazon.aps.iva.kb0.q> h() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.bo.a i() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> j() {
        return this.i;
    }
}
