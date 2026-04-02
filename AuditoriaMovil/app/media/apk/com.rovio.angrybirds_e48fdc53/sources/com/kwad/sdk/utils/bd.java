package com.kwad.sdk.utils;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class bd {
    private static Class<?> aJJ;

    private static String fL(String str) {
        try {
            Runtime runtime = Runtime.getRuntime();
            return com.kwad.sdk.crash.utils.h.c(runtime.exec("getprop " + str).getInputStream());
        } catch (IOException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            return null;
        }
    }

    public static String get(String str) {
        Object j = j(MonitorConstants.CONNECT_TYPE_GET, str);
        return j instanceof String ? (String) j : fL(str);
    }

    private static Object j(String str, Object... objArr) {
        try {
            if (aJJ == null) {
                aJJ = Class.forName("android.os.SystemProperties");
            }
            return s.c(aJJ, str, objArr);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
            return null;
        }
    }
}
