package com.amazon.aps.iva.ee0;

import java.util.List;
/* compiled from: StubTypes.kt */
/* loaded from: classes4.dex */
public abstract class d extends m0 {
    public final com.amazon.aps.iva.fe0.n c;
    public final boolean d;
    public final com.amazon.aps.iva.ge0.f e;

    public d(com.amazon.aps.iva.fe0.n nVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(nVar, "originalTypeVariable");
        this.c = nVar;
        this.d = z;
        this.e = com.amazon.aps.iva.ge0.k.b(com.amazon.aps.iva.ge0.g.STUB_TYPE_SCOPE, nVar.toString());
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final List<j1> G0() {
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final a1 H0() {
        a1.c.getClass();
        return a1.d;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final boolean J0() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final e0 K0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 N0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.m0, com.amazon.aps.iva.ee0.u1
    public final u1 O0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return this;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 P0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return R0(z);
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 Q0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        return this;
    }

    public abstract u0 R0(boolean z);

    @Override // com.amazon.aps.iva.ee0.e0
    public com.amazon.aps.iva.xd0.i l() {
        return this.e;
    }
}
