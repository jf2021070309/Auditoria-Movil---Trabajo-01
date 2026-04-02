package com.rovio.rcs.ads;

import com.rovio.rcs.ads.AdsSdk;
/* loaded from: classes4.dex */
class FBAudienceNetworkSdk {
    private static final String TAG = "FBAudienceNetworkSdk";
    public static final String TEST_APPID = "348589098877779";

    FBAudienceNetworkSdk() {
    }

    public static AdsSdkBase createSdk(AdsSdk.AdType adType) {
        switch (adType) {
            case INTERSTITIAL:
                return new FBAudienceNetworkInterstitial();
            case REWARDVIDEO:
                return new FBAudienceNetworkRewardVideo();
            default:
                return null;
        }
    }
}
