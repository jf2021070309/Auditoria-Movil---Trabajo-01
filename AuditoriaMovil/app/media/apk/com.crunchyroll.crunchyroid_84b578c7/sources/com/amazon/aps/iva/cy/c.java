package com.amazon.aps.iva.cy;

import com.amazon.aps.iva.yb0.j;
/* compiled from: ArtistClickHandler.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final com.amazon.aps.iva.ws.d a;
    public final com.amazon.aps.iva.k50.d b;

    public c(com.amazon.aps.iva.ws.d dVar, com.amazon.aps.iva.k50.d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }

    @Override // com.amazon.aps.iva.cy.b
    public final void a(com.amazon.aps.iva.xx.b bVar, com.amazon.aps.iva.jt.a aVar) {
        j.f(bVar, "item");
        this.a.f(aVar, bVar.f, bVar.g, bVar.a, bVar.b);
        this.b.D1(new com.amazon.aps.iva.l50.a(bVar.a));
    }
}
