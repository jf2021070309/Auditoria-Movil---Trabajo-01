package com.bytedance.msdk.api.v2.ad.banner;

import com.bytedance.msdk.api.AdError;
/* loaded from: classes.dex */
public interface GMBannerAdLoadCallback {
    void onAdFailedToLoad(AdError adError);

    void onAdLoaded();
}
