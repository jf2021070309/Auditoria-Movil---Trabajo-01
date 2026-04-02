package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class m extends com.applovin.impl.sdk.e.a {
    private final a a;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public m(com.applovin.impl.sdk.m mVar, a aVar) {
        super("TaskFetchVariables", mVar);
        this.a = aVar;
    }

    private Map<String, String> a() {
        return Utils.stringifyObjectMap(this.f4020b.V().a(null, false, false));
    }

    @Override // java.lang.Runnable
    public void run() {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f4020b).a(com.applovin.impl.sdk.utils.h.k(this.f4020b)).c(com.applovin.impl.sdk.utils.h.l(this.f4020b)).a(a()).b("GET").a((c.a) new JSONObject()).b(((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.df)).intValue()).a(), this.f4020b) { // from class: com.applovin.impl.sdk.e.m.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i2, String str, JSONObject jSONObject) {
                d("Unable to fetch variables: server returned " + i2);
                com.applovin.impl.sdk.v.i("AppLovinVariableService", "Failed to load variables.");
                m.this.a.a();
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i2) {
                com.applovin.impl.sdk.utils.h.d(jSONObject, this.f4020b);
                com.applovin.impl.sdk.utils.h.c(jSONObject, this.f4020b);
                com.applovin.impl.sdk.utils.h.f(jSONObject, this.f4020b);
                com.applovin.impl.sdk.utils.h.e(jSONObject, this.f4020b);
                m.this.a.a();
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.bd);
        uVar.b(com.applovin.impl.sdk.c.b.be);
        this.f4020b.S().a(uVar);
    }
}
