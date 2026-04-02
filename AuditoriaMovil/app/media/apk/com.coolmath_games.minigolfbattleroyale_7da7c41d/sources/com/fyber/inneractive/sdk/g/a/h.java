package com.fyber.inneractive.sdk.g.a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum h {
    Jpeg("image/jpeg"),
    Jpg("image/jpg"),
    Gif("image/gif"),
    Png("image/png");
    
    private static final Map<String, h> f = new HashMap();
    String e;

    static {
        h[] values;
        for (h hVar : values()) {
            f.put(hVar.e, hVar);
        }
    }

    h(String str) {
        this.e = str;
    }

    public static h a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f.get(str.toLowerCase());
    }
}
