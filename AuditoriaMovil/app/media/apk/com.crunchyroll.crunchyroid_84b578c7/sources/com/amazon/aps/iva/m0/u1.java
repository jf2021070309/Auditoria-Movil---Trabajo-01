package com.amazon.aps.iva.m0;
/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class u1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ f2 h;
    public final /* synthetic */ com.amazon.aps.iva.se0.g0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(f2 f2Var, com.amazon.aps.iva.se0.g0 g0Var) {
        super(1);
        this.h = f2Var;
        this.i = g0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
        boolean z;
        com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
        f2 f2Var = this.h;
        if (f2Var.c.c() != g2.Hidden) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.amazon.aps.iva.se0.g0 g0Var = this.i;
            p1 p1Var = new p1(f2Var, g0Var);
            com.amazon.aps.iva.fc0.l<Object>[] lVarArr = com.amazon.aps.iva.a2.y.a;
            c0Var2.b(com.amazon.aps.iva.a2.k.p, new com.amazon.aps.iva.a2.a(null, p1Var));
            k<g2> kVar = f2Var.c;
            g2 c = kVar.c();
            g2 g2Var = g2.HalfExpanded;
            if (c == g2Var) {
                c0Var2.b(com.amazon.aps.iva.a2.k.n, new com.amazon.aps.iva.a2.a(null, new r1(f2Var, g0Var)));
            } else if (kVar.b().containsKey(g2Var)) {
                c0Var2.b(com.amazon.aps.iva.a2.k.o, new com.amazon.aps.iva.a2.a(null, new t1(f2Var, g0Var)));
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
