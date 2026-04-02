package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.o0.p3;
/* compiled from: Magnifier.kt */
/* loaded from: classes.dex */
public final class b1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ p3<com.amazon.aps.iva.e1.c> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p3<com.amazon.aps.iva.e1.c> p3Var) {
        super(0);
        this.h = p3Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        return Boolean.valueOf(com.amazon.aps.iva.e1.d.h(this.h.getValue().a));
    }
}
