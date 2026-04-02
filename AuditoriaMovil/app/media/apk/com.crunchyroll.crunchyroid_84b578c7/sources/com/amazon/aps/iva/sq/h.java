package com.amazon.aps.iva.sq;

import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import java.util.Locale;
/* compiled from: RumResourceKind.kt */
/* loaded from: classes2.dex */
public enum h {
    BEACON("beacon"),
    FETCH("fetch"),
    XHR("xhr"),
    DOCUMENT("document"),
    NATIVE("native"),
    UNKNOWN("unknown"),
    IMAGE("image"),
    JS("js"),
    FONT("font"),
    CSS("css"),
    MEDIA("media"),
    OTHER("other");
    
    public static final a Companion = new a();
    private final String value;

    /* compiled from: RumResourceKind.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static h a(String str) {
            j.f(str, "mimeType");
            String L0 = q.L0(str, '/');
            Locale locale = Locale.US;
            j.e(locale, "US");
            String lowerCase = L0.toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String lowerCase2 = q.L0(q.J0(str, '/'), ';').toLowerCase(locale);
            j.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (j.a(lowerCase, "image")) {
                return h.IMAGE;
            }
            if (!j.a(lowerCase, "video") && !j.a(lowerCase, "audio")) {
                if (j.a(lowerCase, "font")) {
                    return h.FONT;
                }
                if (j.a(lowerCase, "text") && j.a(lowerCase2, "css")) {
                    return h.CSS;
                }
                if (j.a(lowerCase, "text") && j.a(lowerCase2, "javascript")) {
                    return h.JS;
                }
                return h.NATIVE;
            }
            return h.MEDIA;
        }
    }

    h(String str) {
        this.value = str;
    }

    public static final h fromMimeType$dd_sdk_android_release(String str) {
        Companion.getClass();
        return a.a(str);
    }

    public final String getValue$dd_sdk_android_release() {
        return this.value;
    }
}
