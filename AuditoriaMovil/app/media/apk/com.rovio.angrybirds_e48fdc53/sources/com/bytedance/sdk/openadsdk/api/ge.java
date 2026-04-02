package com.bytedance.sdk.openadsdk.api;

import android.util.Log;
/* loaded from: classes.dex */
public class ge {
    private static boolean dr = false;
    private static int ge = 4;

    public static void dr(int i) {
        ge = i;
    }

    public static void dr() {
        dr = true;
        dr(3);
    }

    public static void dr(String str, String str2) {
        if (dr && str2 != null && ge <= 2) {
            Log.v(str, str2);
        }
    }

    public static void ge(String str, String str2) {
        if (dr && str2 != null && ge <= 3) {
            Log.d(str, str2);
        }
    }

    public static void o(String str, String str2) {
        if (dr && str2 != null && ge <= 4) {
            Log.i(str, str2);
        }
    }

    public static void dr(String str) {
        if (!dr) {
            return;
        }
        g("TTLogger", str);
    }

    public static void g(String str, String str2) {
        if (dr && str2 != null && ge <= 5) {
            Log.w(str, str2);
        }
    }

    public static void dr(String str, String str2, Throwable th) {
        if (!dr) {
            return;
        }
        if ((str2 != null || th != null) && ge <= 5) {
            Log.w(str, str2, th);
        }
    }

    public static void dr(String str, Object... objArr) {
        if (dr && objArr != null && ge <= 5) {
            Log.v(str, dr(objArr));
        }
    }

    public static void q(String str, String str2) {
        if (dr && str2 != null && ge <= 6) {
            Log.e(str, str2);
        }
    }

    public static void ge(String str, String str2, Throwable th) {
        if (!dr) {
            return;
        }
        if ((str2 != null || th != null) && ge <= 6) {
            Log.e(str, str2, th);
        }
    }

    private static String dr(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
