package com.rovio.rcs.socialnetwork;
/* loaded from: classes4.dex */
public class SocialServiceUtils {
    private SocialServiceUtils() {
        throw new AssertionError();
    }

    /* loaded from: classes4.dex */
    public static class Log {
        private static LogLevel mLogLevel = LogLevel.ERROR;

        /* loaded from: classes4.dex */
        public enum LogLevel {
            NO_LOGGING,
            ERROR,
            INFO,
            DEBUG
        }

        public static LogLevel getLogLevel() {
            return mLogLevel;
        }

        public static void setLogLevel(LogLevel logLevel) {
            mLogLevel = logLevel;
        }

        public static void writeLine(String str, String str2, LogLevel logLevel) {
            if (logLevel.ordinal() <= mLogLevel.ordinal()) {
                android.util.Log.d(str, str2);
            }
        }

        public static void writeLine(String str, String str2) {
            writeLine(str, str2, LogLevel.DEBUG);
        }
    }
}
