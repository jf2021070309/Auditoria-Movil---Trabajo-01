package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
/* loaded from: classes.dex */
public class FacebookRtbBannerAd implements MediationBannerAd, AdListener {
    private MediationBannerAdConfiguration adConfiguration;
    private AdView adView;
    private MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> callback;
    private MediationBannerAdCallback mBannerAdCallback;
    private FrameLayout mWrappedAdView;

    public FacebookRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.adConfiguration = mediationBannerAdConfiguration;
        this.callback = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.mWrappedAdView;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MediationBannerAdCallback mediationBannerAdCallback = this.mBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
            this.mBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        this.mBannerAdCallback = this.callback.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.callback.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
    }

    public void render() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.adConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.callback.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.adConfiguration);
        try {
            this.adView = new AdView(this.adConfiguration.getContext(), placementID, this.adConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(this.adConfiguration.getWatermark())) {
                this.adView.setExtraHints(new ExtraHints.Builder().mediationData(this.adConfiguration.getWatermark()).build());
            }
            Context context = this.adConfiguration.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.adConfiguration.getAdSize().getWidthInPixels(context), -2);
            this.mWrappedAdView = new FrameLayout(context);
            this.adView.setLayoutParams(layoutParams);
            this.mWrappedAdView.addView(this.adView);
            this.adView.buildLoadAdConfig().withAdListener(this).withBid(this.adConfiguration.getBidResponse()).build();
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.getMessage());
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, valueOf.length() != 0 ? "Failed to create banner ad: ".concat(valueOf) : new String("Failed to create banner ad: "), "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.callback.onFailure(adError2);
        }
    }
}
