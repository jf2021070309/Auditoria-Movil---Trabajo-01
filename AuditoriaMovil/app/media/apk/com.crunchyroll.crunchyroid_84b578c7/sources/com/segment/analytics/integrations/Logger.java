package com.segment.analytics.integrations;

import com.amazon.aps.iva.oa.a;
import com.segment.analytics.Analytics;
/* loaded from: classes4.dex */
public final class Logger {
    private static final String DEFAULT_TAG = "Analytics";
    public final Analytics.LogLevel logLevel;
    private final String tag;

    public Logger(String str, Analytics.LogLevel logLevel) {
        this.tag = str;
        this.logLevel = logLevel;
    }

    private boolean shouldLog(Analytics.LogLevel logLevel) {
        if (this.logLevel.ordinal() >= logLevel.ordinal()) {
            return true;
        }
        return false;
    }

    public static Logger with(Analytics.LogLevel logLevel) {
        return new Logger(DEFAULT_TAG, logLevel);
    }

    public void debug(String str, Object... objArr) {
        if (shouldLog(Analytics.LogLevel.DEBUG)) {
            String.format(str, objArr);
        }
    }

    public void error(Throwable th, String str, Object... objArr) {
        if (shouldLog(Analytics.LogLevel.INFO)) {
            String.format(str, objArr);
        }
    }

    public void info(String str, Object... objArr) {
        if (shouldLog(Analytics.LogLevel.INFO)) {
            String.format(str, objArr);
        }
    }

    public Logger subLog(String str) {
        return new Logger(a.a("Analytics-", str), this.logLevel);
    }

    public void verbose(String str, Object... objArr) {
        if (shouldLog(Analytics.LogLevel.VERBOSE)) {
            String.format(str, objArr);
        }
    }
}
