package com.ironsource.adapters.unityads;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
final class UnityAdsBannerListener implements BannerView.IListener {
    private WeakReference<UnityAdsAdapter> mAdapter;
    private BannerSmashListener mListener;
    private String mPlacementId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnityAdsBannerListener(UnityAdsAdapter unityAdsAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mAdapter = new WeakReference<>(unityAdsAdapter);
        this.mPlacementId = str;
        this.mListener = bannerSmashListener;
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLoaded(BannerView bannerView) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<UnityAdsAdapter> weakReference = this.mAdapter;
        if (weakReference == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        bannerSmashListener.onBannerAdLoaded(bannerView, weakReference.get().createLayoutParams(bannerView.getSize()));
        this.mListener.onBannerAdShown();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        IronSourceError buildLoadFailedError;
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else if (this.mAdapter == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            String str = this.mAdapter.get().getProviderName() + " banner, onAdLoadFailed zoneId <" + this.mPlacementId + "> with error: " + bannerErrorInfo.errorMessage;
            if (bannerErrorInfo.errorCode == BannerErrorCode.NO_FILL) {
                buildLoadFailedError = new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str);
            } else {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError(str);
            }
            this.mListener.onBannerAdLoadFailed(buildLoadFailedError);
        }
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerClick(BannerView bannerView) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLeftApplication(BannerView bannerView) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdLeftApplication();
        }
    }
}
