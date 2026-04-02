package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.Timer;
import java.util.TimerTask;
/* renamed from: com.ironsource.mediationsdk.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0118l implements BannerSmashListener {
    public AbstractAdapter a;
    public NetworkSettings b;
    com.ironsource.mediationsdk.sdk.a c;
    boolean d;
    IronSourceBannerLayout e;
    public int f;
    private Timer g;
    private long h;
    private a i = a.NO_INIT;

    /* renamed from: com.ironsource.mediationsdk.l$a */
    /* loaded from: classes2.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0118l(com.ironsource.mediationsdk.sdk.a aVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, long j, int i) {
        this.f = i;
        this.c = aVar;
        this.a = abstractAdapter;
        this.b = networkSettings;
        this.h = j;
        abstractAdapter.addBannerListener(this);
    }

    private void a(String str, String str2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, str + " Banner exception: " + a() + " | " + str2, 3);
    }

    private void c() {
        if (this.a == null) {
            return;
        }
        try {
            String str = E.a().l;
            if (!TextUtils.isEmpty(str)) {
                this.a.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
        } catch (Exception e) {
            a(":setCustomParams():" + e.toString());
        }
    }

    private void d() {
        try {
            if (this.g != null) {
                this.g.cancel();
            }
        } catch (Exception e) {
            a("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.g = null;
        }
    }

    public final String a() {
        return this.b.isMultipleInstances() ? this.b.getProviderTypeForReflection() : this.b.getProviderName();
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        a("loadBanner");
        this.d = false;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            a("loadBanner - bannerLayout is null or destroyed");
            this.c.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false);
        } else if (this.a == null) {
            a("loadBanner - mAdapter is null");
            this.c.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "adapter==null"), this, false);
        } else {
            this.e = ironSourceBannerLayout;
            b();
            if (this.i != a.NO_INIT) {
                a(a.LOAD_IN_PROGRESS);
                this.a.loadBanner(ironSourceBannerLayout, this.b.getBannerSettings(), this);
                return;
            }
            a(a.INIT_IN_PROGRESS);
            c();
            this.a.initBanners(str, str2, this.b.getBannerSettings(), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        this.i = aVar;
        a("state=" + aVar.name());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
        logger.log(ironSourceTag, "BannerSmash " + a() + " " + str, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        try {
            d();
            Timer timer = new Timer();
            this.g = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.l.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    com.ironsource.mediationsdk.sdk.a aVar;
                    IronSourceError ironSourceError;
                    cancel();
                    if (C0118l.this.i == a.INIT_IN_PROGRESS) {
                        C0118l.this.a(a.NO_INIT);
                        C0118l.this.a("init timed out");
                        aVar = C0118l.this.c;
                        ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
                    } else if (C0118l.this.i != a.LOAD_IN_PROGRESS) {
                        if (C0118l.this.i == a.LOADED) {
                            C0118l.this.a(a.LOAD_FAILED);
                            C0118l.this.a("reload timed out");
                            C0118l.this.c.b(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, "Timed out"), C0118l.this, false);
                            return;
                        }
                        return;
                    } else {
                        C0118l.this.a(a.LOAD_FAILED);
                        C0118l.this.a("load timed out");
                        aVar = C0118l.this.c;
                        ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
                    }
                    aVar.a(ironSourceError, C0118l.this, false);
                }
            }, this.h);
        } catch (Exception e) {
            a("startLoadTimer", e.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        com.ironsource.mediationsdk.sdk.a aVar = this.c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        com.ironsource.mediationsdk.sdk.a aVar = this.c;
        if (aVar != null) {
            aVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        a("onBannerAdLoadFailed()");
        d();
        boolean z = ironSourceError.getErrorCode() == 606;
        if (this.i == a.LOAD_IN_PROGRESS) {
            a(a.LOAD_FAILED);
            this.c.a(ironSourceError, this, z);
        } else if (this.i == a.LOADED) {
            this.c.b(ironSourceError, this, z);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        a("onBannerAdLoaded()");
        d();
        if (this.i == a.LOAD_IN_PROGRESS) {
            a(a.LOADED);
            this.c.a(this, view, layoutParams);
        } else if (this.i == a.LOADED) {
            this.c.a(this, view, layoutParams, this.a.shouldBindBannerViewOnReload());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
        com.ironsource.mediationsdk.sdk.a aVar = this.c;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
        com.ironsource.mediationsdk.sdk.a aVar = this.c;
        if (aVar != null) {
            aVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        com.ironsource.mediationsdk.sdk.a aVar = this.c;
        if (aVar != null) {
            aVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        d();
        if (this.i == a.INIT_IN_PROGRESS) {
            this.c.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this, false);
            a(a.NO_INIT);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        d();
        if (this.i == a.INIT_IN_PROGRESS) {
            IronSourceBannerLayout ironSourceBannerLayout = this.e;
            if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
                this.c.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.e == null ? "banner is null" : "banner is destroyed"), this, false);
                return;
            }
            b();
            a(a.LOAD_IN_PROGRESS);
            this.a.loadBanner(this.e, this.b.getBannerSettings(), this);
        }
    }
}
