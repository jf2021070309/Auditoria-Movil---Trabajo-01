package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardedVideoAd;
/* renamed from: com.facebook.ads.redexgen.X.5d  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03525d implements RewardedVideoAd.RewardedVideoAdShowConfigBuilder, RewardedVideoAd.RewardedVideoShowAdConfig {
    public int A00 = -1;

    public final int A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final RewardedVideoAd.RewardedVideoShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder
    public final RewardedVideoAd.RewardedVideoAdShowConfigBuilder withAppOrientation(int i2) {
        this.A00 = i2;
        return this;
    }
}
