package com.amazon.aps.iva.s50;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ShowRatingPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<f, q> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar) {
        super(1);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(f fVar) {
        e eVar = this.h;
        eVar.getView().Oc();
        eVar.r6();
        eVar.getView().wd("-");
        eVar.getView().Tc(eVar.c.b(0L));
        return q.a;
    }
}
