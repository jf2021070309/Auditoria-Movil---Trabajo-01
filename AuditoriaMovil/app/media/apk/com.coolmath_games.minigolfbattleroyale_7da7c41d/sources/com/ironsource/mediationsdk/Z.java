package com.ironsource.mediationsdk;

import android.util.Log;
import com.ironsource.mediationsdk.AbstractC0108b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class Z extends AbstractC0108b implements RewardedVideoSmashListener {
    JSONObject r;
    com.ironsource.mediationsdk.sdk.m s;
    AtomicBoolean t;
    long u;
    String v;
    public int w;
    private int x;
    private final String y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        this.y = IronSourceConstants.REQUEST_URL;
        JSONObject rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        this.r = rewardedVideoSettings;
        this.k = rewardedVideoSettings.optInt("maxAdsPerIteration", 99);
        this.l = this.r.optInt("maxAdsPerSession", 99);
        this.m = this.r.optInt("maxAdsPerDay", 99);
        this.v = this.r.optString(IronSourceConstants.REQUEST_URL);
        this.t = new AtomicBoolean(false);
        this.x = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(this);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.q.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoSmash logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, providerAdditionalData));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC0108b
    public final void g() {
        this.h = 0;
        a(o() ? AbstractC0108b.a.AVAILABLE : AbstractC0108b.a.NOT_AVAILABLE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC0108b
    public final void h() {
        try {
            e();
            this.i = new Timer();
            this.i.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.Z.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    synchronized (Z.this) {
                        cancel();
                        if (Z.this.s != null) {
                            String str = "Timeout for " + Z.this.d;
                            Z.this.q.log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                            Z.this.a(AbstractC0108b.a.NOT_AVAILABLE);
                            long time = new Date().getTime() - Z.this.u;
                            if (Z.this.t.compareAndSet(true, false)) {
                                Z.this.a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
                                Z.this.a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
                            } else {
                                Z.this.a((int) IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
                            }
                            Z.this.s.a(false, Z.this);
                        }
                    }
                }
            }, this.x * 1000);
        } catch (Exception e) {
            a("startInitTimer", e.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC0108b
    final void i() {
    }

    @Override // com.ironsource.mediationsdk.AbstractC0108b
    protected final String k() {
        return IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE;
    }

    public final void n() {
        this.p = null;
        if (this.b != null) {
            if (this.a != AbstractC0108b.a.CAPPED_PER_DAY && this.a != AbstractC0108b.a.CAPPED_PER_SESSION) {
                this.t.set(true);
                this.u = new Date().getTime();
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.d + ":fetchRewardedVideoForAutomaticLoad()", 1);
            this.b.fetchRewardedVideoForAutomaticLoad(this.r, this);
        }
    }

    public final boolean o() {
        if (this.b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.d + ":isRewardedVideoAvailable()", 1);
            return this.b.isRewardedVideoAvailable(this.r);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        com.ironsource.mediationsdk.sdk.m mVar = this.s;
        if (mVar != null) {
            mVar.f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        com.ironsource.mediationsdk.sdk.m mVar = this.s;
        if (mVar != null) {
            mVar.b(this);
        }
        n();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        com.ironsource.mediationsdk.sdk.m mVar = this.s;
        if (mVar != null) {
            mVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        com.ironsource.mediationsdk.sdk.m mVar = this.s;
        if (mVar != null) {
            mVar.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        com.ironsource.mediationsdk.sdk.m mVar = this.s;
        if (mVar != null) {
            mVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.sdk.m mVar = this.s;
        if (mVar != null) {
            mVar.a(ironSourceError, this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        com.ironsource.mediationsdk.sdk.m mVar = this.s;
        if (mVar != null) {
            mVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        com.ironsource.mediationsdk.sdk.m mVar = this.s;
        if (mVar != null) {
            mVar.g(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final synchronized void onRewardedVideoAvailabilityChanged(boolean z) {
        e();
        if (this.t.compareAndSet(true, false)) {
            a(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.u)}});
        } else {
            a(z ? IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE : IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, (Object[][]) null);
        }
        if (!c()) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.info(this.d + ": is capped or exhausted");
        } else if ((!z || this.a == AbstractC0108b.a.AVAILABLE) && (z || this.a == AbstractC0108b.a.NOT_AVAILABLE)) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.info(this.d + ": state remains " + z + " in smash, mediation remains unchanged");
        } else {
            a(z ? AbstractC0108b.a.AVAILABLE : AbstractC0108b.a.NOT_AVAILABLE);
            if (z) {
                this.o = Long.valueOf(System.currentTimeMillis());
            }
            if (this.s != null) {
                this.s.a(z, this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        long time = new Date().getTime() - this.u;
        if (ironSourceError.getErrorCode() == 1058) {
            a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.p = Long.valueOf(System.currentTimeMillis());
        }
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }
}
