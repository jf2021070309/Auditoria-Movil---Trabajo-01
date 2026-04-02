package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.AbstractC0108b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class C extends AbstractC0108b implements InterstitialSmashListener {
    JSONObject r;
    com.ironsource.mediationsdk.sdk.i s;
    long t;
    private int u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        this.r = interstitialSettings;
        this.k = interstitialSettings.optInt("maxAdsPerIteration", 99);
        this.l = this.r.optInt("maxAdsPerSession", 99);
        this.m = this.r.optInt("maxAdsPerDay", 99);
        this.e = networkSettings.isMultipleInstances();
        this.f = networkSettings.getSubProviderId();
        this.u = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC0108b
    public final void g() {
        this.h = 0;
        a(AbstractC0108b.a.INITIATED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC0108b
    public final void h() {
        try {
            e();
            this.i = new Timer();
            this.i.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.C.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    cancel();
                    if (C.this.a != AbstractC0108b.a.INIT_PENDING || C.this.s == null) {
                        return;
                    }
                    C.this.a(AbstractC0108b.a.INIT_FAILED);
                    C.this.s.a(ErrorBuilder.buildInitFailedError("Timeout", IronSourceConstants.INTERSTITIAL_AD_UNIT), C.this);
                }
            }, this.u * 1000);
        } catch (Exception e) {
            a("startInitTimer", e.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC0108b
    public final void i() {
        try {
            f();
            this.j = new Timer();
            this.j.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.C.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    cancel();
                    if (C.this.a != AbstractC0108b.a.LOAD_PENDING || C.this.s == null) {
                        return;
                    }
                    C.this.a(AbstractC0108b.a.NOT_AVAILABLE);
                    C.this.s.a(ErrorBuilder.buildLoadFailedError("Timeout"), C.this, new Date().getTime() - C.this.t);
                }
            }, this.u * 1000);
        } catch (Exception e) {
            a("startLoadTimer", e.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC0108b
    protected final String k() {
        return IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        com.ironsource.mediationsdk.sdk.i iVar = this.s;
        if (iVar != null) {
            iVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        com.ironsource.mediationsdk.sdk.i iVar = this.s;
        if (iVar != null) {
            iVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        f();
        if (this.a != AbstractC0108b.a.LOAD_PENDING || this.s == null) {
            return;
        }
        this.s.a(ironSourceError, this, new Date().getTime() - this.t);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        com.ironsource.mediationsdk.sdk.i iVar = this.s;
        if (iVar != null) {
            iVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        f();
        if (this.a != AbstractC0108b.a.LOAD_PENDING || this.s == null) {
            return;
        }
        this.s.a(this, new Date().getTime() - this.t);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.sdk.i iVar = this.s;
        if (iVar != null) {
            iVar.b(ironSourceError, this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
        com.ironsource.mediationsdk.sdk.i iVar = this.s;
        if (iVar != null) {
            iVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        com.ironsource.mediationsdk.sdk.i iVar = this.s;
        if (iVar != null) {
            iVar.f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        e();
        if (this.a == AbstractC0108b.a.INIT_PENDING) {
            a(AbstractC0108b.a.INIT_FAILED);
            com.ironsource.mediationsdk.sdk.i iVar = this.s;
            if (iVar != null) {
                iVar.a(ironSourceError, this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
        e();
        if (this.a == AbstractC0108b.a.INIT_PENDING) {
            a(AbstractC0108b.a.INITIATED);
            com.ironsource.mediationsdk.sdk.i iVar = this.s;
            if (iVar != null) {
                iVar.a(this);
            }
        }
    }
}
