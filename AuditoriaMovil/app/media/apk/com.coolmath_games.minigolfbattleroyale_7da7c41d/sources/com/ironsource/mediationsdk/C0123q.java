package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.C0128v;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;
/* renamed from: com.ironsource.mediationsdk.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0123q extends C0128v implements BannerSmashListener {
    private com.ironsource.mediationsdk.sdk.b i;
    private long j;
    private String k;
    private String l;
    private JSONObject m;

    public C0123q(String str, String str2, NetworkSettings networkSettings, com.ironsource.mediationsdk.sdk.b bVar, int i, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.i = bVar;
        this.d = i;
        this.k = str;
        this.l = str2;
        this.m = networkSettings.getBannerSettings();
        this.a.initBannerForBidding(str, str2, this.c, this);
    }

    public final void a() {
        IronLog.INTERNAL.verbose("");
        if (this.a == null) {
            IronLog.INTERNAL.error("destroyBanner() mAdapter == null");
        } else if (!a(C0128v.a.LOADED, C0128v.a.NOT_LOADED) && !a(C0128v.a.LOAD_IN_PROGRESS, C0128v.a.NOT_LOADED)) {
            IronLog.INTERNAL.error("cannot destroy banner not loaded");
        } else {
            h();
            this.a.destroyBanner(this.b.a.getBannerSettings());
        }
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2, JSONObject jSONObject, List<String> list) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("loadBanner state=" + g());
        C0128v.a a = a(new C0128v.a[]{C0128v.a.NOT_LOADED, C0128v.a.LOADED}, C0128v.a.LOAD_IN_PROGRESS);
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            IronLog.INTERNAL.error("loadBanner - bannerLayout is null or destroyed");
            this.i.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false, new Date().getTime() - this.j);
        } else if (str == null) {
            IronLog.INTERNAL.error("loadBanner - serverData is null");
            this.i.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, "serverData==null"), this, false, new Date().getTime() - this.j);
        } else if (this.a == null) {
            IronLog.INTERNAL.error("loadBanner - mAdapter is null");
            this.i.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "adapter==null"), this, false, new Date().getTime() - this.j);
        } else if (a != C0128v.a.NOT_LOADED) {
            this.i.a(a == C0128v.a.LOAD_IN_PROGRESS ? new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_ALREADY_IN_PROGRESS, "load already in progress") : new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, "load while show"), this, false, new Date().getTime() - this.j);
        } else {
            this.j = new Date().getTime();
            IronLog.INTERNAL.verbose("start timer");
            a(new TimerTask() { // from class: com.ironsource.mediationsdk.q.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("load timed out state=" + C0123q.this.g());
                    if (C0123q.this.a(C0128v.a.LOAD_IN_PROGRESS, C0128v.a.NOT_LOADED)) {
                        C0123q.this.i.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "load timed out"), C0123q.this, false, new Date().getTime() - C0123q.this.j);
                    }
                }
            });
            this.e = str2;
            this.f = jSONObject;
            this.g = list;
            this.a.initBannerForBidding(this.k, this.l, this.m, this);
            this.a.loadBannerForBidding(ironSourceBannerLayout, this.m, this, str);
        }
    }

    public final String b() {
        return this.b.a.isMultipleInstances() ? this.b.a.getProviderTypeForReflection() : this.b.a.getProviderName();
    }

    @Override // com.ironsource.mediationsdk.C0128v
    public final Map<String, Object> c() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("providerAdapterVersion", this.a != null ? this.a.getVersion() : "");
            hashMap.put("providerSDKVersion", this.a != null ? this.a.getCoreSDKVersion() : "");
            hashMap.put("spId", this.b.a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.b.a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", 2);
            if (!TextUtils.isEmpty(this.e)) {
                hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.e);
            }
            if (this.f != null && this.f.length() > 0) {
                hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f);
            }
            if (!TextUtils.isEmpty(this.h)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.h);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + d() + ")", e);
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        com.ironsource.mediationsdk.sdk.b bVar = this.i;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        com.ironsource.mediationsdk.sdk.b bVar = this.i;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
        if (a(C0128v.a.LOAD_IN_PROGRESS, C0128v.a.NOT_LOADED)) {
            h();
            boolean z = ironSourceError.getErrorCode() == 606;
            if (this.i != null) {
                this.i.a(ironSourceError, this, z, new Date().getTime() - this.j);
            }
            a(C0128v.a.NOT_LOADED);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("");
        if (a(C0128v.a.LOAD_IN_PROGRESS, C0128v.a.LOADED)) {
            com.ironsource.mediationsdk.sdk.b bVar = this.i;
            if (bVar != null) {
                bVar.a(this, view, layoutParams);
            }
            h();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
        com.ironsource.mediationsdk.sdk.b bVar = this.i;
        if (bVar != null) {
            bVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
        com.ironsource.mediationsdk.sdk.b bVar = this.i;
        if (bVar != null) {
            bVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        com.ironsource.mediationsdk.sdk.b bVar = this.i;
        if (bVar != null) {
            bVar.e(this);
            this.i.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("");
    }
}
