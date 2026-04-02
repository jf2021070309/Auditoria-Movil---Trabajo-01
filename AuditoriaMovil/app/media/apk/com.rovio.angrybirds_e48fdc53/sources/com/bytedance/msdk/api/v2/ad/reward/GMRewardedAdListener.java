package com.bytedance.msdk.api.v2.ad.reward;

import com.bytedance.msdk.adapter.listener.ITTAdatperCallback;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.reward.RewardItem;
/* loaded from: classes.dex */
public interface GMRewardedAdListener extends ITTAdatperCallback {
    void onRewardClick();

    void onRewardVerify(RewardItem rewardItem);

    void onRewardedAdClosed();

    void onRewardedAdShow();

    void onRewardedAdShowFail(AdError adError);

    void onSkippedVideo();

    void onVideoComplete();

    void onVideoError();
}
