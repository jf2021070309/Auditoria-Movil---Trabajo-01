package com.amazon.aps.iva.d50;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: FavoriteTogglePresenter.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(0);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        c cVar = this.h;
        cVar.c.Y(cVar.q6());
        cVar.getView().setEnabled(true);
        return q.a;
    }
}
