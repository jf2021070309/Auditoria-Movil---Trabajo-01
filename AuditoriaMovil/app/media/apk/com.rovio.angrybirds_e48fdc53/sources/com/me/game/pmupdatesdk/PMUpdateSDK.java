package com.me.game.pmupdatesdk;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.me.game.pm_tools.g0;
import com.me.game.pmupdatesdk.network.RequestBase;
import com.me.game.pmupdatesdk.utils.HandlerUtils;
import com.me.game.pmupdatesdk.utils.LoggerUtils;
import com.me.game.pmupdatesdk.utils.MD5Util;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
/* loaded from: classes7.dex */
public class PMUpdateSDK extends Application {
    private static final String TAG = PMUpdateSDK.class.getSimpleName();
    public static final String mIsShowNotice = "TO_SHOW_UPDATE_NOTICE";
    public static volatile PMUpdateSDK mPMUpdateSDK;
    private Application mBase;
    private int versionCode;
    private String versionName;
    private Handler mHandler = new Handler();
    private boolean isTest = false;

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        LoggerUtils.e("hhhhh", "PMUpdateSDK-attachBaseContext");
        if (this.mBase == null) {
            this.mBase = this;
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        LoggerUtils.e("hhhhh", "PMUpdateSDK-onCreate");
        mPMUpdateSDK = this;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            this.versionCode = packageInfo.versionCode;
            this.versionName = packageInfo.versionName;
        } catch (Exception e) {
            this.versionCode = 1;
            this.versionName = "1.0";
        }
        RequestBase.initApplication(this);
    }

    public static void attachApplication(Context context) {
        if (context == null) {
            return;
        }
        Context context2 = context.getApplicationContext();
        if ((context2 instanceof Application) && mPMUpdateSDK == null) {
            mPMUpdateSDK = new PMUpdateSDK();
            Application application = (Application) context2;
            mPMUpdateSDK.mBase = application;
            mPMUpdateSDK.attachBaseContext(application);
            mPMUpdateSDK.onCreate();
        }
    }

    public void post(Runnable runnable) {
        HandlerUtils.post(this.mHandler, runnable);
    }

    public void postDelayed(Runnable runnable, long time) {
        HandlerUtils.postDelayed(this.mHandler, runnable, time);
    }

    public boolean hasPackage() {
        try {
            getPackageManager().getPackageInfo(g0.i, 0);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void openApp(Context context) {
        try {
            Intent intent = context.getPackageManager().getLaunchIntentForPackage(g0.i);
            if (intent != null) {
                intent.setFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
                context.startActivity(intent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void openGameDetail(Context context, String id) {
        try {
            ComponentName componentName = new ComponentName(g0.i, "com.vultark.lib.activity.SchemeActivity");
            Uri uri = Uri.parse("playmods:///game_detail?objId=" + id);
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setComponent(componentName);
            intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getRealPackageName() {
        if (this.isTest) {
            return "com.mkarpenko.worldbox";
        }
        return getPackageName();
    }

    public int getVersionCode() {
        if (this.isTest) {
            return 1;
        }
        return this.versionCode;
    }

    public String getVersionName() {
        if (this.isTest) {
            return "1";
        }
        return this.versionName;
    }

    public String getToken() {
        return "";
    }

    public String modsSign() {
        StringBuilder sb = new StringBuilder();
        Long timestamp = Long.valueOf(System.currentTimeMillis());
        String packageName = mPMUpdateSDK.getRealPackageName();
        String localSign = Base64.encodeToString(packageName.getBytes(StandardCharsets.UTF_8), 0).replace("\n", "");
        sb.append(timestamp);
        sb.append(".");
        sb.append(localSign);
        String md5Sign = MD5Util.string2MD5(sb.toString() + ".V6PjKqbBqvE3cRHVEdmrhhYwSM4MfAVJ");
        sb.append(".");
        sb.append(md5Sign);
        String modsSign = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 0).replace("\n", "");
        return modsSign;
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
