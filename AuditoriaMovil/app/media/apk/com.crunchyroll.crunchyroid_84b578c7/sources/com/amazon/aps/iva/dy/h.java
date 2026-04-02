package com.amazon.aps.iva.dy;

import com.amazon.aps.iva.xx.n;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MusicCardClickHandler.kt */
/* loaded from: classes2.dex */
public final class h implements g {
    public final com.amazon.aps.iva.ws.d a;
    public final com.amazon.aps.iva.k50.d b;

    public h(com.amazon.aps.iva.ws.d dVar, com.amazon.aps.iva.k50.d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }

    @Override // com.amazon.aps.iva.dy.g
    public final void a(com.amazon.aps.iva.jt.a aVar, n nVar) {
        j.f(aVar, "analyticsData");
        j.f(nVar, "item");
        this.a.a(aVar, nVar.k, nVar.l, nVar.a, nVar.c, nVar.j, nVar.d);
        this.b.C1(new com.amazon.aps.iva.l50.c(nVar.a, nVar.j));
    }
}
