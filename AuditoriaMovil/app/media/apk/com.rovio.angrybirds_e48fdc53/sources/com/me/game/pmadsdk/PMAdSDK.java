package com.me.game.pmadsdk;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.text.TextUtils;
import com.me.game.pmadsdk.base.BaseUtils;
import com.me.game.pmadsdk.network.RequestBase;
import com.me.game.pmadsdk.utils.HandlerUtils;
import java.util.UUID;
/* loaded from: classes6.dex */
public class PMAdSDK extends Application {
    public static final String mIsShowNotice = "TO_SHOW_AD_NOTICE";
    public static volatile PMAdSDK mPmAdSDK;
    private Application mBase;
    private Handler mHandler = new Handler();
    private int versionCode;
    private String versionName;

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        if (this.mBase == null) {
            this.mBase = this;
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        mPmAdSDK = this;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            this.versionCode = packageInfo.versionCode;
            this.versionName = packageInfo.versionName;
        } catch (Exception e) {
            this.versionCode = 1;
            this.versionName = "1.0";
        }
        RequestBase.initApplication(this);
        BaseUtils.initApplication(this);
    }

    public static void attachApplication(Context context) {
        if (context == null) {
            return;
        }
        Context context2 = context.getApplicationContext();
        if ((context2 instanceof Application) && mPmAdSDK == null) {
            mPmAdSDK = new PMAdSDK();
            Application application = (Application) context2;
            mPmAdSDK.mBase = application;
            mPmAdSDK.attachBaseContext(application);
            mPmAdSDK.onCreate();
        }
    }

    public void post(Runnable runnable) {
        HandlerUtils.post(this.mHandler, runnable);
    }

    public void postDelayed(Runnable runnable, long time) {
        HandlerUtils.postDelayed(this.mHandler, runnable, time);
    }

    public String getRealPackageName() {
        return getPackageName();
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public String getAndroidId() {
        SharedPreferences preferences = getSharedPreferences("device", 0);
        String uuid = preferences.getString("uuid", "");
        if (TextUtils.isEmpty(uuid)) {
            String uuid2 = UUID.randomUUID().toString();
            preferences.edit().putString("uuid", uuid2).apply();
            return uuid2;
        }
        return uuid;
    }
}
