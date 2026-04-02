package com.amazon.aps.iva.util;

import android.annotation.SuppressLint;
import android.util.Log;
@SuppressLint({"LongLogTag"})
/* loaded from: classes.dex */
public class LogUtils {
    public static String a = "NOT_AVAILABLE";
    public static LOG_LEVEL b = LOG_LEVEL.INFO;

    /* loaded from: classes.dex */
    public enum LOG_LEVEL {
        DEBUG(0),
        INFO(1),
        WARN(2),
        ERROR(3),
        FATAL(4);
        
        public int a;

        LOG_LEVEL(int i) {
            this.a = i;
        }

        public int getLogLevel() {
            return this.a;
        }
    }

    public static int d(String str, String str2) {
        if (b.getLogLevel() > LOG_LEVEL.DEBUG.getLogLevel()) {
            return -1;
        }
        return Log.d(String.format("[%s] [%s] [%s] ", "APS_IVA", a, str), str2);
    }

    public static int e(String str, String str2) {
        if (b.getLogLevel() > LOG_LEVEL.ERROR.getLogLevel()) {
            return -1;
        }
        if (Thread.currentThread().getStackTrace() != null && Thread.currentThread().getStackTrace().length > 3 && Thread.currentThread().getStackTrace()[3] != null) {
            return Log.e(String.format("[%s] [%s] [%s] ", "APS_IVA", a, str), String.format("[Line: %d] Message: %s ", Integer.valueOf(Thread.currentThread().getStackTrace()[3].getLineNumber()), str2));
        }
        return Log.e(String.format("[%s] [%s] [%s] ", "APS_IVA", a, str), str2);
    }

    public static int i(String str, String str2) {
        if (b.getLogLevel() > LOG_LEVEL.INFO.getLogLevel()) {
            return -1;
        }
        return Log.i(String.format("[%s] [%s] [%s] ", "APS_IVA", a, str), str2);
    }

    public static void setAppUUID(String str) {
        a = str;
    }

    public static void setLogLevel(LOG_LEVEL log_level) {
        b = log_level;
    }

    public static int w(String str, String str2) {
        if (b.getLogLevel() > LOG_LEVEL.WARN.getLogLevel()) {
            return -1;
        }
        return Log.w(String.format("[%s] [%s] [%s] ", "APS_IVA", a, str), str2);
    }

    public static int d(String str, String str2, Object... objArr) {
        if (b.getLogLevel() > LOG_LEVEL.DEBUG.getLogLevel()) {
            return -1;
        }
        return Log.d(String.format("[%s] [%s] [%s] ", "APS_IVA", a, str), String.format(str2, objArr));
    }

    public static int i(String str, String str2, Object... objArr) {
        if (b.getLogLevel() > LOG_LEVEL.INFO.getLogLevel()) {
            return -1;
        }
        return Log.i(String.format("[%s] [%s] [%s] ", "APS_IVA", a, str), String.format(str2, objArr));
    }

    public static int w(String str, String str2, Object... objArr) {
        if (b.getLogLevel() > LOG_LEVEL.WARN.getLogLevel()) {
            return -1;
        }
        return Log.w(String.format("[%s] [%s] [%s] ", "APS_IVA", a, str), String.format(str2, objArr));
    }

    public static int e(String str, String str2, Object... objArr) {
        if (b.getLogLevel() > LOG_LEVEL.ERROR.getLogLevel()) {
            return -1;
        }
        if (Thread.currentThread().getStackTrace() != null && Thread.currentThread().getStackTrace().length > 3 && Thread.currentThread().getStackTrace()[3] != null) {
            return Log.e(String.format("[%s] [%s] [%s] ", "APS_IVA", a, str), String.format("[Line: %s] Message: %s ", String.valueOf(Thread.currentThread().getStackTrace()[3].getLineNumber()), String.format(str2, objArr)));
        }
        return Log.e(String.format("[%s] [%s] [%s] ", "APS_IVA", a, str), String.format(str2, objArr));
    }
}
