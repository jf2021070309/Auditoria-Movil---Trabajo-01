package com.kwad.components.ad.interstitial.f;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsInterstitialAd;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public abstract class a extends FrameLayout {
    public Context mContext;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
    }

    public abstract void a(AdTemplate adTemplate, com.kwad.components.ad.interstitial.d dVar, KsAdVideoPlayConfig ksAdVideoPlayConfig, KsInterstitialAd.AdInteractionListener adInteractionListener);

    public abstract void co();

    public abstract void cp();

    public abstract void setAdInteractionListener(KsInterstitialAd.AdInteractionListener adInteractionListener);
}
