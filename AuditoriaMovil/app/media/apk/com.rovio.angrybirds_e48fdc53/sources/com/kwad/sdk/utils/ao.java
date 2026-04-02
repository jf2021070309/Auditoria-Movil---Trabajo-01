package com.kwad.sdk.utils;

import android.text.TextUtils;
/* loaded from: classes3.dex */
public final class ao {
    private static void a(RuntimeException runtimeException) {
        com.kwad.sdk.core.e.c.printStackTrace(runtimeException);
    }

    public static String ar(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            a(new NullPointerException("Argument cannot be null " + str2));
        }
        return str;
    }

    public static void checkArgument(boolean z, Object obj) {
        if (z) {
            return;
        }
        a(new IllegalArgumentException("Expression cannot be false " + obj));
    }

    public static <T> T checkNotNull(T t) {
        return (T) h(t, "");
    }

    public static void e(Object... objArr) {
        for (int i = 0; i < 2; i++) {
            checkNotNull(objArr[i]);
        }
    }

    public static String fF(String str) {
        return ar(str, "");
    }

    public static <T> T h(T t, String str) {
        if (t == null) {
            a(new NullPointerException("Argument cannot be null " + str));
        }
        return t;
    }
}
