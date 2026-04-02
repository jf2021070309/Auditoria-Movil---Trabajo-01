package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class aa extends ab {
    private final com.applovin.impl.sdk.ad.e a;

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinAdRewardListener f4024c;

    public aa(com.applovin.impl.sdk.ad.e eVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.m mVar) {
        super("TaskValidateAppLovinReward", mVar);
        this.a = eVar;
        this.f4024c = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.sdk.e.y
    public String a() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(int i2) {
        String str;
        super.a(i2);
        if (i2 < 400 || i2 >= 500) {
            this.f4024c.validationRequestFailed(this.a, i2);
            str = "network_timeout";
        } else {
            this.f4024c.userRewardRejected(this.a, Collections.emptyMap());
            str = "rejected";
        }
        this.a.a(com.applovin.impl.sdk.b.c.a(str));
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.a.a(cVar);
        String b2 = cVar.b();
        Map<String, String> a = cVar.a();
        if (b2.equals("accepted")) {
            this.f4024c.userRewardVerified(this.a, a);
        } else if (b2.equals("quota_exceeded")) {
            this.f4024c.userOverQuota(this.a, a);
        } else if (b2.equals("rejected")) {
            this.f4024c.userRewardRejected(this.a, a);
        } else {
            this.f4024c.validationRequestFailed(this.a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.a.getAdZone().a());
        String clCode = this.a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.ab
    public boolean b() {
        return this.a.aA();
    }
}
