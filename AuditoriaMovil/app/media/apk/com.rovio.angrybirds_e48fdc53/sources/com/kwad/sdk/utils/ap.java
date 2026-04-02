package com.kwad.sdk.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
/* loaded from: classes3.dex */
public final class ap {
    private static String aJi = "";
    private static volatile Boolean aJj;

    private static String IN() {
        return Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : "";
    }

    private static String IO() {
        try {
            Object b = s.b(Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()), "currentProcessName", new Object[0]);
            return b instanceof String ? (String) b : "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private static String cu(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return "";
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return "";
    }

    public static String getProcessName(Context context) {
        if (TextUtils.isEmpty(aJi)) {
            String IN = IN();
            aJi = IN;
            if (TextUtils.isEmpty(IN)) {
                String IO = IO();
                aJi = IO;
                if (TextUtils.isEmpty(IO)) {
                    String cu = cu(context);
                    aJi = cu;
                    return cu;
                }
                return aJi;
            }
            return aJi;
        }
        return aJi;
    }

    public static boolean isInMainProcess(Context context) {
        if (aJj == null) {
            String processName = getProcessName(context);
            aJj = Boolean.valueOf(!TextUtils.isEmpty(processName) && processName.equals(context.getPackageName()));
        }
        return aJj.booleanValue();
    }
}
