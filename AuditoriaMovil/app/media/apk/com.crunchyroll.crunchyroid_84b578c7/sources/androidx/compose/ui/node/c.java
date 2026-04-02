package androidx.compose.ui.node;

import androidx.compose.ui.node.e;
import androidx.compose.ui.node.f;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.f1.g0;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.u1.k1;
import com.amazon.aps.iva.u1.u;
import com.amazon.aps.iva.u1.z;
/* compiled from: InnerNodeCoordinator.kt */
/* loaded from: classes.dex */
public final class c extends o {
    public static final com.amazon.aps.iva.f1.k I;
    public final k1 G;
    public k H;

    /* compiled from: InnerNodeCoordinator.kt */
    /* loaded from: classes.dex */
    public final class a extends k {
        public a(c cVar) {
            super(cVar);
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int C(int i) {
            u uVar = this.i.i.r;
            d0 a = uVar.a();
            e eVar = uVar.a;
            return a.b(eVar.z.c, eVar.p(), i);
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int M(int i) {
            u uVar = this.i.i.r;
            d0 a = uVar.a();
            e eVar = uVar.a;
            return a.a(eVar.z.c, eVar.p(), i);
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int P(int i) {
            u uVar = this.i.i.r;
            d0 a = uVar.a();
            e eVar = uVar.a;
            return a.e(eVar.z.c, eVar.p(), i);
        }

        @Override // com.amazon.aps.iva.s1.c0
        public final u0 V(long j) {
            w0(j);
            o oVar = this.i;
            com.amazon.aps.iva.p0.f<e> y = oVar.i.y();
            int i = y.d;
            if (i > 0) {
                e[] eVarArr = y.b;
                int i2 = 0;
                do {
                    f.a aVar = eVarArr[i2].A.o;
                    com.amazon.aps.iva.yb0.j.c(aVar);
                    e.f fVar = e.f.NotUsed;
                    com.amazon.aps.iva.yb0.j.f(fVar, "<set-?>");
                    aVar.j = fVar;
                    i2++;
                } while (i2 < i);
                e eVar = oVar.i;
                k.c1(this, eVar.q.d(this, eVar.p(), j));
                return this;
            }
            e eVar2 = oVar.i;
            k.c1(this, eVar2.q.d(this, eVar2.p(), j));
            return this;
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int d(int i) {
            u uVar = this.i.i.r;
            d0 a = uVar.a();
            e eVar = uVar.a;
            return a.c(eVar.z.c, eVar.p(), i);
        }

        @Override // androidx.compose.ui.node.k
        public final void d1() {
            f.a aVar = this.i.i.A.o;
            com.amazon.aps.iva.yb0.j.c(aVar);
            aVar.H0();
        }

        @Override // com.amazon.aps.iva.u1.e0
        public final int x0(com.amazon.aps.iva.s1.a aVar) {
            int i;
            com.amazon.aps.iva.yb0.j.f(aVar, "alignmentLine");
            f.a aVar2 = this.i.i.A.o;
            com.amazon.aps.iva.yb0.j.c(aVar2);
            boolean z = aVar2.k;
            com.amazon.aps.iva.u1.d0 d0Var = aVar2.q;
            if (!z) {
                f fVar = f.this;
                if (fVar.b == e.d.LookaheadMeasuring) {
                    d0Var.f = true;
                    if (d0Var.b) {
                        fVar.g = true;
                        fVar.h = true;
                    }
                } else {
                    d0Var.g = true;
                }
            }
            k kVar = aVar2.L().H;
            if (kVar != null) {
                kVar.h = true;
            }
            aVar2.z();
            k kVar2 = aVar2.L().H;
            if (kVar2 != null) {
                kVar2.h = false;
            }
            Integer num = (Integer) d0Var.i.get(aVar);
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MIN_VALUE;
            }
            this.n.put(aVar, Integer.valueOf(i));
            return i;
        }
    }

    static {
        com.amazon.aps.iva.f1.k a2 = com.amazon.aps.iva.f1.l.a();
        a2.f(x.d);
        a2.v(1.0f);
        a2.w(1);
        I = a2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(eVar);
        a aVar;
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        k1 k1Var = new k1();
        this.G = k1Var;
        k1Var.i = this;
        if (eVar.d != null) {
            aVar = new a(this);
        } else {
            aVar = null;
        }
        this.H = aVar;
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int C(int i) {
        u uVar = this.i.r;
        d0 a2 = uVar.a();
        e eVar = uVar.a;
        return a2.b(eVar.z.c, eVar.q(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1(com.amazon.aps.iva.f1.u r7) {
        /*
            r6 = this;
            java.lang.String r0 = "canvas"
            com.amazon.aps.iva.yb0.j.f(r7, r0)
            androidx.compose.ui.node.e r0 = r6.i
            androidx.compose.ui.node.p r1 = com.amazon.aps.iva.aq.j.K(r0)
            com.amazon.aps.iva.p0.f r0 = r0.x()
            int r2 = r0.d
            if (r2 <= 0) goto L27
            T[] r0 = r0.b
            r3 = 0
        L16:
            r4 = r0[r3]
            androidx.compose.ui.node.e r4 = (androidx.compose.ui.node.e) r4
            boolean r5 = r4.G()
            if (r5 == 0) goto L23
            r4.o(r7)
        L23:
            int r3 = r3 + 1
            if (r3 < r2) goto L16
        L27:
            boolean r0 = r1.getShowLayoutBounds()
            if (r0 == 0) goto L32
            com.amazon.aps.iva.f1.k r0 = androidx.compose.ui.node.c.I
            r6.k1(r7, r0)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.c.D1(com.amazon.aps.iva.f1.u):void");
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int M(int i) {
        u uVar = this.i.r;
        d0 a2 = uVar.a();
        e eVar = uVar.a;
        return a2.a(eVar.z.c, eVar.q(), i);
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int P(int i) {
        u uVar = this.i.r;
        d0 a2 = uVar.a();
        e eVar = uVar.a;
        return a2.e(eVar.z.c, eVar.q(), i);
    }

    @Override // com.amazon.aps.iva.s1.c0
    public final u0 V(long j) {
        w0(j);
        e eVar = this.i;
        com.amazon.aps.iva.p0.f<e> y = eVar.y();
        int i = y.d;
        if (i > 0) {
            e[] eVarArr = y.b;
            int i2 = 0;
            do {
                f.b bVar = eVarArr[i2].A.n;
                e.f fVar = e.f.NotUsed;
                bVar.getClass();
                com.amazon.aps.iva.yb0.j.f(fVar, "<set-?>");
                bVar.l = fVar;
                i2++;
            } while (i2 < i);
            G1(eVar.q.d(this, eVar.q(), j));
            B1();
            return this;
        }
        G1(eVar.q.d(this, eVar.q(), j));
        B1();
        return this;
    }

    @Override // com.amazon.aps.iva.s1.l
    public final int d(int i) {
        u uVar = this.i.r;
        d0 a2 = uVar.a();
        e eVar = uVar.a;
        return a2.c(eVar.z.c, eVar.q(), i);
    }

    @Override // androidx.compose.ui.node.o
    public final void m1() {
        if (this.H == null) {
            this.H = new a(this);
        }
    }

    @Override // androidx.compose.ui.node.o
    public final k p1() {
        return this.H;
    }

    @Override // androidx.compose.ui.node.o, com.amazon.aps.iva.s1.u0
    public final void r0(long j, float f, com.amazon.aps.iva.xb0.l<? super g0, q> lVar) {
        E1(j, f, lVar);
        if (this.g) {
            return;
        }
        C1();
        this.i.A.n.H0();
    }

    @Override // androidx.compose.ui.node.o
    public final f.c r1() {
        return this.G;
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final int x0(com.amazon.aps.iva.s1.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "alignmentLine");
        k kVar = this.H;
        if (kVar != null) {
            return kVar.x0(aVar);
        }
        f.b bVar = this.i.A.n;
        boolean z = bVar.m;
        z zVar = bVar.t;
        if (!z) {
            f fVar = f.this;
            if (fVar.b == e.d.Measuring) {
                zVar.f = true;
                if (zVar.b) {
                    fVar.d = true;
                    fVar.e = true;
                }
            } else {
                zVar.g = true;
            }
        }
        bVar.L().h = true;
        bVar.z();
        bVar.L().h = false;
        Integer num = (Integer) zVar.i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0134  */
    @Override // androidx.compose.ui.node.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1(androidx.compose.ui.node.o.e r19, long r20, com.amazon.aps.iva.u1.s r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.c.x1(androidx.compose.ui.node.o$e, long, com.amazon.aps.iva.u1.s, boolean, boolean):void");
    }
}
