package com.ironsource.adapters.admob;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class AdMobInterstitialAdLoadListener extends InterstitialAdLoadCallback {
    private String mAdUnitId;
    private WeakReference<AdMobAdapter> mAdapter;
    private InterstitialSmashListener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdMobInterstitialAdLoadListener(AdMobAdapter adMobAdapter, String str, InterstitialSmashListener interstitialSmashListener) {
        this.mAdapter = new WeakReference<>(adMobAdapter);
        this.mAdUnitId = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(InterstitialAd interstitialAd) {
        if (this.mAdapter != null) {
            String adUnitId = interstitialAd.getAdUnitId();
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose("adUnitId = " + adUnitId);
            this.mAdapter.get().mAdIdToInterstitialAd.put(this.mAdUnitId, interstitialAd);
            this.mAdapter.get().mInterstitialAdsAvailability.put(adUnitId, true);
            InterstitialSmashListener interstitialSmashListener = this.mListener;
            if (interstitialSmashListener == null) {
                IronLog.INTERNAL.verbose("listener is null");
            } else {
                interstitialSmashListener.onInterstitialAdReady();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        int code = loadAdError.getCode();
        String str = loadAdError.getMessage() + "( " + code + " ) ";
        if (this.mAdapter.get().isNoFillError(code)) {
            code = IronSourceError.ERROR_IS_LOAD_NO_FILL;
            str = "No Fill";
        }
        if (loadAdError.getCause() != null) {
            str = str + " Caused by - " + loadAdError.getCause();
        }
        IronLog.ADAPTER_CALLBACK.error("adapterError = " + str);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(code, str));
        }
    }
}
