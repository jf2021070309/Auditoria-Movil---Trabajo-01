package com.kwad.sdk.core.config;

import android.text.TextUtils;
import java.net.URI;
/* loaded from: classes.dex */
public final class a {
    private static final String[] ako = {"gifshow.com", "kuaishou.com", "static.yximgs.com"};

    public static boolean bQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String host = new URI(str).getHost();
            if (cs(host)) {
                return true;
            }
            return ct(host);
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean cs(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : ako) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean ct(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : d.za()) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
