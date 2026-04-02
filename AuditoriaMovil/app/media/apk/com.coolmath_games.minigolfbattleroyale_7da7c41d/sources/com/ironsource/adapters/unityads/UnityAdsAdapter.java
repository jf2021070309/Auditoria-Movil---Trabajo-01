package com.ironsource.adapters.unityads;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.ads.metadata.PlayerMetaData;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class UnityAdsAdapter extends AbstractAdapter implements IUnityAdsInitializationListener, INetworkInitCallbackListener {
    private static final String GitHash = "bd44b2a44";
    private static final String VERSION = "4.3.16";
    private final String CONSENT_CCPA;
    private final String CONSENT_GDPR;
    private final String GAME_ID;
    private final String LWS_SUPPORT_STATE;
    private final String UNITYADS_COPPA;
    private final String UNITYADS_METADATA_COPPA_KEY;
    private final String ZONE_ID;
    protected ConcurrentHashMap<String, Boolean> mInterstitialAdsAvailability;
    private ConcurrentHashMap<String, String> mInterstitialZoneIdToLoadedAdObjectId;
    protected ConcurrentHashMap<String, Boolean> mRewardedVideoAdsAvailability;
    private CopyOnWriteArraySet<String> mRewardedVideoPlacementsForInitCallbacks;
    private ConcurrentHashMap<String, String> mRewardedVideoZoneIdToLoadedAdObjectId;
    private final Object mUnityAdsStorageLock;
    private ConcurrentHashMap<String, BannerView> mZoneIdToBannerAd;
    private ConcurrentHashMap<String, IronSourceBannerLayout> mZoneIdToBannerLayout;
    private ConcurrentHashMap<String, UnityAdsBannerListener> mZoneIdToBannerListener;
    private ConcurrentHashMap<String, BannerSmashListener> mZoneIdToBannerSmashListener;
    private ConcurrentHashMap<String, UnityAdsInterstitialListener> mZoneIdToInterstitialListener;
    private ConcurrentHashMap<String, InterstitialSmashListener> mZoneIdToInterstitialSmashListener;
    private ConcurrentHashMap<String, UnityAdsRewardedVideoListener> mZoneIdToRewardedVideoListener;
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mZoneIdToRewardedVideoSmashListener;
    private static AtomicBoolean mDidInit = new AtomicBoolean(false);
    private static EInitState mInitState = EInitState.NOT_INIT;
    private static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();
    private static Boolean mConsentCollectingUserData = null;
    private static Boolean mCCPACollectingUserData = null;
    private static Boolean mCOPPACollectingUserData = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum EInitState {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        INIT_FAIL
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "4.3.16";
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackLoadSuccess(String str) {
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean shouldBindBannerViewOnReload() {
        return true;
    }

    public static UnityAdsAdapter startAdapter(String str) {
        return new UnityAdsAdapter(str);
    }

    private UnityAdsAdapter(String str) {
        super(str);
        this.GAME_ID = "sourceId";
        this.ZONE_ID = "zoneId";
        this.CONSENT_GDPR = "gdpr.consent";
        this.CONSENT_CCPA = "privacy.consent";
        this.UNITYADS_COPPA = "user.nonBehavioral";
        this.UNITYADS_METADATA_COPPA_KEY = "unityads_coppa";
        this.LWS_SUPPORT_STATE = "isSupportedLWS";
        this.mUnityAdsStorageLock = new Object();
        this.mZoneIdToRewardedVideoSmashListener = new ConcurrentHashMap<>();
        this.mZoneIdToRewardedVideoListener = new ConcurrentHashMap<>();
        this.mRewardedVideoZoneIdToLoadedAdObjectId = new ConcurrentHashMap<>();
        this.mRewardedVideoAdsAvailability = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mZoneIdToInterstitialSmashListener = new ConcurrentHashMap<>();
        this.mZoneIdToInterstitialListener = new ConcurrentHashMap<>();
        this.mInterstitialZoneIdToLoadedAdObjectId = new ConcurrentHashMap<>();
        this.mInterstitialAdsAvailability = new ConcurrentHashMap<>();
        this.mZoneIdToBannerSmashListener = new ConcurrentHashMap<>();
        this.mZoneIdToBannerListener = new ConcurrentHashMap<>();
        this.mZoneIdToBannerAd = new ConcurrentHashMap<>();
        this.mZoneIdToBannerLayout = new ConcurrentHashMap<>();
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        IntegrationData integrationData = new IntegrationData("UnityAds", "4.3.16");
        integrationData.activities = new String[]{"com.unity3d.services.ads.adunit.AdUnitActivity", "com.unity3d.services.ads.adunit.AdUnitTransparentActivity", "com.unity3d.services.ads.adunit.AdUnitTransparentSoftwareActivity", "com.unity3d.services.ads.adunit.AdUnitSoftwareActivity"};
        return integrationData;
    }

    public static String getAdapterSDKVersion() {
        try {
            return UnityAds.getVersion();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return UnityAds.getVersion();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z) {
        if (mDidInit.get()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("setConsent = " + z);
            setUnityAdsMetaData("gdpr.consent", z);
            return;
        }
        mConsentCollectingUserData = Boolean.valueOf(z);
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
            return;
        }
        String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (isValidCOPPAMetaData(str, formatValueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        }
    }

    private Map<String, Object> getBiddingData() {
        if (EInitState.INIT_SUCCESS != mInitState) {
            IronLog.INTERNAL.verbose("returning null as token since init did not finish successfully");
            return null;
        }
        String token = UnityAds.getToken();
        if (TextUtils.isEmpty(token)) {
            token = "";
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("token = " + token);
        HashMap hashMap = new HashMap();
        hashMap.put("token", token);
        return hashMap;
    }

    private void setUnityAdsMetaData(String str, boolean z) {
        synchronized (this.mUnityAdsStorageLock) {
            com.unity3d.ads.metadata.MetaData metaData = new com.unity3d.ads.metadata.MetaData(ContextProvider.getInstance().getCurrentActiveActivity());
            metaData.set(str, Boolean.valueOf(z));
            metaData.commit();
        }
    }

    private void setCOPPAValue(boolean z) {
        if (mDidInit.get()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("value = " + z);
            setUnityAdsMetaData("user.nonBehavioral", z);
            return;
        }
        mCOPPACollectingUserData = Boolean.valueOf(z);
    }

    private void setCCPAValue(boolean z) {
        if (mDidInit.get()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("value = " + z);
            setUnityAdsMetaData("privacy.consent", z);
            return;
        }
        mCCPACollectingUserData = Boolean.valueOf(z);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + ad_unit);
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.mZoneIdToRewardedVideoSmashListener.clear();
            this.mZoneIdToRewardedVideoListener.clear();
            this.mRewardedVideoZoneIdToLoadedAdObjectId.clear();
            this.mRewardedVideoAdsAvailability.clear();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.mZoneIdToInterstitialSmashListener.clear();
            this.mZoneIdToInterstitialListener.clear();
            this.mInterstitialZoneIdToLoadedAdObjectId.clear();
            this.mInterstitialAdsAvailability.clear();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            for (BannerView bannerView : this.mZoneIdToBannerAd.values()) {
                bannerView.destroy();
            }
            this.mZoneIdToBannerSmashListener.clear();
            this.mZoneIdToBannerListener.clear();
            this.mZoneIdToBannerAd.clear();
            this.mZoneIdToBannerLayout.clear();
        }
    }

    private void initSDK(String str) {
        IronLog.ADAPTER_API.verbose("");
        boolean z = false;
        if (mDidInit.compareAndSet(false, true)) {
            IronLog.ADAPTER_API.verbose("initiating unityAds SDK in manual mode");
            setInitState(EInitState.INIT_IN_PROGRESS);
            synchronized (this.mUnityAdsStorageLock) {
                MediationMetaData mediationMetaData = new MediationMetaData(ContextProvider.getInstance().getCurrentActiveActivity());
                mediationMetaData.setName(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
                mediationMetaData.setVersion(VersionInfo.VERSION);
                mediationMetaData.set(VersionInfo.VERSION, VersionInfo.VERSION);
                mediationMetaData.commit();
            }
            initCallbackListeners.add(this);
            UnityAds.initialize(ContextProvider.getInstance().getApplicationContext(), str, false, true, (IUnityAdsInitializationListener) this);
            try {
                z = isAdaptersDebugEnabled();
            } catch (NoSuchMethodError unused) {
            }
            UnityAds.setDebugMode(z);
            Boolean bool = mConsentCollectingUserData;
            if (bool != null) {
                setConsent(bool.booleanValue());
            }
            Boolean bool2 = mCCPACollectingUserData;
            if (bool2 != null) {
                setCCPAValue(bool2.booleanValue());
            }
            Boolean bool3 = mCOPPACollectingUserData;
            if (bool3 != null) {
                setCOPPAValue(bool3.booleanValue());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("");
        for (String str : this.mZoneIdToRewardedVideoSmashListener.keySet()) {
            if (this.mRewardedVideoPlacementsForInitCallbacks.contains(str)) {
                this.mZoneIdToRewardedVideoSmashListener.get(str).onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideo(str);
            }
        }
        for (InterstitialSmashListener interstitialSmashListener : this.mZoneIdToInterstitialSmashListener.values()) {
            interstitialSmashListener.onInterstitialInitSuccess();
        }
        for (BannerSmashListener bannerSmashListener : this.mZoneIdToBannerSmashListener.values()) {
            bannerSmashListener.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose("");
        for (String str2 : this.mZoneIdToRewardedVideoSmashListener.keySet()) {
            if (this.mRewardedVideoPlacementsForInitCallbacks.contains(str2)) {
                this.mZoneIdToRewardedVideoSmashListener.get(str2).onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                this.mZoneIdToRewardedVideoSmashListener.get(str2).onRewardedVideoAvailabilityChanged(false);
            }
        }
        for (InterstitialSmashListener interstitialSmashListener : this.mZoneIdToInterstitialSmashListener.values()) {
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        for (BannerSmashListener bannerSmashListener : this.mZoneIdToBannerSmashListener.values()) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.BANNER_AD_UNIT));
        }
    }

    private void setInitState(EInitState eInitState) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(":init state changed from " + mInitState + " to " + eInitState + ")");
        mInitState = eInitState;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        String optString = jSONObject.optString("sourceId");
        String optString2 = jSONObject.optString("zoneId");
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.error("null listener");
        } else if (!isSupported()) {
            rewardedVideoSmashListener.onRewardedVideoInitFailed(errorForUnsupportedAdapter(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else if (TextUtils.isEmpty(optString)) {
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params: sourceId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else if (TextUtils.isEmpty(optString2)) {
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params: zoneId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("gameId: <" + optString + "> zoneId: <" + optString2 + ">");
            this.mZoneIdToRewardedVideoListener.put(optString2, new UnityAdsRewardedVideoListener(this, rewardedVideoSmashListener, optString2));
            this.mZoneIdToRewardedVideoSmashListener.put(optString2, rewardedVideoSmashListener);
            this.mRewardedVideoPlacementsForInitCallbacks.add(optString2);
            int i = AnonymousClass1.$SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$EInitState[mInitState.ordinal()];
            if (i == 1) {
                initSDK(optString);
            } else if (i == 2) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else if (i == 3) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("UnityAds Sdk failed to initiate", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (i != 4) {
            } else {
                initCallbackListeners.add(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.adapters.unityads.UnityAdsAdapter$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$EInitState;

        static {
            int[] iArr = new int[EInitState.values().length];
            $SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$EInitState = iArr;
            try {
                iArr[EInitState.NOT_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$EInitState[EInitState.INIT_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$EInitState[EInitState.INIT_FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$EInitState[EInitState.INIT_IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        String optString = jSONObject.optString("sourceId");
        String optString2 = jSONObject.optString("zoneId");
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.error("null listener");
        } else if (!isSupported()) {
            IronLog.ADAPTER_API.error(errorForUnsupportedAdapter(IronSourceConstants.REWARDED_VIDEO_AD_UNIT).getErrorMessage());
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("Missing params: sourceId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("Missing params: zoneId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("gameId: <" + optString + "> zoneId: <" + optString2 + ">");
            this.mZoneIdToRewardedVideoListener.put(optString2, new UnityAdsRewardedVideoListener(this, rewardedVideoSmashListener, optString2));
            this.mZoneIdToRewardedVideoSmashListener.put(optString2, rewardedVideoSmashListener);
            int i = AnonymousClass1.$SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$EInitState[mInitState.ordinal()];
            if (i == 1) {
                initSDK(optString);
            } else if (i == 2) {
                loadRewardedVideo(optString2);
            } else if (i == 3) {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            } else if (i != 4) {
            } else {
                initCallbackListeners.add(this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId: <" + optString + "> state: " + UnityAds.getPlacementState(optString));
        if (this.mZoneIdToRewardedVideoSmashListener.get(optString) == null) {
            IronLog.INTERNAL.error("fetchRewardedVideoForAutomaticLoad: null listener");
        } else {
            loadRewardedVideo(optString);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId: <" + optString + ">");
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.error("showRewardedVideo: null listener");
            return;
        }
        if (isRewardedVideoAvailable(jSONObject)) {
            if (!TextUtils.isEmpty(getDynamicUserId())) {
                synchronized (this.mUnityAdsStorageLock) {
                    PlayerMetaData playerMetaData = new PlayerMetaData(ContextProvider.getInstance().getCurrentActiveActivity());
                    playerMetaData.setServerId(getDynamicUserId());
                    playerMetaData.commit();
                }
            }
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            if (this.mRewardedVideoZoneIdToLoadedAdObjectId.contains(optString)) {
                UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
                unityAdsShowOptions.setObjectId(this.mRewardedVideoZoneIdToLoadedAdObjectId.get(optString));
                UnityAds.show(ContextProvider.getInstance().getCurrentActiveActivity(), optString, unityAdsShowOptions, this.mZoneIdToRewardedVideoListener.get(optString));
            } else {
                UnityAds.show(ContextProvider.getInstance().getCurrentActiveActivity(), optString, this.mZoneIdToRewardedVideoListener.get(optString));
            }
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        this.mRewardedVideoAdsAvailability.put(optString, false);
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        if (!isSupported()) {
            IronLog.ADAPTER_API.error(errorForUnsupportedAdapter(IronSourceConstants.REWARDED_VIDEO_AD_UNIT).getErrorMessage());
            return false;
        }
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId <" + optString + ">  state: " + UnityAds.getPlacementState(optString));
        return this.mRewardedVideoAdsAvailability.containsKey(optString) && this.mRewardedVideoAdsAvailability.get(optString).booleanValue();
    }

    private void loadRewardedVideo(String str) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId: <" + str + ">");
        this.mRewardedVideoAdsAvailability.put(str, false);
        UnityAds.load(str, this.mZoneIdToRewardedVideoListener.get(str));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId: <" + optString + ">");
        this.mRewardedVideoAdsAvailability.put(optString, false);
        String uuid = UUID.randomUUID().toString();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        unityAdsLoadOptions.setAdMarkup(str);
        unityAdsLoadOptions.setObjectId(uuid);
        this.mRewardedVideoZoneIdToLoadedAdObjectId.put(optString, uuid);
        UnityAds.load(optString, unityAdsLoadOptions, this.mZoneIdToRewardedVideoListener.get(optString));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        initInterstitial(str, str2, jSONObject, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        String optString = jSONObject.optString("sourceId");
        String optString2 = jSONObject.optString("zoneId");
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.error("initInterstitial: null listener");
        } else if (!isSupported()) {
            IronSourceError errorForUnsupportedAdapter = errorForUnsupportedAdapter(IronSourceConstants.INTERSTITIAL_AD_UNIT);
            IronLog.ADAPTER_API.error(errorForUnsupportedAdapter.getErrorMessage());
            interstitialSmashListener.onInterstitialInitFailed(errorForUnsupportedAdapter);
        } else if (TextUtils.isEmpty(optString)) {
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params: sourceId", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        } else if (TextUtils.isEmpty(optString2)) {
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params: zoneId", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("gameId: <" + optString + "> zoneId: <" + optString2 + ">");
            this.mZoneIdToInterstitialListener.put(optString2, new UnityAdsInterstitialListener(this, interstitialSmashListener, optString2));
            this.mZoneIdToInterstitialSmashListener.put(optString2, interstitialSmashListener);
            int i = AnonymousClass1.$SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$EInitState[mInitState.ordinal()];
            if (i == 1) {
                initSDK(optString);
            } else if (i == 2) {
                interstitialSmashListener.onInterstitialInitSuccess();
            } else if (i == 3) {
                interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("UnitADs SDK init failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else if (i != 4) {
            } else {
                initCallbackListeners.add(this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        loadInterstitial(jSONObject, interstitialSmashListener, null);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        IronLog.ADAPTER_API.verbose("");
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        String uuid = UUID.randomUUID().toString();
        unityAdsLoadOptions.setAdMarkup(str);
        unityAdsLoadOptions.setObjectId(uuid);
        this.mInterstitialZoneIdToLoadedAdObjectId.put(jSONObject.optString("zoneId"), uuid);
        loadInterstitial(jSONObject, interstitialSmashListener, unityAdsLoadOptions);
    }

    private void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, UnityAdsLoadOptions unityAdsLoadOptions) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId <" + optString + ">: " + UnityAds.getPlacementState(optString));
        if (interstitialSmashListener == null) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("loadInterstitial: null listener for zone Id <" + optString + ">");
            return;
        }
        this.mInterstitialAdsAvailability.put(optString, false);
        if (unityAdsLoadOptions == null) {
            UnityAds.load(optString, this.mZoneIdToInterstitialListener.get(optString));
        } else {
            UnityAds.load(optString, unityAdsLoadOptions, this.mZoneIdToInterstitialListener.get(optString));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId <" + optString + ">");
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.error("initInterstitial: null listener");
        } else if (isInterstitialReady(jSONObject)) {
            this.mInterstitialAdsAvailability.put(optString, false);
            if (this.mInterstitialZoneIdToLoadedAdObjectId.contains(optString)) {
                UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
                unityAdsShowOptions.setObjectId(this.mInterstitialZoneIdToLoadedAdObjectId.get(optString));
                UnityAds.show(ContextProvider.getInstance().getCurrentActiveActivity(), optString, unityAdsShowOptions, this.mZoneIdToInterstitialListener.get(optString));
                return;
            }
            UnityAds.show(ContextProvider.getInstance().getCurrentActiveActivity(), optString, this.mZoneIdToInterstitialListener.get(optString));
        } else {
            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public boolean isInterstitialReady(JSONObject jSONObject) {
        if (!isSupported()) {
            IronLog.ADAPTER_API.error(errorForUnsupportedAdapter(IronSourceConstants.INTERSTITIAL_AD_UNIT).getErrorMessage());
            return false;
        }
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId <" + optString + ">  state: " + UnityAds.getPlacementState(optString));
        return this.mInterstitialAdsAvailability.containsKey(optString) && this.mInterstitialAdsAvailability.get(optString).booleanValue();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        String optString = jSONObject.optString("sourceId");
        String optString2 = jSONObject.optString("zoneId");
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.error("initRewardedVideo: null listener");
        } else if (!isSupported()) {
            IronSourceError errorForUnsupportedAdapter = errorForUnsupportedAdapter(IronSourceConstants.BANNER_AD_UNIT);
            IronLog.ADAPTER_API.error(errorForUnsupportedAdapter.getErrorMessage());
            bannerSmashListener.onBannerInitFailed(errorForUnsupportedAdapter);
        } else if (TextUtils.isEmpty(optString)) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params: sourceId", IronSourceConstants.BANNER_AD_UNIT));
        } else if (TextUtils.isEmpty(optString2)) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params: zoneId", IronSourceConstants.BANNER_AD_UNIT));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("gameId: <" + optString + "> zoneId: <" + optString2 + ">");
            this.mZoneIdToBannerListener.put(optString2, new UnityAdsBannerListener(this, bannerSmashListener, optString2));
            this.mZoneIdToBannerSmashListener.put(optString2, bannerSmashListener);
            int i = AnonymousClass1.$SwitchMap$com$ironsource$adapters$unityads$UnityAdsAdapter$EInitState[mInitState.ordinal()];
            if (i == 1) {
                initSDK(optString);
            } else if (i == 2) {
                bannerSmashListener.onBannerInitSuccess();
            } else if (i == 3) {
                bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("UnitADs SDK init failed", IronSourceConstants.BANNER_AD_UNIT));
            } else if (i != 4) {
            } else {
                initCallbackListeners.add(this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String optString = jSONObject.optString("zoneId");
        if (bannerSmashListener == null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("loadBanner: null listener for placement Id <" + optString + ">");
        } else if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("Missing params: zoneId");
            bannerSmashListener.onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_KEY_NOT_SET, "Missing params: zoneId"));
        } else if (ironSourceBannerLayout == null) {
            IronLog.INTERNAL.error("banner is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner is null"));
        } else if (ironSourceBannerLayout.isDestroyed()) {
            IronLog.INTERNAL.error("banner is destroyed");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner is destroyed"));
        } else if (!isBannerSizeSupported(ironSourceBannerLayout.getSize()).booleanValue()) {
            IronLog.INTERNAL.error("banner size not supported");
            bannerSmashListener.onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, "banner size = " + ironSourceBannerLayout.getSize().getDescription()));
        } else {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.verbose("zoneId = " + optString);
            try {
                this.mZoneIdToBannerLayout.put(optString, ironSourceBannerLayout);
                getBannerView(ironSourceBannerLayout, optString).load();
            } catch (Exception e) {
                IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("UnityAds loadBanner exception - " + e.getMessage());
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.error("error = " + buildLoadFailedError);
                bannerSmashListener.onBannerAdLoadFailed(buildLoadFailedError);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String optString = jSONObject.optString("zoneId");
        BannerSmashListener bannerSmashListener2 = this.mZoneIdToBannerSmashListener.get(optString);
        if (bannerSmashListener2 == null) {
            IronLog.INTERNAL.error("reloadBanner: null listener");
        } else if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("Missing params: zoneId");
            bannerSmashListener2.onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_KEY_NOT_SET, "Missing params: zoneId"));
        } else {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("zoneId =" + optString);
            loadBanner(this.mZoneIdToBannerLayout.get(optString), jSONObject, this.mZoneIdToBannerSmashListener.get(optString));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void destroyBanner(JSONObject jSONObject) {
        String optString = jSONObject.optString("zoneId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + optString);
        if (this.mZoneIdToBannerAd.get(optString) != null) {
            this.mZoneIdToBannerAd.get(optString).destroy();
            this.mZoneIdToBannerAd.remove(optString);
        }
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public void onInitializationComplete() {
        IronLog.ADAPTER_CALLBACK.verbose("");
        setInitState(EInitState.INIT_SUCCESS);
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        IronLog.ADAPTER_CALLBACK.verbose("");
        setInitState(EInitState.INIT_FAIL);
        String str2 = getUnityAdsInitializationErrorCode(unityAdsInitializationError) + str;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed(str2);
        }
        initCallbackListeners.clear();
    }

    private Boolean isBannerSizeSupported(ISBannerSize iSBannerSize) {
        char c;
        String description = iSBannerSize.getDescription();
        int hashCode = description.hashCode();
        if (hashCode == 72205083) {
            if (description.equals("LARGE")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 79011241) {
            if (hashCode == 1951953708 && description.equals("BANNER")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (description.equals("SMART")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0 || c == 1 || c == 2) {
            return true;
        }
        return false;
    }

    private UnityBannerSize getBannerSize(ISBannerSize iSBannerSize, boolean z) {
        char c;
        String description = iSBannerSize.getDescription();
        int hashCode = description.hashCode();
        if (hashCode == 72205083) {
            if (description.equals("LARGE")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 79011241) {
            if (hashCode == 1951953708 && description.equals("BANNER")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (description.equals("SMART")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0 || c == 1) {
            return new UnityBannerSize(320, 50);
        }
        if (c != 2) {
            return null;
        }
        return z ? new UnityBannerSize(728, 90) : new UnityBannerSize(320, 50);
    }

    private BannerView getBannerView(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        if (this.mZoneIdToBannerAd.get(str) != null) {
            this.mZoneIdToBannerAd.get(str).destroy();
            this.mZoneIdToBannerAd.remove(str);
        }
        BannerView bannerView = new BannerView(ContextProvider.getInstance().getCurrentActiveActivity(), str, getBannerSize(ironSourceBannerLayout.getSize(), AdapterUtils.isLargeScreen(ContextProvider.getInstance().getCurrentActiveActivity())));
        bannerView.setListener(this.mZoneIdToBannerListener.get(str));
        this.mZoneIdToBannerAd.put(str, bannerView);
        return bannerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FrameLayout.LayoutParams createLayoutParams(UnityBannerSize unityBannerSize) {
        return new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(ContextProvider.getInstance().getCurrentActiveActivity(), unityBannerSize.getWidth()), -2, 17);
    }

    private IronSourceError errorForUnsupportedAdapter(String str) {
        return ErrorBuilder.buildInitFailedError("UnitAds SDK version is not supported", str);
    }

    private boolean isSupported() {
        return Build.VERSION.SDK_INT >= 19;
    }

    private boolean isValidCOPPAMetaData(String str, String str2) {
        return str.toLowerCase().equals("unityads_coppa") && !TextUtils.isEmpty(str2);
    }

    private int getUnityAdsInitializationErrorCode(UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        if (unityAdsInitializationError != null) {
            for (UnityAds.UnityAdsInitializationError unityAdsInitializationError2 : UnityAds.UnityAdsInitializationError.values()) {
                if (unityAdsInitializationError2.name().equalsIgnoreCase(unityAdsInitializationError.toString())) {
                    return UnityAds.UnityAdsInitializationError.valueOf(unityAdsInitializationError.toString()).ordinal();
                }
            }
            return IronSourceError.ERROR_CODE_GENERIC;
        }
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getUnityAdsLoadErrorCode(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        if (unityAdsLoadError != null) {
            for (UnityAds.UnityAdsLoadError unityAdsLoadError2 : UnityAds.UnityAdsLoadError.values()) {
                if (unityAdsLoadError2.name().equalsIgnoreCase(unityAdsLoadError.toString())) {
                    return UnityAds.UnityAdsLoadError.valueOf(unityAdsLoadError.toString()).ordinal();
                }
            }
            return IronSourceError.ERROR_CODE_GENERIC;
        }
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getUnityAdsShowErrorCode(UnityAds.UnityAdsShowError unityAdsShowError) {
        if (unityAdsShowError != null) {
            for (UnityAds.UnityAdsShowError unityAdsShowError2 : UnityAds.UnityAdsShowError.values()) {
                if (unityAdsShowError2.name().equalsIgnoreCase(unityAdsShowError.toString())) {
                    return UnityAds.UnityAdsShowError.valueOf(unityAdsShowError.toString()).ordinal();
                }
            }
            return IronSourceError.ERROR_CODE_GENERIC;
        }
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        LoadWhileShowSupportState loadWhileShowSupportState = this.mLWSSupportState;
        return (jSONObject == null || !jSONObject.optBoolean("isSupportedLWS")) ? loadWhileShowSupportState : LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }
}
