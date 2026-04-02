package com.sdk.ksdk.util;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
/* loaded from: classes3.dex */
public class ManifestUtil {
    private static ManifestUtil instance;
    private Activity activity;
    private Bundle bundle;
    private String signValue = "";
    private String isShowLog = "";
    private String kLogShow = "";

    public static ManifestUtil getInstance() {
        if (instance == null) {
            instance = new ManifestUtil();
        }
        return instance;
    }

    public void initManifest(Activity act) {
        this.activity = act;
        try {
            ApplicationInfo appInfo = act.getPackageManager().getApplicationInfo(act.getPackageName(), 128);
            if (appInfo != null && appInfo.metaData != null) {
                Bundle bundle = appInfo.metaData;
                this.bundle = bundle;
                if (bundle != null) {
                    this.signValue = bundle.getString("sign");
                    this.isShowLog = this.bundle.getString("signLog");
                    String string = this.bundle.getString("kLog");
                    this.kLogShow = string;
                    if (!TextUtils.isEmpty(string) && this.kLogShow.equals("open")) {
                        Logger.debug = true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Logger.i("NameNotFoundException");
        }
    }

    public String getSignValue() {
        return this.signValue;
    }

    public void ManifestLog(String message) {
        if (!TextUtils.isEmpty(this.isShowLog) && this.isShowLog.equals("open")) {
            Log.i(Var.TAG, message);
        }
    }

    public void getAppId() {
    }
}
