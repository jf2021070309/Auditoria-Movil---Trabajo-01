package androidx.compose.ui.node;

import androidx.compose.ui.node.f;
import androidx.compose.ui.node.n;
import androidx.compose.ui.node.o;
import androidx.compose.ui.node.p;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.m0;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.d0;
import com.amazon.aps.iva.s1.e0;
import com.amazon.aps.iva.s1.f0;
import com.amazon.aps.iva.s1.w0;
import com.amazon.aps.iva.s1.x;
import com.amazon.aps.iva.u1.e1;
import com.amazon.aps.iva.u1.g0;
import com.amazon.aps.iva.u1.g1;
import com.amazon.aps.iva.u1.h0;
import com.amazon.aps.iva.u1.i1;
import com.amazon.aps.iva.u1.k0;
import com.amazon.aps.iva.u1.s;
import com.amazon.aps.iva.u1.u;
import com.amazon.aps.iva.u1.u0;
import com.amazon.aps.iva.u1.v0;
import com.amazon.aps.iva.u1.w;
import com.amazon.aps.iva.u1.y;
import com.amazon.aps.iva.v1.d1;
import com.amazon.aps.iva.v1.v2;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.List;
/* compiled from: LayoutNode.kt */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.o0.g, w0, v0, com.amazon.aps.iva.u1.e, p.a {
    public static final c J = new c();
    public static final a K = a.h;
    public static final b L = new b();
    public static final y M = new y(0);
    public final androidx.compose.ui.node.f A;
    public x B;
    public o C;
    public boolean D;
    public com.amazon.aps.iva.a1.f E;
    public com.amazon.aps.iva.xb0.l<? super p, q> F;
    public com.amazon.aps.iva.xb0.l<? super p, q> G;
    public boolean H;
    public boolean I;
    public final boolean b;
    public int c;
    public e d;
    public int e;
    public final g0 f;
    public com.amazon.aps.iva.p0.f<e> g;
    public boolean h;
    public e i;
    public p j;
    public com.amazon.aps.iva.p2.a k;
    public int l;
    public boolean m;
    public com.amazon.aps.iva.a2.l n;
    public final com.amazon.aps.iva.p0.f<e> o;
    public boolean p;
    public d0 q;
    public final u r;
    public com.amazon.aps.iva.o2.c s;
    public com.amazon.aps.iva.o2.l t;
    public v2 u;
    public m0 v;
    public f w;
    public f x;
    public boolean y;
    public final m z;

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e invoke() {
            return new e(3, false);
        }
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC0017e {
        public c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final e0 d(f0 f0Var, List list, long j) {
            com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
            com.amazon.aps.iva.yb0.j.f(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public enum d {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* compiled from: LayoutNode.kt */
    /* renamed from: androidx.compose.ui.node.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0017e implements d0 {
        public final String a;

        public AbstractC0017e(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "error");
            this.a = str;
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final int a(o oVar, List list, int i) {
            com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
            throw new IllegalStateException(this.a.toString());
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final int b(o oVar, List list, int i) {
            com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
            throw new IllegalStateException(this.a.toString());
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final int c(o oVar, List list, int i) {
            com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
            throw new IllegalStateException(this.a.toString());
        }

        @Override // com.amazon.aps.iva.s1.d0
        public final int e(o oVar, List list, int i) {
            com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
            throw new IllegalStateException(this.a.toString());
        }
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public enum f {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            androidx.compose.ui.node.f fVar = e.this.A;
            fVar.n.v = true;
            f.a aVar = fVar.o;
            if (aVar != null) {
                aVar.s = true;
            }
            return q.a;
        }
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.a2.l> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.a2.l> d0Var) {
            super(0);
            this.i = d0Var;
        }

        /* JADX WARN: Type inference failed for: r4v7, types: [com.amazon.aps.iva.a2.l, T] */
        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            boolean z;
            boolean z2;
            m mVar = e.this.z;
            if ((mVar.e.e & 8) != 0) {
                for (f.c cVar = mVar.d; cVar != null; cVar = cVar.f) {
                    if ((cVar.d & 8) != 0) {
                        f.c cVar2 = cVar;
                        com.amazon.aps.iva.p0.f fVar = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof i1) {
                                i1 i1Var = (i1) cVar2;
                                boolean J = i1Var.J();
                                com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.a2.l> d0Var = this.i;
                                if (J) {
                                    ?? lVar = new com.amazon.aps.iva.a2.l();
                                    d0Var.b = lVar;
                                    lVar.d = true;
                                }
                                if (i1Var.d1()) {
                                    d0Var.b.c = true;
                                }
                                i1Var.o0(d0Var.b);
                            } else {
                                if ((cVar2.d & 8) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z && (cVar2 instanceof com.amazon.aps.iva.u1.j)) {
                                    int i = 0;
                                    for (f.c cVar3 = ((com.amazon.aps.iva.u1.j) cVar2).p; cVar3 != null; cVar3 = cVar3.g) {
                                        if ((cVar3.d & 8) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                            }
                            cVar2 = com.amazon.aps.iva.u1.i.b(fVar);
                        }
                    }
                }
            }
            return q.a;
        }
    }

    public e() {
        this(3, false);
    }

    public static boolean N(e eVar) {
        com.amazon.aps.iva.o2.a aVar;
        f.b bVar = eVar.A.n;
        if (bVar.j) {
            aVar = new com.amazon.aps.iva.o2.a(bVar.e);
        } else {
            aVar = null;
        }
        return eVar.M(aVar);
    }

    public static void S(e eVar, boolean z, int i2) {
        boolean z2;
        e v;
        boolean z3 = false;
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (eVar.d != null) {
            z3 = true;
        }
        if (z3) {
            p pVar = eVar.j;
            if (pVar != null && !eVar.m && !eVar.b) {
                pVar.n(eVar, true, z, z2);
                f.a aVar = eVar.A.o;
                com.amazon.aps.iva.yb0.j.c(aVar);
                androidx.compose.ui.node.f fVar = androidx.compose.ui.node.f.this;
                e v2 = fVar.a.v();
                f fVar2 = fVar.a.w;
                if (v2 != null && fVar2 != f.NotUsed) {
                    while (v2.w == fVar2 && (v = v2.v()) != null) {
                        v2 = v;
                    }
                    int i3 = f.a.C0018a.b[fVar2.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            if (v2.d != null) {
                                v2.R(z);
                                return;
                            } else {
                                v2.T(z);
                                return;
                            }
                        }
                        throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                    } else if (v2.d != null) {
                        S(v2, z, 2);
                        return;
                    } else {
                        U(v2, z, 2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    public static void U(e eVar, boolean z, int i2) {
        boolean z2;
        p pVar;
        e v;
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!eVar.m && !eVar.b && (pVar = eVar.j) != null) {
            pVar.n(eVar, false, z, z2);
            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.f.this;
            e v2 = fVar.a.v();
            f fVar2 = fVar.a.w;
            if (v2 != null && fVar2 != f.NotUsed) {
                while (v2.w == fVar2 && (v = v2.v()) != null) {
                    v2 = v;
                }
                int i3 = f.b.a.b[fVar2.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        v2.T(z);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                U(v2, z, 2);
            }
        }
    }

    public static void V(e eVar) {
        androidx.compose.ui.node.f fVar = eVar.A;
        if (g.a[fVar.b.ordinal()] == 1) {
            if (fVar.c) {
                U(eVar, true, 2);
                return;
            } else if (fVar.d) {
                eVar.T(true);
                return;
            } else if (fVar.f) {
                S(eVar, true, 2);
                return;
            } else if (fVar.g) {
                eVar.R(true);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + fVar.b);
    }

    public final void A(int i2, e eVar) {
        boolean z;
        boolean z2;
        String str;
        com.amazon.aps.iva.yb0.j.f(eVar, "instance");
        if (eVar.i == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(eVar);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(m(0));
            sb.append(" Other tree: ");
            e eVar2 = eVar.i;
            if (eVar2 != null) {
                str = eVar2.m(0);
            } else {
                str = null;
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (eVar.j == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            eVar.i = this;
            g0 g0Var = this.f;
            ((com.amazon.aps.iva.p0.f) g0Var.b).a(i2, eVar);
            ((com.amazon.aps.iva.xb0.a) g0Var.c).invoke();
            L();
            if (eVar.b) {
                this.e++;
            }
            E();
            p pVar = this.j;
            if (pVar != null) {
                eVar.j(pVar);
            }
            if (eVar.A.m > 0) {
                androidx.compose.ui.node.f fVar = this.A;
                fVar.c(fVar.m + 1);
                return;
            }
            return;
        }
        throw new IllegalStateException(("Cannot insert " + eVar + " because it already has an owner. This tree: " + m(0) + " Other tree: " + eVar.m(0)).toString());
    }

    public final void B() {
        u0 u0Var;
        if (this.D) {
            m mVar = this.z;
            o oVar = mVar.b;
            o oVar2 = mVar.c.k;
            this.C = null;
            while (true) {
                if (com.amazon.aps.iva.yb0.j.a(oVar, oVar2)) {
                    break;
                }
                if (oVar != null) {
                    u0Var = oVar.z;
                } else {
                    u0Var = null;
                }
                if (u0Var != null) {
                    this.C = oVar;
                    break;
                } else if (oVar != null) {
                    oVar = oVar.k;
                } else {
                    oVar = null;
                }
            }
        }
        o oVar3 = this.C;
        if (oVar3 != null && oVar3.z == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (oVar3 != null) {
            oVar3.y1();
            return;
        }
        e v = v();
        if (v != null) {
            v.B();
        }
    }

    public final void C() {
        m mVar = this.z;
        o oVar = mVar.c;
        androidx.compose.ui.node.c cVar = mVar.b;
        while (oVar != cVar) {
            com.amazon.aps.iva.yb0.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            androidx.compose.ui.node.d dVar = (androidx.compose.ui.node.d) oVar;
            u0 u0Var = dVar.z;
            if (u0Var != null) {
                u0Var.invalidate();
            }
            oVar = dVar.j;
        }
        u0 u0Var2 = mVar.b.z;
        if (u0Var2 != null) {
            u0Var2.invalidate();
        }
    }

    public final void D() {
        if (this.d != null) {
            S(this, false, 3);
        } else {
            U(this, false, 3);
        }
    }

    public final void E() {
        e eVar;
        if (this.e > 0) {
            this.h = true;
        }
        if (this.b && (eVar = this.i) != null) {
            eVar.E();
        }
    }

    public final boolean F() {
        if (this.j != null) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        return this.A.n.s;
    }

    public final Boolean H() {
        f.a aVar = this.A.o;
        if (aVar != null) {
            return Boolean.valueOf(aVar.p);
        }
        return null;
    }

    public final void I() {
        if (this.w == f.NotUsed) {
            l();
        }
        f.a aVar = this.A.o;
        com.amazon.aps.iva.yb0.j.c(aVar);
        try {
            aVar.g = true;
            if (aVar.l) {
                aVar.r0(aVar.n, 0.0f, null);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } finally {
            aVar.g = false;
        }
    }

    public final void J(int i2, int i3, int i4) {
        int i5;
        if (i2 == i3) {
            return;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            if (i2 > i3) {
                i5 = i2 + i6;
            } else {
                i5 = i2;
            }
            int i7 = i2 > i3 ? i3 + i6 : (i3 + i4) - 2;
            g0 g0Var = this.f;
            Object l = ((com.amazon.aps.iva.p0.f) g0Var.b).l(i5);
            ((com.amazon.aps.iva.xb0.a) g0Var.c).invoke();
            ((com.amazon.aps.iva.p0.f) g0Var.b).a(i7, (e) l);
            ((com.amazon.aps.iva.xb0.a) g0Var.c).invoke();
        }
        L();
        E();
        D();
    }

    public final void K(e eVar) {
        androidx.compose.ui.node.f fVar;
        if (eVar.A.m > 0) {
            this.A.c(fVar.m - 1);
        }
        if (this.j != null) {
            eVar.n();
        }
        eVar.i = null;
        eVar.z.c.k = null;
        if (eVar.b) {
            this.e--;
            com.amazon.aps.iva.p0.f fVar2 = (com.amazon.aps.iva.p0.f) eVar.f.b;
            int i2 = fVar2.d;
            if (i2 > 0) {
                Object[] objArr = fVar2.b;
                int i3 = 0;
                do {
                    ((e) objArr[i3]).z.c.k = null;
                    i3++;
                } while (i3 < i2);
            }
        }
        E();
        L();
    }

    public final void L() {
        if (this.b) {
            e v = v();
            if (v != null) {
                v.L();
                return;
            }
            return;
        }
        this.p = true;
    }

    public final boolean M(com.amazon.aps.iva.o2.a aVar) {
        if (aVar != null) {
            if (this.w == f.NotUsed) {
                k();
            }
            return this.A.n.Q0(aVar.a);
        }
        return false;
    }

    public final void O() {
        g0 g0Var = this.f;
        int i2 = ((com.amazon.aps.iva.p0.f) g0Var.b).d;
        while (true) {
            i2--;
            if (-1 < i2) {
                K((e) ((com.amazon.aps.iva.p0.f) g0Var.b).b[i2]);
            } else {
                g0Var.a();
                return;
            }
        }
    }

    public final void P(int i2, int i3) {
        boolean z;
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i4 = (i3 + i2) - 1;
            if (i2 > i4) {
                return;
            }
            while (true) {
                g0 g0Var = this.f;
                Object l = ((com.amazon.aps.iva.p0.f) g0Var.b).l(i4);
                ((com.amazon.aps.iva.xb0.a) g0Var.c).invoke();
                K((e) l);
                if (i4 != i2) {
                    i4--;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("count (", i3, ") must be greater than 0").toString());
        }
    }

    public final void Q() {
        if (this.w == f.NotUsed) {
            l();
        }
        f.b bVar = this.A.n;
        bVar.getClass();
        try {
            bVar.g = true;
            if (bVar.k) {
                bVar.M0(bVar.n, bVar.p, bVar.o);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } finally {
            bVar.g = false;
        }
    }

    public final void R(boolean z) {
        p pVar;
        if (!this.b && (pVar = this.j) != null) {
            pVar.b(this, true, z);
        }
    }

    public final void T(boolean z) {
        p pVar;
        if (!this.b && (pVar = this.j) != null) {
            int i2 = p.a0;
            pVar.b(this, false, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W() {
        /*
            r8 = this;
            androidx.compose.ui.node.m r0 = r8.z
            com.amazon.aps.iva.u1.k1 r1 = r0.d
        L4:
            if (r1 == 0) goto L10
            boolean r2 = r1.n
            if (r2 == 0) goto Ld
            r1.p1()
        Ld:
            com.amazon.aps.iva.a1.f$c r1 = r1.f
            goto L4
        L10:
            com.amazon.aps.iva.p0.f<com.amazon.aps.iva.a1.f$b> r1 = r0.f
            if (r1 == 0) goto L34
            int r2 = r1.d
            if (r2 <= 0) goto L34
            T[] r3 = r1.b
            r4 = 0
        L1b:
            r5 = r3[r4]
            com.amazon.aps.iva.a1.f$b r5 = (com.amazon.aps.iva.a1.f.b) r5
            boolean r6 = r5 instanceof androidx.compose.ui.input.pointer.SuspendPointerInputElement
            if (r6 == 0) goto L30
            androidx.compose.ui.node.ForceUpdateElement r6 = new androidx.compose.ui.node.ForceUpdateElement
            com.amazon.aps.iva.u1.f0 r5 = (com.amazon.aps.iva.u1.f0) r5
            r6.<init>(r5)
            T[] r5 = r1.b
            r7 = r5[r4]
            r5[r4] = r6
        L30:
            int r4 = r4 + 1
            if (r4 < r2) goto L1b
        L34:
            com.amazon.aps.iva.u1.k1 r0 = r0.d
            r1 = r0
        L37:
            if (r1 == 0) goto L43
            boolean r2 = r1.n
            if (r2 == 0) goto L40
            r1.r1()
        L40:
            com.amazon.aps.iva.a1.f$c r1 = r1.f
            goto L37
        L43:
            if (r0 == 0) goto L4f
            boolean r1 = r0.n
            if (r1 == 0) goto L4c
            r0.l1()
        L4c:
            com.amazon.aps.iva.a1.f$c r0 = r0.f
            goto L43
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.e.W():void");
    }

    public final void X() {
        com.amazon.aps.iva.p0.f<e> y = y();
        int i2 = y.d;
        if (i2 > 0) {
            e[] eVarArr = y.b;
            int i3 = 0;
            do {
                e eVar = eVarArr[i3];
                f fVar = eVar.x;
                eVar.w = fVar;
                if (fVar != f.NotUsed) {
                    eVar.X();
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final void Y(com.amazon.aps.iva.o2.c cVar) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(cVar, "value");
        if (!com.amazon.aps.iva.yb0.j.a(this.s, cVar)) {
            this.s = cVar;
            D();
            e v = v();
            if (v != null) {
                v.B();
            }
            C();
            f.c cVar2 = this.z.e;
            if ((cVar2.e & 16) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.d & 16) != 0) {
                        f.c cVar3 = cVar2;
                        com.amazon.aps.iva.p0.f fVar = null;
                        while (cVar3 != null) {
                            if (cVar3 instanceof g1) {
                                ((g1) cVar3).M0();
                            } else {
                                if ((cVar3.d & 16) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z && (cVar3 instanceof com.amazon.aps.iva.u1.j)) {
                                    int i2 = 0;
                                    for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                        if ((cVar4.d & 16) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                            }
                            cVar3 = com.amazon.aps.iva.u1.i.b(fVar);
                        }
                    }
                    if ((cVar2.e & 16) != 0) {
                        cVar2 = cVar2.g;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void Z(com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "value");
        if (this.t != lVar) {
            this.t = lVar;
            D();
            e v = v();
            if (v != null) {
                v.B();
            }
            C();
        }
    }

    @Override // com.amazon.aps.iva.o0.g
    public final void a() {
        com.amazon.aps.iva.p2.a aVar = this.k;
        if (aVar != null) {
            aVar.a();
        }
        m mVar = this.z;
        o oVar = mVar.b.j;
        for (o oVar2 = mVar.c; !com.amazon.aps.iva.yb0.j.a(oVar2, oVar) && oVar2 != null; oVar2 = oVar2.j) {
            oVar2.l = true;
            if (oVar2.z != null) {
                oVar2.J1(null, false);
            }
        }
    }

    public final void a0(e eVar) {
        if (!com.amazon.aps.iva.yb0.j.a(eVar, this.d)) {
            this.d = eVar;
            if (eVar != null) {
                androidx.compose.ui.node.f fVar = this.A;
                if (fVar.o == null) {
                    fVar.o = new f.a();
                }
                m mVar = this.z;
                o oVar = mVar.b.j;
                for (o oVar2 = mVar.c; !com.amazon.aps.iva.yb0.j.a(oVar2, oVar) && oVar2 != null; oVar2 = oVar2.j) {
                    oVar2.m1();
                }
            }
            D();
        }
    }

    @Override // com.amazon.aps.iva.o0.g
    public final void b() {
        com.amazon.aps.iva.p2.a aVar = this.k;
        if (aVar != null) {
            aVar.b();
        }
        this.I = true;
        W();
    }

    public final void b0(v2 v2Var) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(v2Var, "value");
        if (!com.amazon.aps.iva.yb0.j.a(this.u, v2Var)) {
            this.u = v2Var;
            f.c cVar = this.z.e;
            if ((cVar.e & 16) != 0) {
                while (cVar != null) {
                    if ((cVar.d & 16) != 0) {
                        f.c cVar2 = cVar;
                        com.amazon.aps.iva.p0.f fVar = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof g1) {
                                ((g1) cVar2).c1();
                            } else {
                                if ((cVar2.d & 16) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z && (cVar2 instanceof com.amazon.aps.iva.u1.j)) {
                                    int i2 = 0;
                                    for (f.c cVar3 = ((com.amazon.aps.iva.u1.j) cVar2).p; cVar3 != null; cVar3 = cVar3.g) {
                                        if ((cVar3.d & 16) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
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
                    if ((cVar.e & 16) != 0) {
                        cVar = cVar.g;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0() {
        /*
            r6 = this;
            int r0 = r6.e
            if (r0 <= 0) goto L4f
            boolean r0 = r6.h
            if (r0 == 0) goto L4f
            r0 = 0
            r6.h = r0
            com.amazon.aps.iva.p0.f<androidx.compose.ui.node.e> r1 = r6.g
            if (r1 != 0) goto L1a
            com.amazon.aps.iva.p0.f r1 = new com.amazon.aps.iva.p0.f
            r2 = 16
            androidx.compose.ui.node.e[] r2 = new androidx.compose.ui.node.e[r2]
            r1.<init>(r2)
            r6.g = r1
        L1a:
            r1.f()
            com.amazon.aps.iva.u1.g0 r2 = r6.f
            java.lang.Object r2 = r2.b
            com.amazon.aps.iva.p0.f r2 = (com.amazon.aps.iva.p0.f) r2
            int r3 = r2.d
            if (r3 <= 0) goto L42
            T[] r2 = r2.b
        L29:
            r4 = r2[r0]
            androidx.compose.ui.node.e r4 = (androidx.compose.ui.node.e) r4
            boolean r5 = r4.b
            if (r5 == 0) goto L3b
            com.amazon.aps.iva.p0.f r4 = r4.y()
            int r5 = r1.d
            r1.c(r5, r4)
            goto L3e
        L3b:
            r1.b(r4)
        L3e:
            int r0 = r0 + 1
            if (r0 < r3) goto L29
        L42:
            androidx.compose.ui.node.f r0 = r6.A
            androidx.compose.ui.node.f$b r1 = r0.n
            r2 = 1
            r1.v = r2
            androidx.compose.ui.node.f$a r0 = r0.o
            if (r0 == 0) goto L4f
            r0.s = r2
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.e.c0():void");
    }

    @Override // com.amazon.aps.iva.s1.w0
    public final void d() {
        com.amazon.aps.iva.o2.a aVar;
        if (this.d != null) {
            S(this, false, 1);
        } else {
            U(this, false, 1);
        }
        f.b bVar = this.A.n;
        if (bVar.j) {
            aVar = new com.amazon.aps.iva.o2.a(bVar.e);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            p pVar = this.j;
            if (pVar != null) {
                pVar.l(this, aVar.a);
                return;
            }
            return;
        }
        p pVar2 = this.j;
        if (pVar2 != null) {
            pVar2.a(true);
        }
    }

    @Override // com.amazon.aps.iva.o0.g
    public final void e() {
        if (F()) {
            com.amazon.aps.iva.p2.a aVar = this.k;
            if (aVar != null) {
                aVar.e();
            }
            if (this.I) {
                this.I = false;
            } else {
                W();
            }
            this.c = com.amazon.aps.iva.a2.o.a.addAndGet(1);
            m mVar = this.z;
            for (f.c cVar = mVar.e; cVar != null; cVar = cVar.g) {
                cVar.k1();
            }
            mVar.e();
            return;
        }
        throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
    }

    @Override // androidx.compose.ui.node.p.a
    public final void f() {
        f.c cVar;
        boolean z;
        boolean z2;
        m mVar = this.z;
        androidx.compose.ui.node.c cVar2 = mVar.b;
        boolean h2 = k0.h(128);
        if (h2) {
            cVar = cVar2.G;
        } else {
            cVar = cVar2.G.f;
            if (cVar == null) {
                return;
            }
        }
        o.d dVar = o.A;
        for (f.c t1 = cVar2.t1(h2); t1 != null && (t1.e & 128) != 0; t1 = t1.g) {
            if ((t1.d & 128) != 0) {
                f.c cVar3 = t1;
                com.amazon.aps.iva.p0.f fVar = null;
                while (cVar3 != null) {
                    if (cVar3 instanceof w) {
                        ((w) cVar3).v(mVar.b);
                    } else {
                        if ((cVar3.d & 128) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && (cVar3 instanceof com.amazon.aps.iva.u1.j)) {
                            int i2 = 0;
                            for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar3).p; cVar4 != null; cVar4 = cVar4.g) {
                                if ((cVar4.d & 128) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    i2++;
                                    if (i2 == 1) {
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
                            if (i2 == 1) {
                            }
                        }
                    }
                    cVar3 = com.amazon.aps.iva.u1.i.b(fVar);
                }
            }
            if (t1 == cVar) {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.compose.ui.node.o, com.amazon.aps.iva.a1.f$c] */
    @Override // com.amazon.aps.iva.u1.e
    public final void g(com.amazon.aps.iva.a1.f fVar) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        androidx.compose.ui.node.c cVar;
        boolean z4;
        boolean z5;
        ?? r1;
        com.amazon.aps.iva.p0.f<f.b> fVar2;
        boolean z6;
        boolean z7;
        com.amazon.aps.iva.yb0.j.f(fVar, "value");
        if (this.b && this.E != f.a.c) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.E = fVar;
            m mVar = this.z;
            mVar.getClass();
            f.c cVar2 = mVar.e;
            n.a aVar = n.a;
            if (cVar2 != aVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                cVar2.f = aVar;
                aVar.g = cVar2;
                com.amazon.aps.iva.p0.f<f.b> fVar3 = mVar.f;
                if (fVar3 != null) {
                    i2 = fVar3.d;
                } else {
                    i2 = 0;
                }
                com.amazon.aps.iva.p0.f<f.b> fVar4 = mVar.g;
                if (fVar4 == null) {
                    fVar4 = new com.amazon.aps.iva.p0.f<>(new f.b[16]);
                }
                com.amazon.aps.iva.p0.f<f.b> fVar5 = fVar4;
                int i3 = fVar5.d;
                if (i3 < 16) {
                    i3 = 16;
                }
                com.amazon.aps.iva.p0.f fVar6 = new com.amazon.aps.iva.p0.f(new com.amazon.aps.iva.a1.f[i3]);
                fVar6.b(fVar);
                while (fVar6.j()) {
                    com.amazon.aps.iva.a1.f fVar7 = (com.amazon.aps.iva.a1.f) fVar6.l(fVar6.d - 1);
                    if (fVar7 instanceof com.amazon.aps.iva.a1.c) {
                        com.amazon.aps.iva.a1.c cVar3 = (com.amazon.aps.iva.a1.c) fVar7;
                        fVar6.b(cVar3.d);
                        fVar6.b(cVar3.c);
                    } else if (fVar7 instanceof f.b) {
                        fVar5.b(fVar7);
                    } else {
                        fVar7.g(new h0(fVar5));
                    }
                }
                int i4 = fVar5.d;
                f.c cVar4 = mVar.d;
                e eVar = mVar.a;
                if (i4 == i2) {
                    f.c cVar5 = aVar.g;
                    int i5 = 0;
                    while (true) {
                        if (cVar5 == null || i5 >= i2) {
                            break;
                        } else if (fVar3 != null) {
                            f.b bVar = fVar3.b[i5];
                            f.b bVar2 = fVar5.b[i5];
                            int a2 = n.a(bVar, bVar2);
                            if (a2 != 0) {
                                if (a2 == 1) {
                                    m.h(bVar, bVar2, cVar5);
                                }
                                cVar5 = cVar5.g;
                                i5++;
                            } else {
                                cVar5 = cVar5.f;
                                break;
                            }
                        } else {
                            throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                        }
                    }
                    f.c cVar6 = cVar5;
                    if (i5 < i2) {
                        if (fVar3 != null) {
                            if (cVar6 != null) {
                                z3 = false;
                                mVar.f(i5, fVar3, fVar5, cVar6, eVar.F());
                                z5 = true;
                                r1 = z3;
                            } else {
                                throw new IllegalStateException("structuralUpdate requires a non-null tail".toString());
                            }
                        } else {
                            throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                        }
                    } else {
                        z4 = false;
                        z5 = false;
                        r1 = z4;
                    }
                } else {
                    z3 = false;
                    z3 = false;
                    z3 = false;
                    z4 = false;
                    if (!eVar.F() && i2 == 0) {
                        f.c cVar7 = aVar;
                        for (int i6 = 0; i6 < fVar5.d; i6++) {
                            cVar7 = m.b(fVar5.b[i6], cVar7);
                        }
                        int i7 = 0;
                        for (f.c cVar8 = cVar4.f; cVar8 != null && cVar8 != n.a; cVar8 = cVar8.f) {
                            i7 |= cVar8.d;
                            cVar8.e = i7;
                        }
                    } else if (fVar5.d == 0) {
                        if (fVar3 != null) {
                            f.c cVar9 = aVar.g;
                            for (int i8 = 0; cVar9 != null && i8 < fVar3.d; i8++) {
                                cVar9 = m.c(cVar9).g;
                            }
                            e v = eVar.v();
                            if (v != null) {
                                cVar = v.z.b;
                            } else {
                                cVar = null;
                            }
                            androidx.compose.ui.node.c cVar10 = mVar.b;
                            cVar10.k = cVar;
                            mVar.c = cVar10;
                            z5 = false;
                            r1 = z4;
                        } else {
                            throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                        }
                    } else {
                        if (fVar3 == null) {
                            fVar3 = new com.amazon.aps.iva.p0.f<>(new f.b[16]);
                        }
                        mVar.f(0, fVar3, fVar5, aVar, eVar.F());
                    }
                    z5 = true;
                    r1 = z3;
                }
                mVar.f = fVar5;
                if (fVar3 != null) {
                    fVar3.f();
                    fVar2 = fVar3;
                } else {
                    fVar2 = r1;
                }
                mVar.g = fVar2;
                n.a aVar2 = n.a;
                if (aVar == aVar2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    f.c cVar11 = aVar2.g;
                    if (cVar11 != null) {
                        cVar4 = cVar11;
                    }
                    cVar4.f = r1;
                    aVar2.g = r1;
                    aVar2.e = -1;
                    aVar2.i = r1;
                    if (cVar4 != aVar2) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        mVar.e = cVar4;
                        if (z5) {
                            mVar.g();
                        }
                        this.A.f();
                        if (mVar.d(AdRequest.MAX_CONTENT_URL_LENGTH) && this.d == null) {
                            a0(this);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("trimChain did not update the head".toString());
                }
                throw new IllegalStateException("trimChain called on already trimmed chain".toString());
            }
            throw new IllegalStateException("padChain called on already padded chain".toString());
        }
        throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
    }

    @Override // com.amazon.aps.iva.u1.e
    public final void h(d0 d0Var) {
        com.amazon.aps.iva.yb0.j.f(d0Var, "value");
        if (!com.amazon.aps.iva.yb0.j.a(this.q, d0Var)) {
            this.q = d0Var;
            u uVar = this.r;
            uVar.getClass();
            uVar.b.setValue(d0Var);
            D();
        }
    }

    @Override // com.amazon.aps.iva.u1.e
    public final void i(m0 m0Var) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(m0Var, "value");
        this.v = m0Var;
        Y((com.amazon.aps.iva.o2.c) m0Var.b(d1.e));
        Z((com.amazon.aps.iva.o2.l) m0Var.b(d1.k));
        b0((v2) m0Var.b(d1.p));
        f.c cVar = this.z.e;
        if ((cVar.e & 32768) != 0) {
            while (cVar != null) {
                if ((cVar.d & 32768) != 0) {
                    f.c cVar2 = cVar;
                    com.amazon.aps.iva.p0.f fVar = null;
                    while (cVar2 != null) {
                        if (cVar2 instanceof com.amazon.aps.iva.u1.f) {
                            f.c V = ((com.amazon.aps.iva.u1.f) cVar2).V();
                            if (V.n) {
                                k0.d(V);
                            } else {
                                V.k = true;
                            }
                        } else {
                            if ((cVar2.d & 32768) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z && (cVar2 instanceof com.amazon.aps.iva.u1.j)) {
                                int i2 = 0;
                                for (f.c cVar3 = ((com.amazon.aps.iva.u1.j) cVar2).p; cVar3 != null; cVar3 = cVar3.g) {
                                    if ((cVar3.d & 32768) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
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
                if ((cVar.e & 32768) != 0) {
                    cVar = cVar.g;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0144 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(androidx.compose.ui.node.p r10) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.e.j(androidx.compose.ui.node.p):void");
    }

    public final void k() {
        this.x = this.w;
        this.w = f.NotUsed;
        com.amazon.aps.iva.p0.f<e> y = y();
        int i2 = y.d;
        if (i2 > 0) {
            e[] eVarArr = y.b;
            int i3 = 0;
            do {
                e eVar = eVarArr[i3];
                if (eVar.w != f.NotUsed) {
                    eVar.k();
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final void l() {
        this.x = this.w;
        this.w = f.NotUsed;
        com.amazon.aps.iva.p0.f<e> y = y();
        int i2 = y.d;
        if (i2 > 0) {
            e[] eVarArr = y.b;
            int i3 = 0;
            do {
                e eVar = eVarArr[i3];
                if (eVar.w == f.InLayoutBlock) {
                    eVar.l();
                }
                i3++;
            } while (i3 < i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m(int r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r8) goto L11
            java.lang.String r3 = "  "
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L11:
            java.lang.String r2 = "|-"
            r0.append(r2)
            java.lang.String r2 = r7.toString()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            com.amazon.aps.iva.p0.f r2 = r7.y()
            int r3 = r2.d
            if (r3 <= 0) goto L3e
            T[] r2 = r2.b
            r4 = r1
        L2d:
            r5 = r2[r4]
            androidx.compose.ui.node.e r5 = (androidx.compose.ui.node.e) r5
            int r6 = r8 + 1
            java.lang.String r5 = r5.m(r6)
            r0.append(r5)
            int r4 = r4 + 1
            if (r4 < r3) goto L2d
        L3e:
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "tree.toString()"
            com.amazon.aps.iva.yb0.j.e(r0, r2)
            if (r8 != 0) goto L58
            int r8 = r0.length()
            int r8 = r8 + (-1)
            java.lang.String r0 = r0.substring(r1, r8)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            com.amazon.aps.iva.yb0.j.e(r0, r8)
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.e.m(int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.e.n():void");
    }

    public final void o(com.amazon.aps.iva.f1.u uVar) {
        com.amazon.aps.iva.yb0.j.f(uVar, "canvas");
        this.z.c.j1(uVar);
    }

    public final List<c0> p() {
        f.a aVar = this.A.o;
        com.amazon.aps.iva.yb0.j.c(aVar);
        androidx.compose.ui.node.f fVar = androidx.compose.ui.node.f.this;
        fVar.a.r();
        boolean z = aVar.s;
        com.amazon.aps.iva.p0.f<f.a> fVar2 = aVar.r;
        if (!z) {
            return fVar2.e();
        }
        e eVar = fVar.a;
        com.amazon.aps.iva.p0.f<e> y = eVar.y();
        int i2 = y.d;
        if (i2 > 0) {
            e[] eVarArr = y.b;
            int i3 = 0;
            do {
                e eVar2 = eVarArr[i3];
                if (fVar2.d <= i3) {
                    f.a aVar2 = eVar2.A.o;
                    com.amazon.aps.iva.yb0.j.c(aVar2);
                    fVar2.b(aVar2);
                } else {
                    f.a aVar3 = eVar2.A.o;
                    com.amazon.aps.iva.yb0.j.c(aVar3);
                    f.a[] aVarArr = fVar2.b;
                    f.a aVar4 = aVarArr[i3];
                    aVarArr[i3] = aVar3;
                }
                i3++;
            } while (i3 < i2);
            fVar2.m(eVar.r().size(), fVar2.d);
            aVar.s = false;
            return fVar2.e();
        }
        fVar2.m(eVar.r().size(), fVar2.d);
        aVar.s = false;
        return fVar2.e();
    }

    public final List<c0> q() {
        f.b bVar = this.A.n;
        androidx.compose.ui.node.f fVar = androidx.compose.ui.node.f.this;
        fVar.a.c0();
        boolean z = bVar.v;
        com.amazon.aps.iva.p0.f<f.b> fVar2 = bVar.u;
        if (!z) {
            return fVar2.e();
        }
        e eVar = fVar.a;
        com.amazon.aps.iva.p0.f<e> y = eVar.y();
        int i2 = y.d;
        if (i2 > 0) {
            e[] eVarArr = y.b;
            int i3 = 0;
            do {
                e eVar2 = eVarArr[i3];
                if (fVar2.d <= i3) {
                    fVar2.b(eVar2.A.n);
                } else {
                    f.b bVar2 = eVar2.A.n;
                    f.b[] bVarArr = fVar2.b;
                    f.b bVar3 = bVarArr[i3];
                    bVarArr[i3] = bVar2;
                }
                i3++;
            } while (i3 < i2);
            fVar2.m(eVar.r().size(), fVar2.d);
            bVar.v = false;
            return fVar2.e();
        }
        fVar2.m(eVar.r().size(), fVar2.d);
        bVar.v = false;
        return fVar2.e();
    }

    public final List<e> r() {
        return y().e();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.amazon.aps.iva.a2.l, T] */
    public final com.amazon.aps.iva.a2.l s() {
        if (this.z.d(8) && this.n == null) {
            com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
            d0Var.b = new com.amazon.aps.iva.a2.l();
            e1 snapshotObserver = com.amazon.aps.iva.aq.j.K(this).getSnapshotObserver();
            i iVar = new i(d0Var);
            snapshotObserver.getClass();
            snapshotObserver.a(this, snapshotObserver.d, iVar);
            com.amazon.aps.iva.a2.l lVar = (com.amazon.aps.iva.a2.l) d0Var.b;
            this.n = lVar;
            return lVar;
        }
        return this.n;
    }

    public final List<e> t() {
        return ((com.amazon.aps.iva.p0.f) this.f.b).e();
    }

    public final String toString() {
        return defpackage.i.D(this) + " children: " + r().size() + " measurePolicy: " + this.q;
    }

    public final f u() {
        f fVar;
        f.a aVar = this.A.o;
        if (aVar == null || (fVar = aVar.j) == null) {
            return f.NotUsed;
        }
        return fVar;
    }

    public final e v() {
        e eVar = this.i;
        while (true) {
            boolean z = false;
            if (eVar != null && eVar.b) {
                z = true;
            }
            if (z) {
                eVar = eVar.i;
            } else {
                return eVar;
            }
        }
    }

    public final int w() {
        return this.A.n.i;
    }

    public final com.amazon.aps.iva.p0.f<e> x() {
        boolean z = this.p;
        com.amazon.aps.iva.p0.f<e> fVar = this.o;
        if (z) {
            fVar.f();
            fVar.c(fVar.d, y());
            y yVar = M;
            com.amazon.aps.iva.yb0.j.f(yVar, "comparator");
            e[] eVarArr = fVar.b;
            int i2 = fVar.d;
            com.amazon.aps.iva.yb0.j.f(eVarArr, "<this>");
            Arrays.sort(eVarArr, 0, i2, yVar);
            this.p = false;
        }
        return fVar;
    }

    public final com.amazon.aps.iva.p0.f<e> y() {
        c0();
        if (this.e == 0) {
            return (com.amazon.aps.iva.p0.f) this.f.b;
        }
        com.amazon.aps.iva.p0.f<e> fVar = this.g;
        com.amazon.aps.iva.yb0.j.c(fVar);
        return fVar;
    }

    @Override // com.amazon.aps.iva.u1.v0
    public final boolean y0() {
        return F();
    }

    public final void z(long j, s sVar, boolean z, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(sVar, "hitTestResult");
        m mVar = this.z;
        mVar.c.w1(o.E, mVar.c.o1(j), sVar, z, z2);
    }

    public e(int i2, boolean z) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? com.amazon.aps.iva.a2.o.a.addAndGet(1) : 0);
    }

    public e(boolean z, int i2) {
        this.b = z;
        this.c = i2;
        this.f = new g0(new com.amazon.aps.iva.p0.f(new e[16]), new h());
        this.o = new com.amazon.aps.iva.p0.f<>(new e[16]);
        this.p = true;
        this.q = J;
        this.r = new u(this);
        this.s = com.amazon.aps.iva.aq.j.b;
        this.t = com.amazon.aps.iva.o2.l.Ltr;
        this.u = L;
        m0.f0.getClass();
        this.v = m0.a.b;
        f fVar = f.NotUsed;
        this.w = fVar;
        this.x = fVar;
        this.z = new m(this);
        this.A = new androidx.compose.ui.node.f(this);
        this.D = true;
        this.E = f.a.c;
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public static final class b implements v2 {
        @Override // com.amazon.aps.iva.v1.v2
        public final long a() {
            return 300L;
        }

        @Override // com.amazon.aps.iva.v1.v2
        public final long c() {
            return 400L;
        }

        @Override // com.amazon.aps.iva.v1.v2
        public final long d() {
            int i = com.amazon.aps.iva.o2.g.d;
            return com.amazon.aps.iva.o2.g.b;
        }

        @Override // com.amazon.aps.iva.v1.v2
        public final float e() {
            return 16.0f;
        }

        @Override // com.amazon.aps.iva.v1.v2
        public final void b() {
        }
    }

    @Override // com.amazon.aps.iva.u1.e
    public final void c() {
    }
}
