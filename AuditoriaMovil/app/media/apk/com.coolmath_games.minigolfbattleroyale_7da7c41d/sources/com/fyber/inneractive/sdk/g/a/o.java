package com.fyber.inneractive.sdk.g.a;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum o {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    UNKNOWN("unknown");
    
    private static final Map<String, o> f = new HashMap();
    final String e;

    static {
        o[] values;
        for (o oVar : values()) {
            f.put(oVar.e, oVar);
        }
    }

    o(String str) {
        this.e = str;
    }

    public static o a(String str) {
        return f.containsKey(str) ? f.get(str) : UNKNOWN;
    }
}
