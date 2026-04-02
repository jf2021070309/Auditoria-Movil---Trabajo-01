package com.applovin.mediation.adapters;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import c.p.j;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.AppLovinRewardedInterstitialAd;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import e.a.d.a.a;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public class AppLovinMediationAdapter extends MediationAdapterBase implements MaxAdViewAdapter, MaxInterstitialAdapter, MaxRewardedAdapter, MaxRewardedInterstitialAdapter, MaxSignalProvider {
    private AppLovinAdView mLoadedAdView;
    private AppLovinAd mLoadedInterstitialAd;
    private AppLovinAd mLoadedRewardedAd;
    private AppLovinAd mLoadedRewardedInterstitialAd;
    private AppLovinNativeAd mNativeAd;
    private MaxReward mPendingReward;

    /* renamed from: com.applovin.mediation.adapters.AppLovinMediationAdapter$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements AppLovinAdLoadListener {
        public final /* synthetic */ Activity val$activity;
        public final /* synthetic */ MaxAdFormat val$adFormat;
        public final /* synthetic */ MaxAdViewAdapterListener val$listener;

        public AnonymousClass1(MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.val$adFormat = maxAdFormat;
            this.val$activity = activity;
            this.val$listener = maxAdViewAdapterListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
            appLovinMediationAdapter.log(this.val$adFormat.getLabel() + " ad loaded");
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1
                @Override // java.lang.Runnable
                public void run() {
                    AppLovinMediationAdapter.this.mLoadedAdView = new AppLovinAdView(AppLovinMediationAdapter.this.getWrappingSdk(), appLovinAd.getSize(), AnonymousClass1.this.val$activity);
                    AppLovinMediationAdapter.this.mLoadedAdView.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1.1
                        @Override // com.applovin.sdk.AppLovinAdDisplayListener
                        public void adDisplayed(AppLovinAd appLovinAd2) {
                            AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                            appLovinMediationAdapter2.log(AnonymousClass1.this.val$adFormat.getLabel() + " ad shown");
                            AnonymousClass1.this.val$listener.onAdViewAdDisplayed();
                        }

                        @Override // com.applovin.sdk.AppLovinAdDisplayListener
                        public void adHidden(AppLovinAd appLovinAd2) {
                            AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                            appLovinMediationAdapter2.log(AnonymousClass1.this.val$adFormat.getLabel() + " ad hidden");
                            AnonymousClass1.this.val$listener.onAdViewAdHidden();
                        }
                    });
                    AppLovinMediationAdapter.this.mLoadedAdView.setAdClickListener(new AppLovinAdClickListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1.2
                        @Override // com.applovin.sdk.AppLovinAdClickListener
                        public void adClicked(AppLovinAd appLovinAd2) {
                            AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                            appLovinMediationAdapter2.log(AnonymousClass1.this.val$adFormat.getLabel() + " ad clicked");
                            AnonymousClass1.this.val$listener.onAdViewAdClicked();
                        }
                    });
                    AppLovinMediationAdapter.this.mLoadedAdView.setAdViewEventListener(new AppLovinAdViewEventListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1.3
                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adClosedFullscreen(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView) {
                            AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                            appLovinMediationAdapter2.log(AnonymousClass1.this.val$adFormat.getLabel() + " ad collapsed");
                            AnonymousClass1.this.val$listener.onAdViewAdCollapsed();
                        }

                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adFailedToDisplay(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
                            MaxAdapterError maxError = AppLovinMediationAdapter.toMaxError(appLovinAdViewDisplayErrorCode);
                            AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                            appLovinMediationAdapter2.log(AnonymousClass1.this.val$adFormat.getLabel() + " ad failed to display with error: " + maxError);
                            AnonymousClass1.this.val$listener.onAdViewAdDisplayFailed(maxError);
                        }

                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adLeftApplication(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView) {
                        }

                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adOpenedFullscreen(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView) {
                            AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                            appLovinMediationAdapter2.log(AnonymousClass1.this.val$adFormat.getLabel() + " ad expanded");
                            AnonymousClass1.this.val$listener.onAdViewAdExpanded();
                        }
                    });
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    anonymousClass1.val$listener.onAdViewAdLoaded(AppLovinMediationAdapter.this.mLoadedAdView);
                    AppLovinMediationAdapter.this.mLoadedAdView.renderAd(appLovinAd);
                }
            });
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i2) {
            AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
            appLovinMediationAdapter.log(this.val$adFormat.getLabel() + " ad failed to load with error code: " + i2);
            this.val$listener.onAdViewAdLoadFailed(AppLovinMediationAdapter.toMaxError(i2));
        }
    }

    /* loaded from: classes.dex */
    public class InterstitialListenerWrapper implements g, AppLovinAdClickListener {
        public final MaxInterstitialAdapterListener listener;

        public InterstitialListenerWrapper(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            AppLovinMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            AppLovinMediationAdapter.this.log("Interstitial ad shown");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            AppLovinMediationAdapter.this.log("Interstitial ad hidden");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.applovin.impl.sdk.ad.g
        public void onAdDisplayFailed(String str) {
            AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
            appLovinMediationAdapter.log("Interstitial ad failed to display with error: " + str);
            this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
        }
    }

    /* loaded from: classes.dex */
    public class MaxAppLovinNativeAd extends MaxNativeAd {
        public MaxAppLovinNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) AppLovinMediationAdapter.this.mNativeAd;
            if (appLovinNativeAdImpl == null) {
                AppLovinMediationAdapter.this.e("Failed to register native ad view for interaction. Native ad is null");
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            if (StringUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                arrayList.add(maxNativeAdView.getTitleTextView());
            }
            if (StringUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
                arrayList.add(maxNativeAdView.getBodyTextView());
            }
            if (StringUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                arrayList.add(maxNativeAdView.getCallToActionButton());
            }
            if (getIcon() != null && maxNativeAdView.getIconImageView() != null) {
                arrayList.add(maxNativeAdView.getIconImageView());
            }
            appLovinNativeAdImpl.registerViewsForInteraction(arrayList);
        }
    }

    /* loaded from: classes.dex */
    public abstract class RewardListenerWrapper implements AppLovinAdRewardListener {
        public boolean isFullyWatched;

        private RewardListenerWrapper() {
        }

        public /* synthetic */ RewardListenerWrapper(AppLovinMediationAdapter appLovinMediationAdapter, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
            appLovinMediationAdapter.log("User is over quota: " + map);
            AppLovinMediationAdapter.this.mPendingReward = null;
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
            appLovinMediationAdapter.log("Reward rejected: " + map);
            AppLovinMediationAdapter.this.mPendingReward = null;
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            String str = map.get(AppLovinEventParameters.REVENUE_CURRENCY);
            String str2 = map.get(AppLovinEventParameters.REVENUE_AMOUNT);
            if (StringUtils.isValidString(str) && StringUtils.isValidString(str2)) {
                int i2 = 0;
                try {
                    i2 = (int) Double.parseDouble(str2);
                } catch (NumberFormatException e2) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.log("Failed to parse AppLovin reward amount: " + str2, e2);
                }
                AppLovinMediationAdapter.this.mPendingReward = MaxRewardImpl.create(i2, str);
            } else {
                AppLovinMediationAdapter.this.mPendingReward = MaxRewardImpl.createDefault();
            }
            AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
            StringBuilder y = a.y("Rewarded verified: ");
            y.append(AppLovinMediationAdapter.this.mPendingReward);
            appLovinMediationAdapter2.log(y.toString());
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i2) {
            AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
            appLovinMediationAdapter.log("Reward validation request failed with code: " + i2);
            AppLovinMediationAdapter.this.mPendingReward = null;
        }
    }

    /* loaded from: classes.dex */
    public class RewardedAdListenerWrapper extends RewardListenerWrapper implements g, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private final MaxRewardedAdapterListener listener;

        private RewardedAdListenerWrapper(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            super(AppLovinMediationAdapter.this, null);
            this.listener = maxRewardedAdapterListener;
        }

        public /* synthetic */ RewardedAdListenerWrapper(AppLovinMediationAdapter appLovinMediationAdapter, MaxRewardedAdapterListener maxRewardedAdapterListener, AnonymousClass1 anonymousClass1) {
            this(maxRewardedAdapterListener);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            AppLovinMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            AppLovinMediationAdapter.this.log("Rewarded ad shown");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if ((this.isFullyWatched && AppLovinMediationAdapter.this.mPendingReward != null) || AppLovinMediationAdapter.this.shouldAlwaysRewardUser()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                StringBuilder y = a.y("Rewarded user with reward: ");
                y.append(AppLovinMediationAdapter.this.mPendingReward);
                appLovinMediationAdapter.log(y.toString());
                this.listener.onUserRewarded(AppLovinMediationAdapter.this.mPendingReward);
                AppLovinMediationAdapter.this.mPendingReward = null;
            }
            AppLovinMediationAdapter.this.log("Rewarded ad hidden");
            this.listener.onRewardedAdHidden();
        }

        @Override // com.applovin.impl.sdk.ad.g
        public void onAdDisplayFailed(String str) {
            AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
            appLovinMediationAdapter.log("Rewarded ad failed to display with error: " + str);
            this.listener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            AppLovinMediationAdapter.this.log("Rewarded ad video started");
            this.listener.onRewardedAdVideoStarted();
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z) {
            AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
            appLovinMediationAdapter.log("Rewarded ad video ended at " + d2 + "% and is fully watched: " + z);
            this.isFullyWatched = z;
            this.listener.onRewardedAdVideoCompleted();
        }
    }

    /* loaded from: classes.dex */
    public class RewardedInterstitialAdListenerWrapper extends RewardListenerWrapper implements g, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private final MaxRewardedInterstitialAdapterListener listener;

        private RewardedInterstitialAdListenerWrapper(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
            super(AppLovinMediationAdapter.this, null);
            this.listener = maxRewardedInterstitialAdapterListener;
        }

        public /* synthetic */ RewardedInterstitialAdListenerWrapper(AppLovinMediationAdapter appLovinMediationAdapter, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, AnonymousClass1 anonymousClass1) {
            this(maxRewardedInterstitialAdapterListener);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            AppLovinMediationAdapter.this.log("Rewarded interstitial ad clicked");
            this.listener.onRewardedInterstitialAdClicked();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            AppLovinMediationAdapter.this.log("Rewarded interstitial ad shown");
            this.listener.onRewardedInterstitialAdDisplayed();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if ((this.isFullyWatched && AppLovinMediationAdapter.this.mPendingReward != null) || AppLovinMediationAdapter.this.shouldAlwaysRewardUser()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                StringBuilder y = a.y("Rewarded interstitial user with reward: ");
                y.append(AppLovinMediationAdapter.this.mPendingReward);
                appLovinMediationAdapter.log(y.toString());
                this.listener.onUserRewarded(AppLovinMediationAdapter.this.mPendingReward);
                AppLovinMediationAdapter.this.mPendingReward = null;
            }
            AppLovinMediationAdapter.this.log("Rewarded interstitial ad hidden");
            this.listener.onRewardedInterstitialAdHidden();
        }

        @Override // com.applovin.impl.sdk.ad.g
        public void onAdDisplayFailed(String str) {
            AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
            appLovinMediationAdapter.log("Rewarded interstitial ad failed to display with error: " + str);
            this.listener.onRewardedInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            AppLovinMediationAdapter.this.log("Rewarded interstitial ad video started");
            this.listener.onRewardedInterstitialAdVideoStarted();
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z) {
            AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
            appLovinMediationAdapter.log("Rewarded interstitial ad video ended at " + d2 + "% and is fully watched: " + z);
            this.isFullyWatched = z;
            this.listener.onRewardedInterstitialAdVideoCompleted();
        }
    }

    public AppLovinMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasRequiredAssets(boolean z, AppLovinNativeAd appLovinNativeAd) {
        return z ? StringUtils.isValidString(appLovinNativeAd.getTitle()) : StringUtils.isValidString(appLovinNativeAd.getTitle()) && StringUtils.isValidString(appLovinNativeAd.getCallToAction());
    }

    private void loadFullscreenAd(String str, MaxAdapterResponseParameters maxAdapterResponseParameters, final MaxAdFormat maxAdFormat, final MaxAdapterListener maxAdapterListener) {
        StringBuilder y;
        AppLovinAdLoadListener appLovinAdLoadListener = new AppLovinAdLoadListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.2
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log(maxAdFormat.getLabel() + " ad loaded");
                MaxAdFormat maxAdFormat2 = maxAdFormat;
                if (maxAdFormat2 == MaxAdFormat.INTERSTITIAL) {
                    AppLovinMediationAdapter.this.mLoadedInterstitialAd = appLovinAd;
                    ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdLoaded();
                } else if (maxAdFormat2 == MaxAdFormat.REWARDED) {
                    AppLovinMediationAdapter.this.mLoadedRewardedAd = appLovinAd;
                    ((MaxRewardedAdapterListener) maxAdapterListener).onRewardedAdLoaded();
                } else if (maxAdFormat2 != MaxAdFormat.REWARDED_INTERSTITIAL) {
                    throw new IllegalStateException("Non-fullscreen ad loaded for fullscreen ad adapter");
                } else {
                    AppLovinMediationAdapter.this.mLoadedRewardedInterstitialAd = appLovinAd;
                    ((MaxRewardedInterstitialAdapterListener) maxAdapterListener).onRewardedInterstitialAdLoaded();
                }
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i2) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log(maxAdFormat.getLabel() + " ad failed to load with error code: " + i2);
                MaxAdFormat maxAdFormat2 = maxAdFormat;
                if (maxAdFormat2 == MaxAdFormat.INTERSTITIAL) {
                    ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdLoadFailed(AppLovinMediationAdapter.toMaxError(i2));
                } else if (maxAdFormat2 == MaxAdFormat.REWARDED) {
                    ((MaxRewardedAdapterListener) maxAdapterListener).onRewardedAdLoadFailed(AppLovinMediationAdapter.toMaxError(i2));
                } else if (maxAdFormat2 != MaxAdFormat.REWARDED_INTERSTITIAL) {
                    throw new IllegalStateException("Non-fullscreen ad failed to load for fullscreen ad adapter");
                } else {
                    ((MaxRewardedInterstitialAdapterListener) maxAdapterListener).onRewardedInterstitialAdLoadFailed(AppLovinMediationAdapter.toMaxError(i2));
                }
            }
        };
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            StringBuilder y2 = a.y("Loading bidding ");
            y2.append(maxAdFormat.getLabel());
            y2.append(" ad...");
            log(y2.toString());
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), appLovinAdLoadListener);
            return;
        }
        if (StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            str = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            y = a.y("Loading mediated ");
            y.append(maxAdFormat.getLabel());
            y.append(" ad: ");
            y.append(str);
            y.append("...");
        } else {
            y = a.y("Loading mediated ");
            y.append(maxAdFormat.getLabel());
            y.append(" ad...");
        }
        log(y.toString());
        getWrappingSdk().getAdService().loadNextAdForZoneId(str, appLovinAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(int i2) {
        int i3 = 204;
        if (i2 == -1009) {
            i3 = MaxAdapterError.ERROR_CODE_NO_CONNECTION;
        } else if (i2 != 204) {
            i3 = i2 == -1 ? MaxAdapterError.ERROR_CODE_INTERNAL_ERROR : i2 >= 500 ? MaxAdapterError.ERROR_CODE_SERVER_ERROR : MaxAdapterError.ERROR_CODE_UNSPECIFIED;
        }
        return new MaxAdapterError(i3, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        return MaxAdapterError.UNSPECIFIED;
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        maxSignalCollectionListener.onSignalCollected(getWrappingSdk().getAdService().getBidToken());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return getSdkVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return AppLovinSdk.VERSION;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(maxAdFormat, activity, maxAdViewAdapterListener);
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            StringBuilder y = a.y("Loading bidding ");
            y.append(maxAdFormat.getLabel());
            y.append(" ad...");
            log(y.toString());
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), anonymousClass1);
        } else if (StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            StringBuilder y2 = a.y("Loading mediated ");
            y2.append(maxAdFormat.getLabel());
            y2.append(" ad: ");
            y2.append(thirdPartyAdPlacementId);
            y2.append("...");
            log(y2.toString());
            getWrappingSdk().getAdService().loadNextAdForZoneId(thirdPartyAdPlacementId, anonymousClass1);
        } else {
            AppLovinAdSize appLovinAdSize = null;
            if (maxAdFormat == MaxAdFormat.BANNER) {
                appLovinAdSize = AppLovinAdSize.BANNER;
            } else if (maxAdFormat == MaxAdFormat.MREC) {
                appLovinAdSize = AppLovinAdSize.MREC;
            } else if (maxAdFormat == MaxAdFormat.LEADER) {
                appLovinAdSize = AppLovinAdSize.LEADER;
            }
            if (appLovinAdSize != null) {
                StringBuilder y3 = a.y("Loading mediated ");
                y3.append(maxAdFormat.getLabel());
                y3.append(" ad...");
                log(y3.toString());
                getWrappingSdk().getAdService().loadNextAd(appLovinAdSize, anonymousClass1);
                return;
            }
            log("Failed to load ad for format: " + maxAdFormat);
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INTERNAL_ERROR);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        loadFullscreenAd("inter_regular", maxAdapterResponseParameters, MaxAdFormat.INTERSTITIAL, maxInterstitialAdapterListener);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        d("Loading bidding native ad...");
        getWrappingSdk().coreSdk.v().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), new AppLovinNativeAdLoadListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.3
            @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
            public void onNativeAdLoadFailed(int i2) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.d("Native ad failed to load with error code: " + i2);
                maxNativeAdAdapterListener.onNativeAdLoadFailed(AppLovinMediationAdapter.toMaxError(i2));
            }

            @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
            public void onNativeAdLoaded(AppLovinNativeAd appLovinNativeAd) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.d("Native ad loaded: " + appLovinNativeAd);
                if (AppLovinMediationAdapter.this.hasRequiredAssets(StringUtils.isValidString(BundleUtils.getString("template", "", maxAdapterResponseParameters.getServerParameters())), appLovinNativeAd)) {
                    ((AppLovinNativeAdImpl) appLovinNativeAd).setEventListener(new AppLovinNativeAdEventListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.3.1
                        @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener
                        public void onNativeAdClicked(AppLovinNativeAd appLovinNativeAd2) {
                            AppLovinMediationAdapter.this.d("Native ad clicked");
                            maxNativeAdAdapterListener.onNativeAdClicked();
                        }
                    });
                    AppLovinMediationAdapter.this.mNativeAd = appLovinNativeAd;
                    maxNativeAdAdapterListener.onNativeAdLoaded(new MaxAppLovinNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(appLovinNativeAd.getTitle()).setBody(appLovinNativeAd.getBody()).setAdvertiser(appLovinNativeAd.getAdvertiser()).setCallToAction(appLovinNativeAd.getCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(appLovinNativeAd.getIconUri())).setMediaView(appLovinNativeAd.getMediaView()).setOptionsView(appLovinNativeAd.getOptionsView())), null);
                    return;
                }
                AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                appLovinMediationAdapter2.e("Native ad does not have required assets: " + appLovinNativeAd);
                maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        loadFullscreenAd("inter_videoa", maxAdapterResponseParameters, MaxAdFormat.REWARDED, maxRewardedAdapterListener);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void loadRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        loadFullscreenAd("inter_autorew", maxAdapterResponseParameters, MaxAdFormat.REWARDED_INTERSTITIAL, maxRewardedInterstitialAdapterListener);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        this.mLoadedInterstitialAd = null;
        this.mLoadedRewardedAd = null;
        this.mLoadedRewardedInterstitialAd = null;
        AppLovinAdView appLovinAdView = this.mLoadedAdView;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.mLoadedAdView = null;
        }
        AppLovinNativeAd appLovinNativeAd = this.mNativeAd;
        if (appLovinNativeAd != null) {
            ((AppLovinNativeAdImpl) appLovinNativeAd).setEventListener(null);
            this.mNativeAd.unregisterViewsForInteraction();
            this.mNativeAd.getMediaView().destroy();
            this.mNativeAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        StringBuilder y = a.y("Showing interstitial: ");
        y.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        y.append("...");
        log(y.toString());
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        InterstitialListenerWrapper interstitialListenerWrapper = new InterstitialListenerWrapper(maxInterstitialAdapterListener);
        create.setAdDisplayListener(interstitialListenerWrapper);
        create.setAdClickListener(interstitialListenerWrapper);
        create.showAndRender(this.mLoadedInterstitialAd);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, j jVar, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        StringBuilder y = a.y("Showing interstitial ad view: ");
        y.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        y.append("...");
        log(y.toString());
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        InterstitialListenerWrapper interstitialListenerWrapper = new InterstitialListenerWrapper(maxInterstitialAdapterListener);
        create.setAdDisplayListener(interstitialListenerWrapper);
        create.setAdClickListener(interstitialListenerWrapper);
        create.showAndRender(this.mLoadedInterstitialAd, viewGroup, jVar);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        StringBuilder y = a.y("Showing rewarded ad: ");
        y.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        y.append("...");
        log(y.toString());
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        RewardedAdListenerWrapper rewardedAdListenerWrapper = new RewardedAdListenerWrapper(this, maxRewardedAdapterListener, null);
        create.show(this.mLoadedRewardedAd, activity, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxRewardedAdViewAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, j jVar, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        StringBuilder y = a.y("Showing rewarded ad view: ");
        y.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        y.append("...");
        log(y.toString());
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        RewardedAdListenerWrapper rewardedAdListenerWrapper = new RewardedAdListenerWrapper(this, maxRewardedAdapterListener, null);
        create.show(this.mLoadedRewardedAd, viewGroup, jVar, activity, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void showRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        StringBuilder y = a.y("Showing rewarded interstitial ad: ");
        y.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        y.append("...");
        log(y.toString());
        RewardedInterstitialAdListenerWrapper rewardedInterstitialAdListenerWrapper = new RewardedInterstitialAdListenerWrapper(this, maxRewardedInterstitialAdapterListener, null);
        if (this.mLoadedRewardedInterstitialAd.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            configureReward(maxAdapterResponseParameters);
            AppLovinRewardedInterstitialAd appLovinRewardedInterstitialAd = new AppLovinRewardedInterstitialAd(getWrappingSdk());
            appLovinRewardedInterstitialAd.setAdDisplayListener(rewardedInterstitialAdListenerWrapper);
            appLovinRewardedInterstitialAd.setAdClickListener(rewardedInterstitialAdListenerWrapper);
            appLovinRewardedInterstitialAd.setAdVideoPlaybackListener(rewardedInterstitialAdListenerWrapper);
            appLovinRewardedInterstitialAd.show(this.mLoadedRewardedInterstitialAd, activity, rewardedInterstitialAdListenerWrapper);
            return;
        }
        log("Rewarded interstitial is regular interstitial");
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        create.setAdDisplayListener(rewardedInterstitialAdListenerWrapper);
        create.setAdClickListener(rewardedInterstitialAdListenerWrapper);
        create.setAdVideoPlaybackListener(rewardedInterstitialAdListenerWrapper);
        create.showAndRender(this.mLoadedRewardedInterstitialAd);
    }
}
