package com.amazon.aps.iva.kf;
/* compiled from: ConnectedAppsPresenter.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        v view;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "throwable");
        o oVar = this.h;
        view = oVar.getView();
        view.o();
        oVar.getView().Dd(new m(oVar));
        oVar.c.a(th2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
