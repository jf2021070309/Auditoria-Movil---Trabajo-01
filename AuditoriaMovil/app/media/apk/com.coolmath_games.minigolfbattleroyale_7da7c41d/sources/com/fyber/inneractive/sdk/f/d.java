package com.fyber.inneractive.sdk.f;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class d implements f {
    private Long a = null;
    private Long b = null;
    private Long c = null;
    private Long d = null;
    private Long e = null;
    private Long f = null;
    private Long g = null;

    @Override // com.fyber.inneractive.sdk.f.f
    public final boolean h() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.f.f
    public final Long a() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.a = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.f.f
    public final Long b() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.b = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.f.f
    public final Long c() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.c = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.f.f
    public final Long d() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.d = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.f.f
    public final Long e() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.e = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.f.f
    public final Long f() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.f.f
    public final Long g() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.g = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.f.f
    public final Map<String, Long> i() {
        HashMap hashMap = new HashMap();
        Long l = this.b;
        if (l != null && this.a != null) {
            hashMap.put("sdk_init_network_req", Long.valueOf(l.longValue() - this.a.longValue()));
        }
        Long l2 = this.c;
        if (l2 != null && this.b != null) {
            hashMap.put("sdk_got_server_res", Long.valueOf(l2.longValue() - this.b.longValue()));
        }
        Long l3 = this.d;
        if (l3 != null && this.c != null) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l3.longValue() - this.c.longValue()));
        }
        Long l4 = this.e;
        if (l4 != null && this.d != null) {
            hashMap.put("ad_loaded_result", Long.valueOf(l4.longValue() - this.d.longValue()));
        }
        Long l5 = this.f;
        if (l5 != null && this.e != null) {
            hashMap.put("publisher_notified", Long.valueOf(l5.longValue() - this.e.longValue()));
        }
        Long l6 = this.g;
        if (l6 != null && this.a != null) {
            hashMap.put("roundtrip", Long.valueOf(l6.longValue() - this.a.longValue()));
        }
        return hashMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MetricsCollectorData{");
        if (this.a != null && this.b != null) {
            sb.append(" sdk_init_network_req=");
            sb.append(this.b.longValue() - this.a.longValue());
        }
        if (this.c != null && this.b != null) {
            sb.append(", sdk_got_server_res=");
            sb.append(this.c.longValue() - this.b.longValue());
        }
        if (this.d != null && this.c != null) {
            sb.append(", sdk_parsed_res=");
            sb.append(this.d.longValue() - this.c.longValue());
        }
        if (this.e != null && this.d != null) {
            sb.append(", ad_loaded_result=");
            sb.append(this.e.longValue() - this.d.longValue());
        }
        if (this.f != null && this.e != null) {
            sb.append(", publisher_notified=");
            sb.append(this.f.longValue() - this.e.longValue());
        }
        if (this.g != null && this.a != null) {
            sb.append(", roundtrip=");
            sb.append(this.g.longValue() - this.a.longValue());
        }
        sb.append(" }");
        return sb.toString();
    }
}
