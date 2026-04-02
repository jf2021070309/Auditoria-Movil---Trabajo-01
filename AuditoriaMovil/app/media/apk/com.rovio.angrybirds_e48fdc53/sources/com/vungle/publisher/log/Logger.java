package com.vungle.publisher.log;

import android.text.TextUtils;
import android.util.Log;
/* loaded from: classes4.dex */
public class Logger {
    public static final String AD_TAG = "VungleAd";
    public static final String ASYNC_TAG = "VungleAsync";
    public static final String CONFIG_TAG = "VungleConfig";
    public static final String DATABASE_DUMP_TAG = "VungleDumpDatabase";
    public static final String DATABASE_TAG = "VungleDatabase";
    public static final String DATA_TAG = "VungleData";
    public static final String DEVICE_TAG = "VungleDevice";
    public static final String EVENT_TAG = "VungleEvent";
    public static final String FILE_TAG = "VungleFile";
    public static final String INJECT_TAG = "VungleInject";
    public static final String LOCATION_TAG = "VungleLocation";
    public static final String NETWORK_TAG = "VungleNetwork";
    public static final String PREPARE_TAG = "VunglePrepare";
    public static final String PROTOCOL_TAG = "VungleProtocol";
    public static final String REPORT_TAG = "VungleReport";
    public static final String VUNGLE_TAG = "Vungle";

    public static void v(String str, String str2) {
        a(2, str, str2);
    }

    public static void v(String str, Throwable th) {
        a(2, str, th);
    }

    public static void v(String str, String str2, Throwable th) {
        a(2, str, str2, th);
    }

    public static void d(String str, String str2) {
        a(3, str, str2);
    }

    public static void d(String str, Throwable th) {
        a(3, str, th);
    }

    public static void d(String str, String str2, Throwable th) {
        a(3, str, str2, th);
    }

    public static void i(String str, String str2) {
        a(4, str, str2);
    }

    public static void i(String str, Throwable th) {
        a(4, str, th);
    }

    public static void i(String str, String str2, Throwable th) {
        a(4, str, str2, th);
    }

    public static void w(String str, String str2) {
        a(5, str, str2);
    }

    public static void w(String str, Throwable th) {
        a(5, str, th);
    }

    public static void w(String str, String str2, Throwable th) {
        a(5, str, str2, th);
    }

    public static void e(String str, String str2) {
        a(6, str, str2);
    }

    public static void e(String str, Throwable th) {
        a(6, str, th);
    }

    public static void e(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    static void a(int i, String str, String str2) {
        a(i, str, str2, null);
    }

    static void a(int i, String str, Throwable th) {
        a(i, str, null, th);
    }

    static void a(int i, String str, String str2, Throwable th) {
        boolean a = a("VungleDebug", 3);
        if ((!a && i >= 5) || (a && isLoggable(i))) {
            boolean z = !TextUtils.isEmpty(str2);
            boolean z2 = th != null;
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append(str2);
            }
            if (z && z2) {
                sb.append("\n");
            }
            if (z2) {
                sb.append(Log.getStackTraceString(th));
            }
            Log.println(i, str, sb.toString());
        }
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(VUNGLE_TAG, i);
    }

    static boolean a(String str, int i) {
        return Log.isLoggable(str, i);
    }

    private Logger() {
    }
}
