package com.vungle.warren;

import com.google.gson.annotations.SerializedName;
import com.vungle.warren.AdConfig;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BaseAdConfig {
    public static final int MUTED = 1;
    @SerializedName("adSize")
    private AdConfig.AdSize adSize;
    @SerializedName("settings")
    protected int settings;

    public BaseAdConfig() {
    }

    public BaseAdConfig(AdConfig.AdSize adSize) {
        this.adSize = adSize;
    }

    public BaseAdConfig(BaseAdConfig baseAdConfig) {
        this(baseAdConfig.getAdSize());
        this.settings = baseAdConfig.getSettings();
    }

    public void setMuted(boolean z) {
        if (z) {
            this.settings |= 1;
        } else {
            this.settings &= -2;
        }
    }

    public AdConfig.AdSize getAdSize() {
        AdConfig.AdSize adSize = this.adSize;
        return adSize == null ? AdConfig.AdSize.VUNGLE_DEFAULT : adSize;
    }

    public void setAdSize(AdConfig.AdSize adSize) {
        this.adSize = adSize;
    }

    public int getSettings() {
        return this.settings;
    }
}
