package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes.dex */
public class d0 {
    private static String a;

    private static String a() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String a(Context context) {
        if (TextUtils.isEmpty(a)) {
            String b = b();
            a = b;
            if (TextUtils.isEmpty(b)) {
                String a2 = a();
                a = a2;
                if (TextUtils.isEmpty(a2)) {
                    String b2 = b(context);
                    a = b2;
                    return b2;
                }
            }
        }
        return a;
    }

    private static String b() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return Application.getProcessName();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static String b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static boolean c(Context context) {
        try {
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                if (packageName.equalsIgnoreCase(a(context))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }
}
