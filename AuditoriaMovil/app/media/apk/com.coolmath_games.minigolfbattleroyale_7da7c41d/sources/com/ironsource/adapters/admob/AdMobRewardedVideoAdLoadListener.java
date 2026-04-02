package com.ironsource.adapters.admob;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class AdMobRewardedVideoAdLoadListener extends RewardedAdLoadCallback {
    private String mAdUnitId;
    private WeakReference<AdMobAdapter> mAdapter;
    private RewardedVideoSmashListener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdMobRewardedVideoAdLoadListener(AdMobAdapter adMobAdapter, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mAdapter = new WeakReference<>(adMobAdapter);
        this.mAdUnitId = str;
        this.mListener = rewardedVideoSmashListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(RewardedAd rewardedAd) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<AdMobAdapter> weakReference = this.mAdapter;
        if (weakReference == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        weakReference.get().mAdIdToRewardedVideoAd.put(this.mAdUnitId, rewardedAd);
        this.mAdapter.get().mRewardedVideoAdsAvailability.put(this.mAdUnitId, true);
        this.mListener.onRewardedVideoAvailabilityChanged(true);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else if (this.mAdapter == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            int code = loadAdError.getCode();
            String str = loadAdError.getMessage() + "( " + code + " )";
            IronLog.ADAPTER_CALLBACK.error("adapterError = " + str);
            if (this.mAdapter.get().isNoFillError(code)) {
                code = IronSourceError.ERROR_RV_LOAD_NO_FILL;
                str = "No Fill";
            }
            if (loadAdError.getCause() != null) {
                str = str + "Caused by " + loadAdError.getCause();
            }
            IronLog.ADAPTER_CALLBACK.error("adapterError = " + str);
            this.mListener.onRewardedVideoAvailabilityChanged(false);
            this.mListener.onRewardedVideoLoadFailed(new IronSourceError(code, str));
        }
    }
}
