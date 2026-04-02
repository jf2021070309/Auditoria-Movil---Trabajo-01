package com.amazon.aps.iva.yg;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.bj.n;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yg.c;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
/* compiled from: AccountPendingStateFeature.kt */
/* loaded from: classes.dex */
public final class d implements c, a {
    public final a a;

    public d(com.amazon.aps.iva.hx.b bVar) {
        this.a = bVar;
    }

    @Override // com.amazon.aps.iva.yg.a
    public final n a(androidx.fragment.app.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "activity");
        return this.a.a(hVar);
    }

    @Override // com.amazon.aps.iva.yg.a
    public final n b(Fragment fragment) {
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        return this.a.b(fragment);
    }

    @Override // com.amazon.aps.iva.yg.c
    public final boolean c() {
        com.amazon.aps.iva.zg.e eVar = c.a.a;
        if (eVar != null) {
            return eVar.i();
        }
        com.amazon.aps.iva.yb0.j.m("emailVerificationBannerHandler");
        throw null;
    }

    @Override // com.amazon.aps.iva.yg.a
    public final l<Activity, Boolean> d() {
        return this.a.d();
    }

    @Override // com.amazon.aps.iva.yg.a
    public final com.amazon.aps.iva.xb0.a<q> e() {
        return this.a.e();
    }

    @Override // com.amazon.aps.iva.yg.c
    public final com.amazon.aps.iva.bj.j f(Fragment fragment) {
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        n b = b(fragment);
        AccountStateProvider accountStateProvider = getAccountStateProvider();
        a aVar = this.a;
        EtpAccountService accountService = aVar.getAccountService();
        UserTokenInteractor userTokenInteractor = aVar.getUserTokenInteractor();
        com.amazon.aps.iva.yb0.j.f(accountService, "accountService");
        com.amazon.aps.iva.yb0.j.f(userTokenInteractor, "userTokenInteractor");
        com.amazon.aps.iva.zg.n nVar = new com.amazon.aps.iva.zg.n(accountService, userTokenInteractor);
        com.amazon.aps.iva.yb0.j.f(b, "router");
        com.amazon.aps.iva.yb0.j.f(accountStateProvider, "pendingStateProvider");
        return new com.amazon.aps.iva.bj.j(fragment, nVar, b, accountStateProvider);
    }

    @Override // com.amazon.aps.iva.yg.a
    public final com.amazon.aps.iva.xb0.a<String> g() {
        return this.a.g();
    }

    @Override // com.amazon.aps.iva.yg.a
    public final EtpAccountService getAccountService() {
        return this.a.getAccountService();
    }

    @Override // com.amazon.aps.iva.yg.a
    public final AccountStateProvider getAccountStateProvider() {
        return this.a.getAccountStateProvider();
    }

    @Override // com.amazon.aps.iva.yg.a
    public final UserTokenInteractor getUserTokenInteractor() {
        return this.a.getUserTokenInteractor();
    }

    public final com.amazon.aps.iva.bj.g h(androidx.fragment.app.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "activity");
        n a = a(hVar);
        AccountStateProvider accountStateProvider = getAccountStateProvider();
        a aVar = this.a;
        EtpAccountService accountService = aVar.getAccountService();
        UserTokenInteractor userTokenInteractor = aVar.getUserTokenInteractor();
        com.amazon.aps.iva.yb0.j.f(accountService, "accountService");
        com.amazon.aps.iva.yb0.j.f(userTokenInteractor, "userTokenInteractor");
        com.amazon.aps.iva.zg.n nVar = new com.amazon.aps.iva.zg.n(accountService, userTokenInteractor);
        com.amazon.aps.iva.yb0.j.f(a, "router");
        com.amazon.aps.iva.yb0.j.f(accountStateProvider, "pendingStateProvider");
        return new com.amazon.aps.iva.bj.g(hVar, nVar, a, accountStateProvider);
    }

    public final com.amazon.aps.iva.zg.d i() {
        com.amazon.aps.iva.zg.e eVar = c.a.a;
        if (eVar != null) {
            return eVar;
        }
        com.amazon.aps.iva.yb0.j.m("emailVerificationBannerHandler");
        throw null;
    }
}
