package com.amazon.aps.iva.yd;
/* compiled from: EmailMandatoryPresenter.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar) {
        super(1);
        this.h = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "throwable");
        p pVar = this.h;
        pVar.e.g(th2.toString());
        p.q6(pVar).J();
        p.q6(pVar).o();
        p.q6(pVar).w();
        p.q6(pVar).c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
