package androidx.compose.ui.node;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.f1.g0;
import com.amazon.aps.iva.f1.u;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.s1.e0;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.u1.n0;
import com.amazon.aps.iva.u1.o0;
import com.amazon.aps.iva.u1.x;
/* compiled from: LayoutModifierNodeCoordinator.kt */
/* loaded from: classes.dex */
public final class d extends o {
    public static final com.amazon.aps.iva.f1.k J;
    public x G;
    public com.amazon.aps.iva.o2.a H;
    public k I;

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    /* loaded from: classes.dex */
    public final class a extends k {
        public a() {
            super(d.this);
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int C(int i) {
            d dVar = d.this;
            x xVar = dVar.G;
            o oVar = dVar.j;
            com.amazon.aps.iva.yb0.j.c(oVar);
            k p1 = oVar.p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            return xVar.d(this, p1, i);
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int M(int i) {
            d dVar = d.this;
            x xVar = dVar.G;
            o oVar = dVar.j;
            com.amazon.aps.iva.yb0.j.c(oVar);
            k p1 = oVar.p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            return xVar.b(this, p1, i);
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int P(int i) {
            d dVar = d.this;
            x xVar = dVar.G;
            o oVar = dVar.j;
            com.amazon.aps.iva.yb0.j.c(oVar);
            k p1 = oVar.p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            return xVar.e(this, p1, i);
        }

        @Override // com.amazon.aps.iva.s1.c0
        public final u0 V(long j) {
            w0(j);
            com.amazon.aps.iva.o2.a aVar = new com.amazon.aps.iva.o2.a(j);
            d dVar = d.this;
            dVar.H = aVar;
            x xVar = dVar.G;
            o oVar = dVar.j;
            com.amazon.aps.iva.yb0.j.c(oVar);
            k p1 = oVar.p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            k.c1(this, xVar.f(this, p1, j));
            return this;
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int d(int i) {
            d dVar = d.this;
            x xVar = dVar.G;
            o oVar = dVar.j;
            com.amazon.aps.iva.yb0.j.c(oVar);
            k p1 = oVar.p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            return xVar.c(this, p1, i);
        }

        @Override // com.amazon.aps.iva.u1.e0
        public final int x0(com.amazon.aps.iva.s1.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "alignmentLine");
            int m = com.amazon.aps.iva.cq.b.m(this, aVar);
            this.n.put(aVar, Integer.valueOf(m));
            return m;
        }
    }

    static {
        com.amazon.aps.iva.f1.k a2 = com.amazon.aps.iva.f1.l.a();
        a2.f(com.amazon.aps.iva.f1.x.e);
        a2.v(1.0f);
        a2.w(1);
        J = a2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, x xVar) {
        super(eVar);
        a aVar;
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        this.G = xVar;
        if (eVar.d != null) {
            aVar = new a();
        } else {
            aVar = null;
        }
        this.I = aVar;
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int C(int i) {
        com.amazon.aps.iva.s1.k kVar;
        x xVar = this.G;
        if (xVar instanceof com.amazon.aps.iva.s1.k) {
            kVar = (com.amazon.aps.iva.s1.k) xVar;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            o oVar = this.j;
            com.amazon.aps.iva.yb0.j.c(oVar);
            return xVar.d(this, oVar, i);
        }
        com.amazon.aps.iva.yb0.j.c(this.j);
        n0 n0Var = n0.Min;
        o0 o0Var = o0.Height;
        com.amazon.aps.iva.yb0.j.f(n0Var, "minMax");
        com.amazon.aps.iva.yb0.j.f(o0Var, "widthHeight");
        com.amazon.aps.iva.o2.b.b(i, 0, 13);
        com.amazon.aps.iva.yb0.j.f(this.i.t, "layoutDirection");
        throw null;
    }

    @Override // androidx.compose.ui.node.o
    public final void D1(u uVar) {
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        o oVar = this.j;
        com.amazon.aps.iva.yb0.j.c(oVar);
        oVar.j1(uVar);
        if (com.amazon.aps.iva.aq.j.K(this.i).getShowLayoutBounds()) {
            k1(uVar, J);
        }
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int M(int i) {
        com.amazon.aps.iva.s1.k kVar;
        x xVar = this.G;
        if (xVar instanceof com.amazon.aps.iva.s1.k) {
            kVar = (com.amazon.aps.iva.s1.k) xVar;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            o oVar = this.j;
            com.amazon.aps.iva.yb0.j.c(oVar);
            return xVar.b(this, oVar, i);
        }
        com.amazon.aps.iva.yb0.j.c(this.j);
        n0 n0Var = n0.Min;
        o0 o0Var = o0.Width;
        com.amazon.aps.iva.yb0.j.f(n0Var, "minMax");
        com.amazon.aps.iva.yb0.j.f(o0Var, "widthHeight");
        com.amazon.aps.iva.o2.b.b(0, i, 7);
        com.amazon.aps.iva.yb0.j.f(this.i.t, "layoutDirection");
        throw null;
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int P(int i) {
        com.amazon.aps.iva.s1.k kVar;
        x xVar = this.G;
        if (xVar instanceof com.amazon.aps.iva.s1.k) {
            kVar = (com.amazon.aps.iva.s1.k) xVar;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            o oVar = this.j;
            com.amazon.aps.iva.yb0.j.c(oVar);
            return xVar.e(this, oVar, i);
        }
        com.amazon.aps.iva.yb0.j.c(this.j);
        n0 n0Var = n0.Max;
        o0 o0Var = o0.Width;
        com.amazon.aps.iva.yb0.j.f(n0Var, "minMax");
        com.amazon.aps.iva.yb0.j.f(o0Var, "widthHeight");
        com.amazon.aps.iva.o2.b.b(0, i, 7);
        com.amazon.aps.iva.yb0.j.f(this.i.t, "layoutDirection");
        throw null;
    }

    @Override // com.amazon.aps.iva.s1.c0
    public final u0 V(long j) {
        w0(j);
        x xVar = this.G;
        if (!(xVar instanceof com.amazon.aps.iva.s1.k)) {
            o oVar = this.j;
            com.amazon.aps.iva.yb0.j.c(oVar);
            G1(xVar.f(this, oVar, j));
            B1();
            return this;
        }
        com.amazon.aps.iva.yb0.j.c(this.j);
        k kVar = this.I;
        com.amazon.aps.iva.yb0.j.c(kVar);
        e0 M0 = kVar.M0();
        M0.getWidth();
        M0.getHeight();
        com.amazon.aps.iva.yb0.j.c(this.H);
        ((com.amazon.aps.iva.s1.k) xVar).getClass();
        throw null;
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int d(int i) {
        com.amazon.aps.iva.s1.k kVar;
        x xVar = this.G;
        if (xVar instanceof com.amazon.aps.iva.s1.k) {
            kVar = (com.amazon.aps.iva.s1.k) xVar;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            o oVar = this.j;
            com.amazon.aps.iva.yb0.j.c(oVar);
            return xVar.c(this, oVar, i);
        }
        com.amazon.aps.iva.yb0.j.c(this.j);
        n0 n0Var = n0.Max;
        o0 o0Var = o0.Height;
        com.amazon.aps.iva.yb0.j.f(n0Var, "minMax");
        com.amazon.aps.iva.yb0.j.f(o0Var, "widthHeight");
        com.amazon.aps.iva.o2.b.b(i, 0, 13);
        com.amazon.aps.iva.yb0.j.f(this.i.t, "layoutDirection");
        throw null;
    }

    @Override // androidx.compose.ui.node.o
    public final void m1() {
        if (this.I == null) {
            this.I = new a();
        }
    }

    @Override // androidx.compose.ui.node.o
    public final k p1() {
        return this.I;
    }

    @Override // androidx.compose.ui.node.o, com.amazon.aps.iva.s1.u0
    public final void r0(long j, float f, com.amazon.aps.iva.xb0.l<? super g0, q> lVar) {
        E1(j, f, lVar);
        if (this.g) {
            return;
        }
        C1();
        u0.a.C0692a c0692a = u0.a.a;
        com.amazon.aps.iva.o2.l lVar2 = this.i.t;
        com.amazon.aps.iva.s1.q qVar = u0.a.d;
        c0692a.getClass();
        int i = u0.a.c;
        com.amazon.aps.iva.o2.l lVar3 = u0.a.b;
        u0.a.c = (int) (this.d >> 32);
        u0.a.b = lVar2;
        boolean l = u0.a.C0692a.l(c0692a, this);
        M0().d();
        this.h = l;
        u0.a.c = i;
        u0.a.b = lVar3;
        u0.a.d = qVar;
    }

    @Override // androidx.compose.ui.node.o
    public final f.c r1() {
        return this.G.V();
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final int x0(com.amazon.aps.iva.s1.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "alignmentLine");
        k kVar = this.I;
        if (kVar != null) {
            Integer num = (Integer) kVar.n.get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        return com.amazon.aps.iva.cq.b.m(this, aVar);
    }
}
