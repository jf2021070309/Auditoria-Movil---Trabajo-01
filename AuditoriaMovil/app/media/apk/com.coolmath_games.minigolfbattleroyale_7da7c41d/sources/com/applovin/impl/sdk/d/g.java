package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g {
    private final k a;
    private final Map<String, Long> b = new HashMap();

    public g(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = kVar;
    }

    private void e() {
        try {
            this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.o, (com.applovin.impl.sdk.c.d<String>) c().toString());
        } catch (Throwable th) {
            this.a.z().b("GlobalStatsManager", "Unable to save stats", th);
        }
    }

    public long a(f fVar) {
        return a(fVar, 1L);
    }

    long a(f fVar, long j) {
        long longValue;
        synchronized (this.b) {
            Long l = this.b.get(fVar.a());
            if (l == null) {
                l = 0L;
            }
            longValue = l.longValue() + j;
            this.b.put(fVar.a(), Long.valueOf(longValue));
        }
        e();
        return longValue;
    }

    public void a() {
        synchronized (this.b) {
            this.b.clear();
        }
        e();
    }

    public long b(f fVar) {
        long longValue;
        synchronized (this.b) {
            Long l = this.b.get(fVar.a());
            if (l == null) {
                l = 0L;
            }
            longValue = l.longValue();
        }
        return longValue;
    }

    public void b() {
        synchronized (this.b) {
            for (f fVar : f.b()) {
                this.b.remove(fVar.a());
            }
            e();
        }
    }

    public void b(f fVar, long j) {
        synchronized (this.b) {
            this.b.put(fVar.a(), Long.valueOf(j));
        }
        e();
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject;
        synchronized (this.b) {
            jSONObject = new JSONObject();
            for (Map.Entry<String, Long> entry : this.b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    public void c(f fVar) {
        synchronized (this.b) {
            this.b.remove(fVar.a());
        }
        e();
    }

    public void d() {
        try {
            JSONObject jSONObject = new JSONObject((String) this.a.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.o, (com.applovin.impl.sdk.c.d<String>) JsonUtils.EMPTY_JSON));
            synchronized (this.b) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.b.put(next, Long.valueOf(jSONObject.getLong(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            this.a.z().b("GlobalStatsManager", "Unable to load stats", th);
        }
    }
}
