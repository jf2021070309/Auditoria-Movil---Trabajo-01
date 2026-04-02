package com.applovin.mediation.adapters;

import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinSdk;
/* loaded from: classes.dex */
public abstract class MediationAdapterBase implements MaxAdapter {
    private boolean alwaysRewardUser;
    private final r mLogger;
    private final k mSdk;
    private final String mTag;
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        k kVar = appLovinSdk.coreSdk;
        this.mSdk = kVar;
        this.mLogger = kVar.z();
        this.mTag = getClass().getSimpleName();
    }

    protected static String mediationTag() {
        return "AppLovinSdk_" + AppLovinSdk.VERSION;
    }

    protected void checkActivities(Context context, Class<?>... clsArr) {
    }

    protected void checkExistence(Class<?>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        for (Class<?> cls : clsArr) {
            log("Found: " + cls.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i = BundleUtils.getInt(AppLovinEventParameters.REVENUE_AMOUNT, 0, serverParameters);
        String string = BundleUtils.getString("currency", "", serverParameters);
        log("Creating reward: " + i + " " + string);
        this.reward = MaxRewardImpl.create(i, string);
    }

    protected void d(String str) {
        this.mLogger.b(this.mTag, str);
    }

    protected void e(String str) {
        this.mLogger.e(this.mTag, str);
    }

    protected void e(String str, Throwable th) {
        this.mLogger.b(this.mTag, str, th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MaxReward getReward() {
        MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : MaxRewardImpl.createDefault();
    }

    String getVersionString(Class cls, String str) {
        String string = Utils.getString(cls, str);
        if (string == null) {
            log("Failed to retrieve version string.");
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    protected void i(String str) {
        this.mLogger.c(this.mTag, str);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public boolean isBeta() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void log(String str) {
        this.mLogger.c(this.mTag, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void log(String str, Throwable th) {
        this.mLogger.b(this.mTag, str, th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    protected void userError(String str) {
        userError(str, null);
    }

    protected void userError(String str, Throwable th) {
        r.c(this.mTag, str, th);
    }

    protected void w(String str) {
        this.mLogger.d(this.mTag, str);
    }
}
