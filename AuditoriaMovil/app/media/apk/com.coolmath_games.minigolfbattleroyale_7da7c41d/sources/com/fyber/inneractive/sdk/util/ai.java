package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class ai {
    public static String a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(z ? "?" : "&");
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(Uri.encode(entry.getValue()));
            z = false;
        }
        return sb.toString();
    }
}
