package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.aa;
import com.applovin.impl.sdk.ab;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
/* loaded from: classes.dex */
public class b implements ab.a {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final d f3395b;

    /* renamed from: c  reason: collision with root package name */
    private final ab f3396c;

    /* renamed from: d  reason: collision with root package name */
    private final aa f3397d;

    /* renamed from: e  reason: collision with root package name */
    private final a.InterfaceC0074a f3398e;

    public b(d dVar, a.InterfaceC0074a interfaceC0074a, m mVar) {
        this.a = mVar;
        this.f3395b = dVar;
        this.f3398e = interfaceC0074a;
        this.f3397d = new aa(dVar.w(), mVar);
        ab abVar = new ab(dVar.w(), mVar, this);
        this.f3396c = abVar;
        abVar.a(dVar);
        v B = mVar.B();
        B.b("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
    }

    private void a(long j2) {
        this.a.B().b("MaxNativeAdView", "Scheduling viewability impression for ad...");
        this.a.E().processViewabilityAdImpressionPostback(this.f3395b, j2, this.f3398e);
    }

    public void a() {
        this.f3396c.a();
        this.a.ak().b(this.f3395b);
        this.a.E().destroyAd(this.f3395b);
    }

    public void b() {
        if (this.f3395b.z().compareAndSet(false, true)) {
            this.a.B().b("MaxNativeAdView", "Scheduling impression for ad manually...");
            this.a.E().processRawAdImpressionPostback(this.f3395b, this.f3398e);
        }
    }

    @Override // com.applovin.impl.sdk.ab.a
    public void onLogVisibilityImpression() {
        a(this.f3397d.a(this.f3395b));
    }
}
