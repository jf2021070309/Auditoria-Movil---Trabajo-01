package com.applovin.impl.mediation.b;

import com.applovin.impl.sdk.e.aa;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g extends aa {
    private final com.applovin.impl.mediation.a.c a;

    public g(com.applovin.impl.mediation.a.c cVar, k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.a = cVar;
    }

    @Override // com.applovin.impl.sdk.e.x
    protected String a() {
        return "2.0/mvr";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.sdk.e.x
    public void a(int i) {
        super.a(i);
        this.a.a(com.applovin.impl.sdk.b.c.a((i < 400 || i >= 500) ? "network_timeout" : "rejected"));
    }

    @Override // com.applovin.impl.sdk.e.aa
    protected void a(com.applovin.impl.sdk.b.c cVar) {
        this.a.a(cVar);
    }

    @Override // com.applovin.impl.sdk.e.x
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.a.getPlacement());
        JsonUtils.putString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, this.a.getFormat().getLabel());
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

    @Override // com.applovin.impl.sdk.e.aa
    protected boolean b() {
        return this.a.z();
    }
}
