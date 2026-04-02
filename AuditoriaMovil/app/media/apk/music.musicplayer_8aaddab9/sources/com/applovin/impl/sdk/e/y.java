package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class y extends a {
    public y(String str, com.applovin.impl.sdk.m mVar) {
        super(str, mVar);
    }

    public abstract String a();

    public void a(int i2) {
        com.applovin.impl.sdk.utils.h.a(i2, this.f4020b);
    }

    public abstract void a(JSONObject jSONObject);

    public void a(JSONObject jSONObject, final b.c<JSONObject> cVar) {
        u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f4020b).a(com.applovin.impl.sdk.utils.h.a(a(), this.f4020b)).c(com.applovin.impl.sdk.utils.h.b(a(), this.f4020b)).a(com.applovin.impl.sdk.utils.h.e(this.f4020b)).b("POST").a(jSONObject).d(((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.eE)).booleanValue()).a((c.a) new JSONObject()).a(h()).a(), this.f4020b) { // from class: com.applovin.impl.sdk.e.y.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i2, String str, JSONObject jSONObject2) {
                cVar.a(i2, str, jSONObject2);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject2, int i2) {
                cVar.a(jSONObject2, i2);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.aZ);
        uVar.b(com.applovin.impl.sdk.c.b.ba);
        this.f4020b.S().a(uVar);
    }

    public abstract int h();

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        String m2 = this.f4020b.m();
        if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.du)).booleanValue() && StringUtils.isValidString(m2)) {
            JsonUtils.putString(jSONObject, "cuid", m2);
        }
        if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.dw)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f4020b.n());
        }
        if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.b.dy)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f4020b.o());
        }
        a(jSONObject);
        return jSONObject;
    }
}
