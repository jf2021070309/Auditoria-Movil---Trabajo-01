package com.amazon.aps.iva.s1;

import android.view.ViewGroup;
import androidx.compose.ui.node.e;
import androidx.compose.ui.node.f;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.s1.g1;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.u1.m1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public final class x {
    public final androidx.compose.ui.node.e a;
    public com.amazon.aps.iva.o0.g0 b;
    public g1 c;
    public int d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final c g;
    public final a h;
    public com.amazon.aps.iva.xb0.p<? super a1, ? super com.amazon.aps.iva.o2.a, ? extends e0> i;
    public final LinkedHashMap j;
    public final g1.a k;
    public int l;
    public int m;
    public final String n;

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public final class a implements a1, f0 {
        public final /* synthetic */ c b;
        public com.amazon.aps.iva.xb0.p<? super f1, ? super com.amazon.aps.iva.o2.a, ? extends e0> c;

        public a() {
            this.b = x.this.g;
            com.amazon.aps.iva.o2.b.b(0, 0, 15);
        }

        @Override // com.amazon.aps.iva.s1.f0
        public final e0 F0(int i, int i2, Map<com.amazon.aps.iva.s1.a, Integer> map, com.amazon.aps.iva.xb0.l<? super u0.a, com.amazon.aps.iva.kb0.q> lVar) {
            com.amazon.aps.iva.yb0.j.f(map, "alignmentLines");
            com.amazon.aps.iva.yb0.j.f(lVar, "placementBlock");
            return this.b.F0(i, i2, map, lVar);
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float I0(int i) {
            return this.b.I0(i);
        }

        @Override // com.amazon.aps.iva.s1.a1
        public final com.amazon.aps.iva.xb0.p<f1, com.amazon.aps.iva.o2.a, e0> N0() {
            com.amazon.aps.iva.xb0.p pVar = this.c;
            if (pVar != null) {
                return pVar;
            }
            com.amazon.aps.iva.yb0.j.m("lookaheadMeasurePolicy");
            throw null;
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float O0() {
            return this.b.d;
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float P0(float f) {
            return this.b.getDensity() * f;
        }

        @Override // com.amazon.aps.iva.o2.c
        public final int T0(long j) {
            return this.b.T0(j);
        }

        @Override // com.amazon.aps.iva.o2.c
        public final long b1(long j) {
            return this.b.b1(j);
        }

        @Override // com.amazon.aps.iva.s1.a1
        public final List<c0> e0(Object obj) {
            androidx.compose.ui.node.e eVar = (androidx.compose.ui.node.e) x.this.f.get(obj);
            if (eVar != null) {
                return eVar.q();
            }
            return com.amazon.aps.iva.lb0.z.b;
        }

        @Override // com.amazon.aps.iva.o2.c
        public final int f0(float f) {
            return this.b.f0(f);
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float getDensity() {
            return this.b.c;
        }

        @Override // com.amazon.aps.iva.s1.m
        public final com.amazon.aps.iva.o2.l getLayoutDirection() {
            return this.b.b;
        }

        @Override // com.amazon.aps.iva.o2.c
        public final long j(long j) {
            return this.b.j(j);
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float l0(long j) {
            return this.b.l0(j);
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float x(float f) {
            return f / this.b.getDensity();
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public Object a;
        public com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> b;
        public com.amazon.aps.iva.o0.f0 c;
        public boolean d;
        public final y1 e;

        public b() {
            throw null;
        }

        public b(Object obj, com.amazon.aps.iva.v0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, FirebaseAnalytics.Param.CONTENT);
            this.a = obj;
            this.b = aVar;
            this.c = null;
            this.e = com.amazon.aps.iva.cq.b.c0(Boolean.TRUE);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public final class c implements f1 {
        public com.amazon.aps.iva.o2.l b = com.amazon.aps.iva.o2.l.Rtl;
        public float c;
        public float d;

        public c() {
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float O0() {
            return this.d;
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float getDensity() {
            return this.c;
        }

        @Override // com.amazon.aps.iva.s1.m
        public final com.amazon.aps.iva.o2.l getLayoutDirection() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.s1.f1
        public final List<c0> m(Object obj, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar) {
            boolean z;
            boolean z2;
            boolean z3;
            x xVar = x.this;
            xVar.getClass();
            xVar.b();
            androidx.compose.ui.node.e eVar = xVar.a;
            e.d dVar = eVar.A.b;
            e.d dVar2 = e.d.Measuring;
            if (dVar != dVar2 && dVar != e.d.LayingOut && dVar != e.d.LookaheadMeasuring && dVar != e.d.LookaheadLayingOut) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                LinkedHashMap linkedHashMap = xVar.f;
                Object obj2 = linkedHashMap.get(obj);
                if (obj2 == null) {
                    obj2 = (androidx.compose.ui.node.e) xVar.j.remove(obj);
                    if (obj2 != null) {
                        int i = xVar.m;
                        if (i > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            xVar.m = i - 1;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        obj2 = xVar.d(obj);
                        if (obj2 == null) {
                            int i2 = xVar.d;
                            androidx.compose.ui.node.e eVar2 = new androidx.compose.ui.node.e(2, true);
                            eVar.m = true;
                            eVar.A(i2, eVar2);
                            eVar.m = false;
                            obj2 = eVar2;
                        }
                    }
                    linkedHashMap.put(obj, obj2);
                }
                androidx.compose.ui.node.e eVar3 = (androidx.compose.ui.node.e) obj2;
                int indexOf = eVar.t().indexOf(eVar3);
                int i3 = xVar.d;
                if (indexOf >= i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (i3 != indexOf) {
                        eVar.m = true;
                        eVar.J(indexOf, i3, 1);
                        eVar.m = false;
                    }
                    xVar.d++;
                    xVar.c(eVar3, obj, pVar);
                    if (dVar != dVar2 && dVar != e.d.LayingOut) {
                        return eVar3.p();
                    }
                    return eVar3.q();
                }
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<a1, com.amazon.aps.iva.o2.a, e0> {
        public static final d h = new d();

        public d() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final e0 invoke(a1 a1Var, com.amazon.aps.iva.o2.a aVar) {
            a1 a1Var2 = a1Var;
            long j = aVar.a;
            com.amazon.aps.iva.yb0.j.f(a1Var2, "$this$null");
            return a1Var2.N0().invoke(a1Var2, new com.amazon.aps.iva.o2.a(j));
        }
    }

    public x(androidx.compose.ui.node.e eVar, g1 g1Var) {
        com.amazon.aps.iva.yb0.j.f(eVar, "root");
        com.amazon.aps.iva.yb0.j.f(g1Var, "slotReusePolicy");
        this.a = eVar;
        this.c = g1Var;
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new c();
        this.h = new a();
        this.i = d.h;
        this.j = new LinkedHashMap();
        this.k = new g1.a(0);
        this.n = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public final void a(int i) {
        boolean z;
        boolean z2 = false;
        this.l = 0;
        int size = (this.a.t().size() - this.m) - 1;
        if (i <= size) {
            this.k.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    g1.a aVar = this.k;
                    Object obj = this.e.get(this.a.t().get(i2));
                    com.amazon.aps.iva.yb0.j.c(obj);
                    aVar.b.add(((b) obj).a);
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
            this.c.a(this.k);
            com.amazon.aps.iva.y0.h h = com.amazon.aps.iva.y0.m.h((com.amazon.aps.iva.y0.h) com.amazon.aps.iva.y0.m.b.a(), null, false);
            try {
                com.amazon.aps.iva.y0.h j = h.j();
                z = false;
                while (size >= i) {
                    androidx.compose.ui.node.e eVar = this.a.t().get(size);
                    Object obj2 = this.e.get(eVar);
                    com.amazon.aps.iva.yb0.j.c(obj2);
                    b bVar = (b) obj2;
                    Object obj3 = bVar.a;
                    if (this.k.contains(obj3)) {
                        f.b bVar2 = eVar.A.n;
                        e.f fVar = e.f.NotUsed;
                        bVar2.getClass();
                        com.amazon.aps.iva.yb0.j.f(fVar, "<set-?>");
                        bVar2.l = fVar;
                        f.a aVar2 = eVar.A.o;
                        if (aVar2 != null) {
                            aVar2.j = fVar;
                        }
                        this.l++;
                        if (((Boolean) bVar.e.getValue()).booleanValue()) {
                            bVar.e.setValue(Boolean.FALSE);
                            z = true;
                        }
                    } else {
                        androidx.compose.ui.node.e eVar2 = this.a;
                        eVar2.m = true;
                        this.e.remove(eVar);
                        com.amazon.aps.iva.o0.f0 f0Var = bVar.c;
                        if (f0Var != null) {
                            f0Var.dispose();
                        }
                        this.a.P(size, 1);
                        eVar2.m = false;
                    }
                    this.f.remove(obj3);
                    size--;
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                com.amazon.aps.iva.y0.h.p(j);
            } finally {
                h.c();
            }
        } else {
            z = false;
        }
        if (z) {
            synchronized (com.amazon.aps.iva.y0.m.c) {
                com.amazon.aps.iva.p0.c<com.amazon.aps.iva.y0.h0> cVar = com.amazon.aps.iva.y0.m.j.get().h;
                if (cVar != null) {
                    if (cVar.e()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                com.amazon.aps.iva.y0.m.a();
            }
        }
        b();
    }

    public final void b() {
        LinkedHashMap linkedHashMap;
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap2;
        int size = this.e.size();
        androidx.compose.ui.node.e eVar = this.a;
        boolean z3 = true;
        if (size == eVar.t().size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((eVar.t().size() - this.l) - this.m >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.j.size() != this.m) {
                    z3 = false;
                }
                if (z3) {
                    return;
                }
                throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.m + ". Map size " + linkedHashMap2.size()).toString());
            }
            throw new IllegalArgumentException(("Incorrect state. Total children " + eVar.t().size() + ". Reusable children " + this.l + ". Precomposed children " + this.m).toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + linkedHashMap.size() + ") and the children count on the SubcomposeLayout (" + eVar.t().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    public final void c(androidx.compose.ui.node.e eVar, Object obj, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar) {
        boolean z;
        LinkedHashMap linkedHashMap = this.e;
        Object obj2 = linkedHashMap.get(eVar);
        if (obj2 == null) {
            obj2 = new b(obj, e.a);
            linkedHashMap.put(eVar, obj2);
        }
        b bVar = (b) obj2;
        com.amazon.aps.iva.o0.f0 f0Var = bVar.c;
        if (f0Var != null) {
            z = f0Var.r();
        } else {
            z = true;
        }
        if (bVar.b != pVar || z || bVar.d) {
            bVar.b = pVar;
            com.amazon.aps.iva.y0.h h = com.amazon.aps.iva.y0.m.h((com.amazon.aps.iva.y0.h) com.amazon.aps.iva.y0.m.b.a(), null, false);
            try {
                com.amazon.aps.iva.y0.h j = h.j();
                androidx.compose.ui.node.e eVar2 = this.a;
                eVar2.m = true;
                com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> pVar2 = bVar.b;
                com.amazon.aps.iva.o0.f0 f0Var2 = bVar.c;
                com.amazon.aps.iva.o0.g0 g0Var = this.b;
                if (g0Var != null) {
                    com.amazon.aps.iva.v0.a c2 = com.amazon.aps.iva.v0.b.c(-34810602, new a0(bVar, pVar2), true);
                    if (f0Var2 == null || f0Var2.f()) {
                        ViewGroup.LayoutParams layoutParams = androidx.compose.ui.platform.j.a;
                        f0Var2 = com.amazon.aps.iva.o0.j0.a(new m1(eVar), g0Var);
                    }
                    f0Var2.m(c2);
                    bVar.c = f0Var2;
                    eVar2.m = false;
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    com.amazon.aps.iva.y0.h.p(j);
                    h.c();
                    bVar.d = false;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set".toString());
            } catch (Throwable th) {
                h.c();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
        if (r2.e() == true) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.node.e d(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.l
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.compose.ui.node.e r0 = r9.a
            java.util.List r0 = r0.t()
            int r0 = r0.size()
            int r2 = r9.m
            int r0 = r0 - r2
            int r2 = r9.l
            int r2 = r0 - r2
            r3 = 1
            int r0 = r0 - r3
            r4 = r0
        L1a:
            r5 = -1
            if (r4 < r2) goto L41
            androidx.compose.ui.node.e r6 = r9.a
            java.util.List r6 = r6.t()
            java.lang.Object r6 = r6.get(r4)
            androidx.compose.ui.node.e r6 = (androidx.compose.ui.node.e) r6
            java.util.LinkedHashMap r7 = r9.e
            java.lang.Object r6 = r7.get(r6)
            com.amazon.aps.iva.yb0.j.c(r6)
            com.amazon.aps.iva.s1.x$b r6 = (com.amazon.aps.iva.s1.x.b) r6
            java.lang.Object r6 = r6.a
            boolean r6 = com.amazon.aps.iva.yb0.j.a(r6, r10)
            if (r6 == 0) goto L3e
            r6 = r4
            goto L42
        L3e:
            int r4 = r4 + (-1)
            goto L1a
        L41:
            r6 = r5
        L42:
            if (r6 != r5) goto L70
        L44:
            if (r0 < r2) goto L6f
            androidx.compose.ui.node.e r4 = r9.a
            java.util.List r4 = r4.t()
            java.lang.Object r4 = r4.get(r0)
            androidx.compose.ui.node.e r4 = (androidx.compose.ui.node.e) r4
            java.util.LinkedHashMap r7 = r9.e
            java.lang.Object r4 = r7.get(r4)
            com.amazon.aps.iva.yb0.j.c(r4)
            com.amazon.aps.iva.s1.x$b r4 = (com.amazon.aps.iva.s1.x.b) r4
            com.amazon.aps.iva.s1.g1 r7 = r9.c
            java.lang.Object r8 = r4.a
            boolean r7 = r7.b(r10, r8)
            if (r7 == 0) goto L6c
            r4.a = r10
            r4 = r0
            r6 = r4
            goto L70
        L6c:
            int r0 = r0 + (-1)
            goto L44
        L6f:
            r4 = r0
        L70:
            if (r6 != r5) goto L73
            goto Lc2
        L73:
            r10 = 0
            if (r4 == r2) goto L7f
            androidx.compose.ui.node.e r0 = r9.a
            r0.m = r3
            r0.J(r4, r2, r3)
            r0.m = r10
        L7f:
            int r0 = r9.l
            int r0 = r0 + r5
            r9.l = r0
            androidx.compose.ui.node.e r0 = r9.a
            java.util.List r0 = r0.t()
            java.lang.Object r0 = r0.get(r2)
            r1 = r0
            androidx.compose.ui.node.e r1 = (androidx.compose.ui.node.e) r1
            java.util.LinkedHashMap r0 = r9.e
            java.lang.Object r0 = r0.get(r1)
            com.amazon.aps.iva.yb0.j.c(r0)
            com.amazon.aps.iva.s1.x$b r0 = (com.amazon.aps.iva.s1.x.b) r0
            com.amazon.aps.iva.o0.y1 r2 = r0.e
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.setValue(r4)
            r0.d = r3
            java.lang.Object r0 = com.amazon.aps.iva.y0.m.c
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<com.amazon.aps.iva.y0.a> r2 = com.amazon.aps.iva.y0.m.j     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> Lc3
            com.amazon.aps.iva.y0.a r2 = (com.amazon.aps.iva.y0.a) r2     // Catch: java.lang.Throwable -> Lc3
            com.amazon.aps.iva.p0.c<com.amazon.aps.iva.y0.h0> r2 = r2.h     // Catch: java.lang.Throwable -> Lc3
            if (r2 == 0) goto Lbb
            boolean r2 = r2.e()     // Catch: java.lang.Throwable -> Lc3
            if (r2 != r3) goto Lbb
            goto Lbc
        Lbb:
            r3 = r10
        Lbc:
            monitor-exit(r0)
            if (r3 == 0) goto Lc2
            com.amazon.aps.iva.y0.m.a()
        Lc2:
            return r1
        Lc3:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s1.x.d(java.lang.Object):androidx.compose.ui.node.e");
    }
}
