package com.ironsource.mediationsdk.adunit.c;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.k;
import com.ironsource.mediationsdk.A;
import com.ironsource.mediationsdk.C0110d;
import com.ironsource.mediationsdk.C0114h;
import com.ironsource.mediationsdk.C0115i;
import com.ironsource.mediationsdk.C0121o;
import com.ironsource.mediationsdk.C0129w;
import com.ironsource.mediationsdk.InterfaceC0109c;
import com.ironsource.mediationsdk.InterfaceC0113g;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.X;
import com.ironsource.mediationsdk.ab;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.b.i;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.l;
import com.ironsource.mediationsdk.utils.m;
import com.ironsource.mediationsdk.utils.n;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class e<Smash extends com.ironsource.mediationsdk.adunit.d.a.c<?>, Adapter extends BaseAdAdapter<?, ? extends AdapterAdListener>> implements k, ab, com.ironsource.mediationsdk.adunit.b.c, com.ironsource.mediationsdk.adunit.c.a.b, com.ironsource.mediationsdk.adunit.e.b, InterfaceC0109c, InterfaceC0113g {
    protected com.ironsource.mediationsdk.adunit.e.a<Smash> a;
    protected ConcurrentHashMap<String, com.ironsource.mediationsdk.a.c> b;
    protected ConcurrentHashMap<String, C0115i.a> c;
    protected C0114h d;
    protected C0115i e;
    protected int f;
    protected JSONObject h;
    protected com.ironsource.mediationsdk.a.c i;
    protected Placement j;
    protected m l;
    protected com.ironsource.mediationsdk.adunit.c.a m;
    protected a n;
    protected c o;
    protected C0129w p;
    protected com.ironsource.mediationsdk.adunit.b.d q;
    protected b r;
    public Set<ImpressionDataListener> t;
    private com.ironsource.mediationsdk.utils.f u;
    private com.ironsource.mediationsdk.utils.f v;
    private Boolean x;
    protected String g = "";
    protected boolean k = false;
    protected final Object s = new Object();
    private long w = 0;

    /* loaded from: classes2.dex */
    public enum a {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public e(com.ironsource.mediationsdk.adunit.c.a aVar, Set<ImpressionDataListener> set) {
        this.t = new HashSet();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + aVar.a + ", loading mode = " + aVar.h.a);
        com.ironsource.mediationsdk.utils.f fVar = new com.ironsource.mediationsdk.utils.f();
        this.m = aVar;
        this.q = new com.ironsource.mediationsdk.adunit.b.d(this.m.a, d.b.MEDIATION, this);
        this.r = new b(this.m.a);
        this.o = new c(this.m.h, this);
        a(a.NONE);
        this.t = set;
        this.a = new com.ironsource.mediationsdk.adunit.e.a<>(this.m.d.o, this.m.d.g, this);
        this.q.a.a();
        this.b = new ConcurrentHashMap<>();
        this.c = new ConcurrentHashMap<>();
        this.j = null;
        C0121o.a().a(this.m.a, this.m.f);
        this.h = new JSONObject();
        if (this.m.a()) {
            this.d = new C0114h(this.m.a.toString(), this.m.d, this);
        }
        a(this.m.c, this.m.d.f);
        j();
        k();
        this.u = new com.ironsource.mediationsdk.utils.f();
        a(a.READY_TO_LOAD);
        this.q.a.a(com.ironsource.mediationsdk.utils.f.a(fVar));
        this.p = new C0129w(aVar.i, this);
        if (this.m.h.b()) {
            IronLog.INTERNAL.verbose("first automatic load");
            e();
        }
    }

    private static String a(com.ironsource.mediationsdk.a.c cVar, int i) {
        return String.format("%s%s", Integer.valueOf(i), cVar.a());
    }

    private String a(List<com.ironsource.mediationsdk.a.c> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("waterfall.size() = " + list.size()));
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            com.ironsource.mediationsdk.a.c cVar = list.get(i);
            Smash b = b(cVar, str);
            if (b != null) {
                copyOnWriteArrayList.add(b);
                sb.append(a(cVar, b.i()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.a.a(this.m.h.a, copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(a("updateWaterfall() - next waterfall is " + sb.toString()));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        a(a.READY_TO_LOAD);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("errorCode = " + i + ", errorReason = " + str));
        if (this.m.h.a()) {
            this.q.b.a(com.ironsource.mediationsdk.utils.f.a(this.v), i, str);
            C0121o.a().a(this.m.a, new IronSourceError(i, str));
        } else {
            this.q.e.a(i, str);
            a(false, false);
        }
        this.o.a();
    }

    private void a(List<NetworkSettings> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            arrayList.add(networkSettings.getProviderName());
        }
        this.e = new C0115i(arrayList, i);
    }

    private boolean a(a aVar, a aVar2) {
        boolean z;
        synchronized (this.s) {
            if (this.n == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(a("set state from '" + this.n + "' to '" + aVar2 + "'"));
                z = true;
                this.n = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(NetworkSettings networkSettings) {
        AdapterBaseInterface a2 = C0110d.a().a(networkSettings, this.m.a);
        return (a2 instanceof AdapterSettingsInterface) && this.a.a(this.m.h.a, networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), ((AdapterSettingsInterface) a2).getLoadWhileShowSupportedState(networkSettings));
    }

    private Smash b(com.ironsource.mediationsdk.a.c cVar, String str) {
        NetworkSettings a2 = this.m.a(cVar.a());
        if (a2 != null) {
            Adapter a3 = a(a2, this.m.a);
            if (a3 != null) {
                Smash a4 = a(a2, a3, n.a().b(this.m.a), str);
                this.b.put(a4.k(), cVar);
                this.c.put(cVar.a(), C0115i.a.ISAuctionPerformanceDidntAttemptToLoad);
                return a4;
            }
            String str2 = "addSmashToWaterfall - could not load ad adapter for " + a2.getProviderInstanceName();
            IronLog.INTERNAL.error(a(str2));
            this.q.e.b(str2);
        } else {
            String str3 = "could not find matching provider settings for auction response item - item = " + cVar.a();
            IronLog.INTERNAL.error(a(str3));
            this.q.e.c(str3);
        }
        return null;
    }

    private void c(Smash smash) {
        IronLog.INTERNAL.verbose(a(""));
        String b = this.b.get(smash.k()).b();
        smash.b(b);
        smash.a(b);
    }

    private boolean c(boolean z) {
        boolean z2;
        synchronized (this.s) {
            z2 = this.x == null || this.x.booleanValue() != z;
        }
        return z2;
    }

    private boolean h() {
        boolean z;
        synchronized (this.s) {
            z = this.n == a.LOADING;
        }
        return z;
    }

    private boolean i() {
        boolean z;
        synchronized (this.s) {
            z = this.n == a.AUCTION;
        }
        return z;
    }

    private void j() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.m.c) {
            arrayList.add(new l(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.m.a)));
        }
        this.l = new m(arrayList);
    }

    private void k() {
        JSONObject jSONObject;
        IronLog.INTERNAL.verbose(a(""));
        for (NetworkSettings networkSettings : this.m.c) {
            if (networkSettings.isIronSource() || networkSettings.isBidder(this.m.a)) {
                HashMap hashMap = new HashMap();
                hashMap.put(DataKeys.USER_ID, this.m.b);
                if (this.m.a == IronSource.AD_UNIT.INTERSTITIAL) {
                    jSONObject = networkSettings.getInterstitialSettings();
                } else if (this.m.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    jSONObject = networkSettings.getRewardedVideoSettings();
                } else {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("ad unit not supported - " + this.m.a);
                    jSONObject = new JSONObject();
                }
                hashMap.putAll(com.ironsource.mediationsdk.c.b.a(jSONObject));
                AdData adData = new AdData(null, hashMap);
                AdapterBaseInterface a2 = C0110d.a().a(networkSettings, this.m.a);
                if (a2 != null) {
                    try {
                        a2.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
                    } catch (Exception e) {
                        i iVar = this.q.e;
                        iVar.a("initNetworks - exception while calling networkAdapter.init - " + e);
                    }
                } else {
                    this.q.e.a("initNetworks - could not load network adapter");
                }
            }
        }
    }

    private void l() {
        IronLog.INTERNAL.verbose(a(""));
        a(m(), r());
    }

    private List<com.ironsource.mediationsdk.a.c> m() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.m.c) {
            l lVar = new l(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.m.a));
            if (!networkSettings.isBidder(this.m.a) && !this.l.b(lVar) && a(networkSettings)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.a.c(lVar.k()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void n() {
        Iterator<Smash> it = o().iterator();
        while (it.hasNext()) {
            c((e<Smash, Adapter>) it.next());
        }
    }

    private ArrayList<Smash> o() {
        IronLog.INTERNAL.verbose(a("mWaterfall.size() = " + this.a.a().size()));
        ArrayList<Smash> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.a.a().size() || i2 >= this.m.e) {
                break;
            }
            Smash smash = this.a.a().get(i);
            if (smash.e()) {
                if (smash.c() || smash.d()) {
                    IronLog.INTERNAL.verbose("smash = " + smash.l());
                } else if (!smash.h()) {
                    arrayList.add(smash);
                } else if (i2 == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + smash.k() + ". No other instances will be loaded at the same time.";
                    IronLog.INTERNAL.verbose(a(str));
                    IronSourceUtils.sendAutomationLog(str);
                    arrayList.add(smash);
                    i2++;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + smash.k() + " as a non bidder is being loaded";
                    IronLog.INTERNAL.verbose(a(str2));
                    IronSourceUtils.sendAutomationLog(str2);
                }
                i2++;
            }
            i++;
        }
        if (i2 == 0) {
            a((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
        }
        return arrayList;
    }

    private void p() {
        IronLog.INTERNAL.verbose(a(""));
        synchronized (this.s) {
            if (this.n == a.AUCTION) {
                return;
            }
            a(a.AUCTION);
            long a2 = this.m.d.i - com.ironsource.mediationsdk.utils.f.a(this.u);
            if (a2 > 0) {
                new Timer().schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.adunit.c.e.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        e.this.q();
                    }
                }, a2);
            } else {
                q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        IronLog.INTERNAL.verbose(a(""));
        AsyncTask.execute(new Runnable() { // from class: com.ironsource.mediationsdk.adunit.c.e.2
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                String str;
                i iVar;
                e.this.h = new JSONObject();
                e.this.q.c.a();
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                for (NetworkSettings networkSettings : e.this.m.c) {
                    if (!e.this.l.b(new l(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(e.this.m.a))) && e.this.a(networkSettings)) {
                        if (networkSettings.isBidder(e.this.m.a)) {
                            AdapterBaseInterface a2 = C0110d.a().a(networkSettings, e.this.m.a);
                            if (a2 instanceof AdapterBidderInterface) {
                                try {
                                    Map<String, Object> biddingData = ((AdapterBidderInterface) a2).getBiddingData(ContextProvider.getInstance().getApplicationContext());
                                    if (biddingData != null) {
                                        hashMap.put(networkSettings.getProviderInstanceName(), biddingData);
                                        sb.append(networkSettings.getInstanceType(e.this.m.a) + networkSettings.getProviderInstanceName() + ",");
                                    } else {
                                        e.this.q.e.d("missing bidding data for " + networkSettings.getProviderInstanceName());
                                    }
                                } catch (Exception e) {
                                    iVar = e.this.q.e;
                                    str = "exception while calling networkAdapter.getBiddingData - " + e;
                                }
                            } else {
                                str = a2 == null ? "could not load network adapter" : "network adapter does not implementing AdapterBidderInterface";
                                iVar = e.this.q.e;
                            }
                            iVar.a(str);
                        } else {
                            arrayList.add(networkSettings.getProviderInstanceName());
                            sb.append(networkSettings.getInstanceType(e.this.m.a) + networkSettings.getProviderInstanceName() + ",");
                        }
                    }
                }
                IronLog.INTERNAL.verbose(e.this.a("auction waterfallString = " + ((Object) sb)));
                if (hashMap.size() != 0 || arrayList.size() != 0) {
                    e.this.q.c.a(sb.toString());
                    if (e.this.d != null) {
                        e.this.d.a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, e.this.e, n.a().b(e.this.m.a));
                        return;
                    } else {
                        IronLog.INTERNAL.error(e.this.a("mAuctionHandler is null"));
                        return;
                    }
                }
                IronLog.INTERNAL.verbose(e.this.a("auction failed - no candidates"));
                e.this.q.c.a(0L, 1005, "No candidates available for auctioning");
                e eVar = e.this;
                IronSource.AD_UNIT ad_unit = eVar.m.a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = 1024;
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                    i = IronSourceError.ERROR_CODE_GENERIC;
                }
                eVar.a(i, "Empty waterfall");
            }
        });
    }

    private static String r() {
        return "fallback_" + System.currentTimeMillis();
    }

    protected abstract Adapter a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit);

    protected abstract Smash a(NetworkSettings networkSettings, Adapter adapter, int i, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(String str) {
        String name = this.m.a.name();
        if (TextUtils.isEmpty(str)) {
            return name;
        }
        return name + " - " + str;
    }

    @Override // com.ironsource.mediationsdk.adunit.b.c
    public final Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        boolean z = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.a.b)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.a.b);
        }
        JSONObject jSONObject = this.h;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.h);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(n.a().b(this.m.a)));
        if (bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.AUCTION_SUCCESS && bVar != com.ironsource.mediationsdk.adunit.b.b.AUCTION_FAILED) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f));
            if (!TextUtils.isEmpty(this.g)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.g);
            }
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.adunit.e.b
    public final void a(int i) {
        i iVar = this.q.e;
        iVar.n("waterfalls hold too many with size = " + i);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0113g
    public final void a(int i, String str, int i2, String str2, long j) {
        String str3 = "";
        IronLog.INTERNAL.verbose(a(""));
        if (!i()) {
            this.q.e.h("unexpected auction fail - error = " + i + ", " + str);
            return;
        }
        String str4 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        IronLog.INTERNAL.verbose(a(str4));
        StringBuilder sb = new StringBuilder();
        IronSource.AD_UNIT ad_unit = this.m.a;
        if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            str3 = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        } else if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
            str3 = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
            str3 = "BN";
        }
        sb.append(str3);
        sb.append(": ");
        sb.append(str4);
        IronSourceUtils.sendAutomationLog(sb.toString());
        this.f = i2;
        this.g = str2;
        this.h = new JSONObject();
        l();
        this.q.c.a(j, i, str);
        a(a.LOADING);
        n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(com.ironsource.mediationsdk.a.c cVar, String str) {
        if (cVar == null) {
            IronLog.INTERNAL.verbose(a("no auctionResponseItem or listener"));
            return;
        }
        ImpressionData a2 = cVar.a(str);
        if (a2 != null) {
            for (ImpressionDataListener impressionDataListener : this.t) {
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info(a("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a2));
                impressionDataListener.onImpressionSuccess(a2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("from " + this.n + " to " + aVar));
        synchronized (this.s) {
            this.n = aVar;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    public final void a(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        IronLog.INTERNAL.verbose(a(cVar.l()));
        if (cVar.n() != this.a.b) {
            String str = "onLoadSuccess was invoked with state = " + this.n + " auctionId: " + cVar.n() + " and the current id is " + this.a.b;
            IronLog.INTERNAL.verbose(str);
            this.q.e.i(str);
            return;
        }
        this.c.put(cVar.k(), C0115i.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(a.LOADING, a.READY_TO_SHOW)) {
            boolean z = false;
            if (this.m.h.a()) {
                b bVar = this.r;
                if (bVar.a == IronSource.AD_UNIT.INTERSTITIAL) {
                    A.a().b();
                } else if (bVar.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    X.a().b();
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + bVar.a);
                }
            } else {
                a(true, false);
            }
            long a2 = com.ironsource.mediationsdk.utils.f.a(this.v);
            if (this.m.a == IronSource.AD_UNIT.REWARDED_VIDEO && this.m.h.a == a.EnumC0086a.MANUAL) {
                z = true;
            }
            this.q.b.a(a2, z);
            if (this.m.h.b()) {
                this.p.a(0L);
            }
            if (this.m.a()) {
                com.ironsource.mediationsdk.a.c cVar2 = this.b.get(cVar.k());
                if (cVar2 != null) {
                    C0114h.a(cVar2, cVar.i(), this.i);
                    ArrayList arrayList = new ArrayList();
                    Iterator<Smash> it = this.a.a().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().k());
                    }
                    C0114h.a(arrayList, this.b, cVar.i(), this.i, cVar2);
                    return;
                }
                String k = cVar.k();
                String str2 = "winner instance missing from waterfall - " + k;
                IronLog.INTERNAL.verbose(a(str2));
                this.q.e.a(1010, str2, k);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[LOOP:0: B:18:0x0087->B:20:0x008d, LOOP_END] */
    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.ironsource.mediationsdk.logger.IronSourceError r6, com.ironsource.mediationsdk.adunit.d.a.c<?> r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.s
            monitor-enter(r1)
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r3.<init>()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r4 = r7.l()     // Catch: java.lang.Throwable -> Lce
            r3.append(r4)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r4 = " - error = "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lce
            r3.append(r6)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = r5.a(r3)     // Catch: java.lang.Throwable -> Lce
            r2.verbose(r3)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r2 = r7.n()     // Catch: java.lang.Throwable -> Lce
            com.ironsource.mediationsdk.adunit.e.a<Smash extends com.ironsource.mediationsdk.adunit.d.a.c<?>> r3 = r5.a     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = r3.b     // Catch: java.lang.Throwable -> Lce
            if (r2 != r3) goto L98
            com.ironsource.mediationsdk.adunit.c.e$a r2 = r5.n     // Catch: java.lang.Throwable -> Lce
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.c.e.a.AUCTION     // Catch: java.lang.Throwable -> Lce
            if (r2 != r3) goto L3a
            goto L98
        L3a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r2 = r5.c     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = r7.k()     // Catch: java.lang.Throwable -> Lce
            com.ironsource.mediationsdk.i$a r4 = com.ironsource.mediationsdk.C0115i.a.ISAuctionPerformanceFailedToLoad     // Catch: java.lang.Throwable -> Lce
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Lce
            boolean r2 = r5.h()     // Catch: java.lang.Throwable -> Lce
            if (r2 != 0) goto L7e
            boolean r2 = r5.f()     // Catch: java.lang.Throwable -> Lce
            if (r2 == 0) goto L52
            goto L7e
        L52:
            com.ironsource.mediationsdk.adunit.b.d r2 = r5.q     // Catch: java.lang.Throwable -> Lce
            com.ironsource.mediationsdk.adunit.b.i r2 = r2.e     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            java.lang.String r4 = "unexpected load failed for state - "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lce
            com.ironsource.mediationsdk.adunit.c.e$a r4 = r5.n     // Catch: java.lang.Throwable -> Lce
            r3.append(r4)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r4 = " smash - "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = r7.l()     // Catch: java.lang.Throwable -> Lce
            r3.append(r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = ", error - "
            r3.append(r7)     // Catch: java.lang.Throwable -> Lce
            r3.append(r6)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> Lce
            r2.j(r6)     // Catch: java.lang.Throwable -> Lce
            goto L82
        L7e:
            java.util.ArrayList r0 = r5.o()     // Catch: java.lang.Throwable -> Lce
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lce
            java.util.Iterator r6 = r0.iterator()
        L87:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L97
            java.lang.Object r7 = r6.next()
            com.ironsource.mediationsdk.adunit.d.a.c r7 = (com.ironsource.mediationsdk.adunit.d.a.c) r7
            r5.c(r7)
            goto L87
        L97:
            return
        L98:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = "onAdLoadFailed was invoked with state ="
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lce
            com.ironsource.mediationsdk.adunit.c.e$a r0 = r5.n     // Catch: java.lang.Throwable -> Lce
            r6.append(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = " auctionId: "
            r6.append(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = r7.n()     // Catch: java.lang.Throwable -> Lce
            r6.append(r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = " and the current id is "
            r6.append(r7)     // Catch: java.lang.Throwable -> Lce
            com.ironsource.mediationsdk.adunit.e.a<Smash extends com.ironsource.mediationsdk.adunit.d.a.c<?>> r7 = r5.a     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = r7.b     // Catch: java.lang.Throwable -> Lce
            r6.append(r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lce
            com.ironsource.mediationsdk.logger.IronLog r7 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> Lce
            r7.verbose(r6)     // Catch: java.lang.Throwable -> Lce
            com.ironsource.mediationsdk.adunit.b.d r7 = r5.q     // Catch: java.lang.Throwable -> Lce
            com.ironsource.mediationsdk.adunit.b.i r7 = r7.e     // Catch: java.lang.Throwable -> Lce
            r7.j(r6)     // Catch: java.lang.Throwable -> Lce
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lce
            return
        Lce:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lce
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.e.a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.adunit.d.a.c):void");
    }

    @Override // com.ironsource.mediationsdk.InterfaceC0113g
    public final void a(List<com.ironsource.mediationsdk.a.c> list, String str, com.ironsource.mediationsdk.a.c cVar, JSONObject jSONObject, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.verbose(a(""));
        if (!i()) {
            i iVar = this.q.e;
            iVar.g("unexpected auction success for auctionId - " + str);
            return;
        }
        this.g = "";
        this.f = i;
        this.i = cVar;
        this.h = jSONObject;
        String a2 = a(list, str);
        this.q.c.a(j);
        this.q.c.b(a2);
        a(a.LOADING);
        n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (b() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r3.x.booleanValue() != false) goto L8;
     */
    @Override // com.ironsource.environment.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.k
            if (r0 == 0) goto L48
            com.ironsource.mediationsdk.adunit.c.a r0 = r3.m
            com.ironsource.mediationsdk.adunit.c.b.a r0 = r0.h
            boolean r0 = r0.a()
            if (r0 == 0) goto Lf
            goto L48
        Lf:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "network availability changed to - "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            java.lang.Boolean r0 = r3.x
            r1 = 0
            if (r0 != 0) goto L29
        L27:
            r2 = r1
            goto L43
        L29:
            r2 = 1
            if (r4 == 0) goto L39
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L39
            boolean r0 = r3.b()
            if (r0 == 0) goto L39
            goto L43
        L39:
            if (r4 != 0) goto L27
            java.lang.Boolean r0 = r3.x
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
        L43:
            if (r2 == 0) goto L48
            r3.a(r4, r1)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.e.a(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(boolean z, boolean z2) {
        if (c(z)) {
            this.x = Boolean.valueOf(z);
            long time = this.w != 0 ? new Date().getTime() - this.w : 0L;
            this.w = new Date().getTime();
            this.q.b.a(z, time, z2);
            this.r.a(z);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    public final void b(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        IronLog.INTERNAL.verbose(a(cVar.l()));
        b bVar = this.r;
        Placement placement = this.j;
        if (bVar.a == IronSource.AD_UNIT.INTERSTITIAL) {
            A.a().f();
        } else if (bVar.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            X.a().b(placement);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.a);
        }
    }

    public final void b(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("track = " + z));
        this.k = z;
    }

    protected abstract boolean b();

    @Override // com.ironsource.mediationsdk.InterfaceC0109c
    public final void c_() {
        if (this.m.h.b()) {
            a(a.READY_TO_LOAD);
            a(false, true);
            e();
        }
    }

    @Override // com.ironsource.mediationsdk.ab
    public final void d() {
        IronLog.INTERNAL.verbose(a(""));
        e();
    }

    public final void e() {
        IronLog.INTERNAL.verbose(a(""));
        synchronized (this.s) {
            if (this.m.h.b() && this.l.a()) {
                IronLog.INTERNAL.verbose(a("all smashes are capped"));
                a(80001, "all smashes are capped");
                return;
            }
            boolean z = false;
            if (this.m.h.a != a.EnumC0086a.AUTOMATIC_LOAD_WHILE_SHOW && this.n == a.SHOWING) {
                IronLog.API.error(a("load cannot be invoked while showing an ad"));
                IronSourceError ironSourceError = new IronSourceError(com.ironsource.mediationsdk.adunit.a.a.b(this.m.a), "load cannot be invoked while showing an ad");
                if (this.m.h.a()) {
                    this.r.a(ironSourceError);
                } else {
                    this.r.a(false);
                }
            } else if (this.m.h.a != a.EnumC0086a.AUTOMATIC_LOAD_WHILE_SHOW && ((this.n != a.READY_TO_LOAD && this.n != a.READY_TO_SHOW) || C0121o.a().a(this.m.a))) {
                IronLog.API.error(a("load is already in progress"));
            } else {
                this.h = new JSONObject();
                if (this.m.a == IronSource.AD_UNIT.REWARDED_VIDEO && this.m.h.a == a.EnumC0086a.MANUAL) {
                    z = true;
                }
                this.q.b.a(z);
                this.v = new com.ironsource.mediationsdk.utils.f();
                if (this.m.a()) {
                    if (!this.c.isEmpty()) {
                        this.e.a(this.c);
                        this.c.clear();
                    }
                    p();
                } else {
                    a(a.LOADING);
                }
                if (this.m.a()) {
                    return;
                }
                l();
                n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f() {
        boolean z;
        synchronized (this.s) {
            z = this.n == a.READY_TO_SHOW;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String g() {
        Placement placement = this.j;
        return placement == null ? "" : placement.getPlacementName();
    }
}
