package com.amazon.aps.iva.qv;
/* compiled from: ModifyCrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ r h;
    public final /* synthetic */ com.amazon.aps.iva.nv.e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, com.amazon.aps.iva.nv.e eVar) {
        super(1);
        this.h = rVar;
        this.i = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
        x view;
        com.amazon.aps.iva.yb0.j.f(qVar, "it");
        r rVar = this.h;
        view = rVar.getView();
        view.F(new com.amazon.aps.iva.yu.t(this.i.e));
        rVar.e.b();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
