package com.applovin.impl.sdk.a;

import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {
    private final k a;
    private final r b;
    private final Map<MaxAdFormat, f> d;
    private volatile boolean g;
    private LinkedHashSet<d> e = new LinkedHashSet<>();
    private final Object f = new Object();
    private final AtomicBoolean c = new AtomicBoolean();

    public e(k kVar) {
        this.a = kVar;
        this.b = kVar.z();
        HashMap hashMap = new HashMap(5);
        this.d = hashMap;
        hashMap.put(MaxAdFormat.BANNER, new f(MaxAdFormat.BANNER, kVar));
        this.d.put(MaxAdFormat.LEADER, new f(MaxAdFormat.LEADER, kVar));
        this.d.put(MaxAdFormat.MREC, new f(MaxAdFormat.MREC, kVar));
        this.d.put(MaxAdFormat.INTERSTITIAL, new f(MaxAdFormat.INTERSTITIAL, kVar));
        this.d.put(MaxAdFormat.REWARDED, new f(MaxAdFormat.REWARDED, kVar));
        this.d.put(MaxAdFormat.REWARDED_INTERSTITIAL, new f(MaxAdFormat.REWARDED_INTERSTITIAL, kVar));
    }

    private boolean a() {
        return ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eT)).booleanValue() && this.c.get();
    }

    private LinkedHashSet<d> c(JSONArray jSONArray) {
        LinkedHashSet<d> linkedHashSet = new LinkedHashSet<>(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            linkedHashSet.add(d.a(JsonUtils.getString(jSONObject, "id", null), jSONObject));
        }
        return linkedHashSet;
    }

    public void a(AppLovinAdBase appLovinAdBase, boolean z, boolean z2) {
        if (a()) {
            this.d.get(appLovinAdBase.getAdZone().b()).a(appLovinAdBase, z, z2);
        }
    }

    public void a(d dVar, boolean z, int i) {
        if (a()) {
            MaxAdFormat b = dVar.b();
            if (b != null) {
                this.d.get(b).a(dVar, z, i);
            } else {
                f.a(dVar, i, this.a);
            }
        }
    }

    public void a(g gVar) {
        if (a()) {
            this.d.get(gVar.getAdZone().b()).a();
        }
    }

    public void a(JSONArray jSONArray) {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eT)).booleanValue()) {
            if (this.c.compareAndSet(false, true)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
                    d a = d.a(JsonUtils.getString(jSONObject, "id", null), jSONObject);
                    MaxAdFormat b = a.b();
                    if (b == MaxAdFormat.BANNER) {
                        arrayList.add(a);
                    } else if (b == MaxAdFormat.LEADER) {
                        arrayList2.add(a);
                    } else if (b == MaxAdFormat.MREC) {
                        arrayList3.add(a);
                    } else if (b == MaxAdFormat.INTERSTITIAL) {
                        arrayList4.add(a);
                    } else if (b == MaxAdFormat.REWARDED_INTERSTITIAL) {
                        arrayList6.add(a);
                    } else if (b == MaxAdFormat.REWARDED) {
                        arrayList5.add(a);
                    }
                }
                this.d.get(MaxAdFormat.BANNER).a(arrayList);
                this.d.get(MaxAdFormat.LEADER).a(arrayList2);
                this.d.get(MaxAdFormat.MREC).a(arrayList3);
                this.d.get(MaxAdFormat.INTERSTITIAL).a(arrayList4);
                this.d.get(MaxAdFormat.REWARDED).a(arrayList5);
                this.d.get(MaxAdFormat.REWARDED_INTERSTITIAL).a(arrayList6);
            }
        }
    }

    public LinkedHashSet<d> b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new LinkedHashSet<>();
        }
        LinkedHashSet<d> linkedHashSet = new LinkedHashSet<>(jSONArray.length());
        synchronized (this.f) {
            if (!this.g) {
                r rVar = this.b;
                rVar.b("AdZoneManager", "Found " + jSONArray.length() + " zone(s)...");
                linkedHashSet = c(jSONArray);
                this.e = linkedHashSet;
                this.g = true;
            }
        }
        return linkedHashSet;
    }
}
