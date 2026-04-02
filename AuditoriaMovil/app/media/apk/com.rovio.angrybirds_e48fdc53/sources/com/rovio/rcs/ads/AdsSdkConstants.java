package com.rovio.rcs.ads;
/* loaded from: classes4.dex */
public final class AdsSdkConstants {
    public static final Error ERROR_INTERNAL = new Error(-1, "internal error");
    public static final Error ERROR_INVALID_CONFIG = new Error(-2, "invalid config");
    public static final Error ERROR_NO_FILL = new Error(-3, "no fill");
    public static final Error ERROR_EXPIRED = new Error(-4, "expired");
    public static final Error ERROR_WATCHDOG = new Error(-5, "watchdog");
    public static final Error ERROR_LOADING_FAILED = new Error(-6, "loading failed");
    public static final Error ERROR_NO_SUCH_SDK = new Error(-7, "no such sdk");
    public static final Error ERROR_PARSE_ERROR = new Error(-8, "parse error");
    public static final Error ERROR_SHOW_FAILED = new Error(-9, "show failed");
    public static final Error ERROR_VAST_LOAD_FAILED = new Error(-10, "vast load failed");

    /* loaded from: classes4.dex */
    public static final class Error {
        private final int a;
        private final String b;

        Error(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public int code() {
            return this.a;
        }

        public String message() {
            return this.b;
        }
    }
}
