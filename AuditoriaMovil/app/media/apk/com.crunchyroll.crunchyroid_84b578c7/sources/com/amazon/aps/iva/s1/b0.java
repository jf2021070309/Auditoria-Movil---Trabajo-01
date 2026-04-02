package com.amazon.aps.iva.s1;
/* compiled from: LookaheadLayoutCoordinates.kt */
/* loaded from: classes.dex */
public final class b0 implements q {
    public final androidx.compose.ui.node.k b;

    public b0(androidx.compose.ui.node.k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "lookaheadDelegate");
        this.b = kVar;
    }

    @Override // com.amazon.aps.iva.s1.q
    public final long J(long j) {
        return this.b.i.J(com.amazon.aps.iva.e1.c.f(j, b()));
    }

    @Override // com.amazon.aps.iva.s1.q
    public final q Z() {
        androidx.compose.ui.node.k p1;
        if (l()) {
            androidx.compose.ui.node.o oVar = this.b.i.i.z.c.k;
            if (oVar == null || (p1 = oVar.p1()) == null) {
                return null;
            }
            return p1.l;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // com.amazon.aps.iva.s1.q
    public final long a() {
        androidx.compose.ui.node.k kVar = this.b;
        return com.amazon.aps.iva.o2.k.a(kVar.b, kVar.c);
    }

    @Override // com.amazon.aps.iva.s1.q
    public final long a0(q qVar, long j) {
        com.amazon.aps.iva.yb0.j.f(qVar, "sourceCoordinates");
        boolean z = qVar instanceof b0;
        androidx.compose.ui.node.k kVar = this.b;
        if (z) {
            androidx.compose.ui.node.k kVar2 = ((b0) qVar).b;
            kVar2.i.A1();
            androidx.compose.ui.node.k p1 = kVar.i.n1(kVar2.i).p1();
            if (p1 != null) {
                long g1 = kVar2.g1(p1);
                long e = com.amazon.aps.iva.e.w.e(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.c.c(j)), com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.c.d(j)));
                long e2 = com.amazon.aps.iva.e.w.e(((int) (g1 >> 32)) + ((int) (e >> 32)), com.amazon.aps.iva.o2.h.b(e) + com.amazon.aps.iva.o2.h.b(g1));
                long g12 = kVar.g1(p1);
                long e3 = com.amazon.aps.iva.e.w.e(((int) (e2 >> 32)) - ((int) (g12 >> 32)), com.amazon.aps.iva.o2.h.b(e2) - com.amazon.aps.iva.o2.h.b(g12));
                return com.amazon.aps.iva.e1.d.d((int) (e3 >> 32), com.amazon.aps.iva.o2.h.b(e3));
            }
            androidx.compose.ui.node.k C = com.amazon.aps.iva.e.w.C(kVar2);
            long g13 = kVar2.g1(C);
            long j2 = C.j;
            long e4 = com.amazon.aps.iva.e.w.e(((int) (g13 >> 32)) + ((int) (j2 >> 32)), com.amazon.aps.iva.o2.h.b(j2) + com.amazon.aps.iva.o2.h.b(g13));
            long e5 = com.amazon.aps.iva.e.w.e(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.c.c(j)), com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.c.d(j)));
            long e6 = com.amazon.aps.iva.e.w.e(((int) (e4 >> 32)) + ((int) (e5 >> 32)), com.amazon.aps.iva.o2.h.b(e5) + com.amazon.aps.iva.o2.h.b(e4));
            long g14 = kVar.g1(com.amazon.aps.iva.e.w.C(kVar));
            long j3 = com.amazon.aps.iva.e.w.C(kVar).j;
            long e7 = com.amazon.aps.iva.e.w.e(((int) (g14 >> 32)) + ((int) (j3 >> 32)), com.amazon.aps.iva.o2.h.b(j3) + com.amazon.aps.iva.o2.h.b(g14));
            long e8 = com.amazon.aps.iva.e.w.e(((int) (e6 >> 32)) - ((int) (e7 >> 32)), com.amazon.aps.iva.o2.h.b(e6) - com.amazon.aps.iva.o2.h.b(e7));
            androidx.compose.ui.node.o oVar = com.amazon.aps.iva.e.w.C(kVar).i.k;
            com.amazon.aps.iva.yb0.j.c(oVar);
            androidx.compose.ui.node.o oVar2 = C.i.k;
            com.amazon.aps.iva.yb0.j.c(oVar2);
            return oVar.a0(oVar2, com.amazon.aps.iva.e1.d.d((int) (e8 >> 32), com.amazon.aps.iva.o2.h.b(e8)));
        }
        androidx.compose.ui.node.k C2 = com.amazon.aps.iva.e.w.C(kVar);
        long a0 = a0(C2.l, j);
        androidx.compose.ui.node.o oVar3 = C2.i;
        oVar3.getClass();
        int i = com.amazon.aps.iva.e1.c.e;
        return com.amazon.aps.iva.e1.c.f(a0, oVar3.a0(qVar, com.amazon.aps.iva.e1.c.b));
    }

    public final long b() {
        androidx.compose.ui.node.k kVar = this.b;
        androidx.compose.ui.node.k C = com.amazon.aps.iva.e.w.C(kVar);
        int i = com.amazon.aps.iva.e1.c.e;
        long j = com.amazon.aps.iva.e1.c.b;
        return com.amazon.aps.iva.e1.c.e(a0(C.l, j), kVar.i.a0(C.i, j));
    }

    @Override // com.amazon.aps.iva.s1.q
    public final long d0(long j) {
        return this.b.i.d0(com.amazon.aps.iva.e1.c.f(j, b()));
    }

    @Override // com.amazon.aps.iva.s1.q
    public final com.amazon.aps.iva.e1.e f(q qVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(qVar, "sourceCoordinates");
        return this.b.i.f(qVar, z);
    }

    @Override // com.amazon.aps.iva.s1.q
    public final boolean l() {
        return this.b.i.l();
    }

    @Override // com.amazon.aps.iva.s1.q
    public final long v(long j) {
        return com.amazon.aps.iva.e1.c.f(this.b.i.v(j), b());
    }
}
