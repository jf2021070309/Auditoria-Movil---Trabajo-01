package com.amazon.aps.iva.ee0;
/* compiled from: SpecialTypes.kt */
/* loaded from: classes4.dex */
public final class a extends s {
    public final m0 c;
    public final m0 d;

    public a(m0 m0Var, m0 m0Var2) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "delegate");
        com.amazon.aps.iva.yb0.j.f(m0Var2, "abbreviation");
        this.c = m0Var;
        this.d = m0Var2;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 Q0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return new a(this.c.O0(a1Var), this.d);
    }

    @Override // com.amazon.aps.iva.ee0.s
    public final m0 R0() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ee0.s
    public final s T0(m0 m0Var) {
        return new a(m0Var, this.d);
    }

    @Override // com.amazon.aps.iva.ee0.m0
    /* renamed from: U0 */
    public final a P0(boolean z) {
        return new a(this.c.M0(z), this.d.M0(z));
    }

    @Override // com.amazon.aps.iva.ee0.s
    /* renamed from: V0 */
    public final a S0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        e0 w = fVar.w(this.c);
        com.amazon.aps.iva.yb0.j.d(w, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        e0 w2 = fVar.w(this.d);
        com.amazon.aps.iva.yb0.j.d(w2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new a((m0) w, (m0) w2);
    }
}
