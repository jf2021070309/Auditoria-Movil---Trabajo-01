package com.amazon.aps.iva.qo;
/* compiled from: WatchScreenPresenter.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(l lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(g gVar) {
        g gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "data");
        l lVar = this.h;
        h hVar = new h(new r(lVar, gVar2), new q(lVar));
        v q6 = l.q6(lVar);
        com.amazon.aps.iva.no.b bVar = gVar2.b;
        q6.a2(hVar.a(bVar.a));
        lVar.getView().b();
        lVar.r6(bVar.a.getId());
        lVar.e.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
