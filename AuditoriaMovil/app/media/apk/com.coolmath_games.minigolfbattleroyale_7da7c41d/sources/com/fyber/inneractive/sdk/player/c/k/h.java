package com.fyber.inneractive.sdk.player.c.k;
/* loaded from: classes.dex */
public final class h {
    public static boolean a(String str) {
        return "audio".equals(c(str));
    }

    public static boolean b(String str) {
        return "video".equals(c(str));
    }

    private static String c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Invalid mime type: " + str);
        }
        return str.substring(0, indexOf);
    }
}
