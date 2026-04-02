package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a {
    public static String a() {
        String a = f.a();
        if (TextUtils.isEmpty(a)) {
            return "https://" + IAConfigManager.n.h.h;
        }
        return a(a, "Event");
    }

    public static String b() {
        String a = f.a();
        if (TextUtils.isEmpty(a)) {
            return "wv.inner-active.mobi/simpleM2M/";
        }
        return a + ".inner-active.mobi/simpleM2M/";
    }

    public static int c() {
        return IAConfigManager.n.h.d;
    }

    public static t a(String str) {
        if (IAConfigManager.n.c != null && IAConfigManager.n.c.containsKey(str)) {
            return IAConfigManager.n.c.get(str);
        }
        IAlog.c("Requested unit config doesn't exists - %s", str);
        return null;
    }

    public static s b(String str) {
        if (IAConfigManager.n.b == null || !IAConfigManager.n.b.containsKey(str)) {
            return null;
        }
        return IAConfigManager.n.b.get(str);
    }

    public static String a(String str, String str2) {
        if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            return "https://" + str + "/simpleM2M/" + str2;
        }
        return "https://" + str + ".inner-active.mobi/simpleM2M/" + str2;
    }
}
