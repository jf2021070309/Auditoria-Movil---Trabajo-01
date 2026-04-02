package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.ac;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class h extends a {
    public final com.applovin.impl.sdk.ad.d a;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.network.i f4039c;

    public h(com.applovin.impl.sdk.ad.d dVar, com.applovin.impl.sdk.network.i iVar, String str, com.applovin.impl.sdk.m mVar) {
        super(str, mVar);
        this.a = dVar;
        this.f4039c = iVar;
    }

    private void a(com.applovin.impl.sdk.d.g gVar) {
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f3996c;
        long b2 = gVar.b(fVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b2 > TimeUnit.MINUTES.toMillis(((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.dm)).intValue())) {
            gVar.b(fVar, currentTimeMillis);
            gVar.c(com.applovin.impl.sdk.d.f.f3997d);
        }
    }

    private Map<String, String> i() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.a.a());
        if (this.a.c() != null) {
            hashMap.put("AppLovin-Ad-Size", this.a.c().getLabel());
        }
        if (this.a.d() != null) {
            hashMap.put("AppLovin-Ad-Type", this.a.d().getLabel());
        }
        return hashMap;
    }

    public abstract a a(JSONObject jSONObject);

    public Map<String, String> a() {
        HashMap hashMap = new HashMap(4);
        hashMap.put(AppLovinUtils.ServerParameterKeys.ZONE_ID, this.a.a());
        if (this.a.c() != null) {
            hashMap.put("size", this.a.c().getLabel());
        }
        if (this.a.d() != null) {
            hashMap.put("require", this.a.d().getLabel());
        }
        hashMap.put(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, String.valueOf(this.f4020b.af().a(this.a.a())));
        com.applovin.impl.sdk.network.i iVar = this.f4039c;
        if (iVar != null) {
            hashMap.putAll(BundleUtils.toStringMap(iVar.a()));
        }
        return hashMap;
    }

    public void a(int i2) {
        StringBuilder y = e.a.d.a.a.y("Unable to fetch ");
        y.append(this.a);
        y.append(" ad: server returned ");
        y.append(i2);
        d(y.toString());
        if (i2 == -800) {
            this.f4020b.T().a(com.applovin.impl.sdk.d.f.f4001h);
        }
    }

    public abstract String b();

    public void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.utils.h.d(jSONObject, this.f4020b);
        com.applovin.impl.sdk.utils.h.c(jSONObject, this.f4020b);
        com.applovin.impl.sdk.utils.h.e(jSONObject, this.f4020b);
        com.applovin.impl.sdk.ad.d.a(jSONObject);
        this.f4020b.S().a(a(jSONObject));
    }

    public abstract String c();

    public com.applovin.impl.sdk.ad.b h() {
        return this.a.e() ? com.applovin.impl.sdk.ad.b.APPLOVIN_PRIMARY_ZONE : com.applovin.impl.sdk.ad.b.APPLOVIN_CUSTOM_ZONE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.applovin.impl.sdk.network.c$a] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject;
        ?? r1;
        StringBuilder y = e.a.d.a.a.y("Fetching next ad of zone: ");
        y.append(this.a);
        a(y.toString());
        if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.dG)).booleanValue() && Utils.isVPNConnected()) {
            a("User is connected to a VPN");
        }
        com.applovin.impl.sdk.d.g T = this.f4020b.T();
        T.a(com.applovin.impl.sdk.d.f.a);
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f3996c;
        if (T.b(fVar) == 0) {
            T.b(fVar, System.currentTimeMillis());
        }
        JSONObject jSONObject2 = null;
        try {
            JSONObject andResetCustomPostBody = this.f4020b.u().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.dh)).booleanValue()) {
                jSONObject = new JSONObject(this.f4020b.V().a(a(), false, true));
                r1 = new HashMap();
                r1.put("rid", UUID.randomUUID().toString());
                if (!((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.et)).booleanValue()) {
                    r1.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4020b.z());
                }
                if (andResetCustomPostBody != null) {
                    JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                }
            } else {
                Map<String, String> stringifyObjectMap = Utils.stringifyObjectMap(this.f4020b.V().a(a(), false, false));
                if (andResetCustomPostBody != null) {
                    jSONObject2 = andResetCustomPostBody;
                } else {
                    str = "GET";
                }
                jSONObject = jSONObject2;
                r1 = stringifyObjectMap;
            }
            if (Utils.isDspDemoApp(f())) {
                r1.putAll(this.f4020b.u().getAndResetCustomQueryParams());
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(ac.b());
            hashMap.putAll(i());
            a(T);
            c.a e2 = com.applovin.impl.sdk.network.c.a(this.f4020b).a(b()).c(c()).a(r1).b(str).b(hashMap).a((c.a) new JSONObject()).a(((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.cV)).intValue()).a(((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.cW)).booleanValue()).b(((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.cX)).booleanValue()).b(((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.cU)).intValue()).e(true);
            if (jSONObject != null) {
                e2.a(jSONObject);
                e2.d(((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.eB)).booleanValue());
            }
            u<JSONObject> uVar = new u<JSONObject>(e2.a(), this.f4020b) { // from class: com.applovin.impl.sdk.e.h.1
                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(int i2, String str2, JSONObject jSONObject3) {
                    h.this.a(i2);
                }

                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject3, int i2) {
                    if (i2 != 200) {
                        h.this.a(i2);
                        return;
                    }
                    JsonUtils.putLong(jSONObject3, "ad_fetch_latency_millis", ((u) this).f4089d.a());
                    JsonUtils.putLong(jSONObject3, "ad_fetch_response_size", ((u) this).f4089d.b());
                    h.this.b(jSONObject3);
                }
            };
            uVar.a(com.applovin.impl.sdk.c.b.aX);
            uVar.b(com.applovin.impl.sdk.c.b.aY);
            this.f4020b.S().a(uVar);
        } catch (Throwable th) {
            StringBuilder y2 = e.a.d.a.a.y("Unable to fetch ad ");
            y2.append(this.a);
            a(y2.toString(), th);
            a(0);
        }
    }
}
