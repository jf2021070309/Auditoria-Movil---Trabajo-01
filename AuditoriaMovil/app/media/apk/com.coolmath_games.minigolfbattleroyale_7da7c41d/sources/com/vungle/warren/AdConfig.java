package com.vungle.warren;

import com.google.android.gms.nearby.messages.Strategy;
import com.google.gson.annotations.SerializedName;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: classes2.dex */
public class AdConfig extends BaseAdConfig {
    public static final int AUTO_ROTATE = 2;
    public static final int IMMEDIATE_BACK = 2;
    public static final int IMMERSIVE = 4;
    public static final int LANDSCAPE = 1;
    public static final int MATCH_VIDEO = 3;
    public static final int PORTRAIT = 0;
    public static final int TRANSITION_ANIMATE = 8;
    @SerializedName("adOrientation")
    private int adOrientation;
    @SerializedName("ordinal")
    private int ordinal;

    /* loaded from: classes2.dex */
    public @interface Orientation {
    }

    /* loaded from: classes2.dex */
    public @interface Settings {
    }

    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ AdSize getAdSize() {
        return super.getAdSize();
    }

    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ int getSettings() {
        return super.getSettings();
    }

    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ void setAdSize(AdSize adSize) {
        super.setAdSize(adSize);
    }

    @Override // com.vungle.warren.BaseAdConfig
    public /* bridge */ /* synthetic */ void setMuted(boolean z) {
        super.setMuted(z);
    }

    /* loaded from: classes2.dex */
    public enum AdSize {
        VUNGLE_MREC("mrec", Strategy.TTL_SECONDS_DEFAULT, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED),
        VUNGLE_DEFAULT("default", -1, -1),
        BANNER("banner", 320, 50),
        BANNER_SHORT("banner_short", Strategy.TTL_SECONDS_DEFAULT, 50),
        BANNER_LEADERBOARD("banner_leaderboard", 728, 90);
        
        private final int height;
        private final String name;
        private final int width;

        AdSize(String str, int i, int i2) {
            this.width = i;
            this.height = i2;
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        public int getWidth() {
            return this.width;
        }

        public int getHeight() {
            return this.height;
        }

        public static AdSize fromName(String str) {
            AdSize[] values;
            for (AdSize adSize : values()) {
                if (adSize.name.equals(str)) {
                    return adSize;
                }
            }
            return VUNGLE_DEFAULT;
        }

        public static boolean isDefaultAdSize(AdSize adSize) {
            return adSize == VUNGLE_DEFAULT || adSize == VUNGLE_MREC;
        }

        public static boolean isBannerAdSize(AdSize adSize) {
            return adSize == BANNER || adSize == BANNER_LEADERBOARD || adSize == BANNER_SHORT || adSize == VUNGLE_MREC;
        }

        public static boolean isNonMrecBannerAdSize(AdSize adSize) {
            return adSize != VUNGLE_MREC && isBannerAdSize(adSize);
        }
    }

    public AdConfig() {
        this.adOrientation = 2;
    }

    public AdConfig(AdSize adSize) {
        super(adSize);
        this.adOrientation = 2;
    }

    public AdConfig(BaseAdConfig baseAdConfig) {
        super(baseAdConfig);
        this.adOrientation = 2;
    }

    public void setBackButtonImmediatelyEnabled(boolean z) {
        if (z) {
            this.settings |= 2;
        } else {
            this.settings &= -3;
        }
    }

    public void setImmersiveMode(boolean z) {
        if (z) {
            this.settings |= 4;
        } else {
            this.settings &= -5;
        }
    }

    public void setTransitionAnimationEnabled(boolean z) {
        if (z) {
            this.settings |= 8;
        } else {
            this.settings &= -9;
        }
    }

    public int getOrdinal() {
        return this.ordinal;
    }

    public void setOrdinal(int i) {
        this.ordinal = i;
    }

    public int getAdOrientation() {
        return this.adOrientation;
    }

    public void setAdOrientation(int i) {
        this.adOrientation = i;
    }
}
