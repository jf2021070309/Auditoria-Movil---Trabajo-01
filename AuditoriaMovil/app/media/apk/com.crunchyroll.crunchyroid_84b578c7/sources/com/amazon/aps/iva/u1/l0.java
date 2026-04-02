package com.amazon.aps.iva.u1;
/* compiled from: LayoutModifierNode.kt */
/* loaded from: classes.dex */
public final class l0 implements com.amazon.aps.iva.s1.c0 {
    public final com.amazon.aps.iva.s1.l b;
    public final n0 c;
    public final o0 d;

    public l0(com.amazon.aps.iva.s1.l lVar, n0 n0Var, o0 o0Var) {
        com.amazon.aps.iva.yb0.j.f(lVar, "measurable");
        com.amazon.aps.iva.yb0.j.f(n0Var, "minMax");
        com.amazon.aps.iva.yb0.j.f(o0Var, "widthHeight");
        this.b = lVar;
        this.c = n0Var;
        this.d = o0Var;
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
    public final com.amazon.aps.iva.s1.u0 V(long j) {
        int C;
        int M;
        o0 o0Var = this.d;
        o0 o0Var2 = o0.Width;
        n0 n0Var = this.c;
        com.amazon.aps.iva.s1.l lVar = this.b;
        if (o0Var == o0Var2) {
            if (n0Var == n0.Max) {
                M = lVar.P(com.amazon.aps.iva.o2.a.g(j));
            } else {
                M = lVar.M(com.amazon.aps.iva.o2.a.g(j));
            }
            return new m0(M, com.amazon.aps.iva.o2.a.g(j));
        }
        if (n0Var == n0.Max) {
            C = lVar.d(com.amazon.aps.iva.o2.a.h(j));
        } else {
            C = lVar.C(com.amazon.aps.iva.o2.a.h(j));
        }
        return new m0(com.amazon.aps.iva.o2.a.h(j), C);
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
