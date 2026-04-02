package com.ironsource.adapters.unityads;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
final class UnityAdsInterstitialListener implements IUnityAdsLoadListener, IUnityAdsShowListener {
    private WeakReference<UnityAdsAdapter> mAdapter;
    private InterstitialSmashListener mListener;
    private String mPlacementId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnityAdsInterstitialListener(UnityAdsAdapter unityAdsAdapter, InterstitialSmashListener interstitialSmashListener, String str) {
        this.mAdapter = new WeakReference<>(unityAdsAdapter);
        this.mPlacementId = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<UnityAdsAdapter> weakReference = this.mAdapter;
        if (weakReference == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        weakReference.get().mInterstitialAdsAvailability.put(str, true);
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else if (this.mAdapter == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            if (unityAdsLoadError != null) {
                this.mListener.onInterstitialAdLoadFailed(new IronSourceError(unityAdsLoadError == UnityAds.UnityAdsLoadError.NO_FILL ? IronSourceError.ERROR_IS_LOAD_NO_FILL : this.mAdapter.get().getUnityAdsLoadErrorCode(unityAdsLoadError), str2));
            } else {
                interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str2));
            }
            this.mAdapter.get().mInterstitialAdsAvailability.put(str, false);
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        interstitialSmashListener.onInterstitialAdOpened();
        this.mListener.onInterstitialAdShowSucceeded();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        IronSourceError buildShowFailedError;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else if (this.mAdapter == null) {
            IronLog.INTERNAL.verbose("adapter is null");
        } else {
            if (unityAdsShowError != null) {
                buildShowFailedError = new IronSourceError(this.mAdapter.get().getUnityAdsShowErrorCode(unityAdsShowError), str2);
            } else {
                buildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, str2);
            }
            IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
            ironLog2.error("ironSourceError = " + buildShowFailedError);
            this.mListener.onInterstitialAdShowFailed(buildShowFailedError);
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + this.mPlacementId + " completionState: " + unityAdsShowCompletionState);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowCompletionState[unityAdsShowCompletionState.ordinal()];
        if (i == 1 || i == 2) {
            this.mListener.onInterstitialAdClosed();
        }
    }

    /* renamed from: com.ironsource.adapters.unityads.UnityAdsInterstitialListener$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowCompletionState;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowCompletionState.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowCompletionState = iArr;
            try {
                iArr[UnityAds.UnityAdsShowCompletionState.SKIPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowCompletionState[UnityAds.UnityAdsShowCompletionState.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
