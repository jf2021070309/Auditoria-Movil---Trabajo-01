package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C0128v;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;
/* renamed from: com.ironsource.mediationsdk.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0127u extends C0128v implements RewardedVideoSmashListener {
    private com.ironsource.mediationsdk.sdk.d i;
    private long j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0127u(String str, String str2, NetworkSettings networkSettings, com.ironsource.mediationsdk.sdk.d dVar, int i, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.b = new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO);
        this.c = this.b.b;
        this.a = abstractAdapter;
        this.i = dVar;
        this.d = i;
        this.a.initRewardedVideoForDemandOnly(str, str2, this.c, this);
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.b.a.getProviderName() + " : " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.b.a.getProviderName() + " : " + str, 0);
    }

    public final void a() {
        d("showRewardedVideo state=" + g());
        if (a(C0128v.a.LOADED, C0128v.a.SHOW_IN_PROGRESS)) {
            this.a.showRewardedVideo(this.c, this);
            return;
        }
        this.i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        d("loadRewardedVideo state=" + g());
        C0128v.a a = a(new C0128v.a[]{C0128v.a.NOT_LOADED, C0128v.a.LOADED}, C0128v.a.LOAD_IN_PROGRESS);
        if (a != C0128v.a.NOT_LOADED && a != C0128v.a.LOADED) {
            if (a == C0128v.a.LOAD_IN_PROGRESS) {
                this.i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0L);
                return;
            } else {
                this.i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress"), this, 0L);
                return;
            }
        }
        this.j = new Date().getTime();
        d("start timer");
        a(new TimerTask() { // from class: com.ironsource.mediationsdk.u.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C0127u c0127u = C0127u.this;
                c0127u.d("load timed out state=" + C0127u.this.g());
                if (C0127u.this.a(C0128v.a.LOAD_IN_PROGRESS, C0128v.a.NOT_LOADED)) {
                    C0127u.this.i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), C0127u.this, new Date().getTime() - C0127u.this.j);
                }
            }
        });
        if (!i()) {
            this.a.loadRewardedVideoForDemandOnly(this.c, this);
            return;
        }
        this.e = str2;
        this.f = jSONObject;
        this.g = list;
        this.a.loadRewardedVideoForDemandOnlyForBidding(this.c, this, str);
    }

    public final boolean b() {
        return this.a.isRewardedVideoAvailable(this.c);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        c("onRewardedVideoAdClicked");
        this.i.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        a(C0128v.a.NOT_LOADED);
        c("onRewardedVideoAdClosed");
        this.i.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        c("onRewardedVideoAdOpened");
        this.i.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        c("onRewardedVideoAdRewarded");
        this.i.e(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a(C0128v.a.NOT_LOADED);
        c("onRewardedVideoAdClosed error=" + ironSourceError);
        this.i.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        c("onRewardedVideoAdVisible");
        this.i.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        c("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + g());
        h();
        if (a(C0128v.a.LOAD_IN_PROGRESS, C0128v.a.NOT_LOADED)) {
            this.i.a(ironSourceError, this, new Date().getTime() - this.j);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
        c("onRewardedVideoLoadSuccess state=" + g());
        h();
        if (a(C0128v.a.LOAD_IN_PROGRESS, C0128v.a.LOADED)) {
            this.i.a(this, new Date().getTime() - this.j);
        }
    }
}
