package com.sdk.ksdk.listener;
/* loaded from: classes3.dex */
public interface NRewardVideoListener {
    void rewardVideoCached();

    void rewardVideoClick();

    void rewardVideoClose();

    void rewardVideoComplete();

    void rewardVideoError(String str);

    void rewardVideoShow();

    void rewardVideoSkipped();

    void rewardVideoVerify(boolean z, int i, String str, int i2, String str2);
}
