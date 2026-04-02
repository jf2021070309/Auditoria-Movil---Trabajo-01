package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.ee0.b1;
/* compiled from: SpecialTypes.kt */
/* loaded from: classes4.dex */
public final class q extends s implements o, com.amazon.aps.iva.he0.e {
    public final m0 c;
    public final boolean d;

    /* compiled from: SpecialTypes.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static q a(u1 u1Var, boolean z) {
            boolean z2;
            com.amazon.aps.iva.rc0.t0 t0Var;
            boolean z3;
            com.amazon.aps.iva.yb0.j.f(u1Var, "type");
            if (u1Var instanceof q) {
                return (q) u1Var;
            }
            boolean z4 = true;
            if (!(u1Var.I0() instanceof com.amazon.aps.iva.fe0.n) && !(u1Var.I0().k() instanceof com.amazon.aps.iva.oc0.y0) && !(u1Var instanceof com.amazon.aps.iva.fe0.h) && !(u1Var instanceof u0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                z4 = false;
            } else if (u1Var instanceof u0) {
                z4 = s1.g(u1Var);
            } else {
                com.amazon.aps.iva.oc0.h k = u1Var.I0().k();
                if (k instanceof com.amazon.aps.iva.rc0.t0) {
                    t0Var = (com.amazon.aps.iva.rc0.t0) k;
                } else {
                    t0Var = null;
                }
                if (t0Var != null && !t0Var.n) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    if (z && (u1Var.I0().k() instanceof com.amazon.aps.iva.oc0.y0)) {
                        z4 = s1.g(u1Var);
                    } else {
                        z4 = true ^ c.a(com.amazon.aps.iva.fe0.a.a(false, true, com.amazon.aps.iva.fe0.p.a, null, null, 24), com.amazon.aps.iva.dg.b.C(u1Var), b1.c.b.a);
                    }
                }
            }
            if (!z4) {
                return null;
            }
            if (u1Var instanceof y) {
                y yVar = (y) u1Var;
                com.amazon.aps.iva.yb0.j.a(yVar.c.I0(), yVar.d.I0());
            }
            return new q(com.amazon.aps.iva.dg.b.C(u1Var).M0(false), z);
        }
    }

    static {
        new a();
    }

    public q(m0 m0Var, boolean z) {
        this.c = m0Var;
        this.d = z;
    }

    @Override // com.amazon.aps.iva.ee0.o
    public final boolean A0() {
        m0 m0Var = this.c;
        if (!(m0Var.I0() instanceof com.amazon.aps.iva.fe0.n) && !(m0Var.I0().k() instanceof com.amazon.aps.iva.oc0.y0)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.ee0.s, com.amazon.aps.iva.ee0.e0
    public final boolean J0() {
        return false;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 P0(boolean z) {
        if (z) {
            return this.c.M0(z);
        }
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 Q0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return new q(this.c.O0(a1Var), this.d);
    }

    @Override // com.amazon.aps.iva.ee0.s
    public final m0 R0() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ee0.s
    public final s T0(m0 m0Var) {
        return new q(m0Var, this.d);
    }

    @Override // com.amazon.aps.iva.ee0.o
    public final u1 s0(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "replacement");
        return q0.a(e0Var.L0(), this.d);
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final String toString() {
        return this.c + " & Any";
    }
}
