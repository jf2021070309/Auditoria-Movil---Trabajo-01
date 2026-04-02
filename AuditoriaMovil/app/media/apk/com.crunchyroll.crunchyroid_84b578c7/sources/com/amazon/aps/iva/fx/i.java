package com.amazon.aps.iva.fx;

import com.ellation.crunchyroll.api.etp.EtpNetworkModule;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.playback.SkipEventsService;
/* compiled from: DownloadingFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.zv.d {
    public final EtpContentService a;
    public final SkipEventsService b;

    public i(EtpNetworkModule etpNetworkModule) {
        this.a = etpNetworkModule.getEtpContentService();
        this.b = etpNetworkModule.getSkipEventsService();
    }

    @Override // com.amazon.aps.iva.zv.d
    public final EtpContentService a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.zv.d
    public final SkipEventsService getSkipEventsService() {
        return this.b;
    }
}
