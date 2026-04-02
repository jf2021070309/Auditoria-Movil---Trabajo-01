package com.amazon.aps.iva.h2;
/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes.dex */
public final class o0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<q0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p0 h;
    public final /* synthetic */ n0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, n0 n0Var) {
        super(1);
        this.h = p0Var;
        this.i = n0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(q0 q0Var) {
        q0 q0Var2 = q0Var;
        com.amazon.aps.iva.yb0.j.f(q0Var2, "finalResult");
        p0 p0Var = this.h;
        com.amazon.aps.iva.u0.b bVar = p0Var.a;
        n0 n0Var = this.i;
        synchronized (bVar) {
            if (q0Var2.c()) {
                p0Var.b.b(n0Var, q0Var2);
            } else {
                p0Var.b.c(n0Var);
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
