package com.amazon.aps.iva.mh;
/* compiled from: LegalInfoPresenter.kt */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.wy.h> implements j {
    public final e b;
    public final h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, i iVar, com.amazon.aps.iva.wy.h hVar) {
        super(hVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(hVar, "view");
        this.b = fVar;
        this.c = iVar;
    }

    @Override // com.amazon.aps.iva.mh.j
    public final void C1(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        this.c.a(bVar);
        this.b.b();
    }

    @Override // com.amazon.aps.iva.mh.j
    public final void w5(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        this.c.b(bVar);
        this.b.a();
    }
}
