package com.amazon.aps.iva.so;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: WatchScreenAssetsPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.wo.g>, q> {
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar) {
        super(1);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.wo.g> list) {
        h view;
        h view2;
        h view3;
        List<? extends com.amazon.aps.iva.wo.g> list2 = list;
        g gVar = this.h;
        view = gVar.getView();
        view.m();
        view2 = gVar.getView();
        view2.Od();
        view3 = gVar.getView();
        com.amazon.aps.iva.yb0.j.c(list2);
        view3.R(list2);
        return q.a;
    }
}
