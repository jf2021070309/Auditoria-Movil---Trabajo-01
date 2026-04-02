package com.vungle.publisher;
/* loaded from: classes4.dex */
public enum x {
    fullscreen,
    flexview,
    flexfeed;

    public static x a(String str) {
        x[] values;
        if (str == null || str.equals(flexfeed.name())) {
            return fullscreen;
        }
        for (x xVar : values()) {
            if (xVar.toString().equals(str)) {
                return xVar;
            }
        }
        return fullscreen;
    }
}
