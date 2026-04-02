package net.hockeyapp.android.utils;

import android.util.Log;
/* loaded from: classes4.dex */
public class HockeyLog {
    public static final String HOCKEY_TAG = "HockeyApp";
    private static int a = 6;

    public static int getLogLevel() {
        return a;
    }

    public static void setLogLevel(int i) {
        a = i;
    }

    public static void verbose(String str) {
        verbose((String) null, str);
    }

    public static void verbose(String str, String str2) {
        String a2 = a(str);
        if (a <= 2) {
            Log.v(a2, str2);
        }
    }

    public static void verbose(String str, Throwable th) {
        verbose(null, str, th);
    }

    public static void verbose(String str, String str2, Throwable th) {
        String a2 = a(str);
        if (a <= 2) {
            Log.v(a2, str2, th);
        }
    }

    public static void debug(String str) {
        debug((String) null, str);
    }

    public static void debug(String str, String str2) {
        String a2 = a(str);
        if (a <= 3) {
            Log.d(a2, str2);
        }
    }

    public static void debug(String str, Throwable th) {
        debug(null, str, th);
    }

    public static void debug(String str, String str2, Throwable th) {
        String a2 = a(str);
        if (a <= 3) {
            Log.d(a2, str2, th);
        }
    }

    public static void info(String str) {
        info((String) null, str);
    }

    public static void info(String str, String str2) {
        String a2 = a(str);
        if (a <= 4) {
            Log.i(a2, str2);
        }
    }

    public static void info(String str, Throwable th) {
        info(str, th);
    }

    public static void info(String str, String str2, Throwable th) {
        String a2 = a(str);
        if (a <= 4) {
            Log.i(a2, str2, th);
        }
    }

    public static void warn(String str) {
        warn((String) null, str);
    }

    public static void warn(String str, String str2) {
        String a2 = a(str);
        if (a <= 5) {
            Log.w(a2, str2);
        }
    }

    public static void warn(String str, Throwable th) {
        warn(null, str, th);
    }

    public static void warn(String str, String str2, Throwable th) {
        String a2 = a(str);
        if (a <= 5) {
            Log.w(a2, str2, th);
        }
    }

    public static void error(String str) {
        error((String) null, str);
    }

    public static void error(String str, String str2) {
        String a2 = a(str);
        if (a <= 6) {
            Log.e(a2, str2);
        }
    }

    public static void error(String str, Throwable th) {
        error(null, str, th);
    }

    public static void error(String str, String str2, Throwable th) {
        String a2 = a(str);
        if (a <= 6) {
            Log.e(a2, str2, th);
        }
    }

    static String a(String str) {
        if (str == null || str.length() == 0 || str.length() > 23) {
            return "HockeyApp";
        }
        return str;
    }
}
