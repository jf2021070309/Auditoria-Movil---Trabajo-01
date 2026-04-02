package com.amazon.aps.iva.so;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: WatchScreenAssetsPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.wo.g>, q> {
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(1);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.wo.g> list) {
        h view;
        h view2;
        h view3;
        h view4;
        List<? extends com.amazon.aps.iva.wo.g> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "assets");
        g gVar = this.h;
        view = gVar.getView();
        view.m();
        view2 = gVar.getView();
        view2.R(list2);
        if (gVar.c) {
            view3 = gVar.getView();
            view3.B6(gVar.d);
            view4 = gVar.getView();
            view4.Ec();
        }
        return q.a;
    }
}
