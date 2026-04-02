package com.amazon.aps.iva.fe;
/* compiled from: OtpPresenter.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "it");
        l lVar = this.h;
        l.q6(lVar).J();
        l.q6(lVar).o();
        l.q6(lVar).w();
        l.q6(lVar).h5();
        if (lVar.b.b) {
            lVar.f.c(th2.toString());
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
