package com.amazon.aps.iva.a0;
/* compiled from: ProgressSemantics.kt */
/* loaded from: classes.dex */
public final class u1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ float h;
    public final /* synthetic */ com.amazon.aps.iva.ec0.f<Float> i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(float f, com.amazon.aps.iva.ec0.f<Float> fVar, int i) {
        super(1);
        this.h = f;
        this.i = fVar;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
        com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
        Float valueOf = Float.valueOf(this.h);
        com.amazon.aps.iva.ec0.f<Float> fVar = this.i;
        com.amazon.aps.iva.a2.h hVar = new com.amazon.aps.iva.a2.h(((Number) com.amazon.aps.iva.aq.j.l(valueOf, fVar)).floatValue(), fVar, this.j);
        com.amazon.aps.iva.fc0.l<Object>[] lVarArr = com.amazon.aps.iva.a2.y.a;
        com.amazon.aps.iva.a2.v.c.a(c0Var2, com.amazon.aps.iva.a2.y.a[1], hVar);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
