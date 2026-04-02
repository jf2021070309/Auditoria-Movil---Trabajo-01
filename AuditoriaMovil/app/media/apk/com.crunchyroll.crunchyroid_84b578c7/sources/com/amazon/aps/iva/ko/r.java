package com.amazon.aps.iva.ko;
/* compiled from: UserMigrationWelcomePresenter.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        s view;
        s view2;
        com.amazon.aps.iva.yb0.j.f(th, "it");
        o oVar = this.h;
        view = oVar.getView();
        view.b();
        view2 = oVar.getView();
        view2.showSnackbar(com.amazon.aps.iva.bt.c.b);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
