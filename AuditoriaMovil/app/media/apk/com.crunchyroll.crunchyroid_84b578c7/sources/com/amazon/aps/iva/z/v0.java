package com.amazon.aps.iva.z;
/* compiled from: SuspendAnimation.kt */
/* loaded from: classes.dex */
public final class v0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<i<Object, Object>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<Object, Object, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ l1<Object, Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.amazon.aps.iva.xb0.p pVar, m1 m1Var) {
        super(1);
        this.h = pVar;
        this.i = m1Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(i<Object, Object> iVar) {
        i<Object, Object> iVar2 = iVar;
        com.amazon.aps.iva.yb0.j.f(iVar2, "$this$animate");
        this.h.invoke(iVar2.a(), this.i.b().invoke(iVar2.f));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
