package com.amazon.aps.iva.z;
/* compiled from: Transition.kt */
/* loaded from: classes.dex */
public final class e1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
    public final /* synthetic */ a1<Object> h;
    public final /* synthetic */ a1<Object>.a<Object, Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(a1<Object> a1Var, a1<Object>.a<Object, Object> aVar) {
        super(1);
        this.h = a1Var;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
        com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
        return new d1(this.h, this.i);
    }
}
