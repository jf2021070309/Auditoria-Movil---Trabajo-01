package com.ironsource.adapters.vungle;

import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.error.VungleException;
/* loaded from: classes2.dex */
public class VungleRewardedVideoPlayListener implements PlayAdCallback {
    private RewardedVideoListener mListener;

    /* loaded from: classes2.dex */
    interface RewardedVideoListener {
        void onRewardedVideoAdClick(String str);

        void onRewardedVideoAdEnd(String str);

        void onRewardedVideoAdRewarded(String str);

        void onRewardedVideoAdStart(String str);

        void onRewardedVideoAdViewed(String str);

        void onRewardedVideoShowError(String str, VungleException vungleException);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void creativeId(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str, boolean z, boolean z2) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdLeftApplication(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleRewardedVideoPlayListener(RewardedVideoListener rewardedVideoListener) {
        this.mListener = rewardedVideoListener;
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        RewardedVideoListener rewardedVideoListener = this.mListener;
        if (rewardedVideoListener != null) {
            rewardedVideoListener.onRewardedVideoShowError(str, vungleException);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdStart(String str) {
        RewardedVideoListener rewardedVideoListener = this.mListener;
        if (rewardedVideoListener != null) {
            rewardedVideoListener.onRewardedVideoAdStart(str);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdViewed(String str) {
        RewardedVideoListener rewardedVideoListener = this.mListener;
        if (rewardedVideoListener != null) {
            rewardedVideoListener.onRewardedVideoAdViewed(str);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str) {
        RewardedVideoListener rewardedVideoListener = this.mListener;
        if (rewardedVideoListener != null) {
            rewardedVideoListener.onRewardedVideoAdEnd(str);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdClick(String str) {
        RewardedVideoListener rewardedVideoListener = this.mListener;
        if (rewardedVideoListener != null) {
            rewardedVideoListener.onRewardedVideoAdClick(str);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdRewarded(String str) {
        RewardedVideoListener rewardedVideoListener = this.mListener;
        if (rewardedVideoListener != null) {
            rewardedVideoListener.onRewardedVideoAdRewarded(str);
        }
    }
}
