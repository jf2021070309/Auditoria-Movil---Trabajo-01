package com.bytedance.msdk.api.v2.ad.interstitial;

import com.bytedance.msdk.api.AdError;
/* loaded from: classes.dex */
public interface GMInterstitialAdLoadCallback {
    void onInterstitialLoad();

    void onInterstitialLoadFail(AdError adError);
}
