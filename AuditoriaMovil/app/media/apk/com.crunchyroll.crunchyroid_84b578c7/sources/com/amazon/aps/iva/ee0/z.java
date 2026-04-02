package com.amazon.aps.iva.ee0;
/* compiled from: flexibleTypes.kt */
/* loaded from: classes4.dex */
public final class z extends y implements o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(m0 m0Var, m0 m0Var2) {
        super(m0Var, m0Var2);
        com.amazon.aps.iva.yb0.j.f(m0Var, "lowerBound");
        com.amazon.aps.iva.yb0.j.f(m0Var2, "upperBound");
    }

    @Override // com.amazon.aps.iva.ee0.o
    public final boolean A0() {
        m0 m0Var = this.c;
        if ((m0Var.I0().k() instanceof com.amazon.aps.iva.oc0.y0) && com.amazon.aps.iva.yb0.j.a(m0Var.I0(), this.d.I0())) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 M0(boolean z) {
        return f0.c(this.c.M0(z), this.d.M0(z));
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 O0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return f0.c(this.c.O0(a1Var), this.d.O0(a1Var));
    }

    @Override // com.amazon.aps.iva.ee0.y
    public final m0 P0() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ee0.y
    public final String Q0(com.amazon.aps.iva.pd0.c cVar, com.amazon.aps.iva.pd0.j jVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "renderer");
        com.amazon.aps.iva.yb0.j.f(jVar, "options");
        boolean h = jVar.h();
        m0 m0Var = this.d;
        m0 m0Var2 = this.c;
        if (h) {
            return "(" + cVar.u(m0Var2) + ".." + cVar.u(m0Var) + ')';
        }
        return cVar.r(cVar.u(m0Var2), cVar.u(m0Var), com.amazon.aps.iva.da0.a.n(this));
    }

    @Override // com.amazon.aps.iva.ee0.u1
    /* renamed from: R0 */
    public final y N0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        e0 w = fVar.w(this.c);
        com.amazon.aps.iva.yb0.j.d(w, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        e0 w2 = fVar.w(this.d);
        com.amazon.aps.iva.yb0.j.d(w2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new z((m0) w, (m0) w2);
    }

    @Override // com.amazon.aps.iva.ee0.o
    public final u1 s0(e0 e0Var) {
        u1 c;
        com.amazon.aps.iva.yb0.j.f(e0Var, "replacement");
        u1 L0 = e0Var.L0();
        if (L0 instanceof y) {
            c = L0;
        } else if (L0 instanceof m0) {
            m0 m0Var = (m0) L0;
            c = f0.c(m0Var, m0Var.M0(true));
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        return com.amazon.aps.iva.dg.b.w(c, L0);
    }

    @Override // com.amazon.aps.iva.ee0.y
    public final String toString() {
        return "(" + this.c + ".." + this.d + ')';
    }
}
