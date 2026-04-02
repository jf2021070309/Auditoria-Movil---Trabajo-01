package com.ironsource.adapters.vungle;

import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.error.VungleException;
/* loaded from: classes2.dex */
public class VungleRewardedVideoLoadListener implements LoadAdCallback {
    private RewardedVideoListener mListener;

    /* loaded from: classes2.dex */
    interface RewardedVideoListener {
        void onRewardedVideoLoadError(String str, VungleException vungleException);

        void onRewardedVideoLoadSuccess(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleRewardedVideoLoadListener(RewardedVideoListener rewardedVideoListener) {
        this.mListener = rewardedVideoListener;
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onAdLoad(String str) {
        RewardedVideoListener rewardedVideoListener = this.mListener;
        if (rewardedVideoListener != null) {
            rewardedVideoListener.onRewardedVideoLoadSuccess(str);
        }
    }

    @Override // com.vungle.warren.LoadAdCallback, com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        RewardedVideoListener rewardedVideoListener = this.mListener;
        if (rewardedVideoListener != null) {
            rewardedVideoListener.onRewardedVideoLoadError(str, vungleException);
        }
    }
}
