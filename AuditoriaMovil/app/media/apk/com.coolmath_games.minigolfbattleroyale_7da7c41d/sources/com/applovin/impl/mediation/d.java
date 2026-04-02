package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.b.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.r;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class d {
    private final k a;
    private final Map<String, b> b = new HashMap(4);
    private final Object c = new Object();
    private final Map<String, com.applovin.impl.mediation.a.a> d = new HashMap(4);
    private final Object e = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0014a {
        private final k a;
        private final Activity b;
        private final d c;
        private final b d;
        private final MaxAdFormat e;
        private i f;

        private a(i iVar, b bVar, MaxAdFormat maxAdFormat, d dVar, k kVar, Activity activity) {
            this.a = kVar;
            this.b = activity;
            this.c = dVar;
            this.d = bVar;
            this.e = maxAdFormat;
            this.f = iVar;
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            if (this.a.a(com.applovin.impl.sdk.c.a.Q, this.e) && this.d.b < ((Integer) this.a.a(com.applovin.impl.sdk.c.a.P)).intValue()) {
                b.d(this.d);
                final int pow = (int) Math.pow(2.0d, this.d.b);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.d.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f = new i.a(a.this.f).a("retry_delay_sec", String.valueOf(pow)).a("retry_attempt", String.valueOf(a.this.d.b)).a();
                        a.this.c.b(str, a.this.e, a.this.f, a.this.b, a.this);
                    }
                }, TimeUnit.SECONDS.toMillis(pow));
                return;
            }
            this.d.b = 0;
            this.d.a.set(false);
            if (this.d.c != null) {
                com.applovin.impl.sdk.utils.i.a(this.d.c, str, maxError);
                this.d.c = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            this.d.b = 0;
            if (this.d.c != null) {
                aVar.f().c().a(this.d.c);
                this.d.c.onAdLoaded(aVar);
                if (aVar.c().endsWith("load")) {
                    this.d.c.onAdRevenuePaid(aVar);
                }
                this.d.c = null;
                if ((this.a.b(com.applovin.impl.sdk.c.a.O).contains(maxAd.getAdUnitId()) || this.a.a(com.applovin.impl.sdk.c.a.N, maxAd.getFormat())) && !this.a.H().a() && !this.a.H().b()) {
                    this.c.b(maxAd.getAdUnitId(), maxAd.getFormat(), this.f, this.b, this);
                    return;
                }
            } else {
                this.c.a(aVar);
            }
            this.d.a.set(false);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        private final AtomicBoolean a;
        private int b;
        private volatile a.InterfaceC0014a c;

        private b() {
            this.a = new AtomicBoolean();
        }

        static /* synthetic */ int d(b bVar) {
            int i = bVar.b;
            bVar.b = i + 1;
            return i;
        }
    }

    public d(k kVar) {
        this.a = kVar;
    }

    private com.applovin.impl.mediation.a.a a(String str) {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.e) {
            aVar = this.d.get(str);
            this.d.remove(str);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.e) {
            if (this.d.containsKey(aVar.getAdUnitId())) {
                r.i("AppLovinSdk", "Ad in cache already: " + aVar.getAdUnitId());
            }
            this.d.put(aVar.getAdUnitId(), aVar);
        }
    }

    private b b(String str) {
        b bVar;
        synchronized (this.c) {
            bVar = this.b.get(str);
            if (bVar == null) {
                bVar = new b();
                this.b.put(str, bVar);
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final MaxAdFormat maxAdFormat, final i iVar, final Activity activity, final a.InterfaceC0014a interfaceC0014a) {
        this.a.Q().a(new com.applovin.impl.mediation.b.b(maxAdFormat, activity, this.a, new b.a() { // from class: com.applovin.impl.mediation.d.1
            @Override // com.applovin.impl.mediation.b.b.a
            public void a(JSONArray jSONArray) {
                d.this.a.Q().a(new com.applovin.impl.mediation.b.c(str, maxAdFormat, iVar, jSONArray, activity, d.this.a, interfaceC0014a));
            }
        }), com.applovin.impl.mediation.c.c.a(maxAdFormat));
    }

    public void a(String str, MaxAdFormat maxAdFormat, i iVar, Activity activity, a.InterfaceC0014a interfaceC0014a) {
        com.applovin.impl.mediation.a.a a2 = !this.a.H().b() ? a(str) : null;
        if (a2 != null) {
            a2.f().c().a(interfaceC0014a);
            interfaceC0014a.onAdLoaded(a2);
            if (a2.c().endsWith("load")) {
                interfaceC0014a.onAdRevenuePaid(a2);
            }
        }
        b b2 = b(str);
        if (b2.a.compareAndSet(false, true)) {
            if (a2 == null) {
                b2.c = interfaceC0014a;
            }
            b(str, maxAdFormat, iVar, activity, new a(iVar, b2, maxAdFormat, this, this.a, activity));
            return;
        }
        if (b2.c != null && b2.c != interfaceC0014a) {
            r.h("MaxInterstitialAd", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        b2.c = interfaceC0014a;
    }
}
