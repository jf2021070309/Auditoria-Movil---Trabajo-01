package com.amazon.aps.iva.b50;
/* compiled from: WatchlistPresenter.kt */
/* loaded from: classes2.dex */
public final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ z h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(z zVar) {
        super(1);
        this.h = zVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        z zVar = this.h;
        zVar.getView().ob();
        zVar.getView().c();
        zVar.b.F(th2);
        zVar.r6(null, com.amazon.aps.iva.lb0.z.b);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
