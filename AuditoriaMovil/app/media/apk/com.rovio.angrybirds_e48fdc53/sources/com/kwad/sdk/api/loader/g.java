package com.kwad.sdk.api.loader;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes.dex */
final class g {
    static String aiC = "autoRevert";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean D(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return false;
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            for (int i = 0; i < split.length && i < split2.length; i++) {
                try {
                    int parseInt = Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
                    if (parseInt > 0) {
                        return true;
                    }
                    if (parseInt < 0) {
                        return false;
                    }
                } catch (NumberFormatException e) {
                    return false;
                }
            }
            return split.length > split2.length;
        }
        return true;
    }

    public static String aA(Context context) {
        return getVersion(context, "curversion");
    }

    public static String aB(Context context) {
        return getVersion(context, "newversion");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String aC(Context context) {
        return getVersion(context, "apiversion");
    }

    private static void d(Context context, String str, String str2) {
        t.b(context, str, str2);
    }

    private static String getVersion(Context context, String str) {
        return t.c(context, str, "");
    }

    public static void j(Context context, String str) {
        d(context, "curversion", str);
    }

    public static void k(Context context, String str) {
        d(context, "newversion", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(Context context, String str) {
        d(context, "apiversion", str);
    }
}
