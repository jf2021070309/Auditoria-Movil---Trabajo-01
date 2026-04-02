package com.amazon.aps.iva.yw;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class z implements com.amazon.aps.iva.aj.e {
    public final CountryCodeProvider a;
    public final EtpAccountService b;
    public final com.amazon.aps.iva.pm.b c;

    public z(d0 d0Var) {
        this.a = d0Var.b.getCountryCodeProvider();
        this.b = d0Var.b.getAccountService();
        this.c = d0Var.c.a;
    }

    @Override // com.amazon.aps.iva.aj.e
    public final com.amazon.aps.iva.pm.b a() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.aj.e
    public final EtpAccountService getAccountService() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.aj.e
    public final CountryCodeProvider getCountryCodeProvider() {
        return this.a;
    }
}
