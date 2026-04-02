package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.ee0.a1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.u1;
/* compiled from: typeEnhancement.kt */
/* loaded from: classes4.dex */
public final class j extends com.amazon.aps.iva.ee0.s implements com.amazon.aps.iva.ee0.o {
    public final m0 c;

    public j(m0 m0Var) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "delegate");
        this.c = m0Var;
    }

    public static m0 U0(m0 m0Var) {
        m0 M0 = m0Var.M0(false);
        if (!s1.h(m0Var)) {
            return M0;
        }
        return new j(M0);
    }

    @Override // com.amazon.aps.iva.ee0.o
    public final boolean A0() {
        return true;
    }

    @Override // com.amazon.aps.iva.ee0.s, com.amazon.aps.iva.ee0.e0
    public final boolean J0() {
        return false;
    }

    @Override // com.amazon.aps.iva.ee0.m0, com.amazon.aps.iva.ee0.u1
    public final u1 O0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return new j(this.c.O0(a1Var));
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 P0(boolean z) {
        if (z) {
            return this.c.M0(true);
        }
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 Q0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return new j(this.c.O0(a1Var));
    }

    @Override // com.amazon.aps.iva.ee0.s
    public final m0 R0() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ee0.s
    public final com.amazon.aps.iva.ee0.s T0(m0 m0Var) {
        return new j(m0Var);
    }

    @Override // com.amazon.aps.iva.ee0.o
    public final u1 s0(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "replacement");
        u1 L0 = e0Var.L0();
        com.amazon.aps.iva.yb0.j.f(L0, "<this>");
        if (!s1.h(L0) && !s1.g(L0)) {
            return L0;
        }
        if (L0 instanceof m0) {
            return U0((m0) L0);
        }
        if (L0 instanceof com.amazon.aps.iva.ee0.y) {
            com.amazon.aps.iva.ee0.y yVar = (com.amazon.aps.iva.ee0.y) L0;
            return com.amazon.aps.iva.dg.b.K(f0.c(U0(yVar.c), U0(yVar.d)), com.amazon.aps.iva.dg.b.t(L0));
        }
        throw new IllegalStateException(("Incorrect type: " + L0).toString());
    }
}
