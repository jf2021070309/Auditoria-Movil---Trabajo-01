package com.amazon.aps.iva.j30;

import com.amazon.aps.iva.rs.m;
/* compiled from: UpsellV2ViewModel.kt */
/* loaded from: classes2.dex */
public final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c>, com.amazon.aps.iva.e30.a> {
    public final /* synthetic */ e0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var) {
        super(1);
        this.h = e0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.e30.a invoke(com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> dVar) {
        int i;
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> dVar2 = dVar;
        com.amazon.aps.iva.yb0.j.f(dVar2, "value");
        com.amazon.aps.iva.b30.c cVar = dVar2.b;
        int x = com.amazon.aps.iva.e.w.x(cVar.b);
        boolean z = cVar.i instanceof m.b;
        e0 e0Var = this.h;
        if (z) {
            i = e0Var.b.c;
        } else {
            i = e0Var.b.b;
        }
        return new com.amazon.aps.iva.e30.a(x, i);
    }
}
