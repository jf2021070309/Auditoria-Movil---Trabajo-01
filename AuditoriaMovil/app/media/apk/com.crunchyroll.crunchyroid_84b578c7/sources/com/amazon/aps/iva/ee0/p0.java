package com.amazon.aps.iva.ee0;
/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes4.dex */
public final class p0 extends s implements t1 {
    public final m0 c;
    public final e0 d;

    public p0(m0 m0Var, e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "delegate");
        com.amazon.aps.iva.yb0.j.f(e0Var, "enhancement");
        this.c = m0Var;
        this.d = e0Var;
    }

    @Override // com.amazon.aps.iva.ee0.t1
    public final u1 E0() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 P0(boolean z) {
        u1 K = com.amazon.aps.iva.dg.b.K(this.c.M0(z), this.d.L0().M0(z));
        com.amazon.aps.iva.yb0.j.d(K, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (m0) K;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 Q0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        u1 K = com.amazon.aps.iva.dg.b.K(this.c.O0(a1Var), this.d);
        com.amazon.aps.iva.yb0.j.d(K, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (m0) K;
    }

    @Override // com.amazon.aps.iva.ee0.s
    public final m0 R0() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ee0.s
    public final s T0(m0 m0Var) {
        return new p0(m0Var, this.d);
    }

    @Override // com.amazon.aps.iva.ee0.s
    /* renamed from: U0 */
    public final p0 S0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        e0 w = fVar.w(this.c);
        com.amazon.aps.iva.yb0.j.d(w, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new p0((m0) w, fVar.w(this.d));
    }

    @Override // com.amazon.aps.iva.ee0.t1
    public final e0 d0() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.d + ")] " + this.c;
    }
}
