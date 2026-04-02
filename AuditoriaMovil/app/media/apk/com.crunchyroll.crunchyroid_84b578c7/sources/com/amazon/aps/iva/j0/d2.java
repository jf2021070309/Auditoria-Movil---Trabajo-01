package com.amazon.aps.iva.j0;
/* compiled from: TextFieldPressGestureFilter.kt */
/* loaded from: classes.dex */
public final class d2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
    public final /* synthetic */ com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> h;
    public final /* synthetic */ com.amazon.aps.iva.c0.l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.c0.o> q1Var, com.amazon.aps.iva.c0.l lVar) {
        super(1);
        this.h = q1Var;
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
        com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
        return new c2(this.h, this.i);
    }
}
