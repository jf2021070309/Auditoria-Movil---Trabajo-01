package com.google.android.datatransport.runtime.logging;

import android.util.Log;
import com.amazon.aps.iva.c80.a;
/* loaded from: classes2.dex */
public final class Logging {
    private static final String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
    }

    private static String concatTag(String str, String str2) {
        String f = a.f(str, str2);
        if (f.length() > 23) {
            return f.substring(0, 23);
        }
        return f;
    }

    public static void d(String str, String str2) {
        Log.isLoggable(getTag(str), 3);
    }

    public static void e(String str, String str2, Throwable th) {
        Log.isLoggable(getTag(str), 6);
    }

    private static String getTag(String str) {
        return com.amazon.aps.iva.oa.a.a(LOG_PREFIX, str);
    }

    public static void i(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 4)) {
            String.format(str2, obj);
        }
    }

    public static void w(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 5)) {
            String.format(str2, obj);
        }
    }

    public static void d(String str, String str2, Object obj) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, obj, obj2);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        if (Log.isLoggable(getTag(str), 3)) {
            String.format(str2, objArr);
        }
    }
}
