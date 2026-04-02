package com.amazon.aps.iva.ka0;

import com.amazon.aps.iva.q5.l0;
/* compiled from: MuxStatsSdkMedia3.kt */
/* loaded from: classes4.dex */
public final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<a> {
    public final /* synthetic */ c0<l0> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0<l0> c0Var) {
        super(0);
        this.h = c0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final a invoke() {
        c0<l0> c0Var = this.h;
        y yVar = c0Var.f;
        com.amazon.aps.iva.yb0.j.f(yVar, "collector");
        com.amazon.aps.iva.da0.c cVar = c0Var.c;
        com.amazon.aps.iva.yb0.j.f(cVar, "eventBus");
        return new a(yVar, cVar);
    }
}
