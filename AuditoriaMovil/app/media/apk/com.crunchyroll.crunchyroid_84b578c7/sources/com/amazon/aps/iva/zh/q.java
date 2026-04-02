package com.amazon.aps.iva.zh;
/* compiled from: ArtistPresenter.kt */
/* loaded from: classes.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ m h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar) {
        super(1);
        this.h = mVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        m mVar = this.h;
        m.q6(mVar).N();
        m.q6(mVar).X0(new p(mVar));
        mVar.h.a(th2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
