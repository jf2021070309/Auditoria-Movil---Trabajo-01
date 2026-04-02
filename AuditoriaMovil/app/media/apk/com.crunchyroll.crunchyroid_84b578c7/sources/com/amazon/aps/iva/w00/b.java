package com.amazon.aps.iva.w00;

import com.amazon.aps.iva.u00.q;
import com.amazon.aps.iva.wy.j;
/* compiled from: BulkDownloadButtonPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> {
    public final q b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, q qVar) {
        super(cVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(cVar, "view");
        this.b = qVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (this.b.isEnabled()) {
            getView().Bg();
        } else {
            getView().md();
        }
    }
}
