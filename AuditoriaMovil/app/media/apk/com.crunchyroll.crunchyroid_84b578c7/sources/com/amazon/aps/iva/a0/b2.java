package com.amazon.aps.iva.a0;
/* compiled from: Scroll.kt */
/* loaded from: classes.dex */
public final class b2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ c2 k;
    public final /* synthetic */ com.amazon.aps.iva.se0.g0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(boolean z, boolean z2, boolean z3, c2 c2Var, com.amazon.aps.iva.se0.g0 g0Var) {
        super(1);
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = c2Var;
        this.l = g0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
        com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
        com.amazon.aps.iva.fc0.l<Object>[] lVarArr = com.amazon.aps.iva.a2.y.a;
        com.amazon.aps.iva.a2.b0<Boolean> b0Var = com.amazon.aps.iva.a2.v.l;
        com.amazon.aps.iva.fc0.l<?>[] lVarArr2 = com.amazon.aps.iva.a2.y.a;
        b0Var.a(c0Var2, lVarArr2[6], Boolean.TRUE);
        c2 c2Var = this.k;
        com.amazon.aps.iva.a2.j jVar = new com.amazon.aps.iva.a2.j(new z1(c2Var), this.h, new a2(c2Var));
        boolean z = this.i;
        if (z) {
            com.amazon.aps.iva.a2.v.p.a(c0Var2, lVarArr2[9], jVar);
        } else {
            com.amazon.aps.iva.a2.v.o.a(c0Var2, lVarArr2[8], jVar);
        }
        if (this.j) {
            c0Var2.b(com.amazon.aps.iva.a2.k.d, new com.amazon.aps.iva.a2.a(null, new y1(this.l, z, c2Var)));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
