package com.ironsource.adapters.vungle;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.adapters.vungle.VungleBannerListener;
import com.ironsource.adapters.vungle.VungleInterstitialLoadListener;
import com.ironsource.adapters.vungle.VungleInterstitialPlayListener;
import com.ironsource.adapters.vungle.VungleRewardedVideoLoadListener;
import com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener;
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
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.warren.AdConfig;
import com.vungle.warren.BannerAdConfig;
import com.vungle.warren.Banners;
import com.vungle.warren.InitCallback;
import com.vungle.warren.Plugin;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class VungleAdapter extends AbstractAdapter implements INetworkInitCallbackListener, InitCallback, VungleBannerListener.BannerListener, VungleInterstitialLoadListener.InterstitialListener, VungleInterstitialPlayListener.InterstitialListener, VungleRewardedVideoLoadListener.RewardedVideoListener, VungleRewardedVideoPlayListener.RewardedVideoListener {
    private static final String APP_ID = "AppID";
    private static final String CONSENT_MESSAGE_VERSION = "1.0.0";
    private static final String GitHash = "611c6b7ce";
    private static final String ORIENTATION_AUTO_ROTATE = "AUTO_ROTATE";
    private static final String ORIENTATION_FLAG = "vungle_adorientation";
    private static final String ORIENTATION_LANDSCAPE = "LANDSCAPE";
    private static final String ORIENTATION_PORTRAIT = "PORTRAIT";
    private static final String PLACEMENT_ID = "PlacementId";
    private static final String VERSION = "4.3.12";
    private static Set<String> mInitiatedAdUnits;
    private ISBannerSize mCurrentBannerSize;
    private ConcurrentHashMap<String, String> mPlacementIdToBannerServerData;
    private ConcurrentHashMap<String, BannerSmashListener> mPlacementIdToBannerSmashListener;
    private ConcurrentHashMap<String, String> mPlacementIdToInterstitialServerData;
    private ConcurrentHashMap<String, InterstitialSmashListener> mPlacementIdToInterstitialSmashListener;
    private ConcurrentHashMap<String, String> mPlacementIdToRewardedVideoServerData;
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mPlacementIdToRewardedVideoSmashListener;
    private CopyOnWriteArraySet<String> mRewardedVideoPlacementsForInitCallbacks;
    private static EInitState mInitState = EInitState.NOT_INIT;
    private static Boolean mIsConsent = null;
    private static Boolean mCCPA = null;
    private static AtomicBoolean mInitCalled = new AtomicBoolean(false);
    private static String mAdOrientation = null;
    private static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum EInitState {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        INIT_FAIL
    }

    public static String getAdapterSDKVersion() {
        return com.vungle.warren.BuildConfig.VERSION_NAME;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "4.3.12";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean shouldBindBannerViewOnReload() {
        return true;
    }

    public static VungleAdapter startAdapter(String str) {
        return new VungleAdapter(str);
    }

    private VungleAdapter(String str) {
        super(str);
        this.mCurrentBannerSize = null;
        this.mPlacementIdToRewardedVideoSmashListener = new ConcurrentHashMap<>();
        this.mPlacementIdToRewardedVideoServerData = new ConcurrentHashMap<>();
        this.mPlacementIdToInterstitialSmashListener = new ConcurrentHashMap<>();
        this.mPlacementIdToInterstitialServerData = new ConcurrentHashMap<>();
        this.mPlacementIdToBannerSmashListener = new ConcurrentHashMap<>();
        this.mPlacementIdToBannerServerData = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK;
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        IntegrationData integrationData = new IntegrationData(com.vungle.warren.BuildConfig.OMSDK_PARTNER_NAME, "4.3.12");
        integrationData.validateWriteExternalStorage = true;
        return integrationData;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z) {
        if (mInitState == EInitState.INIT_SUCCESS) {
            Vungle.updateConsentStatus(z ? Vungle.Consent.OPTED_IN : Vungle.Consent.OPTED_OUT, CONSENT_MESSAGE_VERSION);
        } else {
            mIsConsent = Boolean.valueOf(z);
        }
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
        } else if (str.toLowerCase().equals(ORIENTATION_FLAG)) {
            mAdOrientation = str2;
        }
    }

    private void setCCPAValue(boolean z) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + z);
        if (mInitState == EInitState.INIT_SUCCESS) {
            Vungle.updateCCPAStatus(z ? Vungle.Consent.OPTED_IN : Vungle.Consent.OPTED_OUT);
        } else {
            mCCPA = Boolean.valueOf(z);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            IronLog.ADAPTER_API.verbose("cleaning IS memory");
            this.mPlacementIdToInterstitialSmashListener.clear();
            this.mPlacementIdToInterstitialServerData.clear();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog.ADAPTER_API.verbose("cleaning RV memory");
            this.mPlacementIdToRewardedVideoSmashListener.clear();
            this.mPlacementIdToRewardedVideoServerData.clear();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.INTERNAL.verbose("");
        String optString = jSONObject.optString(PLACEMENT_ID);
        String optString2 = jSONObject.optString(APP_ID);
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.error("Vungle listener is null");
        } else if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("placement is empty");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing PlacementId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("appId is empty");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing AppID", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else {
            VungleSingletonAdapter.getInstance().addRewardedVideoListener(optString, new WeakReference<>(this));
            this.mPlacementIdToRewardedVideoSmashListener.put(optString, rewardedVideoSmashListener);
            this.mRewardedVideoPlacementsForInitCallbacks.add(optString);
            addInitiatedAdUnit(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            if (mInitState == EInitState.INIT_SUCCESS) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else if (mInitState == EInitState.INIT_FAIL) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Vungle Sdk failed to initiate", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                initVungleSdk(optString2);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.INTERNAL.verbose("");
        String optString = jSONObject.optString(PLACEMENT_ID);
        String optString2 = jSONObject.optString(APP_ID);
        if (rewardedVideoSmashListener == null) {
            IronLog.ADAPTER_API.verbose("Vungle listener is null");
        } else if (TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString)) {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else {
            VungleSingletonAdapter.getInstance().addRewardedVideoListener(optString, new WeakReference<>(this));
            this.mPlacementIdToRewardedVideoSmashListener.put(optString, rewardedVideoSmashListener);
            addInitiatedAdUnit(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            if (mInitState == EInitState.INIT_SUCCESS) {
                if (isAdAvailableInternal(optString)) {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose(": able to play placementId " + optString);
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(true);
                    return;
                }
                loadRewardedVideoAd(optString);
            } else if (mInitState == EInitState.INIT_FAIL) {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            } else {
                initVungleSdk(optString2);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        if (TextUtils.isEmpty(optString)) {
            IronLog.ADAPTER_API.verbose("onRewardedVideoAvailabilityChanged(false) - placement is null");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "placement is null"));
            return;
        }
        this.mPlacementIdToRewardedVideoServerData.put(optString, str);
        loadRewardedVideoAd(optString);
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        if (TextUtils.isEmpty(optString)) {
            IronLog.ADAPTER_API.verbose("onRewardedVideoAvailabilityChanged(false) - placement is null");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else if (isAdAvailableInternal(optString)) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.verbose("ad already cached for placement Id " + optString);
            this.mPlacementIdToRewardedVideoSmashListener.get(optString).onRewardedVideoAvailabilityChanged(true);
        } else if (this.mPlacementIdToRewardedVideoSmashListener.containsKey(optString)) {
            loadRewardedVideoAd(optString);
        }
    }

    private void loadRewardedVideoAd(String str) {
        String str2 = this.mPlacementIdToRewardedVideoServerData.get(str);
        if (!TextUtils.isEmpty(str2)) {
            Vungle.loadAd(str, str2, createAdConfig(), VungleSingletonAdapter.getInstance().createRewardedVideoLoadListener());
        } else {
            Vungle.loadAd(str, VungleSingletonAdapter.getInstance().createRewardedVideoLoadListener());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        String str = this.mPlacementIdToRewardedVideoServerData.get(optString);
        AdConfig createAdConfig = createAdConfig();
        if (isAdAvailableInternal(optString)) {
            if (!TextUtils.isEmpty(getDynamicUserId())) {
                Vungle.setIncentivizedFields(getDynamicUserId(), null, null, null, null);
            }
            if (!TextUtils.isEmpty(str)) {
                Vungle.playAd(optString, str, createAdConfig, VungleSingletonAdapter.getInstance().createRewardedVideoPlayListener());
            } else {
                Vungle.playAd(optString, createAdConfig, VungleSingletonAdapter.getInstance().createRewardedVideoPlayListener());
            }
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        return Vungle.isInitialized() && this.mPlacementIdToRewardedVideoSmashListener.containsKey(optString) && isAdAvailableInternal(optString);
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoLoadListener.RewardedVideoListener
    public void onRewardedVideoLoadSuccess(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mPlacementIdToRewardedVideoSmashListener.get(str);
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoLoadListener.RewardedVideoListener
    public void onRewardedVideoLoadError(String str, VungleException vungleException) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str + ", exception = " + vungleException);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mPlacementIdToRewardedVideoSmashListener.get(str);
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            try {
                rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(vungleException.getExceptionCode(), vungleException.getLocalizedMessage()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoShowError(String str, VungleException vungleException) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str + ", exception = " + vungleException);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mPlacementIdToRewardedVideoSmashListener.get(str);
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoAdStart(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoAdEnd(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mPlacementIdToRewardedVideoSmashListener.get(str);
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdEnded();
            rewardedVideoSmashListener.onRewardedVideoAdClosed();
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoAdClick(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mPlacementIdToRewardedVideoSmashListener.get(str);
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mPlacementIdToRewardedVideoSmashListener.get(str);
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdRewarded();
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleRewardedVideoPlayListener.RewardedVideoListener
    public void onRewardedVideoAdViewed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mPlacementIdToRewardedVideoSmashListener.get(str);
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdOpened();
            rewardedVideoSmashListener.onRewardedVideoAdStarted();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        initInterstitial(str, str2, jSONObject, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        String optString2 = jSONObject.optString(APP_ID);
        if (TextUtils.isEmpty(optString2)) {
            if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params appId", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } else if (TextUtils.isEmpty(optString)) {
            if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params placementId", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("placementId = " + optString);
            VungleSingletonAdapter.getInstance().addInterstitialListener(optString, new WeakReference<>(this));
            this.mPlacementIdToInterstitialSmashListener.put(optString, interstitialSmashListener);
            addInitiatedAdUnit(IronSourceConstants.INTERSTITIAL_AD_UNIT);
            if (mInitState == EInitState.INIT_SUCCESS) {
                interstitialSmashListener.onInterstitialInitSuccess();
            } else if (mInitState == EInitState.INIT_FAIL) {
                interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Init Failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                initVungleSdk(optString2);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placementId = " + optString);
        if (TextUtils.isEmpty(optString)) {
            interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("placement is empty"));
            return;
        }
        this.mPlacementIdToInterstitialServerData.put(optString, str);
        loadInterstitialInternal(optString, interstitialSmashListener, str);
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placementId = " + optString);
        if (TextUtils.isEmpty(optString)) {
            interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("placement is empty"));
        } else {
            loadInterstitialInternal(optString, interstitialSmashListener, this.mPlacementIdToInterstitialServerData.get(optString));
        }
    }

    private void loadInterstitialInternal(String str, InterstitialSmashListener interstitialSmashListener, String str2) {
        AdConfig createAdConfig = createAdConfig();
        if (!TextUtils.isEmpty(str2)) {
            Vungle.loadAd(str, str2, createAdConfig, VungleSingletonAdapter.getInstance().createInterstitialLoadListener());
        } else {
            Vungle.loadAd(str, VungleSingletonAdapter.getInstance().createInterstitialLoadListener());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        String str = this.mPlacementIdToInterstitialServerData.get(optString);
        if (isAdAvailableInternal(optString)) {
            AdConfig createAdConfig = createAdConfig();
            if (!TextUtils.isEmpty(str)) {
                Vungle.playAd(optString, str, createAdConfig, VungleSingletonAdapter.getInstance().createInterstitialPlayListener());
                return;
            } else {
                Vungle.playAd(optString, createAdConfig, VungleSingletonAdapter.getInstance().createInterstitialPlayListener());
                return;
            }
        }
        interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public boolean isInterstitialReady(JSONObject jSONObject) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        return Vungle.isInitialized() && this.mPlacementIdToInterstitialSmashListener.containsKey(optString) && isAdAvailableInternal(optString);
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialLoadListener.InterstitialListener
    public void onInterstitialLoadSuccess(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        InterstitialSmashListener interstitialSmashListener = this.mPlacementIdToInterstitialSmashListener.get(str);
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdReady();
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialLoadListener.InterstitialListener
    public void onInterstitialLoadError(String str, VungleException vungleException) {
        String str2 = " reason = " + vungleException.getLocalizedMessage() + " errorCode = " + vungleException.getExceptionCode();
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + str + ", " + str2);
        InterstitialSmashListener interstitialSmashListener = this.mPlacementIdToInterstitialSmashListener.get(str);
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Error loading Ad - " + str2));
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialPlayListener.InterstitialListener
    public void onInterstitialPlayError(String str, VungleException vungleException) {
        String str2 = " reason = " + vungleException.getLocalizedMessage() + " errorCode = " + vungleException.getExceptionCode();
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + str + ", " + str2);
        InterstitialSmashListener interstitialSmashListener = this.mPlacementIdToInterstitialSmashListener.get(str);
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, str2));
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialPlayListener.InterstitialListener
    public void onInterstitialAdStart(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialPlayListener.InterstitialListener
    public void onInterstitialAdEnd(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        InterstitialSmashListener interstitialSmashListener = this.mPlacementIdToInterstitialSmashListener.get(str);
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialPlayListener.InterstitialListener
    public void onInterstitialAdClick(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        InterstitialSmashListener interstitialSmashListener = this.mPlacementIdToInterstitialSmashListener.get(str);
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleInterstitialPlayListener.InterstitialListener
    public void onInterstitialAdViewed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        InterstitialSmashListener interstitialSmashListener = this.mPlacementIdToInterstitialSmashListener.get(str);
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdOpened();
            interstitialSmashListener.onInterstitialAdShowSucceeded();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    private void initBannersInternal(JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        String optString2 = jSONObject.optString(APP_ID);
        if (TextUtils.isEmpty(optString2)) {
            if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params appId", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } else if (TextUtils.isEmpty(optString)) {
            if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params placementId", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("placementId = " + optString);
            VungleSingletonAdapter.getInstance().addBannerListener(optString, new WeakReference<>(this));
            this.mPlacementIdToBannerSmashListener.put(optString, bannerSmashListener);
            addInitiatedAdUnit(IronSourceConstants.BANNER_AD_UNIT);
            if (mInitState == EInitState.INIT_SUCCESS) {
                bannerSmashListener.onBannerInitSuccess();
            } else if (mInitState == EInitState.INIT_FAIL) {
                bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Init Failed", IronSourceConstants.BANNER_AD_UNIT));
            } else {
                initVungleSdk(optString2);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placementId = " + optString);
        if (TextUtils.isEmpty(optString)) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildInitFailedError("Missing params placementId", IronSourceConstants.BANNER_AD_UNIT));
            return;
        }
        this.mPlacementIdToBannerServerData.put(optString, str);
        loadBannerInternal(optString, ironSourceBannerLayout, jSONObject, bannerSmashListener, str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placementId = " + optString);
        if (TextUtils.isEmpty(optString)) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildInitFailedError("Missing params placementId", IronSourceConstants.BANNER_AD_UNIT));
        } else {
            loadBannerInternal(optString, ironSourceBannerLayout, jSONObject, bannerSmashListener, null);
        }
    }

    private void loadBannerInternal(final String str, final IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, final String str2) {
        if (!isBannerSizeSupported(ironSourceBannerLayout.getSize())) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("size not supported, size = " + ironSourceBannerLayout.getSize().getDescription());
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
            return;
        }
        this.mCurrentBannerSize = ironSourceBannerLayout.getSize();
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.vungle.VungleAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                AdConfig.AdSize bannerSize = VungleAdapter.this.getBannerSize(ironSourceBannerLayout.getSize());
                BannerAdConfig bannerAdConfig = new BannerAdConfig(bannerSize);
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.verbose("bannerSize = " + bannerSize);
                VungleBanner bannerAdView = VungleSingletonAdapter.getInstance().getBannerAdView(str);
                if (bannerAdView != null) {
                    bannerAdView.destroyAd();
                }
                if (!TextUtils.isEmpty(str2)) {
                    Banners.loadBanner(str, str2, bannerAdConfig, VungleSingletonAdapter.getInstance().createBannerListener());
                } else {
                    Banners.loadBanner(str, bannerAdConfig, VungleSingletonAdapter.getInstance().createBannerListener());
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        BannerSmashListener bannerSmashListener2 = this.mPlacementIdToBannerSmashListener.get(optString);
        if (bannerSmashListener2 != null) {
            if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                loadBanner(ironSourceBannerLayout, jSONObject, bannerSmashListener2);
                return;
            }
            IronLog.ADAPTER_API.verbose("reload failed no banner layout");
            bannerSmashListener2.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(getProviderName() + " reload failed no banner layout"));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void destroyBanner(JSONObject jSONObject) {
        final String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString);
        if (this.mCurrentBannerSize == null) {
            IronLog.ADAPTER_API.verbose("mCurrentBannerSize is null");
        } else {
            postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.vungle.VungleAdapter.2
                @Override // java.lang.Runnable
                public void run() {
                    VungleBanner bannerAdView = VungleSingletonAdapter.getInstance().getBannerAdView(optString);
                    if (bannerAdView != null) {
                        bannerAdView.destroyAd();
                        VungleSingletonAdapter.getInstance().removeBannerAdView(optString);
                    }
                    VungleAdapter.this.mCurrentBannerSize = null;
                }
            });
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleBannerListener.BannerListener
    public void onBannerLoadSuccess(String str) {
        ISBannerSize iSBannerSize;
        VungleBanner banner;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        BannerSmashListener bannerSmashListener = this.mPlacementIdToBannerSmashListener.get(str);
        if (bannerSmashListener == null || (iSBannerSize = this.mCurrentBannerSize) == null) {
            return;
        }
        AdConfig.AdSize bannerSize = getBannerSize(iSBannerSize);
        IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
        ironLog2.verbose("bannerSize = " + bannerSize);
        if (!isBannerAdAvailableInternal(str, bannerSize)) {
            IronLog.ADAPTER_CALLBACK.error("can't play ad");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(IronSource.AD_UNIT.BANNER.toString(), getProviderName(), "can't play ad"));
            return;
        }
        BannerAdConfig bannerAdConfig = new BannerAdConfig(bannerSize);
        if (bannerSize == AdConfig.AdSize.VUNGLE_MREC) {
            bannerAdConfig.setMuted(true);
        }
        String str2 = this.mPlacementIdToBannerServerData.get(str);
        if (!TextUtils.isEmpty(str2)) {
            banner = Banners.getBanner(str, str2, bannerAdConfig, VungleSingletonAdapter.getInstance().createBannerListener());
        } else {
            banner = Banners.getBanner(str, bannerAdConfig, VungleSingletonAdapter.getInstance().createBannerListener());
        }
        if (banner != null) {
            VungleSingletonAdapter.getInstance().addBannerAdView(str, banner);
            bannerSmashListener.onBannerAdLoaded(banner, getBannerLayoutParams(this.mCurrentBannerSize));
            return;
        }
        IronLog.ADAPTER_CALLBACK.error("banner view is null");
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(getProviderName() + " loadBanner failed - banner view is null"));
    }

    @Override // com.ironsource.adapters.vungle.VungleBannerListener.BannerListener
    public void onBannerError(String str, VungleException vungleException) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str + ", exception = " + vungleException);
        BannerSmashListener bannerSmashListener = this.mPlacementIdToBannerSmashListener.get(str);
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(getProviderName() + " loadBanner - exception = " + vungleException.getLocalizedMessage()));
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleBannerListener.BannerListener
    public void onBannerClick(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        BannerSmashListener bannerSmashListener = this.mPlacementIdToBannerSmashListener.get(str);
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleBannerListener.BannerListener
    public void onBannerLeftApplication(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        BannerSmashListener bannerSmashListener = this.mPlacementIdToBannerSmashListener.get(str);
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdLeftApplication();
        }
    }

    @Override // com.ironsource.adapters.vungle.VungleBannerListener.BannerListener
    public void onBannerAdViewed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("placementId = " + str);
        BannerSmashListener bannerSmashListener = this.mPlacementIdToBannerSmashListener.get(str);
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }

    private void setInitState(EInitState eInitState) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("init state changed from " + mInitState + " to " + eInitState + ")");
        mInitState = eInitState;
    }

    private AdConfig createAdConfig() {
        AdConfig adConfig = new AdConfig();
        String str = mAdOrientation;
        if (str != null) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -784136725) {
                if (hashCode != -77725029) {
                    if (hashCode == 1511893915 && str.equals(ORIENTATION_PORTRAIT)) {
                        c = 0;
                    }
                } else if (str.equals(ORIENTATION_LANDSCAPE)) {
                    c = 1;
                }
            } else if (str.equals(ORIENTATION_AUTO_ROTATE)) {
                c = 2;
            }
            if (c == 0) {
                adConfig.setAdOrientation(0);
            } else if (c == 1) {
                adConfig.setAdOrientation(1);
            } else if (c == 2) {
                adConfig.setAdOrientation(2);
            }
            IronLog.INTERNAL.verbose("setAdOrientation to " + adConfig.getAdOrientation());
        }
        return adConfig;
    }

    private void addInitiatedAdUnit(String str) {
        if (mInitiatedAdUnits == null) {
            mInitiatedAdUnits = new HashSet();
        }
        mInitiatedAdUnits.add(str);
    }

    private void initVungleSdk(String str) {
        if (mInitState == EInitState.NOT_INIT || mInitState == EInitState.INIT_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mInitCalled.compareAndSet(false, true)) {
            Plugin.addWrapperInfo(VungleApiClient.WrapperFramework.ironsource, getVersion());
            setInitState(EInitState.INIT_IN_PROGRESS);
            VungleSingletonAdapter.getInstance().addFirstInitiator(new WeakReference<>(this));
            Vungle.init(str, ContextProvider.getInstance().getApplicationContext(), VungleSingletonAdapter.getInstance());
        }
    }

    @Override // com.vungle.warren.InitCallback
    public void onSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("Succeeded to initialize SDK");
        setInitState(EInitState.INIT_SUCCESS);
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    @Override // com.vungle.warren.InitCallback
    public void onError(VungleException vungleException) {
        IronLog.ADAPTER_CALLBACK.verbose("Failed to initialize SDK");
        setInitState(EInitState.INIT_FAIL);
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed(vungleException.getLocalizedMessage());
        }
        initCallbackListeners.clear();
    }

    @Override // com.vungle.warren.InitCallback
    public void onAutoCacheAdAvailable(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("Cache ad is available for placementId " + str);
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackLoadSuccess(str);
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Boolean bool = mIsConsent;
        if (bool != null) {
            setConsent(bool.booleanValue());
        }
        Boolean bool2 = mCCPA;
        if (bool2 != null) {
            setCCPAValue(bool2.booleanValue());
        }
        Set<String> set = mInitiatedAdUnits;
        if (set != null) {
            if (set.contains(IronSourceConstants.REWARDED_VIDEO_AD_UNIT)) {
                for (Map.Entry<String, RewardedVideoSmashListener> entry : this.mPlacementIdToRewardedVideoSmashListener.entrySet()) {
                    if (this.mRewardedVideoPlacementsForInitCallbacks.contains(entry.getKey())) {
                        entry.getValue().onRewardedVideoInitSuccess();
                    } else {
                        loadRewardedVideoAd(entry.getKey());
                    }
                }
            }
            if (mInitiatedAdUnits.contains(IronSourceConstants.INTERSTITIAL_AD_UNIT)) {
                for (Map.Entry<String, InterstitialSmashListener> entry2 : this.mPlacementIdToInterstitialSmashListener.entrySet()) {
                    if (entry2.getValue() != null) {
                        entry2.getValue().onInterstitialInitSuccess();
                    }
                }
            }
            if (mInitiatedAdUnits.contains(IronSourceConstants.BANNER_AD_UNIT)) {
                for (Map.Entry<String, BannerSmashListener> entry3 : this.mPlacementIdToBannerSmashListener.entrySet()) {
                    if (entry3.getValue() != null) {
                        entry3.getValue().onBannerInitSuccess();
                    }
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        Set<String> set = mInitiatedAdUnits;
        if (set != null) {
            if (set.contains(IronSourceConstants.REWARDED_VIDEO_AD_UNIT)) {
                for (Map.Entry<String, RewardedVideoSmashListener> entry : this.mPlacementIdToRewardedVideoSmashListener.entrySet()) {
                    if (entry.getValue() != null) {
                        if (this.mRewardedVideoPlacementsForInitCallbacks.contains(entry.getKey())) {
                            entry.getValue().onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        } else {
                            entry.getValue().onRewardedVideoAvailabilityChanged(false);
                        }
                    }
                }
            }
            if (mInitiatedAdUnits.contains(IronSourceConstants.INTERSTITIAL_AD_UNIT)) {
                for (Map.Entry<String, InterstitialSmashListener> entry2 : this.mPlacementIdToInterstitialSmashListener.entrySet()) {
                    if (entry2.getValue() != null) {
                        entry2.getValue().onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Vungle failed to init: " + str, IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    }
                }
            }
            if (mInitiatedAdUnits.contains(IronSourceConstants.BANNER_AD_UNIT)) {
                for (Map.Entry<String, BannerSmashListener> entry3 : this.mPlacementIdToBannerSmashListener.entrySet()) {
                    if (entry3.getValue() != null) {
                        entry3.getValue().onBannerInitFailed(ErrorBuilder.buildInitFailedError("Vungle failed to init: " + str, IronSourceConstants.BANNER_AD_UNIT));
                    }
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackLoadSuccess(String str) {
        Set<String> set = mInitiatedAdUnits;
        if (set != null) {
            if (set.contains(IronSourceConstants.REWARDED_VIDEO_AD_UNIT)) {
                for (Map.Entry<String, RewardedVideoSmashListener> entry : this.mPlacementIdToRewardedVideoSmashListener.entrySet()) {
                    if (entry.getKey().equals(str) && entry.getValue() != null && !this.mRewardedVideoPlacementsForInitCallbacks.contains(entry.getKey())) {
                        entry.getValue().onRewardedVideoAvailabilityChanged(true);
                    }
                }
            }
            if (mInitiatedAdUnits.contains(IronSourceConstants.INTERSTITIAL_AD_UNIT)) {
                for (Map.Entry<String, InterstitialSmashListener> entry2 : this.mPlacementIdToInterstitialSmashListener.entrySet()) {
                    if (entry2.getKey().equals(str) && entry2.getValue() != null) {
                        entry2.getValue().onInterstitialAdReady();
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean isBannerSizeSupported(ISBannerSize iSBannerSize) {
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
            default:
                c = 65535;
                break;
        }
        return c == 0 || c == 1 || c == 2 || c == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public AdConfig.AdSize getBannerSize(ISBannerSize iSBannerSize) {
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
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return AdConfig.AdSize.BANNER;
        }
        if (c != 2) {
            if (c != 3) {
                return null;
            }
            return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getCurrentActiveActivity()) ? AdConfig.AdSize.BANNER_LEADERBOARD : AdConfig.AdSize.BANNER;
        }
        return AdConfig.AdSize.VUNGLE_MREC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r8.equals("BANNER") != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.widget.FrameLayout.LayoutParams getBannerLayoutParams(com.ironsource.mediationsdk.ISBannerSize r8) {
        /*
            r7 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = 0
            r0.<init>(r1, r1)
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()
            android.app.Activity r2 = r2.getCurrentActiveActivity()
            java.lang.String r8 = r8.getDescription()
            int r3 = r8.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -387072689: goto L3a;
                case 72205083: goto L30;
                case 79011241: goto L26;
                case 1951953708: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L44
        L1d:
            java.lang.String r3 = "BANNER"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L44
            goto L45
        L26:
            java.lang.String r1 = "SMART"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L44
            r1 = r4
            goto L45
        L30:
            java.lang.String r1 = "LARGE"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L44
            r1 = r6
            goto L45
        L3a:
            java.lang.String r1 = "RECTANGLE"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L44
            r1 = r5
            goto L45
        L44:
            r1 = -1
        L45:
            r8 = 50
            r3 = 320(0x140, float:4.48E-43)
            if (r1 == 0) goto L8a
            if (r1 == r6) goto L8a
            if (r1 == r5) goto L78
            if (r1 == r4) goto L52
            goto L97
        L52:
            boolean r0 = com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(r2)
            if (r0 == 0) goto L6a
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r8 = 728(0x2d8, float:1.02E-42)
            int r8 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r8)
            r1 = 90
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r1)
            r0.<init>(r8, r1)
            goto L97
        L6a:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r3)
            int r8 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r8)
            r0.<init>(r1, r8)
            goto L97
        L78:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r8 = 300(0x12c, float:4.2E-43)
            int r8 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r8)
            r1 = 250(0xfa, float:3.5E-43)
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r1)
            r0.<init>(r8, r1)
            goto L97
        L8a:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r3)
            int r8 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r8)
            r0.<init>(r1, r8)
        L97:
            r8 = 17
            r0.gravity = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.vungle.VungleAdapter.getBannerLayoutParams(com.ironsource.mediationsdk.ISBannerSize):android.widget.FrameLayout$LayoutParams");
    }

    private Map<String, Object> getBiddingData() {
        if (mInitState == EInitState.INIT_FAIL) {
            IronLog.INTERNAL.error("Returning null as token since init failed");
            return null;
        }
        String availableBidTokens = Vungle.getAvailableBidTokens(ContextProvider.getInstance().getApplicationContext());
        if (TextUtils.isEmpty(availableBidTokens)) {
            availableBidTokens = "";
        }
        String coreSDKVersion = getCoreSDKVersion();
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("sdkVersion = " + coreSDKVersion);
        IronLog ironLog2 = IronLog.ADAPTER_API;
        ironLog2.verbose("token = " + availableBidTokens);
        HashMap hashMap = new HashMap();
        hashMap.put("sdkVersion", coreSDKVersion);
        hashMap.put("token", availableBidTokens);
        return hashMap;
    }

    private boolean isAdAvailableInternal(String str) {
        if (this.mPlacementIdToRewardedVideoServerData.containsKey(str)) {
            return Vungle.canPlayAd(str, this.mPlacementIdToRewardedVideoServerData.get(str));
        }
        if (this.mPlacementIdToInterstitialServerData.containsKey(str)) {
            return Vungle.canPlayAd(str, this.mPlacementIdToInterstitialServerData.get(str));
        }
        return Vungle.canPlayAd(str);
    }

    private boolean isBannerAdAvailableInternal(String str, AdConfig.AdSize adSize) {
        if (this.mPlacementIdToBannerServerData.containsKey(str)) {
            return Banners.canPlayAd(str, this.mPlacementIdToBannerServerData.get(str), adSize);
        }
        return Banners.canPlayAd(str, adSize);
    }
}
