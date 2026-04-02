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
public final class S extends AbstractC0120n implements com.ironsource.environment.k, T, ab, InterfaceC0109c, InterfaceC0113g, InterfaceC0131y {
    private String A;
    private boolean B;
    private NetworkStateReceiver C;
    private C0129w D;
    final ConcurrentHashMap<String, U> a;
    com.ironsource.mediationsdk.utils.m b;
    C0114h c;
    C0115i d;
    String e;
    JSONObject f;
    int g;
    long h;
    private CopyOnWriteArrayList<U> i;
    private List<com.ironsource.mediationsdk.a.c> j;
    private ConcurrentHashMap<String, com.ironsource.mediationsdk.a.c> k;
    private ConcurrentHashMap<String, C0115i.a> l;
    private com.ironsource.mediationsdk.a.c m;
    private aa n;
    private boolean o;
    private boolean p;
    private boolean q;
    private String r;
    private long s;
    private long t;
    private int u;
    private boolean v;
    private boolean w;
    private Boolean x;
    private a y;
    private int z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public S(List<NetworkSettings> list, com.ironsource.mediationsdk.model.p pVar, String str, String str2, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        this.g = 1;
        this.A = "";
        this.B = false;
        long time = new Date().getTime();
        a(IronSourceConstants.RV_MANAGER_INIT_STARTED);
        a(a.RV_STATE_INITIATING);
        this.x = null;
        this.u = pVar.c;
        this.v = pVar.d;
        this.r = "";
        com.ironsource.mediationsdk.utils.b bVar = pVar.l;
        this.w = false;
        this.i = new CopyOnWriteArrayList<>();
        this.j = new ArrayList();
        this.k = new ConcurrentHashMap<>();
        this.l = new ConcurrentHashMap<>();
        this.t = new Date().getTime();
        this.o = bVar.e > 0;
        this.p = bVar.m;
        this.q = !bVar.n;
        this.s = bVar.l;
        if (this.o) {
            this.c = new C0114h("rewardedVideo", bVar, this);
        }
        this.n = new aa(bVar, this);
        this.a = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            AbstractAdapter a2 = C0110d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), false, false);
            if (a2 != null) {
                C0111e a3 = C0111e.a();
                if (a3.a(a2, a3.b, "rewarded video")) {
                    U u = new U(str, str2, networkSettings, this, pVar.e, a2);
                    String k = u.k();
                    this.a.put(k, u);
                    arrayList.add(k);
                }
            }
        }
        this.d = new C0115i(arrayList, bVar.f);
        this.b = new com.ironsource.mediationsdk.utils.m(new ArrayList(this.a.values()));
        for (U u2 : this.a.values()) {
            if (u2.h()) {
                u2.b();
            }
        }
        a(IronSourceConstants.RV_MANAGER_INIT_ENDED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}}));
        this.D = new C0129w(pVar.i, this);
        a(bVar.i);
    }

    private String a(com.ironsource.mediationsdk.a.c cVar) {
        U u = this.a.get(cVar.a());
        String num = u != null ? Integer.toString(u.i()) : TextUtils.isEmpty(cVar.b()) ? "1" : "2";
        return num + cVar.a();
    }

    private void a(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (z2 && !TextUtils.isEmpty(this.e)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.e);
        }
        JSONObject jSONObject = this.f;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f);
        }
        if (z && !TextUtils.isEmpty(this.r)) {
            hashMap.put("placement", this.r);
        }
        if (c(i)) {
            com.ironsource.mediationsdk.a.h.e();
            com.ironsource.mediationsdk.a.h.a(hashMap, this.z, this.A);
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
                logger.log(ironSourceTag, "ProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, new JSONObject(hashMap)));
    }

    private void a(long j) {
        if (this.b.a()) {
            b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            f();
        } else if (this.o) {
            if (!this.l.isEmpty()) {
                this.d.a(this.l);
                this.l.clear();
            }
            new Timer().schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.S.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    final S s = S.this;
                    s.a(a.RV_STATE_AUCTION_IN_PROGRESS);
                    AsyncTask.execute(new Runnable() { // from class: com.ironsource.mediationsdk.S.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb;
                            S.a("makeAuction()");
                            S.this.e = "";
                            S.this.f = null;
                            S.this.h = new Date().getTime();
                            HashMap hashMap = new HashMap();
                            ArrayList arrayList = new ArrayList();
                            StringBuilder sb2 = new StringBuilder();
                            for (U u : S.this.a.values()) {
                                if (u.h()) {
                                    u.b = false;
                                }
                                if (!S.this.b.b(u)) {
                                    if (u.h()) {
                                        Map<String, Object> a2 = u.a();
                                        if (a2 != null) {
                                            hashMap.put(u.k(), a2);
                                            sb = new StringBuilder();
                                        }
                                    } else {
                                        arrayList.add(u.k());
                                        sb = new StringBuilder();
                                    }
                                    sb.append(u.i());
                                    sb.append(u.k());
                                    sb.append(",");
                                    sb2.append(sb.toString());
                                }
                            }
                            if (hashMap.keySet().size() == 0 && arrayList.size() == 0) {
                                S.this.b(IronSourceConstants.RV_AUCTION_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
                                S.a("makeAuction() failed - No candidates available for auctioning");
                                S.this.f();
                                return;
                            }
                            S.a("makeAuction() - request waterfall is: " + ((Object) sb2));
                            S.this.a(1000);
                            S.this.a(IronSourceConstants.RV_AUCTION_REQUEST);
                            S.this.a(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                            S.this.c.a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, S.this.d, S.this.g);
                        }
                    });
                }
            }, j);
        } else {
            IronLog.INTERNAL.info("auction is disabled, fallback flow will occur");
            g();
            if (this.j.isEmpty()) {
                b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
                f();
                return;
            }
            a(1000);
            if (this.q && this.w) {
                return;
            }
            e();
        }
    }

    static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 0);
    }

    private void a(List<com.ironsource.mediationsdk.a.c> list) {
        this.j = list;
        StringBuilder sb = new StringBuilder();
        Iterator<com.ironsource.mediationsdk.a.c> it = list.iterator();
        while (it.hasNext()) {
            sb.append(a(it.next()) + ",");
        }
        a("updateNextWaterfallToLoad() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            a("Updated waterfall is empty");
        }
        b(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    private void a(boolean z, Map<String, Object> map) {
        Boolean bool = this.x;
        if (bool == null || bool.booleanValue() != z) {
            this.x = Boolean.valueOf(z);
            long time = new Date().getTime() - this.t;
            this.t = new Date().getTime();
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
            b(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
            X.a().a(z);
        }
    }

    private void b(int i) {
        a(i, new HashMap(), true, true);
    }

    private static void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 3);
    }

    private void b(List<com.ironsource.mediationsdk.a.c> list) {
        this.i.clear();
        this.k.clear();
        this.l.clear();
        for (com.ironsource.mediationsdk.a.c cVar : list) {
            U u = this.a.get(cVar.a());
            if (u != null) {
                u.e = true;
                this.i.add(u);
                this.k.put(u.k(), cVar);
                this.l.put(cVar.a(), C0115i.a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                a("updateWaterfall() - could not find matching smash for auction response item " + cVar.a());
            }
        }
        this.j.clear();
    }

    private void b(boolean z) {
        a(z, new HashMap());
    }

    private void c(int i, Map<String, Object> map) {
        a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    private static void c(U u, String str) {
        String str2 = u.k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: " + str2, 0);
    }

    private static void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private static boolean c(int i) {
        return i == 1003 || i == 1302 || i == 1301;
    }

    private void e(U u) {
        String b = this.k.get(u.k()).b();
        C0112f.a();
        u.a(b, this.e, this.f, this.z, this.A, this.g, C0112f.d(b));
    }

    private void g() {
        this.e = c();
        a(h());
    }

    private List<com.ironsource.mediationsdk.a.c> h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (U u : this.a.values()) {
            if (!u.h() && !this.b.b(u)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.a.c(u.k()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void i() {
        if (this.i.isEmpty()) {
            b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            f();
            return;
        }
        a(a.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.i.size() && i < this.u; i2++) {
            U u = this.i.get(i2);
            if (u.e) {
                if (this.v && u.h()) {
                    if (i != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + u.k() + " as a non bidder is being loaded";
                        a(str);
                        IronSourceUtils.sendAutomationLog(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + u.k() + ". No other instances will be loaded at the same time.";
                    a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    e(u);
                    return;
                }
                e(u);
                i++;
            }
        }
    }

    void a(int i) {
        a(i, new HashMap(), false, false);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0113g
    public final void a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.z = i2;
        this.A = str2;
        this.f = null;
        g();
        b(IronSourceConstants.RV_AUCTION_FAILED, TextUtils.isEmpty(str) ? a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}) : a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        if (this.q && this.w) {
            return;
        }
        e();
    }

    void a(int i, Map<String, Object> map) {
        a(i, map, false, false);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0131y
    public final void a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager Should Track Network State: " + z, 0);
        try {
            this.B = z;
            if (z) {
                if (this.C == null) {
                    this.C = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.C, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.C != null) {
                context.getApplicationContext().unregisterReceiver(this.C);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    void a(a aVar) {
        a("current state=" + this.y + ", new state=" + aVar);
        this.y = aVar;
    }

    @Override // com.ironsource.mediationsdk.T
    public final void a(U u) {
        synchronized (this) {
            this.g++;
            c(u, "onRewardedVideoAdOpened");
            X.a().c();
            if (this.o) {
                com.ironsource.mediationsdk.a.c cVar = this.k.get(u.k());
                if (cVar != null) {
                    C0114h.a(cVar, u.i(), this.m, this.r);
                    this.l.put(u.k(), C0115i.a.ISAuctionPerformanceShowedSuccessfully);
                    a(cVar, this.r);
                } else {
                    String k = u.k();
                    b("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                    b(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.y}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
                }
            }
            this.n.a();
        }
    }

    @Override // com.ironsource.mediationsdk.T
    public final void a(U u, Placement placement) {
        c(u, "onRewardedVideoAdRewarded");
        X.a().a(placement);
    }

    @Override // com.ironsource.mediationsdk.T
    public final synchronized void a(U u, String str) {
        c(u, "onLoadSuccess ");
        if (this.e != null && !str.equalsIgnoreCase(this.e)) {
            a("onLoadSuccess was invoked with auctionId: " + str + " and the current id is " + this.e);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            StringBuilder sb = new StringBuilder("onLoadSuccess wrong auction ID ");
            sb.append(this.y);
            u.b(IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, sb.toString()}});
            return;
        }
        a aVar = this.y;
        this.l.put(u.k(), C0115i.a.ISAuctionPerformanceLoadedSuccessfully);
        if (this.y == a.RV_STATE_LOADING_SMASHES) {
            b(true);
            a(a.RV_STATE_READY_TO_SHOW);
            b(1003, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.h)}}));
            this.D.a(0L);
            if (this.o) {
                com.ironsource.mediationsdk.a.c cVar = this.k.get(u.k());
                if (cVar != null) {
                    C0114h.a(cVar, u.i(), this.m);
                    this.c.a(this.i, this.k, u.i(), this.m, cVar);
                    return;
                }
                String k = u.k();
                b("onLoadSuccess winner instance " + k + " missing from waterfall. auctionId: " + str + " and the current id is " + this.e);
                Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 1010};
                StringBuilder sb2 = new StringBuilder("Loaded missing ");
                sb2.append(aVar);
                b(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{objArr2, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, sb2.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.T
    public final void a(IronSourceError ironSourceError, U u) {
        synchronized (this) {
            c(u, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
            c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
            X.a().b(ironSourceError);
            this.w = false;
            this.l.put(u.k(), C0115i.a.ISAuctionPerformanceFailedToShow);
            if (this.y != a.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
            this.n.c();
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0131y
    public final synchronized void a(Placement placement) {
        if (placement == null) {
            c("showRewardedVideo error: empty default placement");
            X.a().b(new IronSourceError(1021, "showRewardedVideo error: empty default placement"));
            a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: empty default placement"}}), false, true);
            return;
        }
        this.r = placement.getPlacementName();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo(" + placement + ")", 1);
        b(IronSourceConstants.RV_API_SHOW_CALLED);
        if (this.w) {
            c("showRewardedVideo error: can't show ad while an ad is already showing");
            X.a().b(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing"));
            c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: can't show ad while an ad is already showing"}}));
        } else if (this.y != a.RV_STATE_READY_TO_SHOW) {
            c("showRewardedVideo error: show called while no ads are available");
            X.a().b(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showRewardedVideo error: show called while no ads are available"));
            c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: show called while no ads are available"}}));
        } else if (com.ironsource.mediationsdk.utils.c.c(ContextProvider.getInstance().getApplicationContext(), this.r)) {
            String str = "showRewardedVideo error: placement " + this.r + " is capped";
            c(str);
            X.a().b(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str));
            c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}));
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<U> it = this.i.iterator();
            while (it.hasNext()) {
                U next = it.next();
                if (next.c()) {
                    this.w = true;
                    next.a(true, this.g);
                    a("showVideo()");
                    this.b.a(next);
                    if (this.b.b(next)) {
                        next.f();
                        IronSourceUtils.sendAutomationLog(next.k() + " rewarded video is now session capped");
                    }
                    com.ironsource.mediationsdk.utils.c.e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                    if (com.ironsource.mediationsdk.utils.c.c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                        b(IronSourceConstants.RV_CAP_PLACEMENT);
                    }
                    this.D.a();
                    next.a(placement, this.g);
                    a(a.RV_STATE_NOT_LOADED);
                    return;
                }
                if (next.o() != null) {
                    stringBuffer.append(next.k() + CertificateUtil.DELIMITER + next.o() + ",");
                }
                next.a(false, this.g);
            }
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
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0113g
    public final void a(List<com.ironsource.mediationsdk.a.c> list, String str, com.ironsource.mediationsdk.a.c cVar, JSONObject jSONObject, int i, long j, int i2, String str2) {
        a("makeAuction(): success");
        this.e = str;
        this.m = cVar;
        this.f = jSONObject;
        this.z = i;
        this.A = "";
        b(IronSourceConstants.RV_AUCTION_SUCCESS, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        a(list);
        if (!TextUtils.isEmpty(str2)) {
            b(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        if (this.q && this.w) {
            return;
        }
        e();
    }

    @Override // com.ironsource.environment.k
    public final void a(boolean z) {
        if (this.B) {
            boolean z2 = true;
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z, 1);
            Boolean bool = this.x;
            boolean z3 = false;
            if (bool != null) {
                if ((!z || bool.booleanValue() || !a_()) && (z || !this.x.booleanValue())) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (z3) {
                b(z);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0131y
    public final synchronized boolean a_() {
        if (!this.B || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            if (this.y == a.RV_STATE_READY_TO_SHOW && !this.w) {
                Iterator<U> it = this.i.iterator();
                while (it.hasNext()) {
                    if (it.next().c()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    void b(int i, Map<String, Object> map) {
        a(i, map, false, true);
    }

    @Override // com.ironsource.mediationsdk.T
    public final void b(U u) {
        synchronized (this) {
            u.a(IronSourceConstants.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "otherRVAvailable = false"}});
            c(u, "onRewardedVideoAdClosed, mediation state: " + this.y.name());
            X.a().d();
            this.w = false;
            if (this.y != a.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
            if (!this.p) {
                this.n.b();
            } else if (this.j != null && this.j.size() > 0) {
                new Timer().schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.S.3
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        S.this.e();
                    }
                }, this.s);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.T
    public final void b(U u, Placement placement) {
        c(u, "onRewardedVideoAdClicked");
        X.a().b(placement);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0132 A[SYNTHETIC] */
    @Override // com.ironsource.mediationsdk.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.ironsource.mediationsdk.U r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.S.b(com.ironsource.mediationsdk.U, java.lang.String):void");
    }

    @Override // com.ironsource.mediationsdk.T
    public final void c(U u) {
        c(u, "onRewardedVideoAdStarted");
        X.a().e();
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0109c
    public final void c_() {
        a(a.RV_STATE_NOT_LOADED);
        a(false, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.ironsource.mediationsdk.ab
    public final synchronized void d() {
        a("onLoadTriggered: RV load was triggered in " + this.y + " state");
        a(0L);
    }

    @Override // com.ironsource.mediationsdk.T
    public final void d(U u) {
        c(u, "onRewardedVideoAdEnded");
        X.a().f();
    }

    void e() {
        b(this.j);
        i();
    }

    void f() {
        a(a.RV_STATE_NOT_LOADED);
        b(false);
        this.n.d();
    }
}
