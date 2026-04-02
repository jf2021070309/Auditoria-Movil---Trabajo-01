package com.amazon.aps.iva.i20;

import com.amazon.aps.iva.es.q;
import com.amazon.aps.iva.es.w;
import com.amazon.aps.iva.es.x;
import com.amazon.aps.iva.es.y;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.s;
import com.amazon.aps.iva.rs.p;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: CancellationRescueAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.fs.c b;
    public final com.amazon.aps.iva.ls.a c = com.amazon.aps.iva.ls.a.CANCELLATION_RESCUE;

    public b(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.fs.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.i20.a
    public final void a(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new q(a.C0456a.c(this.c, bVar), 0));
    }

    @Override // com.amazon.aps.iva.i20.a
    public final void b(com.amazon.aps.iva.fs.b bVar, String str) {
        this.a.e(new x(a.C0456a.c(this.c, bVar), new s("crunchyroll.google.premium.monthly", str)));
    }

    @Override // com.amazon.aps.iva.i20.a
    public final void c(p pVar) {
        j.f(pVar, FirebaseAnalytics.Event.PURCHASE);
        this.a.e(new w(new s(pVar.b, pVar.c)));
    }

    @Override // com.amazon.aps.iva.i20.a
    public final void d(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new y(a.C0456a.c(this.c, bVar), (com.amazon.aps.iva.ks.g) null, 2));
    }

    @Override // com.amazon.aps.iva.i20.a
    public final void e(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new x(a.C0456a.c(this.c, bVar), 6));
    }

    @Override // com.amazon.aps.iva.i20.a
    public final void f(String str, String str2) {
        j.f(str, "sku");
        j.f(str2, "skuTitle");
        this.a.c(new com.amazon.aps.iva.es.j(this.c, i.t(i.d, this.b.a(), null, null, null, null, 62), new s(str, str2)));
    }
}
