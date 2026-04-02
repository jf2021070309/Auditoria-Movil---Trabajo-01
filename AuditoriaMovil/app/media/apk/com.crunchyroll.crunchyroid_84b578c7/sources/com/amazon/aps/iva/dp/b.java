package com.amazon.aps.iva.dp;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WatchScreenLayoutPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        d view;
        view = this.h.getView();
        view.o0();
        return q.a;
    }
}
