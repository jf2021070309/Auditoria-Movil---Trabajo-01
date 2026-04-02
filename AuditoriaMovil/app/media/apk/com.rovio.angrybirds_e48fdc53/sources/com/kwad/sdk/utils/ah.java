package com.kwad.sdk.utils;

import java.util.List;
/* loaded from: classes3.dex */
public final class ah {
    public static boolean J(List<?> list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    public static boolean K(List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean a(Object obj, Object obj2) {
        return obj != null && obj.equals(obj2);
    }

    public static void checkUiThread() {
        SystemUtil.checkUiThread();
    }
}
