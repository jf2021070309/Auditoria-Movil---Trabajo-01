package com.amazon.aps.iva.z;
/* compiled from: Transition.kt */
/* loaded from: classes.dex */
public final class c1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
    public final /* synthetic */ a1<Object> h;
    public final /* synthetic */ a1<Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(a1<Object> a1Var, a1<Object> a1Var2) {
        super(1);
        this.h = a1Var;
        this.i = a1Var2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
        com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
        a1<Object> a1Var = this.h;
        a1Var.getClass();
        a1<?> a1Var2 = this.i;
        com.amazon.aps.iva.yb0.j.f(a1Var2, "transition");
        a1Var.i.add(a1Var2);
        return new b1(a1Var, a1Var2);
    }
}
