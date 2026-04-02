package com.amazon.aps.iva.qm;
/* compiled from: ProfileActivationPresenter.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(1);
        this.h = sVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        z view;
        com.amazon.aps.iva.yb0.j.f(th, "it");
        s sVar = this.h;
        view = sVar.getView();
        view.t3();
        sVar.getView().f4(com.amazon.aps.iva.bt.c.b);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
