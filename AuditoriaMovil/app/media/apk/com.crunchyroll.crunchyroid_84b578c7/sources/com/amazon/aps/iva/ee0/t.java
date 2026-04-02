package com.amazon.aps.iva.ee0;
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes4.dex */
public abstract class t extends s {
    public final m0 c;

    public t(m0 m0Var) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "delegate");
        this.c = m0Var;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 P0(boolean z) {
        if (z == J0()) {
            return this;
        }
        return this.c.M0(z).O0(H0());
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 Q0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        if (a1Var != H0()) {
            return new o0(this, a1Var);
        }
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.s
    public final m0 R0() {
        return this.c;
    }
}
