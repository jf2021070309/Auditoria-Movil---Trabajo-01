package com.applovin.sdk;

import e.a.d.a.a;
import java.util.Locale;
/* loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4445b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4446c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize CROSS_PROMO = new AppLovinAdSize(-1, -1, "XPROMO");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i2, int i3, String str) {
        this.f4445b = i2;
        this.f4446c = i3;
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
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException(a.k("Unknown Ad Size: ", str));
    }

    public int getHeight() {
        return this.f4446c;
    }

    public String getLabel() {
        return this.a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f4445b;
    }

    public String toString() {
        return getLabel();
    }
}
