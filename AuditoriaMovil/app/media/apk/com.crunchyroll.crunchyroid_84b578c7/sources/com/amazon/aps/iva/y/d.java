package com.amazon.aps.iva.y;
/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.s1.f0, com.amazon.aps.iva.s1.c0, com.amazon.aps.iva.o2.a, com.amazon.aps.iva.s1.e0> {
    public final /* synthetic */ e0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e0 e0Var) {
        super(3);
        this.h = e0Var;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.s1.e0 invoke(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, com.amazon.aps.iva.o2.a aVar) {
        com.amazon.aps.iva.s1.f0 f0Var2 = f0Var;
        com.amazon.aps.iva.s1.c0 c0Var2 = c0Var;
        long j = aVar.a;
        com.amazon.aps.iva.yb0.j.f(f0Var2, "$this$layout");
        com.amazon.aps.iva.yb0.j.f(c0Var2, "measurable");
        com.amazon.aps.iva.s1.u0 V = c0Var2.V(j);
        return f0Var2.F0(V.b, V.c, com.amazon.aps.iva.lb0.a0.b, new c(V, this.h));
    }
}
