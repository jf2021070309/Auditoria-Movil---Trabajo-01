package com.amazon.aps.iva.k0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.v;
import com.amazon.aps.iva.a2.y;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.t0;
import com.amazon.aps.iva.f1.u;
import com.amazon.aps.iva.f1.z;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.j0.f1;
import com.amazon.aps.iva.k0.b;
import com.amazon.aps.iva.o2.a;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.e0;
import com.amazon.aps.iva.s1.f0;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.u1.i1;
import com.amazon.aps.iva.u1.x;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: TextStringSimpleNode.kt */
/* loaded from: classes.dex */
public final class q extends f.c implements x, com.amazon.aps.iva.u1.o, i1 {
    public String o;
    public a0 p;
    public k.a q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public z v;
    public Map<com.amazon.aps.iva.s1.a, Integer> w;
    public e x;
    public p y;

    /* compiled from: TextStringSimpleNode.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ u0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0 u0Var) {
            super(1);
            this.h = u0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            u0.a.c(this.h, 0, 0, 0.0f);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public q(String str, a0 a0Var, k.a aVar, int i, boolean z, int i2, int i3, z zVar) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        com.amazon.aps.iva.yb0.j.f(a0Var, "style");
        com.amazon.aps.iva.yb0.j.f(aVar, "fontFamilyResolver");
        this.o = str;
        this.p = a0Var;
        this.q = aVar;
        this.r = i;
        this.s = z;
        this.t = i2;
        this.u = i3;
        this.v = zVar;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int b(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        e u1 = u1(mVar);
        com.amazon.aps.iva.o2.l layoutDirection = mVar.getLayoutDirection();
        com.amazon.aps.iva.yb0.j.f(layoutDirection, "layoutDirection");
        return f1.a(u1.d(layoutDirection).c());
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int c(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return u1(mVar).a(i, mVar.getLayoutDirection());
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int d(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        return u1(mVar).a(i, mVar.getLayoutDirection());
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int e(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        e u1 = u1(mVar);
        com.amazon.aps.iva.o2.l layoutDirection = mVar.getLayoutDirection();
        com.amazon.aps.iva.yb0.j.f(layoutDirection, "layoutDirection");
        return f1.a(u1.d(layoutDirection).b());
    }

    @Override // com.amazon.aps.iva.u1.x
    public final e0 f(f0 f0Var, c0 c0Var, long j) {
        boolean z;
        long c;
        boolean z2;
        boolean z3;
        long c2;
        boolean z4;
        com.amazon.aps.iva.c2.k kVar;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        e u1 = u1(f0Var);
        com.amazon.aps.iva.o2.l layoutDirection = f0Var.getLayoutDirection();
        com.amazon.aps.iva.yb0.j.f(layoutDirection, "layoutDirection");
        boolean z5 = true;
        if (u1.g > 1) {
            b bVar = u1.m;
            a0 a0Var = u1.b;
            com.amazon.aps.iva.o2.c cVar = u1.i;
            com.amazon.aps.iva.yb0.j.c(cVar);
            b a2 = b.a.a(bVar, layoutDirection, a0Var, cVar, u1.c);
            u1.m = a2;
            j = a2.a(u1.g, j);
        }
        com.amazon.aps.iva.c2.a aVar = u1.j;
        if (aVar != null && (kVar = u1.n) != null && !kVar.a() && layoutDirection == u1.o && (com.amazon.aps.iva.o2.a.b(j, u1.p) || (com.amazon.aps.iva.o2.a.h(j) == com.amazon.aps.iva.o2.a.h(u1.p) && com.amazon.aps.iva.o2.a.g(j) >= aVar.getHeight() && !aVar.d.c))) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (!com.amazon.aps.iva.o2.a.b(j, u1.p)) {
                com.amazon.aps.iva.c2.a aVar2 = u1.j;
                com.amazon.aps.iva.yb0.j.c(aVar2);
                u1.l = com.amazon.aps.iva.o2.b.c(j, com.amazon.aps.iva.o2.k.a(f1.a(aVar2.getWidth()), f1.a(aVar2.getHeight())));
                if (u1.d == 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 || (((int) (c2 >> 32)) >= aVar2.getWidth() && com.amazon.aps.iva.o2.j.b(c2) >= aVar2.getHeight())) {
                    z5 = false;
                }
                u1.k = z5;
            }
            z5 = false;
        } else {
            com.amazon.aps.iva.c2.a b = u1.b(j, layoutDirection);
            u1.p = j;
            u1.l = com.amazon.aps.iva.o2.b.c(j, com.amazon.aps.iva.o2.k.a(f1.a(b.getWidth()), f1.a(b.getHeight())));
            if (u1.d == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && (((int) (c >> 32)) < b.getWidth() || com.amazon.aps.iva.o2.j.b(c) < b.getHeight())) {
                z3 = true;
            } else {
                z3 = false;
            }
            u1.k = z3;
            u1.j = b;
        }
        com.amazon.aps.iva.c2.k kVar2 = u1.n;
        if (kVar2 != null) {
            kVar2.a();
        }
        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        com.amazon.aps.iva.c2.a aVar3 = u1.j;
        com.amazon.aps.iva.yb0.j.c(aVar3);
        long j2 = u1.l;
        if (z5) {
            w.E(this);
            Map<com.amazon.aps.iva.s1.a, Integer> map = this.w;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            map.put(com.amazon.aps.iva.s1.b.a, Integer.valueOf(com.amazon.aps.iva.ob0.f.a(aVar3.d.b(0))));
            map.put(com.amazon.aps.iva.s1.b.b, Integer.valueOf(com.amazon.aps.iva.ob0.f.a(aVar3.o())));
            this.w = map;
        }
        int i = (int) (j2 >> 32);
        u0 V = c0Var.V(a.C0554a.c(i, com.amazon.aps.iva.o2.j.b(j2)));
        int b2 = com.amazon.aps.iva.o2.j.b(j2);
        Map<com.amazon.aps.iva.s1.a, Integer> map2 = this.w;
        com.amazon.aps.iva.yb0.j.c(map2);
        return f0Var.F0(i, b2, map2, new a(V));
    }

    @Override // com.amazon.aps.iva.u1.i1
    public final void o0(com.amazon.aps.iva.a2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<this>");
        p pVar = this.y;
        if (pVar == null) {
            pVar = new p(this);
            this.y = pVar;
        }
        com.amazon.aps.iva.c2.b bVar = new com.amazon.aps.iva.c2.b(this.o, null, 6);
        com.amazon.aps.iva.fc0.l<Object>[] lVarArr = y.a;
        lVar.b(v.u, com.amazon.aps.iva.ee0.f1.J(bVar));
        y.a(lVar, pVar);
    }

    public final e t1() {
        if (this.x == null) {
            this.x = new e(this.o, this.p, this.q, this.r, this.s, this.t, this.u);
        }
        e eVar = this.x;
        com.amazon.aps.iva.yb0.j.c(eVar);
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r1 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.k0.e u1(com.amazon.aps.iva.o2.c r9) {
        /*
            r8 = this;
            com.amazon.aps.iva.k0.e r0 = r8.t1()
            com.amazon.aps.iva.o2.c r1 = r0.i
            if (r9 == 0) goto L27
            int r2 = com.amazon.aps.iva.k0.a.b
            float r2 = r9.getDensity()
            float r3 = r9.O0()
            int r2 = java.lang.Float.floatToIntBits(r2)
            long r4 = (long) r2
            int r2 = java.lang.Float.floatToIntBits(r3)
            long r2 = (long) r2
            r6 = 32
            long r4 = r4 << r6
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            long r2 = r2 | r4
            goto L29
        L27:
            long r2 = com.amazon.aps.iva.k0.a.a
        L29:
            if (r1 != 0) goto L30
            r0.i = r9
            r0.h = r2
            goto L44
        L30:
            if (r9 == 0) goto L3d
            long r4 = r0.h
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L3a
            r1 = 1
            goto L3b
        L3a:
            r1 = 0
        L3b:
            if (r1 != 0) goto L44
        L3d:
            r0.i = r9
            r0.h = r2
            r0.c()
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k0.q.u1(com.amazon.aps.iva.o2.c):com.amazon.aps.iva.k0.e");
    }

    @Override // com.amazon.aps.iva.u1.o
    public final void w(com.amazon.aps.iva.h1.c cVar) {
        long j;
        boolean z;
        long j2;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        if (!this.n) {
            return;
        }
        com.amazon.aps.iva.c2.a aVar = t1().j;
        if (aVar != null) {
            u a2 = cVar.R0().a();
            boolean z2 = t1().k;
            boolean z3 = true;
            if (z2) {
                com.amazon.aps.iva.e1.e h = com.amazon.aps.iva.ff0.b.h(com.amazon.aps.iva.e1.c.b, r.d((int) (t1().l >> 32), com.amazon.aps.iva.o2.j.b(t1().l)));
                a2.n();
                a2.r(h, 1);
            }
            try {
                com.amazon.aps.iva.c2.u uVar = this.p.a;
                com.amazon.aps.iva.n2.i iVar = uVar.m;
                if (iVar == null) {
                    iVar = com.amazon.aps.iva.n2.i.b;
                }
                com.amazon.aps.iva.n2.i iVar2 = iVar;
                t0 t0Var = uVar.n;
                if (t0Var == null) {
                    t0Var = t0.d;
                }
                t0 t0Var2 = t0Var;
                com.amazon.aps.iva.h1.f fVar = uVar.p;
                if (fVar == null) {
                    fVar = com.amazon.aps.iva.h1.h.a;
                }
                com.amazon.aps.iva.h1.f fVar2 = fVar;
                s a3 = uVar.a();
                if (a3 != null) {
                    aVar.u(a2, a3, this.p.a.a.a(), t0Var2, iVar2, fVar2, 3);
                } else {
                    z zVar = this.v;
                    if (zVar != null) {
                        j = zVar.a();
                    } else {
                        j = com.amazon.aps.iva.f1.x.g;
                    }
                    long j3 = com.amazon.aps.iva.f1.x.g;
                    if (j != j3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (this.p.b() == j3) {
                            z3 = false;
                        }
                        if (z3) {
                            j2 = this.p.b();
                        } else {
                            j2 = com.amazon.aps.iva.f1.x.b;
                        }
                        j = j2;
                    }
                    aVar.n(a2, j, t0Var2, iVar2, fVar2, 3);
                }
                if (z2) {
                    return;
                }
                return;
            } finally {
                if (z2) {
                    a2.g();
                }
            }
        }
        throw new IllegalArgumentException("no paragraph".toString());
    }
}
