package com.bytedance.sdk.openadsdk.mediation;

import android.util.Log;
/* loaded from: classes.dex */
public class LogManager {
    private static boolean a = false;
    private static String b = "MEDIATION_LOG";

    public static void i(String str) {
        if (a) {
            Log.i(b, str);
        }
    }

    public static void setDebug(Boolean bool) {
        a = bool.booleanValue();
    }
}
