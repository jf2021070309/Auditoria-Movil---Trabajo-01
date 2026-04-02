package com.fakerandroid.boot;

import android.util.Log;
/* loaded from: classes2.dex */
public class Logger {
    private static final boolean DEBUG = true;
    private static final String TAG = "FakerAndroid";

    public static void log(String log) {
        Log.e(TAG, log);
    }
}
