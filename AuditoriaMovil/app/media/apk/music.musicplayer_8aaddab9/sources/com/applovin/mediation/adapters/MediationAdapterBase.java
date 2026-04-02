package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import c.p.j;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinSdk;
import e.a.d.a.a;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public abstract class MediationAdapterBase implements MaxAdapter, MaxInterstitialAdViewAdapter, MaxNativeAdAdapter, MaxRewardedAdViewAdapter {
    private boolean alwaysRewardUser;
    private final v mLogger;
    private final m mSdk;
    private final String mTag;
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        m mVar = appLovinSdk.coreSdk;
        this.mSdk = mVar;
        this.mLogger = mVar.B();
        this.mTag = getClass().getSimpleName();
    }

    public static String mediationTag() {
        StringBuilder y = a.y("AppLovinSdk_");
        y.append(AppLovinSdk.VERSION);
        return y.toString();
    }

    public void checkActivities(Context context, Class<?>... clsArr) {
    }

    public void checkExistence(Class<?>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        for (Class<?> cls : clsArr) {
            StringBuilder y = a.y("Found: ");
            y.append(cls.getName());
            log(y.toString());
        }
    }

    public void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i2 = BundleUtils.getInt(AppLovinEventParameters.REVENUE_AMOUNT, 0, serverParameters);
        String string = BundleUtils.getString(AppLovinEventParameters.REVENUE_CURRENCY, "", serverParameters);
        log("Creating reward: " + i2 + " " + string);
        this.reward = MaxRewardImpl.create(i2, string);
    }

    public Future<Drawable> createDrawableFuture(final String str, final Resources resources) {
        return getCachingExecutorService().submit(new Callable<Drawable>() { // from class: com.applovin.mediation.adapters.MediationAdapterBase.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Drawable call() throws Exception {
                InputStream openStream = new URL(str).openStream();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(openStream));
                openStream.close();
                return bitmapDrawable;
            }
        });
    }

    public void d(String str) {
        this.mLogger.b(this.mTag, str);
    }

    public void e(String str) {
        this.mLogger.e(this.mTag, str);
    }

    public void e(String str, Throwable th) {
        this.mLogger.b(this.mTag, str, th);
    }

    public Context getApplicationContext() {
        return this.mSdk.L();
    }

    public ExecutorService getCachingExecutorService() {
        return this.mSdk.S().c();
    }

    public MaxReward getReward() {
        MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : MaxRewardImpl.createDefault();
    }

    public String getVersionString(Class cls, String str) {
        String string = Utils.getString(cls, str);
        if (string == null) {
            log("Failed to retrieve version string.");
        }
        return string;
    }

    public AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    public void i(String str) {
        this.mLogger.c(this.mTag, str);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public boolean isBeta() {
        return false;
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        StringBuilder y = a.y("This adapter (");
        y.append(getAdapterVersion());
        y.append(") does not support native ads.");
        d(y.toString());
        maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void log(String str) {
        this.mLogger.c(this.mTag, str);
    }

    public void log(String str, Throwable th) {
        this.mLogger.b(this.mTag, str, th);
    }

    public boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, j jVar, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        StringBuilder y = a.y("This adapter (");
        y.append(getAdapterVersion());
        y.append(") does not support interstitial ad view ads.");
        d(y.toString());
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, j jVar, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        StringBuilder y = a.y("This adapter (");
        y.append(getAdapterVersion());
        y.append(") does not support rewarded ad view ads.");
        d(y.toString());
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void userError(String str) {
        userError(str, null);
    }

    public void userError(String str, Throwable th) {
        v.c(this.mTag, str, th);
    }

    public void w(String str) {
        this.mLogger.d(this.mTag, str);
    }
}
