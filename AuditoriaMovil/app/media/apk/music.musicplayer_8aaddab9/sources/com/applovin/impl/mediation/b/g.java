package com.applovin.impl.mediation.b;

import com.applovin.impl.sdk.e.ab;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g extends ab {
    private final com.applovin.impl.mediation.a.c a;

    public g(com.applovin.impl.mediation.a.c cVar, m mVar) {
        super("TaskValidateMaxReward", mVar);
        this.a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    public String a() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(int i2) {
        super.a(i2);
        this.a.a(com.applovin.impl.sdk.b.c.a((i2 < 400 || i2 >= 500) ? "network_timeout" : "rejected"));
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.a.a(cVar);
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.a.getPlacement());
        JsonUtils.putString(jSONObject, "ad_format", this.a.getFormat().getLabel());
        String D = this.a.D();
        if (!StringUtils.isValidString(D)) {
            D = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", D);
        String C = this.a.C();
        if (!StringUtils.isValidString(C)) {
            C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", C);
    }

    @Override // com.applovin.impl.sdk.e.ab
    public boolean b() {
        return this.a.E();
    }
}
