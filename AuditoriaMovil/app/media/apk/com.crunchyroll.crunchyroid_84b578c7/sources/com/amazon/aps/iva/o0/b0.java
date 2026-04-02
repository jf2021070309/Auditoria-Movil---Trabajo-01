package com.amazon.aps.iva.o0;

import java.util.List;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class b0 implements l2 {
    public final /* synthetic */ o0 b;
    public final /* synthetic */ m1 c;

    public b0(o0 o0Var, m1 m1Var) {
        this.b = o0Var;
        this.c = m1Var;
    }

    @Override // com.amazon.aps.iva.o0.l2
    public final b1 c(j2 j2Var, Object obj) {
        l2 l2Var;
        b1 b1Var;
        com.amazon.aps.iva.yb0.j.f(j2Var, "scope");
        o0 o0Var = this.b;
        com.amazon.aps.iva.p0.c cVar = null;
        if (o0Var instanceof l2) {
            l2Var = (l2) o0Var;
        } else {
            l2Var = null;
        }
        if (l2Var == null || (b1Var = l2Var.c(j2Var, obj)) == null) {
            b1Var = b1.IGNORED;
        }
        if (b1Var == b1.IGNORED) {
            m1 m1Var = this.c;
            List<com.amazon.aps.iva.kb0.j<j2, com.amazon.aps.iva.p0.c<Object>>> list = m1Var.f;
            if (obj != null) {
                cVar = new com.amazon.aps.iva.p0.c();
                cVar.add(cVar);
            }
            m1Var.f = com.amazon.aps.iva.lb0.x.M0(list, new com.amazon.aps.iva.kb0.j(j2Var, cVar));
            return b1.SCHEDULED;
        }
        return b1Var;
    }

    @Override // com.amazon.aps.iva.o0.l2
    public final void l(j2 j2Var) {
        com.amazon.aps.iva.yb0.j.f(j2Var, "scope");
    }

    @Override // com.amazon.aps.iva.o0.l2
    public final void a(Object obj) {
    }
}
