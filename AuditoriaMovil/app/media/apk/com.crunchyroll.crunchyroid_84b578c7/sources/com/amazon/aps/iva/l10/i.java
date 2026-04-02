package com.amazon.aps.iva.l10;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: GenresListPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.m10.e>, q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.m10.e> list) {
        l view;
        l view2;
        List<? extends com.amazon.aps.iva.m10.e> list2 = list;
        k kVar = this.h;
        view = kVar.getView();
        view.v();
        view2 = kVar.getView();
        com.amazon.aps.iva.yb0.j.c(list2);
        view2.setGenres(list2);
        return q.a;
    }
}
