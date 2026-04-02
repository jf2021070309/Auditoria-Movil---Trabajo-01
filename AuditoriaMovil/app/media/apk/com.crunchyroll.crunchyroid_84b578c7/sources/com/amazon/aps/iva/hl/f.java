package com.amazon.aps.iva.hl;
/* compiled from: PlayerRestrictionOverlay.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.dj.f h;
    public final /* synthetic */ com.amazon.aps.iva.xh.b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.amazon.aps.iva.dj.f fVar, com.amazon.aps.iva.xh.b bVar) {
        super(1);
        this.h = fVar;
        this.i = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.fs.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "clickedView");
        com.amazon.aps.iva.dj.f fVar = this.h;
        fVar.b().c(bVar2);
        fVar.a().a(bVar2);
        this.i.a(null);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
