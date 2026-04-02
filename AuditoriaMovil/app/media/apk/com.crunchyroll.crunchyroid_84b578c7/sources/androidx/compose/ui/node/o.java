package androidx.compose.ui.node;

import androidx.compose.ui.node.e;
import androidx.compose.ui.node.f;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f1.b1;
import com.amazon.aps.iva.f1.g0;
import com.amazon.aps.iva.f1.h0;
import com.amazon.aps.iva.f1.p0;
import com.amazon.aps.iva.f1.r0;
import com.amazon.aps.iva.f1.u;
import com.amazon.aps.iva.s1.b0;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.q;
import com.amazon.aps.iva.u1.a0;
import com.amazon.aps.iva.u1.e0;
import com.amazon.aps.iva.u1.g1;
import com.amazon.aps.iva.u1.i0;
import com.amazon.aps.iva.u1.j0;
import com.amazon.aps.iva.u1.k0;
import com.amazon.aps.iva.u1.s;
import com.amazon.aps.iva.u1.u0;
import com.amazon.aps.iva.u1.v;
import com.amazon.aps.iva.u1.v0;
import com.amazon.aps.iva.u1.w;
import com.amazon.aps.iva.yb0.d0;
import java.util.LinkedHashMap;
/* compiled from: NodeCoordinator.kt */
/* loaded from: classes.dex */
public abstract class o extends e0 implements c0, q, v0, com.amazon.aps.iva.xb0.l<u, com.amazon.aps.iva.kb0.q> {
    public static final d A = d.h;
    public static final c B = c.h;
    public static final r0 C = new r0();
    public static final v D = new v();
    public static final a E;
    public static final b F;
    public final androidx.compose.ui.node.e i;
    public o j;
    public o k;
    public boolean l;
    public boolean m;
    public com.amazon.aps.iva.xb0.l<? super g0, com.amazon.aps.iva.kb0.q> n;
    public com.amazon.aps.iva.o2.c o;
    public com.amazon.aps.iva.o2.l p;
    public float q;
    public com.amazon.aps.iva.s1.e0 r;
    public LinkedHashMap s;
    public long t;
    public float u;
    public com.amazon.aps.iva.e1.b v;
    public v w;
    public final h x;
    public boolean y;
    public u0 z;

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class a implements e {
        @Override // androidx.compose.ui.node.o.e
        public final int a() {
            return 16;
        }

        @Override // androidx.compose.ui.node.o.e
        public final boolean b(f.c cVar) {
            boolean z;
            boolean z2;
            com.amazon.aps.iva.yb0.j.f(cVar, "node");
            com.amazon.aps.iva.p0.f fVar = null;
            while (cVar != null) {
                if (cVar instanceof g1) {
                    ((g1) cVar).M();
                } else {
                    if ((cVar.d & 16) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (cVar instanceof com.amazon.aps.iva.u1.j)) {
                        int i = 0;
                        for (f.c cVar2 = ((com.amazon.aps.iva.u1.j) cVar).p; cVar2 != null; cVar2 = cVar2.g) {
                            if ((cVar2.d & 16) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                i++;
                                if (i == 1) {
                                    cVar = cVar2;
                                } else {
                                    if (fVar == null) {
                                        fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                    }
                                    if (cVar != null) {
                                        fVar.b(cVar);
                                        cVar = null;
                                    }
                                    fVar.b(cVar2);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                }
                cVar = com.amazon.aps.iva.u1.i.b(fVar);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.o.e
        public final void c(androidx.compose.ui.node.e eVar, long j, s sVar, boolean z, boolean z2) {
            com.amazon.aps.iva.yb0.j.f(sVar, "hitTestResult");
            eVar.z(j, sVar, z, z2);
        }

        @Override // androidx.compose.ui.node.o.e
        public final boolean d(androidx.compose.ui.node.e eVar) {
            com.amazon.aps.iva.yb0.j.f(eVar, "parentLayoutNode");
            return true;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class b implements e {
        @Override // androidx.compose.ui.node.o.e
        public final int a() {
            return 8;
        }

        @Override // androidx.compose.ui.node.o.e
        public final boolean b(f.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "node");
            return false;
        }

        @Override // androidx.compose.ui.node.o.e
        public final void c(androidx.compose.ui.node.e eVar, long j, s sVar, boolean z, boolean z2) {
            com.amazon.aps.iva.yb0.j.f(sVar, "hitTestResult");
            m mVar = eVar.z;
            mVar.c.w1(o.F, mVar.c.o1(j), sVar, true, z2);
        }

        @Override // androidx.compose.ui.node.o.e
        public final boolean d(androidx.compose.ui.node.e eVar) {
            com.amazon.aps.iva.yb0.j.f(eVar, "parentLayoutNode");
            com.amazon.aps.iva.a2.l s = eVar.s();
            boolean z = false;
            if (s != null && s.d) {
                z = true;
            }
            return !z;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<o, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(o oVar) {
            o oVar2 = oVar;
            com.amazon.aps.iva.yb0.j.f(oVar2, "coordinator");
            u0 u0Var = oVar2.z;
            if (u0Var != null) {
                u0Var.invalidate();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<o, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
            if (r0 != false) goto L42;
         */
        @Override // com.amazon.aps.iva.xb0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.kb0.q invoke(androidx.compose.ui.node.o r8) {
            /*
                Method dump skipped, instructions count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.o.d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public interface e {
        int a();

        boolean b(f.c cVar);

        void c(androidx.compose.ui.node.e eVar, long j, s sVar, boolean z, boolean z2);

        boolean d(androidx.compose.ui.node.e eVar);
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f.c i;
        public final /* synthetic */ e j;
        public final /* synthetic */ long k;
        public final /* synthetic */ s l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ boolean n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f.c cVar, e eVar, long j, s sVar, boolean z, boolean z2) {
            super(0);
            this.i = cVar;
            this.j = eVar;
            this.k = j;
            this.l = sVar;
            this.m = z;
            this.n = z2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            o.this.u1(j0.a(this.i, this.j.a()), this.j, this.k, this.l, this.m, this.n);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f.c i;
        public final /* synthetic */ e j;
        public final /* synthetic */ long k;
        public final /* synthetic */ s l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ boolean n;
        public final /* synthetic */ float o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f.c cVar, e eVar, long j, s sVar, boolean z, boolean z2, float f) {
            super(0);
            this.i = cVar;
            this.j = eVar;
            this.k = j;
            this.l = sVar;
            this.m = z;
            this.n = z2;
            this.o = f;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            o.this.v1(j0.a(this.i, this.j.a()), this.j, this.k, this.l, this.m, this.n, this.o);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            o oVar = o.this.k;
            if (oVar != null) {
                oVar.y1();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f.c i;
        public final /* synthetic */ e j;
        public final /* synthetic */ long k;
        public final /* synthetic */ s l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ boolean n;
        public final /* synthetic */ float o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f.c cVar, e eVar, long j, s sVar, boolean z, boolean z2, float f) {
            super(0);
            this.i = cVar;
            this.j = eVar;
            this.k = j;
            this.l = sVar;
            this.m = z;
            this.n = z2;
            this.o = f;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            o.this.H1(j0.a(this.i, this.j.a()), this.j, this.k, this.l, this.m, this.n, this.o);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<g0, com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(com.amazon.aps.iva.xb0.l<? super g0, com.amazon.aps.iva.kb0.q> lVar) {
            super(0);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.invoke(o.C);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    static {
        com.amazon.aps.iva.aq.k.k();
        E = new a();
        F = new b();
    }

    public o(androidx.compose.ui.node.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        this.i = eVar;
        this.o = eVar.s;
        this.p = eVar.t;
        this.q = 0.8f;
        this.t = com.amazon.aps.iva.o2.h.b;
        this.x = new h();
    }

    public final void A1() {
        boolean z;
        androidx.compose.ui.node.f fVar = this.i.A;
        e.d dVar = fVar.a.A.b;
        if (dVar == e.d.LayingOut || dVar == e.d.LookaheadLayingOut) {
            if (fVar.n.w) {
                fVar.e(true);
            } else {
                fVar.d(true);
            }
        }
        if (dVar == e.d.LookaheadLayingOut) {
            f.a aVar = fVar.o;
            if (aVar != null && aVar.t) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                fVar.e(true);
            } else {
                fVar.d(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1() {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.o.B1():void");
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final e0 C0() {
        return this.j;
    }

    public final void C1() {
        boolean z;
        boolean z2;
        boolean h2 = k0.h(128);
        f.c r1 = r1();
        if (h2 || (r1 = r1.f) != null) {
            for (f.c t1 = t1(h2); t1 != null && (t1.e & 128) != 0; t1 = t1.g) {
                if ((t1.d & 128) != 0) {
                    f.c cVar = t1;
                    com.amazon.aps.iva.p0.f fVar = null;
                    while (cVar != null) {
                        if (cVar instanceof w) {
                            ((w) cVar).v(this);
                        } else {
                            if ((cVar.d & 128) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (cVar instanceof com.amazon.aps.iva.u1.j)) {
                                int i2 = 0;
                                for (f.c cVar2 = ((com.amazon.aps.iva.u1.j) cVar).p; cVar2 != null; cVar2 = cVar2.g) {
                                    if ((cVar2.d & 128) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVar = cVar2;
                                        } else {
                                            if (fVar == null) {
                                                fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                            }
                                            if (cVar != null) {
                                                fVar.b(cVar);
                                                cVar = null;
                                            }
                                            fVar.b(cVar2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                        }
                        cVar = com.amazon.aps.iva.u1.i.b(fVar);
                    }
                }
                if (t1 == r1) {
                    return;
                }
            }
        }
    }

    public void D1(u uVar) {
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        o oVar = this.j;
        if (oVar != null) {
            oVar.j1(uVar);
        }
    }

    public final void E1(long j2, float f2, com.amazon.aps.iva.xb0.l<? super g0, com.amazon.aps.iva.kb0.q> lVar) {
        J1(lVar, false);
        if (!com.amazon.aps.iva.o2.h.a(this.t, j2)) {
            this.t = j2;
            androidx.compose.ui.node.e eVar = this.i;
            eVar.A.n.D0();
            u0 u0Var = this.z;
            if (u0Var != null) {
                u0Var.h(j2);
            } else {
                o oVar = this.k;
                if (oVar != null) {
                    oVar.y1();
                }
            }
            e0.Y0(this);
            p pVar = eVar.j;
            if (pVar != null) {
                pVar.e(eVar);
            }
        }
        this.u = f2;
    }

    public final void F1(com.amazon.aps.iva.e1.b bVar, boolean z, boolean z2) {
        u0 u0Var = this.z;
        if (u0Var != null) {
            if (this.m) {
                if (z2) {
                    long q1 = q1();
                    float d2 = com.amazon.aps.iva.e1.g.d(q1) / 2.0f;
                    float b2 = com.amazon.aps.iva.e1.g.b(q1) / 2.0f;
                    long j2 = this.d;
                    bVar.a(-d2, -b2, ((int) (j2 >> 32)) + d2, com.amazon.aps.iva.o2.j.b(j2) + b2);
                } else if (z) {
                    long j3 = this.d;
                    bVar.a(0.0f, 0.0f, (int) (j3 >> 32), com.amazon.aps.iva.o2.j.b(j3));
                }
                if (bVar.b()) {
                    return;
                }
            }
            u0Var.a(bVar, false);
        }
        long j4 = this.t;
        int i2 = com.amazon.aps.iva.o2.h.c;
        float f2 = (int) (j4 >> 32);
        bVar.a += f2;
        bVar.c += f2;
        float b3 = com.amazon.aps.iva.o2.h.b(j4);
        bVar.b += b3;
        bVar.d += b3;
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final boolean G0() {
        if (this.r != null) {
            return true;
        }
        return false;
    }

    public final void G1(com.amazon.aps.iva.s1.e0 e0Var) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(e0Var, "value");
        com.amazon.aps.iva.s1.e0 e0Var2 = this.r;
        if (e0Var != e0Var2) {
            this.r = e0Var;
            androidx.compose.ui.node.e eVar = this.i;
            boolean z3 = false;
            if (e0Var2 == null || e0Var.getWidth() != e0Var2.getWidth() || e0Var.getHeight() != e0Var2.getHeight()) {
                int width = e0Var.getWidth();
                int height = e0Var.getHeight();
                u0 u0Var = this.z;
                if (u0Var != null) {
                    u0Var.c(com.amazon.aps.iva.o2.k.a(width, height));
                } else {
                    o oVar = this.k;
                    if (oVar != null) {
                        oVar.y1();
                    }
                }
                s0(com.amazon.aps.iva.o2.k.a(width, height));
                K1(false);
                boolean h2 = k0.h(4);
                f.c r1 = r1();
                if (h2 || (r1 = r1.f) != null) {
                    for (f.c t1 = t1(h2); t1 != null && (t1.e & 4) != 0; t1 = t1.g) {
                        if ((t1.d & 4) != 0) {
                            f.c cVar = t1;
                            com.amazon.aps.iva.p0.f fVar = null;
                            while (cVar != null) {
                                if (cVar instanceof com.amazon.aps.iva.u1.o) {
                                    ((com.amazon.aps.iva.u1.o) cVar).H0();
                                } else {
                                    if ((cVar.d & 4) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z && (cVar instanceof com.amazon.aps.iva.u1.j)) {
                                        int i2 = 0;
                                        for (f.c cVar2 = ((com.amazon.aps.iva.u1.j) cVar).p; cVar2 != null; cVar2 = cVar2.g) {
                                            if ((cVar2.d & 4) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cVar = cVar2;
                                                } else {
                                                    if (fVar == null) {
                                                        fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                    }
                                                    if (cVar != null) {
                                                        fVar.b(cVar);
                                                        cVar = null;
                                                    }
                                                    fVar.b(cVar2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                }
                                cVar = com.amazon.aps.iva.u1.i.b(fVar);
                            }
                        }
                        if (t1 == r1) {
                            break;
                        }
                    }
                }
                p pVar = eVar.j;
                if (pVar != null) {
                    pVar.e(eVar);
                }
            }
            LinkedHashMap linkedHashMap = this.s;
            if ((!((linkedHashMap == null || linkedHashMap.isEmpty()) ? true : true) || (!e0Var.c().isEmpty())) && !com.amazon.aps.iva.yb0.j.a(e0Var.c(), this.s)) {
                eVar.A.n.t.g();
                LinkedHashMap linkedHashMap2 = this.s;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.s = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(e0Var.c());
            }
        }
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final androidx.compose.ui.node.e H0() {
        return this.i;
    }

    public final void H1(f.c cVar, e eVar, long j2, s sVar, boolean z, boolean z2, float f2) {
        if (cVar == null) {
            x1(eVar, j2, sVar, z, z2);
        } else if (eVar.b(cVar)) {
            i iVar = new i(cVar, eVar, j2, sVar, z, z2, f2);
            sVar.getClass();
            if (sVar.d == f1.B(sVar)) {
                sVar.d(cVar, f2, z2, iVar);
                if (sVar.d + 1 == f1.B(sVar)) {
                    sVar.e();
                    return;
                }
                return;
            }
            long b2 = sVar.b();
            int i2 = sVar.d;
            sVar.d = f1.B(sVar);
            sVar.d(cVar, f2, z2, iVar);
            if (sVar.d + 1 < f1.B(sVar) && com.amazon.aps.iva.e.w.s(b2, sVar.b()) > 0) {
                int i3 = sVar.d + 1;
                int i4 = i2 + 1;
                Object[] objArr = sVar.b;
                com.amazon.aps.iva.lb0.m.F(objArr, i4, objArr, i3, sVar.e);
                long[] jArr = sVar.c;
                int i5 = sVar.e;
                com.amazon.aps.iva.yb0.j.f(jArr, "<this>");
                System.arraycopy(jArr, i3, jArr, i4, i5 - i3);
                sVar.d = ((sVar.e + i2) - sVar.d) - 1;
            }
            sVar.e();
            sVar.d = i2;
        } else {
            H1(j0.a(cVar, eVar.a()), eVar, j2, sVar, z, z2, f2);
        }
    }

    public final long I1(long j2) {
        u0 u0Var = this.z;
        if (u0Var != null) {
            j2 = u0Var.b(j2, false);
        }
        long j3 = this.t;
        float c2 = com.amazon.aps.iva.e1.c.c(j2);
        int i2 = com.amazon.aps.iva.o2.h.c;
        return com.amazon.aps.iva.e1.d.d(c2 + ((int) (j3 >> 32)), com.amazon.aps.iva.e1.c.d(j2) + com.amazon.aps.iva.o2.h.b(j3));
    }

    @Override // com.amazon.aps.iva.s1.q
    public final long J(long j2) {
        return com.amazon.aps.iva.aq.j.K(this.i).c(d0(j2));
    }

    public final void J1(com.amazon.aps.iva.xb0.l<? super g0, com.amazon.aps.iva.kb0.q> lVar, boolean z) {
        boolean z2;
        p pVar;
        androidx.compose.ui.node.e eVar = this.i;
        if (!z && this.n == lVar && com.amazon.aps.iva.yb0.j.a(this.o, eVar.s) && this.p == eVar.t) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.n = lVar;
        this.o = eVar.s;
        this.p = eVar.t;
        boolean l = l();
        h hVar = this.x;
        if (l && lVar != null) {
            if (this.z == null) {
                u0 g2 = com.amazon.aps.iva.aq.j.K(eVar).g(hVar, this);
                g2.c(this.d);
                g2.h(this.t);
                this.z = g2;
                K1(true);
                eVar.D = true;
                hVar.invoke();
                return;
            } else if (z2) {
                K1(true);
                return;
            } else {
                return;
            }
        }
        u0 u0Var = this.z;
        if (u0Var != null) {
            u0Var.destroy();
            eVar.D = true;
            hVar.invoke();
            if (l() && (pVar = eVar.j) != null) {
                pVar.e(eVar);
            }
        }
        this.z = null;
        this.y = false;
    }

    public final void K1(boolean z) {
        p pVar;
        u0 u0Var = this.z;
        boolean z2 = false;
        if (u0Var != null) {
            com.amazon.aps.iva.xb0.l<? super g0, com.amazon.aps.iva.kb0.q> lVar = this.n;
            if (lVar != null) {
                r0 r0Var = C;
                r0Var.b = 1.0f;
                r0Var.c = 1.0f;
                r0Var.d = 1.0f;
                r0Var.e = 0.0f;
                r0Var.f = 0.0f;
                r0Var.g = 0.0f;
                long j2 = h0.a;
                r0Var.h = j2;
                r0Var.i = j2;
                r0Var.j = 0.0f;
                r0Var.k = 0.0f;
                r0Var.l = 0.0f;
                r0Var.m = 8.0f;
                r0Var.n = b1.b;
                r0Var.o = p0.a;
                r0Var.p = false;
                r0Var.q = 0;
                int i2 = com.amazon.aps.iva.e1.g.d;
                androidx.compose.ui.node.e eVar = this.i;
                com.amazon.aps.iva.o2.c cVar = eVar.s;
                com.amazon.aps.iva.yb0.j.f(cVar, "<set-?>");
                r0Var.r = cVar;
                com.amazon.aps.iva.o2.k.b(this.d);
                com.amazon.aps.iva.aq.j.K(eVar).getSnapshotObserver().a(this, A, new j(lVar));
                v vVar = this.w;
                if (vVar == null) {
                    vVar = new v();
                    this.w = vVar;
                }
                float f2 = r0Var.b;
                vVar.a = f2;
                float f3 = r0Var.c;
                vVar.b = f3;
                float f4 = r0Var.e;
                vVar.c = f4;
                float f5 = r0Var.f;
                vVar.d = f5;
                float f6 = r0Var.j;
                vVar.e = f6;
                float f7 = r0Var.k;
                vVar.f = f7;
                float f8 = r0Var.l;
                vVar.g = f8;
                float f9 = r0Var.m;
                vVar.h = f9;
                long j3 = r0Var.n;
                vVar.i = j3;
                u0Var.e(f2, f3, r0Var.d, f4, f5, r0Var.g, f6, f7, f8, f9, j3, r0Var.o, r0Var.p, r0Var.h, r0Var.i, r0Var.q, eVar.t, eVar.s);
                this.m = r0Var.p;
                this.q = r0Var.d;
                if (z && (pVar = eVar.j) != null) {
                    pVar.e(eVar);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (this.n == null) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final com.amazon.aps.iva.s1.e0 M0() {
        com.amazon.aps.iva.s1.e0 e0Var = this.r;
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float O0() {
        return this.i.s.O0();
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final e0 Q0() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final long W0() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.s1.q
    public final q Z() {
        if (l()) {
            A1();
            return this.i.z.c.k;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // com.amazon.aps.iva.s1.q
    public final long a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.s1.q
    public final long a0(q qVar, long j2) {
        b0 b0Var;
        o oVar;
        com.amazon.aps.iva.yb0.j.f(qVar, "sourceCoordinates");
        boolean z = qVar instanceof b0;
        if (z) {
            long a0 = qVar.a0(this, com.amazon.aps.iva.e1.d.d(-com.amazon.aps.iva.e1.c.c(j2), -com.amazon.aps.iva.e1.c.d(j2)));
            return com.amazon.aps.iva.e1.d.d(-com.amazon.aps.iva.e1.c.c(a0), -com.amazon.aps.iva.e1.c.d(a0));
        }
        if (z) {
            b0Var = (b0) qVar;
        } else {
            b0Var = null;
        }
        if (b0Var == null || (oVar = b0Var.b.i) == null) {
            oVar = (o) qVar;
        }
        oVar.A1();
        o n1 = n1(oVar);
        while (oVar != n1) {
            j2 = oVar.I1(j2);
            oVar = oVar.k;
            com.amazon.aps.iva.yb0.j.c(oVar);
        }
        return d1(n1, j2);
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final void a1() {
        r0(this.t, this.u, this.n);
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Object] */
    @Override // com.amazon.aps.iva.s1.g0, com.amazon.aps.iva.s1.l
    public final Object b() {
        boolean z;
        boolean z2;
        boolean z3;
        androidx.compose.ui.node.e eVar = this.i;
        if (!eVar.z.d(64)) {
            return null;
        }
        r1();
        d0 d0Var = new d0();
        for (f.c cVar = eVar.z.d; cVar != null; cVar = cVar.f) {
            if ((cVar.d & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                com.amazon.aps.iva.p0.f fVar = null;
                f.c cVar2 = cVar;
                while (cVar2 != null) {
                    if (cVar2 instanceof com.amazon.aps.iva.u1.f1) {
                        d0Var.b = ((com.amazon.aps.iva.u1.f1) cVar2).i0(eVar.s, d0Var.b);
                    } else {
                        if ((cVar2.d & 64) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 && (cVar2 instanceof com.amazon.aps.iva.u1.j)) {
                            int i2 = 0;
                            for (f.c cVar3 = ((com.amazon.aps.iva.u1.j) cVar2).p; cVar3 != null; cVar3 = cVar3.g) {
                                if ((cVar3.d & 64) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    i2++;
                                    if (i2 == 1) {
                                        cVar2 = cVar3;
                                    } else {
                                        if (fVar == null) {
                                            fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                        }
                                        if (cVar2 != null) {
                                            fVar.b(cVar2);
                                            cVar2 = null;
                                        }
                                        fVar.b(cVar3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                    }
                    cVar2 = com.amazon.aps.iva.u1.i.b(fVar);
                }
            }
        }
        return d0Var.b;
    }

    public final void c1(o oVar, com.amazon.aps.iva.e1.b bVar, boolean z) {
        if (oVar == this) {
            return;
        }
        o oVar2 = this.k;
        if (oVar2 != null) {
            oVar2.c1(oVar, bVar, z);
        }
        long j2 = this.t;
        int i2 = com.amazon.aps.iva.o2.h.c;
        float f2 = (int) (j2 >> 32);
        bVar.a -= f2;
        bVar.c -= f2;
        float b2 = com.amazon.aps.iva.o2.h.b(j2);
        bVar.b -= b2;
        bVar.d -= b2;
        u0 u0Var = this.z;
        if (u0Var != null) {
            u0Var.a(bVar, true);
            if (this.m && z) {
                long j3 = this.d;
                bVar.a(0.0f, 0.0f, (int) (j3 >> 32), com.amazon.aps.iva.o2.j.b(j3));
            }
        }
    }

    @Override // com.amazon.aps.iva.s1.q
    public final long d0(long j2) {
        if (l()) {
            A1();
            for (o oVar = this; oVar != null; oVar = oVar.k) {
                j2 = oVar.I1(j2);
            }
            return j2;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final long d1(o oVar, long j2) {
        if (oVar == this) {
            return j2;
        }
        o oVar2 = this.k;
        if (oVar2 != null && !com.amazon.aps.iva.yb0.j.a(oVar, oVar2)) {
            return o1(oVar2.d1(oVar, j2));
        }
        return o1(j2);
    }

    @Override // com.amazon.aps.iva.s1.q
    public final com.amazon.aps.iva.e1.e f(q qVar, boolean z) {
        b0 b0Var;
        o oVar;
        com.amazon.aps.iva.yb0.j.f(qVar, "sourceCoordinates");
        if (l()) {
            if (qVar.l()) {
                if (qVar instanceof b0) {
                    b0Var = (b0) qVar;
                } else {
                    b0Var = null;
                }
                if (b0Var == null || (oVar = b0Var.b.i) == null) {
                    oVar = (o) qVar;
                }
                oVar.A1();
                o n1 = n1(oVar);
                com.amazon.aps.iva.e1.b bVar = this.v;
                if (bVar == null) {
                    bVar = new com.amazon.aps.iva.e1.b();
                    this.v = bVar;
                }
                bVar.a = 0.0f;
                bVar.b = 0.0f;
                bVar.c = (int) (qVar.a() >> 32);
                bVar.d = com.amazon.aps.iva.o2.j.b(qVar.a());
                while (oVar != n1) {
                    oVar.F1(bVar, z, false);
                    if (bVar.b()) {
                        return com.amazon.aps.iva.e1.e.e;
                    }
                    oVar = oVar.k;
                    com.amazon.aps.iva.yb0.j.c(oVar);
                }
                c1(n1, bVar, z);
                return new com.amazon.aps.iva.e1.e(bVar.a, bVar.b, bVar.c, bVar.d);
            }
            throw new IllegalStateException(("LayoutCoordinates " + qVar + " is not attached!").toString());
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final long g1(long j2) {
        return r.d(Math.max(0.0f, (com.amazon.aps.iva.e1.g.d(j2) - o0()) / 2.0f), Math.max(0.0f, (com.amazon.aps.iva.e1.g.b(j2) - k0()) / 2.0f));
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float getDensity() {
        return this.i.s.getDensity();
    }

    @Override // com.amazon.aps.iva.s1.m
    public final com.amazon.aps.iva.o2.l getLayoutDirection() {
        return this.i.t;
    }

    public final float i1(long j2, long j3) {
        float o0;
        float k0;
        if (o0() >= com.amazon.aps.iva.e1.g.d(j3) && k0() >= com.amazon.aps.iva.e1.g.b(j3)) {
            return Float.POSITIVE_INFINITY;
        }
        long g1 = g1(j3);
        float d2 = com.amazon.aps.iva.e1.g.d(g1);
        float b2 = com.amazon.aps.iva.e1.g.b(g1);
        float c2 = com.amazon.aps.iva.e1.c.c(j2);
        if (c2 < 0.0f) {
            o0 = -c2;
        } else {
            o0 = c2 - o0();
        }
        float max = Math.max(0.0f, o0);
        float d3 = com.amazon.aps.iva.e1.c.d(j2);
        if (d3 < 0.0f) {
            k0 = -d3;
        } else {
            k0 = d3 - k0();
        }
        long d4 = com.amazon.aps.iva.e1.d.d(max, Math.max(0.0f, k0));
        if ((d2 <= 0.0f && b2 <= 0.0f) || com.amazon.aps.iva.e1.c.c(d4) > d2 || com.amazon.aps.iva.e1.c.d(d4) > b2) {
            return Float.POSITIVE_INFINITY;
        }
        return (com.amazon.aps.iva.e1.c.d(d4) * com.amazon.aps.iva.e1.c.d(d4)) + (com.amazon.aps.iva.e1.c.c(d4) * com.amazon.aps.iva.e1.c.c(d4));
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(u uVar) {
        u uVar2 = uVar;
        com.amazon.aps.iva.yb0.j.f(uVar2, "canvas");
        androidx.compose.ui.node.e eVar = this.i;
        if (eVar.G()) {
            com.amazon.aps.iva.aq.j.K(eVar).getSnapshotObserver().a(this, B, new i0(this, uVar2));
            this.y = false;
        } else {
            this.y = true;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    public final void j1(u uVar) {
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        u0 u0Var = this.z;
        if (u0Var != null) {
            u0Var.f(uVar);
            return;
        }
        long j2 = this.t;
        float f2 = (int) (j2 >> 32);
        float b2 = com.amazon.aps.iva.o2.h.b(j2);
        uVar.f(f2, b2);
        l1(uVar);
        uVar.f(-f2, -b2);
    }

    public final void k1(u uVar, com.amazon.aps.iva.f1.k kVar) {
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        com.amazon.aps.iva.yb0.j.f(kVar, "paint");
        long j2 = this.d;
        uVar.c(new com.amazon.aps.iva.e1.e(0.5f, 0.5f, ((int) (j2 >> 32)) - 0.5f, com.amazon.aps.iva.o2.j.b(j2) - 0.5f), kVar);
    }

    @Override // com.amazon.aps.iva.s1.q
    public final boolean l() {
        if (!this.l && this.i.F()) {
            return true;
        }
        return false;
    }

    public final void l1(u uVar) {
        boolean z;
        boolean z2;
        f.c s1 = s1(4);
        if (s1 == null) {
            D1(uVar);
            return;
        }
        androidx.compose.ui.node.e eVar = this.i;
        eVar.getClass();
        a0 sharedDrawScope = com.amazon.aps.iva.aq.j.K(eVar).getSharedDrawScope();
        long b2 = com.amazon.aps.iva.o2.k.b(this.d);
        sharedDrawScope.getClass();
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        com.amazon.aps.iva.p0.f fVar = null;
        while (s1 != null) {
            if (s1 instanceof com.amazon.aps.iva.u1.o) {
                sharedDrawScope.b(uVar, b2, this, (com.amazon.aps.iva.u1.o) s1);
            } else {
                if ((s1.d & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (s1 instanceof com.amazon.aps.iva.u1.j)) {
                    int i2 = 0;
                    for (f.c cVar = ((com.amazon.aps.iva.u1.j) s1).p; cVar != null; cVar = cVar.g) {
                        if ((cVar.d & 4) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i2++;
                            if (i2 == 1) {
                                s1 = cVar;
                            } else {
                                if (fVar == null) {
                                    fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                }
                                if (s1 != null) {
                                    fVar.b(s1);
                                    s1 = null;
                                }
                                fVar.b(cVar);
                            }
                        }
                    }
                    if (i2 == 1) {
                    }
                }
            }
            s1 = com.amazon.aps.iva.u1.i.b(fVar);
        }
    }

    public abstract void m1();

    public final o n1(o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "other");
        androidx.compose.ui.node.e eVar = this.i;
        androidx.compose.ui.node.e eVar2 = oVar.i;
        if (eVar2 == eVar) {
            f.c r1 = oVar.r1();
            f.c r12 = r1();
            if (r12.V().n) {
                for (f.c cVar = r12.V().f; cVar != null; cVar = cVar.f) {
                    if ((cVar.d & 2) != 0 && cVar == r1) {
                        return oVar;
                    }
                }
                return this;
            }
            throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.node.e eVar3 = eVar2;
        while (eVar3.l > eVar.l) {
            eVar3 = eVar3.v();
            com.amazon.aps.iva.yb0.j.c(eVar3);
        }
        androidx.compose.ui.node.e eVar4 = eVar;
        while (eVar4.l > eVar3.l) {
            eVar4 = eVar4.v();
            com.amazon.aps.iva.yb0.j.c(eVar4);
        }
        while (eVar3 != eVar4) {
            eVar3 = eVar3.v();
            eVar4 = eVar4.v();
            if (eVar3 != null) {
                if (eVar4 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        if (eVar4 == eVar) {
            return this;
        }
        if (eVar3 != eVar2) {
            return eVar3.z.b;
        }
        return oVar;
    }

    public final long o1(long j2) {
        long j3 = this.t;
        float c2 = com.amazon.aps.iva.e1.c.c(j2);
        int i2 = com.amazon.aps.iva.o2.h.c;
        long d2 = com.amazon.aps.iva.e1.d.d(c2 - ((int) (j3 >> 32)), com.amazon.aps.iva.e1.c.d(j2) - com.amazon.aps.iva.o2.h.b(j3));
        u0 u0Var = this.z;
        if (u0Var != null) {
            return u0Var.b(d2, true);
        }
        return d2;
    }

    public abstract k p1();

    public final long q1() {
        return this.o.b1(this.i.u.d());
    }

    @Override // com.amazon.aps.iva.s1.u0
    public void r0(long j2, float f2, com.amazon.aps.iva.xb0.l<? super g0, com.amazon.aps.iva.kb0.q> lVar) {
        E1(j2, f2, lVar);
    }

    public abstract f.c r1();

    public final f.c s1(int i2) {
        boolean h2 = k0.h(i2);
        f.c r1 = r1();
        if (h2 || (r1 = r1.f) != null) {
            for (f.c t1 = t1(h2); t1 != null && (t1.e & i2) != 0; t1 = t1.g) {
                if ((t1.d & i2) != 0) {
                    return t1;
                }
                if (t1 == r1) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final f.c t1(boolean z) {
        f.c r1;
        m mVar = this.i.z;
        if (mVar.c == this) {
            return mVar.e;
        }
        if (z) {
            o oVar = this.k;
            if (oVar != null && (r1 = oVar.r1()) != null) {
                return r1.g;
            }
        } else {
            o oVar2 = this.k;
            if (oVar2 != null) {
                return oVar2.r1();
            }
        }
        return null;
    }

    public final void u1(f.c cVar, e eVar, long j2, s sVar, boolean z, boolean z2) {
        if (cVar == null) {
            x1(eVar, j2, sVar, z, z2);
            return;
        }
        f fVar = new f(cVar, eVar, j2, sVar, z, z2);
        sVar.getClass();
        sVar.d(cVar, -1.0f, z2, fVar);
    }

    @Override // com.amazon.aps.iva.s1.q
    public final long v(long j2) {
        if (l()) {
            q f2 = com.amazon.aps.iva.gd0.j.f(this);
            return a0(f2, com.amazon.aps.iva.e1.c.e(com.amazon.aps.iva.aq.j.K(this.i).m(j2), com.amazon.aps.iva.gd0.j.h(f2)));
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final void v1(f.c cVar, e eVar, long j2, s sVar, boolean z, boolean z2, float f2) {
        if (cVar == null) {
            x1(eVar, j2, sVar, z, z2);
        } else {
            sVar.d(cVar, f2, z2, new g(cVar, eVar, j2, sVar, z, z2, f2));
        }
    }

    public final void w1(e eVar, long j2, s sVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        float i1;
        boolean z5;
        boolean z6;
        u0 u0Var;
        com.amazon.aps.iva.yb0.j.f(eVar, "hitTestSource");
        com.amazon.aps.iva.yb0.j.f(sVar, "hitTestResult");
        f.c s1 = s1(eVar.a());
        boolean z7 = true;
        if (!com.amazon.aps.iva.e1.d.g(j2) || ((u0Var = this.z) != null && this.m && !u0Var.g(j2))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            if (z) {
                float i12 = i1(j2, q1());
                if (!Float.isInfinite(i12) && !Float.isNaN(i12)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (sVar.d != f1.B(sVar)) {
                        if (com.amazon.aps.iva.e.w.s(sVar.b(), z.k(i12, false)) <= 0) {
                            z7 = false;
                        }
                    }
                    if (z7) {
                        v1(s1, eVar, j2, sVar, z, false, i12);
                    }
                }
            }
        } else if (s1 == null) {
            x1(eVar, j2, sVar, z, z2);
        } else {
            float c2 = com.amazon.aps.iva.e1.c.c(j2);
            float d2 = com.amazon.aps.iva.e1.c.d(j2);
            if (c2 >= 0.0f && d2 >= 0.0f && c2 < o0() && d2 < k0()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                u1(s1, eVar, j2, sVar, z, z2);
                return;
            }
            if (!z) {
                i1 = Float.POSITIVE_INFINITY;
            } else {
                i1 = i1(j2, q1());
            }
            float f2 = i1;
            if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (sVar.d != f1.B(sVar)) {
                    if (com.amazon.aps.iva.e.w.s(sVar.b(), z.k(f2, z2)) <= 0) {
                        z7 = false;
                    }
                }
                if (z7) {
                    v1(s1, eVar, j2, sVar, z, z2, f2);
                    return;
                }
            }
            H1(s1, eVar, j2, sVar, z, z2, f2);
        }
    }

    public void x1(e eVar, long j2, s sVar, boolean z, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(eVar, "hitTestSource");
        com.amazon.aps.iva.yb0.j.f(sVar, "hitTestResult");
        o oVar = this.j;
        if (oVar != null) {
            oVar.w1(eVar, oVar.o1(j2), sVar, z, z2);
        }
    }

    @Override // com.amazon.aps.iva.u1.v0
    public final boolean y0() {
        if (this.z != null && l()) {
            return true;
        }
        return false;
    }

    public final void y1() {
        u0 u0Var = this.z;
        if (u0Var != null) {
            u0Var.invalidate();
            return;
        }
        o oVar = this.k;
        if (oVar != null) {
            oVar.y1();
        }
    }

    public final boolean z1() {
        if (this.z != null && this.q <= 0.0f) {
            return true;
        }
        o oVar = this.k;
        if (oVar != null) {
            return oVar.z1();
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.e0
    public final q D0() {
        return this;
    }
}
