package com.amazon.aps.iva.bj;

import com.amazon.aps.iva.es.r;
import com.amazon.aps.iva.ks.a;
/* compiled from: AccountPendingStateAnalytics.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final com.amazon.aps.iva.us.a a;
    public final com.amazon.aps.iva.ds.a b;

    public b(com.amazon.aps.iva.us.a aVar, com.amazon.aps.iva.ds.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar, "screenProvider");
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.amazon.aps.iva.bj.a
    public final void a(com.amazon.aps.iva.fs.b bVar) {
        this.b.e(new r(a.C0456a.c(this.a.b1(), bVar), 6));
    }

    @Override // com.amazon.aps.iva.bj.a
    public final void b() {
        this.b.c(new com.amazon.aps.iva.es.j(com.amazon.aps.iva.ls.a.EMAIL_VERIFICATION_MODAL, new com.amazon.aps.iva.is.a[0]));
    }
}
