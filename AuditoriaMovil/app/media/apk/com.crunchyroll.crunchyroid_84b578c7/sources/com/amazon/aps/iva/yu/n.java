package com.amazon.aps.iva.yu;

import java.util.List;
/* compiled from: AddToCrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ q h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar) {
        super(1);
        this.h = qVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(x xVar) {
        u view;
        u view2;
        x xVar2 = xVar;
        com.amazon.aps.iva.yb0.j.f(xVar2, "data");
        q qVar = this.h;
        view = qVar.getView();
        view.o();
        view2 = qVar.getView();
        view2.x0();
        List<com.amazon.aps.iva.nv.b> list = xVar2.a;
        if (list.isEmpty()) {
            qVar.getView().h();
        } else {
            qVar.getView().i();
            int size = list.size();
            int i = xVar2.b;
            if (size == i) {
                qVar.getView().wh();
                qVar.getView().d1(list.size(), i);
            } else {
                qVar.getView().B4();
            }
            qVar.getView().T1(list);
        }
        qVar.d.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
