package com.kwad.library.solder.lib;

import android.util.Log;
/* loaded from: classes.dex */
public final class a {
    public static void e(String str, String str2) {
        Log.e("Sodler", t(str, str2));
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e("Sodler", t(str, str2), th);
    }

    public static void e(String str, Throwable th) {
        Log.e("Sodler", t(str, ""), th);
    }

    private static String t(String str, String str2) {
        return "[" + str + "]: " + str2 + " " + vZ();
    }

    private static String vZ() {
        return "";
    }
}
