package com.applovin.impl.mediation.b;

import com.applovin.impl.sdk.e.w;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f extends w {
    private final com.applovin.impl.mediation.a.c a;

    public f(com.applovin.impl.mediation.a.c cVar, m mVar) {
        super("TaskReportMaxReward", mVar);
        this.a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    public String a() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(int i2) {
        super.a(i2);
        StringBuilder y = e.a.d.a.a.y("Failed to report reward for mediated ad: ");
        y.append(this.a);
        y.append(" - error code: ");
        y.append(i2);
        a(y.toString());
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.a.getPlacement());
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

    @Override // com.applovin.impl.sdk.e.w
    public com.applovin.impl.sdk.b.c b() {
        return this.a.G();
    }

    @Override // com.applovin.impl.sdk.e.w
    public void b(JSONObject jSONObject) {
        StringBuilder y = e.a.d.a.a.y("Reported reward successfully for mediated ad: ");
        y.append(this.a);
        a(y.toString());
    }

    @Override // com.applovin.impl.sdk.e.w
    public void c() {
        StringBuilder y = e.a.d.a.a.y("No reward result was found for mediated ad: ");
        y.append(this.a);
        d(y.toString());
    }
}
