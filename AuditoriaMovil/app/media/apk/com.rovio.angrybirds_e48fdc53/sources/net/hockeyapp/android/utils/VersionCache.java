package net.hockeyapp.android.utils;

import android.content.Context;
import android.content.SharedPreferences;
import net.hockeyapp.android.UpdateFragment;
/* loaded from: classes4.dex */
public class VersionCache {
    private static String a = UpdateFragment.FRAGMENT_VERSION_INFO;

    public static void setVersionInfo(Context context, String str) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("HockeyApp", 0).edit();
            edit.putString(a, str);
            edit.apply();
        }
    }

    public static String getVersionInfo(Context context) {
        return context != null ? context.getSharedPreferences("HockeyApp", 0).getString(a, "[]") : "[]";
    }
}
