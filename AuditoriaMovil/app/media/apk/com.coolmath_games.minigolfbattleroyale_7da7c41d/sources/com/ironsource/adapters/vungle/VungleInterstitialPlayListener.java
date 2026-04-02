package com.ironsource.adapters.vungle;

import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.error.VungleException;
/* loaded from: classes2.dex */
public class VungleInterstitialPlayListener implements PlayAdCallback {
    private InterstitialListener mListener;

    /* loaded from: classes2.dex */
    interface InterstitialListener {
        void onInterstitialAdClick(String str);

        void onInterstitialAdEnd(String str);

        void onInterstitialAdStart(String str);

        void onInterstitialAdViewed(String str);

        void onInterstitialPlayError(String str, VungleException vungleException);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void creativeId(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str, boolean z, boolean z2) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdLeftApplication(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdRewarded(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleInterstitialPlayListener(InterstitialListener interstitialListener) {
        this.mListener = interstitialListener;
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        InterstitialListener interstitialListener = this.mListener;
        if (interstitialListener != null) {
            interstitialListener.onInterstitialPlayError(str, vungleException);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdStart(String str) {
        InterstitialListener interstitialListener = this.mListener;
        if (interstitialListener != null) {
            interstitialListener.onInterstitialAdStart(str);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdViewed(String str) {
        InterstitialListener interstitialListener = this.mListener;
        if (interstitialListener != null) {
            interstitialListener.onInterstitialAdViewed(str);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str) {
        InterstitialListener interstitialListener = this.mListener;
        if (interstitialListener != null) {
            interstitialListener.onInterstitialAdEnd(str);
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdClick(String str) {
        InterstitialListener interstitialListener = this.mListener;
        if (interstitialListener != null) {
            interstitialListener.onInterstitialAdClick(str);
        }
    }
}
