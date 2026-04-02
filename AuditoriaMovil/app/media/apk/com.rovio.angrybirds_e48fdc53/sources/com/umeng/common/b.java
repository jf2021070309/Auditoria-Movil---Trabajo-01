package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.as;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
/* compiled from: SPHelper.java */
/* loaded from: classes3.dex */
public final class b {
    private static Context b;
    private static String c;
    private static b a = null;
    private static final String d = as.b().b(as.m);

    /* compiled from: SPHelper.java */
    /* loaded from: classes3.dex */
    private static final class a {
        private static final b a = new b();

        private a() {
        }
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (b == null && context != null) {
                b = context.getApplicationContext();
            }
            if (b != null) {
                c = context.getPackageName();
            }
            bVar = a.a;
        }
        return bVar;
    }

    public void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = e().edit();
            edit.putString("au_p", str);
            edit.putString("au_u", str2);
            edit.commit();
        }
    }

    public String[] a() {
        SharedPreferences e = e();
        if (e != null) {
            String string = e.getString("au_p", null);
            String string2 = e.getString("au_u", null);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                return new String[]{string, string2};
            }
        }
        return null;
    }

    public void b() {
        SharedPreferences e = e();
        if (e != null) {
            e.edit().remove("au_p").remove("au_u").commit();
        }
    }

    public String c() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    public void a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    public void a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }

    public int d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    private SharedPreferences e() {
        Context context = b;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(d + c, 0);
    }

    public static String a(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null) {
            return "";
        }
        return sharedPreferences.getString(str2, "");
    }

    public static void a(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        if (context != null && (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) != null && (edit = sharedPreferences.edit()) != null) {
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    public static void a(Context context, String str) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(str, 0).edit();
        edit.remove(AnalyticsConfig.DEBUG_KEY);
        edit.remove(AnalyticsConfig.RTD_PERIOD);
        edit.remove(AnalyticsConfig.RTD_START_TIME);
        edit.clear();
        edit.commit();
    }
}
