package com.facebook.ads.internal.f;

import com.facebook.ads.internal.q.a.m;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class a extends d {
    public a(String str, String str2) {
        super(m.b(), m.c(), a(str, str2));
    }

    private static Map<String, String> a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("key", str);
        hashMap.put("value", str2);
        return hashMap;
    }

    @Override // com.facebook.ads.internal.f.d
    public String a() {
        return "client_response";
    }
}
