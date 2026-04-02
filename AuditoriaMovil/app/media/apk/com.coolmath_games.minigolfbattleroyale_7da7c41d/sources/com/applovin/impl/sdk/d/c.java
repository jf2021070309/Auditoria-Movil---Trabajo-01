package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.t;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private final k a;
    private final r b;
    private final Object c = new Object();
    private final C0027c d = new C0027c();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        private final k a;
        private final JSONObject b;

        private a(String str, String str2, String str3, k kVar) {
            JSONObject jSONObject = new JSONObject();
            this.b = jSONObject;
            this.a = kVar;
            JsonUtils.putString(jSONObject, "pk", str);
            JsonUtils.putLong(this.b, "ts", System.currentTimeMillis());
            if (StringUtils.isValidString(str2)) {
                JsonUtils.putString(this.b, "sk1", str2);
            }
            if (StringUtils.isValidString(str3)) {
                JsonUtils.putString(this.b, "sk2", str3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() throws OutOfMemoryError {
            return this.b.toString();
        }

        void a(String str, long j) {
            b(str, JsonUtils.getLong(this.b, str, 0L) + j);
        }

        void a(String str, String str2) {
            JSONArray jSONArray = JsonUtils.getJSONArray(this.b, str, new JSONArray());
            jSONArray.put(str2);
            JsonUtils.putJsonArray(this.b, str, jSONArray);
        }

        void b(String str, long j) {
            JsonUtils.putLong(this.b, str, j);
        }

        public String toString() {
            return "AdEventStats{stats='" + this.b + "'}";
        }
    }

    /* loaded from: classes.dex */
    public class b {
        private final AppLovinAdBase b;
        private final c c;

        public b(AppLovinAdBase appLovinAdBase, c cVar) {
            this.b = appLovinAdBase;
            this.c = cVar;
        }

        public b a(com.applovin.impl.sdk.d.b bVar) {
            this.c.a(bVar, 1L, this.b);
            return this;
        }

        public b a(com.applovin.impl.sdk.d.b bVar, long j) {
            this.c.b(bVar, j, this.b);
            return this;
        }

        public b a(com.applovin.impl.sdk.d.b bVar, String str) {
            this.c.a(bVar, str, this.b);
            return this;
        }

        public void a() {
            this.c.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.sdk.d.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0027c extends LinkedHashMap<String, a> {
        private C0027c() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, a> entry) {
            return size() > ((Integer) c.this.a.a(com.applovin.impl.sdk.c.b.ea)).intValue();
        }
    }

    public c(k kVar) {
        this.a = kVar;
        this.b = kVar.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.d.b bVar, long j, AppLovinAdBase appLovinAdBase) {
        if (appLovinAdBase == null || bVar == null || !((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dX)).booleanValue()) {
            return;
        }
        synchronized (this.c) {
            b(appLovinAdBase).a(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eb)).booleanValue() ? bVar.b() : bVar.a(), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.d.b bVar, String str, AppLovinAdBase appLovinAdBase) {
        if (appLovinAdBase == null || bVar == null || !((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dX)).booleanValue()) {
            return;
        }
        synchronized (this.d) {
            b(appLovinAdBase).a(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eb)).booleanValue() ? bVar.b() : bVar.a(), str);
        }
    }

    private void a(JSONObject jSONObject) {
        t<Object> tVar = new t<Object>(com.applovin.impl.sdk.network.c.a(this.a).a(c()).c(d()).a(com.applovin.impl.sdk.utils.g.e(this.a)).b("POST").a(jSONObject).d(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.ex)).booleanValue()).b(((Integer) this.a.a(com.applovin.impl.sdk.c.b.dY)).intValue()).a(((Integer) this.a.a(com.applovin.impl.sdk.c.b.dZ)).intValue()).a(), this.a) { // from class: com.applovin.impl.sdk.d.c.1
            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, Object obj) {
                r rVar = c.this.b;
                rVar.e("AdEventStatsManager", "Failed to submitted ad stats: " + i);
            }

            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(Object obj, int i) {
                r rVar = c.this.b;
                rVar.b("AdEventStatsManager", "Ad stats submitted: " + i);
            }
        };
        tVar.a(com.applovin.impl.sdk.c.b.aQ);
        tVar.b(com.applovin.impl.sdk.c.b.aR);
        this.a.Q().a(tVar, o.a.BACKGROUND);
    }

    private a b(AppLovinAdBase appLovinAdBase) {
        a aVar;
        synchronized (this.c) {
            String primaryKey = appLovinAdBase.getPrimaryKey();
            aVar = this.d.get(primaryKey);
            if (aVar == null) {
                a aVar2 = new a(primaryKey, appLovinAdBase.getSecondaryKey1(), appLovinAdBase.getSecondaryKey2(), this.a);
                this.d.put(primaryKey, aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.sdk.d.b bVar, long j, AppLovinAdBase appLovinAdBase) {
        if (appLovinAdBase == null || bVar == null || !((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dX)).booleanValue()) {
            return;
        }
        synchronized (this.c) {
            b(appLovinAdBase).b(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eb)).booleanValue() ? bVar.b() : bVar.a(), j);
        }
    }

    private String c() {
        return com.applovin.impl.sdk.utils.g.a("2.0/s", this.a);
    }

    private String d() {
        return com.applovin.impl.sdk.utils.g.b("2.0/s", this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dX)).booleanValue()) {
            this.a.Q().b().execute(new Runnable() { // from class: com.applovin.impl.sdk.d.c.2
                @Override // java.lang.Runnable
                public void run() {
                    HashSet hashSet;
                    synchronized (c.this.c) {
                        hashSet = new HashSet(c.this.d.size());
                        for (a aVar : c.this.d.values()) {
                            try {
                                hashSet.add(aVar.a());
                            } catch (OutOfMemoryError e) {
                                r rVar = c.this.b;
                                rVar.b("AdEventStatsManager", "Failed to serialize " + aVar + " due to OOM error", e);
                                c.this.b();
                            }
                        }
                    }
                    c.this.a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<HashSet>>) com.applovin.impl.sdk.c.d.t, (com.applovin.impl.sdk.c.d<HashSet>) hashSet);
                }
            });
        }
    }

    public b a(AppLovinAdBase appLovinAdBase) {
        return new b(appLovinAdBase, this);
    }

    public void a() {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.dX)).booleanValue()) {
            Set<String> set = (Set) this.a.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<HashSet>>) com.applovin.impl.sdk.c.d.t, (com.applovin.impl.sdk.c.d<HashSet>) new HashSet(0));
            this.a.b(com.applovin.impl.sdk.c.d.t);
            if (set == null || set.isEmpty()) {
                this.b.b("AdEventStatsManager", "No serialized ad events found");
                return;
            }
            r rVar = this.b;
            rVar.b("AdEventStatsManager", "De-serializing " + set.size() + " stat ad events");
            JSONArray jSONArray = new JSONArray();
            for (String str : set) {
                try {
                    jSONArray.put(new JSONObject(str));
                } catch (JSONException e) {
                    r rVar2 = this.b;
                    rVar2.b("AdEventStatsManager", "Failed to parse: " + str, e);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stats", jSONArray);
                a(jSONObject);
            } catch (JSONException e2) {
                this.b.b("AdEventStatsManager", "Failed to create stats to submit", e2);
            }
        }
    }

    public void b() {
        synchronized (this.c) {
            this.b.b("AdEventStatsManager", "Clearing ad stats...");
            this.d.clear();
        }
    }
}
