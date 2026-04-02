package com.kwad.sdk.utils;
/* loaded from: classes3.dex */
public final class i {
    public static void aj(String str, String str2) {
        com.kwad.sdk.core.e.c.d("callbackLog", str + str2);
    }

    public static void e(String str, String str2, String str3, String str4) {
        aj(str, str2 + "_" + str3 + "_" + str4);
    }

    public static void o(String str, int i) {
        com.kwad.sdk.core.e.c.d("audioVideoLog", str + "_type_" + i + "_time_" + System.currentTimeMillis());
    }
}
