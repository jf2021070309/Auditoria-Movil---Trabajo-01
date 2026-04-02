package com.ellation.crunchyroll.presentation.signing.signin;

import androidx.lifecycle.p;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.jh.h;
import com.amazon.aps.iva.p60.f;
import com.amazon.aps.iva.p60.g;
import com.amazon.aps.iva.u40.n;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.presentation.signing.signin.SignInActivity;
import com.ellation.crunchyroll.presentation.signing.signin.f;
/* compiled from: SignInActivity.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<p, n> {
    public final /* synthetic */ SignInActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SignInActivity signInActivity) {
        super(1);
        this.h = signInActivity;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final n invoke(p pVar) {
        j.f(pVar, "it");
        com.amazon.aps.iva.bo.d c = com.amazon.aps.iva.bo.e.c(((d0) com.ellation.crunchyroll.application.e.a()).m, com.ellation.crunchyroll.application.e.c().getUserBenefitsSynchronizer(), ((d0) com.ellation.crunchyroll.application.e.a()).c.a, ((d0) com.ellation.crunchyroll.application.e.a()).p.d, com.ellation.crunchyroll.application.e.d(), b.h);
        EtpIndexProvider etpIndexProvider = com.ellation.crunchyroll.application.e.c().getEtpIndexProvider();
        RefreshTokenProvider refreshTokenProvider = com.ellation.crunchyroll.application.e.c().getRefreshTokenProvider();
        SignInActivity.a aVar = SignInActivity.O;
        SignInActivity signInActivity = this.h;
        com.amazon.aps.iva.u40.b a = f.a.a(c, etpIndexProvider, refreshTokenProvider, signInActivity.oi());
        EtpAccountAuthService accountAuthService = com.ellation.crunchyroll.application.e.c().getAccountAuthService();
        EtpAccountService accountService = com.ellation.crunchyroll.application.e.c().getAccountService();
        com.amazon.aps.iva.lh.c cVar = com.amazon.aps.iva.lh.f.a;
        if (cVar != null) {
            com.amazon.aps.iva.lh.b bVar = new com.amazon.aps.iva.lh.b(cVar, new h(com.amazon.aps.iva.o60.e.a(signInActivity)), f.a.a(signInActivity, GsonHolder.getInstance()));
            com.amazon.aps.iva.kh.d dVar = t.a;
            if (dVar != null) {
                com.amazon.aps.iva.kh.f a2 = dVar.a(signInActivity);
                g a3 = f.a.a(signInActivity, GsonHolder.getInstance());
                j.f(accountAuthService, "accountAuthService");
                j.f(accountService, "accountService");
                return new n(a, new com.amazon.aps.iva.fe.g(accountAuthService, accountService, bVar, a2, a3), ((d0) com.ellation.crunchyroll.application.e.a()).q.b(signInActivity, signInActivity.J), new c(((d0) com.ellation.crunchyroll.application.e.a()).q));
            }
            j.m("instance");
            throw null;
        }
        j.m("store");
        throw null;
    }
}
