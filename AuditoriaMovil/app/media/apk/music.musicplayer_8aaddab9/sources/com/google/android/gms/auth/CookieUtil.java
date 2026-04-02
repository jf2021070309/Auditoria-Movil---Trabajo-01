package com.google.android.gms.auth;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    public static String getCookieUrl(String str, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        String str2 = true != zza(bool) ? "http" : "https";
        return a.s(new StringBuilder(str2.length() + 3 + String.valueOf(str).length()), str2, "://", str);
    }

    public static String getCookieValue(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l2) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (zza(bool)) {
            sb.append(";HttpOnly");
        }
        if (zza(bool2)) {
            sb.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(";Domain=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(";Path=");
            sb.append(str4);
        }
        if (l2 != null && l2.longValue() > 0) {
            sb.append(";Max-Age=");
            sb.append(l2);
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append(";Priority=null");
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append(";SameSite=null");
        }
        if (zza(null)) {
            sb.append(";SameParty");
        }
        return sb.toString();
    }

    private static boolean zza(Boolean bool) {
        return bool != null && bool.booleanValue();
    }
}
