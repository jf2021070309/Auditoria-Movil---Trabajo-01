package com.kwad.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes3.dex */
public final class bg {
    public static void a(long j, int i, Context context) {
        if (j == 0 || context == null || i <= 0 || i > 100) {
            return;
        }
        long currentTimeMillis = j - System.currentTimeMillis();
        SharedPreferences sharedPreferences = context.getSharedPreferences("ksadsdk_pref", 0);
        if (sharedPreferences == null) {
            return;
        }
        (Math.abs(currentTimeMillis) / 3600000 > ((long) i) ? sharedPreferences.edit().putLong("key_time_diff_s2c", currentTimeMillis) : sharedPreferences.edit().remove("key_time_diff_s2c")).apply();
    }

    public static long v(Context context, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("ksadsdk_pref", 0);
                if (sharedPreferences == null) {
                    return Math.abs(currentTimeMillis);
                }
                long j = sharedPreferences.getLong("key_time_diff_s2c", 0L);
                if (j != 0) {
                    return currentTimeMillis + j;
                }
            }
            return Math.abs(currentTimeMillis);
        }
        return currentTimeMillis;
    }
}
