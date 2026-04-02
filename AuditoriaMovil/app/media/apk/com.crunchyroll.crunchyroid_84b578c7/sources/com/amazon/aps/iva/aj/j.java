package com.amazon.aps.iva.aj;

import com.amazon.aps.iva.yw.z;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider;
/* compiled from: ParentalControlsFeatureImpl.kt */
/* loaded from: classes.dex */
public final class j implements f, e {
    public static e d;
    public final /* synthetic */ e a;
    public final d b;
    public final b c;

    public j(z zVar) {
        this.a = zVar;
        EtpAccountService accountService = getAccountService();
        com.amazon.aps.iva.pm.b a = a();
        com.amazon.aps.iva.yb0.j.f(accountService, "accountService");
        com.amazon.aps.iva.yb0.j.f(a, "userProfileInteractor");
        this.b = new d(accountService, a);
        this.c = new b(i.h, new g(this));
    }

    @Override // com.amazon.aps.iva.aj.e
    public final com.amazon.aps.iva.pm.b a() {
        return this.a.a();
    }

    @Override // com.amazon.aps.iva.aj.f
    public final b c() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.aj.f
    public final h d() {
        return h.h;
    }

    @Override // com.amazon.aps.iva.aj.e
    public final EtpAccountService getAccountService() {
        return this.a.getAccountService();
    }

    @Override // com.amazon.aps.iva.aj.e
    public final CountryCodeProvider getCountryCodeProvider() {
        return this.a.getCountryCodeProvider();
    }
}
