package com.amazon.aps.iva.rx;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.amazon.aps.iva.ct.l;
import com.amazon.aps.iva.cx.h;
import com.amazon.aps.iva.cx.s;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.q20.a;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.t;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.usermigration.welcome.UserMigrationWelcomeActivity;
import com.ellation.crunchyroll.api.etp.funmigration.FunMigrationService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.presentation.forgotpassword.ForgotPasswordActivity;
import com.ellation.crunchyroll.presentation.main.home.HomeBottomBarActivity;
import java.util.LinkedHashMap;
/* compiled from: UserMigrationDependenciesImpl.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.co.e {
    public static final b a = new b();
    public static final CrunchyrollApplication b;
    public static final m c;
    public static final m d;
    public static final com.amazon.aps.iva.cx.b e;
    public static final String f;
    public static final com.amazon.aps.iva.ts.a g;
    public static final s h;
    public static final h i;
    public static final l j;
    public static final LinkedHashMap k;
    public static final FunMigrationService l;
    public static final C0687b m;
    public static final a n;

    /* compiled from: UserMigrationDependenciesImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<Activity, String, q> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(Activity activity, String str) {
            Activity activity2 = activity;
            String str2 = str;
            j.f(activity2, "activity");
            j.f(str2, "emailText");
            ForgotPasswordActivity.t.getClass();
            ForgotPasswordActivity.a.a(activity2, str2, false);
            return q.a;
        }
    }

    /* compiled from: UserMigrationDependenciesImpl.kt */
    /* renamed from: com.amazon.aps.iva.rx.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0687b extends i implements com.amazon.aps.iva.xb0.l<Context, q> {
        public C0687b(HomeBottomBarActivity.a aVar) {
            super(1, aVar, HomeBottomBarActivity.a.class, "start", "start(Landroid/content/Context;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Context context) {
            Context context2 = context;
            j.f(context2, "p0");
            ((HomeBottomBarActivity.a) this.receiver).getClass();
            HomeBottomBarActivity.a.a(context2);
            return q.a;
        }
    }

    /* compiled from: UserMigrationDependenciesImpl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.rx.d> {
        public static final c h = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.rx.d invoke() {
            return new com.amazon.aps.iva.rx.d(com.amazon.aps.iva.bo.e.c(((d0) com.ellation.crunchyroll.application.e.a()).m, com.ellation.crunchyroll.application.e.c().getUserBenefitsSynchronizer(), ((d0) com.ellation.crunchyroll.application.e.a()).c.a, ((d0) com.ellation.crunchyroll.application.e.a()).p.d, com.ellation.crunchyroll.application.e.d(), com.amazon.aps.iva.rx.c.h), com.ellation.crunchyroll.application.e.c().getEtpIndexProvider(), com.ellation.crunchyroll.application.e.c().getRefreshTokenProvider());
        }
    }

    /* compiled from: UserMigrationDependenciesImpl.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e> {
        public static final d h = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e invoke() {
            return new e(com.ellation.crunchyroll.application.e.c().getRefreshTokenProvider(), com.ellation.crunchyroll.application.e.b().f());
        }
    }

    static {
        CrunchyrollApplication b2 = com.ellation.crunchyroll.application.e.b();
        b = b2;
        c = f.b(c.h);
        d = f.b(d.h);
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c2 = aVar.c().c(com.amazon.aps.iva.cx.b.class, "app_legal_links");
            if (c2 != null) {
                e = (com.amazon.aps.iva.cx.b) c2;
                com.amazon.aps.iva.ts.b.a.getClass();
                f = com.amazon.aps.iva.ts.a.e;
                g = com.amazon.aps.iva.ts.b.e;
                com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
                if (aVar2 != null) {
                    Object c3 = aVar2.c().c(s.class, "user_account_migration");
                    if (c3 != null) {
                        h = (s) c3;
                        com.ellation.crunchyroll.application.a aVar3 = a.C0959a.a;
                        if (aVar3 != null) {
                            Object c4 = aVar3.c().c(h.class, "disable_username_login");
                            if (c4 != null) {
                                i = (h) c4;
                                j = com.ellation.crunchyroll.application.e.c().getUserBenefitsSynchronizer();
                                Resources resources = b2.getResources();
                                j.e(resources, "applicationContext.resources");
                                k = a.C0634a.a(resources).a(false);
                                l = com.ellation.crunchyroll.application.e.c().getFunMigrationService();
                                m = new C0687b(HomeBottomBarActivity.x);
                                n = a.h;
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.DisableUsernameLoginConfigImpl");
                        }
                        j.m("instance");
                        throw null;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.UserAccountMigrationConfigImpl");
                }
                j.m("instance");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.AppLegalLinksConfigImpl");
        }
        j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.co.e
    public final C0687b c() {
        return m;
    }

    @Override // com.amazon.aps.iva.co.e
    public final LinkedHashMap d() {
        return k;
    }

    @Override // com.amazon.aps.iva.co.e
    public final com.amazon.aps.iva.k50.j e(UserMigrationWelcomeActivity userMigrationWelcomeActivity) {
        j.f(userMigrationWelcomeActivity, "lifecycleOwner");
        return ((d0) com.ellation.crunchyroll.application.e.a()).i.b(userMigrationWelcomeActivity);
    }

    @Override // com.amazon.aps.iva.co.e
    public final com.amazon.aps.iva.co.i f() {
        return (com.amazon.aps.iva.co.i) d.getValue();
    }

    @Override // com.amazon.aps.iva.co.e
    public final s g() {
        return h;
    }

    @Override // com.amazon.aps.iva.co.e
    public final FunMigrationService getFunMigrationService() {
        return l;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.amazon.aps.iva.rx.a] */
    @Override // com.amazon.aps.iva.co.e
    public final com.amazon.aps.iva.rx.a getHasPremiumBenefit() {
        return new t(com.ellation.crunchyroll.application.f.a(null, 3)) { // from class: com.amazon.aps.iva.rx.a
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).getHasPremiumBenefit());
            }
        };
    }

    @Override // com.amazon.aps.iva.co.e
    public final l getUserBenefitsSynchronizer() {
        return j;
    }

    @Override // com.amazon.aps.iva.co.e
    public final com.amazon.aps.iva.ts.a h() {
        return g;
    }

    @Override // com.amazon.aps.iva.co.e
    public final com.amazon.aps.iva.cx.b i() {
        return e;
    }

    @Override // com.amazon.aps.iva.co.e
    public final a j() {
        return n;
    }

    @Override // com.amazon.aps.iva.co.e
    public final h k() {
        return i;
    }

    @Override // com.amazon.aps.iva.co.e
    public final com.amazon.aps.iva.co.h l() {
        return (com.amazon.aps.iva.co.h) c.getValue();
    }
}
