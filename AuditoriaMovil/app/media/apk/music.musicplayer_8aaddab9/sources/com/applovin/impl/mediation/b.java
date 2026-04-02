package com.applovin.impl.mediation;

import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.m;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class b implements a.InterfaceC0072a, c.a {
    private final a a;

    /* renamed from: b  reason: collision with root package name */
    private final c f3399b;

    /* renamed from: c  reason: collision with root package name */
    private final MaxAdListener f3400c;

    public b(m mVar, MaxAdListener maxAdListener) {
        this.f3400c = maxAdListener;
        this.a = new a(mVar);
        this.f3399b = new c(mVar, this);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0072a
    public void a(final com.applovin.impl.mediation.a.c cVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.f3400c.onAdHidden(cVar);
            }
        }, cVar.y());
    }

    public void a(MaxAd maxAd) {
        this.f3399b.a();
        this.a.a();
    }

    public void b(com.applovin.impl.mediation.a.c cVar) {
        long w = cVar.w();
        if (w >= 0) {
            this.f3399b.a(cVar, w);
        }
        if (cVar.x()) {
            this.a.a(cVar, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void c(com.applovin.impl.mediation.a.c cVar) {
        this.f3400c.onAdHidden(cVar);
    }
}
