package com.amazon.aps.iva.lm;

import com.amazon.aps.iva.yb0.l;
/* compiled from: ManageProfileController.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.k5.a, h> {
    public final /* synthetic */ com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> h;
    public final /* synthetic */ com.amazon.aps.iva.dm.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> bVar, com.amazon.aps.iva.dm.a aVar) {
        super(1);
        this.h = bVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final h invoke(com.amazon.aps.iva.k5.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "$this$viewModel");
        return new h(this.h, this.i);
    }
}
