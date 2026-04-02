package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b extends a {
    public b(com.applovin.impl.sdk.m mVar) {
        super("TaskApiSubmitData", mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            JSONObject a = com.applovin.impl.sdk.utils.h.a(jSONObject);
            this.f4020b.K().a(com.applovin.impl.sdk.c.b.ad, a.getString("device_id"));
            this.f4020b.K().a(com.applovin.impl.sdk.c.b.af, a.getString("device_token"));
            this.f4020b.K().a(com.applovin.impl.sdk.c.b.ag, Long.valueOf(a.getLong("publisher_id")));
            this.f4020b.K().a();
            com.applovin.impl.sdk.utils.h.d(a, this.f4020b);
            com.applovin.impl.sdk.utils.h.e(a, this.f4020b);
            String string = JsonUtils.getString(a, "latest_version", "");
            if (!TextUtils.isEmpty(string)) {
                String str = AppLovinSdk.VERSION;
                if (!str.equals(string)) {
                    String str2 = "Current SDK version (" + str + ") is outdated. Please integrate the latest version of the AppLovin SDK (" + string + "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.";
                    if (JsonUtils.valueExists(a, "sdk_update_message")) {
                        str2 = JsonUtils.getString(a, "sdk_update_message", str2);
                    }
                    com.applovin.impl.sdk.v.h("AppLovinSdk", str2);
                }
            }
            this.f4020b.T().b();
        } catch (Throwable th) {
            a("Unable to parse API response", th);
        }
    }

    private void b(JSONObject jSONObject) throws JSONException {
        com.applovin.impl.sdk.o V = this.f4020b.V();
        Map<String, Object> d2 = V.d();
        Utils.renameKeyInObjectMap("platform", "type", d2);
        Utils.renameKeyInObjectMap("api_level", "sdk_version", d2);
        jSONObject.put("device_info", new JSONObject(d2));
        Map<String, Object> h2 = V.h();
        Utils.renameKeyInObjectMap("sdk_version", "applovin_sdk_version", h2);
        Utils.renameKeyInObjectMap("ia", "installed_at", h2);
        jSONObject.put("app_info", new JSONObject(h2));
    }

    private void c(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.ec)).booleanValue()) {
            jSONObject.put("stats", this.f4020b.T().c());
        }
        if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.an)).booleanValue()) {
            JSONObject b2 = com.applovin.impl.sdk.network.e.b(f());
            if (b2.length() > 0) {
                jSONObject.put("network_response_codes", b2);
            }
            if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.ao)).booleanValue()) {
                com.applovin.impl.sdk.network.e.a(f());
            }
        }
    }

    private void d(JSONObject jSONObject) {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f4020b).a(com.applovin.impl.sdk.utils.h.a("2.0/device", this.f4020b)).c(com.applovin.impl.sdk.utils.h.b("2.0/device", this.f4020b)).a(com.applovin.impl.sdk.utils.h.e(this.f4020b)).b("POST").a(jSONObject).d(((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.eA)).booleanValue()).a((c.a) new JSONObject()).a(((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.cY)).intValue()).a(), this.f4020b) { // from class: com.applovin.impl.sdk.e.b.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i2, String str, JSONObject jSONObject2) {
                com.applovin.impl.sdk.utils.h.a(i2, this.f4020b);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i2) {
                b.this.a(jSONObject2);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.aZ);
        uVar.b(com.applovin.impl.sdk.c.b.ba);
        this.f4020b.S().a(uVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            b("Submitting user data...");
            JSONObject jSONObject = new JSONObject();
            b(jSONObject);
            c(jSONObject);
            d(jSONObject);
        } catch (JSONException e2) {
            a("Unable to build JSON message with collected data", e2);
        }
    }
}
