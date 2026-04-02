package com.facebook.ads.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.NativeAd;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.BannerAdapter;
import com.facebook.ads.internal.adapters.BannerAdapterListener;
import com.facebook.ads.internal.adapters.InterstitialAdapter;
import com.facebook.ads.internal.adapters.InterstitialAdapterListener;
import com.facebook.ads.internal.adapters.ab;
import com.facebook.ads.internal.adapters.ac;
import com.facebook.ads.internal.adapters.ae;
import com.facebook.ads.internal.adapters.af;
import com.facebook.ads.internal.adapters.u;
import com.facebook.ads.internal.adapters.x;
import com.facebook.ads.internal.adapters.y;
import com.facebook.ads.internal.o.c;
import com.facebook.ads.internal.o.g;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.d;
import com.facebook.ads.internal.protocol.e;
import com.facebook.ads.internal.protocol.f;
import com.facebook.ads.internal.protocol.h;
import com.facebook.ads.internal.q.a.k;
import com.facebook.ads.internal.q.a.n;
import com.facebook.ads.internal.q.a.w;
import com.facebook.share.internal.ShareConstants;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class DisplayAdController implements c.a {
    private static final String b;
    private static final Handler h;
    private static boolean i;
    private boolean A;
    private final com.facebook.ads.internal.m.c B;
    private final EnumSet<CacheFlag> C;
    protected com.facebook.ads.internal.adapters.a a;
    private final Context c;
    private final String d;
    private final AdPlacementType e;
    private final com.facebook.ads.internal.o.c f;
    private final Handler g;
    private final Runnable j;
    private final Runnable k;
    private volatile boolean l;
    private boolean m;
    private volatile boolean n;
    private AdAdapter o;
    private AdAdapter p;
    private View q;
    private com.facebook.ads.internal.h.c r;
    private com.facebook.ads.internal.o.b s;
    private f t;
    private d u;
    private e v;
    private int w;
    private boolean x;
    private int y;
    private final c z;

    /* loaded from: classes2.dex */
    private static final class a extends w<DisplayAdController> {
        public a(DisplayAdController displayAdController) {
            super(displayAdController);
        }

        @Override // java.lang.Runnable
        public void run() {
            DisplayAdController a = a();
            if (a == null) {
                return;
            }
            a.l = false;
            a.c((String) null);
        }
    }

    /* loaded from: classes2.dex */
    private static final class b extends w<DisplayAdController> {
        public b(DisplayAdController displayAdController) {
            super(displayAdController);
        }

        @Override // java.lang.Runnable
        public void run() {
            DisplayAdController a = a();
            if (a == null) {
                return;
            }
            a.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                DisplayAdController.this.o();
            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                DisplayAdController.this.n();
            }
        }
    }

    static {
        com.facebook.ads.internal.q.a.d.a();
        b = DisplayAdController.class.getSimpleName();
        h = new Handler(Looper.getMainLooper());
        i = false;
    }

    public DisplayAdController(Context context, String str, f fVar, AdPlacementType adPlacementType, e eVar, d dVar, int i2, boolean z) {
        this(context, str, fVar, adPlacementType, eVar, dVar, i2, z, EnumSet.of(CacheFlag.NONE));
    }

    public DisplayAdController(Context context, String str, f fVar, AdPlacementType adPlacementType, e eVar, d dVar, int i2, boolean z, EnumSet<CacheFlag> enumSet) {
        this.g = new Handler();
        this.x = false;
        this.y = -1;
        this.c = context.getApplicationContext();
        this.d = str;
        this.t = fVar;
        this.e = adPlacementType;
        this.v = eVar;
        this.u = dVar;
        this.w = i2;
        this.z = new c();
        this.C = enumSet;
        this.f = new com.facebook.ads.internal.o.c(this.c);
        this.f.a(this);
        this.j = new a(this);
        this.k = new b(this);
        this.m = z;
        i();
        try {
            CookieManager.getInstance();
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(this.c);
            }
        } catch (Exception e) {
            Log.w(b, "Failed to initialize CookieManager.", e);
        }
        com.facebook.ads.internal.i.a.a(this.c).a();
        this.B = com.facebook.ads.internal.m.d.a(this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("delay", String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdAdapter adAdapter) {
        if (adAdapter != null) {
            adAdapter.onDestroy();
        }
    }

    private void a(final BannerAdapter bannerAdapter, com.facebook.ads.internal.h.c cVar, Map<String, Object> map) {
        final Runnable runnable = new Runnable() { // from class: com.facebook.ads.internal.DisplayAdController.8
            @Override // java.lang.Runnable
            public void run() {
                DisplayAdController.this.a(bannerAdapter);
                DisplayAdController.this.l();
            }
        };
        this.g.postDelayed(runnable, cVar.a().j());
        bannerAdapter.loadBannerAd(this.c, this.B, this.v, new BannerAdapterListener() { // from class: com.facebook.ads.internal.DisplayAdController.9
            @Override // com.facebook.ads.internal.adapters.BannerAdapterListener
            public void onBannerAdClicked(BannerAdapter bannerAdapter2) {
                DisplayAdController.this.a.a();
            }

            @Override // com.facebook.ads.internal.adapters.BannerAdapterListener
            public void onBannerAdExpanded(BannerAdapter bannerAdapter2) {
                DisplayAdController.this.o();
            }

            @Override // com.facebook.ads.internal.adapters.BannerAdapterListener
            public void onBannerAdLoaded(BannerAdapter bannerAdapter2, View view) {
            }

            @Override // com.facebook.ads.internal.adapters.BannerAdapterListener
            public void onBannerAdMinimized(BannerAdapter bannerAdapter2) {
                DisplayAdController.this.n();
            }

            @Override // com.facebook.ads.internal.adapters.BannerAdapterListener
            public void onBannerError(BannerAdapter bannerAdapter2, AdError adError) {
                if (bannerAdapter2 != DisplayAdController.this.o) {
                    return;
                }
                DisplayAdController.this.g.removeCallbacks(runnable);
                DisplayAdController.this.a(bannerAdapter2);
                DisplayAdController.this.l();
            }

            @Override // com.facebook.ads.internal.adapters.BannerAdapterListener
            public void onBannerLoggingImpression(BannerAdapter bannerAdapter2) {
                DisplayAdController.this.a.b();
            }
        }, map);
    }

    private void a(final InterstitialAdapter interstitialAdapter, com.facebook.ads.internal.h.c cVar, Map<String, Object> map) {
        final Runnable runnable = new Runnable() { // from class: com.facebook.ads.internal.DisplayAdController.10
            @Override // java.lang.Runnable
            public void run() {
                DisplayAdController.this.a(interstitialAdapter);
                DisplayAdController.this.l();
            }
        };
        this.g.postDelayed(runnable, cVar.a().j());
        interstitialAdapter.loadInterstitialAd(this.c, new InterstitialAdapterListener() { // from class: com.facebook.ads.internal.DisplayAdController.11
            @Override // com.facebook.ads.internal.adapters.InterstitialAdapterListener
            public void onInterstitialAdClicked(InterstitialAdapter interstitialAdapter2, String str, boolean z) {
                DisplayAdController.this.a.a();
                boolean z2 = !TextUtils.isEmpty(str);
                if (z && z2) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (!(DisplayAdController.this.s.b instanceof Activity)) {
                        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
                    }
                    intent.setData(Uri.parse(str));
                    DisplayAdController.this.s.b.startActivity(intent);
                }
            }

            @Override // com.facebook.ads.internal.adapters.InterstitialAdapterListener
            public void onInterstitialAdDismissed(InterstitialAdapter interstitialAdapter2) {
                DisplayAdController.this.a.e();
            }

            @Override // com.facebook.ads.internal.adapters.InterstitialAdapterListener
            public void onInterstitialAdDisplayed(InterstitialAdapter interstitialAdapter2) {
                DisplayAdController.this.a.d();
            }

            @Override // com.facebook.ads.internal.adapters.InterstitialAdapterListener
            public void onInterstitialAdLoaded(InterstitialAdapter interstitialAdapter2) {
            }

            @Override // com.facebook.ads.internal.adapters.InterstitialAdapterListener
            public void onInterstitialError(InterstitialAdapter interstitialAdapter2, AdError adError) {
                if (interstitialAdapter2 != DisplayAdController.this.o) {
                    return;
                }
                DisplayAdController.this.g.removeCallbacks(runnable);
                DisplayAdController.this.a(interstitialAdapter2);
                DisplayAdController.this.l();
                DisplayAdController.this.a.a(new com.facebook.ads.internal.protocol.a(adError.getErrorCode(), adError.getErrorMessage()));
            }

            @Override // com.facebook.ads.internal.adapters.InterstitialAdapterListener
            public void onInterstitialLoggingImpression(InterstitialAdapter interstitialAdapter2) {
                DisplayAdController.this.a.b();
            }
        }, map, this.B, this.C);
    }

    private void a(final ab abVar, com.facebook.ads.internal.h.c cVar, final com.facebook.ads.internal.h.a aVar, Map<String, Object> map) {
        final long currentTimeMillis = System.currentTimeMillis();
        final Runnable runnable = new Runnable() { // from class: com.facebook.ads.internal.DisplayAdController.12
            @Override // java.lang.Runnable
            public void run() {
                DisplayAdController.this.a(abVar);
                if (abVar instanceof x) {
                    com.facebook.ads.internal.q.a.d.a(DisplayAdController.this.c, y.a(((x) abVar).F()) + " Failed. Ad request timed out");
                }
                Map a2 = DisplayAdController.this.a(currentTimeMillis);
                a2.put("error", GMNetworkPlatformConst.AD_NETWORK_NO_PRICE);
                a2.put("msg", "timeout");
                DisplayAdController.this.a(aVar.a(com.facebook.ads.internal.h.e.REQUEST), a2);
                DisplayAdController.this.l();
            }
        };
        this.g.postDelayed(runnable, cVar.a().j());
        abVar.a(this.c, new ac() { // from class: com.facebook.ads.internal.DisplayAdController.2
            boolean a = false;
            boolean b = false;
            boolean c = false;

            @Override // com.facebook.ads.internal.adapters.ac
            public void a(ab abVar2) {
                if (abVar2 != DisplayAdController.this.o) {
                    return;
                }
                DisplayAdController.this.g.removeCallbacks(runnable);
                DisplayAdController.this.p = abVar2;
                DisplayAdController.this.a.a((AdAdapter) abVar2);
                if (this.a) {
                    return;
                }
                this.a = true;
                DisplayAdController.this.a(aVar.a(com.facebook.ads.internal.h.e.REQUEST), DisplayAdController.this.a(currentTimeMillis));
            }

            @Override // com.facebook.ads.internal.adapters.ac
            public void a(ab abVar2, com.facebook.ads.internal.protocol.a aVar2) {
                if (abVar2 != DisplayAdController.this.o) {
                    return;
                }
                DisplayAdController.this.g.removeCallbacks(runnable);
                DisplayAdController.this.a(abVar2);
                if (!this.a) {
                    this.a = true;
                    Map a2 = DisplayAdController.this.a(currentTimeMillis);
                    a2.put("error", String.valueOf(aVar2.a().getErrorCode()));
                    a2.put("msg", String.valueOf(aVar2.b()));
                    DisplayAdController.this.a(aVar.a(com.facebook.ads.internal.h.e.REQUEST), a2);
                }
                DisplayAdController.this.l();
            }

            @Override // com.facebook.ads.internal.adapters.ac
            public void b(ab abVar2) {
                if (this.b) {
                    return;
                }
                this.b = true;
                DisplayAdController.this.a(aVar.a(com.facebook.ads.internal.h.e.IMPRESSION), (Map<String, String>) null);
            }

            @Override // com.facebook.ads.internal.adapters.ac
            public void c(ab abVar2) {
                if (!this.c) {
                    this.c = true;
                    DisplayAdController.this.a(aVar.a(com.facebook.ads.internal.h.e.CLICK), (Map<String, String>) null);
                }
                if (DisplayAdController.this.a != null) {
                    DisplayAdController.this.a.a();
                }
            }
        }, this.B, map, NativeAd.getViewTraversalPredicate());
    }

    private void a(ae aeVar, com.facebook.ads.internal.h.c cVar, Map<String, Object> map) {
        aeVar.a(this.c, new af() { // from class: com.facebook.ads.internal.DisplayAdController.7
            @Override // com.facebook.ads.internal.adapters.af
            public void a() {
                DisplayAdController.this.a.g();
            }

            @Override // com.facebook.ads.internal.adapters.af
            public void a(ae aeVar2) {
                DisplayAdController.this.p = aeVar2;
                DisplayAdController.this.a.a(aeVar2);
            }

            @Override // com.facebook.ads.internal.adapters.af
            public void a(ae aeVar2, AdError adError) {
                DisplayAdController.this.a.a(new com.facebook.ads.internal.protocol.a(AdErrorType.INTERNAL_ERROR, (String) null));
                DisplayAdController.this.a(aeVar2);
                DisplayAdController.this.l();
            }

            @Override // com.facebook.ads.internal.adapters.af
            public void b(ae aeVar2) {
                DisplayAdController.this.a.a();
            }

            @Override // com.facebook.ads.internal.adapters.af
            public void c(ae aeVar2) {
                DisplayAdController.this.a.b();
            }

            @Override // com.facebook.ads.internal.adapters.af
            public void d(ae aeVar2) {
                DisplayAdController.this.a.f();
            }

            @Override // com.facebook.ads.internal.adapters.af
            public void e(ae aeVar2) {
                DisplayAdController.this.a.h();
            }

            @Override // com.facebook.ads.internal.adapters.af
            public void f(ae aeVar2) {
                DisplayAdController.this.a.i();
            }
        }, map, this.x);
    }

    private void a(u uVar, com.facebook.ads.internal.h.c cVar, Map<String, Object> map) {
        uVar.a(this.c, new com.facebook.ads.a.a() { // from class: com.facebook.ads.internal.DisplayAdController.6
            @Override // com.facebook.ads.a.a
            public void a(u uVar2) {
                DisplayAdController.this.p = uVar2;
                DisplayAdController.this.n = false;
                DisplayAdController.this.a.a(uVar2);
            }

            @Override // com.facebook.ads.a.a
            public void a(u uVar2, View view) {
                DisplayAdController.this.a.a(view);
            }

            @Override // com.facebook.ads.a.a
            public void a(u uVar2, AdError adError) {
                DisplayAdController.this.a.a(new com.facebook.ads.internal.protocol.a(adError.getErrorCode(), adError.getErrorMessage()));
            }

            @Override // com.facebook.ads.a.a
            public void b(u uVar2) {
                DisplayAdController.this.a.a();
            }

            @Override // com.facebook.ads.a.a
            public void c(u uVar2) {
                DisplayAdController.this.a.b();
            }

            @Override // com.facebook.ads.a.a
            public void d(u uVar2) {
                DisplayAdController.this.a.c();
            }
        }, map, this.B, this.C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<String> list, Map<String, String> map) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            new com.facebook.ads.internal.q.c.e(this.c, map).execute(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            this.s = new com.facebook.ads.internal.o.b(this.c, new com.facebook.ads.internal.i.c(this.c, false), this.d, this.v != null ? new k(this.v.b(), this.v.a()) : null, this.t, this.u, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, com.facebook.ads.internal.adapters.f.a(com.facebook.ads.internal.protocol.c.a(this.t).a()), this.w, AdSettings.isTestMode(this.c), AdSettings.isChildDirected(), new h(this.c, str, this.d, this.t), n.a(com.facebook.ads.internal.l.a.m(this.c)));
            this.f.a(this.s);
        } catch (com.facebook.ads.internal.protocol.b e) {
            a(com.facebook.ads.internal.protocol.a.a(e));
        }
    }

    private void i() {
        if (this.m) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.c.registerReceiver(this.z, intentFilter);
        this.A = true;
    }

    private void j() {
        if (this.A) {
            try {
                this.c.unregisterReceiver(this.z);
                this.A = false;
            } catch (Exception e) {
                com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(e, "Error unregistering screen state receiever"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AdPlacementType k() {
        return this.e != null ? this.e : this.v == null ? AdPlacementType.NATIVE : this.v == e.INTERSTITIAL ? AdPlacementType.INTERSTITIAL : AdPlacementType.BANNER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        h.post(new Runnable() { // from class: com.facebook.ads.internal.DisplayAdController.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    DisplayAdController.this.m();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.o = null;
        com.facebook.ads.internal.h.c cVar = this.r;
        com.facebook.ads.internal.h.a d = cVar.d();
        if (d == null) {
            this.a.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.NO_FILL, ""));
            n();
            return;
        }
        String a2 = d.a();
        AdAdapter a3 = com.facebook.ads.internal.adapters.f.a(a2, cVar.a().b());
        if (a3 == null) {
            Log.e(b, "Adapter does not exist: " + a2);
            l();
        } else if (k() != a3.getPlacementType()) {
            this.a.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.INTERNAL_ERROR, ""));
        } else {
            this.o = a3;
            Map<String, Object> hashMap = new HashMap<>();
            com.facebook.ads.internal.h.d a4 = cVar.a();
            hashMap.put(ShareConstants.WEB_DIALOG_PARAM_DATA, d.b());
            hashMap.put("definition", a4);
            hashMap.put(AudienceNetworkActivity.PLACEMENT_ID, this.d);
            hashMap.put(AudienceNetworkActivity.REQUEST_TIME, Long.valueOf(a4.a()));
            if (this.s == null) {
                this.a.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.UNKNOWN_ERROR, "environment is empty"));
                return;
            }
            switch (a3.getPlacementType()) {
                case INTERSTITIAL:
                    a((InterstitialAdapter) a3, cVar, hashMap);
                    return;
                case BANNER:
                    a((BannerAdapter) a3, cVar, hashMap);
                    return;
                case NATIVE:
                    a((ab) a3, cVar, d, hashMap);
                    return;
                case INSTREAM:
                    a((u) a3, cVar, hashMap);
                    return;
                case REWARDED_VIDEO:
                    a((ae) a3, cVar, hashMap);
                    return;
                default:
                    Log.e(b, "attempt unexpected adapter type");
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.m || this.l) {
            return;
        }
        switch (k()) {
            case INTERSTITIAL:
                if (!com.facebook.ads.internal.q.e.a.a(this.c)) {
                    this.g.postDelayed(this.k, 1000L);
                    break;
                }
                break;
            case BANNER:
                boolean a2 = com.facebook.ads.internal.r.a.a(this.q, this.r == null ? 1 : this.r.a().f()).a();
                if (this.q != null && !a2) {
                    this.g.postDelayed(this.k, 1000L);
                    return;
                }
                break;
            default:
                return;
        }
        long c2 = this.r == null ? 30000L : this.r.a().c();
        if (c2 > 0) {
            this.g.postDelayed(this.j, c2);
            this.l = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.l) {
            this.g.removeCallbacks(this.j);
            this.l = false;
        }
    }

    private Handler p() {
        return !q() ? this.g : h;
    }

    private static synchronized boolean q() {
        boolean z;
        synchronized (DisplayAdController.class) {
            z = i;
        }
        return z;
    }

    protected static synchronized void setMainThreadForced(boolean z) {
        synchronized (DisplayAdController.class) {
            Log.d(b, "DisplayAdController changed main thread forced from " + i + " to " + z);
            i = z;
        }
    }

    public com.facebook.ads.internal.h.d a() {
        if (this.r == null) {
            return null;
        }
        return this.r.a();
    }

    public void a(int i2) {
        this.y = i2;
    }

    public void a(RewardData rewardData) {
        if (this.p == null) {
            throw new IllegalStateException("no adapter ready to set reward on");
        }
        if (this.p.getPlacementType() != AdPlacementType.REWARDED_VIDEO) {
            throw new IllegalStateException("can only set on rewarded video ads");
        }
        ((ae) this.p).a(rewardData);
    }

    public void a(com.facebook.ads.internal.adapters.a aVar) {
        this.a = aVar;
    }

    @Override // com.facebook.ads.internal.o.c.a
    public synchronized void a(final g gVar) {
        p().post(new Runnable() { // from class: com.facebook.ads.internal.DisplayAdController.1
            @Override // java.lang.Runnable
            public void run() {
                com.facebook.ads.internal.h.c a2 = gVar.a();
                if (a2 == null || a2.a() == null) {
                    throw new IllegalStateException("invalid placement in response");
                }
                DisplayAdController.this.r = a2;
                DisplayAdController.this.l();
            }
        });
    }

    @Override // com.facebook.ads.internal.o.c.a
    public synchronized void a(final com.facebook.ads.internal.protocol.a aVar) {
        p().post(new Runnable() { // from class: com.facebook.ads.internal.DisplayAdController.3
            @Override // java.lang.Runnable
            public void run() {
                DisplayAdController.this.a.a(aVar);
                if (DisplayAdController.this.m || DisplayAdController.this.l) {
                    return;
                }
                switch (aVar.a().getErrorCode()) {
                    case 1000:
                    case 1002:
                        switch (AnonymousClass4.a[DisplayAdController.this.k().ordinal()]) {
                            case 2:
                                DisplayAdController.this.g.postDelayed(DisplayAdController.this.j, 30000L);
                                DisplayAdController.this.l = true;
                                return;
                            default:
                                return;
                        }
                    case 1001:
                    default:
                        return;
                }
            }
        });
    }

    public void a(String str) {
        c(str);
    }

    public void a(boolean z) {
        this.x = z;
    }

    public void b() {
        if (this.p == null) {
            com.facebook.ads.internal.q.d.a.a(new com.facebook.ads.internal.protocol.b(AdErrorType.NO_ADAPTER_ON_START, "Adapter is null on startAd"), this.c);
            this.a.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.INTERNAL_ERROR, AdErrorType.INTERNAL_ERROR.getDefaultErrorMessage()));
        } else if (this.n) {
            throw new IllegalStateException("ad already started");
        } else {
            this.n = true;
            switch (this.p.getPlacementType()) {
                case INTERSTITIAL:
                    ((InterstitialAdapter) this.p).show();
                    return;
                case BANNER:
                    if (this.q != null) {
                        this.a.a(this.q);
                        n();
                        return;
                    }
                    return;
                case NATIVE:
                    ab abVar = (ab) this.p;
                    if (!abVar.c_()) {
                        throw new IllegalStateException("ad is not ready or already displayed");
                    }
                    this.a.a(abVar);
                    return;
                case INSTREAM:
                    ((u) this.p).e();
                    return;
                case REWARDED_VIDEO:
                    ae aeVar = (ae) this.p;
                    aeVar.a(this.y);
                    aeVar.b();
                    return;
                default:
                    Log.e(b, "start unexpected adapter type");
                    return;
            }
        }
    }

    public void b(String str) {
        o();
        c(str);
    }

    public void b(boolean z) {
        j();
        if (z || this.n) {
            o();
            a(this.p);
            this.f.a();
            this.q = null;
            this.n = false;
        }
    }

    public void c() {
        b(false);
    }

    public void d() {
        if (this.n) {
            o();
        }
    }

    public void e() {
        if (this.n) {
            n();
        }
    }

    public void f() {
        this.m = true;
        o();
    }

    public com.facebook.ads.internal.m.c g() {
        return this.B;
    }

    public AdAdapter h() {
        return this.p;
    }
}
