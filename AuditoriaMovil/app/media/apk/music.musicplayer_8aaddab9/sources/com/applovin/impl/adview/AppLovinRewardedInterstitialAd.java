package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
/* loaded from: classes.dex */
public class AppLovinRewardedInterstitialAd {
    private final AppLovinIncentivizedInterstitial a;

    /* renamed from: b  reason: collision with root package name */
    private AppLovinAdDisplayListener f3130b;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinAdClickListener f3131c;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinAdVideoPlaybackListener f3132d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f3131c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f3130b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f3132d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.a.show(appLovinAd, context, appLovinAdRewardListener, this.f3132d, this.f3130b, this.f3131c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
