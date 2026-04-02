package com.vungle.warren;

import com.vungle.warren.AdConfig;
/* loaded from: classes2.dex */
public class BannerAdConfig extends BaseAdConfig {
    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ AdConfig.AdSize getAdSize() {
        return super.getAdSize();
    }

    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ int getSettings() {
        return super.getSettings();
    }

    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ void setAdSize(AdConfig.AdSize adSize) {
        super.setAdSize(adSize);
    }

    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ void setMuted(boolean z) {
        super.setMuted(z);
    }

    public BannerAdConfig() {
    }

    public BannerAdConfig(AdConfig.AdSize adSize) {
        super(adSize);
    }

    public BannerAdConfig(BaseAdConfig baseAdConfig) {
        super(baseAdConfig);
    }
}
