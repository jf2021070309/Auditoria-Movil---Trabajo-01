package com.ironsource.sdk.g;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class c {
    public String a;
    public String b;
    public Map<String, String> d;
    public com.ironsource.sdk.j.a g;
    public int c = -1;
    public int e = 0;
    public boolean f = false;

    public c(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.a aVar) {
        this.b = str;
        this.a = str2;
        this.d = map;
        this.g = aVar;
    }

    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.b);
        hashMap.put("demandSourceName", this.a);
        Map<String, String> map = this.d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final synchronized void a(int i) {
        this.e = i;
    }
}
