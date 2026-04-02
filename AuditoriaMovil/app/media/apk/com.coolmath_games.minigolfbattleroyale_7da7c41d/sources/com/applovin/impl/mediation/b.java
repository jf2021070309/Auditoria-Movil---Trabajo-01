package com.applovin.impl.mediation;

import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;
/* loaded from: classes.dex */
public class b implements a.InterfaceC0012a, c.a {
    private final a a;
    private final c b;
    private final MaxAdListener c;

    public b(k kVar, MaxAdListener maxAdListener) {
        this.c = maxAdListener;
        this.a = new a(kVar);
        this.b = new c(kVar, this);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0012a
    public void a(final com.applovin.impl.mediation.a.c cVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.c.onAdHidden(cVar);
            }
        }, cVar.t());
    }

    public void a(MaxAd maxAd) {
        this.b.a();
        this.a.a();
    }

    public void b(com.applovin.impl.mediation.a.c cVar) {
        long r = cVar.r();
        if (r >= 0) {
            this.b.a(cVar, r);
        }
        if (cVar.s()) {
            this.a.a(cVar, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void c(com.applovin.impl.mediation.a.c cVar) {
        this.c.onAdHidden(cVar);
    }
}
