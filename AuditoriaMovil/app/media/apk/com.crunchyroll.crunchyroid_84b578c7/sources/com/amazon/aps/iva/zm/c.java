package com.amazon.aps.iva.zm;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WelcomeScreenController.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.k5.a, i> {
    public final /* synthetic */ com.amazon.aps.iva.dm.a h;
    public final /* synthetic */ com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.ui.b bVar, com.amazon.aps.iva.dm.a aVar) {
        super(1);
        this.h = aVar;
        this.i = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final i invoke(com.amazon.aps.iva.k5.a aVar) {
        j.f(aVar, "$this$viewModel");
        return new i(this.i, this.h);
    }
}
