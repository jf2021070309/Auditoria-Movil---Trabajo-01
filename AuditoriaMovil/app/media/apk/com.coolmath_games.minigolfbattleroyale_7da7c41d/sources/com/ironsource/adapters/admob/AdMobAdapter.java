package com.ironsource.adapters.admob;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdMobAdapter extends AbstractAdapter implements INetworkInitCallbackListener {
    public static int BN_FAILED_TO_RELOAD_ERROR_CODE = 103;
    private static final String CORE_SDK_VERSION = "20.5.0";
    private static final String GitHash = "4c02c9743";
    public static int IS_NOT_READY_ERROR_CODE = 104;
    public static int RV_NOT_READY_ERROR_CODE = 101;
    private static final String VERSION = "4.3.24";
    private static Boolean mCCPAValue = null;
    private static Boolean mConsent = null;
    private static Integer mCoppaValue = null;
    private static Integer mEuValue = null;
    private static String mRatingValue = "";
    private final String AD_UNIT_ID;
    private final String INIT_RESPONSE_REQUIRED;
    private final String IRONSOURCE_REQUEST_AGENT;
    private final String NETWORK_ONLY_INIT;
    private ConcurrentHashMap<String, AdView> mAdIdToBannerAd;
    public ConcurrentHashMap<String, InterstitialAd> mAdIdToInterstitialAd;
    public ConcurrentHashMap<String, RewardedAd> mAdIdToRewardedVideoAd;
    private ConcurrentHashMap<String, BannerSmashListener> mAdUnitIdToBannerListener;
    private ConcurrentHashMap<String, InterstitialSmashListener> mAdUnitIdToInterstitialListener;
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mAdUnitIdToRewardedVideoListener;
    public ConcurrentHashMap<String, Boolean> mInterstitialAdsAvailability;
    public ConcurrentHashMap<String, Boolean> mRewardedVideoAdsAvailability;
    private CopyOnWriteArraySet<String> mRewardedVideoPlacementsForInitCallbacks;
    private static AtomicBoolean mWasInitCalled = new AtomicBoolean(false);
    private static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();
    private static InitState mInitState = InitState.INIT_STATE_NONE;

    /* loaded from: classes2.dex */
    private interface AdMobMaxContentRating {
        public static final String ADMOB_MAX_AD_CONTENT_RATING_G = "max_ad_content_rating_g";
        public static final String ADMOB_MAX_AD_CONTENT_RATING_MA = "max_ad_content_rating_ma";
        public static final String ADMOB_MAX_AD_CONTENT_RATING_PG = "max_ad_content_rating_pg";
        public static final String ADMOB_MAX_AD_CONTENT_RATING_T = "max_ad_content_rating_t";
    }

    /* loaded from: classes2.dex */
    private interface AdMobMetaDataFlags {
        public static final String ADMOB_MAX_RATING_KEY = "admob_maxcontentrating";
        public static final String ADMOB_TFCD_KEY = "admob_tfcd";
        public static final String ADMOB_TFUA_KEY = "admob_tfua";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS,
        INIT_STATE_FAILED
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return CORE_SDK_VERSION;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "4.3.24";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isNoFillError(int i) {
        return i == 3 || i == 9;
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackLoadSuccess(String str) {
    }

    public static AdMobAdapter startAdapter(String str) {
        return new AdMobAdapter(str);
    }

    private AdMobAdapter(String str) {
        super(str);
        this.IRONSOURCE_REQUEST_AGENT = "ironSource";
        this.AD_UNIT_ID = "adUnitId";
        this.NETWORK_ONLY_INIT = "networkOnlyInit";
        this.INIT_RESPONSE_REQUIRED = "initResponseRequired";
        IronLog.INTERNAL.verbose("");
        this.mAdUnitIdToRewardedVideoListener = new ConcurrentHashMap<>();
        this.mAdIdToRewardedVideoAd = new ConcurrentHashMap<>();
        this.mRewardedVideoAdsAvailability = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mAdIdToInterstitialAd = new ConcurrentHashMap<>();
        this.mInterstitialAdsAvailability = new ConcurrentHashMap<>();
        this.mAdUnitIdToInterstitialListener = new ConcurrentHashMap<>();
        this.mAdIdToBannerAd = new ConcurrentHashMap<>();
        this.mAdUnitIdToBannerListener = new ConcurrentHashMap<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        IntegrationData integrationData = new IntegrationData("AdMob", "4.3.24");
        integrationData.activities = new String[]{AdActivity.CLASS_NAME};
        return integrationData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initSDK(JSONObject jSONObject) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            mInitState = InitState.INIT_STATE_IN_PROGRESS;
            IronLog.ADAPTER_API.verbose("");
            if (jSONObject.optBoolean("networkOnlyInit", true)) {
                IronLog.ADAPTER_API.verbose("disableMediationAdapterInitialization");
                MobileAds.disableMediationAdapterInitialization(ContextProvider.getInstance().getCurrentActiveActivity());
            }
            if (jSONObject.optBoolean("initResponseRequired", false)) {
                IronLog.ADAPTER_API.verbose("init and wait for callback");
                MobileAds.initialize(ContextProvider.getInstance().getApplicationContext(), new OnInitializationCompleteListener() { // from class: com.ironsource.adapters.admob.AdMobAdapter.1
                    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                    public void onInitializationComplete(InitializationStatus initializationStatus) {
                        AdapterStatus adapterStatus = initializationStatus.getAdapterStatusMap().get("com.google.android.gms.ads.MobileAds");
                        if ((adapterStatus != null ? adapterStatus.getInitializationState() : null) == AdapterStatus.State.READY) {
                            IronLog.ADAPTER_API.verbose("initializationStatus = READY");
                            AdMobAdapter.this.initializationSuccess();
                            return;
                        }
                        IronLog.ADAPTER_API.verbose("initializationStatus = NOT READY");
                        AdMobAdapter.this.initializationFailure();
                    }
                });
                return;
            }
            IronLog.ADAPTER_API.verbose("init without callback");
            MobileAds.initialize(ContextProvider.getInstance().getApplicationContext());
            initializationSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideoWithCallback(String str, String str2, final JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        final String optString = jSONObject.optString("adUnitId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + optString);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("adUnitId is empty");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("missing credentials - adUnitId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        this.mAdUnitIdToRewardedVideoListener.put(optString, rewardedVideoSmashListener);
        this.mRewardedVideoPlacementsForInitCallbacks.add(optString);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.AdMobAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                if (AdMobAdapter.mInitState != InitState.INIT_STATE_SUCCESS) {
                    if (AdMobAdapter.mInitState != InitState.INIT_STATE_FAILED) {
                        AdMobAdapter.this.initSDK(jSONObject);
                        return;
                    }
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("init failed - placementName = " + optString);
                    rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Sdk failed to initiate", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initAndLoadRewardedVideo(String str, String str2, final JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        final String optString = jSONObject.optString("adUnitId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + optString);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("adUnitId is empty");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        this.mAdUnitIdToRewardedVideoListener.put(optString, rewardedVideoSmashListener);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.AdMobAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                if (AdMobAdapter.mInitState != InitState.INIT_STATE_SUCCESS) {
                    if (AdMobAdapter.mInitState != InitState.INIT_STATE_FAILED) {
                        AdMobAdapter.this.initSDK(jSONObject);
                        return;
                    }
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("onRewardedVideoAvailabilityChanged(false) - placementName = " + optString);
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                    return;
                }
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.verbose("loadVideo - placementName = " + optString);
                AdMobAdapter.this.loadRewardedVideoAdFromAdMob(optString, rewardedVideoSmashListener);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void fetchRewardedVideoForAutomaticLoad(final JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.AdMobAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                AdMobAdapter.this.loadRewardedVideoAdFromAdMob(jSONObject.optString("adUnitId"), rewardedVideoSmashListener);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        return isRewardedVideoAvailableForAdUnitId(jSONObject.optString("adUnitId"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isRewardedVideoAvailableForAdUnitId(String str) {
        return this.mRewardedVideoAdsAvailability.containsKey(str) && this.mRewardedVideoAdsAvailability.get(str).booleanValue();
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void showRewardedVideo(final JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.AdMobAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                String optString = jSONObject.optString("adUnitId");
                RewardedAd rewardedAd = AdMobAdapter.this.mAdIdToRewardedVideoAd.get(optString);
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("adUnitId = " + optString);
                if (rewardedAd != null && AdMobAdapter.this.isRewardedVideoAvailableForAdUnitId(optString)) {
                    AdMobRewardedVideoAdShowListener adMobRewardedVideoAdShowListener = new AdMobRewardedVideoAdShowListener(AdMobAdapter.this, optString, rewardedVideoSmashListener);
                    rewardedAd.setFullScreenContentCallback(adMobRewardedVideoAdShowListener);
                    rewardedAd.show(ContextProvider.getInstance().getCurrentActiveActivity(), adMobRewardedVideoAdShowListener);
                } else {
                    RewardedVideoSmashListener rewardedVideoSmashListener2 = rewardedVideoSmashListener;
                    int i = AdMobAdapter.RV_NOT_READY_ERROR_CODE;
                    rewardedVideoSmashListener2.onRewardedVideoAdShowFailed(new IronSourceError(i, AdMobAdapter.this.getProviderName() + "showRewardedVideo rv not ready " + optString));
                }
                AdMobAdapter.this.mRewardedVideoAdsAvailability.put(optString, false);
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadRewardedVideoAdFromAdMob(String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + str);
        this.mRewardedVideoAdsAvailability.put(str, false);
        RewardedAd.load(ContextProvider.getInstance().getApplicationContext(), str, createAdRequest(), new AdMobRewardedVideoAdLoadListener(this, str, rewardedVideoSmashListener));
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void initInterstitial(String str, String str2, final JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        final String optString = jSONObject.optString("adUnitId");
        if (TextUtils.isEmpty(optString)) {
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params: 'adUnitId' ", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + optString);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.AdMobAdapter.6
            @Override // java.lang.Runnable
            public void run() {
                AdMobAdapter.this.mAdUnitIdToInterstitialListener.put(optString, interstitialSmashListener);
                if (AdMobAdapter.mInitState != InitState.INIT_STATE_SUCCESS) {
                    if (AdMobAdapter.mInitState != InitState.INIT_STATE_FAILED) {
                        AdMobAdapter.this.initSDK(jSONObject);
                        return;
                    }
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("onInterstitialInitFailed - placementName = " + optString);
                    interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("AdMob sdk init failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                }
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.verbose("onInterstitialInitSuccess - placementName = " + optString);
                interstitialSmashListener.onInterstitialInitSuccess();
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void loadInterstitial(final JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.AdMobAdapter.7
            @Override // java.lang.Runnable
            public void run() {
                String optString = jSONObject.optString("adUnitId");
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("adUnitId = " + optString);
                AdMobAdapter.this.mInterstitialAdsAvailability.put(optString, false);
                InterstitialAd.load(ContextProvider.getInstance().getApplicationContext(), optString, AdMobAdapter.this.createAdRequest(), new AdMobInterstitialAdLoadListener(AdMobAdapter.this, optString, interstitialSmashListener));
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void showInterstitial(final JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.AdMobAdapter.8
            @Override // java.lang.Runnable
            public void run() {
                String optString = jSONObject.optString("adUnitId");
                InterstitialAd interstitialAd = AdMobAdapter.this.getInterstitialAd(optString);
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("adUnitId = " + optString);
                if (interstitialAd != null && AdMobAdapter.this.isInterstitialReadyForAdUnitId(optString)) {
                    IronLog.ADAPTER_API.verbose("show");
                    interstitialAd.setFullScreenContentCallback(new AdMobInterstitialAdShowListener(AdMobAdapter.this, interstitialSmashListener, optString));
                    interstitialAd.show(ContextProvider.getInstance().getCurrentActiveActivity());
                } else {
                    InterstitialSmashListener interstitialSmashListener2 = interstitialSmashListener;
                    int i = AdMobAdapter.IS_NOT_READY_ERROR_CODE;
                    interstitialSmashListener2.onInterstitialAdShowFailed(new IronSourceError(i, AdMobAdapter.this.getProviderName() + "showInterstitial is not ready " + optString));
                }
                AdMobAdapter.this.mInterstitialAdsAvailability.put(optString, false);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public final boolean isInterstitialReady(JSONObject jSONObject) {
        return isInterstitialReadyForAdUnitId(jSONObject.optString("adUnitId"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInterstitialReadyForAdUnitId(String str) {
        if (this.mInterstitialAdsAvailability.get(str) != null) {
            return this.mInterstitialAdsAvailability.get(str).booleanValue();
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBanners(String str, String str2, final JSONObject jSONObject, final BannerSmashListener bannerSmashListener) {
        final String optString = jSONObject.optString("adUnitId");
        if (TextUtils.isEmpty(optString)) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("AdMobAdapter loadBanner adUnitId is empty", IronSourceConstants.BANNER_AD_UNIT));
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + optString);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.AdMobAdapter.9
            @Override // java.lang.Runnable
            public void run() {
                AdMobAdapter.this.mAdUnitIdToBannerListener.put(optString, bannerSmashListener);
                if (AdMobAdapter.mInitState != InitState.INIT_STATE_SUCCESS) {
                    if (AdMobAdapter.mInitState != InitState.INIT_STATE_FAILED) {
                        AdMobAdapter.this.initSDK(jSONObject);
                        return;
                    }
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("onBannerInitFailed - placementName = " + optString);
                    bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("AdMob sdk init failed", IronSourceConstants.BANNER_AD_UNIT));
                    return;
                }
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.verbose("onBannerInitSuccess - placementName = " + optString);
                bannerSmashListener.onBannerInitSuccess();
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBanner(final IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, final BannerSmashListener bannerSmashListener) {
        if (ironSourceBannerLayout == null) {
            IronLog.ADAPTER_API.error("banner == null");
            return;
        }
        final String optString = jSONObject.optString("adUnitId");
        final AdSize adSize = getAdSize(ironSourceBannerLayout.getSize(), AdapterUtils.isLargeScreen(ironSourceBannerLayout.getActivity()));
        if (adSize == null) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize("AdMob"));
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + optString);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.AdMobAdapter.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdView adView = new AdView(ironSourceBannerLayout.getActivity());
                    adView.setAdSize(adSize);
                    adView.setAdUnitId(optString);
                    adView.setAdListener(new AdMobBannerAdListener(AdMobAdapter.this, bannerSmashListener, optString, adView));
                    AdMobAdapter.this.mAdIdToBannerAd.put(optString, adView);
                    AdRequest createAdRequest = AdMobAdapter.this.createAdRequest();
                    IronLog.ADAPTER_API.verbose("loadAd");
                    adView.loadAd(createAdRequest);
                } catch (Exception e) {
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("AdMobAdapter loadBanner exception " + e.getMessage()));
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, final JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        final String optString = jSONObject.optString("adUnitId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("adUnitId = " + optString);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.AdMobAdapter.11
            @Override // java.lang.Runnable
            public void run() {
                if (AdMobAdapter.this.mAdIdToBannerAd.get(jSONObject.optString("adUnitId")) != null) {
                    AdRequest createAdRequest = AdMobAdapter.this.createAdRequest();
                    AdView adView = (AdView) AdMobAdapter.this.mAdIdToBannerAd.get(jSONObject.optString("adUnitId"));
                    if (adView == null) {
                        if (AdMobAdapter.this.mAdUnitIdToBannerListener.containsKey(optString)) {
                            int i = AdMobAdapter.BN_FAILED_TO_RELOAD_ERROR_CODE;
                            ((BannerSmashListener) AdMobAdapter.this.mAdUnitIdToBannerListener.get(optString)).onBannerAdLoadFailed(new IronSourceError(i, AdMobAdapter.this.getProviderName() + "reloadBanner missing banner " + optString));
                            return;
                        }
                        return;
                    }
                    adView.loadAd(createAdRequest);
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void destroyBanner(final JSONObject jSONObject) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.AdMobAdapter.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String optString = jSONObject.optString("adUnitId");
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose("adUnitId = " + optString);
                    if (AdMobAdapter.this.mAdIdToBannerAd.containsKey(optString)) {
                        ((AdView) AdMobAdapter.this.mAdIdToBannerAd.get(optString)).destroy();
                        AdMobAdapter.this.mAdIdToBannerAd.remove(optString);
                    }
                } catch (Exception e) {
                    IronLog ironLog2 = IronLog.ADAPTER_API;
                    ironLog2.error("e = " + e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AdRequest createAdRequest() {
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.setRequestAgent("ironSource");
        setRequestConfiguration();
        if (mConsent != null || mCCPAValue != null) {
            Bundle bundle = new Bundle();
            Boolean bool = mConsent;
            if (bool != null && !bool.booleanValue()) {
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("mConsent = " + mConsent);
                bundle.putString("npa", "1");
            }
            if (mCCPAValue != null) {
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.verbose("mCCPAValue = " + mCCPAValue);
                bundle.putInt("rdp", mCCPAValue.booleanValue() ? 1 : 0);
            }
            builder.addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle);
        }
        return builder.build();
    }

    private void setRequestConfiguration() {
        RequestConfiguration.Builder builder = MobileAds.getRequestConfiguration().toBuilder();
        Integer num = mCoppaValue;
        RequestConfiguration build = num != null ? builder.setTagForChildDirectedTreatment(num.intValue()).build() : null;
        Integer num2 = mEuValue;
        if (num2 != null) {
            build = builder.setTagForUnderAgeOfConsent(num2.intValue()).build();
        }
        if (!TextUtils.isEmpty(mRatingValue)) {
            build = builder.setMaxAdContentRating(mRatingValue).build();
        }
        if (build != null) {
            MobileAds.setRequestConfiguration(build);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private AdSize getAdSize(ISBannerSize iSBannerSize, boolean z) {
        char c;
        String description = iSBannerSize.getDescription();
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals("RECTANGLE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 72205083:
                if (description.equals("LARGE")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 79011241:
                if (description.equals("SMART")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (description.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1999208305:
                if (description.equals("CUSTOM")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        return z ? AdSize.LEADERBOARD : AdSize.BANNER;
                    } else if (c != 4) {
                        return null;
                    } else {
                        return new AdSize(iSBannerSize.getWidth(), iSBannerSize.getHeight());
                    }
                }
                return AdSize.MEDIUM_RECTANGLE;
            }
            return AdSize.LARGE_BANNER;
        }
        return AdSize.BANNER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterstitialAd getInterstitialAd(String str) {
        if (TextUtils.isEmpty(str) || !this.mAdIdToInterstitialAd.containsKey(str)) {
            return null;
        }
        return this.mAdIdToInterstitialAd.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("consent = " + z);
        mConsent = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        String str2 = list.get(0);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("key = " + str + ", value = " + str2);
        if (MetaDataUtils.isValidCCPAMetaData(str, str2)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str2));
        } else {
            setAdMobMetaDataValue(str.toLowerCase(Locale.ENGLISH), str2.toLowerCase(Locale.ENGLISH));
        }
    }

    private void setCCPAValue(boolean z) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + z);
        mCCPAValue = Boolean.valueOf(z);
    }

    private void setAdMobMetaDataValue(String str, String str2) {
        if (str == AdMobMetaDataFlags.ADMOB_TFCD_KEY || str == AdMobMetaDataFlags.ADMOB_TFUA_KEY) {
            String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
            if (TextUtils.isEmpty(formatValueForType)) {
                IronLog.ADAPTER_API.verbose("MetaData value for key " + str + " is invalid " + str2);
                return;
            }
            str2 = formatValueForType;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -139240332) {
            if (hashCode != 1374613845) {
                if (hashCode == 1374614400 && str.equals(AdMobMetaDataFlags.ADMOB_TFUA_KEY)) {
                    c = 1;
                }
            } else if (str.equals(AdMobMetaDataFlags.ADMOB_TFCD_KEY)) {
                c = 0;
            }
        } else if (str.equals(AdMobMetaDataFlags.ADMOB_MAX_RATING_KEY)) {
            c = 2;
        }
        if (c == 0) {
            mCoppaValue = Integer.valueOf(getAdMobCoppaValue(str2));
            IronLog.ADAPTER_API.verbose("key = " + str + ", coppaValue = " + mCoppaValue);
        } else if (c == 1) {
            mEuValue = Integer.valueOf(getAdMobEuValue(str2));
            IronLog.ADAPTER_API.verbose("key = " + str + ", euValue = " + mEuValue);
        } else if (c == 2) {
            mRatingValue = getAdMobRatingValue(str2);
            IronLog.ADAPTER_API.verbose("key = " + str + ", ratingValue = " + mRatingValue);
        }
        setRequestConfiguration();
    }

    private int getAdMobCoppaValue(String str) {
        return MetaDataUtils.getMetaDataBooleanValue(str) ? 1 : 0;
    }

    private int getAdMobEuValue(String str) {
        return MetaDataUtils.getMetaDataBooleanValue(str) ? 1 : 0;
    }

    private String getAdMobRatingValue(String str) {
        if (TextUtils.isEmpty(str)) {
            IronLog.INTERNAL.error("The ratingValue is null");
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1038878193:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_MA)) {
                    c = 3;
                    break;
                }
                break;
            case -1038878094:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_PG)) {
                    c = 1;
                    break;
                }
                break;
            case 936319116:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_G)) {
                    c = 0;
                    break;
                }
                break;
            case 936319129:
                if (str.equals(AdMobMaxContentRating.ADMOB_MAX_AD_CONTENT_RATING_T)) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        IronLog.INTERNAL.error("The ratingValue = " + str + " is undefine");
                        return "";
                    }
                    return RequestConfiguration.MAX_AD_CONTENT_RATING_MA;
                }
                return RequestConfiguration.MAX_AD_CONTENT_RATING_T;
            }
            return RequestConfiguration.MAX_AD_CONTENT_RATING_PG;
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializationSuccess() {
        mInitState = InitState.INIT_STATE_SUCCESS;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializationFailure() {
        mInitState = InitState.INIT_STATE_FAILED;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed(null);
        }
        initCallbackListeners.clear();
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        for (InterstitialSmashListener interstitialSmashListener : this.mAdUnitIdToInterstitialListener.values()) {
            interstitialSmashListener.onInterstitialInitSuccess();
        }
        for (BannerSmashListener bannerSmashListener : this.mAdUnitIdToBannerListener.values()) {
            bannerSmashListener.onBannerInitSuccess();
        }
        for (String str : this.mAdUnitIdToRewardedVideoListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mAdUnitIdToRewardedVideoListener.get(str);
            if (this.mRewardedVideoPlacementsForInitCallbacks.contains(str)) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideoAdFromAdMob(str, rewardedVideoSmashListener);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        for (InterstitialSmashListener interstitialSmashListener : this.mAdUnitIdToInterstitialListener.values()) {
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("AdMob sdk init failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        for (BannerSmashListener bannerSmashListener : this.mAdUnitIdToBannerListener.values()) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("AdMob sdk init failed", IronSourceConstants.BANNER_AD_UNIT));
        }
        for (String str2 : this.mAdUnitIdToRewardedVideoListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mAdUnitIdToRewardedVideoListener.get(str2);
            if (this.mRewardedVideoPlacementsForInitCallbacks.contains(str2)) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("AdMob sdk init failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + ad_unit);
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            for (RewardedAd rewardedAd : this.mAdIdToRewardedVideoAd.values()) {
                rewardedAd.setFullScreenContentCallback(null);
            }
            this.mAdIdToRewardedVideoAd.clear();
            this.mAdUnitIdToRewardedVideoListener.clear();
            this.mRewardedVideoAdsAvailability.clear();
            this.mRewardedVideoPlacementsForInitCallbacks.clear();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            for (InterstitialAd interstitialAd : this.mAdIdToInterstitialAd.values()) {
                interstitialAd.setFullScreenContentCallback(null);
            }
            this.mAdIdToInterstitialAd.clear();
            this.mAdUnitIdToInterstitialListener.clear();
            this.mInterstitialAdsAvailability.clear();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            for (AdView adView : this.mAdIdToBannerAd.values()) {
                adView.destroy();
            }
            this.mAdIdToBannerAd.clear();
            this.mAdUnitIdToBannerListener.clear();
        }
    }
}
