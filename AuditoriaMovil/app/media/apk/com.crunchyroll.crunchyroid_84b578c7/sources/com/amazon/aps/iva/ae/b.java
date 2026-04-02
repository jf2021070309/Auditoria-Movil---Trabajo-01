package com.amazon.aps.iva.ae;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: LogInScreenController.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.k5.a, f> {
    public final /* synthetic */ com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final f invoke(com.amazon.aps.iva.k5.a aVar) {
        j.f(aVar, "$this$viewModel");
        return new f(this.h);
    }
}
