package com.amazon.aps.iva.vm;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SwitchProfileScreenController.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.k5.a, e> {
    public final /* synthetic */ com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> h;
    public final /* synthetic */ com.amazon.aps.iva.dm.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> bVar, com.amazon.aps.iva.dm.a aVar) {
        super(1);
        this.h = bVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final e invoke(com.amazon.aps.iva.k5.a aVar) {
        j.f(aVar, "$this$viewModel");
        return new e(this.h, this.i);
    }
}
