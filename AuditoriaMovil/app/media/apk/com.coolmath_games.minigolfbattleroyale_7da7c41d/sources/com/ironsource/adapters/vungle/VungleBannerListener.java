package com.ironsource.adapters.vungle;

import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.error.VungleException;
/* loaded from: classes2.dex */
public class VungleBannerListener implements LoadAdCallback, PlayAdCallback {
    private BannerListener mListener;

    /* loaded from: classes2.dex */
    interface BannerListener {
        void onBannerAdViewed(String str);

        void onBannerClick(String str);

        void onBannerError(String str, VungleException vungleException);

        void onBannerLeftApplication(String str);

        void onBannerLoadSuccess(String str);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void creativeId(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str, boolean z, boolean z2) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdRewarded(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdStart(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleBannerListener(BannerListener bannerListener) {
        this.mListener = bannerListener;
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onAdLoad(String str) {
        BannerListener bannerListener = this.mListener;
        if (bannerListener != null) {
            bannerListener.onBannerLoadSuccess(str);
        }
    }

    @Override // com.vungle.warren.LoadAdCallback, com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        BannerListener bannerListener = this.mListener;
        if (bannerListener != null) {
            bannerListener.onBannerError(str, vungleException);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdViewed(String str) {
        BannerListener bannerListener = this.mListener;
        if (bannerListener != null) {
            bannerListener.onBannerAdViewed(str);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdClick(String str) {
        BannerListener bannerListener = this.mListener;
        if (bannerListener != null) {
            bannerListener.onBannerClick(str);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdLeftApplication(String str) {
        BannerListener bannerListener = this.mListener;
        if (bannerListener != null) {
            bannerListener.onBannerLeftApplication(str);
        }
    }
}
