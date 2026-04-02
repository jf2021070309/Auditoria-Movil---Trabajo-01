package com.bytedance.sdk.openadsdk.mediation.custom;
/* loaded from: classes.dex */
public class MediationCustomInitConfig {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;

    public MediationCustomInitConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.c = str;
        this.a = str2;
        this.b = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
    }

    public String getADNName() {
        return this.c;
    }

    public String getAdnInitClassName() {
        return this.d;
    }

    public String getAppId() {
        return this.a;
    }

    public String getAppKey() {
        return this.b;
    }

    public String getBannerClassName() {
        return this.e;
    }

    public String getDrawClassName() {
        return this.k;
    }

    public String getFeedClassName() {
        return this.j;
    }

    public String getFullVideoClassName() {
        return this.h;
    }

    public String getInterstitialClassName() {
        return this.f;
    }

    public String getRewardClassName() {
        return this.g;
    }

    public String getSplashClassName() {
        return this.i;
    }

    public String toString() {
        return "MediationCustomInitConfig{mAppId='" + this.a + "', mAppKey='" + this.b + "', mADNName='" + this.c + "', mAdnInitClassName='" + this.d + "', mBannerClassName='" + this.e + "', mInterstitialClassName='" + this.f + "', mRewardClassName='" + this.g + "', mFullVideoClassName='" + this.h + "', mSplashClassName='" + this.i + "', mFeedClassName='" + this.j + "', mDrawClassName='" + this.k + "'}";
    }
}
