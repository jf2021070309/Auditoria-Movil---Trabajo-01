package com.kwad.components.ad.b;

import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
/* loaded from: classes.dex */
public interface f extends com.kwad.sdk.components.a {
    void loadNativeAd(KsScene ksScene, KsLoadManager.NativeAdListener nativeAdListener);

    void loadNativeAd(String str, KsLoadManager.NativeAdListener nativeAdListener);
}
