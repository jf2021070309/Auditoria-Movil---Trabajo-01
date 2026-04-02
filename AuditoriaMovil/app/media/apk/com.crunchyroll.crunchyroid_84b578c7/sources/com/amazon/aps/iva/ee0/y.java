package com.amazon.aps.iva.ee0;

import java.util.List;
/* compiled from: KotlinType.kt */
/* loaded from: classes4.dex */
public abstract class y extends u1 implements com.amazon.aps.iva.he0.f {
    public final m0 c;
    public final m0 d;

    public y(m0 m0Var, m0 m0Var2) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "lowerBound");
        com.amazon.aps.iva.yb0.j.f(m0Var2, "upperBound");
        this.c = m0Var;
        this.d = m0Var2;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final List<j1> G0() {
        return P0().G0();
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public a1 H0() {
        return P0().H0();
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final c1 I0() {
        return P0().I0();
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public boolean J0() {
        return P0().J0();
    }

    public abstract m0 P0();

    public abstract String Q0(com.amazon.aps.iva.pd0.c cVar, com.amazon.aps.iva.pd0.j jVar);

    @Override // com.amazon.aps.iva.ee0.e0
    public com.amazon.aps.iva.xd0.i l() {
        return P0().l();
    }

    public String toString() {
        return com.amazon.aps.iva.pd0.c.c.u(this);
    }
}
