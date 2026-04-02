package com.amazon.aps.iva.kf;

import java.util.List;
/* compiled from: ConnectedAppsPresenter.kt */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends c0>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends c0> list) {
        v view;
        v view2;
        v view3;
        List<? extends c0> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "apps");
        o oVar = this.h;
        view = oVar.getView();
        view.o();
        view2 = oVar.getView();
        view2.t5();
        view3 = oVar.getView();
        view3.v9(list2);
        oVar.c.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
