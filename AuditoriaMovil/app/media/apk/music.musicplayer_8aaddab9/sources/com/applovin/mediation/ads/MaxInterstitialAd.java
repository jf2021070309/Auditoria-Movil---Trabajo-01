package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import c.p.j;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.a {
    private static WeakReference<Activity> a = new WeakReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    private final MaxFullscreenAdImpl f4406b;

    public MaxInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
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
        this.f4406b = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.coreSdk);
    }

    public void destroy() {
        this.f4406b.logApiCall("destroy()");
        this.f4406b.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f4406b.logApiCall("getActivity()");
        return a.get();
    }

    public String getAdUnitId() {
        return this.f4406b.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f4406b.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4406b;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f4406b.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
    }

    public void setCustomPostbackData(String str) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4406b;
        maxFullscreenAdImpl.logApiCall("setCustomPostbackData(value=" + str + ")");
        this.f4406b.setCustomPostbackData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4406b;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4406b.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4406b;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f4406b.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4406b;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4406b.setLocalExtraParameter(str, obj);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4406b;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4406b.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(ViewGroup viewGroup, j jVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4406b;
        maxFullscreenAdImpl.logApiCall("showAd(containerView=" + viewGroup + ", lifecycle=" + jVar + ")");
        this.f4406b.showAd(viewGroup, jVar, getActivity());
    }

    public void showAd(String str) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4406b;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ")");
        this.f4406b.showAd(str, getActivity());
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("");
        y.append(this.f4406b);
        return y.toString();
    }
}
