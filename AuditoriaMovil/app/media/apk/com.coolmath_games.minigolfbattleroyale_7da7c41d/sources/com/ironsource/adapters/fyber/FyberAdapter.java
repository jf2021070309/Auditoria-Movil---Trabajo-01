package com.ironsource.adapters.fyber;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.google.android.gms.nearby.messages.Strategy;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class FyberAdapter extends AbstractAdapter implements INetworkInitCallbackListener {
    private static final String GitHash = "b21f3e0b9";
    private static final String VERSION = "4.3.16";
    private static String mUserId;
    private static Boolean setCCPA;
    private static Boolean setConsent;
    private final String APP_ID;
    private final String SPOT_ID;
    private ConcurrentHashMap<String, InneractiveAdSpot> bannerAdUnitIdToAd;
    private ConcurrentHashMap<String, IronSourceBannerLayout> bannerAdUnitIdToBannerLayout;
    private ConcurrentHashMap<String, BannerSmashListener> bannerAdUnitIdToSmashListener;
    private ConcurrentHashMap<String, InneractiveAdSpot> interstitialAdUnitIdToAd;
    private ConcurrentHashMap<String, InterstitialSmashListener> interstitialAdUnitIdToSmashListener;
    private ConcurrentHashMap<String, Boolean> interstitialAdsAvailability;
    private CopyOnWriteArraySet<String> mRewardedVideoPlacementsForInitCallbacks;
    private ConcurrentHashMap<String, InneractiveAdSpot> rewardedVideoAdUnitIdToAd;
    private ConcurrentHashMap<String, RewardedVideoSmashListener> rewardedVideoAdUnitIdToSmashListener;
    private ConcurrentHashMap<String, Boolean> rewardedVideoAdsAvailability;
    private static AtomicBoolean mDidInitFyberSDK = new AtomicBoolean(false);
    private static EInitState mInitState = EInitState.NOT_INIT;
    private static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

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

    public static FyberAdapter startAdapter(String str) {
        return new FyberAdapter(str);
    }

    private FyberAdapter(String str) {
        super(str);
        this.APP_ID = "appId";
        this.SPOT_ID = "adSpotId";
        IronLog.INTERNAL.verbose("");
        this.rewardedVideoAdUnitIdToAd = new ConcurrentHashMap<>();
        this.rewardedVideoAdUnitIdToSmashListener = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.interstitialAdUnitIdToAd = new ConcurrentHashMap<>();
        this.interstitialAdUnitIdToSmashListener = new ConcurrentHashMap<>();
        this.bannerAdUnitIdToAd = new ConcurrentHashMap<>();
        this.bannerAdUnitIdToSmashListener = new ConcurrentHashMap<>();
        this.bannerAdUnitIdToBannerLayout = new ConcurrentHashMap<>();
        this.rewardedVideoAdsAvailability = new ConcurrentHashMap<>();
        this.interstitialAdsAvailability = new ConcurrentHashMap<>();
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        IntegrationData integrationData = new IntegrationData("Fyber", "4.3.16");
        integrationData.activities = new String[]{"com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity", "com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity", "com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore"};
        return integrationData;
    }

    public static String getAdapterSDKVersion() {
        try {
            return InneractiveAdManager.getVersion();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return InneractiveAdManager.getVersion();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        if (TextUtils.isEmpty(jSONObject.optString("appId")) || TextUtils.isEmpty(jSONObject.optString("adSpotId"))) {
            IronLog.ADAPTER_API.error("missing credentials");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("missing credentials", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        String optString = jSONObject.optString("adSpotId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("spotId = " + optString);
        this.rewardedVideoAdUnitIdToSmashListener.put(optString, rewardedVideoSmashListener);
        this.mRewardedVideoPlacementsForInitCallbacks.add(optString);
        if (mInitState == EInitState.INIT_SUCCESS) {
            rewardedVideoSmashListener.onRewardedVideoInitSuccess();
        } else if (mInitState == EInitState.INIT_FAIL) {
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Fyber Sdk failed to initiate", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else {
            initiateFyberSDK(jSONObject.optString("appId"), str2);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        if (TextUtils.isEmpty(jSONObject.optString("appId")) || TextUtils.isEmpty(jSONObject.optString("adSpotId"))) {
            IronLog.ADAPTER_API.error("missing credentials");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        String optString = jSONObject.optString("adSpotId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("spotId = " + optString);
        this.rewardedVideoAdUnitIdToSmashListener.put(optString, rewardedVideoSmashListener);
        if (mInitState == EInitState.INIT_SUCCESS) {
            loadRewardedVideo(optString, rewardedVideoSmashListener);
        } else if (mInitState != EInitState.INIT_FAIL) {
            initiateFyberSDK(jSONObject.optString("appId"), str2);
        } else if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("adSpotId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("spotId = " + optString);
        RewardedVideoSmashListener rewardedVideoSmashListener2 = this.rewardedVideoAdUnitIdToSmashListener.get(optString);
        if (rewardedVideoSmashListener2 != null) {
            if (TextUtils.isEmpty(optString)) {
                IronLog.ADAPTER_API.error("missing credentials");
                rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
                return;
            }
            loadRewardedVideo(optString, rewardedVideoSmashListener2);
        }
    }

    private void loadRewardedVideo(final String str, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("spotId = " + str);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                IronLog.ADAPTER_API.verbose("loadRewardedVideo");
                InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) FyberAdapter.this.rewardedVideoAdUnitIdToAd.get(str);
                if (inneractiveAdSpot != null) {
                    inneractiveAdSpot.destroy();
                    FyberAdapter.this.rewardedVideoAdUnitIdToAd.remove(inneractiveAdSpot);
                }
                InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
                createSpot.addUnitController(new InneractiveFullscreenUnitController());
                InneractiveAdRequest inneractiveAdRequest = new InneractiveAdRequest(str);
                FyberAdapter.this.setMediationData(createSpot);
                createSpot.setRequestListener(new InneractiveAdSpot.RequestListener() { // from class: com.ironsource.adapters.fyber.FyberAdapter.1.1
                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
                    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot2) {
                        String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                        IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                        ironLog2.verbose("spotId = " + spotIDForInneractiveAdSpot);
                        if (rewardedVideoSmashListener != null) {
                            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(true);
                            FyberAdapter.this.rewardedVideoAdsAvailability.put(spotIDForInneractiveAdSpot, true);
                            try {
                                rewardedVideoSmashListener.onRewardedVideoLoadSuccess();
                            } catch (Throwable unused) {
                            }
                        }
                    }

                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
                    public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot2, InneractiveErrorCode inneractiveErrorCode) {
                        IronSourceError buildLoadFailedError;
                        String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                        IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                        ironLog2.verbose("spotId = " + spotIDForInneractiveAdSpot);
                        if (rewardedVideoSmashListener != null) {
                            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                            FyberAdapter.this.rewardedVideoAdsAvailability.put(spotIDForInneractiveAdSpot, false);
                            if (inneractiveErrorCode != null) {
                                IronLog ironLog3 = IronLog.ADAPTER_CALLBACK;
                                ironLog3.verbose("inneractiveErrorCode = " + inneractiveErrorCode);
                                if (inneractiveErrorCode == InneractiveErrorCode.NO_FILL) {
                                    buildLoadFailedError = new IronSourceError(IronSourceError.ERROR_RV_LOAD_NO_FILL, inneractiveErrorCode.toString());
                                } else {
                                    buildLoadFailedError = ErrorBuilder.buildLoadFailedError(inneractiveErrorCode.toString());
                                }
                                rewardedVideoSmashListener.onRewardedVideoLoadFailed(buildLoadFailedError);
                            }
                        }
                    }
                });
                FyberAdapter.this.rewardedVideoAdUnitIdToAd.put(str, createSpot);
                createSpot.requestAd(inneractiveAdRequest);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        String optString = jSONObject.optString("adSpotId");
        return this.rewardedVideoAdsAvailability.containsKey(optString) && this.rewardedVideoAdsAvailability.get(optString).booleanValue();
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void showRewardedVideo(final JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                String optString = jSONObject.optString("adSpotId");
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("showRewardedVideo - spotId = " + optString);
                if (!TextUtils.isEmpty(FyberAdapter.this.getDynamicUserId())) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("setUserID to " + FyberAdapter.this.getDynamicUserId());
                    InneractiveAdManager.setUserId(FyberAdapter.this.getDynamicUserId());
                }
                InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) FyberAdapter.this.rewardedVideoAdUnitIdToAd.get(optString);
                if (inneractiveAdSpot != null && FyberAdapter.this.isRewardedVideoAvailable(jSONObject) && inneractiveAdSpot.isReady()) {
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                    InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (InneractiveFullscreenUnitController) inneractiveAdSpot.getSelectedUnitController();
                    inneractiveFullscreenUnitController.setRewardedListener(new InneractiveFullScreenAdRewardedListener() { // from class: com.ironsource.adapters.fyber.FyberAdapter.2.1
                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
                        public void onAdRewarded(InneractiveAdSpot inneractiveAdSpot2) {
                            IronLog ironLog3 = IronLog.ADAPTER_CALLBACK;
                            ironLog3.verbose("spotId = " + jSONObject.optString("adSpotId"));
                            if (rewardedVideoSmashListener != null) {
                                rewardedVideoSmashListener.onRewardedVideoAdRewarded();
                            }
                        }
                    });
                    inneractiveFullscreenUnitController.setEventsListener(new InneractiveFullscreenAdEventsListener() { // from class: com.ironsource.adapters.fyber.FyberAdapter.2.2
                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot2) {
                        }

                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot2) {
                        }

                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
                        public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot2) {
                            String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                            IronLog ironLog3 = IronLog.ADAPTER_CALLBACK;
                            ironLog3.verbose("spotId = " + spotIDForInneractiveAdSpot);
                            if (rewardedVideoSmashListener != null) {
                                rewardedVideoSmashListener.onRewardedVideoAdEnded();
                                rewardedVideoSmashListener.onRewardedVideoAdClosed();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot2) {
                            String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                            IronLog ironLog3 = IronLog.ADAPTER_CALLBACK;
                            ironLog3.verbose("spotId = " + spotIDForInneractiveAdSpot);
                            if (rewardedVideoSmashListener != null) {
                                rewardedVideoSmashListener.onRewardedVideoAdOpened();
                                rewardedVideoSmashListener.onRewardedVideoAdStarted();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot2) {
                            String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                            IronLog ironLog3 = IronLog.ADAPTER_CALLBACK;
                            ironLog3.verbose("spotId = " + spotIDForInneractiveAdSpot);
                            if (rewardedVideoSmashListener != null) {
                                rewardedVideoSmashListener.onRewardedVideoAdClicked();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                        public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot2, InneractiveUnitController.AdDisplayError adDisplayError) {
                            String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                            IronLog ironLog3 = IronLog.ADAPTER_CALLBACK;
                            ironLog3.error("spotId " + spotIDForInneractiveAdSpot + " and error " + adDisplayError);
                            if (rewardedVideoSmashListener != null) {
                                rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, adDisplayError != null ? adDisplayError.getMessage() : null));
                            }
                        }
                    });
                    InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = new InneractiveFullscreenVideoContentController();
                    inneractiveFullscreenVideoContentController.setEventsListener(new VideoContentListener() { // from class: com.ironsource.adapters.fyber.FyberAdapter.2.3
                        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
                        public void onCompleted() {
                        }

                        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
                        public void onProgress(int i, int i2) {
                        }

                        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
                        public void onPlayerError() {
                            IronLog ironLog3 = IronLog.ADAPTER_CALLBACK;
                            ironLog3.verbose("spotId = " + jSONObject.optString("adSpotId"));
                            if (rewardedVideoSmashListener != null) {
                                rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                            }
                        }
                    });
                    inneractiveFullscreenUnitController.addContentController(inneractiveFullscreenVideoContentController);
                    IronLog ironLog3 = IronLog.ADAPTER_API;
                    ironLog3.verbose("spotId = " + optString);
                    inneractiveFullscreenUnitController.show(ContextProvider.getInstance().getCurrentActiveActivity());
                } else {
                    RewardedVideoSmashListener rewardedVideoSmashListener2 = rewardedVideoSmashListener;
                    if (rewardedVideoSmashListener2 != null) {
                        rewardedVideoSmashListener2.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                    }
                }
                FyberAdapter.this.rewardedVideoAdsAvailability.put(optString, false);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        if (TextUtils.isEmpty(jSONObject.optString("appId"))) {
            IronLog.ADAPTER_API.error("'appId' param is missing");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        } else if (TextUtils.isEmpty(jSONObject.optString("adSpotId"))) {
            IronLog.ADAPTER_API.error("'adSpotId' param is missing");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        } else {
            this.interstitialAdUnitIdToSmashListener.put(jSONObject.optString("adSpotId"), interstitialSmashListener);
            if (mInitState == EInitState.INIT_SUCCESS) {
                if (interstitialSmashListener != null) {
                    interstitialSmashListener.onInterstitialInitSuccess();
                }
            } else if (mInitState != EInitState.INIT_FAIL) {
                initiateFyberSDK(jSONObject.optString("appId"), str2);
            } else if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "init failed"));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void loadInterstitial(final JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                String optString = jSONObject.optString("adSpotId");
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("loadInterstitial - spotId = " + optString);
                InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) FyberAdapter.this.interstitialAdUnitIdToAd.get(optString);
                if (inneractiveAdSpot != null) {
                    inneractiveAdSpot.destroy();
                    FyberAdapter.this.interstitialAdUnitIdToAd.remove(inneractiveAdSpot);
                }
                InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
                createSpot.addUnitController(new InneractiveFullscreenUnitController());
                InneractiveAdRequest inneractiveAdRequest = new InneractiveAdRequest(optString);
                FyberAdapter.this.setMediationData(createSpot);
                createSpot.setRequestListener(new InneractiveAdSpot.RequestListener() { // from class: com.ironsource.adapters.fyber.FyberAdapter.3.1
                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
                    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot2) {
                        String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                        IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                        ironLog2.verbose("spotId = " + spotIDForInneractiveAdSpot);
                        FyberAdapter.this.interstitialAdsAvailability.put(spotIDForInneractiveAdSpot, true);
                        if (interstitialSmashListener != null) {
                            interstitialSmashListener.onInterstitialAdReady();
                        }
                    }

                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
                    public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot2, InneractiveErrorCode inneractiveErrorCode) {
                        IronSourceError buildLoadFailedError;
                        String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                        IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                        ironLog2.verbose("spotId = " + spotIDForInneractiveAdSpot);
                        FyberAdapter.this.interstitialAdsAvailability.put(spotIDForInneractiveAdSpot, false);
                        if (interstitialSmashListener != null) {
                            if (inneractiveErrorCode == null) {
                                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("Interstitial failed to load (inneractiveErrorCode is null)");
                            } else {
                                IronLog ironLog3 = IronLog.ADAPTER_CALLBACK;
                                ironLog3.verbose("inneractiveErrorCode = " + inneractiveErrorCode);
                                if (inneractiveErrorCode == InneractiveErrorCode.NO_FILL) {
                                    buildLoadFailedError = new IronSourceError(IronSourceError.ERROR_IS_LOAD_NO_FILL, inneractiveErrorCode.toString());
                                } else {
                                    buildLoadFailedError = ErrorBuilder.buildLoadFailedError(inneractiveErrorCode.toString());
                                }
                            }
                            interstitialSmashListener.onInterstitialAdLoadFailed(buildLoadFailedError);
                        }
                    }
                });
                FyberAdapter.this.interstitialAdUnitIdToAd.put(optString, createSpot);
                createSpot.requestAd(inneractiveAdRequest);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void showInterstitial(final JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                String optString = jSONObject.optString("adSpotId");
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("showInterstitial - spotId = " + optString);
                InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) FyberAdapter.this.interstitialAdUnitIdToAd.get(optString);
                if (inneractiveAdSpot.isReady()) {
                    InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (InneractiveFullscreenUnitController) inneractiveAdSpot.getSelectedUnitController();
                    inneractiveFullscreenUnitController.setEventsListener(new InneractiveFullscreenAdEventsListener() { // from class: com.ironsource.adapters.fyber.FyberAdapter.4.1
                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot2) {
                        }

                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot2) {
                        }

                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
                        public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot2) {
                            String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                            IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                            ironLog2.verbose(InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID + spotIDForInneractiveAdSpot);
                            if (interstitialSmashListener != null) {
                                interstitialSmashListener.onInterstitialAdClosed();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot2) {
                            String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                            IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                            ironLog2.verbose("spotId = " + spotIDForInneractiveAdSpot);
                            if (interstitialSmashListener != null) {
                                interstitialSmashListener.onInterstitialAdOpened();
                                interstitialSmashListener.onInterstitialAdShowSucceeded();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot2) {
                            String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                            IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                            ironLog2.verbose("spotId = " + spotIDForInneractiveAdSpot);
                            if (interstitialSmashListener != null) {
                                interstitialSmashListener.onInterstitialAdClicked();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                        public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot2, InneractiveUnitController.AdDisplayError adDisplayError) {
                            String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                            IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                            ironLog2.verbose("spotId = " + spotIDForInneractiveAdSpot);
                            IronLog ironLog3 = IronLog.ADAPTER_CALLBACK;
                            ironLog3.verbose("adDisplayError = " + adDisplayError);
                            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, adDisplayError != null ? adDisplayError.getMessage() : null));
                        }
                    });
                    inneractiveFullscreenUnitController.addContentController(new InneractiveFullscreenVideoContentController());
                    IronLog.ADAPTER_API.verbose("showInterstitial - show");
                    inneractiveFullscreenUnitController.show(ContextProvider.getInstance().getCurrentActiveActivity());
                } else {
                    InterstitialSmashListener interstitialSmashListener2 = interstitialSmashListener;
                    if (interstitialSmashListener2 != null) {
                        interstitialSmashListener2.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    }
                }
                FyberAdapter.this.interstitialAdsAvailability.put(optString, false);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public boolean isInterstitialReady(JSONObject jSONObject) {
        String optString = jSONObject.optString("adSpotId");
        return this.interstitialAdsAvailability.containsKey(optString) && this.interstitialAdsAvailability.get(optString).booleanValue();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        if (TextUtils.isEmpty(jSONObject.optString("appId"))) {
            IronLog.ADAPTER_API.error("'appId' param is missing");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params appId", IronSourceConstants.BANNER_AD_UNIT));
            return;
        }
        String optString = jSONObject.optString("adSpotId");
        if (TextUtils.isEmpty(optString)) {
            IronLog.ADAPTER_API.error("'adSpotId' param is missing");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params adSpotId", IronSourceConstants.BANNER_AD_UNIT));
            return;
        }
        this.bannerAdUnitIdToSmashListener.put(optString, bannerSmashListener);
        if (mInitState == EInitState.INIT_SUCCESS) {
            if (bannerSmashListener != null) {
                bannerSmashListener.onBannerInitSuccess();
            }
        } else if (mInitState != EInitState.INIT_FAIL) {
            initiateFyberSDK(jSONObject.optString("appId"), str2);
        } else if (bannerSmashListener != null) {
            bannerSmashListener.onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "init failed"));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBanner(final IronSourceBannerLayout ironSourceBannerLayout, final JSONObject jSONObject, final BannerSmashListener bannerSmashListener) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                String optString = jSONObject.optString("adSpotId");
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("loadBanner - adSpotId = " + optString);
                if (TextUtils.isEmpty(optString)) {
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Fyber loadBanner adSpotId is empty"));
                    return;
                }
                IronSourceBannerLayout ironSourceBannerLayout2 = ironSourceBannerLayout;
                if (ironSourceBannerLayout2 != null && !ironSourceBannerLayout2.isDestroyed()) {
                    FyberAdapter.this.bannerAdUnitIdToBannerLayout.put(optString, ironSourceBannerLayout);
                    InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
                    FyberAdapter.this.setMediationData(createSpot);
                    createSpot.addUnitController(new InneractiveAdViewUnitController());
                    createSpot.setRequestListener(new BannerRequestListener(optString, bannerSmashListener));
                    InneractiveAdRequest inneractiveAdRequest = new InneractiveAdRequest(optString);
                    FyberAdapter.this.bannerAdUnitIdToAd.put(optString, createSpot);
                    createSpot.requestAd(inneractiveAdRequest);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Fyber loadBanner - banner ");
                sb.append(ironSourceBannerLayout == null ? "layout is null" : "is destroyed");
                bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(sb.toString()));
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String optString = jSONObject.optString("adSpotId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("spotId = " + optString);
        loadBanner(this.bannerAdUnitIdToBannerLayout.get(optString), jSONObject, this.bannerAdUnitIdToSmashListener.get(optString));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void destroyBanner(final JSONObject jSONObject) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.6
            @Override // java.lang.Runnable
            public void run() {
                String optString = jSONObject.optString("adSpotId");
                IronLog ironLog = IronLog.ADAPTER_API;
                ironLog.verbose("destroyBanner - spotId = " + optString);
                InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) FyberAdapter.this.bannerAdUnitIdToAd.get(optString);
                if (inneractiveAdSpot != null) {
                    inneractiveAdSpot.destroy();
                    FyberAdapter.this.bannerAdUnitIdToAd.remove(optString);
                }
            }
        });
    }

    /* loaded from: classes2.dex */
    private class BannerRequestListener implements InneractiveAdSpot.RequestListener {
        private String adSpotId;
        private BannerSmashListener smashListener;

        public BannerRequestListener(String str, BannerSmashListener bannerSmashListener) {
            this.adSpotId = str;
            this.smashListener = bannerSmashListener;
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot);
            if (!spotIDForInneractiveAdSpot.equals(this.adSpotId)) {
                BannerSmashListener bannerSmashListener = this.smashListener;
                bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildInitFailedError(FyberAdapter.this.getProviderName() + " banner failed to load, Received Wrong Banner Spot - " + spotIDForInneractiveAdSpot + ", expected - " + this.adSpotId, IronSourceConstants.BANNER_AD_UNIT));
            } else if (!inneractiveAdSpot.isReady()) {
                BannerSmashListener bannerSmashListener2 = this.smashListener;
                bannerSmashListener2.onBannerAdLoadFailed(ErrorBuilder.buildInitFailedError(FyberAdapter.this.getProviderName() + " banner failed to load, Spot not ready - " + this.adSpotId, IronSourceConstants.BANNER_AD_UNIT));
            } else {
                InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
                inneractiveAdViewUnitController.setEventsListener(new InneractiveAdViewEventsListener() { // from class: com.ironsource.adapters.fyber.FyberAdapter.BannerRequestListener.1
                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
                    public void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot2) {
                    }

                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
                    public void onAdExpanded(InneractiveAdSpot inneractiveAdSpot2) {
                    }

                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
                    public void onAdResized(InneractiveAdSpot inneractiveAdSpot2) {
                    }

                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot2) {
                        String spotIDForInneractiveAdSpot2 = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                        ironLog.verbose("spotId = " + spotIDForInneractiveAdSpot2);
                        BannerRequestListener.this.smashListener.onBannerAdShown();
                    }

                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot2) {
                        String spotIDForInneractiveAdSpot2 = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                        ironLog.verbose("spotId = " + spotIDForInneractiveAdSpot2);
                        BannerRequestListener.this.smashListener.onBannerAdClicked();
                    }

                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot2) {
                        String spotIDForInneractiveAdSpot2 = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                        ironLog.verbose("spotId = " + spotIDForInneractiveAdSpot2);
                    }

                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot2) {
                        String spotIDForInneractiveAdSpot2 = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                        ironLog.verbose("spotId = " + spotIDForInneractiveAdSpot2);
                        BannerRequestListener.this.smashListener.onBannerAdLeftApplication();
                    }

                    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
                    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot2, InneractiveUnitController.AdDisplayError adDisplayError) {
                        String spotIDForInneractiveAdSpot2 = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot2);
                        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
                        ironLog.error("spotId " + spotIDForInneractiveAdSpot2 + " and error " + adDisplayError);
                    }
                });
                IronSourceBannerLayout ironSourceBannerLayout = (IronSourceBannerLayout) FyberAdapter.this.bannerAdUnitIdToBannerLayout.get(this.adSpotId);
                if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                    FrameLayout.LayoutParams calculateLayoutParams = FyberAdapter.this.calculateLayoutParams(ironSourceBannerLayout.getSize(), ironSourceBannerLayout.getActivity());
                    if (calculateLayoutParams == null) {
                        BannerSmashListener bannerSmashListener3 = this.smashListener;
                        bannerSmashListener3.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize("Fyber - size = " + ironSourceBannerLayout.getSize()));
                        return;
                    }
                    FrameLayout frameLayout = new FrameLayout(ContextProvider.getInstance().getCurrentActiveActivity());
                    inneractiveAdViewUnitController.bindView(frameLayout);
                    this.smashListener.onBannerAdLoaded(frameLayout, calculateLayoutParams);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Fyber loadBanner - banner ");
                sb.append(ironSourceBannerLayout == null ? "layout is null" : "is destroyed");
                this.smashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(sb.toString()));
            }
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            IronSourceError buildLoadFailedError;
            String spotIDForInneractiveAdSpot = FyberAdapter.this.getSpotIDForInneractiveAdSpot(inneractiveAdSpot);
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose("spotId = " + spotIDForInneractiveAdSpot);
            if (inneractiveErrorCode == null) {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("Banner failed to load (inneractiveErrorCode is null)");
            } else {
                IronLog ironLog2 = IronLog.ADAPTER_CALLBACK;
                ironLog2.verbose("inneractiveErrorCode = " + inneractiveErrorCode);
                if (inneractiveErrorCode == InneractiveErrorCode.NO_FILL) {
                    buildLoadFailedError = new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, inneractiveErrorCode.toString());
                } else {
                    buildLoadFailedError = ErrorBuilder.buildLoadFailedError(inneractiveErrorCode.toString());
                }
            }
            this.smashListener.onBannerAdLoadFailed(buildLoadFailedError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getSpotIDForInneractiveAdSpot(InneractiveAdSpot inneractiveAdSpot) {
        return (inneractiveAdSpot == null || inneractiveAdSpot.getCurrentProcessedRequest() == null || inneractiveAdSpot.getCurrentProcessedRequest().getSpotId() == null) ? "null" : inneractiveAdSpot.getCurrentProcessedRequest().getSpotId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FrameLayout.LayoutParams calculateLayoutParams(ISBannerSize iSBannerSize, Activity activity) {
        if (iSBannerSize == null) {
            IronLog.ADAPTER_API.error("bannerSize is null");
            return null;
        }
        String description = iSBannerSize.getDescription();
        char c = 65535;
        int hashCode = description.hashCode();
        if (hashCode != -387072689) {
            if (hashCode != 79011241) {
                if (hashCode == 1951953708 && description.equals("BANNER")) {
                    c = 0;
                }
            } else if (description.equals("SMART")) {
                c = 2;
            }
        } else if (description.equals("RECTANGLE")) {
            c = 1;
        }
        int i = 50;
        int i2 = 320;
        if (c != 0) {
            if (c == 1) {
                i2 = Strategy.TTL_SECONDS_DEFAULT;
                i = IronSourceConstants.INTERSTITIAL_DAILY_CAPPED;
            } else if (c != 2) {
                return null;
            } else {
                if (AdapterUtils.isLargeScreen(activity)) {
                    i2 = 728;
                    i = 90;
                }
            }
        }
        return new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(activity, i2), AdapterUtils.dpToPixels(activity, i), 17);
    }

    private void initiateFyberSDK(final String str, final String str2) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.7
            @Override // java.lang.Runnable
            public void run() {
                if (FyberAdapter.mInitState == EInitState.NOT_INIT || FyberAdapter.mInitState == EInitState.INIT_IN_PROGRESS) {
                    FyberAdapter.initCallbackListeners.add(FyberAdapter.this);
                }
                if (FyberAdapter.mDidInitFyberSDK.compareAndSet(false, true)) {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose("initiateFyberSDK - appKey = " + str);
                    String unused = FyberAdapter.mUserId = str2;
                    FyberAdapter.this.setInitState(EInitState.INIT_IN_PROGRESS);
                    InneractiveAdManager.initialize(ContextProvider.getInstance().getApplicationContext(), str, new OnFyberMarketplaceInitializedListener() { // from class: com.ironsource.adapters.fyber.FyberAdapter.7.1
                        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
                        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                            if (fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                                FyberAdapter.this.setInitState(EInitState.INIT_SUCCESS);
                                IronLog.ADAPTER_CALLBACK.verbose("SUCCESSFULLY - Fyber SDK has been successfully initialized.");
                                Iterator it = FyberAdapter.initCallbackListeners.iterator();
                                while (it.hasNext()) {
                                    ((INetworkInitCallbackListener) it.next()).onNetworkInitCallbackSuccess();
                                }
                            } else {
                                String fyberInitStatus2 = fyberInitStatus == null ? "FAILED - Fyber SDK failed to init." : fyberInitStatus.toString();
                                FyberAdapter.this.setInitState(EInitState.INIT_FAIL);
                                IronLog.ADAPTER_CALLBACK.error(fyberInitStatus2);
                                Iterator it2 = FyberAdapter.initCallbackListeners.iterator();
                                while (it2.hasNext()) {
                                    ((INetworkInitCallbackListener) it2.next()).onNetworkInitCallbackFailed(fyberInitStatus2);
                                }
                            }
                            FyberAdapter.initCallbackListeners.clear();
                        }
                    });
                }
            }
        });
        Boolean bool = setConsent;
        if (bool != null) {
            setConsent(bool.booleanValue());
        }
        Boolean bool2 = setCCPA;
        if (bool2 != null) {
            setCCPAValue(bool2.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(final boolean z) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.8
            @Override // java.lang.Runnable
            public void run() {
                Boolean unused = FyberAdapter.setConsent = Boolean.valueOf(z);
                if (FyberAdapter.mDidInitFyberSDK.get()) {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose("setConsent - consent = " + z);
                    InneractiveAdManager.setGdprConsent(z);
                }
            }
        });
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
        }
    }

    private void setCCPAValue(final boolean z) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.9
            @Override // java.lang.Runnable
            public void run() {
                Boolean unused = FyberAdapter.setCCPA = Boolean.valueOf(z);
                if (FyberAdapter.mDidInitFyberSDK.get()) {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.verbose("setCCPAValue - value = " + z);
                    InneractiveAdManager.setUSPrivacyString(z ? "1YY-" : "1YN-");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationData(InneractiveAdSpot inneractiveAdSpot) {
        inneractiveAdSpot.setMediationName(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
        inneractiveAdSpot.setMediationVersion("4.3.16");
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        if (!TextUtils.isEmpty(mUserId)) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("setUserID to " + mUserId);
            InneractiveAdManager.setUserId(mUserId);
        }
        for (InterstitialSmashListener interstitialSmashListener : this.interstitialAdUnitIdToSmashListener.values()) {
            interstitialSmashListener.onInterstitialInitSuccess();
        }
        for (BannerSmashListener bannerSmashListener : this.bannerAdUnitIdToSmashListener.values()) {
            bannerSmashListener.onBannerInitSuccess();
        }
        for (String str : this.rewardedVideoAdUnitIdToSmashListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.rewardedVideoAdUnitIdToSmashListener.get(str);
            if (this.mRewardedVideoPlacementsForInitCallbacks.contains(str)) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideo(str, rewardedVideoSmashListener);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        for (InterstitialSmashListener interstitialSmashListener : this.interstitialAdUnitIdToSmashListener.values()) {
            interstitialSmashListener.onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, str));
        }
        for (BannerSmashListener bannerSmashListener : this.bannerAdUnitIdToSmashListener.values()) {
            bannerSmashListener.onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, str));
        }
        for (String str2 : this.rewardedVideoAdUnitIdToSmashListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.rewardedVideoAdUnitIdToSmashListener.get(str2);
            if (this.mRewardedVideoPlacementsForInitCallbacks.contains(str2)) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Fyber sdk init failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitState(EInitState eInitState) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(":init state changed from " + mInitState + " to " + eInitState + ")");
        mInitState = eInitState;
    }
}
