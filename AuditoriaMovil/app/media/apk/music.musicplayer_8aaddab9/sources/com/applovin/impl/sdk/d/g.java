package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Long> f4008b = new HashMap();

    public g(m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = mVar;
    }

    private void e() {
        try {
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.q, (com.applovin.impl.sdk.c.d<String>) c().toString());
        } catch (Throwable th) {
            this.a.B().b("GlobalStatsManager", "Unable to save stats", th);
        }
    }

    public long a(f fVar) {
        return a(fVar, 1L);
    }

    public long a(f fVar, long j2) {
        long longValue;
        synchronized (this.f4008b) {
            Long l2 = this.f4008b.get(fVar.a());
            if (l2 == null) {
                l2 = 0L;
            }
            longValue = l2.longValue() + j2;
            this.f4008b.put(fVar.a(), Long.valueOf(longValue));
        }
        e();
        return longValue;
    }

    public void a() {
        synchronized (this.f4008b) {
            this.f4008b.clear();
        }
        e();
    }

    public long b(f fVar) {
        long longValue;
        synchronized (this.f4008b) {
            Long l2 = this.f4008b.get(fVar.a());
            if (l2 == null) {
                l2 = 0L;
            }
            longValue = l2.longValue();
        }
        return longValue;
    }

    public void b() {
        synchronized (this.f4008b) {
            for (f fVar : f.b()) {
                this.f4008b.remove(fVar.a());
            }
            e();
        }
    }

    public void b(f fVar, long j2) {
        synchronized (this.f4008b) {
            this.f4008b.put(fVar.a(), Long.valueOf(j2));
        }
        e();
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject;
        synchronized (this.f4008b) {
            jSONObject = new JSONObject();
            for (Map.Entry<String, Long> entry : this.f4008b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    public void c(f fVar) {
        synchronized (this.f4008b) {
            this.f4008b.remove(fVar.a());
        }
        e();
    }

    public void d() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.a.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.q, (com.applovin.impl.sdk.c.d<String>) "{}"));
            synchronized (this.f4008b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.f4008b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.a.B().b("GlobalStatsManager", "Unable to load stats", th);
        }
    }
}
