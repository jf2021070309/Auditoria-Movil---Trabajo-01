package com.ironsource.mediationsdk;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0115i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
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
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class P extends AbstractC0120n implements Q, InterfaceC0113g, InterfaceC0130x {
    com.ironsource.mediationsdk.utils.m a;
    final ConcurrentHashMap<String, R> b;
    String c;
    JSONObject d;
    C0114h e;
    C0115i f;
    long g;
    long h;
    private a i;
    private CopyOnWriteArrayList<R> j;
    private ConcurrentHashMap<String, com.ironsource.mediationsdk.a.c> k;
    private ConcurrentHashMap<String, C0115i.a> l;
    private com.ironsource.mediationsdk.a.c m;
    private String n;
    private int o;
    private boolean p;
    private boolean q;
    private long r;
    private int s;
    private String t;
    private boolean u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum a {
        STATE_NOT_INITIALIZED,
        STATE_READY_TO_LOAD,
        STATE_AUCTION,
        STATE_LOADING_SMASHES,
        STATE_READY_TO_SHOW,
        STATE_SHOWING
    }

    public P(List<NetworkSettings> list, com.ironsource.mediationsdk.model.i iVar, String str, String str2, int i, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        this.t = "";
        this.u = false;
        long time = new Date().getTime();
        a(IronSourceConstants.IS_MANAGER_INIT_STARTED);
        a(a.STATE_NOT_INITIALIZED);
        this.b = new ConcurrentHashMap<>();
        this.j = new CopyOnWriteArrayList<>();
        this.k = new ConcurrentHashMap<>();
        this.l = new ConcurrentHashMap<>();
        this.n = "";
        this.c = "";
        this.d = null;
        this.o = iVar.c;
        this.p = iVar.d;
        C0121o.a().a(IronSource.AD_UNIT.INTERSTITIAL, i);
        com.ironsource.mediationsdk.utils.b bVar = iVar.i;
        this.h = bVar.i;
        boolean z = bVar.e > 0;
        this.q = z;
        if (z) {
            this.e = new C0114h(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, bVar, this);
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            AbstractAdapter a2 = C0110d.a().a(networkSettings, networkSettings.getInterstitialSettings(), false, false);
            if (a2 != null) {
                C0111e a3 = C0111e.a();
                if (a3.a(a2, a3.a, IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE)) {
                    R r = new R(str, str2, networkSettings, this, iVar.e, a2);
                    String k = r.k();
                    this.b.put(k, r);
                    arrayList.add(k);
                }
            }
        }
        this.f = new C0115i(arrayList, bVar.f);
        this.a = new com.ironsource.mediationsdk.utils.m(new ArrayList(this.b.values()));
        for (R r2 : this.b.values()) {
            if (r2.h()) {
                r2.b();
            }
        }
        this.g = new Date().getTime();
        a(a.STATE_READY_TO_LOAD);
        a(IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}});
    }

    private String a(com.ironsource.mediationsdk.a.c cVar) {
        R r = this.b.get(cVar.a());
        String num = r != null ? Integer.toString(r.i()) : TextUtils.isEmpty(cVar.b()) ? "1" : "2";
        return num + cVar.a();
    }

    private void a(int i) {
        a(i, (Object[][]) null, false);
    }

    private void a(int i, R r) {
        a(i, r, null, false);
    }

    private void a(int i, R r, Object[][] objArr) {
        a(i, r, objArr, false);
    }

    private void a(int i, R r, Object[][] objArr, boolean z) {
        Map<String, Object> n = r.n();
        if (!TextUtils.isEmpty(this.c)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.c);
        }
        JSONObject jSONObject = this.d;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.d);
        }
        if (z && !TextUtils.isEmpty(this.n)) {
            n.put("placement", this.n);
        }
        if (c(i)) {
            com.ironsource.mediationsdk.a.d.e();
            com.ironsource.mediationsdk.a.d.a(n, this.s, this.t);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, new JSONObject(n)));
    }

    private void a(int i, Object[][] objArr) {
        a(i, objArr, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object[][] objArr, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.c)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.c);
        }
        JSONObject jSONObject = this.d;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.d);
        }
        if (z && !TextUtils.isEmpty(this.n)) {
            hashMap.put("placement", this.n);
        }
        if (c(i)) {
            com.ironsource.mediationsdk.a.d.e();
            com.ironsource.mediationsdk.a.d.a(hashMap, this.s, this.t);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                b("sendMediationEvent " + e.getMessage());
            }
        }
        com.ironsource.mediationsdk.a.d.e().b(new com.ironsource.mediationsdk.adunit.a.a(i, new JSONObject(hashMap)));
    }

    private static void a(R r, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + r.k() + " : " + str, 0);
    }

    private void a(List<com.ironsource.mediationsdk.a.c> list) {
        this.j.clear();
        this.k.clear();
        this.l.clear();
        StringBuilder sb = new StringBuilder();
        for (com.ironsource.mediationsdk.a.c cVar : list) {
            sb.append(a(cVar) + ",");
            R r = this.b.get(cVar.a());
            if (r != null) {
                r.e = true;
                this.j.add(r);
                this.k.put(r.k(), cVar);
                this.l.put(cVar.a(), C0115i.a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                b("updateWaterfall() - could not find matching smash for auction response item " + cVar.a());
            }
        }
        b("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            b("Updated waterfall is empty");
        }
        a(IronSourceConstants.IS_RESULT_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
    }

    private void b(int i) {
        a(i, (Object[][]) null, true);
    }

    private void b(int i, R r) {
        a(i, r, null, true);
    }

    private void b(int i, R r, Object[][] objArr) {
        a(i, r, objArr, true);
    }

    private void b(int i, Object[][] objArr) {
        a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, objArr, true);
    }

    static void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgIsManager " + str, 0);
    }

    private static void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private static boolean c(int i) {
        return i == 2002 || i == 2003 || i == 2200 || i == 2213 || i == 2005 || i == 2204 || i == 2201 || i == 2203 || i == 2006 || i == 2004 || i == 2110 || i == 2301 || i == 2300;
    }

    private void f() {
        List<com.ironsource.mediationsdk.a.c> g = g();
        this.c = c();
        a(g);
    }

    private List<com.ironsource.mediationsdk.a.c> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (R r : this.b.values()) {
            if (!r.h() && !this.a.b(r)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.a.c(r.k()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void g(R r) {
        String b = this.k.get(r.k()).b();
        r.b(b);
        a(2002, r);
        r.a(b);
    }

    private void h() {
        if (this.j.isEmpty()) {
            a(a.STATE_READY_TO_LOAD);
            a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Empty waterfall"}}, false);
            C0121o.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Empty waterfall"));
            return;
        }
        a(a.STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.j.size() && i < this.o; i2++) {
            R r = this.j.get(i2);
            if (r.e) {
                if (this.p && r.h()) {
                    if (i != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + r.k() + " as a non bidder is being loaded";
                        b(str);
                        IronSourceUtils.sendAutomationLog(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + r.k() + ". No other instances will be loaded at the same time.";
                    b(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    g(r);
                    return;
                }
                g(r);
                i++;
            }
        }
    }

    void a() {
        a(a.STATE_AUCTION);
        AsyncTask.execute(new Runnable() { // from class: com.ironsource.mediationsdk.P.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb;
                P.this.c = "";
                P.this.d = null;
                StringBuilder sb2 = new StringBuilder();
                long time = P.this.h - (new Date().getTime() - P.this.g);
                if (time > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ironsource.mediationsdk.P.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            P.this.a();
                        }
                    }, time);
                    return;
                }
                P.this.a(2000, (Object[][]) null, false);
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (R r : P.this.b.values()) {
                    if (!P.this.a.b(r)) {
                        if (r.h()) {
                            Map<String, Object> a2 = r.a();
                            if (a2 != null) {
                                hashMap.put(r.k(), a2);
                                sb = new StringBuilder();
                            }
                        } else {
                            arrayList.add(r.k());
                            sb = new StringBuilder();
                        }
                        sb.append(r.i());
                        sb.append(r.k());
                        sb.append(",");
                        sb2.append(sb.toString());
                    }
                }
                if (hashMap.size() == 0 && arrayList.size() == 0) {
                    P.this.a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}, false);
                    P.b("makeAuction() failed - No candidates available for auctioning");
                    C0121o.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1005, "No candidates available for auctioning"));
                    P.this.a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}}, false);
                    P.this.a(a.STATE_READY_TO_LOAD);
                    return;
                }
                P.this.a((int) IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}, false);
                int b = com.ironsource.mediationsdk.utils.n.a().b(2);
                if (P.this.e != null) {
                    P.this.e.a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, P.this.f, b);
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0113g
    public final void a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        b(str3);
        IronSourceUtils.sendAutomationLog("IS: " + str3);
        this.s = i2;
        this.t = str2;
        this.d = null;
        f();
        if (TextUtils.isEmpty(str)) {
            a(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            a(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        h();
    }

    void a(a aVar) {
        this.i = aVar;
        b("state=" + aVar);
    }

    @Override // com.ironsource.mediationsdk.Q
    public final void a(R r) {
        synchronized (this) {
            a(r, "onInterstitialAdOpened");
            A.a().c();
            b(IronSourceConstants.IS_INSTANCE_OPENED, r);
            if (this.q) {
                com.ironsource.mediationsdk.a.c cVar = this.k.get(r.k());
                if (cVar != null) {
                    C0114h.a(cVar, r.i(), this.m, this.n);
                    this.l.put(r.k(), C0115i.a.ISAuctionPerformanceShowedSuccessfully);
                    a(cVar, this.n);
                } else {
                    String k = r.k();
                    b("onInterstitialAdOpened showing instance " + k + " missing from waterfall");
                    Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1011};
                    a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.i}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.Q
    public final void a(R r, long j) {
        synchronized (this) {
            a(r, "onInterstitialAdReady");
            a(IronSourceConstants.IS_INSTANCE_LOAD_SUCCESS, r, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
            if (this.l.containsKey(r.k())) {
                this.l.put(r.k(), C0115i.a.ISAuctionPerformanceLoadedSuccessfully);
            }
            if (this.i == a.STATE_LOADING_SMASHES) {
                a(a.STATE_READY_TO_SHOW);
                A.a().b();
                a(IronSourceConstants.IS_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.r)}});
                if (this.q) {
                    com.ironsource.mediationsdk.a.c cVar = this.k.get(r.k());
                    if (cVar != null) {
                        C0114h.a(cVar, r.i(), this.m);
                        this.e.a(this.j, this.k, r.i(), this.m, cVar);
                    } else {
                        String k = r.k();
                        b("onInterstitialAdReady winner instance " + k + " missing from waterfall");
                        a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                    }
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.Q
    public final void a(IronSourceError ironSourceError, R r) {
        synchronized (this) {
            a(r, "onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
            A.a().b(ironSourceError);
            b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, r, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            this.l.put(r.k(), C0115i.a.ISAuctionPerformanceFailedToShow);
            a(a.STATE_READY_TO_LOAD);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146 A[SYNTHETIC] */
    @Override // com.ironsource.mediationsdk.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.ironsource.mediationsdk.logger.IronSourceError r9, com.ironsource.mediationsdk.R r10, long r11) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.P.a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.R, long):void");
    }

    public final synchronized void a(String str) {
        if (this.i == a.STATE_SHOWING) {
            c("showInterstitial error: can't show ad while an ad is already showing");
            A.a().b(new IronSourceError(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, "showInterstitial error: can't show ad while an ad is already showing"));
            a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showInterstitial error: can't show ad while an ad is already showing"}}, false);
        } else if (this.i != a.STATE_READY_TO_SHOW) {
            b("showInterstitial() error state=" + this.i.toString());
            c("showInterstitial error: show called while no ads are available");
            A.a().b(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "showInterstitial error: show called while no ads are available"));
            a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showInterstitial error: show called while no ads are available"}});
        } else if (str == null) {
            c("showInterstitial error: empty default placement");
            A.a().b(new IronSourceError(1020, "showInterstitial error: empty default placement"));
            a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1020}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showInterstitial error: empty default placement"}});
        } else {
            this.n = str;
            b(IronSourceConstants.IS_SHOW_CALLED);
            if (com.ironsource.mediationsdk.utils.c.a(ContextProvider.getInstance().getApplicationContext(), this.n)) {
                String str2 = "placement " + this.n + " is capped";
                c(str2);
                A.a().b(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str2));
                b(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}});
                return;
            }
            Iterator<R> it = this.j.iterator();
            while (it.hasNext()) {
                R next = it.next();
                if (next.g()) {
                    String str3 = this.n;
                    a(a.STATE_SHOWING);
                    next.c();
                    b(IronSourceConstants.IS_INSTANCE_SHOW, next);
                    this.a.a(next);
                    if (this.a.b(next)) {
                        next.f();
                        a(IronSourceConstants.IS_CAP_SESSION, next);
                        IronSourceUtils.sendAutomationLog(next.k() + " was session capped");
                    }
                    com.ironsource.mediationsdk.utils.c.d(ContextProvider.getInstance().getApplicationContext(), str3);
                    if (com.ironsource.mediationsdk.utils.c.a(ContextProvider.getInstance().getApplicationContext(), str3)) {
                        b(IronSourceConstants.IS_CAP_PLACEMENT);
                    }
                    return;
                }
                b("showInterstitial " + next.k() + " isReadyToShow() == false");
            }
            A.a().b(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
            b(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Show Fail - No ads to show"}});
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0113g
    public final void a(List<com.ironsource.mediationsdk.a.c> list, String str, com.ironsource.mediationsdk.a.c cVar, JSONObject jSONObject, int i, long j, int i2, String str2) {
        this.c = str;
        this.m = cVar;
        this.d = jSONObject;
        this.s = i;
        this.t = "";
        a(IronSourceConstants.IS_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}, false);
        if (!TextUtils.isEmpty(str2)) {
            a(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}, false);
        }
        a(list);
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Should Track Network State: " + z, 0);
        this.u = z;
    }

    @Override // com.ironsource.mediationsdk.Q
    public final void b(R r) {
        synchronized (this) {
            a(r, "onInterstitialAdClosed");
            b(IronSourceConstants.IS_INSTANCE_CLOSED, r, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.n.a().b(2))}});
            com.ironsource.mediationsdk.utils.n.a().a(2);
            A.a().d();
            a(a.STATE_READY_TO_LOAD);
        }
    }

    @Override // com.ironsource.mediationsdk.Q
    public final void b(IronSourceError ironSourceError, R r) {
        a(IronSourceConstants.IS_INSTANCE_INIT_FAILED, r, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
    }

    @Override // com.ironsource.mediationsdk.Q
    public final void c(R r) {
        a(r, "onInterstitialAdShowSucceeded");
        A.a().e();
        b(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, r);
    }

    public final synchronized void d() {
        if (this.i == a.STATE_SHOWING) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "loadInterstitial: load cannot be invoked while showing an ad", 3);
            A.a().a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial: load cannot be invoked while showing an ad"));
        } else if ((this.i != a.STATE_READY_TO_LOAD && this.i != a.STATE_READY_TO_SHOW) || C0121o.a().a(IronSource.AD_UNIT.INTERSTITIAL)) {
            b("loadInterstitial: load is already in progress");
        } else {
            this.c = "";
            this.n = "";
            this.d = null;
            a(2001, (Object[][]) null, false);
            this.r = new Date().getTime();
            if (!this.q) {
                f();
                h();
                return;
            }
            if (!this.l.isEmpty()) {
                this.f.a(this.l);
                this.l.clear();
            }
            a();
        }
    }

    @Override // com.ironsource.mediationsdk.Q
    public final void d(R r) {
        a(r, "onInterstitialAdClicked");
        A.a().f();
        b(IronSourceConstants.IS_INSTANCE_CLICKED, r);
    }

    @Override // com.ironsource.mediationsdk.Q
    public final void e(R r) {
        a(r, "onInterstitialAdVisible");
    }

    public final synchronized boolean e() {
        if ((!this.u || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.i == a.STATE_READY_TO_SHOW) {
            Iterator<R> it = this.j.iterator();
            while (it.hasNext()) {
                if (it.next().g()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.Q
    public final void f(R r) {
        a(IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, r);
    }
}
