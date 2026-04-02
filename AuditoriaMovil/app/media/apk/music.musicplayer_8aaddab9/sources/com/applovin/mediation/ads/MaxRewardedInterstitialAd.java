package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class MaxRewardedInterstitialAd implements MaxFullscreenAdImpl.a {
    private static WeakReference<Activity> a = new WeakReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    private final MaxFullscreenAdImpl f4410b;

    public MaxRewardedInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxRewardedInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxRewardedInterstitialAd", "MaxRewardedInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        a = new WeakReference<>(activity);
        this.f4410b = new MaxFullscreenAdImpl(str, MaxAdFormat.REWARDED_INTERSTITIAL, this, "MaxRewardedInterstitialAd", appLovinSdk.coreSdk);
    }

    public void destroy() {
        this.f4410b.logApiCall("destroy()");
        this.f4410b.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f4410b.logApiCall("getActivity()");
        return a.get();
    }

    public boolean isReady() {
        boolean isReady = this.f4410b.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4410b;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f4410b.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
    }

    public void setCustomPostbackData(String str) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4410b;
        maxFullscreenAdImpl.logApiCall("setCustomPostbackData(value=" + str + ")");
        this.f4410b.setCustomPostbackData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4410b;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4410b.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4410b;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f4410b.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4410b;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4410b.setLocalExtraParameter(str, obj);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4410b;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4410b.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(String str) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4410b;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ")");
        this.f4410b.showAd(str, getActivity());
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("");
        y.append(this.f4410b);
        return y.toString();
    }
}
