package com.kwad.sdk.api.loader;

import android.os.Build;
import android.os.Process;
/* loaded from: classes.dex */
final class w {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean is64Bit() {
        if (Build.VERSION.SDK_INT >= 23) {
            return Process.is64Bit();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Boolean) Reflect.bY("dalvik.system.VMRuntime").cb("getRuntime").cb("is64Bit").get()).booleanValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static String wN() {
        return is64Bit() ? "arm64-v8a" : "armeabi-v7a";
    }
}
