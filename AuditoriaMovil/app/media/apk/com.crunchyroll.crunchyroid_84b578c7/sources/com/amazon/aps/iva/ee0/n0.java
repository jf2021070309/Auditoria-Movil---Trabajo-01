package com.amazon.aps.iva.ee0;

import java.util.List;
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes4.dex */
public final class n0 extends m0 {
    public final c1 c;
    public final List<j1> d;
    public final boolean e;
    public final com.amazon.aps.iva.xd0.i f;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fe0.f, m0> g;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(c1 c1Var, List<? extends j1> list, boolean z, com.amazon.aps.iva.xd0.i iVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fe0.f, ? extends m0> lVar) {
        com.amazon.aps.iva.yb0.j.f(c1Var, "constructor");
        com.amazon.aps.iva.yb0.j.f(list, "arguments");
        com.amazon.aps.iva.yb0.j.f(iVar, "memberScope");
        com.amazon.aps.iva.yb0.j.f(lVar, "refinedTypeFactory");
        this.c = c1Var;
        this.d = list;
        this.e = z;
        this.f = iVar;
        this.g = lVar;
        if ((iVar instanceof com.amazon.aps.iva.ge0.f) && !(iVar instanceof com.amazon.aps.iva.ge0.l)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + iVar + '\n' + c1Var);
        }
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final List<j1> G0() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final a1 H0() {
        a1.c.getClass();
        return a1.d;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final c1 I0() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final boolean J0() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final e0 K0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        m0 invoke = this.g.invoke(fVar);
        if (invoke == null) {
            return this;
        }
        return invoke;
    }

    @Override // com.amazon.aps.iva.ee0.u1
    public final u1 N0(com.amazon.aps.iva.fe0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "kotlinTypeRefiner");
        m0 invoke = this.g.invoke(fVar);
        if (invoke == null) {
            return this;
        }
        return invoke;
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 P0(boolean z) {
        if (z == this.e) {
            return this;
        }
        if (z) {
            return new k0(this);
        }
        return new j0(this);
    }

    @Override // com.amazon.aps.iva.ee0.m0
    public final m0 Q0(a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        if (a1Var.isEmpty()) {
            return this;
        }
        return new o0(this, a1Var);
    }

    @Override // com.amazon.aps.iva.ee0.e0
    public final com.amazon.aps.iva.xd0.i l() {
        return this.f;
    }
}
