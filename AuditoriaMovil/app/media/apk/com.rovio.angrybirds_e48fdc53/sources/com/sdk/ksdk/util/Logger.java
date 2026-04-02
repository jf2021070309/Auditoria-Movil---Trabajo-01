package com.sdk.ksdk.util;

import android.util.Log;
/* loaded from: classes3.dex */
public class Logger {
    public static boolean debug = false;

    public static void i(String message) {
        if (debug) {
            Log.i(Var.TAG, message);
        }
    }

    public static void i(String tag, String message) {
        if (debug) {
            Log.i(tag, message);
        }
    }
}
