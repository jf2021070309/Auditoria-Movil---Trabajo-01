package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class u extends v {
    private final com.applovin.impl.sdk.a.g a;

    public u(com.applovin.impl.sdk.a.g gVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.a = gVar;
    }

    @Override // com.applovin.impl.sdk.e.x
    protected String a() {
        return "2.0/cr";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.sdk.e.x
    public void a(int i) {
        super.a(i);
        d("Failed to report reward for ad: " + this.a + " - error code: " + i);
    }

    @Override // com.applovin.impl.sdk.e.x
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.a.getAdZone().a());
        JsonUtils.putInt(jSONObject, "fire_percent", this.a.ad());
        String clCode = this.a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.v
    protected com.applovin.impl.sdk.b.c b() {
        return this.a.aI();
    }

    @Override // com.applovin.impl.sdk.e.v
    protected void b(JSONObject jSONObject) {
        a("Reported reward successfully for ad: " + this.a);
    }

    @Override // com.applovin.impl.sdk.e.v
    protected void c() {
        d("No reward result was found for ad: " + this.a);
    }
}
