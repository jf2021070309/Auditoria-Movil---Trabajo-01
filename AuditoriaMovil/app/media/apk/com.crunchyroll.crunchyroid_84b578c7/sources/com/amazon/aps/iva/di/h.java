package com.amazon.aps.iva.di;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: FeaturedMusicPresenter.kt */
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.ei.i>, q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.ei.i> list) {
        List<? extends com.amazon.aps.iva.ei.i> list2 = list;
        k kVar = this.h;
        kVar.getView().jc();
        com.amazon.aps.iva.yb0.j.c(list2);
        kVar.getView().Qc(list2);
        return q.a;
    }
}
