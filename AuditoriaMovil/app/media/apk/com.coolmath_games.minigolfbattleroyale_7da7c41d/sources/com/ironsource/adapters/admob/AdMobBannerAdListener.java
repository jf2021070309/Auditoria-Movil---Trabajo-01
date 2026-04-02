package com.ironsource.adapters.admob;

import android.widget.FrameLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class AdMobBannerAdListener extends AdListener {
    private String mAdUnitId;
    private AdView mAdView;
    private WeakReference<AdMobAdapter> mAdapter;
    private BannerSmashListener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdMobBannerAdListener(AdMobAdapter adMobAdapter, BannerSmashListener bannerSmashListener, String str, AdView adView) {
        this.mAdapter = new WeakReference<>(adMobAdapter);
        this.mListener = bannerSmashListener;
        this.mAdUnitId = str;
        this.mAdView = adView;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdScreenDismissed();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        String str;
        IronSourceError buildLoadFailedError;
        IronLog.ADAPTER_CALLBACK.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else if (this.mAdapter == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            if (loadAdError != null) {
                str = loadAdError.getMessage() + "( " + loadAdError.getCode() + " ) ";
                if (loadAdError.getCause() != null) {
                    str = str + " Caused by - " + loadAdError.getCause();
                }
                buildLoadFailedError = this.mAdapter.get().isNoFillError(loadAdError.getCode()) ? new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str) : ErrorBuilder.buildLoadFailedError(str);
            } else {
                str = "Banner failed to load (loadAdError is null)";
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("Banner failed to load (loadAdError is null)");
            }
            IronLog.ADAPTER_CALLBACK.error(str + str);
            this.mListener.onBannerAdLoadFailed(buildLoadFailedError);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdScreenPresented();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else if (this.mAdView == null) {
            IronLog.INTERNAL.verbose("adView is null");
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(this.mAdView, layoutParams);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("adUnitId = " + this.mAdUnitId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
