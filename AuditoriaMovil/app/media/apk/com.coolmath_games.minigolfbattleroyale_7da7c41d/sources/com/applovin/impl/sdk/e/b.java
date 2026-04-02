package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            JSONObject a = com.applovin.impl.sdk.utils.g.a(jSONObject);
            this.b.I().a(com.applovin.impl.sdk.c.b.W, a.getString("device_id"));
            this.b.I().a(com.applovin.impl.sdk.c.b.Y, a.getString("device_token"));
            this.b.I().a(com.applovin.impl.sdk.c.b.Z, Long.valueOf(a.getLong("publisher_id")));
            this.b.I().a();
            com.applovin.impl.sdk.utils.g.d(a, this.b);
            com.applovin.impl.sdk.utils.g.e(a, this.b);
            com.applovin.impl.sdk.utils.g.g(a, this.b);
            String string = JsonUtils.getString(a, "latest_version", "");
            if (!TextUtils.isEmpty(string) && !AppLovinSdk.VERSION.equals(string)) {
                String str = "Current SDK version (" + AppLovinSdk.VERSION + ") is outdated. Please integrate the latest version of the AppLovin SDK (" + string + "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.";
                if (JsonUtils.valueExists(a, "sdk_update_message")) {
                    str = JsonUtils.getString(a, "sdk_update_message", str);
                }
                com.applovin.impl.sdk.r.h("AppLovinSdk", str);
            }
            this.b.R().b();
        } catch (Throwable th) {
            a("Unable to parse API response", th);
        }
    }

    private void b(JSONObject jSONObject) throws JSONException {
        com.applovin.impl.sdk.m T = this.b.T();
        Map<String, Object> d = T.d();
        Utils.renameKeyInObjectMap("platform", "type", d);
        Utils.renameKeyInObjectMap("api_level", "sdk_version", d);
        jSONObject.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, new JSONObject(d));
        Map<String, Object> g = T.g();
        Utils.renameKeyInObjectMap("sdk_version", "applovin_sdk_version", g);
        Utils.renameKeyInObjectMap("ia", "installed_at", g);
        jSONObject.put("app_info", new JSONObject(g));
    }

    private void c(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.dW)).booleanValue()) {
            jSONObject.put("stats", this.b.R().c());
        }
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.ag)).booleanValue()) {
            JSONObject b = com.applovin.impl.sdk.network.e.b(f());
            if (b.length() > 0) {
                jSONObject.put("network_response_codes", b);
            }
            if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.ah)).booleanValue()) {
                com.applovin.impl.sdk.network.e.a(f());
            }
        }
    }

    private void d(JSONObject jSONObject) {
        t<JSONObject> tVar = new t<JSONObject>(com.applovin.impl.sdk.network.c.a(this.b).a(com.applovin.impl.sdk.utils.g.a("2.0/device", this.b)).c(com.applovin.impl.sdk.utils.g.b("2.0/device", this.b)).a(com.applovin.impl.sdk.utils.g.e(this.b)).b("POST").a(jSONObject).d(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.eu)).booleanValue()).a((c.a) new JSONObject()).a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.cY)).intValue()).a(), this.b) { // from class: com.applovin.impl.sdk.e.b.1
            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject2) {
                com.applovin.impl.sdk.utils.g.a(i, this.b);
            }

            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i) {
                b.this.a(jSONObject2);
            }
        };
        tVar.a(com.applovin.impl.sdk.c.b.aQ);
        tVar.b(com.applovin.impl.sdk.c.b.aR);
        this.b.Q().a(tVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            b("Submitting user data...");
            JSONObject jSONObject = new JSONObject();
            b(jSONObject);
            c(jSONObject);
            d(jSONObject);
        } catch (JSONException e) {
            a("Unable to build JSON message with collected data", e);
        }
    }
}
