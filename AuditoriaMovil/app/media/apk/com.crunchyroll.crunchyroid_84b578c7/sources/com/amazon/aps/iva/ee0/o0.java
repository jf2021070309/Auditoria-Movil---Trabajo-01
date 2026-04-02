package com.amazon.aps.iva.ee0;
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes4.dex */
public final class o0 extends t {
    public final a1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(m0 m0Var, a1 a1Var) {
        super(m0Var);
        com.amazon.aps.iva.yb0.j.f(m0Var, "delegate");
        com.amazon.aps.iva.yb0.j.f(a1Var, "attributes");
        this.d = a1Var;
    }

    @Override // com.amazon.aps.iva.ee0.s, com.amazon.aps.iva.ee0.e0
    public final a1 H0() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ee0.s
    public final s T0(m0 m0Var) {
        return new o0(m0Var, this.d);
    }
}
