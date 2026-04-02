package com.kwad.components.ad.fullscreen;

import com.kwad.sdk.api.core.KsAdSdkDynamicImpl;
import com.kwad.sdk.api.proxy.app.KsFullScreenLandScapeVideoActivity;
@KsAdSdkDynamicImpl(KsFullScreenLandScapeVideoActivity.class)
/* loaded from: classes.dex */
public class KsFullScreenLandScapeVideoActivityProxy extends KsFullScreenVideoActivityProxy {
    public static void register() {
        com.kwad.sdk.service.b.a(KsFullScreenLandScapeVideoActivity.class, KsFullScreenLandScapeVideoActivityProxy.class);
    }
}
