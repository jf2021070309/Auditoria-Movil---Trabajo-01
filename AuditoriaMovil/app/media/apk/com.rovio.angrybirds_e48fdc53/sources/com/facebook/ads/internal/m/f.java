package com.facebook.ads.internal.m;
/* loaded from: classes2.dex */
public enum f {
    TEST("test"),
    BROWSER_SESSION("browser_session"),
    CLOSE("close"),
    IMPRESSION("impression"),
    INVALIDATION("invalidation"),
    STORE("store"),
    OFF_TARGET_CLICK("off_target_click"),
    OPEN_LINK("open_link"),
    NATIVE_VIEW("native_view"),
    VIDEO("video");
    
    private String k;

    f(String str) {
        this.k = str;
    }

    public static f a(String str) {
        f[] values;
        for (f fVar : values()) {
            if (fVar.k.equalsIgnoreCase(str)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.k;
    }
}
