package com.amazon.aps.iva.vd;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.fa.i;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.mh.j;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yd.v;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider;
import com.ellation.crunchyroll.api.etp.auth.EtpAccountAuthService;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor;
import com.google.android.gms.common.Scopes;
/* compiled from: AuthFeature.kt */
/* loaded from: classes.dex */
public final class e implements a {
    public final /* synthetic */ a a;
    public final i b;

    public e(com.amazon.aps.iva.yw.e eVar) {
        this.a = eVar;
        this.b = new i(eVar.c, new d(eVar));
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.pm.b a() {
        return this.a.a();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.bo.f b() {
        return this.a.b();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final l<Context, q> c() {
        return this.a.c();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final NotificationSettingsInteractor d() {
        return this.a.d();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.xb0.q<Context, h, com.amazon.aps.iva.ls.a, j> e() {
        return this.a.e();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final f f() {
        return this.a.f();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final void g(String str) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        this.a.g(str);
    }

    @Override // com.amazon.aps.iva.vd.a
    public final EtpAccountAuthService getAccountAuthService() {
        return this.a.getAccountAuthService();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final EtpAccountService getAccountService() {
        return this.a.getAccountService();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final EtpIndexProvider getEtpIndexProvider() {
        return this.a.getEtpIndexProvider();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final RefreshTokenProvider getRefreshTokenProvider() {
        return this.a.getRefreshTokenProvider();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final UserTokenInteractor getUserTokenInteractor() {
        return this.a.getUserTokenInteractor();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final p<Activity, String, q> h() {
        return this.a.h();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final com.amazon.aps.iva.bo.a i() {
        return this.a.i();
    }

    @Override // com.amazon.aps.iva.vd.a
    public final l<com.amazon.aps.iva.ob0.d<? super q>, Object> j() {
        return this.a.j();
    }

    public final v k(com.amazon.aps.iva.t40.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "activity");
        return new v(new com.amazon.aps.iva.yd.d(), new b(cVar), com.amazon.aps.iva.yd.q.h);
    }

    public final com.amazon.aps.iva.ee.e l(com.amazon.aps.iva.t40.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "activity");
        return new com.amazon.aps.iva.ee.e(new com.amazon.aps.iva.ee.f(), new c(cVar), com.amazon.aps.iva.ee.g.h);
    }

    public final boolean m() {
        i iVar = this.b;
        if (((f) ((com.amazon.aps.iva.xb0.a) iVar.c).invoke()).isEnabled() && x.m0(((f) ((com.amazon.aps.iva.xb0.a) iVar.c).invoke()).a(), ((CountryCodeProvider) iVar.b).getCountryCode())) {
            return true;
        }
        return false;
    }
}
