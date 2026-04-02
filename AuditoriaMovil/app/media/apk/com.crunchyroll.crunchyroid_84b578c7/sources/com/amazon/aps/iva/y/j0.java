package com.amazon.aps.iva.y;

import com.amazon.aps.iva.o0.p3;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class j0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.f1.g0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p3<Float> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p3<Float> p3Var) {
        super(1);
        this.h = p3Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.f1.g0 g0Var) {
        com.amazon.aps.iva.f1.g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$graphicsLayer");
        g0Var2.g(this.h.getValue().floatValue());
        return com.amazon.aps.iva.kb0.q.a;
    }
}
