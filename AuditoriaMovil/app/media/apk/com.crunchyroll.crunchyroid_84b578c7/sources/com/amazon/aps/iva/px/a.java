package com.amazon.aps.iva.px;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.application.e;
/* compiled from: SimulcastFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.in.a {
    public final EtpContentService a = e.c().getEtpContentService();

    @Override // com.amazon.aps.iva.in.a
    public final EtpContentService getContentService() {
        return this.a;
    }
}
