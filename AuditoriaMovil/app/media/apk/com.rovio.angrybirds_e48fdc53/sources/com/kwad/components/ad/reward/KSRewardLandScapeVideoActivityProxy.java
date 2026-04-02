package com.kwad.components.ad.reward;

import com.kwad.sdk.api.core.KsAdSdkDynamicImpl;
import com.kwad.sdk.api.proxy.app.KSRewardLandScapeVideoActivity;
@KsAdSdkDynamicImpl(KSRewardLandScapeVideoActivity.class)
/* loaded from: classes.dex */
public class KSRewardLandScapeVideoActivityProxy extends KSRewardVideoActivityProxy {
    public static void register() {
        com.kwad.sdk.service.b.a(KSRewardLandScapeVideoActivity.class, KSRewardLandScapeVideoActivityProxy.class);
    }
}
