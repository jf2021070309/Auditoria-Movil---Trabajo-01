package com.applovin.impl.mediation.debugger.b;

import android.os.Build;
import com.applovin.impl.mediation.c.c;
import com.applovin.impl.sdk.e.t;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.appevents.codeless.internal.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {
    private final b.c<JSONObject> a;

    public a(b.c<JSONObject> cVar, k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.a = cVar;
    }

    private JSONObject a(k kVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", c.a(kVar));
        } catch (JSONException e) {
            a("Failed to create mediation debugger request post body", e);
        }
        return jSONObject;
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", c.a(this.b));
        } catch (JSONException e) {
            a("Failed to construct JSON body", e);
        }
        return jSONObject;
    }

    protected Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.b.a(com.applovin.impl.sdk.c.b.en)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.b.x());
        }
        Map<String, Object> g = this.b.T().g();
        hashMap.put("package_name", String.valueOf(g.get("package_name")));
        hashMap.put("app_version", String.valueOf(g.get("app_version")));
        hashMap.put("platform", Constants.PLATFORM);
        hashMap.put("os", Build.VERSION.RELEASE);
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        t<JSONObject> tVar = new t<JSONObject>(com.applovin.impl.sdk.network.c.a(this.b).b("POST").a(com.applovin.impl.mediation.c.b.c(this.b)).c(com.applovin.impl.mediation.c.b.d(this.b)).a(a()).a(a(this.b)).a((c.a) new JSONObject()).b(((Long) this.b.a(com.applovin.impl.sdk.c.a.g)).intValue()).a(b()).a(), this.b, g()) { // from class: com.applovin.impl.mediation.debugger.b.a.1
            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                a.this.a.a(i, str, jSONObject);
            }

            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                a.this.a.a(jSONObject, i);
            }
        };
        tVar.a(com.applovin.impl.sdk.c.a.c);
        tVar.b(com.applovin.impl.sdk.c.a.d);
        this.b.Q().a(tVar);
    }
}
