package com.applovin.impl.mediation;

import android.content.Context;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.b.b;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
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
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, b> f3449b = new HashMap(4);

    /* renamed from: c  reason: collision with root package name */
    private final Object f3450c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.a.a> f3451d = new HashMap(4);

    /* renamed from: e  reason: collision with root package name */
    private final Object f3452e = new Object();

    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0074a {
        private final m a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f3459b;

        /* renamed from: c  reason: collision with root package name */
        private final d f3460c;

        /* renamed from: d  reason: collision with root package name */
        private final b f3461d;

        /* renamed from: e  reason: collision with root package name */
        private final MaxAdFormat f3462e;

        /* renamed from: f  reason: collision with root package name */
        private final Map<String, Object> f3463f;

        /* renamed from: g  reason: collision with root package name */
        private i f3464g;

        private a(Map<String, Object> map, i iVar, b bVar, MaxAdFormat maxAdFormat, d dVar, m mVar, Context context) {
            this.a = mVar;
            this.f3459b = context;
            this.f3460c = dVar;
            this.f3461d = bVar;
            this.f3462e = maxAdFormat;
            this.f3464g = iVar;
            this.f3463f = map;
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
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            if (this.a.a(com.applovin.impl.sdk.c.a.T, this.f3462e) && this.f3461d.f3468c < ((Integer) this.a.a(com.applovin.impl.sdk.c.a.S)).intValue()) {
                b.e(this.f3461d);
                final int pow = (int) Math.pow(2.0d, this.f3461d.f3468c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.d.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a aVar = a.this;
                        aVar.f3464g = new i.a(aVar.f3464g).a("retry_delay_sec", String.valueOf(pow)).a("retry_attempt", String.valueOf(a.this.f3461d.f3468c)).a();
                        a.this.f3460c.a(str, a.this.f3462e, a.this.f3463f, a.this.f3464g, a.this.f3459b, a.this);
                    }
                }, TimeUnit.SECONDS.toMillis(pow));
                return;
            }
            this.f3461d.f3468c = 0;
            this.f3461d.f3467b.set(false);
            if (this.f3461d.f3469d != null) {
                ((MaxErrorImpl) maxError).setLoadTag(this.f3461d.a);
                j.a(this.f3461d.f3469d, str, maxError);
                this.f3461d.f3469d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            aVar.a(this.f3461d.a);
            this.f3461d.f3468c = 0;
            if (this.f3461d.f3469d != null) {
                aVar.g().e().a(this.f3461d.f3469d);
                this.f3461d.f3469d.onAdLoaded(aVar);
                if (aVar.d().endsWith("load")) {
                    this.f3461d.f3469d.onAdRevenuePaid(aVar);
                }
                this.f3461d.f3469d = null;
                if ((this.a.b(com.applovin.impl.sdk.c.a.R).contains(maxAd.getAdUnitId()) || this.a.a(com.applovin.impl.sdk.c.a.Q, maxAd.getFormat())) && !this.a.J().a() && !this.a.J().b()) {
                    this.f3460c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f3463f, this.f3464g, this.f3459b, this);
                    return;
                }
            } else {
                this.f3460c.a(aVar);
            }
            this.f3461d.f3467b.set(false);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        private final String a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f3467b;

        /* renamed from: c  reason: collision with root package name */
        private int f3468c;

        /* renamed from: d  reason: collision with root package name */
        private volatile a.InterfaceC0074a f3469d;

        private b(String str) {
            this.f3467b = new AtomicBoolean();
            this.a = str;
        }

        public static /* synthetic */ int e(b bVar) {
            int i2 = bVar.f3468c;
            bVar.f3468c = i2 + 1;
            return i2;
        }
    }

    public d(m mVar) {
        this.a = mVar;
    }

    private com.applovin.impl.mediation.a.a a(String str) {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.f3452e) {
            aVar = this.f3451d.get(str);
            this.f3451d.remove(str);
        }
        return aVar;
    }

    private b a(String str, String str2) {
        String str3;
        b bVar;
        synchronized (this.f3450c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (StringUtils.isValidString(str2)) {
                str3 = "-" + str2;
            } else {
                str3 = "";
            }
            sb.append(str3);
            String sb2 = sb.toString();
            bVar = this.f3449b.get(sb2);
            if (bVar == null) {
                bVar = new b(str2);
                this.f3449b.put(sb2, bVar);
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f3452e) {
            if (this.f3451d.containsKey(aVar.getAdUnitId())) {
                v.i("AppLovinSdk", "Ad in cache already: " + aVar.getAdUnitId());
            }
            this.f3451d.put(aVar.getAdUnitId(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final MaxAdFormat maxAdFormat, final Map<String, Object> map, final i iVar, final Context context, final a.InterfaceC0074a interfaceC0074a) {
        this.a.S().a(new com.applovin.impl.mediation.b.b(maxAdFormat, map, context, this.a, new b.a() { // from class: com.applovin.impl.mediation.d.1
            @Override // com.applovin.impl.mediation.b.b.a
            public void a(JSONArray jSONArray) {
                d.this.a.S().a(new com.applovin.impl.mediation.b.c(str, maxAdFormat, map, iVar, jSONArray, context, d.this.a, interfaceC0074a));
            }
        }), com.applovin.impl.mediation.c.c.a(maxAdFormat));
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, Map<String, Object> map, i iVar, Context context, a.InterfaceC0074a interfaceC0074a) {
        com.applovin.impl.mediation.a.a a2 = (this.a.J().b() || Utils.isDspDemoApp(this.a.L())) ? null : a(str);
        if (a2 != null) {
            a2.a(str2);
            a2.g().e().a(interfaceC0074a);
            interfaceC0074a.onAdLoaded(a2);
            if (a2.d().endsWith("load")) {
                interfaceC0074a.onAdRevenuePaid(a2);
            }
        }
        b a3 = a(str, str2);
        if (a3.f3467b.compareAndSet(false, true)) {
            if (a2 == null) {
                a3.f3469d = interfaceC0074a;
            }
            a(str, maxAdFormat, map, iVar, context, new a(map, iVar, a3, maxAdFormat, this, this.a, context));
            return;
        }
        if (a3.f3469d != null && a3.f3469d != interfaceC0074a) {
            v.h("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        a3.f3469d = interfaceC0074a;
    }
}
