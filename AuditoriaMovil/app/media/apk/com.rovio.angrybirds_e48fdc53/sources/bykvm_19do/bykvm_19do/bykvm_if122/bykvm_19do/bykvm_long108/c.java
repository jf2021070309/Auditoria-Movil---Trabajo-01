package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_long108;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
/* loaded from: classes.dex */
public class c {
    public static int a(Context context, String str) {
        if (str != null) {
            try {
                return context.checkPermission(str, Process.myPid(), Process.myUid());
            } catch (Throwable th) {
                th.printStackTrace();
                return Build.VERSION.SDK_INT >= 23 ? -1 : 0;
            }
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static void a(Activity activity, String[] strArr, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            activity.requestPermissions(strArr, i);
        }
    }
}
