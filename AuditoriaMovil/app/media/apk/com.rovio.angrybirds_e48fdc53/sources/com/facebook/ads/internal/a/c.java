package com.facebook.ads.internal.a;

import android.text.TextUtils;
import java.util.Locale;
/* loaded from: classes2.dex */
public enum c {
    NONE,
    INSTALLED,
    NOT_INSTALLED;

    public static c a(String str) {
        if (TextUtils.isEmpty(str)) {
            return NONE;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException e) {
            return NONE;
        }
    }
}
