package com.amazon.aps.iva.p50;

import java.util.List;
/* compiled from: ShowRatingDialogPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<n, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(n nVar) {
        o view;
        o view2;
        o view3;
        o view4;
        o view5;
        n nVar2 = nVar;
        com.amazon.aps.iva.yb0.j.f(nVar2, "dialogUiModel");
        k kVar = this.h;
        view = kVar.getView();
        view.b();
        view2 = kVar.getView();
        List<Integer> list = nVar2.a;
        view2.Y3(list.size(), nVar2.b, nVar2.c);
        view3 = kVar.getView();
        int i = nVar2.d;
        view3.p4(i, list);
        view4 = kVar.getView();
        view4.V8(kVar.c.a(i));
        if (!kVar.b.b()) {
            view5 = kVar.getView();
            view5.C5(i);
        }
        kVar.d.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
