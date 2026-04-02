package com.unity3d.scar.adapter.common;
/* loaded from: classes2.dex */
public interface IScarRewardedAdListenerWrapper {
    void onAdImpression();

    void onRewardedAdClosed();

    void onRewardedAdFailedToLoad(int i, String str);

    void onRewardedAdFailedToShow(int i, String str);

    void onRewardedAdLoaded();

    void onRewardedAdOpened();

    void onUserEarnedReward();
}
