package com.amazon.aps.iva.yg;

import com.amazon.aps.iva.es.r;
import com.amazon.aps.iva.ks.a;
/* compiled from: EmailVerificationAnalytics.kt */
/* loaded from: classes.dex */
public final class f implements e {
    public final com.amazon.aps.iva.us.a a;
    public final com.amazon.aps.iva.ds.a b;

    public f(com.amazon.aps.iva.us.a aVar, com.amazon.aps.iva.ds.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.amazon.aps.iva.yg.e
    public final void a(com.amazon.aps.iva.fs.b bVar) {
        this.b.e(new r(a.C0456a.c(this.a.b1(), bVar), 6));
    }

    @Override // com.amazon.aps.iva.yg.e
    public final void b() {
        this.b.e(new com.amazon.aps.iva.es.k(a.C0456a.c(this.a.b1(), null), com.amazon.aps.iva.js.h.POST_REGISTRATION));
    }

    @Override // com.amazon.aps.iva.yg.e
    public final void c() {
        this.b.e(new com.amazon.aps.iva.es.k(a.C0456a.c(this.a.b1(), null), com.amazon.aps.iva.js.h.REGISTRATION));
    }
}
