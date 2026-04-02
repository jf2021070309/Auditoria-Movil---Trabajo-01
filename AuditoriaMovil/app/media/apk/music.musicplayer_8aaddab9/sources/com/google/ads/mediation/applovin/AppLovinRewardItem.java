package com.google.ads.mediation.applovin;

import com.google.android.gms.ads.rewarded.RewardItem;
/* loaded from: classes.dex */
public final class AppLovinRewardItem implements RewardItem {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4507b;

    public AppLovinRewardItem(int i2, String str) {
        this.a = i2;
        this.f4507b = str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return this.f4507b;
    }
}
