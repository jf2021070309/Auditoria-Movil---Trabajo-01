package com.bytedance.msdk.api.v2.ad.interstitialFull;

import com.bytedance.msdk.adapter.listener.ITTAdatperCallback;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.reward.RewardItem;
/* loaded from: classes.dex */
public interface GMInterstitialFullAdListener extends ITTAdatperCallback {
    void onAdLeftApplication();

    void onAdOpened();

    void onInterstitialFullClick();

    void onInterstitialFullClosed();

    void onInterstitialFullShow();

    void onInterstitialFullShowFail(AdError adError);

    void onRewardVerify(RewardItem rewardItem);

    void onSkippedVideo();

    void onVideoComplete();

    void onVideoError();
}
