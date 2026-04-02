package com.amazon.aps.iva.jd;

import com.amazon.aps.iva.bo.f;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
/* compiled from: AccountDependencies.kt */
/* loaded from: classes.dex */
public interface e {
    f b();

    EtpAccountService getAccountService();

    AccountStateProvider getAccountStateProvider();
}
