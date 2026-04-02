package com.amazon.aps.iva.yw;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class l implements com.amazon.aps.iva.nh.c {
    public final EtpContentService a;

    public l(d0 d0Var) {
        this.a = d0Var.b.getEtpContentService();
    }

    @Override // com.amazon.aps.iva.nh.c
    public final EtpContentService getEtpContentService() {
        return this.a;
    }
}
