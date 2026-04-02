package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: classes2.dex */
public interface RewardedVideoManualListener extends RewardedVideoListener {
    void onRewardedVideoAdLoadFailed(IronSourceError ironSourceError);

    void onRewardedVideoAdReady();
}
