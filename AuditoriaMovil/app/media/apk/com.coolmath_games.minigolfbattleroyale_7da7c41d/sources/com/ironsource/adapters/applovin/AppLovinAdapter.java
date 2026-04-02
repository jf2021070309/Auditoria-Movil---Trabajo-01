package com.ironsource.adapters.applovin;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes2.dex */
class AppLovinAdapter extends AbstractAdapter implements INetworkInitCallbackListener {
    private static final int AGE_NOT_SET = -1;
    private static final int AGE_RESTRICTION = 16;
    private static final String GitHash = "b21f3e0b9";
    private static final String META_DATA_APPLOVIN_AGE_RESTRICTION_KEY = "AppLovin_AgeRestrictedUser";
    private static final String SDK_KEY = "sdkKey";
    private static final String VERSION = "4.3.28";
    private static final String ZONE_ID = "zoneId";
    private static int mAge = -1;
    private static AppLovinSdk mAppLovinSdk;
    private CopyOnWriteArraySet<String> mRewardedVideoPlacementsForInitCallbacks;
    private ConcurrentHashMap<String, ALBannerListener> mZoneIdToAppLovinBannerListener;
    private ConcurrentHashMap<String, AppLovinAdView> mZoneIdToBannerAd;
    private ConcurrentHashMap<String, FrameLayout.LayoutParams> mZoneIdToBannerLayout;
    private ConcurrentHashMap<String, BannerSmashListener> mZoneIdToBannerSmashListener;
    private ConcurrentHashMap<String, AppLovinAd> mZoneIdToInterstitialAd;
    private ConcurrentHashMap<String, Boolean> mZoneIdToInterstitialAdReadyStatus;
    private ConcurrentHashMap<String, InterstitialSmashListener> mZoneIdToInterstitialSmashListener;
    private ConcurrentHashMap<String, AppLovinIncentivizedInterstitial> mZoneIdToRewardedVideoAd;
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mZoneIdToRewardedVideoSmashListener;
    private static AtomicBoolean mDidInitSdkStarted = new AtomicBoolean(false);
    private static Boolean mDidInitSdkFinished = false;
    private static Boolean consentCollectingUserData = null;
    private static Boolean doNotSellCollectingUserData = null;
    private static Boolean ageRestrictionData = null;
    private static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    /* JADX INFO: Access modifiers changed from: private */
    public String getErrorString(int i) {
        if (i != -8) {
            if (i != -7) {
                if (i != -6) {
                    switch (i) {
                        case -1009:
                            return "The device had no network connectivity at the time of an ad request, either due to airplane mode or no service.";
                        case -1001:
                            return "The network conditions prevented the SDK from receiving an ad.";
                        case AppLovinErrorCodes.INVALID_URL /* -900 */:
                            return "A postback URL you attempted to dispatch was empty or nil.";
                        case AppLovinErrorCodes.INVALID_RESPONSE /* -800 */:
                            return "The AppLovin servers have returned an invalid response";
                        case AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO /* -600 */:
                            return "The user exited out of the ad early. You may or may not wish to grant a reward depending on your preference.";
                        case AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT /* -500 */:
                            return "A reward validation requested timed out (usually due to poor connectivity).";
                        case AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR /* -400 */:
                            return "An unknown server-side error occurred.";
                        case AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED /* -300 */:
                            return "The developer called for a rewarded video before one was available.";
                        case AppLovinErrorCodes.SDK_DISABLED /* -22 */:
                            return "The SDK is currently disabled.";
                        case -1:
                            return "The system is in unexpected state.";
                        case 204:
                            return "No ads are currently eligible for your device.";
                        default:
                            switch (i) {
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES /* -202 */:
                                    return "An attempt to cache a video resource to the filesystem failed; the device may be out of space.";
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES /* -201 */:
                                    return "An attempt to cache an image resource to the filesystem failed; the device may be out of space.";
                                case AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES /* -200 */:
                                    return "An attempt to cache a resource to the filesystem failed; the device may be out of space.";
                                default:
                                    return "Unknown error";
                            }
                    }
                }
                return "There has been a failure to render an ad on screen.";
            }
            return "The zone provided is invalid; the zone needs to be added to your AppLovin account or may still be propagating to our servers.";
        }
        return "The provided ad token is invalid; ad token must be returned from AppLovin S2S integration.";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "4.3.28";
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackLoadSuccess(String str) {
    }

    public static AppLovinAdapter startAdapter(String str) {
        return new AppLovinAdapter(str);
    }

    private AppLovinAdapter(String str) {
        super(str);
        IronLog.INTERNAL.verbose("");
        this.mZoneIdToAppLovinBannerListener = new ConcurrentHashMap<>();
        this.mZoneIdToBannerSmashListener = new ConcurrentHashMap<>();
        this.mZoneIdToBannerLayout = new ConcurrentHashMap<>();
        this.mZoneIdToBannerAd = new ConcurrentHashMap<>();
        this.mZoneIdToInterstitialAd = new ConcurrentHashMap<>();
        this.mZoneIdToInterstitialSmashListener = new ConcurrentHashMap<>();
        this.mZoneIdToInterstitialAdReadyStatus = new ConcurrentHashMap<>();
        this.mZoneIdToRewardedVideoAd = new ConcurrentHashMap<>();
        this.mZoneIdToRewardedVideoSmashListener = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        IntegrationData integrationData = new IntegrationData("AppLovin", "4.3.28");
        integrationData.activities = new String[]{"com.applovin.adview.AppLovinInterstitialActivity", "com.applovin.sdk.AppLovinWebViewActivity", "com.applovin.adview.AppLovinFullscreenActivity"};
        return integrationData;
    }

    public static String getAdapterSDKVersion() {
        try {
            return AppLovinSdk.VERSION;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return AppLovinSdk.VERSION;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z) {
        consentCollectingUserData = Boolean.valueOf(z);
        if (mDidInitSdkStarted.get()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("consent = " + z);
            AppLovinPrivacySettings.setHasUserConsent(z, ContextProvider.getInstance().getCurrentActiveActivity());
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
            doNotSellCollectingUserData = Boolean.valueOf(MetaDataUtils.getMetaDataBooleanValue(str2));
        }
        String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (isAgeRestrictionMetaData(str, formatValueForType)) {
            ageRestrictionData = Boolean.valueOf(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        }
    }

    public static boolean isAgeRestrictionMetaData(String str, String str2) {
        return str.equalsIgnoreCase(META_DATA_APPLOVIN_AGE_RESTRICTION_KEY) && str2.length() > 0;
    }

    private void setCCPAValue(boolean z) {
        if (mDidInitSdkStarted.get()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("value = " + z);
            AppLovinPrivacySettings.setDoNotSell(z, ContextProvider.getInstance().getApplicationContext());
        }
    }

    private void setAgeRestrictionValueFromMetaData(boolean z) {
        if (mDidInitSdkStarted.get()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("value = " + z);
            AppLovinPrivacySettings.setIsAgeRestrictedUser(z, ContextProvider.getInstance().getApplicationContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initSdk(String str, String str2) {
        boolean z = false;
        if (mDidInitSdkStarted.compareAndSet(false, true)) {
            if (mAge != -1) {
                setAgeRestriction();
            }
            AppLovinSdkSettings appLovinSdkSettings = new AppLovinSdkSettings();
            try {
                z = isAdaptersDebugEnabled();
            } catch (NoSuchMethodError unused) {
            }
            appLovinSdkSettings.setVerboseLogging(z);
            mAppLovinSdk = AppLovinSdk.getInstance(str, appLovinSdkSettings, ContextProvider.getInstance().getCurrentActiveActivity());
            if (!TextUtils.isEmpty(str2)) {
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("setUserIdentifier to " + str2);
                mAppLovinSdk.setUserIdentifier(str2);
            }
            initCallbackListeners.add(this);
            IronLog.ADAPTER_API.verbose("");
            mAppLovinSdk.initializeSdk(new AppLovinSdk.SdkInitializationListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.1
                @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
                public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                    IronLog.ADAPTER_API.verbose("");
                    Boolean unused2 = AppLovinAdapter.mDidInitSdkFinished = true;
                    Iterator it = AppLovinAdapter.initCallbackListeners.iterator();
                    while (it.hasNext()) {
                        ((INetworkInitCallbackListener) it.next()).onNetworkInitCallbackSuccess();
                    }
                    AppLovinAdapter.initCallbackListeners.clear();
                }
            });
            Boolean bool = consentCollectingUserData;
            if (bool != null) {
                setConsent(bool.booleanValue());
            }
            Boolean bool2 = doNotSellCollectingUserData;
            if (bool2 != null) {
                setCCPAValue(bool2.booleanValue());
            }
            Boolean bool3 = ageRestrictionData;
            if (bool3 != null) {
                setAgeRestrictionValueFromMetaData(bool3.booleanValue());
            }
        } else if (mDidInitSdkFinished.booleanValue()) {
        } else {
            initCallbackListeners.add(this);
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        for (InterstitialSmashListener interstitialSmashListener : this.mZoneIdToInterstitialSmashListener.values()) {
            interstitialSmashListener.onInterstitialInitSuccess();
        }
        for (String str : this.mZoneIdToRewardedVideoSmashListener.keySet()) {
            if (this.mRewardedVideoPlacementsForInitCallbacks.contains(str)) {
                this.mZoneIdToRewardedVideoSmashListener.get(str).onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideo(str);
            }
        }
        for (BannerSmashListener bannerSmashListener : this.mZoneIdToBannerSmashListener.values()) {
            bannerSmashListener.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideoWithCallback(String str, final String str2, JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        if (rewardedVideoSmashListener == null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning(getProviderName() + " RV init failed: RewardedVideoSmashListener is empty");
            return;
        }
        final String optString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(optString)) {
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("missing credentials - sdkKey", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        String zoneId = getZoneId(jSONObject);
        this.mZoneIdToRewardedVideoSmashListener.put(zoneId, rewardedVideoSmashListener);
        this.mRewardedVideoPlacementsForInitCallbacks.add(zoneId);
        IronLog.ADAPTER_API.verbose("");
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                AppLovinAdapter.this.initSdk(optString, str2);
                if (AppLovinAdapter.mDidInitSdkFinished.booleanValue()) {
                    rewardedVideoSmashListener.onRewardedVideoInitSuccess();
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initAndLoadRewardedVideo(String str, final String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        if (rewardedVideoSmashListener == null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning(getProviderName() + " RV init failed: RewardedVideoSmashListener is empty");
            return;
        }
        final String optString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(optString)) {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        final String zoneId = getZoneId(jSONObject);
        this.mZoneIdToRewardedVideoSmashListener.put(zoneId, rewardedVideoSmashListener);
        IronLog.ADAPTER_API.verbose("");
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                AppLovinAdapter.this.initSdk(optString, str2);
                if (AppLovinAdapter.mDidInitSdkFinished.booleanValue()) {
                    AppLovinAdapter.this.loadRewardedVideo(zoneId);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadRewardedVideo(String str) {
        AppLovinIncentivizedInterstitial create;
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + str);
        if (this.mZoneIdToRewardedVideoAd.containsKey(str)) {
            create = this.mZoneIdToRewardedVideoAd.get(str);
        } else {
            if (!TextUtils.isEmpty(str)) {
                create = AppLovinIncentivizedInterstitial.create(str, mAppLovinSdk);
            } else {
                create = AppLovinIncentivizedInterstitial.create(mAppLovinSdk);
            }
            this.mZoneIdToRewardedVideoAd.put(str, create);
        }
        create.preload(createAdLoadListener(str));
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String zoneId = getZoneId(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        loadRewardedVideo(zoneId);
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String zoneId = getZoneId(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.mZoneIdToRewardedVideoAd.get(zoneId);
        rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        if (appLovinIncentivizedInterstitial == null || !appLovinIncentivizedInterstitial.isAdReadyToDisplay()) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            StringBuilder sb = new StringBuilder();
            sb.append("no ad to show - ");
            sb.append(appLovinIncentivizedInterstitial == null ? "ad is null" : "ad not ready to display");
            ironLog2.error(sb.toString());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (!TextUtils.isEmpty(getDynamicUserId())) {
            mAppLovinSdk.setUserIdentifier(getDynamicUserId());
        }
        appLovinIncentivizedInterstitial.show(ContextProvider.getInstance().getCurrentActiveActivity(), createAppLovinAdRewardListener(), createAppLovinAdVideoPlaybackListener(), createAppLovinAdDisplayListener(), createAppLovinAdClickListener());
    }

    private AppLovinAdRewardListener createAppLovinAdRewardListener() {
        return new AppLovinAdRewardListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.4
            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("appLovinAd.getZoneId() = " + AppLovinAdapter.this.getZoneId(appLovinAd));
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("appLovinAd.getZoneId() = " + AppLovinAdapter.this.getZoneId(appLovinAd));
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("appLovinAd.getZoneId() = " + AppLovinAdapter.this.getZoneId(appLovinAd));
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("appLovinAd.getZoneId() = " + AppLovinAdapter.this.getZoneId(appLovinAd));
                IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                ironLog2.verbose("error = " + i + ", " + AppLovinAdapter.this.getErrorString(i));
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userDeclinedToViewAd(AppLovinAd appLovinAd) {
                String zoneId = AppLovinAdapter.this.getZoneId(appLovinAd);
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + zoneId);
                if (AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.containsKey(zoneId)) {
                    ((RewardedVideoSmashListener) AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.get(zoneId)).onRewardedVideoAdClosed();
                }
            }
        };
    }

    private AppLovinAdVideoPlaybackListener createAppLovinAdVideoPlaybackListener() {
        return new AppLovinAdVideoPlaybackListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.5
            @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
            public void videoPlaybackBegan(AppLovinAd appLovinAd) {
                String zoneId = AppLovinAdapter.this.getZoneId(appLovinAd);
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + zoneId);
                if (AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.containsKey(zoneId)) {
                    ((RewardedVideoSmashListener) AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.get(zoneId)).onRewardedVideoAdStarted();
                }
            }

            @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
            public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
                String zoneId = AppLovinAdapter.this.getZoneId(appLovinAd);
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + zoneId);
                IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                ironLog2.verbose("isFullyWatched = " + z);
                if (AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.containsKey(zoneId)) {
                    ((RewardedVideoSmashListener) AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.get(zoneId)).onRewardedVideoAdEnded();
                    if (z) {
                        ((RewardedVideoSmashListener) AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.get(zoneId)).onRewardedVideoAdRewarded();
                    }
                }
            }
        };
    }

    private AppLovinAdDisplayListener createAppLovinAdDisplayListener() {
        return new AppLovinAdDisplayListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.6
            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adDisplayed(AppLovinAd appLovinAd) {
                String zoneId = AppLovinAdapter.this.getZoneId(appLovinAd);
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + zoneId);
                if (AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.containsKey(zoneId)) {
                    ((RewardedVideoSmashListener) AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.get(zoneId)).onRewardedVideoAdOpened();
                }
            }

            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adHidden(AppLovinAd appLovinAd) {
                String zoneId = AppLovinAdapter.this.getZoneId(appLovinAd);
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + zoneId);
                if (AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.containsKey(zoneId)) {
                    ((RewardedVideoSmashListener) AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.get(zoneId)).onRewardedVideoAvailabilityChanged(false);
                    ((RewardedVideoSmashListener) AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.get(zoneId)).onRewardedVideoAdClosed();
                }
            }
        };
    }

    private AppLovinAdClickListener createAppLovinAdClickListener() {
        return new AppLovinAdClickListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.7
            @Override // com.applovin.sdk.AppLovinAdClickListener
            public void adClicked(AppLovinAd appLovinAd) {
                String zoneId = AppLovinAdapter.this.getZoneId(appLovinAd);
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + zoneId);
                if (AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.containsKey(zoneId)) {
                    ((RewardedVideoSmashListener) AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.get(zoneId)).onRewardedVideoAdClicked();
                }
            }
        };
    }

    private AppLovinAdLoadListener createAdLoadListener(final String str) {
        return new AppLovinAdLoadListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.8
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + str);
                if (AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.containsKey(str)) {
                    ((RewardedVideoSmashListener) AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.get(str)).onRewardedVideoAvailabilityChanged(true);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i) {
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + str);
                String errorString = AppLovinAdapter.this.getErrorString(i);
                IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                ironLog2.verbose("error = " + i + ", " + errorString);
                if (AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.containsKey(str)) {
                    RewardedVideoSmashListener rewardedVideoSmashListener = (RewardedVideoSmashListener) AppLovinAdapter.this.mZoneIdToRewardedVideoSmashListener.get(str);
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                    if (i == 204) {
                        i = IronSourceError.ERROR_RV_LOAD_NO_FILL;
                    }
                    rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(i, errorString));
                }
            }
        };
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.mZoneIdToRewardedVideoAd.get(getZoneId(jSONObject));
        return appLovinIncentivizedInterstitial != null && appLovinIncentivizedInterstitial.isAdReadyToDisplay();
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void initInterstitial(String str, final String str2, JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        final String optString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(optString)) {
            IronLog.ADAPTER_API.error("sdkKey is empty");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("initInterstitial empty sdkKey", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            return;
        }
        String zoneId = getZoneId(jSONObject);
        this.mZoneIdToInterstitialSmashListener.put(zoneId, interstitialSmashListener);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.9
            @Override // java.lang.Runnable
            public void run() {
                AppLovinAdapter.this.initSdk(optString, str2);
                if (AppLovinAdapter.mDidInitSdkFinished.booleanValue()) {
                    interstitialSmashListener.onInterstitialInitSuccess();
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void loadInterstitial(JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        final String zoneId = getZoneId(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        if (!TextUtils.isEmpty(zoneId)) {
            mAppLovinSdk.getAdService().loadNextAdForZoneId(zoneId, new AppLovinAdLoadListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.10
                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void adReceived(AppLovinAd appLovinAd) {
                    IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                    ironLog2.verbose("appLovinAd.getZoneId() = " + AppLovinAdapter.this.getZoneId(appLovinAd));
                    AppLovinAdapter.this.mZoneIdToInterstitialAd.put(zoneId, appLovinAd);
                    AppLovinAdapter.this.mZoneIdToInterstitialAdReadyStatus.put(zoneId, true);
                    interstitialSmashListener.onInterstitialAdReady();
                }

                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void failedToReceiveAd(int i) {
                    IronSourceError buildLoadFailedError;
                    IronLog.ADAPTER_CALLBACK.error("zoneId = " + zoneId);
                    String errorString = AppLovinAdapter.this.getErrorString(i);
                    String str = "error = " + i + ", " + errorString;
                    IronLog.ADAPTER_CALLBACK.error(str);
                    AppLovinAdapter.this.mZoneIdToInterstitialAdReadyStatus.put(zoneId, false);
                    if (i == 204) {
                        buildLoadFailedError = new IronSourceError(IronSourceError.ERROR_IS_LOAD_NO_FILL, errorString);
                    } else {
                        buildLoadFailedError = ErrorBuilder.buildLoadFailedError(str);
                    }
                    interstitialSmashListener.onInterstitialAdLoadFailed(buildLoadFailedError);
                }
            });
        } else {
            mAppLovinSdk.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, new AppLovinAdLoadListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.11
                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void adReceived(AppLovinAd appLovinAd) {
                    IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                    ironLog2.verbose("appLovinAd.getZoneId() = " + AppLovinAdapter.this.getZoneId(appLovinAd));
                    AppLovinAdapter.this.mZoneIdToInterstitialAd.put(zoneId, appLovinAd);
                    AppLovinAdapter.this.mZoneIdToInterstitialAdReadyStatus.put(zoneId, true);
                    interstitialSmashListener.onInterstitialAdReady();
                }

                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void failedToReceiveAd(int i) {
                    IronSourceError buildLoadFailedError;
                    IronLog.ADAPTER_CALLBACK.error("zoneId = " + zoneId);
                    String errorString = AppLovinAdapter.this.getErrorString(i);
                    String str = "error = " + i + ", " + errorString;
                    IronLog.ADAPTER_CALLBACK.error(str);
                    AppLovinAdapter.this.mZoneIdToInterstitialAdReadyStatus.put(zoneId, false);
                    if (i == 204) {
                        buildLoadFailedError = new IronSourceError(IronSourceError.ERROR_IS_LOAD_NO_FILL, errorString);
                    } else {
                        buildLoadFailedError = ErrorBuilder.buildLoadFailedError(str);
                    }
                    interstitialSmashListener.onInterstitialAdLoadFailed(buildLoadFailedError);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String zoneId = getZoneId(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        AppLovinAd appLovinAd = this.mZoneIdToInterstitialAd.get(zoneId);
        if (appLovinAd == null) {
            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
            return;
        }
        createInterstitialAdDialog().showAndRender(appLovinAd);
        this.mZoneIdToInterstitialAdReadyStatus.put(zoneId, false);
    }

    private AppLovinInterstitialAdDialog createInterstitialAdDialog() {
        IronLog.ADAPTER_API.verbose("");
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(mAppLovinSdk, ContextProvider.getInstance().getCurrentActiveActivity());
        create.setAdClickListener(new AppLovinAdClickListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.12
            @Override // com.applovin.sdk.AppLovinAdClickListener
            public void adClicked(AppLovinAd appLovinAd) {
                String zoneId = AppLovinAdapter.this.getZoneId(appLovinAd);
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + zoneId);
                if (AppLovinAdapter.this.mZoneIdToInterstitialSmashListener.containsKey(zoneId)) {
                    ((InterstitialSmashListener) AppLovinAdapter.this.mZoneIdToInterstitialSmashListener.get(zoneId)).onInterstitialAdClicked();
                }
            }
        });
        create.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.13
            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adDisplayed(AppLovinAd appLovinAd) {
                String zoneId = AppLovinAdapter.this.getZoneId(appLovinAd);
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + zoneId);
                if (AppLovinAdapter.this.mZoneIdToInterstitialSmashListener.containsKey(zoneId)) {
                    ((InterstitialSmashListener) AppLovinAdapter.this.mZoneIdToInterstitialSmashListener.get(zoneId)).onInterstitialAdOpened();
                    ((InterstitialSmashListener) AppLovinAdapter.this.mZoneIdToInterstitialSmashListener.get(zoneId)).onInterstitialAdShowSucceeded();
                }
            }

            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adHidden(AppLovinAd appLovinAd) {
                String zoneId = AppLovinAdapter.this.getZoneId(appLovinAd);
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + zoneId);
                if (AppLovinAdapter.this.mZoneIdToInterstitialSmashListener.containsKey(zoneId)) {
                    ((InterstitialSmashListener) AppLovinAdapter.this.mZoneIdToInterstitialSmashListener.get(zoneId)).onInterstitialAdClosed();
                }
            }
        });
        create.setAdVideoPlaybackListener(new AppLovinAdVideoPlaybackListener() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.14
            @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
            public void videoPlaybackBegan(AppLovinAd appLovinAd) {
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + AppLovinAdapter.this.getZoneId(appLovinAd));
            }

            @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
            public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
                IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                ironLog.verbose("zoneId = " + AppLovinAdapter.this.getZoneId(appLovinAd));
            }
        });
        return create;
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public boolean isInterstitialReady(JSONObject jSONObject) {
        String zoneId = getZoneId(jSONObject);
        return this.mZoneIdToInterstitialAd.containsKey(zoneId) && this.mZoneIdToInterstitialAdReadyStatus.containsKey(zoneId) && this.mZoneIdToInterstitialAdReadyStatus.get(zoneId).booleanValue();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBanners(String str, final String str2, JSONObject jSONObject, final BannerSmashListener bannerSmashListener) {
        final String optString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(optString)) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params", IronSourceConstants.BANNER_AD_UNIT));
            return;
        }
        String zoneId = getZoneId(jSONObject);
        this.mZoneIdToBannerSmashListener.put(zoneId, bannerSmashListener);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.15
            @Override // java.lang.Runnable
            public void run() {
                AppLovinAdapter.this.initSdk(optString, str2);
                if (AppLovinAdapter.mDidInitSdkFinished.booleanValue()) {
                    bannerSmashListener.onBannerInitSuccess();
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBanner(final IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, final BannerSmashListener bannerSmashListener) {
        final AppLovinAdSize calculateBannerSize = calculateBannerSize(ironSourceBannerLayout.getSize(), AdapterUtils.isLargeScreen(ironSourceBannerLayout.getActivity()));
        if (calculateBannerSize == null) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
            return;
        }
        final String zoneId = getZoneId(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.16
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams calcLayoutParams;
                AppLovinAdView appLovinAdView;
                try {
                    ALBannerListener aLBannerListener = new ALBannerListener(zoneId);
                    if (TextUtils.isEmpty(zoneId)) {
                        calcLayoutParams = AppLovinAdapter.this.calcLayoutParams(ironSourceBannerLayout.getSize(), calculateBannerSize, ironSourceBannerLayout.getActivity());
                        appLovinAdView = new AppLovinAdView(AppLovinAdapter.mAppLovinSdk, calculateBannerSize, ironSourceBannerLayout.getActivity());
                    } else {
                        calcLayoutParams = AppLovinAdapter.this.calcLayoutParams(ISBannerSize.BANNER, AppLovinAdSize.BANNER, ironSourceBannerLayout.getActivity());
                        appLovinAdView = new AppLovinAdView(AppLovinAdapter.mAppLovinSdk, AppLovinAdSize.BANNER, ironSourceBannerLayout.getActivity());
                    }
                    appLovinAdView.setAdLoadListener(aLBannerListener);
                    appLovinAdView.setAdClickListener(aLBannerListener);
                    appLovinAdView.setAdDisplayListener(aLBannerListener);
                    appLovinAdView.setAdViewEventListener(aLBannerListener);
                    AppLovinAdapter.this.mZoneIdToBannerAd.put(zoneId, appLovinAdView);
                    AppLovinAdapter.this.mZoneIdToBannerLayout.put(zoneId, calcLayoutParams);
                    AppLovinAdapter.this.mZoneIdToAppLovinBannerListener.put(zoneId, aLBannerListener);
                    if (!TextUtils.isEmpty(zoneId)) {
                        AppLovinAdapter.mAppLovinSdk.getAdService().loadNextAdForZoneId(zoneId, aLBannerListener);
                    } else {
                        appLovinAdView.loadNextAd();
                    }
                } catch (Exception e) {
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(AppLovinAdapter.this.getProviderName() + " loadBanner exception " + e.getMessage()));
                }
            }
        });
    }

    private AppLovinAdSize calculateBannerSize(ISBannerSize iSBannerSize, boolean z) {
        if (iSBannerSize == null) {
            IronLog.ADAPTER_API.error(getProviderName() + " calculateLayoutParams - bannerSize is null");
            return null;
        }
        String description = iSBannerSize.getDescription();
        char c = 65535;
        switch (description.hashCode()) {
            case 72205083:
                if (description.equals("LARGE")) {
                    c = 1;
                    break;
                }
                break;
            case 79011241:
                if (description.equals("SMART")) {
                    c = 2;
                    break;
                }
                break;
            case 1951953708:
                if (description.equals("BANNER")) {
                    c = 0;
                    break;
                }
                break;
            case 1999208305:
                if (description.equals("CUSTOM")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return AppLovinAdSize.BANNER;
        }
        if (c == 2) {
            return z ? AppLovinAdSize.LEADER : AppLovinAdSize.BANNER;
        } else if (c == 3 && iSBannerSize.getHeight() >= 40 && iSBannerSize.getHeight() <= 60) {
            return AppLovinAdSize.BANNER;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FrameLayout.LayoutParams calcLayoutParams(ISBannerSize iSBannerSize, AppLovinAdSize appLovinAdSize, Activity activity) {
        return new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(activity, (iSBannerSize.getDescription().equals("SMART") && AdapterUtils.isLargeScreen(activity)) ? 728 : 320), AdapterUtils.dpToPixels(activity, appLovinAdSize.getHeight()), 17);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        final String zoneId = getZoneId(jSONObject);
        final AppLovinAdView appLovinAdView = this.mZoneIdToBannerAd.get(zoneId);
        final ALBannerListener aLBannerListener = this.mZoneIdToAppLovinBannerListener.get(zoneId);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("zoneId = " + zoneId);
        if (appLovinAdView == null || aLBannerListener == null) {
            IronLog.ADAPTER_API.error(appLovinAdView == null ? "adView is null" : "applovinListener");
        } else {
            postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.17
                @Override // java.lang.Runnable
                public void run() {
                    if (!TextUtils.isEmpty(zoneId)) {
                        AppLovinAdapter.mAppLovinSdk.getAdService().loadNextAdForZoneId(zoneId, aLBannerListener);
                    } else {
                        appLovinAdView.loadNextAd();
                    }
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void destroyBanner(JSONObject jSONObject) {
        String zoneId = getZoneId(jSONObject);
        AppLovinAdView appLovinAdView = this.mZoneIdToBannerAd.get(zoneId);
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
        }
        ConcurrentHashMap<String, AppLovinAdView> concurrentHashMap = this.mZoneIdToBannerAd;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(zoneId);
        }
    }

    /* loaded from: classes2.dex */
    private class ALBannerListener implements AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {
        private String mZoneId;

        ALBannerListener(String str) {
            this.mZoneId = str;
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose("mZoneId = " + this.mZoneId);
            BannerSmashListener bannerSmashListener = (BannerSmashListener) AppLovinAdapter.this.mZoneIdToBannerSmashListener.get(this.mZoneId);
            if (bannerSmashListener != null) {
                bannerSmashListener.onBannerAdClicked();
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose("mZoneId = " + this.mZoneId);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose("mZoneId = " + this.mZoneId);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose("mZoneId = " + this.mZoneId);
            final AppLovinAdView appLovinAdView = (AppLovinAdView) AppLovinAdapter.this.mZoneIdToBannerAd.get(this.mZoneId);
            final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) AppLovinAdapter.this.mZoneIdToBannerLayout.get(this.mZoneId);
            final BannerSmashListener bannerSmashListener = (BannerSmashListener) AppLovinAdapter.this.mZoneIdToBannerSmashListener.get(this.mZoneId);
            if (appLovinAdView != null && bannerSmashListener != null && layoutParams != null) {
                AppLovinAdapter.this.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.AppLovinAdapter.ALBannerListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        appLovinAdView.renderAd(appLovinAd);
                        bannerSmashListener.onBannerAdLoaded(appLovinAdView, layoutParams);
                        bannerSmashListener.onBannerAdShown();
                    }
                });
            } else {
                IronLog.ADAPTER_CALLBACK.error("missing parameters");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            IronLog.ADAPTER_CALLBACK.verbose("mZoneId = " + this.mZoneId);
            String str = "error = " + i + ", " + AppLovinAdapter.this.getErrorString(i);
            IronLog.ADAPTER_CALLBACK.verbose(str);
            BannerSmashListener bannerSmashListener = (BannerSmashListener) AppLovinAdapter.this.mZoneIdToBannerSmashListener.get(this.mZoneId);
            if (bannerSmashListener != null) {
                bannerSmashListener.onBannerAdLoadFailed(i == 204 ? new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str) : ErrorBuilder.buildLoadFailedError(str));
            }
        }

        @Override // com.applovin.adview.AppLovinAdViewEventListener
        public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose("mZoneId = " + this.mZoneId);
        }

        @Override // com.applovin.adview.AppLovinAdViewEventListener
        public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose("mZoneId = " + this.mZoneId);
        }

        @Override // com.applovin.adview.AppLovinAdViewEventListener
        public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose("mZoneId = " + this.mZoneId);
            BannerSmashListener bannerSmashListener = (BannerSmashListener) AppLovinAdapter.this.mZoneIdToBannerSmashListener.get(this.mZoneId);
            if (bannerSmashListener != null) {
                bannerSmashListener.onBannerAdLeftApplication();
            }
        }

        @Override // com.applovin.adview.AppLovinAdViewEventListener
        public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose("mZoneId = " + this.mZoneId);
        }
    }

    private String getZoneId(JSONObject jSONObject) {
        return !TextUtils.isEmpty(jSONObject.optString(ZONE_ID)) ? jSONObject.optString(ZONE_ID) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getZoneId(AppLovinAd appLovinAd) {
        return appLovinAd.getZoneId() != null ? appLovinAd.getZoneId() : "";
    }

    private void setAgeRestriction() {
        AppLovinPrivacySettings.setIsAgeRestrictedUser(mAge < 16, ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("age restriction = " + AppLovinPrivacySettings.isAgeRestrictedUser(ContextProvider.getInstance().getApplicationContext()));
    }
}
