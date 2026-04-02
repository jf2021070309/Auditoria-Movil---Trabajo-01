package com.google.android.gms.ads.rewarded;

import androidx.annotation.RecentlyNonNull;
/* loaded from: classes.dex */
public interface RewardItem {
    @RecentlyNonNull
    public static final RewardItem DEFAULT_REWARD = new zza();

    int getAmount();

    @RecentlyNonNull
    String getType();
}
