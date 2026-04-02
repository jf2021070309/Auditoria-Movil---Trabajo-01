package com.google.ads;

import android.content.Context;
import com.google.android.gms.cast.MediaError;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    private final com.google.android.gms.ads.AdSize zza;
    public static final AdSize SMART_BANNER = new AdSize(-1, -2);
    public static final AdSize BANNER = new AdSize(320, 50);
    public static final AdSize IAB_MRECT = new AdSize(300, 250);
    public static final AdSize IAB_BANNER = new AdSize(468, 60);
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90);
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, MediaError.DetailedErrorCode.TEXT_UNKNOWN);

    public AdSize(com.google.android.gms.ads.AdSize adSize) {
        this.zza = adSize;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AdSize)) {
            return false;
        }
        return this.zza.equals(((AdSize) obj).zza);
    }

    public AdSize findBestSize(AdSize... adSizeArr) {
        int width;
        int height;
        AdSize adSize = null;
        if (adSizeArr == null) {
            return null;
        }
        int width2 = getWidth();
        int height2 = getHeight();
        float f = 0.0f;
        for (AdSize adSize2 : adSizeArr) {
            if (isSizeAppropriate(adSize2.getWidth(), adSize2.getHeight())) {
                float f2 = (width * height) / (width2 * height2);
                if (f2 > 1.0f) {
                    f2 = 1.0f / f2;
                }
                if (f2 > f) {
                    adSize = adSize2;
                    f = f2;
                }
            }
        }
        return adSize;
    }

    public int getHeight() {
        return this.zza.getHeight();
    }

    public int getHeightInPixels(Context context) {
        return this.zza.getHeightInPixels(context);
    }

    public int getWidth() {
        return this.zza.getWidth();
    }

    public int getWidthInPixels(Context context) {
        return this.zza.getWidthInPixels(context);
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zza.isAutoHeight();
    }

    public boolean isCustomAdSize() {
        return false;
    }

    public boolean isFullWidth() {
        return this.zza.isFullWidth();
    }

    public boolean isSizeAppropriate(int i, int i2) {
        float width = getWidth();
        float f = i;
        int i3 = (f > (width * 1.25f) ? 1 : (f == (width * 1.25f) ? 0 : -1));
        int height = getHeight();
        if (i3 <= 0 && f >= width * 0.8f) {
            float f2 = i2;
            float f3 = height;
            if (f2 <= 1.25f * f3 && f2 >= f3 * 0.8f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        return this.zza.toString();
    }

    public AdSize(int i, int i2) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }
}
