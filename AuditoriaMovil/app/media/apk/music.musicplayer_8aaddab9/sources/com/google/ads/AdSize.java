package com.google.ads;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import ch.qos.logback.core.net.SyslogConstants;
@Deprecated
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    public final com.google.android.gms.ads.AdSize a;
    @RecentlyNonNull
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "mb");
    @RecentlyNonNull
    public static final AdSize BANNER = new AdSize(320, 50, "mb");
    @RecentlyNonNull
    public static final AdSize IAB_MRECT = new AdSize(300, 250, "as");
    @RecentlyNonNull
    public static final AdSize IAB_BANNER = new AdSize(468, 60, "as");
    @RecentlyNonNull
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90, "as");
    @RecentlyNonNull
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(SyslogConstants.LOG_LOCAL4, 600, "as");

    public AdSize(int i2, int i3) {
        this(new com.google.android.gms.ads.AdSize(i2, i3));
    }

    public AdSize(int i2, int i3, String str) {
        this(new com.google.android.gms.ads.AdSize(i2, i3));
    }

    public AdSize(@RecentlyNonNull com.google.android.gms.ads.AdSize adSize) {
        this.a = adSize;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (obj instanceof AdSize) {
            return this.a.equals(((AdSize) obj).a);
        }
        return false;
    }

    @RecentlyNonNull
    public AdSize findBestSize(@RecentlyNonNull AdSize... adSizeArr) {
        int width;
        int height;
        AdSize adSize = null;
        if (adSizeArr == null) {
            return null;
        }
        int width2 = getWidth();
        int height2 = getHeight();
        float f2 = 0.0f;
        for (AdSize adSize2 : adSizeArr) {
            if (isSizeAppropriate(adSize2.getWidth(), adSize2.getHeight())) {
                float f3 = (width * height) / (width2 * height2);
                if (f3 > 1.0f) {
                    f3 = 1.0f / f3;
                }
                if (f3 > f2) {
                    adSize = adSize2;
                    f2 = f3;
                }
            }
        }
        return adSize;
    }

    public int getHeight() {
        return this.a.getHeight();
    }

    public int getHeightInPixels(@RecentlyNonNull Context context) {
        return this.a.getHeightInPixels(context);
    }

    public int getWidth() {
        return this.a.getWidth();
    }

    public int getWidthInPixels(@RecentlyNonNull Context context) {
        return this.a.getWidthInPixels(context);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isAutoHeight() {
        return this.a.isAutoHeight();
    }

    public boolean isCustomAdSize() {
        return false;
    }

    public boolean isFullWidth() {
        return this.a.isFullWidth();
    }

    public boolean isSizeAppropriate(int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        float f2 = i2;
        float f3 = width;
        if (f2 > f3 * 1.25f || f2 < f3 * 0.8f) {
            return false;
        }
        float f4 = i3;
        float f5 = height;
        return f4 <= 1.25f * f5 && f4 >= f5 * 0.8f;
    }

    @RecentlyNonNull
    public String toString() {
        return this.a.toString();
    }
}
