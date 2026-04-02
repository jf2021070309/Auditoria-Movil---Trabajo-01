package com.kwad.sdk.utils;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.kwad.sdk.service.ServiceProvider;
import java.util.Map;
import java.util.Set;
@Deprecated
/* loaded from: classes3.dex */
public class bb {
    static final String TAG = bb.class.getSimpleName();

    private static void a(SharedPreferences.Editor editor, String str, Object obj) {
        if (str != null) {
            if (obj instanceof Integer) {
                editor.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editor.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Set) {
                editor.putStringSet(str, (Set) obj);
            } else if (obj instanceof String) {
                editor.putString(str, String.valueOf(obj));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2, long j) {
        SharedPreferences fI = fI(str);
        if (fI == null) {
            return;
        }
        fI.edit().putLong(str2, j).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2, String str3, boolean z) {
        SharedPreferences fI = fI(str);
        if (fI == null) {
            return;
        }
        if (z && !com.kwad.sdk.core.a.c.cT(str3)) {
            str3 = com.kwad.sdk.core.a.c.cR(str3);
        }
        fI.edit().putString(str2, str3).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void a(String str, Map<String, T> map) {
        SharedPreferences fI = fI(str);
        if (fI == null) {
            return;
        }
        SharedPreferences.Editor edit = fI.edit();
        for (Map.Entry<String, T> entry : map.entrySet()) {
            try {
                a(edit, entry.getKey(), entry.getValue());
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.e(TAG, Log.getStackTraceString(th));
            }
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ao(String str, String str2) {
        SharedPreferences fI = fI(str);
        if (fI == null) {
            return;
        }
        fI.edit().remove(str2).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(String str, String str2, long j) {
        SharedPreferences fI = fI(str);
        return fI == null ? j : fI.getLong(str2, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str, String str2, int i) {
        SharedPreferences fI = fI(str);
        if (fI == null) {
            return;
        }
        fI.edit().putInt(str2, i).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(String str, String str2, int i) {
        SharedPreferences fI = fI(str);
        return fI == null ? i : fI.getInt(str2, i);
    }

    public static SharedPreferences fI(String str) {
        try {
            return ServiceProvider.HA().getSharedPreferences(str, 0);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(String str, String str2, String str3) {
        a(str, str2, str3, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j(String str, String str2, String str3) {
        String string;
        SharedPreferences fI = fI(str);
        return (fI == null || (string = fI.getString(str2, str3)) == null || TextUtils.isEmpty(string)) ? str3 : (TextUtils.equals(string, str3) || !com.kwad.sdk.core.a.c.cT(string)) ? string : com.kwad.sdk.core.a.c.cS(string);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(String str, String str2, String str3) {
        if (com.kwad.sdk.core.a.c.cT(str)) {
            return;
        }
        i(str2, str3, com.kwad.sdk.core.a.c.cR(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(String str, String str2, boolean z) {
        SharedPreferences fI = fI(str);
        if (fI == null) {
            return;
        }
        fI.edit().putBoolean(str2, z).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(String str, String str2, boolean z) {
        SharedPreferences fI = fI(str);
        return fI == null ? z : fI.getBoolean(str2, z);
    }
}
