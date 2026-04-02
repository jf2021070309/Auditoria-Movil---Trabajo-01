package com.rovio.rcs.ads;

import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.internal.ServerProtocol;
import com.rovio.fusion.Globals;
import java.util.HashMap;
/* loaded from: classes4.dex */
class FBAudienceNetworkRewardVideo extends AdsSdkBase {
    private static final String TAG = "FBAudienceNetworkRewardVideo";
    private RewardedVideoAd b = null;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void a(HashMap<String, String> hashMap) {
        String str = hashMap.get("appId");
        String str2 = hashMap.get("zoneId");
        String str3 = hashMap.get("markup");
        if (str2 == null || str2.isEmpty() || str2.equals("testing")) {
            str = hashMap.get("zoneId");
            str2 = str;
        }
        if (str2 == null || str2.isEmpty()) {
            Log.e(TAG, "Invalid zoneId");
            if (this.a != null) {
                this.a.onAdError(AdsSdkConstants.ERROR_INVALID_CONFIG);
                this.a.onAdReady(false);
                return;
            }
            return;
        }
        if (str.equals(FBAudienceNetworkSdk.TEST_APPID) || str.equals("testing")) {
            AdInternalSettings.setTestMode(true);
        }
        String str4 = hashMap.get("coppaEnabled");
        if (str4 != null && str4.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            AdSettings.setIsChildDirected(true);
        } else {
            AdSettings.setIsChildDirected(false);
        }
        this.b = new RewardedVideoAd(Globals.getActivity(), str2);
        f();
        if (str3 == null || str3.isEmpty()) {
            this.b.loadAd();
        } else {
            this.b.loadAdFromBid(str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void a() {
        if (this.a != null) {
            boolean z = this.b != null && this.b.isAdLoaded();
            if (!z) {
                this.a.onAdError(AdsSdkConstants.ERROR_WATCHDOG);
            }
            this.a.onAdReady(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void b() {
        if (this.b == null || !this.b.isAdLoaded()) {
            if (this.a != null) {
                this.a.onAdError(AdsSdkConstants.ERROR_SHOW_FAILED);
                this.a.onAdHidden(false);
                return;
            }
            return;
        }
        this.b.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.rovio.rcs.ads.AdsSdkBase
    public void d() {
        if (this.b != null) {
            this.b.setAdListener(null);
            this.b.destroy();
            this.b = null;
        }
    }

    private void f() {
        this.b.setAdListener(new RewardedVideoAdListener() { // from class: com.rovio.rcs.ads.FBAudienceNetworkRewardVideo.1
            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad, AdError adError) {
                if (FBAudienceNetworkRewardVideo.this.a != null) {
                    FBAudienceNetworkRewardVideo.this.a.onAdError(adError.getErrorCode(), adError.getErrorMessage());
                    FBAudienceNetworkRewardVideo.this.a.onAdReady(false);
                }
            }

            @Override // com.facebook.ads.RewardedVideoAdListener, com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
                if (FBAudienceNetworkRewardVideo.this.a != null) {
                    FBAudienceNetworkRewardVideo.this.a.onAdShown();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public void onRewardedVideoCompleted() {
                FBAudienceNetworkRewardVideo.this.c = true;
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public void onRewardedVideoClosed() {
                if (FBAudienceNetworkRewardVideo.this.a != null) {
                    FBAudienceNetworkRewardVideo.this.a.onAdHidden(FBAudienceNetworkRewardVideo.this.c);
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
                if (FBAudienceNetworkRewardVideo.this.a != null) {
                    FBAudienceNetworkRewardVideo.this.a.onClick();
                }
            }
        });
    }
}
