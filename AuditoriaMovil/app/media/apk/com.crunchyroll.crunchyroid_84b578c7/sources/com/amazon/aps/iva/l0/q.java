package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.o0.p3;
/* compiled from: SelectionMagnifier.kt */
/* loaded from: classes.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.c> {
    public final /* synthetic */ p3<com.amazon.aps.iva.e1.c> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.amazon.aps.iva.z.l lVar) {
        super(0);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.e1.c invoke() {
        return new com.amazon.aps.iva.e1.c(this.h.getValue().a);
    }
}
