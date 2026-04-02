package com.ironsource.mediationsdk.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class j implements InterstitialListener, RewardedVideoListener, SegmentListener, g {
    public RewardedVideoListener a;
    public InterstitialListener b;
    public OfferwallListener c;
    public SegmentListener d;
    public InterstitialPlacement e = null;
    public String f = null;
    private a g;
    private long h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends Thread {
        Handler a;

        private a() {
        }

        /* synthetic */ a(j jVar, byte b) {
            this();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Looper.prepare();
            this.a = new Handler();
            Looper.loop();
        }
    }

    public j() {
        a aVar = new a(this, (byte) 0);
        this.g = aVar;
        aVar.start();
        this.h = new Date().getTime();
    }

    private void a(Runnable runnable) {
        Handler handler;
        a aVar = this.g;
        if (aVar == null || (handler = aVar.a) == null) {
            return;
        }
        handler.post(runnable);
    }

    private boolean a(Object obj) {
        return (obj == null || this.g == null) ? false : true;
    }

    public final void a(final IronSourceError ironSourceError, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "onRewardedVideoAdShowFailed(" + ironSourceError.toString() + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            if (!TextUtils.isEmpty(this.f)) {
                mediationAdditionalData.put("placement", this.f);
            }
            if (map != null) {
                for (String str : map.keySet()) {
                    mediationAdditionalData.put(str, map.get(str));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, mediationAdditionalData));
        if (a(this.a)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.21
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.a.onRewardedVideoAdShowFailed(ironSourceError);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.g
    public final void a(final boolean z, IronSourceError ironSourceError) {
        String str = "onOfferwallAvailable(isAvailable: " + z + ")";
        if (ironSourceError != null) {
            str = str + ", error: " + ironSourceError.getErrorMessage();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", String.valueOf(z));
            if (ironSourceError != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(IronSourceConstants.OFFERWALL_AVAILABLE, mediationAdditionalData));
        if (a(this.c)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.14
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.c.onOfferwallAvailable(z);
                }
            });
        }
    }

    public final void a(final boolean z, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAvailabilityChanged(available:" + z + ")", 1);
        long time = new Date().getTime() - this.h;
        this.h = new Date().getTime();
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, time);
            if (map != null) {
                for (String str : map.keySet()) {
                    mediationAdditionalData.put(str, map.get(str));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, mediationAdditionalData));
        if (a(this.a)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.16
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.a.onRewardedVideoAvailabilityChanged(z);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onGetOfferwallCreditsFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        if (a(this.c)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.11
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.c.onGetOfferwallCreditsFailed(ironSourceError);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdClicked() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
        if (a(this.b)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.7
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.b.onInterstitialAdClicked();
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
        if (a(this.b)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.8
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.b.onInterstitialAdClosed();
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdLoadFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        if (a(this.b)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.3
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.b.onInterstitialAdLoadFailed(ironSourceError);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
        if (a(this.b)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.4
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.b.onInterstitialAdOpened();
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdReady() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
        if (a(this.b)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.2
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.b.onInterstitialAdReady();
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdShowFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            if (this.e != null && !TextUtils.isEmpty(this.e.getPlacementName())) {
                mediationAdditionalData.put("placement", this.e.getPlacementName());
            }
            if (ironSourceError.getErrorMessage() != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, mediationAdditionalData));
        if (a(this.b)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.6
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.b.onInterstitialAdShowFailed(ironSourceError);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdShowSucceeded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
        if (a(this.b)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.5
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.b.onInterstitialAdShowSucceeded();
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        OfferwallListener offerwallListener = this.c;
        boolean onOfferwallAdCredited = offerwallListener != null ? offerwallListener.onOfferwallAdCredited(i, i2, z) : false;
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallAdCredited(credits:" + i + ", totalCredits:" + i2 + ", totalCreditsFlag:" + z + "):" + onOfferwallAdCredited, 1);
        return onOfferwallAdCredited;
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallAvailable(boolean z) {
        a(z, (IronSourceError) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallClosed()", 1);
        if (a(this.c)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.13
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.c.onOfferwallClosed();
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallOpened()", 1);
        if (a(this.c)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.9
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.c.onOfferwallOpened();
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallShowFailed(final IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        if (a(this.c)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.10
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.c.onOfferwallShowFailed(ironSourceError);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdClicked(final Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdClicked(" + placement.getPlacementName() + ")", 1);
        if (a(this.a)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.20
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.a.onRewardedVideoAdClicked(placement);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
        if (a(this.a)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.15
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.a.onRewardedVideoAdClosed();
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdEnded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
        if (a(this.a)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.18
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.a.onRewardedVideoAdEnded();
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
        if (a(this.a)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.12
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.a.onRewardedVideoAdOpened();
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdRewarded(final Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdRewarded(" + placement.toString() + ")", 1);
        if (a(this.a)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.19
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.a.onRewardedVideoAdRewarded(placement);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a(ironSourceError, (Map<String, Object>) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdStarted() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
        if (a(this.a)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.17
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.a.onRewardedVideoAdStarted();
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        a(z, (Map<String, Object>) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.SegmentListener
    public final void onSegmentReceived(final String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onSegmentReceived(" + str + ")", 1);
        if (a(this.d)) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.sdk.j.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    j.this.d.onSegmentReceived(str);
                }
            });
        }
    }
}
