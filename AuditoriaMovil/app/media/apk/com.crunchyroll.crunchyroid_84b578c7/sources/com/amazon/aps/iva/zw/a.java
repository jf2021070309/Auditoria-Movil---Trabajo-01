package com.amazon.aps.iva.zw;

import com.amazon.aps.iva.bo.f;
import com.amazon.aps.iva.jd.e;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
/* compiled from: AccountFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class a implements e {
    public final AccountStateProvider a = com.ellation.crunchyroll.application.e.c().getAccountStateProvider();
    public final EtpAccountService b = com.ellation.crunchyroll.application.e.c().getAccountService();
    public final f c;

    public a(f fVar) {
        this.c = fVar;
    }

    @Override // com.amazon.aps.iva.jd.e
    public final f b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.jd.e
    public final EtpAccountService getAccountService() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.jd.e
    public final AccountStateProvider getAccountStateProvider() {
        return this.a;
    }
}
