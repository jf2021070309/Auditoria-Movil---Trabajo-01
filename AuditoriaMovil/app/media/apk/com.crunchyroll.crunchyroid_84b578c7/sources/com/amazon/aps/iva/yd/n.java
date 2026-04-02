package com.amazon.aps.iva.yd;
/* compiled from: EmailMandatoryPresenter.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.j<? extends String, ? extends Boolean>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar) {
        super(1);
        this.h = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.j<? extends String, ? extends Boolean> jVar) {
        com.amazon.aps.iva.kb0.j<? extends String, ? extends Boolean> jVar2 = jVar;
        com.amazon.aps.iva.yb0.j.f(jVar2, "result");
        boolean booleanValue = ((Boolean) jVar2.c).booleanValue();
        p pVar = this.h;
        pVar.e.c(booleanValue);
        pVar.f.invoke((String) jVar2.b);
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> a = pVar.d.a();
        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        a.k(new com.amazon.aps.iva.ez.d<>(qVar));
        p.q6(pVar).a0();
        return qVar;
    }
}
