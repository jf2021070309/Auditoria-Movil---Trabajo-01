package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.rc0.g0;
/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes4.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<k> {
    public final /* synthetic */ g h;
    public final /* synthetic */ com.amazon.aps.iva.de0.l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, com.amazon.aps.iva.de0.c cVar) {
        super(0);
        this.h = gVar;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final k invoke() {
        g gVar = this.h;
        g0 l = gVar.l();
        com.amazon.aps.iva.yb0.j.e(l, "builtInsModule");
        return new k(l, this.i, new h(gVar));
    }
}
