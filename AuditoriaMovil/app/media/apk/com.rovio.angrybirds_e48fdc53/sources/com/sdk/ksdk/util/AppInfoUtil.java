package com.sdk.ksdk.util;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
/* loaded from: classes3.dex */
public class AppInfoUtil {
    private static AppInfoUtil instance;
    private Activity currentActivity;
    private String packageName = "";
    private int versionCode = -1;
    private String versionName = "";
    private String appName = "";

    public static AppInfoUtil getInstance() {
        if (instance == null) {
            instance = new AppInfoUtil();
        }
        return instance;
    }

    public void init(Activity activity) {
        this.currentActivity = activity;
        getPackageInfo();
    }

    private void getPackageInfo() {
        PackageManager pm = this.currentActivity.getPackageManager();
        try {
            this.packageName = this.currentActivity.getPackageName();
            PackageInfo packageInfo = pm.getPackageInfo(this.currentActivity.getPackageName(), 0);
            this.versionName = packageInfo.versionName;
            this.versionCode = packageInfo.versionCode;
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            int labelRes = applicationInfo.labelRes;
            this.appName = this.currentActivity.getResources().getString(labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public String getAppName() {
        return this.appName;
    }
}
