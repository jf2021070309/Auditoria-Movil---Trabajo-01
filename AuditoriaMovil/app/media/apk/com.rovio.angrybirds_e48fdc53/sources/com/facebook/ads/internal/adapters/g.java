package com.facebook.ads.internal.adapters;

import android.text.TextUtils;
import java.util.Locale;
/* loaded from: classes2.dex */
public enum g {
    UNKNOWN,
    AN,
    ADMOB,
    INMOBI,
    YAHOO;

    public static g a(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return (g) Enum.valueOf(g.class, str.toUpperCase(Locale.getDefault()));
        } catch (Exception e) {
            return UNKNOWN;
        }
    }
}
