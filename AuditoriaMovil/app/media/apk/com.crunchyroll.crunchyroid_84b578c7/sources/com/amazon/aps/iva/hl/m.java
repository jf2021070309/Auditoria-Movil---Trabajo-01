package com.amazon.aps.iva.hl;
/* compiled from: PlayerRestrictionOverlay.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ t h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar) {
        super(1);
        this.h = tVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.fs.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "analyticsView");
        this.h.j(bVar2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
