package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;
/* loaded from: assets/audience_network.dex */
public final class F1 extends C1200bS {
    public InterfaceC0843Pp A00;

    public final void A04(C1046Xo c1046Xo, NativeBannerAd nativeBannerAd, K6 k6, NativeAdLayout nativeAdLayout) {
        MediaView adIconView = new MediaView(nativeAdLayout.getContext());
        AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        k6.A09(adOptionsView, 20);
        this.A00 = new C0888Ri(c1046Xo, nativeBannerAd, k6, U1.A0L(nativeBannerAd.getInternalNativeAd()).A19(), adIconView, adOptionsView);
        ML.A0M(nativeAdLayout, k6.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, adIconView, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
