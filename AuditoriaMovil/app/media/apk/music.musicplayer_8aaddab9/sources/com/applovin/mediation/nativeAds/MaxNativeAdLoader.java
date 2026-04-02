package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.sdk.AppLovinSdk;
/* loaded from: classes.dex */
public class MaxNativeAdLoader {
    private final MaxNativeAdLoaderImpl a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.a = new MaxNativeAdLoaderImpl(str, appLovinSdk.coreSdk, context);
    }

    public void destroy(MaxAd maxAd) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.a;
        maxNativeAdLoaderImpl.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.a.destroy(maxAd);
    }

    public String getAdUnitId() {
        return this.a.getAdUnitId();
    }

    public String getPlacement() {
        this.a.logApiCall("getPlacement()");
        return this.a.getPlacement();
    }

    public void loadAd() {
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
    }

    public void setCustomPostbackData(String str) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.a;
        maxNativeAdLoaderImpl.logApiCall("setCustomPostbackData(value=" + str + ")");
        this.a.setCustomPostbackData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.a;
        maxNativeAdLoaderImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.a;
        maxNativeAdLoaderImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.a;
        maxNativeAdLoaderImpl.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.a;
        maxNativeAdLoaderImpl.logApiCall("setPlacement(placement=" + str + ")");
        this.a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.a;
        maxNativeAdLoaderImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.a.setRevenueListener(maxAdRevenueListener);
    }
}
