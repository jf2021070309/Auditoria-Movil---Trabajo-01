package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.b.c;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class O extends V implements c.a, BannerSmashListener {
    String a;
    private com.ironsource.mediationsdk.server.b b;
    private com.ironsource.mediationsdk.b.c j;
    private a k;
    private N l;
    private IronSourceBannerLayout m;
    private JSONObject n;
    private int o;
    private String p;
    private com.ironsource.mediationsdk.model.g q;
    private final Object r;
    private com.ironsource.mediationsdk.utils.f s;
    private boolean t;

    /* loaded from: classes2.dex */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(com.ironsource.mediationsdk.server.b bVar, N n, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.r = new Object();
        this.k = a.NONE;
        this.b = bVar;
        this.j = new com.ironsource.mediationsdk.b.c(bVar.f());
        this.l = n;
        this.h = i;
        this.a = str;
        this.o = i2;
        this.p = str2;
        this.n = jSONObject;
        this.t = z;
        this.c.addBannerListener(this);
        if (h()) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(com.ironsource.mediationsdk.server.b bVar, N n, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(bVar, n, networkSettings, abstractAdapter, i, "", null, 0, "", z);
    }

    private void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(r() + "state = " + aVar.name());
        synchronized (this.r) {
            this.k = aVar;
        }
    }

    private void a(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 606) {
            a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.s))}});
        } else {
            a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.s))}});
        }
        N n = this.l;
        if (n != null) {
            n.a(ironSourceError, this);
        }
    }

    private void a(String str) {
        IronLog.INTERNAL.verbose(p());
        if (!a(a.READY_TO_LOAD, a.LOADING)) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("wrong state - state = " + this.k);
            return;
        }
        this.s = new com.ironsource.mediationsdk.utils.f();
        a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD : 3002, (Object[][]) null);
        if (this.c != null) {
            try {
                if (h()) {
                    this.c.loadBannerForBidding(this.m, this.f, this, str);
                } else {
                    this.c.loadBanner(this.m, this.f, this);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private static void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        int i;
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i = 1;
            } else if (c == 1) {
                i = 2;
            } else if (c == 2) {
                i = 3;
            } else if (c != 3) {
                if (c != 4) {
                    return;
                }
                map.put("bannerAdSize", 6);
                map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                return;
            } else {
                i = 5;
            }
            map.put("bannerAdSize", i);
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    private static boolean a(int i) {
        return i == 3005 || i == 3002 || i == 3012 || i == 3015 || i == 3008 || i == 3305 || i == 3300 || i == 3306 || i == 3307 || i == 3302 || i == 3303 || i == 3304 || i == 3009;
    }

    private boolean a(a aVar, a aVar2) {
        boolean z;
        synchronized (this.r) {
            if (this.k == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(r() + "set state from '" + this.k + "' to '" + aVar2 + "'");
                z = true;
                this.k = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    private void f() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(r() + "isBidder = " + h());
        a(a.INIT_IN_PROGRESS);
        g();
        try {
            if (this.c != null) {
                if (h()) {
                    this.c.initBannerForBidding(this.b.a(), this.b.b(), this.f, this);
                } else {
                    this.c.initBanners(this.b.a(), this.b.b(), this.f, this);
                }
            }
        } catch (Throwable th) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("exception = " + th.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, th.getLocalizedMessage()));
        }
    }

    private void g() {
        if (this.c == null) {
            return;
        }
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
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("exception - " + e.toString());
        }
    }

    private boolean q() {
        boolean z;
        synchronized (this.r) {
            z = this.k == a.LOADED;
        }
        return z;
    }

    private String r() {
        return String.format("%s - ", p());
    }

    private boolean s() {
        IronSourceBannerLayout ironSourceBannerLayout = this.m;
        return ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed();
    }

    public final void a() {
        IronLog.INTERNAL.verbose(p());
        a(a.DESTROYED);
        if (this.c == null) {
            IronLog.INTERNAL.warning("mAdapter == null");
            return;
        }
        try {
            this.c.destroyBanner(this.d.a.getBannerSettings());
        } catch (Exception e) {
            e.printStackTrace();
            IronLog.INTERNAL.error(e.getMessage());
        }
        a(IronSourceConstants.BN_INSTANCE_DESTROY, (Object[][]) null);
    }

    public final void a(int i, Object[][] objArr) {
        Map<String, Object> n = n();
        if (s()) {
            n.put(IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed");
        } else {
            a(n, this.m.getSize());
        }
        if (!TextUtils.isEmpty(this.a)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.a);
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.n);
        }
        com.ironsource.mediationsdk.model.g gVar = this.q;
        if (gVar != null) {
            n.put("placement", gVar.getPlacementName());
        }
        if (a(i)) {
            com.ironsource.mediationsdk.a.d.e();
            com.ironsource.mediationsdk.a.d.a(n, this.o, this.p);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(k() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, new JSONObject(n)));
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.model.g gVar, String str) {
        N n;
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(p());
        this.q = gVar;
        if (!C0119m.a(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            IronLog.INTERNAL.verbose(str2);
            n = this.l;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, str2);
        } else if (this.c != null) {
            this.m = ironSourceBannerLayout;
            this.j.a((c.a) this);
            try {
                if (h()) {
                    a(str);
                    return;
                } else {
                    f();
                    return;
                }
            } catch (Throwable th) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception = " + th.getLocalizedMessage());
                th.printStackTrace();
                return;
            }
        } else {
            IronLog.INTERNAL.verbose("mAdapter is null");
            n = this.l;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        }
        n.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.b.c.a
    public final void b() {
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(p());
        if (a(a.INIT_IN_PROGRESS, a.LOAD_FAILED)) {
            IronLog.INTERNAL.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else if (!a(a.LOADING, a.LOAD_FAILED)) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("unexpected state - " + this.k);
            return;
        } else {
            IronLog.INTERNAL.verbose("load timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
        }
        a(ironSourceError);
    }

    public final Map<String, Object> c() {
        try {
            if (!h() || this.c == null) {
                return null;
            }
            return this.c.getBannerBiddingData(this.f);
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.V
    public final void d() {
        this.j.c();
        super.d();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_CLICK, (Object[][]) null);
        N n = this.l;
        if (n != null) {
            n.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_LEAVE_APP, (Object[][]) null);
        N n = this.l;
        if (n != null) {
            n.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(r() + "error = " + ironSourceError);
        this.j.d();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(p());
        this.j.d();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, (Object[][]) null);
            return;
        }
        a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : 3005, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.s))}});
        N n = this.l;
        if (n != null) {
            n.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, (Object[][]) null);
        N n = this.l;
        if (n != null) {
            n.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, (Object[][]) null);
        N n = this.l;
        if (n != null) {
            n.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        IronLog.INTERNAL.verbose(p());
        if (q()) {
            a(IronSourceConstants.BN_INSTANCE_SHOW, (Object[][]) null);
            N n = this.l;
            if (n != null) {
                n.e(this);
                return;
            }
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mState = " + this.k);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.k}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(r() + "error = " + ironSourceError);
        this.j.d();
        if (a(a.INIT_IN_PROGRESS, a.NONE)) {
            N n = this.l;
            if (n != null) {
                n.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this);
                return;
            }
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.warning("wrong state - mState = " + this.k);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(p());
        if (!a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD) || h()) {
            return;
        }
        if (C0119m.a(this.m)) {
            a((String) null);
        } else {
            this.l.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.m == null ? "banner is null" : "banner is destroyed"), this);
        }
    }
}
