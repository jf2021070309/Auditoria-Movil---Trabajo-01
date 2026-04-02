package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
/* loaded from: assets/audience_network.dex */
public final class KA implements NativeAdBase.NativeAdLoadConfigBuilder, NativeAdBase.NativeLoadAdConfig {
    @Nullable
    public NativeAdBase.MediaCacheFlag A02;
    @Nullable
    public String A03;
    public boolean A04;
    public final NativeAdBase A05;
    public final U1 A06;
    public int A01 = -1;
    public int A00 = -1;

    public KA(U1 u1, NativeAdBase nativeAdBase) {
        this.A06 = u1;
        this.A05 = nativeAdBase;
    }

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = NativeAdBase.MediaCacheFlag.ALL;
        }
        this.A06.A1W(EnumC0702Jy.A00(this.A02), this.A03, new C7Z(this.A04, this.A01, this.A00));
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final NativeAdBase.NativeLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withAdListener(NativeAdListener nativeAdListener) {
        this.A06.A1T(this.A05, nativeAdListener);
        return this;
    }

    @Override // com.facebook.ads.Ad.LoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withBid(String str) {
        this.A03 = str;
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withMediaCacheFlag(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A02 = mediaCacheFlag;
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withPreloadedIconView(int i2, int i3) {
        this.A04 = true;
        this.A01 = i2;
        this.A00 = i3;
        return this;
    }
}
