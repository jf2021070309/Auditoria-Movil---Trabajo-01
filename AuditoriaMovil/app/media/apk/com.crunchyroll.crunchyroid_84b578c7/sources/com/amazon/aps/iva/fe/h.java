package com.amazon.aps.iva.fe;

import android.content.Intent;
import com.amazon.aps.iva.de.b;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fe.a0;
import com.amazon.aps.iva.p60.f;
import com.crunchyroll.auth.screen.OtpActivity;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
/* compiled from: OtpModule.kt */
/* loaded from: classes.dex */
public final class h {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] g = {com.amazon.aps.iva.k.q.a(h.class, "viewModel", "getViewModel()Lcom/crunchyroll/auth/screen/OtpViewModelImpl;", 0)};
    public final OtpActivity a;
    public final com.amazon.aps.iva.kb0.m b;
    public final com.amazon.aps.iva.fe.e c;
    public final com.amazon.aps.iva.ez.a d;
    public final com.amazon.aps.iva.kb0.m e;
    public final z f;

    /* compiled from: OtpModule.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            com.amazon.aps.iva.vd.e eVar = l1.f;
            if (eVar != null) {
                return eVar.b().b();
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: OtpModule.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ee.a> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ee.a invoke() {
            Intent intent = h.this.a.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "activity.intent");
            String stringExtra = intent.getStringExtra("opt_phone_number");
            if (stringExtra == null) {
                stringExtra = "";
            }
            return new com.amazon.aps.iva.ee.a(stringExtra, intent.getBooleanExtra("opt_is_sign_in", false));
        }
    }

    /* compiled from: OtpModule.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<i> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final i invoke() {
            h hVar = h.this;
            OtpActivity otpActivity = hVar.a;
            com.amazon.aps.iva.ee.a aVar = (com.amazon.aps.iva.ee.a) hVar.b.getValue();
            t tVar = (t) hVar.d.getValue(hVar, h.g[0]);
            OtpActivity otpActivity2 = hVar.a;
            com.amazon.aps.iva.yb0.j.f(otpActivity2, "context");
            w wVar = new w(otpActivity2);
            a0.a.getClass();
            b0 b0Var = a0.a.b;
            com.amazon.aps.iva.yb0.j.f(otpActivity, "view");
            com.amazon.aps.iva.yb0.j.f(aVar, "otpFlowInput");
            com.amazon.aps.iva.yb0.j.f(b0Var, "smsTextMonitor");
            com.amazon.aps.iva.fe.e eVar = hVar.c;
            com.amazon.aps.iva.yb0.j.f(eVar, "otpAnalytics");
            return new l(otpActivity, aVar, tVar, wVar, b0Var, eVar);
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: OtpModule.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, t> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final t invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            EtpAccountAuthService accountAuthService = l1.B().getAccountAuthService();
            EtpAccountService accountService = l1.B().getAccountService();
            h hVar = h.this;
            OtpActivity otpActivity = hVar.a;
            com.amazon.aps.iva.yb0.j.f(otpActivity, "context");
            com.amazon.aps.iva.lh.c cVar = com.amazon.aps.iva.lh.f.a;
            if (cVar != null) {
                com.amazon.aps.iva.lh.b bVar = new com.amazon.aps.iva.lh.b(cVar, new com.amazon.aps.iva.jh.h(com.amazon.aps.iva.o60.e.a(otpActivity)), f.a.a(otpActivity, GsonHolder.getInstance()));
                com.amazon.aps.iva.kh.d dVar = com.amazon.aps.iva.gy.t.a;
                if (dVar != null) {
                    OtpActivity otpActivity2 = hVar.a;
                    com.amazon.aps.iva.kh.f a = dVar.a(otpActivity2);
                    com.amazon.aps.iva.p60.g a2 = f.a.a(otpActivity2, GsonHolder.getInstance());
                    com.amazon.aps.iva.yb0.j.f(accountAuthService, "accountAuthService");
                    com.amazon.aps.iva.yb0.j.f(accountService, "accountService");
                    g gVar = new g(accountAuthService, accountService, bVar, a, a2);
                    UserTokenInteractor userTokenInteractor = l1.B().getUserTokenInteractor();
                    y yVar = new y();
                    com.amazon.aps.iva.de.b.a.getClass();
                    return new t(gVar, userTokenInteractor, yVar, b.a.b, l1.B().i(), l1.B().getEtpIndexProvider(), l1.B().getRefreshTokenProvider(), l1.B().j());
                }
                com.amazon.aps.iva.yb0.j.m("instance");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("store");
            throw null;
        }
    }

    public h(OtpActivity otpActivity) {
        com.amazon.aps.iva.yb0.j.f(otpActivity, "activity");
        this.a = otpActivity;
        this.b = com.amazon.aps.iva.kb0.f.b(new b());
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        a aVar = a.h;
        com.amazon.aps.iva.yb0.j.f(aVar, "getUserId");
        this.c = new com.amazon.aps.iva.fe.e(aVar);
        this.d = new com.amazon.aps.iva.ez.a(t.class, new d(otpActivity), new e());
        this.e = com.amazon.aps.iva.kb0.f.b(new c());
        this.f = new z();
    }
}
