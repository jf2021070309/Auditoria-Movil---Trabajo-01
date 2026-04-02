package com.ironsource.adapters.vungle;

import com.ironsource.adapters.vungle.VungleBannerListener;
import com.ironsource.adapters.vungle.VungleInterstitialLoadListener;
import com.ironsource.adapters.vungle.VungleInterstitialPlayListener;
import com.ironsource.adapters.vungle.VungleRewardedVideoLoadListener;
import com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.vungle.warren.InitCallback;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class VungleSingletonAdapter implements InitCallback, VungleBannerListener.BannerListener, VungleInterstitialLoadListener.InterstitialListener, VungleInterstitialPlayListener.InterstitialListener, VungleRewardedVideoLoadListener.RewardedVideoListener, VungleRewardedVideoPlayListener.RewardedVideoListener {
    private static VungleSingletonAdapter mInstance;
    private WeakReference<VungleAdapter> mInitAdapter = null;
    private ConcurrentHashMap<String, WeakReference<VungleAdapter>> mRewardedVideoListeners = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, WeakReference<VungleAdapter>> mInterstitialListeners = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, WeakReference<VungleAdapter>> mBannerListeners = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, VungleBanner> mPlacementIdToBannerAd = new ConcurrentHashMap<>();

    private VungleSingletonAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized VungleSingletonAdapter getInstance() {
        VungleSingletonAdapter vungleSingletonAdapter;
        synchronized (VungleSingletonAdapter.class) {
            if (mInstance == null) {
                mInstance = new VungleSingletonAdapter();
            }
            vungleSingletonAdapter = mInstance;
        }
        return vungleSingletonAdapter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addRewardedVideoListener(String str, WeakReference<VungleAdapter> weakReference) {
        this.mRewardedVideoListeners.put(str, weakReference);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleRewardedVideoLoadListener createRewardedVideoLoadListener() {
        return new VungleRewardedVideoLoadListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleRewardedVideoPlayListener createRewardedVideoPlayListener() {
        return new VungleRewardedVideoPlayListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addInterstitialListener(String str, WeakReference<VungleAdapter> weakReference) {
        this.mInterstitialListeners.put(str, weakReference);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleInterstitialLoadListener createInterstitialLoadListener() {
        return new VungleInterstitialLoadListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleInterstitialPlayListener createInterstitialPlayListener() {
        return new VungleInterstitialPlayListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addBannerListener(String str, WeakReference<VungleAdapter> weakReference) {
        this.mBannerListeners.put(str, weakReference);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleBannerListener createBannerListener() {
        return new VungleBannerListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addBannerAdView(String str, VungleBanner vungleBanner) {
        this.mPlacementIdToBannerAd.put(str, vungleBanner);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VungleBanner getBannerAdView(String str) {
        return this.mPlacementIdToBannerAd.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeBannerAdView(String str) {
        this.mPlacementIdToBannerAd.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addFirstInitiator(WeakReference<VungleAdapter> weakReference) {
        this.mInitAdapter = weakReference;
    }

    @Override // com.vungle.warren.InitCallback
    public void onSuccess() {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mInitAdapter;
        if (weakReference != null && (vungleAdapter = weakReference.get()) != null) {
            vungleAdapter.onSuccess();
        }
        this.mInitAdapter = null;
    }

    @Override // com.vungle.warren.InitCallback
    public void onError(VungleException vungleException) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mInitAdapter;
        if (weakReference != null && (vungleAdapter = weakReference.get()) != null) {
            vungleAdapter.onError(vungleException);
        }
        this.mInitAdapter = null;
    }

    @Override // com.vungle.warren.InitCallback
    public void onAutoCacheAdAvailable(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mInitAdapter;
        if (weakReference != null && (vungleAdapter = weakReference.get()) != null) {
            vungleAdapter.onAutoCacheAdAvailable(str);
        }
        this.mInitAdapter = null;
    }

    @Override // com.ironsource.adapters.vungle.VungleBannerListener.BannerListener
    public void onBannerLoadSuccess(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mBannerListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onBannerLoadSuccess(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleBannerListener.BannerListener
    public void onBannerError(String str, VungleException vungleException) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mBannerListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onBannerError(str, vungleException);
    }

    @Override // com.ironsource.adapters.vungle.VungleBannerListener.BannerListener
    public void onBannerClick(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mBannerListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onBannerClick(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleBannerListener.BannerListener
    public void onBannerLeftApplication(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mBannerListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onBannerLeftApplication(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleBannerListener.BannerListener
    public void onBannerAdViewed(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mBannerListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onBannerAdViewed(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialLoadListener.InterstitialListener
    public void onInterstitialLoadSuccess(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mInterstitialListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onInterstitialLoadSuccess(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialLoadListener.InterstitialListener
    public void onInterstitialLoadError(String str, VungleException vungleException) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mInterstitialListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onInterstitialLoadError(str, vungleException);
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialPlayListener.InterstitialListener
    public void onInterstitialPlayError(String str, VungleException vungleException) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mInterstitialListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onInterstitialPlayError(str, vungleException);
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialPlayListener.InterstitialListener
    public void onInterstitialAdStart(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placementId = " + str);
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialPlayListener.InterstitialListener
    public void onInterstitialAdEnd(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mInterstitialListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onInterstitialAdEnd(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialPlayListener.InterstitialListener
    public void onInterstitialAdClick(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mInterstitialListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onInterstitialAdClick(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialPlayListener.InterstitialListener
    public void onInterstitialAdViewed(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mInterstitialListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onInterstitialAdViewed(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoLoadListener.RewardedVideoListener
    public void onRewardedVideoLoadSuccess(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mRewardedVideoListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onRewardedVideoLoadSuccess(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoLoadListener.RewardedVideoListener
    public void onRewardedVideoLoadError(String str, VungleException vungleException) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mRewardedVideoListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onRewardedVideoLoadError(str, vungleException);
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoShowError(String str, VungleException vungleException) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mRewardedVideoListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onRewardedVideoShowError(str, vungleException);
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoAdStart(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placementId = " + str);
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoAdViewed(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mRewardedVideoListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onRewardedVideoAdViewed(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoAdEnd(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mRewardedVideoListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onRewardedVideoAdEnd(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoAdClick(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mRewardedVideoListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onRewardedVideoAdClick(str);
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        VungleAdapter vungleAdapter;
        WeakReference<VungleAdapter> weakReference = this.mRewardedVideoListeners.get(str);
        if (weakReference == null || (vungleAdapter = weakReference.get()) == null) {
            return;
        }
        vungleAdapter.onRewardedVideoAdRewarded(str);
    }
}
