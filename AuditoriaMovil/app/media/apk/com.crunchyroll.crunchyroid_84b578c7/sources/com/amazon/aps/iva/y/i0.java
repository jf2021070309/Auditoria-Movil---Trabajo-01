package com.amazon.aps.iva.y;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.z.a1;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class i0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.f1.g0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p3<Float> h;
    public final /* synthetic */ p3<Float> i;
    public final /* synthetic */ p3<com.amazon.aps.iva.f1.b1> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p3 p3Var, a1.d dVar, a1.d dVar2) {
        super(1);
        this.h = p3Var;
        this.i = dVar;
        this.j = dVar2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.f1.g0 g0Var) {
        com.amazon.aps.iva.f1.g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$graphicsLayer");
        g0Var2.g(this.h.getValue().floatValue());
        p3<Float> p3Var = this.i;
        g0Var2.o(p3Var.getValue().floatValue());
        g0Var2.u(p3Var.getValue().floatValue());
        g0Var2.g0(this.j.getValue().a);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
