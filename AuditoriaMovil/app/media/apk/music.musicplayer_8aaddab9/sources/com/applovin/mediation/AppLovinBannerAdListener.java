package com.applovin.mediation;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import e.a.d.a.a;
/* loaded from: classes.dex */
public class AppLovinBannerAdListener implements AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {
    private final AppLovinAdView mAdView;
    private final ApplovinAdapter mAdapter;
    private final MediationBannerListener mMediationBannerListener;
    private final String mZoneId;

    public AppLovinBannerAdListener(String str, AppLovinAdView appLovinAdView, ApplovinAdapter applovinAdapter, MediationBannerListener mediationBannerListener) {
        this.mAdapter = applovinAdapter;
        this.mMediationBannerListener = mediationBannerListener;
        this.mAdView = appLovinAdView;
        this.mZoneId = str;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner clicked.");
        MediationBannerListener mediationBannerListener = this.mMediationBannerListener;
        ApplovinAdapter applovinAdapter = this.mAdapter;
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner closed fullscreen.");
        this.mMediationBannerListener.onAdClosed(this.mAdapter);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner displayed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        ApplovinAdapter.log(5, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner left application.");
        this.mMediationBannerListener.onAdLeftApplication(this.mAdapter);
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner opened fullscreen.");
        this.mMediationBannerListener.onAdOpened(this.mAdapter);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        StringBuilder y = a.y("Banner did load ad: ");
        y.append(appLovinAd.getAdIdNumber());
        y.append(" for zone: ");
        y.append(this.mZoneId);
        ApplovinAdapter.log(3, y.toString());
        this.mAdView.renderAd(appLovinAd);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.AppLovinBannerAdListener.1
            @Override // java.lang.Runnable
            public void run() {
                MediationBannerListener unused = AppLovinBannerAdListener.this.mMediationBannerListener;
                ApplovinAdapter unused2 = AppLovinBannerAdListener.this.mAdapter;
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        final AdError adError = AppLovinUtils.getAdError(i2);
        ApplovinAdapter.log(5, "Failed to load banner ad with error: " + i2);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.AppLovinBannerAdListener.2
            @Override // java.lang.Runnable
            public void run() {
                AppLovinBannerAdListener.this.mMediationBannerListener.onAdFailedToLoad(AppLovinBannerAdListener.this.mAdapter, adError);
            }
        });
    }
}
