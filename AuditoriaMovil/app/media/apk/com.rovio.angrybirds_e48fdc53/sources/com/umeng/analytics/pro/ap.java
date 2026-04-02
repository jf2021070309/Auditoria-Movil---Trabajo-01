package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: SpWrapper.java */
/* loaded from: classes3.dex */
public class ap {
    public static final String a = "cl_count";
    public static final String b = "interval_";
    public static final String c = "config_ts";
    public static final String d = "iucc_s1";
    public static final String e = "iucc_s2";
    private static final String f = "ccg_sp_config_file";

    private ap() {
    }

    public static SharedPreferences a(Context context) {
        if (context != null) {
            try {
                return context.getSharedPreferences(f, 0);
            } catch (Throwable th) {
                return null;
            }
        }
        return null;
    }
}
