package com.amazon.aps.iva.s1;
/* compiled from: Layout.kt */
/* loaded from: classes.dex */
public final class g implements c0 {
    public final l b;
    public final n c;
    public final o d;

    public g(l lVar, n nVar, o oVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "measurable");
        com.amazon.aps.iva.yb0.j.f(nVar, "minMax");
        com.amazon.aps.iva.yb0.j.f(oVar, "widthHeight");
        this.b = lVar;
        this.c = nVar;
        this.d = oVar;
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
        o oVar = this.d;
        o oVar2 = o.Width;
        n nVar = this.c;
        l lVar = this.b;
        if (oVar == oVar2) {
            if (nVar == n.Max) {
                M = lVar.P(com.amazon.aps.iva.o2.a.g(j));
            } else {
                M = lVar.M(com.amazon.aps.iva.o2.a.g(j));
            }
            return new i(M, com.amazon.aps.iva.o2.a.g(j));
        }
        if (nVar == n.Max) {
            C = lVar.d(com.amazon.aps.iva.o2.a.h(j));
        } else {
            C = lVar.C(com.amazon.aps.iva.o2.a.h(j));
        }
        return new i(com.amazon.aps.iva.o2.a.h(j), C);
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
