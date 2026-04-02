package com.facebook.ads.internal.f;

import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class b {
    private final String a;
    private final Map<String, String> b;
    private final String c;

    public b(String str, Map<String, String> map) {
        this(str, map, false);
    }

    public b(String str, Map<String, String> map, boolean z) {
        this.a = str;
        this.b = map;
        this.c = z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("stacktrace", this.a);
        hashMap.put("caught_exception", this.c);
        hashMap.putAll(this.b);
        return hashMap;
    }
}
