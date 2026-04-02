package com.amazon.aps.iva.kf;
/* compiled from: ConnectedAppsPresenter.kt */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(c0 c0Var) {
        v view;
        v view2;
        c0 c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "uiModel");
        o oVar = this.h;
        view = oVar.getView();
        view.o();
        view2 = oVar.getView();
        view2.showSnackbar(new com.amazon.aps.iva.bt.e(c0Var2.j, null, new String[0], 2, null));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
