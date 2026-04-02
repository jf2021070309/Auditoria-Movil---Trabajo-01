package com.amazon.aps.iva.ee0;

import java.util.List;
/* compiled from: SpecialTypes.kt */
/* loaded from: classes4.dex */
public abstract class s extends m0 {
    @Override // com.amazon.aps.iva.ee0.e0
    public final List<j1> G0() {
        return R0().G0();
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public a1 H0() {
        return R0().H0();
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final c1 I0() {
        return R0().I0();
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public boolean J0() {
        return R0().J0();
    }

    public abstract m0 R0();

    @Override // com.amazon.aps.iva.ee0.u1
    /* renamed from: S0 */
    public m0 N0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        e0 w = fVar.w(R0());
        com.amazon.aps.iva.yb0.j.d(w, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return T0((m0) w);
    }

    public abstract s T0(m0 m0Var);

    @Override // com.amazon.aps.iva.ee0.e0
    public final com.amazon.aps.iva.xd0.i l() {
        return R0().l();
    }
}
