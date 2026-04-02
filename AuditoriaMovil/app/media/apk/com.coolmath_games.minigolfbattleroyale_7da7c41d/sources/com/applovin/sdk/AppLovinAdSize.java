package com.applovin.sdk;

import com.google.android.gms.nearby.messages.Strategy;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Locale;
/* loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;
    private final String a;
    private final int b;
    private final int c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize CROSS_PROMO = new AppLovinAdSize(-1, -1, "XPROMO");
    @Deprecated
    public static final AppLovinAdSize MREC = new AppLovinAdSize(Strategy.TTL_SECONDS_DEFAULT, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, "MREC");

    private AppLovinAdSize(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("XPROMO".equalsIgnoreCase(str)) {
            return CROSS_PROMO;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }

    public int getHeight() {
        return this.c;
    }

    public String getLabel() {
        return this.a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.b;
    }

    public String toString() {
        return getLabel();
    }
}
