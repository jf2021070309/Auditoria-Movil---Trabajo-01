package com.amazon.aps.iva.yu;
/* compiled from: AddToCrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ q h;
    public final /* synthetic */ com.amazon.aps.iva.nv.e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, com.amazon.aps.iva.nv.e eVar) {
        super(1);
        this.h = qVar;
        this.i = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
        u view;
        com.amazon.aps.iva.yb0.j.f(qVar, "it");
        q qVar2 = this.h;
        view = qVar2.getView();
        view.F(new t(this.i.e));
        qVar2.c.closeScreen();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
