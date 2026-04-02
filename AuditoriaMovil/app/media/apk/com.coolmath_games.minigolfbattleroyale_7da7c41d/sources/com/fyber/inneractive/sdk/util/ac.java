package com.fyber.inneractive.sdk.util;
/* loaded from: classes.dex */
public enum ac {
    UNKNOWN(""),
    ETHERNET("3g"),
    WIFI("wifi"),
    MOBILE_3G("3g"),
    MOBILE_4G("4g");
    
    public final String f;

    ac(String str) {
        this.f = str;
    }

    public static ac a() {
        int c = k.c();
        if (c != 0) {
            if (c == 1) {
                return WIFI;
            }
            if (c != 2 && c != 3 && c != 4 && c != 5) {
                if (c == 9) {
                    return ETHERNET;
                }
                return UNKNOWN;
            }
        }
        return k.d() == 13 ? MOBILE_4G : MOBILE_3G;
    }
}
