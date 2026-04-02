package com.me.game.pmadsdk.base;

import android.app.Application;
import android.os.Handler;
/* loaded from: classes6.dex */
public class BaseUtils {
    protected static Application mApplication;
    protected Handler mHandler = new Handler();
    protected String mAssetsLanguage = "pm_ad_sdk/language/%s.json";
    protected String mAssetsDrawable = "pm_ad_sdk/drawable/%s";

    public static void initApplication(Application application) {
        mApplication = application;
    }
}
