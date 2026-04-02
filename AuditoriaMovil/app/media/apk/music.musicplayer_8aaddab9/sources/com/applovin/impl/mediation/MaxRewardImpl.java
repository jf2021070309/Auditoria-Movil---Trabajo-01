package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;
/* loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3300b;

    private MaxRewardImpl(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.a = str;
        this.f3300b = i2;
    }

    public static MaxReward create(int i2, String str) {
        return new MaxRewardImpl(i2, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f3300b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.a;
    }

    public String toString() {
        return "MaxReward{}";
    }
}
