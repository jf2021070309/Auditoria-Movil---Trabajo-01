package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.a.f;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class m extends a {
    private final f.b a;
    private final f.b c;
    private final JSONArray d;
    private final MaxAdFormat e;

    public m(f.b bVar, f.b bVar2, JSONArray jSONArray, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        super("TaskFlushZones", kVar);
        this.a = bVar;
        this.c = bVar2;
        this.d = jSONArray;
        this.e = maxAdFormat;
    }

    private JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_s", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        if (this.a != f.b.UNKNOWN_ZONE) {
            JsonUtils.putString(jSONObject, "format", this.e.getLabel());
            JsonUtils.putInt(jSONObject, "previous_trigger_code", this.c.a());
            JsonUtils.putString(jSONObject, "previous_trigger_reason", this.c.b());
        }
        JsonUtils.putInt(jSONObject, "trigger_code", this.a.a());
        JsonUtils.putString(jSONObject, "trigger_reason", this.a.b());
        JsonUtils.putJsonArray(jSONObject, "zones", this.d);
        return jSONObject;
    }

    public Map<String, String> a() {
        com.applovin.impl.sdk.m T = this.b.T();
        Map<String, Object> d = T.d();
        d.putAll(T.g());
        d.putAll(T.h());
        if (!((Boolean) this.b.a(com.applovin.impl.sdk.c.b.en)).booleanValue()) {
            d.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.b.x());
        }
        return Utils.stringifyObjectMap(d);
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, String> a = a();
        JSONObject b = b();
        String a2 = com.applovin.impl.sdk.utils.g.a((String) this.b.a(com.applovin.impl.sdk.c.b.eU), "1.0/flush_zones", this.b);
        t<JSONObject> tVar = new t<JSONObject>(com.applovin.impl.sdk.network.c.a(this.b).a(a2).c(com.applovin.impl.sdk.utils.g.a((String) this.b.a(com.applovin.impl.sdk.c.b.eV), "1.0/flush_zones", this.b)).a(a).a(b).d(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.ez)).booleanValue()).b("POST").a((c.a) new JSONObject()).b(((Integer) this.b.a(com.applovin.impl.sdk.c.b.eW)).intValue()).a(), this.b) { // from class: com.applovin.impl.sdk.e.m.1
            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
            }

            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                com.applovin.impl.sdk.utils.g.d(jSONObject, this.b);
            }
        };
        tVar.a(com.applovin.impl.sdk.c.b.aU);
        tVar.b(com.applovin.impl.sdk.c.b.aV);
        this.b.Q().a(tVar);
    }
}
