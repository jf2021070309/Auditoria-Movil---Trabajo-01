package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class z extends aa {
    private final com.applovin.impl.sdk.a.g a;
    private final AppLovinAdRewardListener c;

    public z(com.applovin.impl.sdk.a.g gVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.a = gVar;
        this.c = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.sdk.e.x
    public String a() {
        return "2.0/vr";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.sdk.e.x
    public void a(int i) {
        String str;
        super.a(i);
        if (i < 400 || i >= 500) {
            this.c.validationRequestFailed(this.a, i);
            str = "network_timeout";
        } else {
            this.c.userRewardRejected(this.a, Collections.emptyMap());
            str = "rejected";
        }
        this.a.a(com.applovin.impl.sdk.b.c.a(str));
    }

    @Override // com.applovin.impl.sdk.e.aa
    protected void a(com.applovin.impl.sdk.b.c cVar) {
        this.a.a(cVar);
        String b = cVar.b();
        Map<String, String> a = cVar.a();
        if (b.equals("accepted")) {
            this.c.userRewardVerified(this.a, a);
        } else if (b.equals("quota_exceeded")) {
            this.c.userOverQuota(this.a, a);
        } else if (b.equals("rejected")) {
            this.c.userRewardRejected(this.a, a);
        } else {
            this.c.validationRequestFailed(this.a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.sdk.e.x
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.a.getAdZone().a());
        String clCode = this.a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.aa
    protected boolean b() {
        return this.a.aG();
    }
}
