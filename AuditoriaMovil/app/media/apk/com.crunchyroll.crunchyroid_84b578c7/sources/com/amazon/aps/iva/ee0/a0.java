package com.amazon.aps.iva.ee0;
/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes4.dex */
public final class a0 extends y implements t1 {
    public final y e;
    public final e0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(y yVar, e0 e0Var) {
        super(yVar.c, yVar.d);
        com.amazon.aps.iva.yb0.j.f(yVar, "origin");
        com.amazon.aps.iva.yb0.j.f(e0Var, "enhancement");
        this.e = yVar;
        this.f = e0Var;
    }

    @Override // com.amazon.aps.iva.ee0.t1
    public final u1 E0() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 M0(boolean z) {
        return com.amazon.aps.iva.dg.b.K(this.e.M0(z), this.f.L0().M0(z));
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 O0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return com.amazon.aps.iva.dg.b.K(this.e.O0(a1Var), this.f);
    }

    @Override // com.amazon.aps.iva.ee0.y
    public final m0 P0() {
        return this.e.P0();
    }

    @Override // com.amazon.aps.iva.ee0.y
    public final String Q0(com.amazon.aps.iva.pd0.c cVar, com.amazon.aps.iva.pd0.j jVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "renderer");
        com.amazon.aps.iva.yb0.j.f(jVar, "options");
        if (jVar.d()) {
            return cVar.u(this.f);
        }
        return this.e.Q0(cVar, jVar);
    }

    @Override // com.amazon.aps.iva.ee0.u1
    /* renamed from: R0 */
    public final a0 N0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        e0 w = fVar.w(this.e);
        com.amazon.aps.iva.yb0.j.d(w, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new a0((y) w, fVar.w(this.f));
    }

    @Override // com.amazon.aps.iva.ee0.t1
    public final e0 d0() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ee0.y
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f + ")] " + this.e;
    }
}
