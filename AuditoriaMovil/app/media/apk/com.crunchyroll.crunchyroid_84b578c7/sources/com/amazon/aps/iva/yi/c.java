package com.amazon.aps.iva.yi;

import com.amazon.aps.iva.es.z;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.u;
/* compiled from: OnboardingV2Analytics.kt */
/* loaded from: classes.dex */
public final class c implements b {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.fs.c b;

    public c(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.fs.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.yi.b
    public final void a() {
        this.a.c(defpackage.i.s(com.amazon.aps.iva.ls.a.ONBOARDING, this.b.a(), null, null, null, new com.amazon.aps.iva.is.a[0], 28));
    }

    @Override // com.amazon.aps.iva.yi.b
    public final void b(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "analyticsView");
        this.a.e(new com.amazon.aps.iva.es.h(a.C0456a.c(com.amazon.aps.iva.ls.a.ONBOARDING, bVar), null));
    }

    @Override // com.amazon.aps.iva.yi.b
    public final void c(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new z(a.C0456a.c(com.amazon.aps.iva.ls.a.ONBOARDING, bVar), new u(l0.SUBSCRIPTION), (com.amazon.aps.iva.ks.g) null, com.amazon.aps.iva.js.i.CR_VOD_ACQUISITION, 12));
    }

    @Override // com.amazon.aps.iva.yi.b
    public final void d(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new com.amazon.aps.iva.es.k(a.C0456a.c(com.amazon.aps.iva.ls.a.ONBOARDING, bVar), (com.amazon.aps.iva.ks.g) null));
    }
}
