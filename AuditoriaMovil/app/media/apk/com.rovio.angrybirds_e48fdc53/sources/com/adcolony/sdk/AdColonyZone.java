package com.adcolony.sdk;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.sdk.ksdk.util.Var;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColonyZone {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 0;
    public static final int NATIVE = 2;
    private String a;
    private String b;
    private String c;
    private String d;
    private int e = 5;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyZone(String str) {
        this.a = str;
    }

    private int c(int i) {
        if (!a.b() || a.a().d() || a.a().e()) {
            b();
            return 0;
        }
        return i;
    }

    private boolean a(boolean z) {
        if (!a.b() || a.a().d() || a.a().e()) {
            b();
            return false;
        }
        return z;
    }

    private String a(String str) {
        return a(str, "");
    }

    private String a(String str, String str2) {
        if (!a.b() || a.a().d() || a.a().e()) {
            b();
            return str2;
        }
        return str;
    }

    public String getZoneID() {
        return a(this.a);
    }

    public int getRemainingViewsUntilReward() {
        return c(this.g);
    }

    public int getRewardAmount() {
        return c(this.j);
    }

    public String getRewardName() {
        return a(this.b);
    }

    public int getViewsPerReward() {
        return c(this.h);
    }

    public int getZoneType() {
        return this.f;
    }

    public boolean isValid() {
        return a(this.l);
    }

    public boolean isRewarded() {
        return this.m;
    }

    public int getPlayFrequency() {
        return c(this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar) {
        JSONObject b = dVar.b();
        JSONObject f = as.f(b, Var.REWARD_KEY);
        this.b = as.b(f, MediationConstant.REWARD_NAME);
        this.j = as.c(f, MediationConstant.REWARD_AMOUNT);
        this.h = as.c(f, "views_per_reward");
        this.g = as.c(f, "views_until_reward");
        this.c = as.b(f, "reward_name_plural");
        this.d = as.b(f, "reward_prompt");
        this.m = as.d(b, "rewarded");
        this.e = as.c(b, "status");
        this.f = as.c(b, "type");
        this.i = as.c(b, "play_interval");
        this.a = as.b(b, "zone_id");
        this.l = this.e != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        this.e = i;
    }

    private void b() {
        au.g.b("The AdColonyZone API is not available while AdColony is disabled.");
    }
}
