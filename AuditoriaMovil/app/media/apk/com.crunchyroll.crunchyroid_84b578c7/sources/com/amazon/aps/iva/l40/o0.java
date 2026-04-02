package com.amazon.aps.iva.l40;
/* compiled from: ShowPagePresenter.kt */
/* loaded from: classes2.dex */
public final class o0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o00.e, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(v vVar) {
        super(1);
        this.h = vVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o00.e eVar) {
        com.amazon.aps.iva.o00.e eVar2 = eVar;
        com.amazon.aps.iva.yb0.j.f(eVar2, "upNext");
        v vVar = this.h;
        v.q6(vVar).w();
        vVar.getView().c6(new n0(vVar, eVar2));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
