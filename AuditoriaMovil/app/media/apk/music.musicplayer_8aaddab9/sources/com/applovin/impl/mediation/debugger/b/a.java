package com.applovin.impl.mediation.debugger.b;

import com.applovin.impl.mediation.c.c;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {
    private final b.c<JSONObject> a;

    public a(b.c<JSONObject> cVar, m mVar) {
        super("TaskFetchMediationDebuggerInfo", mVar, true);
        this.a = cVar;
    }

    private JSONObject a(m mVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", c.a(mVar));
        } catch (JSONException e2) {
            a("Failed to create mediation debugger request post body", e2);
        }
        return jSONObject;
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", c.a(this.f4020b));
        } catch (JSONException e2) {
            a("Failed to construct JSON body", e2);
        }
        return jSONObject;
    }

    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.et)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4020b.z());
        }
        Map<String, Object> h2 = this.f4020b.V().h();
        hashMap.put("package_name", String.valueOf(h2.get("package_name")));
        hashMap.put("app_version", String.valueOf(h2.get("app_version")));
        Map<String, Object> b2 = this.f4020b.V().b();
        hashMap.put("platform", String.valueOf(b2.get("platform")));
        hashMap.put("os", String.valueOf(b2.get("os")));
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f4020b).b("POST").a(com.applovin.impl.mediation.c.b.c(this.f4020b)).c(com.applovin.impl.mediation.c.b.d(this.f4020b)).a(a()).a(a(this.f4020b)).a((c.a) new JSONObject()).b(((Long) this.f4020b.a(com.applovin.impl.sdk.c.a.f3920g)).intValue()).a(b()).a(), this.f4020b, g()) { // from class: com.applovin.impl.mediation.debugger.b.a.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i2, String str, JSONObject jSONObject) {
                a.this.a.a(i2, str, jSONObject);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i2) {
                a.this.a.a(jSONObject, i2);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.a.f3916c);
        uVar.b(com.applovin.impl.sdk.c.a.f3917d);
        this.f4020b.S().a(uVar);
    }
}
