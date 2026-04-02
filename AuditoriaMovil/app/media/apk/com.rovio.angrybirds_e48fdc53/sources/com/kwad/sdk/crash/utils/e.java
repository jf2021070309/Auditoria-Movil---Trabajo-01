package com.kwad.sdk.crash.utils;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class e {
    private static Context PK;

    public static long Cl() {
        long bg = bg(PK);
        b(PK, 1 + bg);
        return bg;
    }

    private static boolean b(Context context, long j) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("ksadsdk_crashseq", 0).edit();
            edit.putLong("crashseq", j);
            return edit.commit();
        }
        return false;
    }

    private static long bg(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getSharedPreferences("ksadsdk_crashseq", 0)) == null) {
            return 0L;
        }
        return sharedPreferences.getLong("crashseq", 1L);
    }

    public static void init(Context context) {
        PK = context;
    }
}
