package com.amazon.aps.iva.mh;

import com.amazon.aps.iva.ks.a;
/* compiled from: LegalInfoAnalytics.kt */
/* loaded from: classes.dex */
public final class i implements h {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.ls.a b;

    public i(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.ls.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar, "analytics");
        com.amazon.aps.iva.yb0.j.f(aVar2, "screen");
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.amazon.aps.iva.mh.h
    public final void a(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        this.a.e(new com.amazon.aps.iva.es.k(a.C0456a.c(this.b, bVar), 8));
    }

    @Override // com.amazon.aps.iva.mh.h
    public final void b(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        this.a.e(new com.amazon.aps.iva.es.j(a.C0456a.c(this.b, bVar), 4));
    }
}
