package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class K<Listener extends AdapterAdInteractionListener> extends BaseAdInteractionAdapter<K<Listener>, Listener> implements AdapterDebugInterface, AdapterBaseInterface, AdapterBidderInterface, AdapterConsentInterface, AdapterSettingsInterface, InterstitialSmashListener, RewardedVideoSmashListener {
    IronSource.AD_UNIT a;
    private AbstractAdapter b;
    private com.ironsource.mediationsdk.adunit.b.d c;
    private NetworkInitializationListener d;
    private AdapterAdListener e;

    public K(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        super(ad_unit, networkSettings);
        this.b = abstractAdapter;
        this.a = ad_unit;
        this.c = new com.ironsource.mediationsdk.adunit.b.d(ad_unit, d.b.PROVIDER, null);
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.b.addInterstitialListener(this);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.b.addRewardedVideoListener(this);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error(a("ad unit not supported - " + this.a));
        }
    }

    private String a(String str) {
        String ad_unit = this.a.toString();
        if (TextUtils.isEmpty(str)) {
            return ad_unit;
        }
        return ad_unit + " - " + str;
    }

    private boolean a(IronSourceError ironSourceError) {
        if (this.a == IronSource.AD_UNIT.INTERSTITIAL) {
            return ironSourceError.getErrorCode() == 1158;
        } else if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return ironSourceError.getErrorCode() == 1058;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error(a("ad unit not supported - " + this.a));
            return false;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public final String getAdapterVersion() {
        return this.b.getVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface
    public final Map<String, Object> getBiddingData(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.a == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.b.getInterstitialBiddingData(jSONObject);
            }
            if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.b.getRewardedVideoBiddingData(jSONObject);
            }
            IronLog.INTERNAL.error(a("ad unit not supported - " + this.a));
            return null;
        } catch (Throwable th) {
            String str = "getBiddingData exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            this.c.e.m(str);
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public final LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return this.a == IronSource.AD_UNIT.REWARDED_VIDEO ? this.b.getLoadWhileShowSupportState(networkSettings.getRewardedVideoSettings()) : LoadWhileShowSupportState.NONE;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public final /* bridge */ /* synthetic */ AdapterBaseInterface getNetworkAdapter() {
        return this;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public final String getNetworkSDKVersion() {
        return this.b.getCoreSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public final void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        this.d = networkInitializationListener;
        String string = adData.getString(DataKeys.USER_ID);
        try {
            String str = E.a().l;
            if (!TextUtils.isEmpty(str)) {
                this.b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.b.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Throwable th) {
            String str2 = "setCustomParams exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            this.c.e.m(str2);
        }
        JSONObject a = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        try {
            if (this.a == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num == null || num.intValue() != 1) {
                    this.b.initInterstitialForBidding("", string, a, this);
                } else {
                    this.b.initInterstitial("", string, a, this);
                }
            } else if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.b.initRewardedVideoWithCallback("", string, a, this);
            } else {
                IronLog.INTERNAL.error("ad unit not supported - " + this.a);
            }
        } catch (Throwable th2) {
            String str3 = "init failed - " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            this.c.e.m(str3);
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, str3));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter
    public final boolean isAdAvailable(AdData adData) {
        JSONObject a = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        try {
            if (this.a == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.b.isInterstitialReady(a);
            }
            if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.b.isRewardedVideoAvailable(a);
            }
            IronLog.INTERNAL.error(a("ad unit not supported - " + this.a));
            return false;
        } catch (Throwable th) {
            String str = "isAdAvailable exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            this.c.e.m(str);
            return false;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public final /* synthetic */ void loadAd(AdData adData, Activity activity, Object obj) {
        this.e = (AdapterAdInteractionListener) obj;
        JSONObject a = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        try {
            if (this.a == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num == null || num.intValue() != 1) {
                    this.b.loadInterstitialForBidding(a, this, adData.getServerData());
                } else {
                    this.b.loadInterstitial(a, this);
                }
            } else if (this.a != IronSource.AD_UNIT.REWARDED_VIDEO) {
                IronLog.INTERNAL.error(a("ad unit not supported - " + this.a));
            } else {
                Integer num2 = adData.getInt("instanceType");
                if (num2 == null || num2.intValue() != 1) {
                    this.b.loadRewardedVideoForBidding(a, this, adData.getServerData());
                } else {
                    this.b.fetchRewardedVideoForAutomaticLoad(a, this);
                }
            }
        } catch (Throwable th) {
            String str = "loadAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            this.c.e.m(str);
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadFailed(a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        NetworkInitializationListener networkInitializationListener = this.d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdEnded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener instanceof AdapterAdRewardListener) {
            ((AdapterAdRewardListener) adapterAdListener).onAdRewarded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdStarted();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdVisible();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("available = " + z));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener != null) {
            if (z) {
                adapterAdListener.onAdLoadSuccess();
                return;
            }
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(this.a.name(), this.b.getProviderName(), "availability changed to false");
            this.e.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, buildLoadFailedError.getErrorCode(), buildLoadFailedError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        NetworkInitializationListener networkInitializationListener = this.d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        AdapterErrorType adapterErrorType;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        if (this.e != null) {
            if (a(ironSourceError)) {
                adapterErrorType = AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL;
            } else {
                boolean z = false;
                if (this.a != IronSource.AD_UNIT.INTERSTITIAL) {
                    if (this.a != IronSource.AD_UNIT.REWARDED_VIDEO) {
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.error(a("ad unit not supported - " + this.a));
                    } else if (ironSourceError.getErrorCode() == 1057) {
                        z = true;
                    }
                }
                adapterErrorType = z ? AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            }
            this.e.onAdLoadFailed(adapterErrorType, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public final void releaseMemory() {
        AbstractAdapter abstractAdapter = this.b;
        if (abstractAdapter != null) {
            abstractAdapter.releaseMemory(this.a, new JSONObject());
            this.b = null;
        }
        this.d = null;
        this.e = null;
        com.ironsource.mediationsdk.adunit.b.d dVar = this.c;
        if (dVar != null) {
            dVar.a();
            this.c = null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public final void setAdapterDebug(boolean z) {
        this.b.setAdapterDebug(Boolean.valueOf(z));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public final void setConsent(boolean z) {
        this.b.setConsent(z);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter
    public final void showAd(AdData adData, Listener listener) {
        this.e = listener;
        JSONObject a = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        try {
            if (this.a == IronSource.AD_UNIT.INTERSTITIAL) {
                this.b.showInterstitial(a, this);
            } else if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.b.showRewardedVideo(a, this);
            } else {
                IronLog.INTERNAL.error(a("ad unit not supported - " + this.a));
            }
        } catch (Throwable th) {
            String str = "showAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            this.c.e.m(str);
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
        }
    }
}
