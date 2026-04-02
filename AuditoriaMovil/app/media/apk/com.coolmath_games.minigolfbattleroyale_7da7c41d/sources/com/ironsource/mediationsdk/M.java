package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0115i;
import com.ironsource.mediationsdk.C0119m;
import com.ironsource.mediationsdk.b.b;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class M extends AbstractC0120n implements N, b.a, InterfaceC0113g {
    com.ironsource.mediationsdk.server.b a;
    com.ironsource.mediationsdk.b.b b;
    IronSourceBannerLayout c;
    com.ironsource.mediationsdk.model.g d;
    O e;
    int f;
    final ConcurrentHashMap<String, O> g;
    C0114h h;
    C0115i i;
    ConcurrentHashMap<String, C0115i.a> j;
    long k;
    private a l;
    private int m;
    private CopyOnWriteArrayList<O> n;
    private String o;
    private JSONObject p;
    private String q;
    private int r;
    private com.ironsource.mediationsdk.a.c s;
    private ConcurrentHashMap<String, com.ironsource.mediationsdk.a.c> t;
    private final Object u;
    private com.ironsource.mediationsdk.utils.f v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum a {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public M(List<NetworkSettings> list, com.ironsource.mediationsdk.server.b bVar, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        this.l = a.NONE;
        this.q = "";
        this.u = new Object();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isAuctionEnabled = " + bVar.c());
        this.a = bVar;
        this.b = new com.ironsource.mediationsdk.b.b(this.a.g());
        this.g = new ConcurrentHashMap<>();
        this.n = new CopyOnWriteArrayList<>();
        this.t = new ConcurrentHashMap<>();
        this.j = new ConcurrentHashMap<>();
        this.f = com.ironsource.mediationsdk.utils.n.a().b(3);
        C0116j.a().a = this.a.e();
        if (this.a.c()) {
            this.h = new C0114h("banner", this.a.h(), this);
        }
        a(list);
        b(list);
        this.k = new Date().getTime();
        a(a.READY_TO_LOAD);
    }

    static /* synthetic */ ISBannerSize a(M m) {
        IronSourceBannerLayout ironSourceBannerLayout = m.c;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return m.c.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getCurrentActiveActivity()) ? ISBannerSize.a : ISBannerSize.BANNER : m.c.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object[][] objArr) {
        a(i, objArr, this.f);
    }

    private void a(O o, com.ironsource.mediationsdk.a.c cVar) {
        C0114h.a(cVar, o.i(), this.s, e());
        a(this.t.get(o.k()), e());
    }

    private void a(List<NetworkSettings> list) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            arrayList.add(networkSettings.getProviderName());
        }
        this.i = new C0115i(arrayList, this.a.h().f);
    }

    private static void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
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
                jSONObject.put("bannerAdSize", 1);
            } else if (c == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c != 4) {
            } else {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.l);
        if (!a(a.STARTED_LOADING, this.a.c() ? z ? a.AUCTION : a.FIRST_AUCTION : z ? a.RELOADING : a.LOADING)) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("wrong state - " + this.l);
            return;
        }
        this.v = new com.ironsource.mediationsdk.utils.f();
        this.o = "";
        this.p = null;
        this.m = 0;
        this.f = com.ironsource.mediationsdk.utils.n.a().b(3);
        a(z ? IronSourceConstants.BN_RELOAD : 3001, (Object[][]) null);
        if (this.a.c()) {
            d();
            return;
        }
        g();
        f();
    }

    private void b(List<NetworkSettings> list) {
        for (int i = 0; i < list.size(); i++) {
            NetworkSettings networkSettings = list.get(i);
            AbstractAdapter a2 = C0110d.a().a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a2 != null) {
                O o = new O(this.a, this, networkSettings, a2, this.f, n());
                this.g.put(o.k(), o);
            } else {
                IronLog.INTERNAL.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
            }
        }
    }

    private static boolean b(int i) {
        return i == 3201 || i == 3110 || i == 3111 || i == 3116 || i == 3119 || i == 3112 || i == 3115 || i == 3501 || i == 3502;
    }

    private String c(List<com.ironsource.mediationsdk.a.c> list) {
        int i;
        int i2;
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.n.clear();
        this.t.clear();
        this.j.clear();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < list.size()) {
            com.ironsource.mediationsdk.a.c cVar = list.get(i3);
            O o = this.g.get(cVar.a());
            if (o != null) {
                AbstractAdapter a2 = C0110d.a().a(o.d.a);
                if (a2 != null) {
                    i = i3;
                    i2 = 1;
                    O o2 = new O(this.a, this, o.d.a, a2, this.f, this.o, this.p, this.r, this.q, n());
                    o2.e = true;
                    this.n.add(o2);
                    this.t.put(o2.k(), cVar);
                    this.j.put(cVar.a(), C0115i.a.ISAuctionPerformanceDidntAttemptToLoad);
                } else {
                    i = i3;
                    i2 = 1;
                }
            } else {
                i = i3;
                i2 = 1;
                IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + cVar.a());
            }
            O o3 = this.g.get(cVar.a());
            String str = "1";
            if (o3 == null ? !TextUtils.isEmpty(cVar.b()) : o3.h()) {
                str = "2";
            }
            sb.append(str + cVar.a());
            int i4 = i;
            if (i4 != list.size() - i2) {
                sb.append(",");
            }
            i3 = i4 + 1;
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    private void f() {
        int i = this.m;
        while (true) {
            String str = null;
            if (i >= this.n.size()) {
                String str2 = this.n.isEmpty() ? "Empty waterfall" : "Mediation No fill";
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("errorReason = " + str2);
                f(null);
                if (a(a.LOADING, a.READY_TO_LOAD)) {
                    a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.v))}});
                    C0116j.a().a(this.c, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str2));
                    return;
                } else if (a(a.RELOADING, a.LOADED)) {
                    a(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.v))}});
                    this.b.a((b.a) this);
                    return;
                } else {
                    a(a.READY_TO_LOAD);
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error("wrong state = " + this.l);
                    return;
                }
            }
            O o = this.n.get(i);
            if (o.e) {
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.verbose("loading smash - " + o.p());
                this.m = i + 1;
                if (o.h()) {
                    str = this.t.get(o.k()).b();
                    o.b(str);
                }
                o.a(this.c.a(), this.d, str);
                return;
            }
            i++;
        }
    }

    private void f(O o) {
        Iterator<O> it = this.n.iterator();
        while (it.hasNext()) {
            O next = it.next();
            if (!next.equals(o)) {
                next.d();
            }
        }
    }

    private void g() {
        List<com.ironsource.mediationsdk.a.c> h = h();
        this.o = c();
        c(h);
    }

    private List<com.ironsource.mediationsdk.a.c> h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (O o : this.g.values()) {
            if (!o.h() && !com.ironsource.mediationsdk.utils.c.b(ContextProvider.getInstance().getCurrentActiveActivity(), e())) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.a.c(o.k()));
            }
        }
        return copyOnWriteArrayList;
    }

    private boolean i() {
        IronSourceBannerLayout ironSourceBannerLayout = this.c;
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    private ISBannerSize j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.c;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    private boolean k() {
        boolean z;
        synchronized (this.u) {
            z = this.l == a.LOADING || this.l == a.RELOADING;
        }
        return z;
    }

    private boolean l() {
        boolean z;
        synchronized (this.u) {
            z = this.l == a.FIRST_AUCTION || this.l == a.AUCTION;
        }
        return z;
    }

    private boolean m() {
        boolean z;
        synchronized (this.u) {
            z = this.l == a.LOADED;
        }
        return z;
    }

    private boolean n() {
        return this.l == a.RELOADING || this.l == a.AUCTION;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.ironsource.mediationsdk.b.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = "checking with IronsourceLifecycleManager if app in foreground"
            r0.verbose(r1)
            com.ironsource.lifecycle.d r0 = com.ironsource.lifecycle.d.a()
            boolean r0 = r0.b()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L88
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.c
            if (r0 != 0) goto L20
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner is null"
        L1b:
            r0.verbose(r3)
            r0 = r2
            goto L56
        L20:
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L2b
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner or one of its parents are INVISIBLE or GONE"
            goto L1b
        L2b:
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.c
            boolean r0 = r0.hasWindowFocus()
            if (r0 != 0) goto L38
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner has no window focus"
            goto L1b
        L38:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r6.c
            boolean r0 = r3.getGlobalVisibleRect(r0)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "visible = "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.verbose(r4)
        L56:
            if (r0 == 0) goto L85
            com.ironsource.mediationsdk.M$a r0 = com.ironsource.mediationsdk.M.a.LOADED
            com.ironsource.mediationsdk.M$a r3 = com.ironsource.mediationsdk.M.a.STARTED_LOADING
            boolean r0 = r6.a(r0, r3)
            if (r0 == 0) goto L6d
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "start loading"
            r0.verbose(r3)
            r6.a(r1)
            goto L82
        L6d:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "wrong state = "
            r3.<init>(r4)
            com.ironsource.mediationsdk.M$a r4 = r6.l
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.error(r3)
        L82:
            r0 = 0
            r3 = r2
            goto L8b
        L85:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L8a
        L88:
            java.lang.String r0 = "app in background - start reload timer"
        L8a:
            r3 = r1
        L8b:
            if (r3 == 0) goto Laf
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r3.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r3 = new java.lang.Object[r1]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r2] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r3[r2] = r4
            r6.a(r0, r3)
            com.ironsource.mediationsdk.b.b r0 = r6.b
            r0.a(r6)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.M.a():void");
    }

    void a(int i) {
        a(i, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0113g
    public final void a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        IronLog.INTERNAL.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (!l()) {
            IronLog.INTERNAL.warning("wrong state - mCurrentState = " + this.l);
            return;
        }
        this.q = str2;
        this.r = i2;
        this.p = null;
        g();
        a(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}});
        a(this.l == a.FIRST_AUCTION ? a.LOADING : a.RELOADING);
        f();
    }

    void a(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize j = j();
            if (j != null) {
                a(mediationAdditionalData, j);
            }
            if (this.d != null) {
                mediationAdditionalData.put("placement", e());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (!TextUtils.isEmpty(this.o)) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_AUCTION_ID, this.o);
            }
            if (this.p != null && this.p.length() > 0) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.p);
            }
            if (b(i)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.r);
                if (!TextUtils.isEmpty(this.q)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.q);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, mediationAdditionalData));
    }

    public final void a(final IronSourceBannerLayout ironSourceBannerLayout, final com.ironsource.mediationsdk.model.g gVar) {
        IronLog.INTERNAL.verbose("");
        if (!a(a.READY_TO_LOAD, a.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (C0116j.a().b()) {
            IronLog.INTERNAL.verbose("can't load banner - already has pending invocation");
        } else {
            C0119m.a(ironSourceBannerLayout, gVar, new C0119m.b() { // from class: com.ironsource.mediationsdk.M.1
                @Override // com.ironsource.mediationsdk.C0119m.b
                public final void a() {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("placement = " + gVar.getPlacementName());
                    M.this.c = ironSourceBannerLayout;
                    M.this.d = gVar;
                    if (!com.ironsource.mediationsdk.utils.c.b(ContextProvider.getInstance().getCurrentActiveActivity(), gVar.getPlacementName())) {
                        M.this.a(false);
                        return;
                    }
                    IronLog.INTERNAL.verbose("placement is capped");
                    C0116j a2 = C0116j.a();
                    IronSourceBannerLayout ironSourceBannerLayout2 = ironSourceBannerLayout;
                    a2.a(ironSourceBannerLayout2, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + gVar.getPlacementName() + " is capped"));
                    M.this.a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
                    M.this.a(a.READY_TO_LOAD);
                }

                @Override // com.ironsource.mediationsdk.C0119m.b
                public final void a(String str) {
                    IronLog ironLog = IronLog.API;
                    ironLog.error("can't load banner - errorMessage = " + str);
                }
            });
        }
    }

    void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("from '" + this.l + "' to '" + aVar + "'");
        synchronized (this.u) {
            this.l = aVar;
        }
    }

    @Override // com.ironsource.mediationsdk.N
    public final void a(O o) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(o.p());
        if (i()) {
            this.c.c();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_CLICK, objArr, o.m());
    }

    @Override // com.ironsource.mediationsdk.N
    public final void a(O o, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + o.p());
        if (o.a != this.o) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("invoked with auctionId: " + o.a + " and the current id is " + this.o);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            o.a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction id " + o.a + " State - " + this.l}, new Object[]{IronSourceConstants.EVENTS_EXT1, o.k()}});
        } else if (!k()) {
            IronLog ironLog3 = IronLog.INTERNAL;
            ironLog3.warning("wrong state - mCurrentState = " + this.l);
        } else {
            O o2 = this.e;
            if (o2 != null) {
                o2.d();
            }
            f(o);
            this.e = o;
            this.c.a(view, layoutParams);
            this.j.put(o.k(), C0115i.a.ISAuctionPerformanceShowedSuccessfully);
            if (this.a.c()) {
                com.ironsource.mediationsdk.a.c cVar = this.t.get(o.k());
                if (cVar != null) {
                    C0114h.a(cVar, o.i(), this.s);
                    this.h.a(this.n, this.t, o.i(), this.s, cVar);
                    if (!this.a.h().s) {
                        a(o, cVar);
                    }
                } else {
                    String k = o.k();
                    IronLog ironLog4 = IronLog.INTERNAL;
                    ironLog4.error("onLoadSuccess winner instance " + k + " missing from waterfall. auctionId = " + this.o);
                    a(IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
            if (this.l == a.LOADING) {
                this.c.a(o.k());
                a(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.v))}});
            } else {
                IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
                a(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.v))}});
            }
            String e = e();
            com.ironsource.mediationsdk.utils.c.f(ContextProvider.getInstance().getCurrentActiveActivity(), e);
            if (com.ironsource.mediationsdk.utils.c.b(ContextProvider.getInstance().getCurrentActiveActivity(), e)) {
                a(IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            com.ironsource.mediationsdk.utils.n.a().a(3);
            a(a.LOADED);
            this.b.a((b.a) this);
        }
    }

    @Override // com.ironsource.mediationsdk.N
    public final void a(IronSourceError ironSourceError, O o) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (o.a == this.o) {
            if (k()) {
                this.j.put(o.k(), C0115i.a.ISAuctionPerformanceFailedToLoad);
                f();
                return;
            }
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.warning("wrong state - mCurrentState = " + this.l);
            return;
        }
        IronLog ironLog3 = IronLog.INTERNAL;
        ironLog3.error("invoked with auctionId: " + o.a + " and the current id is " + this.o);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 3};
        o.a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction " + o.a + " State - " + this.l}, new Object[]{IronSourceConstants.EVENTS_EXT1, o.k()}});
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0113g
    public final void a(List<com.ironsource.mediationsdk.a.c> list, String str, com.ironsource.mediationsdk.a.c cVar, JSONObject jSONObject, int i, long j, int i2, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (!l()) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.warning("wrong state - mCurrentState = " + this.l);
            return;
        }
        this.q = "";
        this.o = str;
        this.r = i;
        this.s = cVar;
        this.p = jSONObject;
        a(IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        a(this.l == a.FIRST_AUCTION ? a.LOADING : a.RELOADING);
        a(IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c(list)}});
        if (!TextUtils.isEmpty(str2)) {
            a(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}});
        }
        f();
    }

    boolean a(a aVar, a aVar2) {
        boolean z;
        synchronized (this.u) {
            if (this.l == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("set state from '" + this.l + "' to '" + aVar2 + "'");
                z = true;
                this.l = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.ironsource.mediationsdk.N
    public final void b(O o) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(o.p());
        if (i()) {
            this.c.e();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, o.m());
    }

    @Override // com.ironsource.mediationsdk.N
    public final void c(O o) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(o.p());
        if (i()) {
            this.c.d();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, o.m());
    }

    void d() {
        IronLog.INTERNAL.verbose("");
        AsyncTask.execute(new Runnable() { // from class: com.ironsource.mediationsdk.M.3
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                M m = M.this;
                if (!m.j.isEmpty()) {
                    m.i.a(m.j);
                    m.j.clear();
                }
                final M m2 = M.this;
                long d = m2.a.d() - (new Date().getTime() - m2.k);
                if (d > 0) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("waiting before auction - timeToWaitBeforeAuction = " + d);
                    new Timer().schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.M.4
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public final void run() {
                            M.this.d();
                        }
                    }, d);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
                M.this.a(IronSourceConstants.BN_AUCTION_REQUEST);
                C0119m.a(M.this.e(), M.this.g, new C0119m.a() { // from class: com.ironsource.mediationsdk.M.3.1
                    @Override // com.ironsource.mediationsdk.C0119m.a
                    public final void a(Map<String, Object> map, List<String> list, StringBuilder sb) {
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.verbose("auction waterfallString = " + ((Object) sb));
                        if (map.size() == 0 && list.size() == 0) {
                            M.this.a((int) IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
                            if (M.this.a(a.AUCTION, a.LOADED)) {
                                M.this.b.a((b.a) M.this);
                                return;
                            }
                            C0116j.a().a(M.this.c, new IronSourceError(1005, "No candidates available for auctioning"));
                            M.this.a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
                            M.this.a(a.READY_TO_LOAD);
                            return;
                        }
                        M.this.a((int) IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
                        if (M.this.h == null) {
                            IronLog.INTERNAL.error("mAuctionHandler is null");
                            return;
                        }
                        C0114h c0114h = M.this.h;
                        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                        C0115i c0115i = M.this.i;
                        int i = M.this.f;
                        c0114h.a = M.a(M.this);
                        c0114h.a(applicationContext, map, list, c0115i, i);
                    }
                });
            }
        });
    }

    @Override // com.ironsource.mediationsdk.N
    public final void d(O o) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(o.p());
        if (i()) {
            this.c.f();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, o.m());
    }

    String e() {
        com.ironsource.mediationsdk.model.g gVar = this.d;
        return gVar != null ? gVar.getPlacementName() : "";
    }

    @Override // com.ironsource.mediationsdk.N
    public final void e(O o) {
        com.ironsource.mediationsdk.a.c cVar;
        IronLog.INTERNAL.verbose(o.p());
        if (m()) {
            if (this.a.c() && this.a.h().s && (cVar = this.t.get(o.k())) != null) {
                a(o, cVar);
            }
            a(IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mCurrentState = " + this.l);
        String k = o.k();
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.l}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
    }
}
