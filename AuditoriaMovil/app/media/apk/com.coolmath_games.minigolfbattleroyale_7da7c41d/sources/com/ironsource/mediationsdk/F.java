package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.C0115i;
import com.ironsource.mediationsdk.G;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class F extends AbstractC0120n implements com.ironsource.environment.k, H, ab, InterfaceC0109c, InterfaceC0113g, InterfaceC0131y {
    I a;
    C0115i b;
    C0114h c;
    long d;
    final ConcurrentHashMap<String, G> e;
    com.ironsource.mediationsdk.utils.m f;
    int g;
    a h;
    final Object i;
    private ConcurrentHashMap<String, com.ironsource.mediationsdk.a.c> j;
    private ConcurrentHashMap<String, C0115i.a> k;
    private com.ironsource.mediationsdk.a.c l;
    private JSONObject m;
    private aa n;
    private boolean o;
    private String p;
    private int q;
    private NetworkStateReceiver r;
    private boolean s;
    private String t;
    private int u;
    private boolean v;
    private boolean w;
    private long x;
    private Boolean y;
    private C0129w z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public F(List<NetworkSettings> list, com.ironsource.mediationsdk.model.p pVar, String str, String str2, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        this.p = "";
        this.s = false;
        this.g = 1;
        this.i = new Object();
        long time = new Date().getTime();
        a(IronSourceConstants.RV_MANAGER_INIT_STARTED);
        a(a.RV_STATE_INITIATING);
        this.y = null;
        this.u = pVar.c;
        this.v = pVar.d;
        this.t = "";
        this.m = null;
        com.ironsource.mediationsdk.utils.b bVar = pVar.l;
        this.w = false;
        this.a = new I(pVar.l.o, pVar.l.g);
        this.j = new ConcurrentHashMap<>();
        this.k = new ConcurrentHashMap<>();
        this.x = new Date().getTime();
        boolean z = bVar.e > 0;
        this.o = z;
        if (z) {
            this.c = new C0114h("rewardedVideo", bVar, this);
        }
        this.n = new aa(bVar, this);
        this.e = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            AbstractAdapter a2 = C0110d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), false, false);
            if (a2 != null) {
                G g = new G(str, str2, networkSettings, this, pVar.e, a2, this.g);
                String k = g.k();
                this.e.put(k, g);
                arrayList.add(k);
            }
        }
        this.b = new C0115i(arrayList, bVar.f);
        this.f = new com.ironsource.mediationsdk.utils.m(new ArrayList(this.e.values()));
        a(IronSourceConstants.RV_MANAGER_INIT_ENDED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}}));
        this.z = new C0129w(pVar.i, this);
        a(bVar.i);
    }

    private String a(com.ironsource.mediationsdk.a.c cVar) {
        G g = this.e.get(cVar.a());
        String num = g != null ? Integer.toString(g.i()) : TextUtils.isEmpty(cVar.b()) ? "1" : "2";
        return num + cVar.a();
    }

    private void a(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z2 && !TextUtils.isEmpty(this.a.b)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.a.b);
        }
        JSONObject jSONObject = this.m;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.m);
        }
        if (z && !TextUtils.isEmpty(this.t)) {
            hashMap.put("placement", this.t);
        }
        if (b(i)) {
            com.ironsource.mediationsdk.a.h.e();
            com.ironsource.mediationsdk.a.h.a(hashMap, this.q, this.p);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.g));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, new JSONObject(hashMap)));
    }

    private void a(long j) {
        if (this.f.a()) {
            a("all smashes are capped");
            b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            e();
        } else if (this.o) {
            if (!this.k.isEmpty()) {
                this.b.a(this.k);
                this.k.clear();
            }
            new Timer().schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.F.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    final F f = F.this;
                    synchronized (f.i) {
                        if (f.h != a.RV_STATE_AUCTION_IN_PROGRESS) {
                            f.a(a.RV_STATE_AUCTION_IN_PROGRESS);
                            AsyncTask.execute(new Runnable() { // from class: com.ironsource.mediationsdk.F.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StringBuilder sb;
                                    F.a("makeAuction()");
                                    F.this.d = new Date().getTime();
                                    HashMap hashMap = new HashMap();
                                    ArrayList arrayList = new ArrayList();
                                    StringBuilder sb2 = new StringBuilder();
                                    for (G g : F.this.e.values()) {
                                        if (!F.this.f.b(g) && F.this.a.b(g)) {
                                            if (g.h()) {
                                                Map<String, Object> a2 = g.a();
                                                if (a2 != null) {
                                                    hashMap.put(g.k(), a2);
                                                    sb = new StringBuilder();
                                                }
                                            } else {
                                                arrayList.add(g.k());
                                                sb = new StringBuilder();
                                            }
                                            sb.append(g.i());
                                            sb.append(g.k());
                                            sb.append(",");
                                            sb2.append(sb.toString());
                                        }
                                    }
                                    if (hashMap.keySet().size() == 0 && arrayList.size() == 0) {
                                        F.this.b(IronSourceConstants.RV_AUCTION_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
                                        F.a("makeAuction() failed - No candidates available for auctioning");
                                        F.this.e();
                                        return;
                                    }
                                    F.a("makeAuction() - request waterfall is: " + ((Object) sb2));
                                    F.this.a(1000);
                                    F.this.a(IronSourceConstants.RV_AUCTION_REQUEST);
                                    F.this.a(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                                    F.this.c.a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, F.this.b, F.this.g);
                                }
                            });
                        }
                    }
                }
            }, j);
        } else {
            a("auction fallback flow starting");
            f();
            if (!this.a.a().isEmpty()) {
                a(1000);
                h();
                return;
            }
            a("loadSmashes -  waterfall is empty");
            b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            e();
        }
    }

    private static void a(G g, String str) {
        String str2 = g.k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 0);
    }

    private void a(List<com.ironsource.mediationsdk.a.c> list, String str, JSONObject jSONObject) {
        this.j.clear();
        this.k.clear();
        CopyOnWriteArrayList<G> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (com.ironsource.mediationsdk.a.c cVar : list) {
            sb.append(a(cVar) + ",");
            G g = this.e.get(cVar.a());
            if (g != null) {
                AbstractAdapter a2 = C0110d.a().a(g.d.a);
                if (a2 != null) {
                    G g2 = new G(g, this, a2, this.g, str, jSONObject, this.q, this.p);
                    g2.e = true;
                    copyOnWriteArrayList.add(g2);
                    this.j.put(g2.k(), cVar);
                    this.k.put(cVar.a(), C0115i.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                a("updateWaterfall() - could not find matching smash for auction response item " + cVar.a());
            }
        }
        this.a.a(copyOnWriteArrayList, str);
        if (this.a.b()) {
            b(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfalls hold too many with size=" + this.a.a.size()}}));
        }
        a("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            a("Updated waterfall is empty");
        }
        b(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    private void a(boolean z, Map<String, Object> map) {
        synchronized (this.i) {
            if (this.y == null || this.y.booleanValue() != z) {
                this.y = Boolean.valueOf(z);
                long time = new Date().getTime() - this.x;
                this.x = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
                b(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                X.a().a(z);
            }
        }
    }

    private static void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 3);
    }

    private static boolean b(int i) {
        return i == 1003 || i == 1302 || i == 1301;
    }

    private void c(int i) {
        a(i, null, true, true);
    }

    private void c(int i, Map<String, Object> map) {
        a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    private static void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void f() {
        List<com.ironsource.mediationsdk.a.c> g = g();
        a(g, "fallback_" + System.currentTimeMillis(), this.m);
    }

    private List<com.ironsource.mediationsdk.a.c> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (G g : this.e.values()) {
            if (!g.h() && !this.f.b(g) && this.a.b(g)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.a.c(g.k()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void g(G g) {
        String b = this.j.get(g.k()).b();
        g.b(b);
        g.a(b);
    }

    private void h() {
        if (this.a.a().isEmpty()) {
            a("loadSmashes -  waterfall is empty");
            b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            e();
            return;
        }
        a(a.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.a.a().size() && i < this.u; i2++) {
            G g = this.a.a().get(i2);
            if (g.e) {
                if (this.v && g.h()) {
                    if (i != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + g.k() + " as a non bidder is being loaded";
                        a(str);
                        IronSourceUtils.sendAutomationLog(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + g.k() + ". No other instances will be loaded at the same time.";
                    a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    g(g);
                    return;
                }
                g(g);
                i++;
            }
        }
    }

    void a(int i) {
        a(i, null, false, false);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0113g
    public final void a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.q = i2;
        this.p = str2;
        this.m = null;
        f();
        b(IronSourceConstants.RV_AUCTION_FAILED, TextUtils.isEmpty(str) ? a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}) : a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        h();
    }

    void a(int i, Map<String, Object> map) {
        a(i, map, false, false);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0131y
    public final void a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager Should Track Network State: " + z, 0);
        try {
            this.s = z;
            if (z) {
                if (this.r == null) {
                    this.r = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.r, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.r != null) {
                context.getApplicationContext().unregisterReceiver(this.r);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    void a(a aVar) {
        a("current state=" + this.h + ", new state=" + aVar);
        this.h = aVar;
    }

    @Override // com.ironsource.mediationsdk.H
    public final void a(G g) {
        synchronized (this.i) {
            a(g, "onLoadSuccess mState=" + this.h);
            if (g.b == this.a.b && this.h != a.RV_STATE_AUCTION_IN_PROGRESS) {
                this.k.put(g.k(), C0115i.a.ISAuctionPerformanceLoadedSuccessfully);
                if (this.h == a.RV_STATE_LOADING_SMASHES) {
                    a(true, (Map<String, Object>) null);
                    a(a.RV_STATE_READY_TO_SHOW);
                    b(1003, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.d)}}));
                    this.z.a(0L);
                    if (this.o) {
                        com.ironsource.mediationsdk.a.c cVar = this.j.get(g.k());
                        if (cVar != null) {
                            C0114h.a(cVar, g.i(), this.l);
                            this.c.a(this.a.a(), this.j, g.i(), this.l, cVar);
                        } else {
                            String k = g.k();
                            b("onLoadSuccess winner instance " + k + " missing from waterfall. auctionId: " + g.b + " and the current id is " + this.a.b);
                            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1010};
                            StringBuilder sb = new StringBuilder("Loaded missing ");
                            sb.append(a.RV_STATE_LOADING_SMASHES);
                            b(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, sb.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
                        }
                    }
                }
                return;
            }
            a("onLoadSuccess was invoked with auctionId: " + g.b + " and the current id is " + this.a.b);
            Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            StringBuilder sb2 = new StringBuilder("onLoadSuccess wrong auction ID ");
            sb2.append(this.h);
            g.b(IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr2, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, sb2.toString()}});
        }
    }

    @Override // com.ironsource.mediationsdk.H
    public final void a(G g, Placement placement) {
        a(g, "onRewardedVideoAdRewarded");
        X.a().a(placement);
    }

    @Override // com.ironsource.mediationsdk.H
    public final void a(IronSourceError ironSourceError, G g) {
        a(g, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.w = false;
        c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
        X.a().b(ironSourceError);
        this.k.put(g.k(), C0115i.a.ISAuctionPerformanceFailedToShow);
        if (this.h != a.RV_STATE_READY_TO_SHOW) {
            a(false, (Map<String, Object>) null);
        }
        this.n.c();
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0131y
    public final void a(Placement placement) {
        G g;
        synchronized (this.i) {
            if (placement == null) {
                c("showRewardedVideo error: empty default placement");
                X.a().b(new IronSourceError(1021, "showRewardedVideo error: empty default placement"));
                a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: empty default placement"}}), false, true);
                return;
            }
            this.t = placement.getPlacementName();
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo(" + placement + ")", 1);
            c(IronSourceConstants.RV_API_SHOW_CALLED);
            if (this.w) {
                c("showRewardedVideo error: can't show ad while an ad is already showing");
                X.a().b(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing"));
                c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: can't show ad while an ad is already showing"}}));
            } else if (this.h != a.RV_STATE_READY_TO_SHOW) {
                c("showRewardedVideo error: show called while no ads are available");
                X.a().b(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showRewardedVideo error: show called while no ads are available"));
                c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: show called while no ads are available"}}));
            } else if (com.ironsource.mediationsdk.utils.c.c(ContextProvider.getInstance().getApplicationContext(), this.t)) {
                String str = "showRewardedVideo error: placement " + this.t + " is capped";
                c(str);
                X.a().b(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str));
                c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}));
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<G> it = this.a.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        g = null;
                        break;
                    }
                    g = it.next();
                    if (g.b()) {
                        this.w = true;
                        g.a(true);
                        a(a.RV_STATE_NOT_LOADED);
                        break;
                    }
                    if (g.o() != null) {
                        stringBuffer.append(g.k() + CertificateUtil.DELIMITER + g.o() + ",");
                    }
                    g.a(false);
                }
                if (g == null) {
                    a("showRewardedVideo(): No ads to show");
                    X.a().b(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    HashMap hashMap = new HashMap();
                    hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
                    hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo(): No ads to show");
                    if (stringBuffer.length() != 0) {
                        hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                    }
                    c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, hashMap);
                    this.n.c();
                } else if (g != null) {
                    a("showVideo()");
                    this.f.a(g);
                    if (this.f.b(g)) {
                        g.b_();
                        IronSourceUtils.sendAutomationLog(g.k() + " rewarded video is now session capped");
                    }
                    com.ironsource.mediationsdk.utils.c.e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                    if (com.ironsource.mediationsdk.utils.c.c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                        c(IronSourceConstants.RV_CAP_PLACEMENT);
                    }
                    this.z.a();
                    g.a(placement);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0113g
    public final void a(List<com.ironsource.mediationsdk.a.c> list, String str, com.ironsource.mediationsdk.a.c cVar, JSONObject jSONObject, int i, long j, int i2, String str2) {
        a("makeAuction(): success");
        this.l = cVar;
        this.q = i;
        this.m = jSONObject;
        this.p = "";
        a(list, str, jSONObject);
        b(IronSourceConstants.RV_AUCTION_SUCCESS, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        if (!TextUtils.isEmpty(str2)) {
            b(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        h();
    }

    @Override // com.ironsource.environment.k
    public final void a(boolean z) {
        if (this.s) {
            boolean z2 = true;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 1);
            Boolean bool = this.y;
            boolean z3 = false;
            if (bool != null) {
                if ((!z || bool.booleanValue() || !a_()) && (z || !this.y.booleanValue())) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (z3) {
                a(z, (Map<String, Object>) null);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0131y
    public final boolean a_() {
        if ((!this.s || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.h == a.RV_STATE_READY_TO_SHOW && !this.w) {
            Iterator<G> it = this.a.a().iterator();
            while (it.hasNext()) {
                if (it.next().b()) {
                    return true;
                }
            }
        }
        return false;
    }

    void b(int i, Map<String, Object> map) {
        a(i, map, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f1 A[SYNTHETIC] */
    @Override // com.ironsource.mediationsdk.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.ironsource.mediationsdk.G r11) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.F.b(com.ironsource.mediationsdk.G):void");
    }

    @Override // com.ironsource.mediationsdk.H
    public final void b(G g, Placement placement) {
        a(g, "onRewardedVideoAdClicked");
        X.a().b(placement);
    }

    @Override // com.ironsource.mediationsdk.H
    public final void c(G g) {
        this.a.a(g);
        this.g++;
        a(g, "onRewardedVideoAdOpened");
        X.a().c();
        a(false, (Map<String, Object>) null);
        if (this.o) {
            com.ironsource.mediationsdk.a.c cVar = this.j.get(g.k());
            if (cVar != null) {
                C0114h.a(cVar, g.i(), this.l, this.t);
                this.k.put(g.k(), C0115i.a.ISAuctionPerformanceShowedSuccessfully);
                a(cVar, this.t);
            } else {
                String k = g.k();
                b("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                b(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.h}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
            }
        }
        this.n.a();
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0109c
    public final void c_() {
        a(a.RV_STATE_NOT_LOADED);
        a(false, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.ironsource.mediationsdk.ab
    public final void d() {
        a("onLoadTriggered: RV load was triggered in " + this.h + " state");
        a(0L);
    }

    @Override // com.ironsource.mediationsdk.H
    public final void d(G g) {
        String str;
        G next;
        a(g, "onRewardedVideoAdClosed, mediation state: " + this.h.name());
        X.a().d();
        this.w = false;
        boolean z = this.h == a.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z) {
            Iterator<G> it = this.a.a().iterator();
            while (it.hasNext()) {
                if (it.next().a == G.a.LOADED) {
                    sb.append(next.k() + ";");
                }
            }
        }
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + ((Object) sb);
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr2[1] = sb2.toString();
        objArr[0] = objArr2;
        g.a(IronSourceConstants.RV_INSTANCE_CLOSED, objArr);
        if (g.equals(this.a.c)) {
            this.a.a(null);
            if (this.h != a.RV_STATE_READY_TO_SHOW) {
                a(false, (Map<String, Object>) null);
            }
        }
    }

    void e() {
        a(a.RV_STATE_NOT_LOADED);
        if (!this.w) {
            a(false, (Map<String, Object>) null);
        }
        this.n.d();
    }

    @Override // com.ironsource.mediationsdk.H
    public final void e(G g) {
        a(g, "onRewardedVideoAdStarted");
        X.a().e();
    }

    @Override // com.ironsource.mediationsdk.H
    public final void f(G g) {
        a(g, "onRewardedVideoAdEnded");
        X.a().f();
    }
}
