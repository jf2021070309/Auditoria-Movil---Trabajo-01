package com.kwad.components.ad.b;

import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import java.util.List;
/* loaded from: classes.dex */
public interface h extends com.kwad.sdk.components.a {
    List<String> R();

    void loadSplashScreenAd(KsScene ksScene, KsLoadManager.SplashScreenAdListener splashScreenAdListener);
}
