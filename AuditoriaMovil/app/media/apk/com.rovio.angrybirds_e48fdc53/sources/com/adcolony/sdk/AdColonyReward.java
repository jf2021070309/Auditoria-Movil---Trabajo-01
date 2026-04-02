package com.adcolony.sdk;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColonyReward {
    private int a;
    private String b;
    private String c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyReward(d dVar) {
        JSONObject b = dVar.b();
        this.a = as.c(b, MediationConstant.REWARD_AMOUNT);
        this.b = as.b(b, MediationConstant.REWARD_NAME);
        this.d = as.d(b, "success");
        this.c = as.b(b, "zone_id");
    }

    public int getRewardAmount() {
        return this.a;
    }

    public String getRewardName() {
        return this.b;
    }

    public String getZoneID() {
        return this.c;
    }

    public boolean success() {
        return this.d;
    }
}
