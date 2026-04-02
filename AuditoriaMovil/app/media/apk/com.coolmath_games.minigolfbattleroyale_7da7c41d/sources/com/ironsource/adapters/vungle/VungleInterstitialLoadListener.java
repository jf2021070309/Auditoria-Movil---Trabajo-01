package com.ironsource.adapters.vungle;

import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.error.VungleException;
/* loaded from: classes2.dex */
public class VungleInterstitialLoadListener implements LoadAdCallback {
    private InterstitialListener mListener;

    /* loaded from: classes2.dex */
    interface InterstitialListener {
        void onInterstitialLoadError(String str, VungleException vungleException);

        void onInterstitialLoadSuccess(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleInterstitialLoadListener(InterstitialListener interstitialListener) {
        this.mListener = interstitialListener;
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onAdLoad(String str) {
        InterstitialListener interstitialListener = this.mListener;
        if (interstitialListener != null) {
            interstitialListener.onInterstitialLoadSuccess(str);
        }
    }

    @Override // com.vungle.warren.LoadAdCallback, com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        InterstitialListener interstitialListener = this.mListener;
        if (interstitialListener != null) {
            interstitialListener.onInterstitialLoadError(str, vungleException);
        }
    }
}
