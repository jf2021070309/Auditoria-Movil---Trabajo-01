package androidx.compose.ui.node;

import androidx.compose.ui.node.p;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.b0;
import com.amazon.aps.iva.d1.s;
import com.amazon.aps.iva.d1.t;
import com.amazon.aps.iva.p1.e0;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.f0;
import com.amazon.aps.iva.s1.m0;
import com.amazon.aps.iva.s1.o0;
import com.amazon.aps.iva.s1.p0;
import com.amazon.aps.iva.s1.q;
import com.amazon.aps.iva.s1.r0;
import com.amazon.aps.iva.s1.v;
import com.amazon.aps.iva.s1.x0;
import com.amazon.aps.iva.u1.f1;
import com.amazon.aps.iva.u1.g1;
import com.amazon.aps.iva.u1.i1;
import com.amazon.aps.iva.u1.k0;
import com.amazon.aps.iva.u1.r;
import com.amazon.aps.iva.u1.u0;
import com.amazon.aps.iva.u1.v0;
import com.amazon.aps.iva.u1.w;
import com.amazon.aps.iva.u1.x;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: BackwardsCompatNode.kt */
/* loaded from: classes.dex */
public final class a extends f.c implements x, com.amazon.aps.iva.u1.o, i1, g1, com.amazon.aps.iva.t1.f, com.amazon.aps.iva.t1.h, f1, w, r, com.amazon.aps.iva.d1.f, com.amazon.aps.iva.d1.p, t, v0, com.amazon.aps.iva.c1.a {
    public f.b o;
    public boolean p;
    public com.amazon.aps.iva.t1.a q;
    public final HashSet<com.amazon.aps.iva.t1.c<?>> r;
    public q s;

    /* compiled from: BackwardsCompatNode.kt */
    /* renamed from: androidx.compose.ui.node.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0015a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public C0015a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            a.this.v1();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    /* loaded from: classes.dex */
    public static final class b implements p.a {
        public b() {
        }

        @Override // androidx.compose.ui.node.p.a
        public final void f() {
            a aVar = a.this;
            if (aVar.s == null) {
                aVar.v(com.amazon.aps.iva.u1.i.d(aVar, 128));
            }
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            a aVar = a.this;
            f.b bVar = aVar.o;
            com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((com.amazon.aps.iva.t1.d) bVar).j(aVar);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public a(f.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "element");
        this.d = k0.e(bVar);
        this.o = bVar;
        this.p = true;
        this.r = new HashSet<>();
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void C0(com.amazon.aps.iva.p1.m mVar, com.amazon.aps.iva.p1.n nVar, long j) {
        com.amazon.aps.iva.yb0.j.f(nVar, "pass");
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((e0) bVar).q().c(mVar, nVar);
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void G0() {
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((e0) bVar).q().b();
    }

    @Override // com.amazon.aps.iva.u1.o
    public final void H0() {
        this.p = true;
        com.amazon.aps.iva.u1.p.a(this);
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void M() {
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((e0) bVar).q().getClass();
    }

    @Override // com.amazon.aps.iva.t1.f
    public final com.amazon.aps.iva.ab.a P() {
        com.amazon.aps.iva.t1.a aVar = this.q;
        if (aVar == null) {
            return com.amazon.aps.iva.t1.b.a;
        }
        return aVar;
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final boolean a1() {
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((e0) bVar).q().getClass();
        return true;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int b(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((v) bVar).b(mVar, lVar, i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int c(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((v) bVar).c(mVar, lVar, i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int d(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((v) bVar).d(mVar, lVar, i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int e(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((v) bVar).e(mVar, lVar, i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(f0 f0Var, c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((v) bVar).f(f0Var, c0Var, j);
    }

    @Override // com.amazon.aps.iva.c1.a
    public final com.amazon.aps.iva.o2.c getDensity() {
        return com.amazon.aps.iva.u1.i.e(this).s;
    }

    @Override // com.amazon.aps.iva.c1.a
    public final com.amazon.aps.iva.o2.l getLayoutDirection() {
        return com.amazon.aps.iva.u1.i.e(this).t;
    }

    @Override // com.amazon.aps.iva.c1.a
    public final long h() {
        return com.amazon.aps.iva.o2.k.b(com.amazon.aps.iva.u1.i.d(this, 128).d);
    }

    @Override // com.amazon.aps.iva.u1.w
    public final void i(long j) {
        f.b bVar = this.o;
        if (bVar instanceof p0) {
            ((p0) bVar).i(j);
        }
    }

    @Override // com.amazon.aps.iva.u1.f1
    public final Object i0(com.amazon.aps.iva.o2.c cVar, Object obj) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((r0) bVar).h(cVar);
    }

    @Override // com.amazon.aps.iva.d1.p
    public final void k0(com.amazon.aps.iva.d1.n nVar) {
        f.b bVar = this.o;
        if (bVar instanceof com.amazon.aps.iva.d1.k) {
            new com.amazon.aps.iva.u1.q((com.amazon.aps.iva.d1.k) bVar).invoke(nVar);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // com.amazon.aps.iva.t1.f, com.amazon.aps.iva.t1.h
    public final Object l(com.amazon.aps.iva.t1.i iVar) {
        m mVar;
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(iVar, "<this>");
        this.r.add(iVar);
        f.c cVar = this.b;
        if (cVar.n) {
            f.c cVar2 = cVar.f;
            e e = com.amazon.aps.iva.u1.i.e(this);
            while (e != null) {
                if ((e.z.e.e & 32) != 0) {
                    while (cVar2 != null) {
                        if ((cVar2.d & 32) != 0) {
                            f.c cVar3 = cVar2;
                            com.amazon.aps.iva.p0.f fVar = null;
                            while (cVar3 != null) {
                                if (cVar3 instanceof com.amazon.aps.iva.t1.f) {
                                    com.amazon.aps.iva.t1.f fVar2 = (com.amazon.aps.iva.t1.f) cVar3;
                                    if (fVar2.P().d(iVar)) {
                                        return fVar2.P().g(iVar);
                                    }
                                } else {
                                    if ((cVar3.d & 32) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z && (cVar3 instanceof com.amazon.aps.iva.u1.j)) {
                                        int i = 0;
                                        for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                            if ((cVar4.d & 32) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                i++;
                                                if (i == 1) {
                                                    cVar3 = cVar4;
                                                } else {
                                                    if (fVar == null) {
                                                        fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                    }
                                                    if (cVar3 != null) {
                                                        fVar.b(cVar3);
                                                        cVar3 = null;
                                                    }
                                                    fVar.b(cVar4);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                }
                                cVar3 = com.amazon.aps.iva.u1.i.b(fVar);
                            }
                            continue;
                        }
                        cVar2 = cVar2.f;
                    }
                }
                e = e.v();
                if (e != null && (mVar = e.z) != null) {
                    cVar2 = mVar.d;
                } else {
                    cVar2 = null;
                }
            }
            return iVar.a.invoke();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void m1() {
        t1(true);
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void n1() {
        u1();
    }

    @Override // com.amazon.aps.iva.u1.i1
    public final void o0(com.amazon.aps.iva.a2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<this>");
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        com.amazon.aps.iva.a2.l t = ((com.amazon.aps.iva.a2.n) bVar).t();
        com.amazon.aps.iva.yb0.j.f(t, "peer");
        if (t.c) {
            lVar.c = true;
        }
        if (t.d) {
            lVar.d = true;
        }
        for (Map.Entry entry : t.b.entrySet()) {
            b0 b0Var = (b0) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = lVar.b;
            if (!linkedHashMap.containsKey(b0Var)) {
                linkedHashMap.put(b0Var, value);
            } else if (value instanceof com.amazon.aps.iva.a2.a) {
                Object obj = linkedHashMap.get(b0Var);
                com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                com.amazon.aps.iva.a2.a aVar = (com.amazon.aps.iva.a2.a) obj;
                String str = aVar.a;
                if (str == null) {
                    str = ((com.amazon.aps.iva.a2.a) value).a;
                }
                com.amazon.aps.iva.kb0.a aVar2 = aVar.b;
                if (aVar2 == null) {
                    aVar2 = ((com.amazon.aps.iva.a2.a) value).b;
                }
                linkedHashMap.put(b0Var, new com.amazon.aps.iva.a2.a(str, aVar2));
            }
        }
    }

    @Override // com.amazon.aps.iva.d1.f
    public final void p0(com.amazon.aps.iva.d1.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "focusState");
        f.b bVar = this.o;
        if (bVar instanceof com.amazon.aps.iva.d1.e) {
            ((com.amazon.aps.iva.d1.e) bVar).s();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void t1(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this.n) {
            f.b bVar = this.o;
            boolean z8 = false;
            if ((this.d & 32) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (bVar instanceof com.amazon.aps.iva.t1.d) {
                    com.amazon.aps.iva.u1.i.f(this).h(new C0015a());
                }
                if (bVar instanceof com.amazon.aps.iva.t1.g) {
                    com.amazon.aps.iva.t1.g<?> gVar = (com.amazon.aps.iva.t1.g) bVar;
                    com.amazon.aps.iva.t1.a aVar = this.q;
                    if (aVar != null && aVar.d(gVar.getKey())) {
                        aVar.a = gVar;
                        com.amazon.aps.iva.t1.e modifierLocalManager = com.amazon.aps.iva.u1.i.f(this).getModifierLocalManager();
                        com.amazon.aps.iva.t1.i<?> key = gVar.getKey();
                        modifierLocalManager.getClass();
                        com.amazon.aps.iva.yb0.j.f(key, "key");
                        modifierLocalManager.b.b(this);
                        modifierLocalManager.c.b(key);
                        modifierLocalManager.a();
                    } else {
                        this.q = new com.amazon.aps.iva.t1.a(gVar);
                        if (androidx.compose.ui.node.b.a(this)) {
                            com.amazon.aps.iva.t1.e modifierLocalManager2 = com.amazon.aps.iva.u1.i.f(this).getModifierLocalManager();
                            com.amazon.aps.iva.t1.i<?> key2 = gVar.getKey();
                            modifierLocalManager2.getClass();
                            com.amazon.aps.iva.yb0.j.f(key2, "key");
                            modifierLocalManager2.b.b(this);
                            modifierLocalManager2.c.b(key2);
                            modifierLocalManager2.a();
                        }
                    }
                }
            }
            if ((this.d & 4) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (bVar instanceof com.amazon.aps.iva.c1.g) {
                    this.p = true;
                }
                if (!z) {
                    com.amazon.aps.iva.e.w.E(this);
                }
            }
            if ((this.d & 2) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (androidx.compose.ui.node.b.a(this)) {
                    o oVar = this.i;
                    com.amazon.aps.iva.yb0.j.c(oVar);
                    ((d) oVar).G = this;
                    u0 u0Var = oVar.z;
                    if (u0Var != null) {
                        u0Var.invalidate();
                    }
                }
                if (!z) {
                    com.amazon.aps.iva.e.w.E(this);
                    com.amazon.aps.iva.u1.i.e(this).D();
                }
            }
            if (bVar instanceof x0) {
                ((x0) bVar).m(com.amazon.aps.iva.u1.i.e(this));
            }
            if ((this.d & 128) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if ((bVar instanceof p0) && androidx.compose.ui.node.b.a(this)) {
                    com.amazon.aps.iva.u1.i.e(this).D();
                }
                if (bVar instanceof o0) {
                    this.s = null;
                    if (androidx.compose.ui.node.b.a(this)) {
                        com.amazon.aps.iva.u1.i.f(this).j(new b());
                    }
                }
            }
            if ((this.d & 256) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 && (bVar instanceof m0) && androidx.compose.ui.node.b.a(this)) {
                com.amazon.aps.iva.u1.i.e(this).D();
            }
            if (bVar instanceof s) {
                ((s) bVar).k().a.b(this);
            }
            if ((this.d & 16) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 && (bVar instanceof e0)) {
                ((e0) bVar).q().a = this.i;
            }
            if ((this.d & 8) != 0) {
                z8 = true;
            }
            if (z8) {
                com.amazon.aps.iva.u1.i.f(this).r();
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final String toString() {
        return this.o.toString();
    }

    public final void u1() {
        boolean z;
        if (this.n) {
            f.b bVar = this.o;
            boolean z2 = true;
            if ((this.d & 32) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (bVar instanceof com.amazon.aps.iva.t1.g) {
                    com.amazon.aps.iva.t1.e modifierLocalManager = com.amazon.aps.iva.u1.i.f(this).getModifierLocalManager();
                    com.amazon.aps.iva.t1.i key = ((com.amazon.aps.iva.t1.g) bVar).getKey();
                    modifierLocalManager.getClass();
                    com.amazon.aps.iva.yb0.j.f(key, "key");
                    modifierLocalManager.d.b(com.amazon.aps.iva.u1.i.e(this));
                    modifierLocalManager.e.b(key);
                    modifierLocalManager.a();
                }
                if (bVar instanceof com.amazon.aps.iva.t1.d) {
                    ((com.amazon.aps.iva.t1.d) bVar).j(androidx.compose.ui.node.b.a);
                }
            }
            if ((this.d & 8) == 0) {
                z2 = false;
            }
            if (z2) {
                com.amazon.aps.iva.u1.i.f(this).r();
            }
            if (bVar instanceof s) {
                ((s) bVar).k().a.k(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // com.amazon.aps.iva.u1.w
    public final void v(o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "coordinates");
        this.s = oVar;
        f.b bVar = this.o;
        if (bVar instanceof o0) {
            ((o0) bVar).v(oVar);
        }
    }

    public final void v1() {
        if (this.n) {
            this.r.clear();
            com.amazon.aps.iva.u1.i.f(this).getSnapshotObserver().a(this, androidx.compose.ui.node.b.c, new c());
        }
    }

    @Override // com.amazon.aps.iva.u1.o
    public final void w(com.amazon.aps.iva.h1.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        com.amazon.aps.iva.c1.h hVar = (com.amazon.aps.iva.c1.h) bVar;
        if (this.p && (bVar instanceof com.amazon.aps.iva.c1.g)) {
            f.b bVar2 = this.o;
            if (bVar2 instanceof com.amazon.aps.iva.c1.g) {
                com.amazon.aps.iva.u1.i.f(this).getSnapshotObserver().a(this, androidx.compose.ui.node.b.b, new com.amazon.aps.iva.u1.c(bVar2, this));
            }
            this.p = false;
        }
        hVar.w(cVar);
    }

    @Override // com.amazon.aps.iva.u1.v0
    public final boolean y0() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.u1.r
    public final void z(o oVar) {
        f.b bVar = this.o;
        com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((m0) bVar).z(oVar);
    }
}
