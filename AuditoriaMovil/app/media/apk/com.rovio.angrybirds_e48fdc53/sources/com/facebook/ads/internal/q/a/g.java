package com.facebook.ads.internal.q.a;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
/* loaded from: classes2.dex */
public class g {
    public static boolean a(int i, int i2) {
        return i >= 640 && i2 >= 640;
    }

    public static boolean a(Context context) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            String str = runningTaskInfo.topActivity.getPackageName() + ".UnityPlayerActivity";
            Boolean valueOf = Boolean.valueOf(((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningTasks(2).get(0).topActivity.getClassName() == str || a(str));
            Log.d("IS_UNITY", Boolean.toString(valueOf.booleanValue()));
            return valueOf.booleanValue();
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }
}
