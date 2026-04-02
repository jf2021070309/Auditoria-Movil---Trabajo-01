package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.a.f;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class j extends a {
    private final com.applovin.impl.sdk.a.d a;
    private final AppLovinAdLoadListener c;
    private final com.applovin.impl.sdk.network.i d;

    public j(com.applovin.impl.sdk.a.d dVar, com.applovin.impl.sdk.network.i iVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(dVar, iVar, appLovinAdLoadListener, "TaskFetchNextAd", kVar);
    }

    j(com.applovin.impl.sdk.a.d dVar, com.applovin.impl.sdk.network.i iVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.a = dVar;
        this.c = appLovinAdLoadListener;
        this.d = iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(com.applovin.impl.sdk.a.d dVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.k kVar) {
        this(dVar, null, appLovinAdLoadListener, str, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        d("Unable to fetch " + this.a + " ad: server returned " + i);
        if (i == -800) {
            this.b.R().a(com.applovin.impl.sdk.d.f.h);
        }
        this.b.Z().a(this.a, j(), i);
        this.c.failedToReceiveAd(i);
    }

    private void a(com.applovin.impl.sdk.d.g gVar) {
        long b = gVar.b(com.applovin.impl.sdk.d.f.c);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > TimeUnit.MINUTES.toMillis(((Integer) this.b.a(com.applovin.impl.sdk.c.b.dm)).intValue())) {
            gVar.b(com.applovin.impl.sdk.d.f.c, currentTimeMillis);
            gVar.c(com.applovin.impl.sdk.d.f.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        com.applovin.impl.sdk.utils.g.d(jSONObject, this.b);
        com.applovin.impl.sdk.utils.g.c(jSONObject, this.b);
        com.applovin.impl.sdk.utils.g.g(jSONObject, this.b);
        com.applovin.impl.sdk.utils.g.e(jSONObject, this.b);
        com.applovin.impl.sdk.a.d.a(jSONObject);
        f.a aVar = new f.a(this.a, this.c, this.b);
        aVar.a(j());
        this.b.Q().a(new p(jSONObject, this.a, b(), aVar, this.b));
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

    private boolean j() {
        return (this instanceof k) || (this instanceof i);
    }

    Map<String, String> a() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("zone_id", this.a.a());
        if (this.a.c() != null) {
            hashMap.put("size", this.a.c().getLabel());
        }
        if (this.a.d() != null) {
            hashMap.put("require", this.a.d().getLabel());
        }
        hashMap.put("n", String.valueOf(this.b.ae().a(this.a.a())));
        com.applovin.impl.sdk.network.i iVar = this.d;
        if (iVar != null) {
            hashMap.putAll(BundleUtils.toStringMap(iVar.a()));
        }
        return hashMap;
    }

    protected com.applovin.impl.sdk.a.b b() {
        return this.a.e() ? com.applovin.impl.sdk.a.b.APPLOVIN_PRIMARY_ZONE : com.applovin.impl.sdk.a.b.APPLOVIN_CUSTOM_ZONE;
    }

    protected String c() {
        return com.applovin.impl.sdk.utils.g.g(this.b);
    }

    protected String h() {
        return com.applovin.impl.sdk.utils.g.h(this.b);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject;
        String str;
        Map<String, String> stringifyObjectMap;
        a("Fetching next ad of zone: " + this.a);
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.dF)).booleanValue() && Utils.isVPNConnected()) {
            a("User is connected to a VPN");
        }
        com.applovin.impl.sdk.d.g R = this.b.R();
        R.a(com.applovin.impl.sdk.d.f.a);
        if (R.b(com.applovin.impl.sdk.d.f.c) == 0) {
            R.b(com.applovin.impl.sdk.d.f.c, System.currentTimeMillis());
        }
        try {
            if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.dh)).booleanValue()) {
                str = "POST";
                jSONObject = new JSONObject(this.b.T().a(a(), false, true));
                stringifyObjectMap = new HashMap<>();
                stringifyObjectMap.put("rid", UUID.randomUUID().toString());
                if (!((Boolean) this.b.a(com.applovin.impl.sdk.c.b.en)).booleanValue()) {
                    stringifyObjectMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.b.x());
                }
            } else {
                jSONObject = null;
                str = "GET";
                stringifyObjectMap = Utils.stringifyObjectMap(this.b.T().a(a(), false, false));
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(com.applovin.impl.sdk.y.b());
            hashMap.putAll(i());
            a(R);
            c.a e = com.applovin.impl.sdk.network.c.a(this.b).a(c()).a(stringifyObjectMap).c(h()).b(str).b(hashMap).a((c.a) new JSONObject()).a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.cV)).intValue()).a(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.cW)).booleanValue()).b(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.cX)).booleanValue()).b(((Integer) this.b.a(com.applovin.impl.sdk.c.b.cU)).intValue()).e(true);
            if (jSONObject != null) {
                e.a(jSONObject);
                e.d(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.ev)).booleanValue());
            }
            t<JSONObject> tVar = new t<JSONObject>(e.a(), this.b) { // from class: com.applovin.impl.sdk.e.j.1
                @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
                public void a(int i, String str2, JSONObject jSONObject2) {
                    j.this.a(i);
                }

                @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject2, int i) {
                    if (i != 200) {
                        j.this.a(i);
                        return;
                    }
                    JsonUtils.putLong(jSONObject2, "ad_fetch_latency_millis", this.d.a());
                    JsonUtils.putLong(jSONObject2, "ad_fetch_response_size", this.d.b());
                    j.this.a(jSONObject2);
                }
            };
            tVar.a(com.applovin.impl.sdk.c.b.aO);
            tVar.b(com.applovin.impl.sdk.c.b.aP);
            this.b.Q().a(tVar);
        } catch (Throwable th) {
            a("Unable to fetch ad " + this.a, th);
            a(0);
        }
    }
}
