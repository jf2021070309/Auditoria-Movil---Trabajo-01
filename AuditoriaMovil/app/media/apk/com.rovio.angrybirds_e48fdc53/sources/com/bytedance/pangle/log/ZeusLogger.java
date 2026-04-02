package com.bytedance.pangle.log;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.apm.ApmUtils;
import java.util.Arrays;
/* loaded from: classes.dex */
public class ZeusLogger {
    public static final String TAG = "Zeus_pangle";
    public static final String TAG_ACTIVITY = "Zeus/activity_pangle";
    public static final String TAG_DOWNLOAD = "Zeus/download_pangle";
    public static final String TAG_INIT = "Zeus/init_pangle";
    public static final String TAG_INSTALL = "Zeus/install_pangle";
    public static final String TAG_LOAD = "Zeus/load_pangle";
    public static final String TAG_PAM = "Zeus/pam_pangle";
    public static final String TAG_PPM = "Zeus/ppm_pangle";
    public static final String TAG_PROVIDER = "Zeus/provider_pangle";
    public static final String TAG_RECEIVER = "Zeus/receiver_pangle";
    public static final String TAG_REPORTER = "Zeus/reporter_pangle";
    public static final String TAG_RESOURCES = "Zeus/resources_pangle";
    public static final String TAG_SERVER = "Zeus/server_pangle";
    public static final String TAG_SERVICE = "Zeus/service_pangle";
    public static final String TAG_SO = "Zeus/so_pangle";
    private static boolean sDebug = true;
    private static boolean sEnableTrace = false;

    public static void setDebug(boolean z) {
        sDebug = z;
    }

    public static boolean isDebug() {
        return sDebug;
    }

    public static void setEnableTrace(boolean z) {
        sEnableTrace = z;
    }

    public static boolean isEnableTrace() {
        return sEnableTrace;
    }

    public static void v(String str) {
        v(null, str);
    }

    public static void v(String str, String str2) {
        String prefixTraceInfo = prefixTraceInfo(str2);
        if (sDebug) {
            Log.v(str, prefixTraceInfo);
        } else if (GlobalParam.getInstance().getLogger() != null) {
            GlobalParam.getInstance().getLogger().v(str, prefixTraceInfo);
        }
    }

    public static void d(String str) {
        d(null, str);
    }

    public static void d(String str, String str2) {
        i(str, str2);
    }

    public static void i(String str) {
        i(null, str);
    }

    public static void i(String str, String str2) {
        String prefixTraceInfo = prefixTraceInfo(str2);
        if (sDebug) {
            Log.i(str, prefixTraceInfo);
        } else if (GlobalParam.getInstance().getLogger() != null) {
            GlobalParam.getInstance().getLogger().i(str, prefixTraceInfo);
        }
    }

    public static void w(String str) {
        w(null, str);
    }

    public static void w(String str, String str2) {
        String prefixTraceInfo = prefixTraceInfo(str2);
        if (sDebug) {
            Log.w(str, prefixTraceInfo);
        } else if (GlobalParam.getInstance().getLogger() != null) {
            GlobalParam.getInstance().getLogger().w(str, prefixTraceInfo);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        String prefixTraceInfo = prefixTraceInfo(str2);
        if (sDebug) {
            Log.w(str, prefixTraceInfo, th);
        } else if (GlobalParam.getInstance().getLogger() != null) {
            GlobalParam.getInstance().getLogger().w(str, prefixTraceInfo, th);
        }
    }

    public static void errReport(String str, String str2) {
        RuntimeException runtimeException = new RuntimeException();
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, 1, stackTrace.length - 1));
        errReport(str, str2, runtimeException, false);
    }

    public static void errReport(String str, String str2, Throwable th) {
        errReport(str, str2, th, true);
    }

    private static void errReport(String str, String str2, Throwable th, boolean z) {
        if (sDebug) {
            Log.e(str, str2, z ? th : null);
        } else if (GlobalParam.getInstance().getLogger() != null) {
            GlobalParam.getInstance().getLogger().e(str, str2, z ? th : null);
        }
        ApmUtils.getApmInstance().reportError(str2, th);
    }

    private static String prefixTraceInfo(String str) {
        if (sEnableTrace) {
            return str + getTraceInfo();
        }
        return str;
    }

    private static String getTraceInfo() {
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            StackTraceElement stackTraceElement = null;
            int i = 1;
            while (true) {
                if (i >= stackTrace.length) {
                    break;
                } else if (TextUtils.equals(stackTrace[i].getClassName(), ZeusLogger.class.getName())) {
                    i++;
                } else {
                    stackTraceElement = stackTrace[i];
                    break;
                }
            }
            if (stackTraceElement == null) {
                return "\t\t[No Trace Info]";
            }
            return "\t\t[" + stackTraceElement.toString() + "]";
        } catch (Exception e) {
            e.printStackTrace();
            return "\t\t[No Trace Info]";
        }
    }
}
