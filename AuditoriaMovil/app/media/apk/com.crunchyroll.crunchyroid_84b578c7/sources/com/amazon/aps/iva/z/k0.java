package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.h0;
/* compiled from: InfiniteTransition.kt */
/* loaded from: classes.dex */
public final class k0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
    public final /* synthetic */ h0 h;
    public final /* synthetic */ h0.a<Object, Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(h0 h0Var, h0.a<Object, Object> aVar) {
        super(1);
        this.h = h0Var;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
        com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
        h0 h0Var = this.h;
        h0Var.getClass();
        h0.a<Object, Object> aVar = this.i;
        com.amazon.aps.iva.yb0.j.f(aVar, "animation");
        h0Var.a.b(aVar);
        h0Var.b.setValue(Boolean.TRUE);
        return new j0(h0Var, aVar);
    }
}
