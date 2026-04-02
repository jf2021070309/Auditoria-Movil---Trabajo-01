package com.amazon.aps.iva.y;
/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o0.v0, com.amazon.aps.iva.o0.u0> {
    public final /* synthetic */ com.amazon.aps.iva.y0.u<Object> h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ r<Object> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.y0.u<Object> uVar, Object obj, r<Object> rVar) {
        super(1);
        this.h = uVar;
        this.i = obj;
        this.j = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.o0.u0 invoke(com.amazon.aps.iva.o0.v0 v0Var) {
        com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
        return new f(this.h, this.i, this.j);
    }
}
