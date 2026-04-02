package com.applovin.impl.mediation.b;

import com.applovin.impl.sdk.e.v;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f extends v {
    private final com.applovin.impl.mediation.a.c a;

    public f(com.applovin.impl.mediation.a.c cVar, k kVar) {
        super("TaskReportMaxReward", kVar);
        this.a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.x
    protected String a() {
        return "2.0/mcr";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.sdk.e.x
    public void a(int i) {
        super.a(i);
        a("Failed to report reward for mediated ad: " + this.a + " - error code: " + i);
    }

    @Override // com.applovin.impl.sdk.e.x
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.a.getPlacement());
        String y = this.a.y();
        if (!StringUtils.isValidString(y)) {
            y = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", y);
        String x = this.a.x();
        if (!StringUtils.isValidString(x)) {
            x = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", x);
    }

    @Override // com.applovin.impl.sdk.e.v
    protected com.applovin.impl.sdk.b.c b() {
        return this.a.B();
    }

    @Override // com.applovin.impl.sdk.e.v
    protected void b(JSONObject jSONObject) {
        a("Reported reward successfully for mediated ad: " + this.a);
    }

    @Override // com.applovin.impl.sdk.e.v
    protected void c() {
        d("No reward result was found for mediated ad: " + this.a);
    }
}
