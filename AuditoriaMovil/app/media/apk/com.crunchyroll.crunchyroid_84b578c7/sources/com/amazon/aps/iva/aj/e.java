package com.amazon.aps.iva.aj;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.CountryCodeProvider;
/* compiled from: ParentalControlsDependencies.kt */
/* loaded from: classes.dex */
public interface e {
    com.amazon.aps.iva.pm.b a();

    EtpAccountService getAccountService();

    CountryCodeProvider getCountryCodeProvider();
}
