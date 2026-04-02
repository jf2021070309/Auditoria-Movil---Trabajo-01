package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.AbstractC0108b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public final class R extends V implements InterstitialSmashListener {
    a a;
    private Q b;
    private Timer j;
    private int k;
    private String l;
    private String m;
    private long n;
    private final Object o;

    /* loaded from: classes2.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    public R(String str, String str2, NetworkSettings networkSettings, Q q, int i, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.o = new Object();
        this.a = R.a.NO_INIT;
        this.l = str;
        this.m = str2;
        this.b = q;
        this.j = null;
        this.k = i;
        this.c.addInterstitialListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        d("current state=" + this.a + ", new state=" + aVar);
        this.a = aVar;
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + k() + " : " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + k() + " : " + str, 0);
    }

    private void e(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + k() + " : " + str, 3);
    }

    private void q() {
        try {
            String str = E.a().l;
            if (!TextUtils.isEmpty(str)) {
                this.c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
        } catch (Exception e) {
            d("setCustomParams() " + e.getMessage());
        }
    }

    private void r() {
        synchronized (this.o) {
            if (this.j != null) {
                this.j.cancel();
                this.j = null;
            }
        }
    }

    private void s() {
        synchronized (this.o) {
            d("start timer");
            r();
            Timer timer = new Timer();
            this.j = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.R.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    R r = R.this;
                    r.d("timed out state=" + R.this.a.name() + " isBidder=" + R.this.h());
                    if (R.this.a == R.a.INIT_IN_PROGRESS && R.this.h()) {
                        R.this.a(R.a.NO_INIT);
                        return;
                    }
                    R.this.a(R.a.LOAD_FAILED);
                    R.this.b.a(ErrorBuilder.buildLoadFailedError("timed out"), R.this, new Date().getTime() - R.this.n);
                }
            }, this.k * 1000);
        }
    }

    public final Map<String, Object> a() {
        try {
            if (h()) {
                return this.c.getInterstitialBiddingData(this.f);
            }
            return null;
        } catch (Throwable th) {
            e("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    public final void a(String str) {
        try {
            this.n = new Date().getTime();
            d("loadInterstitial");
            this.e = false;
            if (h()) {
                s();
                a(R.a.LOAD_IN_PROGRESS);
                this.c.loadInterstitialForBidding(this.f, this, str);
            } else if (this.a != R.a.NO_INIT) {
                s();
                a(R.a.LOAD_IN_PROGRESS);
                this.c.loadInterstitial(this.f, this);
            } else {
                s();
                a(R.a.INIT_IN_PROGRESS);
                q();
                this.c.initInterstitial(this.l, this.m, this.f, this);
            }
        } catch (Throwable th) {
            e("loadInterstitial exception: " + th.getLocalizedMessage());
            th.printStackTrace();
        }
    }

    public final void b() {
        d("initForBidding()");
        a(R.a.INIT_IN_PROGRESS);
        q();
        try {
            this.c.initInterstitialForBidding(this.l, this.m, this.f, this);
        } catch (Throwable th) {
            e(k() + "loadInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void c() {
        try {
            this.c.showInterstitial(this.f, this);
        } catch (Throwable th) {
            e(k() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            this.b.a(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()), this);
        }
    }

    public final void f() {
        this.c.setMediationState(AbstractC0108b.a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
    }

    public final boolean g() {
        try {
            return this.c.isInterstitialReady(this.f);
        } catch (Throwable th) {
            e("isReadyToShow exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        c("onInterstitialAdClicked");
        this.b.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        c("onInterstitialAdClosed");
        this.b.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        c("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.a.name());
        r();
        if (this.a != R.a.LOAD_IN_PROGRESS) {
            return;
        }
        a(R.a.LOAD_FAILED);
        this.b.a(ironSourceError, this, new Date().getTime() - this.n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        c("onInterstitialAdOpened");
        this.b.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        c("onInterstitialAdReady state=" + this.a.name());
        r();
        if (this.a != R.a.LOAD_IN_PROGRESS) {
            return;
        }
        a(R.a.LOADED);
        this.b.a(this, new Date().getTime() - this.n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        c("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.b.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
        c("onInterstitialAdShowSucceeded");
        this.b.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        c("onInterstitialAdVisible");
        this.b.e(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        c("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.a.name());
        if (this.a != R.a.INIT_IN_PROGRESS) {
            return;
        }
        r();
        a(R.a.NO_INIT);
        this.b.b(ironSourceError, this);
        if (h()) {
            return;
        }
        this.b.a(ironSourceError, this, new Date().getTime() - this.n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
        c("onInterstitialInitSuccess state=" + this.a.name());
        if (this.a != R.a.INIT_IN_PROGRESS) {
            return;
        }
        r();
        if (h()) {
            a(R.a.INIT_SUCCESS);
        } else {
            a(R.a.LOAD_IN_PROGRESS);
            s();
            try {
                this.c.loadInterstitial(this.f, this);
            } catch (Throwable th) {
                e("onInterstitialInitSuccess exception: " + th.getLocalizedMessage());
                th.printStackTrace();
            }
        }
        this.b.f(this);
    }
}
