package com.kwad.components.ad.a;

import com.facebook.ads.AudienceNetworkActivity;
import com.kwad.sdk.h;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.core.request.a {
    public a(com.kwad.components.core.request.model.a aVar) {
        super(aVar);
        putBody(AudienceNetworkActivity.REQUEST_TIME, System.currentTimeMillis());
    }

    @Override // com.kwad.components.core.request.a, com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final String getUrl() {
        return h.xb();
    }
}
