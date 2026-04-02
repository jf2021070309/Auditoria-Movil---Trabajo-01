package com.amazon.aps.iva.qm;
/* compiled from: ProfileActivationPresenter.kt */
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar) {
        super(1);
        this.h = sVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
        z view;
        z view2;
        z view3;
        com.amazon.aps.iva.yb0.j.f(qVar, "it");
        s sVar = this.h;
        view = sVar.getView();
        view.b();
        view2 = sVar.getView();
        view2.ja();
        view3 = sVar.getView();
        view3.finish();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
