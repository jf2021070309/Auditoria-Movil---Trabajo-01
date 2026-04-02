package com.kwad.components.ad.interstitial;

import android.content.Context;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsScene;
/* loaded from: classes.dex */
public final class a extends com.kwad.sdk.components.d implements com.kwad.components.ad.b.e {
    @Override // com.kwad.sdk.components.a
    public final Class getComponentsType() {
        return com.kwad.components.ad.b.e.class;
    }

    @Override // com.kwad.sdk.components.a
    public final void init(Context context) {
    }

    @Override // com.kwad.components.ad.b.e
    public final void loadInterstitialAd(KsScene ksScene, KsLoadManager.InterstitialAdListener interstitialAdListener) {
        e.loadInterstitialAd(ksScene, interstitialAdListener);
    }
}
