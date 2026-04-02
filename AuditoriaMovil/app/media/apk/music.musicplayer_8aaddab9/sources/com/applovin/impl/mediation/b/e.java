package com.applovin.impl.mediation.b;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.e.a {
    private static final AtomicBoolean a = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final String f3427c;

    /* renamed from: d  reason: collision with root package name */
    private final MaxAdFormat f3428d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f3429e;

    /* renamed from: f  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.a.a> f3430f;

    /* renamed from: g  reason: collision with root package name */
    private final a.InterfaceC0074a f3431g;

    /* renamed from: h  reason: collision with root package name */
    private final WeakReference<Context> f3432h;

    /* renamed from: i  reason: collision with root package name */
    private long f3433i;

    /* renamed from: j  reason: collision with root package name */
    private final List<MaxNetworkResponseInfo> f3434j;

    /* loaded from: classes.dex */
    public class a extends com.applovin.impl.sdk.e.a {

        /* renamed from: c  reason: collision with root package name */
        private final long f3438c;

        /* renamed from: d  reason: collision with root package name */
        private final int f3439d;

        /* renamed from: e  reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f3440e;

        /* renamed from: f  reason: collision with root package name */
        private final List<com.applovin.impl.mediation.a.a> f3441f;

        public a(int i2, List<com.applovin.impl.mediation.a.a> list) {
            super(e.this.e(), e.this.f4020b);
            this.f3438c = SystemClock.elapsedRealtime();
            this.f3439d = i2;
            this.f3440e = list.get(i2);
            this.f3441f = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.mediation.a.a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j2, MaxError maxError) {
            e.this.f3434j.add(new MaxNetworkResponseInfoImpl(adLoadState, aVar.i(), new MaxMediatedNetworkInfoImpl(com.applovin.impl.mediation.c.c.a(aVar.O(), this.f4020b)), j2, maxError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder y = e.a.d.a.a.y("Loading ad ");
            y.append(this.f3439d + 1);
            y.append(" of ");
            y.append(this.f3441f.size());
            y.append(": ");
            y.append(this.f3440e.P());
            a(y.toString());
            e("started to load ad");
            this.f4020b.E().loadThirdPartyMediatedAd(e.this.f3427c, this.f3440e, e.this.f3432h.get() instanceof Activity ? (Activity) e.this.f3432h.get() : this.f4020b.ao(), new com.applovin.impl.mediation.c.a(e.this.f3431g) { // from class: com.applovin.impl.mediation.b.e.a.1
                @Override // com.applovin.impl.mediation.c.a, com.applovin.mediation.MaxAdListener
                public void onAdLoadFailed(String str, MaxError maxError) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f3438c;
                    a aVar = a.this;
                    aVar.a("Ad failed to load in " + elapsedRealtime + " ms with error: " + maxError);
                    a aVar2 = a.this;
                    StringBuilder y2 = e.a.d.a.a.y("failed to load ad: ");
                    y2.append(maxError.getCode());
                    aVar2.e(y2.toString());
                    a aVar3 = a.this;
                    aVar3.a(aVar3.f3440e, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                    if (a.this.f3439d >= a.this.f3441f.size() - 1) {
                        e.this.a(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                        return;
                    }
                    a aVar4 = a.this;
                    a.this.f4020b.S().a(new a(aVar4.f3439d + 1, a.this.f3441f), com.applovin.impl.mediation.c.c.a(e.this.f3428d));
                }

                @Override // com.applovin.impl.mediation.c.a, com.applovin.mediation.MaxAdListener
                public void onAdLoaded(MaxAd maxAd) {
                    a.this.e("loaded ad");
                    long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f3438c;
                    a aVar = a.this;
                    aVar.a("Ad loaded in " + elapsedRealtime + "ms");
                    com.applovin.impl.mediation.a.a aVar2 = (com.applovin.impl.mediation.a.a) maxAd;
                    a.this.a(aVar2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                    int i2 = a.this.f3439d;
                    while (true) {
                        i2++;
                        if (i2 >= a.this.f3441f.size()) {
                            a aVar3 = a.this;
                            e.this.a(aVar2, aVar3.f3439d);
                            return;
                        }
                        a aVar4 = a.this;
                        aVar4.a((com.applovin.impl.mediation.a.a) aVar4.f3441f.get(i2), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            });
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.lang.String r3, com.applovin.mediation.MaxAdFormat r4, java.util.Map<java.lang.String, java.lang.Object> r5, org.json.JSONObject r6, android.content.Context r7, com.applovin.impl.sdk.m r8, com.applovin.impl.mediation.ads.a.InterfaceC0074a r9) {
        /*
            r2 = this;
            java.lang.String r0 = "TaskProcessMediationWaterfall:"
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = e.a.d.a.a.B(r0, r3, r1)
            java.lang.String r1 = r4.getLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r8)
            r2.f3427c = r3
            r2.f3428d = r4
            r2.f3429e = r6
            r2.f3431g = r9
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r7)
            r2.f3432h = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r6.length()
            r3.<init>(r4)
            r2.f3430f = r3
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.lang.String r4 = "ads"
            org.json.JSONArray r3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(r6, r4, r3)
            r4 = 0
        L3c:
            int r7 = r3.length()
            if (r4 >= r7) goto L53
            r7 = 0
            org.json.JSONObject r7 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(r3, r4, r7)
            java.util.List<com.applovin.impl.mediation.a.a> r9 = r2.f3430f
            com.applovin.impl.mediation.a.a r7 = com.applovin.impl.mediation.a.a.a(r5, r7, r6, r8)
            r9.add(r7)
            int r4 = r4 + 1
            goto L3c
        L53:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List<com.applovin.impl.mediation.a.a> r4 = r2.f3430f
            int r4 = r4.size()
            r3.<init>(r4)
            r2.f3434j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.b.e.<init>(java.lang.String, com.applovin.mediation.MaxAdFormat, java.util.Map, org.json.JSONObject, android.content.Context, com.applovin.impl.sdk.m, com.applovin.impl.mediation.ads.a$a):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, int i2) {
        float f2;
        final Float f3;
        this.f4020b.F().a(aVar);
        List<com.applovin.impl.mediation.a.a> list = this.f3430f;
        List<com.applovin.impl.mediation.a.a> subList = list.subList(i2 + 1, list.size());
        long longValue = ((Long) this.f4020b.a(com.applovin.impl.sdk.c.a.V)).longValue();
        float f4 = 1.0f;
        for (final com.applovin.impl.mediation.a.a aVar2 : subList) {
            Float h2 = aVar2.h();
            if (h2 != null) {
                f2 = h2.floatValue() * f4;
                f3 = Float.valueOf(f2);
            } else {
                f2 = f4;
                f3 = null;
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b.e.3
                @Override // java.lang.Runnable
                public void run() {
                    e.this.f4020b.E().processAdLossPostback(aVar2, f3);
                }
            }, TimeUnit.SECONDS.toMillis(longValue));
            f4 = f2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3433i;
        b("Waterfall loaded in " + elapsedRealtime + "ms for " + aVar.P());
        aVar.a(new MaxAdWaterfallInfoImpl(aVar, elapsedRealtime, this.f3434j));
        j.a((MaxAdListener) this.f3431g, (MaxAd) aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        com.applovin.impl.sdk.d.g T;
        com.applovin.impl.sdk.d.f fVar;
        if (maxError.getCode() == 204) {
            T = this.f4020b.T();
            fVar = com.applovin.impl.sdk.d.f.p;
        } else if (maxError.getCode() == -5001) {
            T = this.f4020b.T();
            fVar = com.applovin.impl.sdk.d.f.q;
        } else {
            T = this.f4020b.T();
            fVar = com.applovin.impl.sdk.d.f.r;
        }
        T.a(fVar);
        ArrayList arrayList = new ArrayList(this.f3434j.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f3434j) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            int i2 = 0;
            while (i2 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i2);
                i2++;
                sb.append(i2);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxNetworkResponseInfo2.getError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxNetworkResponseInfo2.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3433i;
        b("Waterfall failed in " + elapsedRealtime + "ms with error: " + maxError);
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f3429e, "waterfall_name", ""), JsonUtils.getString(this.f3429e, "waterfall_test_name", ""), elapsedRealtime, this.f3434j));
        j.a(this.f3431g, this.f3427c, maxError);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3433i = SystemClock.elapsedRealtime();
        if (this.f3429e.optBoolean("is_testing", false) && !this.f4020b.J().a() && a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.b.e.1
                @Override // java.lang.Runnable
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", (Context) e.this.f3432h.get());
                }
            });
        }
        if (this.f3430f.size() > 0) {
            StringBuilder y = e.a.d.a.a.y("Starting waterfall for ");
            y.append(this.f3430f.size());
            y.append(" ad(s)...");
            a(y.toString());
            this.f4020b.S().a(new a(0, this.f3430f));
            return;
        }
        c("No ads were returned from the server");
        Utils.maybeHandleNoFillResponseForPublisher(this.f3427c, this.f3428d, this.f3429e, this.f4020b);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f3429e, "settings", new JSONObject());
        long j2 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j2 <= 0) {
            a(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j2);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.b.e.2
            @Override // java.lang.Runnable
            public void run() {
                e.this.a(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            com.applovin.impl.sdk.utils.e.a(millis, this.f4020b, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }
}
