package com.amazon.aps.iva.ix;

import com.ellation.crunchyroll.api.etp.EtpNetworkModule;
/* compiled from: HomeFeedFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ EtpNetworkModule h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(EtpNetworkModule etpNetworkModule) {
        super(0);
        this.h = etpNetworkModule;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.h.getCountryCodeProvider().isUserCountryBrazil());
    }
}
