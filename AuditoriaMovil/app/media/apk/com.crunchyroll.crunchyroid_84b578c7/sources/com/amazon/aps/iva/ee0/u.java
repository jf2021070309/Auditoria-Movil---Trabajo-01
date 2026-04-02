package com.amazon.aps.iva.ee0;
/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* loaded from: classes4.dex */
public final class u extends m1 {
    public static final /* synthetic */ int d = 0;
    public final m1 b;
    public final m1 c;

    public u(m1 m1Var, m1 m1Var2) {
        this.b = m1Var;
        this.c = m1Var2;
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final boolean a() {
        if (!this.b.a() && !this.c.a()) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final boolean b() {
        if (!this.b.b() && !this.c.b()) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final com.amazon.aps.iva.pc0.h c(com.amazon.aps.iva.pc0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "annotations");
        return this.c.c(this.b.c(hVar));
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final j1 d(e0 e0Var) {
        j1 d2 = this.b.d(e0Var);
        if (d2 == null) {
            return this.c.d(e0Var);
        }
        return d2;
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final e0 f(e0 e0Var, v1 v1Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "topLevelType");
        com.amazon.aps.iva.yb0.j.f(v1Var, "position");
        return this.c.f(this.b.f(e0Var, v1Var), v1Var);
    }
}
