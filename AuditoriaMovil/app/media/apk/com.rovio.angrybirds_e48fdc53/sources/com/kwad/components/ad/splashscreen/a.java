package com.kwad.components.ad.splashscreen;

import android.content.Context;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
import java.util.List;
/* loaded from: classes.dex */
public final class a extends com.kwad.sdk.components.d implements com.kwad.components.ad.b.h {
    @Override // com.kwad.components.ad.b.h
    public final List<String> R() {
        return SplashPreloadManager.kD().R();
    }

    @Override // com.kwad.sdk.components.a
    public final Class<com.kwad.components.ad.b.h> getComponentsType() {
        return com.kwad.components.ad.b.h.class;
    }

    @Override // com.kwad.sdk.components.a
    public final void init(Context context) {
    }

    @Override // com.kwad.components.ad.b.h
    public final void loadSplashScreenAd(KsScene ksScene, KsLoadManager.SplashScreenAdListener splashScreenAdListener) {
        b.loadSplashScreenAd(ksScene, splashScreenAdListener);
    }
}
