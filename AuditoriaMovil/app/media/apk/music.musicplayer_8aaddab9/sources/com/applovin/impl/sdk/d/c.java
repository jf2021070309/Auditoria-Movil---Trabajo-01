package com.applovin.impl.sdk.d;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.v;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3976b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f3977c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final C0088c f3978d = new C0088c();

    /* loaded from: classes.dex */
    public static class a {
        private final m a;

        /* renamed from: b  reason: collision with root package name */
        private final JSONObject f3979b;

        private a(String str, String str2, String str3, m mVar) {
            JSONObject jSONObject = new JSONObject();
            this.f3979b = jSONObject;
            this.a = mVar;
            JsonUtils.putString(jSONObject, "pk", str);
            JsonUtils.putLong(jSONObject, "ts", System.currentTimeMillis());
            if (StringUtils.isValidString(str2)) {
                JsonUtils.putString(jSONObject, "sk1", str2);
            }
            if (StringUtils.isValidString(str3)) {
                JsonUtils.putString(jSONObject, "sk2", str3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() throws OutOfMemoryError {
            return this.f3979b.toString();
        }

        public void a(String str, long j2) {
            b(str, JsonUtils.getLong(this.f3979b, str, 0L) + j2);
        }

        public void a(String str, String str2) {
            JSONArray jSONArray = JsonUtils.getJSONArray(this.f3979b, str, new JSONArray());
            jSONArray.put(str2);
            JsonUtils.putJsonArray(this.f3979b, str, jSONArray);
        }

        public void b(String str, long j2) {
            JsonUtils.putLong(this.f3979b, str, j2);
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("AdEventStats{stats='");
            y.append(this.f3979b);
            y.append(CoreConstants.SINGLE_QUOTE_CHAR);
            y.append('}');
            return y.toString();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: b  reason: collision with root package name */
        private final AppLovinAdBase f3980b;

        /* renamed from: c  reason: collision with root package name */
        private final c f3981c;

        public b(AppLovinAdBase appLovinAdBase, c cVar) {
            this.f3980b = appLovinAdBase;
            this.f3981c = cVar;
        }

        public b a(com.applovin.impl.sdk.d.b bVar) {
            this.f3981c.a(bVar, 1L, this.f3980b);
            return this;
        }

        public b a(com.applovin.impl.sdk.d.b bVar, long j2) {
            this.f3981c.b(bVar, j2, this.f3980b);
            return this;
        }

        public b a(com.applovin.impl.sdk.d.b bVar, String str) {
            this.f3981c.a(bVar, str, this.f3980b);
            return this;
        }

        public void a() {
            this.f3981c.e();
        }
    }

    /* renamed from: com.applovin.impl.sdk.d.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0088c extends LinkedHashMap<String, a> {
        private C0088c() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, a> entry) {
            return size() > ((Integer) c.this.a.a(com.applovin.impl.sdk.c.b.eg)).intValue();
        }
    }

    public c(m mVar) {
        this.a = mVar;
        this.f3976b = mVar.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.d.b bVar, long j2, AppLovinAdBase appLovinAdBase) {
        if (appLovinAdBase == null || bVar == null || !((Boolean) this.a.a(com.applovin.impl.sdk.c.b.ed)).booleanValue()) {
            return;
        }
        synchronized (this.f3977c) {
            b(appLovinAdBase).a(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eh)).booleanValue() ? bVar.b() : bVar.a(), j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.d.b bVar, String str, AppLovinAdBase appLovinAdBase) {
        if (appLovinAdBase == null || bVar == null || !((Boolean) this.a.a(com.applovin.impl.sdk.c.b.ed)).booleanValue()) {
            return;
        }
        synchronized (this.f3978d) {
            b(appLovinAdBase).a(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eh)).booleanValue() ? bVar.b() : bVar.a(), str);
        }
    }

    private void a(JSONObject jSONObject) {
        u<Object> uVar = new u<Object>(com.applovin.impl.sdk.network.c.a(this.a).a(c()).c(d()).a(h.e(this.a)).b("POST").a(jSONObject).d(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eD)).booleanValue()).b(((Integer) this.a.a(com.applovin.impl.sdk.c.b.ee)).intValue()).a(((Integer) this.a.a(com.applovin.impl.sdk.c.b.ef)).intValue()).a(), this.a) { // from class: com.applovin.impl.sdk.d.c.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i2, String str, Object obj) {
                v vVar = c.this.f3976b;
                vVar.e("AdEventStatsManager", "Failed to submitted ad stats: " + i2);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(Object obj, int i2) {
                v vVar = c.this.f3976b;
                vVar.b("AdEventStatsManager", "Ad stats submitted: " + i2);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.aZ);
        uVar.b(com.applovin.impl.sdk.c.b.ba);
        this.a.S().a(uVar, o.a.BACKGROUND);
    }

    private a b(AppLovinAdBase appLovinAdBase) {
        a aVar;
        synchronized (this.f3977c) {
            String primaryKey = appLovinAdBase.getPrimaryKey();
            aVar = this.f3978d.get(primaryKey);
            if (aVar == null) {
                a aVar2 = new a(primaryKey, appLovinAdBase.getSecondaryKey1(), appLovinAdBase.getSecondaryKey2(), this.a);
                this.f3978d.put(primaryKey, aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.sdk.d.b bVar, long j2, AppLovinAdBase appLovinAdBase) {
        if (appLovinAdBase == null || bVar == null || !((Boolean) this.a.a(com.applovin.impl.sdk.c.b.ed)).booleanValue()) {
            return;
        }
        synchronized (this.f3977c) {
            b(appLovinAdBase).b(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eh)).booleanValue() ? bVar.b() : bVar.a(), j2);
        }
    }

    private String c() {
        return h.a("2.0/s", this.a);
    }

    private String d() {
        return h.b("2.0/s", this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.ed)).booleanValue()) {
            this.a.S().b().execute(new Runnable() { // from class: com.applovin.impl.sdk.d.c.2
                @Override // java.lang.Runnable
                public void run() {
                    HashSet hashSet;
                    synchronized (c.this.f3977c) {
                        hashSet = new HashSet(c.this.f3978d.size());
                        for (a aVar : c.this.f3978d.values()) {
                            try {
                                hashSet.add(aVar.a());
                            } catch (OutOfMemoryError e2) {
                                v vVar = c.this.f3976b;
                                vVar.b("AdEventStatsManager", "Failed to serialize " + aVar + " due to OOM error", e2);
                                c.this.b();
                            }
                        }
                    }
                    c.this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<HashSet>>) com.applovin.impl.sdk.c.d.v, (com.applovin.impl.sdk.c.d<HashSet>) hashSet);
                }
            });
        }
    }

    public b a(AppLovinAdBase appLovinAdBase) {
        return new b(appLovinAdBase, this);
    }

    public void a() {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.ed)).booleanValue()) {
            m mVar = this.a;
            com.applovin.impl.sdk.c.d<HashSet> dVar = com.applovin.impl.sdk.c.d.v;
            Set<String> set = (Set) mVar.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<HashSet>>) dVar, (com.applovin.impl.sdk.c.d<HashSet>) new HashSet(0));
            this.a.b(dVar);
            if (set == null || set.isEmpty()) {
                this.f3976b.b("AdEventStatsManager", "No serialized ad events found");
                return;
            }
            v vVar = this.f3976b;
            StringBuilder y = e.a.d.a.a.y("De-serializing ");
            y.append(set.size());
            y.append(" stat ad events");
            vVar.b("AdEventStatsManager", y.toString());
            JSONArray jSONArray = new JSONArray();
            for (String str : set) {
                try {
                    jSONArray.put(new JSONObject(str));
                } catch (JSONException e2) {
                    v vVar2 = this.f3976b;
                    vVar2.b("AdEventStatsManager", "Failed to parse: " + str, e2);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stats", jSONArray);
                a(jSONObject);
            } catch (JSONException e3) {
                this.f3976b.b("AdEventStatsManager", "Failed to create stats to submit", e3);
            }
        }
    }

    public void b() {
        synchronized (this.f3977c) {
            this.f3976b.b("AdEventStatsManager", "Clearing ad stats...");
            this.f3978d.clear();
        }
    }
}
