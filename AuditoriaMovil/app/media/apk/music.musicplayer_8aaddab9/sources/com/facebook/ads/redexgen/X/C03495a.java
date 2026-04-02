package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardedInterstitialAd;
/* renamed from: com.facebook.ads.redexgen.X.5a  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03495a implements RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, RewardedInterstitialAd.RewardedInterstitialShowAdConfig {
    public final C03525d A00;

    public C03495a(C03525d c03525d) {
        this.A00 = c03525d;
    }

    public final C03525d A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i2) {
        this.A00.withAppOrientation(i2);
        return this;
    }
}
