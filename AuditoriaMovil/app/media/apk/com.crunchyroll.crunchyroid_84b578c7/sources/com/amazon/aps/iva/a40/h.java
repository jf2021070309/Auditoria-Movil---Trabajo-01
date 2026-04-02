package com.amazon.aps.iva.a40;

import com.amazon.aps.iva.kb0.q;
/* compiled from: ChangePasswordPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<q, q> {
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(1);
        this.h = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(q qVar) {
        m view;
        m view2;
        m view3;
        m view4;
        m view5;
        com.amazon.aps.iva.yb0.j.f(qVar, "it");
        j jVar = this.h;
        view = jVar.getView();
        view.b();
        view2 = jVar.getView();
        view2.showSnackbar(e.b);
        jVar.b.j();
        view3 = jVar.getView();
        if (view3.E()) {
            view5 = jVar.getView();
            view5.M3();
        } else {
            view4 = jVar.getView();
            view4.closeScreen();
        }
        return q.a;
    }
}
