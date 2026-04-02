package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C0128v;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;
/* renamed from: com.ironsource.mediationsdk.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0125s extends C0128v implements InterstitialSmashListener {
    private com.ironsource.mediationsdk.sdk.c i;
    private long j;

    public C0125s(String str, String str2, NetworkSettings networkSettings, com.ironsource.mediationsdk.sdk.c cVar, int i, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.i = cVar;
        this.d = i;
        this.a.initInterstitial(str, str2, this.c, this);
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyInterstitialSmash " + this.b.a.getProviderName() + " : " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyInterstitialSmash " + this.b.a.getProviderName() + " : " + str, 0);
    }

    public final void a() {
        d("showInterstitial state=" + g());
        if (a(C0128v.a.LOADED, C0128v.a.SHOW_IN_PROGRESS)) {
            this.a.showInterstitial(this.c, this);
            return;
        }
        this.i.a(new IronSourceError(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        d("loadInterstitial state=" + g());
        C0128v.a a = a(new C0128v.a[]{C0128v.a.NOT_LOADED, C0128v.a.LOADED}, C0128v.a.LOAD_IN_PROGRESS);
        if (a != C0128v.a.NOT_LOADED && a != C0128v.a.LOADED) {
            if (a == C0128v.a.LOAD_IN_PROGRESS) {
                this.i.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0L);
                return;
            } else {
                this.i.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "cannot load because show is in progress"), this, 0L);
                return;
            }
        }
        this.j = new Date().getTime();
        d("start timer");
        a(new TimerTask() { // from class: com.ironsource.mediationsdk.s.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                C0125s c0125s = C0125s.this;
                c0125s.d("load timed out state=" + C0125s.this.g());
                if (C0125s.this.a(C0128v.a.LOAD_IN_PROGRESS, C0128v.a.NOT_LOADED)) {
                    C0125s.this.i.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"), C0125s.this, new Date().getTime() - C0125s.this.j);
                }
            }
        });
        if (!i()) {
            this.a.loadInterstitial(this.c, this);
            return;
        }
        this.e = str2;
        this.f = jSONObject;
        this.g = list;
        this.a.loadInterstitialForBidding(this.c, this, str);
    }

    public final boolean b() {
        return this.a.isInterstitialReady(this.c);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        c("onInterstitialAdClicked");
        this.i.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        a(C0128v.a.NOT_LOADED);
        c("onInterstitialAdClosed");
        this.i.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + g());
        h();
        if (a(C0128v.a.LOAD_IN_PROGRESS, C0128v.a.NOT_LOADED)) {
            this.i.a(ironSourceError, this, new Date().getTime() - this.j);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        c("onInterstitialAdOpened");
        this.i.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        c("onInterstitialAdReady state=" + g());
        h();
        if (a(C0128v.a.LOAD_IN_PROGRESS, C0128v.a.LOADED)) {
            this.i.a(this, new Date().getTime() - this.j);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        a(C0128v.a.NOT_LOADED);
        c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.i.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        c("onInterstitialAdVisible");
        this.i.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
    }
}
