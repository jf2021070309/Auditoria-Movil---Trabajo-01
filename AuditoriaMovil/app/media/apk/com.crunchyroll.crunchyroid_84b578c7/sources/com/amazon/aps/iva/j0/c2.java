package com.amazon.aps.iva.j0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class c2 implements com.amazon.aps.iva.o0.u0 {
    public final /* synthetic */ com.amazon.aps.iva.o0.q1 a;
    public final /* synthetic */ com.amazon.aps.iva.c0.l b;

    public c2(com.amazon.aps.iva.o0.q1 q1Var, com.amazon.aps.iva.c0.l lVar) {
        this.a = q1Var;
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        com.amazon.aps.iva.o0.q1 q1Var = this.a;
        com.amazon.aps.iva.c0.o oVar = (com.amazon.aps.iva.c0.o) q1Var.getValue();
        if (oVar != null) {
            com.amazon.aps.iva.c0.n nVar = new com.amazon.aps.iva.c0.n(oVar);
            com.amazon.aps.iva.c0.l lVar = this.b;
            if (lVar != null) {
                lVar.a(nVar);
            }
            q1Var.setValue(null);
        }
    }
}
