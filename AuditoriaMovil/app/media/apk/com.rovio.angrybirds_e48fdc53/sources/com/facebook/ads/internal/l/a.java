package com.facebook.ads.internal.l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    private static a a;
    private final SharedPreferences b;

    public a(Context context) {
        this.b = context.getApplicationContext().getSharedPreferences("com.facebook.ads.FEATURE_CONFIG", 0);
    }

    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 14 && b("com.google.android.exoplayer2", "ExoPlayer") && s(context).a("adnw_enable_exoplayer", false);
    }

    public static boolean b(Context context) {
        return Build.VERSION.SDK_INT >= 18 && s(context).a("adnw_enable_debug_overlay", false);
    }

    private static boolean b(String str, String str2) {
        try {
            Class.forName(str + "." + str2);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static boolean c(Context context) {
        return s(context).a("adnw_block_lockscreen", false);
    }

    public static boolean d(Context context) {
        return s(context).a("adnw_android_memory_opt", false);
    }

    public static boolean e(Context context) {
        return s(context).a("adnw_android_disable_blur", false);
    }

    public static boolean f(Context context) {
        return Build.VERSION.SDK_INT >= 19 && s(context).a("adnw_enable_iab", false);
    }

    public static boolean g(Context context) {
        return s(context).a("adnw_debug_logging", false);
    }

    public static long h(Context context) {
        return s(context).a("unified_logging_immediate_delay_ms", 500L);
    }

    public static long i(Context context) {
        return s(context).a("unified_logging_dispatch_interval_seconds", 300) * 1000;
    }

    public static int j(Context context) {
        return s(context).a("unified_logging_event_limit", -1);
    }

    public static boolean k(Context context) {
        return s(context).a("video_and_endcard_autorotate", "autorotate_disabled").equals("autorotate_enabled");
    }

    public static int l(Context context) {
        return s(context).a("minimum_elapsed_time_after_impression", -1);
    }

    public static int m(Context context) {
        return s(context).a("stack_trace_sample_rate", 0);
    }

    public static boolean n(Context context) {
        return s(context).a("visible_area_check_enabled", false);
    }

    public static int o(Context context) {
        return s(context).a("visible_area_percentage", 50);
    }

    public static boolean p(Context context) {
        return s(context).a("adnw_measurement_method", false);
    }

    public static boolean q(Context context) {
        return s(context).a("adnw_top_activity_viewability", false);
    }

    public static boolean r(Context context) {
        return s(context).a("adnw_enhanced_viewability_area_check", false);
    }

    private static a s(Context context) {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a(context);
                }
            }
        }
        return a;
    }

    public int a(String str, int i) {
        String string = this.b.getString(str, String.valueOf(i));
        return (string == null || string.equals("null")) ? i : Integer.valueOf(string).intValue();
    }

    public long a(String str, long j) {
        String string = this.b.getString(str, String.valueOf(j));
        return (string == null || string.equals("null")) ? j : Long.valueOf(string).longValue();
    }

    public String a(String str, String str2) {
        String string = this.b.getString(str, str2);
        return (string == null || string.equals("null")) ? str2 : string;
    }

    public void a(String str) {
        if (str == null || str.isEmpty() || str.equals("[]")) {
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            edit.putString(next, jSONObject.getString(next));
        }
        edit.commit();
    }

    public boolean a(String str, boolean z) {
        String string = this.b.getString(str, String.valueOf(z));
        return (string == null || string.equals("null")) ? z : Boolean.valueOf(string).booleanValue();
    }
}
