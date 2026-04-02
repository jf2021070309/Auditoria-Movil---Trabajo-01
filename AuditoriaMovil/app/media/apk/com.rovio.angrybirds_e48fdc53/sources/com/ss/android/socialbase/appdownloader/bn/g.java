package com.ss.android.socialbase.appdownloader.bn;

import android.content.Context;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
/* loaded from: classes3.dex */
public class g {
    private static String dr;
    private static String g;
    private static String ge;
    private static String o;
    private static Boolean q;

    public static boolean dr(Context context) {
        return context != null && o(context) == 0 && q();
    }

    public static boolean ge(Context context) {
        return context != null && g(context) == 0 && bn();
    }

    public static String dr() {
        if (dr == null) {
            dr = dr("getApiVersion");
        }
        return dr;
    }

    public static String ge() {
        if (ge == null) {
            ge = dr("getVersion");
        }
        return ge;
    }

    public static String o() {
        if (o == null) {
            o = dr("getReleaseType");
        }
        return o;
    }

    public static String g() {
        if (g == null) {
            g = dr("getBuildVersion");
        }
        return g;
    }

    public static int o(Context context) {
        if (context == null) {
            return 1;
        }
        if (ge(ge(), dr())) {
            return Settings.Secure.getInt(context.getContentResolver(), "pure_mode_state", 1) == 0 ? 0 : 1;
        }
        return Settings.Secure.getInt(context.getContentResolver(), "pure_mode_state", 0);
    }

    public static int g(Context context) {
        if (context == null || Settings.Secure.getInt(context.getContentResolver(), "pure_enhanced_mode_state", 1) != 0) {
            return 1;
        }
        return 0;
    }

    public static boolean q() {
        if (q == null) {
            boolean z = false;
            q = false;
            try {
                if ("156".equals(dr("ro.config.hw_optb", AppEventsConstants.EVENT_PARAM_VALUE_NO)) && ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(dr("hw_mc.pure_mode.enable", "false"))) {
                    z = true;
                }
                q = Boolean.valueOf(z);
            } catch (Exception e) {
            }
        }
        return q.booleanValue();
    }

    public static boolean bn() {
        if (q() && ge(ge(), dr()) && dr(Process.myUid()) == 0) {
            return true;
        }
        return false;
    }

    public static String rb() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
        } catch (Throwable th) {
            return "";
        }
    }

    private static String dr(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.SystemPropertiesEx");
            return (String) cls.getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class, String.class).invoke(cls, str, "unknown");
        } catch (Throwable th) {
            return str2;
        }
    }

    private static int dr(int i) {
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.UserHandleEx");
            return ((Integer) cls.getMethod("getUserId", Integer.TYPE).invoke(cls, Integer.valueOf(i))).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return 1;
        }
    }

    private static String dr(String str) {
        try {
            Class<?> cls = Class.forName("ohos.system.version.SystemVersion");
            return cls.getMethod(str, new Class[0]).invoke(cls, new Object[0]).toString();
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean ge(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str.startsWith("3")) {
            return true;
        }
        return false;
    }
}
