package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import c.p.j;
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

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4407b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference<Activity> f4408c = new WeakReference<>(null);

    /* renamed from: d  reason: collision with root package name */
    private final MaxFullscreenAdImpl f4409d;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk) {
        this.f4409d = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.coreSdk);
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
                    synchronized (f4407b) {
                        Map<String, MaxRewardedAd> map = a;
                        MaxRewardedAd maxRewardedAd = map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk);
                        map.put(str, maxRewardedAd2);
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
            f4408c = new WeakReference<>(activity);
        }
    }

    public void destroy() {
        this.f4409d.logApiCall("destroy()");
        synchronized (f4407b) {
            a.remove(this.f4409d.getAdUnitId());
        }
        this.f4409d.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f4409d.logApiCall("getActivity()");
        return f4408c.get();
    }

    public String getAdUnitId() {
        return this.f4409d.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f4409d.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4409d;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f4409d.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
    }

    public void setCustomPostbackData(String str) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4409d;
        maxFullscreenAdImpl.logApiCall("setCustomPostbackData(value=" + str + ")");
        this.f4409d.setCustomPostbackData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4409d;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4409d.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4409d;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f4409d.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4409d;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4409d.setLocalExtraParameter(str, obj);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4409d;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4409d.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(ViewGroup viewGroup, j jVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4409d;
        maxFullscreenAdImpl.logApiCall("showAd(containerView=" + viewGroup + ", lifecycle=" + jVar + ")");
        this.f4409d.showAd(viewGroup, jVar, getActivity());
    }

    public void showAd(String str) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f4409d;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ")");
        this.f4409d.showAd(str, getActivity());
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("");
        y.append(this.f4409d);
        return y.toString();
    }
}
