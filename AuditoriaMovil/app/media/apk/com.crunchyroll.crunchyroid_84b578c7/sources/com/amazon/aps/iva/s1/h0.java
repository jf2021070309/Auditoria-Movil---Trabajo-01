package com.amazon.aps.iva.s1;
/* compiled from: LayoutModifier.kt */
/* loaded from: classes.dex */
public final class h0 implements c0 {
    public final l b;
    public final j0 c;
    public final k0 d;

    public h0(l lVar, j0 j0Var, k0 k0Var) {
        com.amazon.aps.iva.yb0.j.f(j0Var, "minMax");
        com.amazon.aps.iva.yb0.j.f(k0Var, "widthHeight");
        this.b = lVar;
        this.c = j0Var;
        this.d = k0Var;
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int C(int i) {
        return this.b.C(i);
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int M(int i) {
        return this.b.M(i);
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int P(int i) {
        return this.b.P(i);
    }

    @Override // com.amazon.aps.iva.s1.c0
    public final u0 V(long j) {
        int C;
        int M;
        k0 k0Var = this.d;
        k0 k0Var2 = k0.Width;
        j0 j0Var = this.c;
        l lVar = this.b;
        if (k0Var == k0Var2) {
            if (j0Var == j0.Max) {
                M = lVar.P(com.amazon.aps.iva.o2.a.g(j));
            } else {
                M = lVar.M(com.amazon.aps.iva.o2.a.g(j));
            }
            return new i0(M, com.amazon.aps.iva.o2.a.g(j));
        }
        if (j0Var == j0.Max) {
            C = lVar.d(com.amazon.aps.iva.o2.a.h(j));
        } else {
            C = lVar.C(com.amazon.aps.iva.o2.a.h(j));
        }
        return new i0(com.amazon.aps.iva.o2.a.h(j), C);
    }

    @Override // com.amazon.aps.iva.s1.l
    public final Object b() {
        return this.b.b();
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int d(int i) {
        return this.b.d(i);
    }
}
