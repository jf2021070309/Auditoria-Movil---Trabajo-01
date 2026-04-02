package com.bytedance.msdk.adapter.util;

import android.util.Log;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.m;
/* loaded from: classes.dex */
public class Logger {
    private static boolean a = false;
    private static int b = 4;
    static boolean c = true;

    private static String a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1);
    }

    private static boolean a() {
        return a.f().I();
    }

    public static void d(String str) {
        if (isDebug()) {
            d("Logger", str);
        }
    }

    public static void d(String str, String str2) {
        if (isDebug() && str2 != null && b <= 3) {
            Log.d(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (isDebug()) {
            if (!(str2 == null && th == null) && b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    public static void d_(String str) {
        if (a()) {
            d(str);
        }
    }

    public static void d_(String str, String str2) {
        if (a()) {
            d(str, str2);
        }
    }

    public static void e(String str) {
        if (isDebug()) {
            e("Logger", str);
        }
    }

    public static void e(String str, String str2) {
        if (isDebug() && str2 != null && b <= 6) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (isDebug()) {
            if (!(str2 == null && th == null) && b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    public static int getLogLevel() {
        return b;
    }

    public static void i(String str) {
        if (isDebug()) {
            i("Logger", str);
        }
    }

    public static void i(String str, String str2) {
        if (isDebug() && str2 != null && b <= 4) {
            Log.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (isDebug()) {
            if (!(str2 == null && th == null) && b <= 4) {
                Log.i(str, str2, th);
            }
        }
    }

    public static void iEventLog(String str, String str2) {
        if (c || str2 == null || b > 4) {
            return;
        }
        Log.i(str, str2);
    }

    public static boolean isDebug() {
        return m.a || a;
    }

    public static void openDebugMode() {
        a = true;
        setLogLevel(3);
    }

    public static void setLogLevel(int i) {
        b = i;
    }

    public static void st(String str, int i) {
        try {
            throw new Exception();
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (int i2 = 1; i2 < Math.min(i, stackTrace.length); i2++) {
                if (i2 > 1) {
                    sb.append("\n");
                }
                sb.append(a(stackTrace[i2].getClassName()));
                sb.append(".");
                sb.append(stackTrace[i2].getMethodName());
            }
            v(str, sb.toString());
        }
    }

    public static void v(String str) {
        v("Logger", str);
    }

    public static void v(String str, String str2) {
        if (isDebug() && str2 != null && b <= 2) {
            Log.v(str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (isDebug()) {
            if (!(str2 == null && th == null) && b <= 2) {
                Log.v(str, str2, th);
            }
        }
    }

    public static void w(String str) {
        if (isDebug()) {
            w("Logger", str);
        }
    }

    public static void w(String str, String str2) {
        if (isDebug() && str2 != null && b <= 5) {
            Log.w(str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (isDebug()) {
            if (!(str2 == null && th == null) && b <= 5) {
                Log.w(str, str2, th);
            }
        }
    }
}
