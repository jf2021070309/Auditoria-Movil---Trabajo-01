package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class l extends com.applovin.impl.sdk.e.a {
    private final a a;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public l(com.applovin.impl.sdk.k kVar, a aVar) {
        super("TaskFetchVariables", kVar);
        this.a = aVar;
    }

    private Map<String, String> a() {
        return Utils.stringifyObjectMap(this.b.T().a(null, false, false));
    }

    @Override // java.lang.Runnable
    public void run() {
        t<JSONObject> tVar = new t<JSONObject>(com.applovin.impl.sdk.network.c.a(this.b).a(com.applovin.impl.sdk.utils.g.i(this.b)).c(com.applovin.impl.sdk.utils.g.j(this.b)).a(a()).b("GET").a((c.a) new JSONObject()).b(((Integer) this.b.a(com.applovin.impl.sdk.c.b.df)).intValue()).a(), this.b) { // from class: com.applovin.impl.sdk.e.l.1
            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject) {
                d("Unable to fetch variables: server returned " + i);
                com.applovin.impl.sdk.r.i("AppLovinVariableService", "Failed to load variables.");
                l.this.a.a();
            }

            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i) {
                com.applovin.impl.sdk.utils.g.d(jSONObject, this.b);
                com.applovin.impl.sdk.utils.g.c(jSONObject, this.b);
                com.applovin.impl.sdk.utils.g.h(jSONObject, this.b);
                com.applovin.impl.sdk.utils.g.e(jSONObject, this.b);
                l.this.a.a();
            }
        };
        tVar.a(com.applovin.impl.sdk.c.b.aU);
        tVar.b(com.applovin.impl.sdk.c.b.aV);
        this.b.Q().a(tVar);
    }
}
