package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public class o {
    private final String a = UUID.randomUUID().toString();
    private final String b;
    private final Map<String, Object> c;
    private final long d;

    public o(String str, Map<String, String> map, Map<String, Object> map2) {
        this.b = str;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.putAll(map);
        this.c.put("applovin_sdk_super_properties", map2);
        this.d = System.currentTimeMillis();
    }

    public String a() {
        return this.b;
    }

    public Map<String, Object> b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }

    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.d != oVar.d) {
            return false;
        }
        String str = this.b;
        if (str == null ? oVar.b == null : str.equals(oVar.b)) {
            Map<String, Object> map = this.c;
            if (map == null ? oVar.c == null : map.equals(oVar.c)) {
                String str2 = this.a;
                String str3 = oVar.a;
                if (str2 != null) {
                    if (str2.equals(str3)) {
                        return true;
                    }
                } else if (str3 == null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j = this.d;
        int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.a;
        return i + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.b + "', id='" + this.a + "', creationTimestampMillis=" + this.d + ", parameters=" + this.c + '}';
    }
}
