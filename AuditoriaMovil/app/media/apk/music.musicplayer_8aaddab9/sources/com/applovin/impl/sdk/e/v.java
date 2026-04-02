package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class v extends w {
    private final com.applovin.impl.sdk.ad.e a;

    public v(com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.m mVar) {
        super("TaskReportAppLovinReward", mVar);
        this.a = eVar;
    }

    @Override // com.applovin.impl.sdk.e.y
    public String a() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(int i2) {
        super.a(i2);
        StringBuilder y = e.a.d.a.a.y("Failed to report reward for ad: ");
        y.append(this.a);
        y.append(" - error code: ");
        y.append(i2);
        d(y.toString());
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.a.getAdZone().a());
        JsonUtils.putInt(jSONObject, "fire_percent", this.a.Z());
        String clCode = this.a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.w
    public com.applovin.impl.sdk.b.c b() {
        return this.a.aC();
    }

    @Override // com.applovin.impl.sdk.e.w
    public void b(JSONObject jSONObject) {
        StringBuilder y = e.a.d.a.a.y("Reported reward successfully for ad: ");
        y.append(this.a);
        a(y.toString());
    }

    @Override // com.applovin.impl.sdk.e.w
    public void c() {
        StringBuilder y = e.a.d.a.a.y("No reward result was found for ad: ");
        y.append(this.a);
        d(y.toString());
    }
}
