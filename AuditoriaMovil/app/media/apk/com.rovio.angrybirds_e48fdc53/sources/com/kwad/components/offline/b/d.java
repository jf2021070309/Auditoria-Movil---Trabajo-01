package com.kwad.components.offline.b;

import com.kwad.components.core.n.b.a.i;
import com.kwad.components.offline.api.core.api.IOfflineCompoWrapper;
import com.kwad.components.offline.api.obiwan.IObiwanOfflineCompo;
import com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.utils.av;
/* loaded from: classes.dex */
public final class d implements IObiwanOfflineCompoInitConfig {
    @Override // com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig
    public final String getLogDirPath() {
        return av.cO(KsAdSDKImpl.get().getContext()).getAbsolutePath();
    }

    @Override // com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig
    public final String getLogObiwanData() {
        return com.kwad.sdk.core.config.d.getLogObiwanData();
    }

    @Override // com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig
    public final long getLogObiwanStorageQuota() {
        com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        return com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.alZ);
    }

    @Override // com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig
    public final boolean isLogObiwanEnableNow() {
        return com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.alX);
    }

    @Override // com.kwad.components.offline.api.obiwan.IObiwanOfflineCompoInitConfig
    public final boolean isLogObiwanRecordAll() {
        return com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.alY);
    }

    @Override // com.kwad.components.offline.api.IOfflineCompoInitConfig
    public final IOfflineCompoWrapper wrapper() {
        return new i(IObiwanOfflineCompo.PACKAGE_NAME);
    }
}
