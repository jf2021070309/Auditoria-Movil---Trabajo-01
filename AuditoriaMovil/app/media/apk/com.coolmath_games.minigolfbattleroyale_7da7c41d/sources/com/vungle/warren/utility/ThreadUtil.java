package com.vungle.warren.utility;

import android.os.Build;
import android.os.Looper;
/* loaded from: classes2.dex */
public class ThreadUtil {
    public static boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return mainLooper.isCurrentThread();
        }
        Looper myLooper = Looper.myLooper();
        return myLooper != null && mainLooper.getThread().equals(myLooper.getThread());
    }
}
