package com.kwad.sdk.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
/* loaded from: classes3.dex */
public final class ba {
    public static boolean JA() {
        return y.m("ksadsdk_pref", "interstitial_aggregate_transfer", false);
    }

    public static boolean Jt() {
        return y.m("ksadsdk_pref", "config_data_transfer", false);
    }

    private static void Ju() {
        y.l("ksadsdk_pref", "config_data_transfer", true);
    }

    public static void Jv() {
        y.l("ksadsdk_pref", "splash_daily_transfer", true);
    }

    public static boolean Jw() {
        return y.m("ksadsdk_pref", "splash_daily_transfer", false);
    }

    public static void Jx() {
        y.l("ksadsdk_pref", "reward_auto_transfer", true);
    }

    public static boolean Jy() {
        return y.m("ksadsdk_pref", "reward_auto_transfer", false);
    }

    public static void Jz() {
        y.l("ksadsdk_pref", "interstitial_aggregate_transfer", true);
    }

    public static String as(Context context, String str) {
        if (context == null) {
            return "";
        }
        File file = new File(context.getFilesDir(), str);
        if (file.exists()) {
            try {
                String I = com.kwad.sdk.crash.utils.h.I(file);
                return TextUtils.isEmpty(I) ? "" : I;
            } catch (Throwable th) {
                return "";
            }
        }
        return "";
    }

    public static void i(final Context context, final String str, final String str2) {
        g.execute(new Runnable() { // from class: com.kwad.sdk.utils.ba.1
            @Override // java.lang.Runnable
            public final void run() {
                ba.j(context, str, str2);
            }
        });
    }

    public static void j(Context context, String str, String str2) {
        com.kwad.sdk.crash.utils.h.k(new File(context.getFilesDir(), str).getAbsolutePath(), str2, false);
        Ju();
    }
}
