package com.amazon.aps.iva.x30;

import java.util.List;
/* compiled from: SearchResultSummaryPresenter.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.s30.h>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ t h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar) {
        super(1);
        this.h = tVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.s30.h> list) {
        List<? extends com.amazon.aps.iva.s30.h> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "results");
        boolean isEmpty = list2.isEmpty();
        t tVar = this.h;
        if (isEmpty) {
            tVar.getView().Ca();
        } else {
            tVar.getView().Me(list2);
        }
        tVar.f.c();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
