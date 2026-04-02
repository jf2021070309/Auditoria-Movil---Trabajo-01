package com.applovin.impl.sdk;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public class q {
    private final String a = UUID.randomUUID().toString();

    /* renamed from: b  reason: collision with root package name */
    private final String f4272b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f4273c;

    /* renamed from: d  reason: collision with root package name */
    private final long f4274d;

    public q(String str, Map<String, String> map, Map<String, Object> map2) {
        this.f4272b = str;
        HashMap hashMap = new HashMap();
        this.f4273c = hashMap;
        hashMap.putAll(map);
        hashMap.put("applovin_sdk_super_properties", map2);
        this.f4274d = System.currentTimeMillis();
    }

    public String a() {
        return this.f4272b;
    }

    public Map<String, Object> b() {
        return this.f4273c;
    }

    public long c() {
        return this.f4274d;
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
        q qVar = (q) obj;
        if (this.f4274d != qVar.f4274d) {
            return false;
        }
        String str = this.f4272b;
        if (str == null ? qVar.f4272b == null : str.equals(qVar.f4272b)) {
            Map<String, Object> map = this.f4273c;
            if (map == null ? qVar.f4273c == null : map.equals(qVar.f4273c)) {
                String str2 = this.a;
                String str3 = qVar.a;
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
        String str = this.f4272b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.f4273c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j2 = this.f4274d;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.a;
        return i2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Event{name='");
        e.a.d.a.a.J(y, this.f4272b, CoreConstants.SINGLE_QUOTE_CHAR, ", id='");
        e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", creationTimestampMillis=");
        y.append(this.f4274d);
        y.append(", parameters=");
        y.append(this.f4273c);
        y.append('}');
        return y.toString();
    }
}
