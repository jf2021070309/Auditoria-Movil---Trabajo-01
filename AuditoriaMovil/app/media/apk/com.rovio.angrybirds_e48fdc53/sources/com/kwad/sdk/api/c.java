package com.kwad.sdk.api;

import com.kwad.sdk.api.core.IKsAdSDK;
/* loaded from: classes.dex */
public final class c {
    private static IKsAdSDK ail;

    public static void a(IKsAdSDK iKsAdSDK) {
        ail = iKsAdSDK;
    }

    public static String bS(String str) {
        return (String) c("TRANSFORM_API_HOST", str);
    }

    public static <T> T c(String str, Object... objArr) {
        try {
            T t = (T) ail.dM(str, objArr);
            if (t != null) {
                return t;
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    public static IKsAdSDK yh() {
        return ail;
    }

    public static boolean yi() {
        Boolean bool = (Boolean) c("enableDynamic", new Object[0]);
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    public static int yj() {
        Integer num = (Integer) c("getAutoRevertTime", new Object[0]);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
