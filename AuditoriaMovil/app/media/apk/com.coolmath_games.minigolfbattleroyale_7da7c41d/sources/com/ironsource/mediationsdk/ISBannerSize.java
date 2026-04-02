package com.ironsource.mediationsdk;

import com.google.android.gms.nearby.messages.Strategy;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: classes2.dex */
public class ISBannerSize {
    private int b;
    private int c;
    private String d;
    public static final ISBannerSize BANNER = new ISBannerSize("BANNER", 320, 50);
    public static final ISBannerSize LARGE = new ISBannerSize("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = new ISBannerSize("RECTANGLE", Strategy.TTL_SECONDS_DEFAULT, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
    protected static final ISBannerSize a = new ISBannerSize("LEADERBOARD", 728, 90);
    public static final ISBannerSize SMART = new ISBannerSize("SMART", 0, 0);

    public ISBannerSize(int i, int i2) {
        this("CUSTOM", i, i2);
    }

    public ISBannerSize(String str, int i, int i2) {
        this.d = str;
        this.b = i;
        this.c = i2;
    }

    public String getDescription() {
        return this.d;
    }

    public int getHeight() {
        return this.c;
    }

    public int getWidth() {
        return this.b;
    }

    public boolean isSmart() {
        return this.d.equals("SMART");
    }
}
