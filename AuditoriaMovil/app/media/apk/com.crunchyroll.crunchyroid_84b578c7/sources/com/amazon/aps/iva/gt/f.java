package com.amazon.aps.iva.gt;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BentoUpsellModalPresenter.kt */
/* loaded from: classes2.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(0);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.getView().close();
        return q.a;
    }
}
