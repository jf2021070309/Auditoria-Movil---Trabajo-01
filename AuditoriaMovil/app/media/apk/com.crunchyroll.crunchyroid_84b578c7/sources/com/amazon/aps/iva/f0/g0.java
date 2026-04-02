package com.amazon.aps.iva.f0;
/* compiled from: LazyLayoutSemantics.kt */
/* loaded from: classes.dex */
public final class g0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, Integer> h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ com.amazon.aps.iva.a2.j j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<Float, Float, Boolean> k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Integer, Boolean> l;
    public final /* synthetic */ com.amazon.aps.iva.a2.b m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, boolean z, com.amazon.aps.iva.a2.j jVar, l0 l0Var, n0 n0Var, com.amazon.aps.iva.a2.b bVar) {
        super(1);
        this.h = j0Var;
        this.i = z;
        this.j = jVar;
        this.k = l0Var;
        this.l = n0Var;
        this.m = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
        com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
        com.amazon.aps.iva.fc0.l<Object>[] lVarArr = com.amazon.aps.iva.a2.y.a;
        com.amazon.aps.iva.a2.b0<Boolean> b0Var = com.amazon.aps.iva.a2.v.l;
        com.amazon.aps.iva.fc0.l<?>[] lVarArr2 = com.amazon.aps.iva.a2.y.a;
        b0Var.a(c0Var2, lVarArr2[6], Boolean.TRUE);
        com.amazon.aps.iva.xb0.l<Object, Integer> lVar = this.h;
        com.amazon.aps.iva.yb0.j.f(lVar, "mapping");
        c0Var2.b(com.amazon.aps.iva.a2.v.C, lVar);
        boolean z = this.i;
        com.amazon.aps.iva.a2.j jVar = this.j;
        if (z) {
            com.amazon.aps.iva.yb0.j.f(jVar, "<set-?>");
            com.amazon.aps.iva.a2.v.p.a(c0Var2, lVarArr2[9], jVar);
        } else {
            com.amazon.aps.iva.yb0.j.f(jVar, "<set-?>");
            com.amazon.aps.iva.a2.v.o.a(c0Var2, lVarArr2[8], jVar);
        }
        com.amazon.aps.iva.xb0.p<Float, Float, Boolean> pVar = this.k;
        if (pVar != null) {
            c0Var2.b(com.amazon.aps.iva.a2.k.d, new com.amazon.aps.iva.a2.a(null, pVar));
        }
        com.amazon.aps.iva.xb0.l<Integer, Boolean> lVar2 = this.l;
        if (lVar2 != null) {
            c0Var2.b(com.amazon.aps.iva.a2.k.e, new com.amazon.aps.iva.a2.a(null, lVar2));
        }
        com.amazon.aps.iva.a2.b bVar = this.m;
        com.amazon.aps.iva.yb0.j.f(bVar, "<set-?>");
        com.amazon.aps.iva.a2.v.f.a(c0Var2, lVarArr2[16], bVar);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
