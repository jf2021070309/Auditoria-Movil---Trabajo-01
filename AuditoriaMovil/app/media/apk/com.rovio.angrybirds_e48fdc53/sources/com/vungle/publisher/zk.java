package com.vungle.publisher;

import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.facebook.internal.ServerProtocol;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes4.dex */
public final class zk {
    private static final char[] a = "0123456789abcdef".toCharArray();

    public static boolean a(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    public static <T> String a(T... tArr) {
        return a(", ", tArr);
    }

    public static String a(Iterable<?> iterable) {
        return a(", ", iterable);
    }

    public static <T> String a(String str, T... tArr) {
        return a(str, tArr == null ? null : Arrays.asList(tArr));
    }

    public static String a(String str, Iterable<?> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : iterable) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    public static String a(Enum<?> r1) {
        if (r1 == null) {
            return null;
        }
        return r1.name();
    }

    public static String b(Object[] objArr) {
        return "[" + a(objArr) + "]";
    }

    public static Uri b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("input text cannot be null");
        }
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            throw new IllegalArgumentException("invalid url parameter: " + str);
        }
    }

    public static Uri a(String str, String str2) {
        return str == null ? b(str2) : b(str);
    }

    public static boolean c(String str) {
        if (ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(str)) {
            return true;
        }
        if ("false".equals(str)) {
            return false;
        }
        throw new IllegalArgumentException("invalid boolean parameter: " + str);
    }

    public static String d(String str) {
        if (str != null) {
            try {
                return new String(Base64.decode(str, 0));
            } catch (Exception e) {
                throw new IllegalArgumentException("error decoding base64 string: " + str);
            }
        }
        return str;
    }

    public static Set<String> a(Uri uri) {
        HashSet hashSet = new HashSet();
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                return uri.getQueryParameterNames();
            }
            String query = uri.getQuery();
            if (query != null) {
                for (String str : query.split("&")) {
                    hashSet.add(str.split("=")[0]);
                }
                return hashSet;
            }
            return hashSet;
        } catch (Exception e) {
            throw new IllegalArgumentException("error getting query param names");
        }
    }

    public static ry e(String str) {
        if ("portrait".equals(str)) {
            return ry.PORTRAIT;
        }
        if ("landscape".equals(str)) {
            return ry.LANDSCAPE;
        }
        if ("none".equals(str)) {
            return ry.NONE;
        }
        throw new IllegalArgumentException("invalid orientation: " + str);
    }

    public static boolean f(String str) {
        return str == null || str.length() <= 0;
    }
}
