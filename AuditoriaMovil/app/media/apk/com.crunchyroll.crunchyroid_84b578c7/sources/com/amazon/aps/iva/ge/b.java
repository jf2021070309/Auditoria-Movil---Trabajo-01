package com.amazon.aps.iva.ge;

import com.amazon.aps.iva.yb0.l;
/* compiled from: SignUpScreenController.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.k5.a, g> {
    public final /* synthetic */ com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final g invoke(com.amazon.aps.iva.k5.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "$this$viewModel");
        return new g(this.h);
    }
}
