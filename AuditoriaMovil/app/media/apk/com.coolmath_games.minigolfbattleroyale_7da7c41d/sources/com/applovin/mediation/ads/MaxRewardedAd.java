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
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {
    private static final Map<String, MaxRewardedAd> a = new HashMap();
    private static final Object b = new Object();
    private static WeakReference<Activity> c = new WeakReference<>(null);
    private final MaxFullscreenAdImpl d;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk) {
        this.d = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.coreSdk);
    }

    public static MaxRewardedAd getInstance(String str, Activity activity) {
        return getInstance(str, AppLovinSdk.getInstance(activity), activity);
    }

    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (activity != null) {
                if (appLovinSdk != null) {
                    updateActivity(activity);
                    synchronized (b) {
                        MaxRewardedAd maxRewardedAd = a.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk);
                        a.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    }
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No activity specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public static void updateActivity(Activity activity) {
        a.logApiCall("MaxRewardedAd", "updateActivity(activity=" + activity + ")");
        if (activity != null) {
            c = new WeakReference<>(activity);
        }
    }

    public void destroy() {
        this.d.logApiCall("destroy()");
        synchronized (b) {
            a.remove(this.d.getAdUnitId());
        }
        this.d.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.d.logApiCall("getActivity()");
        return c.get();
    }

    public String getAdUnitId() {
        return this.d.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.d.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.d;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.d.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.d.logApiCall("loadAd()");
        this.d.loadAd(getActivity());
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.d;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.d.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.d;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.d.setListener(maxRewardedAdListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.d;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.d.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(String str) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.d;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ")");
        this.d.showAd(str, getActivity());
    }

    public String toString() {
        return "" + this.d;
    }
}
