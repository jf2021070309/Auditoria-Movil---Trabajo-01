package com.kwad.sdk.utils;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* loaded from: classes3.dex */
public final class bc {
    private static final SimpleDateFormat aJC = new SimpleDateFormat("MM/dd", Locale.US);
    private static final SimpleDateFormat aJD = new SimpleDateFormat("yyyy/MM/dd", Locale.US);
    private static final SimpleDateFormat aJE = new SimpleDateFormat("MM月dd日", Locale.US);
    private static final SimpleDateFormat aJF = new SimpleDateFormat("yyyy年MM月dd日", Locale.US);
    private static final SimpleDateFormat aJG = new SimpleDateFormat("HH:mm", Locale.US);
    private static final SimpleDateFormat aJH = new SimpleDateFormat("MM-dd", Locale.US);
    private static final SimpleDateFormat aJI = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public static boolean fJ(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean fK(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches(".*\\.kpg.*");
    }

    public static boolean isEquals(String str, String str2) {
        return !TextUtils.isEmpty(str) && str.equals(str2);
    }

    public static boolean isNullString(String str) {
        return TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str);
    }
}
