package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class x extends a {
    /* JADX INFO: Access modifiers changed from: protected */
    public x(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    protected abstract String a();

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i) {
        com.applovin.impl.sdk.utils.g.a(i, this.b);
    }

    protected abstract void a(JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject, final b.c<JSONObject> cVar) {
        t<JSONObject> tVar = new t<JSONObject>(com.applovin.impl.sdk.network.c.a(this.b).a(com.applovin.impl.sdk.utils.g.a(a(), this.b)).c(com.applovin.impl.sdk.utils.g.b(a(), this.b)).a(com.applovin.impl.sdk.utils.g.e(this.b)).b("POST").a(jSONObject).d(((Boolean) this.b.a(com.applovin.impl.sdk.c.b.ey)).booleanValue()).a((c.a) new JSONObject()).a(h()).a(), this.b) { // from class: com.applovin.impl.sdk.e.x.1
            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, JSONObject jSONObject2) {
                cVar.a(i, str, jSONObject2);
            }

            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i) {
                cVar.a(jSONObject2, i);
            }
        };
        tVar.a(com.applovin.impl.sdk.c.b.aQ);
        tVar.b(com.applovin.impl.sdk.c.b.aR);
        this.b.Q().a(tVar);
    }

    protected abstract int h();

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        String m = this.b.m();
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.dt)).booleanValue() && StringUtils.isValidString(m)) {
            JsonUtils.putString(jSONObject, "cuid", m);
        }
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.dv)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.b.n());
        }
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.dx)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.b.o());
        }
        a(jSONObject);
        return jSONObject;
    }
}
