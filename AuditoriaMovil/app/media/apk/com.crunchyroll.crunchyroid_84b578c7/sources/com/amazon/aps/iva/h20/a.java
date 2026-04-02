package com.amazon.aps.iva.h20;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: CrPlusAlternativeFlowPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.b30.c>, q> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(1);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends com.amazon.aps.iva.b30.c> list) {
        this.h.getView().D3();
        return q.a;
    }
}
