package androidx.compose.ui.node;

import androidx.compose.ui.node.e;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.f1.g0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.u1.b0;
import com.amazon.aps.iva.u1.d0;
import com.amazon.aps.iva.u1.e1;
import com.amazon.aps.iva.u1.z;
/* compiled from: LayoutNodeLayoutDelegate.kt */
/* loaded from: classes.dex */
public final class f {
    public final e a;
    public e.d b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public final b n;
    public a o;

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public final class a extends u0 implements c0, com.amazon.aps.iva.u1.b {
        public boolean g;
        public boolean k;
        public boolean l;
        public com.amazon.aps.iva.o2.a m;
        public com.amazon.aps.iva.xb0.l<? super g0, q> o;
        public boolean p;
        public boolean t;
        public Object v;
        public int h = Integer.MAX_VALUE;
        public int i = Integer.MAX_VALUE;
        public e.f j = e.f.NotUsed;
        public long n = com.amazon.aps.iva.o2.h.b;
        public final d0 q = new d0(this);
        public final com.amazon.aps.iva.p0.f<a> r = new com.amazon.aps.iva.p0.f<>(new a[16]);
        public boolean s = true;
        public boolean u = true;

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* renamed from: androidx.compose.ui.node.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0018a {
            public static final /* synthetic */ int[] a;
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[e.d.values().length];
                try {
                    iArr[e.d.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.d.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.d.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.d.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
                int[] iArr2 = new int[e.f.values().length];
                try {
                    iArr2[e.f.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[e.f.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                b = iArr2;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
            public final /* synthetic */ k i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k kVar) {
                super(0);
                this.i = kVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
            @Override // com.amazon.aps.iva.xb0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.amazon.aps.iva.kb0.q invoke() {
                /*
                    r9 = this;
                    androidx.compose.ui.node.f$a r0 = androidx.compose.ui.node.f.a.this
                    androidx.compose.ui.node.f r1 = androidx.compose.ui.node.f.this
                    r2 = 0
                    r1.i = r2
                    androidx.compose.ui.node.e r1 = r1.a
                    com.amazon.aps.iva.p0.f r1 = r1.y()
                    int r3 = r1.d
                    r4 = 2147483647(0x7fffffff, float:NaN)
                    if (r3 <= 0) goto L36
                    T[] r1 = r1.b
                    r5 = r2
                L17:
                    r6 = r1[r5]
                    androidx.compose.ui.node.e r6 = (androidx.compose.ui.node.e) r6
                    androidx.compose.ui.node.f r6 = r6.A
                    androidx.compose.ui.node.f$a r6 = r6.o
                    com.amazon.aps.iva.yb0.j.c(r6)
                    int r7 = r6.i
                    r6.h = r7
                    r6.i = r4
                    androidx.compose.ui.node.e$f r7 = r6.j
                    androidx.compose.ui.node.e$f r8 = androidx.compose.ui.node.e.f.InLayoutBlock
                    if (r7 != r8) goto L32
                    androidx.compose.ui.node.e$f r7 = androidx.compose.ui.node.e.f.NotUsed
                    r6.j = r7
                L32:
                    int r5 = r5 + 1
                    if (r5 < r3) goto L17
                L36:
                    androidx.compose.ui.node.g r1 = androidx.compose.ui.node.g.h
                    r0.w(r1)
                    androidx.compose.ui.node.k r1 = r9.i
                    com.amazon.aps.iva.s1.e0 r1 = r1.M0()
                    r1.d()
                    androidx.compose.ui.node.f r1 = androidx.compose.ui.node.f.this
                    androidx.compose.ui.node.e r1 = r1.a
                    com.amazon.aps.iva.p0.f r1 = r1.y()
                    int r3 = r1.d
                    if (r3 <= 0) goto L6c
                    T[] r1 = r1.b
                L52:
                    r5 = r1[r2]
                    androidx.compose.ui.node.e r5 = (androidx.compose.ui.node.e) r5
                    androidx.compose.ui.node.f r5 = r5.A
                    androidx.compose.ui.node.f$a r5 = r5.o
                    com.amazon.aps.iva.yb0.j.c(r5)
                    int r6 = r5.h
                    int r7 = r5.i
                    if (r6 == r7) goto L68
                    if (r7 != r4) goto L68
                    r5.C0()
                L68:
                    int r2 = r2 + 1
                    if (r2 < r3) goto L52
                L6c:
                    androidx.compose.ui.node.h r1 = androidx.compose.ui.node.h.h
                    r0.w(r1)
                    com.amazon.aps.iva.kb0.q r0 = com.amazon.aps.iva.kb0.q.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.f.a.b.invoke():java.lang.Object");
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
            public final /* synthetic */ f h;
            public final /* synthetic */ long i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(f fVar, long j) {
                super(0);
                this.h = fVar;
                this.i = j;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final q invoke() {
                u0.a.C0692a c0692a = u0.a.a;
                k p1 = this.h.a().p1();
                com.amazon.aps.iva.yb0.j.c(p1);
                u0.a.f(c0692a, p1, this.i);
                return q.a;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.u1.b, q> {
            public static final d h = new d();

            public d() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(com.amazon.aps.iva.u1.b bVar) {
                com.amazon.aps.iva.u1.b bVar2 = bVar;
                com.amazon.aps.iva.yb0.j.f(bVar2, "it");
                bVar2.c().c = false;
                return q.a;
            }
        }

        public a() {
            this.v = f.this.n.r;
        }

        @Override // com.amazon.aps.iva.u1.b
        public final boolean A() {
            return this.p;
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int C(int i) {
            G0();
            k p1 = f.this.a().p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            return p1.C(i);
        }

        public final void C0() {
            if (this.p) {
                int i = 0;
                this.p = false;
                com.amazon.aps.iva.p0.f<e> y = f.this.a.y();
                int i2 = y.d;
                if (i2 > 0) {
                    e[] eVarArr = y.b;
                    do {
                        a aVar = eVarArr[i].A.o;
                        com.amazon.aps.iva.yb0.j.c(aVar);
                        aVar.C0();
                        i++;
                    } while (i < i2);
                }
            }
        }

        public final void D0() {
            com.amazon.aps.iva.p0.f<e> y;
            int i;
            boolean z;
            f fVar = f.this;
            if (fVar.m > 0 && (i = (y = fVar.a.y()).d) > 0) {
                e[] eVarArr = y.b;
                int i2 = 0;
                do {
                    e eVar = eVarArr[i2];
                    f fVar2 = eVar.A;
                    if (!fVar2.k && !fVar2.l) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && !fVar2.d) {
                        eVar.R(false);
                    }
                    a aVar = fVar2.o;
                    if (aVar != null) {
                        aVar.D0();
                    }
                    i2++;
                } while (i2 < i);
            }
        }

        public final void G0() {
            e.f fVar;
            f fVar2 = f.this;
            e.S(fVar2.a, false, 3);
            e eVar = fVar2.a;
            e v = eVar.v();
            if (v != null && eVar.w == e.f.NotUsed) {
                int i = C0018a.a[v.A.b.ordinal()];
                if (i != 2) {
                    if (i != 3) {
                        fVar = v.w;
                    } else {
                        fVar = e.f.InLayoutBlock;
                    }
                } else {
                    fVar = e.f.InMeasureBlock;
                }
                com.amazon.aps.iva.yb0.j.f(fVar, "<set-?>");
                eVar.w = fVar;
            }
        }

        public final void H0() {
            f fVar;
            e.d dVar;
            e v = f.this.a.v();
            if (!this.p) {
                x0();
            }
            boolean z = false;
            if (v != null) {
                if (!this.g && ((dVar = (fVar = v.A).b) == e.d.LayingOut || dVar == e.d.LookaheadLayingOut)) {
                    if (this.i == Integer.MAX_VALUE) {
                        z = true;
                    }
                    if (z) {
                        int i = fVar.i;
                        this.i = i;
                        fVar.i = i + 1;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.i = 0;
            }
            z();
        }

        @Override // com.amazon.aps.iva.u1.b
        public final androidx.compose.ui.node.c L() {
            return f.this.a.z.b;
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int M(int i) {
            G0();
            k p1 = f.this.a().p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            return p1.M(i);
        }

        public final boolean M0(long j) {
            boolean z;
            boolean z2;
            boolean b2;
            f fVar = f.this;
            e v = fVar.a.v();
            e eVar = fVar.a;
            if (!eVar.y && (v == null || !v.y)) {
                z = false;
            } else {
                z = true;
            }
            eVar.y = z;
            if (!eVar.A.f) {
                com.amazon.aps.iva.o2.a aVar = this.m;
                if (aVar == null) {
                    b2 = false;
                } else {
                    b2 = com.amazon.aps.iva.o2.a.b(aVar.a, j);
                }
                if (b2) {
                    p pVar = eVar.j;
                    if (pVar != null) {
                        pVar.f(eVar, true);
                    }
                    eVar.X();
                    return false;
                }
            }
            this.m = new com.amazon.aps.iva.o2.a(j);
            this.q.f = false;
            w(d.h);
            k p1 = fVar.a().p1();
            if (p1 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long a = com.amazon.aps.iva.o2.k.a(p1.b, p1.c);
                fVar.b = e.d.LookaheadMeasuring;
                fVar.f = false;
                e1 snapshotObserver = com.amazon.aps.iva.aq.j.K(eVar).getSnapshotObserver();
                b0 b0Var = new b0(fVar, j);
                snapshotObserver.getClass();
                if (eVar.d != null) {
                    snapshotObserver.a(eVar, snapshotObserver.b, b0Var);
                } else {
                    snapshotObserver.a(eVar, snapshotObserver.c, b0Var);
                }
                fVar.g = true;
                fVar.h = true;
                if (f.b(eVar)) {
                    fVar.d = true;
                    fVar.e = true;
                } else {
                    fVar.c = true;
                }
                fVar.b = e.d.Idle;
                s0(com.amazon.aps.iva.o2.k.a(p1.b, p1.c));
                if (((int) (a >> 32)) != p1.b || com.amazon.aps.iva.o2.j.b(a) != p1.c) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int P(int i) {
            G0();
            k p1 = f.this.a().p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            return p1.P(i);
        }

        @Override // com.amazon.aps.iva.s1.c0
        public final u0 V(long j) {
            boolean z;
            f fVar;
            e.f fVar2;
            f fVar3 = f.this;
            e eVar = fVar3.a;
            e v = eVar.v();
            if (v != null) {
                if (this.j != e.f.NotUsed && !eVar.y) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int i = C0018a.a[v.A.b.ordinal()];
                    if (i != 1 && i != 2) {
                        if (i != 3 && i != 4) {
                            throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + fVar.b);
                        }
                        fVar2 = e.f.InLayoutBlock;
                    } else {
                        fVar2 = e.f.InMeasureBlock;
                    }
                    this.j = fVar2;
                } else {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
            } else {
                this.j = e.f.NotUsed;
            }
            e eVar2 = fVar3.a;
            if (eVar2.w == e.f.NotUsed) {
                eVar2.k();
            }
            M0(j);
            return this;
        }

        @Override // com.amazon.aps.iva.s1.g0, com.amazon.aps.iva.s1.l
        public final Object b() {
            return this.v;
        }

        @Override // com.amazon.aps.iva.u1.b
        public final com.amazon.aps.iva.u1.a c() {
            return this.q;
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int d(int i) {
            G0();
            k p1 = f.this.a().p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            return p1.d(i);
        }

        @Override // com.amazon.aps.iva.s1.g0
        public final int e(com.amazon.aps.iva.s1.a aVar) {
            e.d dVar;
            com.amazon.aps.iva.yb0.j.f(aVar, "alignmentLine");
            f fVar = f.this;
            e v = fVar.a.v();
            e.d dVar2 = null;
            if (v != null) {
                dVar = v.A.b;
            } else {
                dVar = null;
            }
            e.d dVar3 = e.d.LookaheadMeasuring;
            d0 d0Var = this.q;
            if (dVar == dVar3) {
                d0Var.c = true;
            } else {
                e v2 = fVar.a.v();
                if (v2 != null) {
                    dVar2 = v2.A.b;
                }
                if (dVar2 == e.d.LookaheadLayingOut) {
                    d0Var.d = true;
                }
            }
            this.k = true;
            k p1 = fVar.a().p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            int e = p1.e(aVar);
            this.k = false;
            return e;
        }

        @Override // com.amazon.aps.iva.u1.b
        public final com.amazon.aps.iva.u1.b i() {
            f fVar;
            e v = f.this.a.v();
            if (v != null && (fVar = v.A) != null) {
                return fVar.o;
            }
            return null;
        }

        @Override // com.amazon.aps.iva.u1.b
        public final void i0() {
            e.S(f.this.a, false, 3);
        }

        @Override // com.amazon.aps.iva.s1.u0
        public final int k0() {
            k p1 = f.this.a().p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            return p1.k0();
        }

        @Override // com.amazon.aps.iva.s1.u0
        public final int o0() {
            k p1 = f.this.a().p1();
            com.amazon.aps.iva.yb0.j.c(p1);
            return p1.o0();
        }

        @Override // com.amazon.aps.iva.s1.u0
        public final void r0(long j, float f, com.amazon.aps.iva.xb0.l<? super g0, q> lVar) {
            e.d dVar = e.d.LookaheadLayingOut;
            f fVar = f.this;
            fVar.b = dVar;
            this.l = true;
            if (!com.amazon.aps.iva.o2.h.a(j, this.n)) {
                if (fVar.l || fVar.k) {
                    fVar.g = true;
                }
                D0();
            }
            e eVar = fVar.a;
            p K = com.amazon.aps.iva.aq.j.K(eVar);
            if (!fVar.g && this.p) {
                H0();
            } else {
                fVar.d(false);
                this.q.g = false;
                e1 snapshotObserver = K.getSnapshotObserver();
                c cVar = new c(fVar, j);
                snapshotObserver.getClass();
                com.amazon.aps.iva.yb0.j.f(eVar, "node");
                if (eVar.d != null) {
                    snapshotObserver.a(eVar, snapshotObserver.g, cVar);
                } else {
                    snapshotObserver.a(eVar, snapshotObserver.f, cVar);
                }
            }
            this.n = j;
            this.o = lVar;
            fVar.b = e.d.Idle;
        }

        @Override // com.amazon.aps.iva.u1.b
        public final void requestLayout() {
            e eVar = f.this.a;
            e.c cVar = e.J;
            eVar.R(false);
        }

        @Override // com.amazon.aps.iva.u1.b
        public final void w(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.u1.b, q> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "block");
            com.amazon.aps.iva.p0.f<e> y = f.this.a.y();
            int i = y.d;
            if (i > 0) {
                e[] eVarArr = y.b;
                int i2 = 0;
                do {
                    a aVar = eVarArr[i2].A.o;
                    com.amazon.aps.iva.yb0.j.c(aVar);
                    lVar.invoke(aVar);
                    i2++;
                } while (i2 < i);
            }
        }

        public final void x0() {
            boolean z = this.p;
            this.p = true;
            f fVar = f.this;
            if (!z && fVar.f) {
                e.S(fVar.a, true, 2);
            }
            com.amazon.aps.iva.p0.f<e> y = fVar.a.y();
            int i = y.d;
            if (i > 0) {
                e[] eVarArr = y.b;
                int i2 = 0;
                do {
                    e eVar = eVarArr[i2];
                    if (eVar.w() != Integer.MAX_VALUE) {
                        a aVar = eVar.A.o;
                        com.amazon.aps.iva.yb0.j.c(aVar);
                        aVar.x0();
                        e.V(eVar);
                    }
                    i2++;
                } while (i2 < i);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
        @Override // com.amazon.aps.iva.u1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void z() {
            /*
                r11 = this;
                r0 = 1
                r11.t = r0
                com.amazon.aps.iva.u1.d0 r1 = r11.q
                r1.i()
                androidx.compose.ui.node.f r2 = androidx.compose.ui.node.f.this
                boolean r3 = r2.g
                androidx.compose.ui.node.e r4 = r2.a
                r5 = 0
                if (r3 == 0) goto L4a
                com.amazon.aps.iva.p0.f r3 = r4.y()
                int r6 = r3.d
                if (r6 <= 0) goto L4a
                T[] r3 = r3.b
                r7 = r5
            L1c:
                r8 = r3[r7]
                androidx.compose.ui.node.e r8 = (androidx.compose.ui.node.e) r8
                androidx.compose.ui.node.f r9 = r8.A
                boolean r9 = r9.f
                if (r9 == 0) goto L46
                androidx.compose.ui.node.e$f r9 = r8.u()
                androidx.compose.ui.node.e$f r10 = androidx.compose.ui.node.e.f.InMeasureBlock
                if (r9 != r10) goto L46
                androidx.compose.ui.node.f r8 = r8.A
                androidx.compose.ui.node.f$a r8 = r8.o
                com.amazon.aps.iva.yb0.j.c(r8)
                com.amazon.aps.iva.o2.a r9 = r11.m
                com.amazon.aps.iva.yb0.j.c(r9)
                long r9 = r9.a
                boolean r8 = r8.M0(r9)
                if (r8 == 0) goto L46
                r8 = 3
                androidx.compose.ui.node.e.S(r4, r5, r8)
            L46:
                int r7 = r7 + 1
                if (r7 < r6) goto L1c
            L4a:
                androidx.compose.ui.node.c r3 = r11.L()
                androidx.compose.ui.node.k r3 = r3.H
                com.amazon.aps.iva.yb0.j.c(r3)
                boolean r6 = r2.h
                if (r6 != 0) goto L63
                boolean r6 = r11.k
                if (r6 != 0) goto La1
                boolean r6 = r3.h
                if (r6 != 0) goto La1
                boolean r6 = r2.g
                if (r6 == 0) goto La1
            L63:
                r2.g = r5
                androidx.compose.ui.node.e$d r6 = r2.b
                androidx.compose.ui.node.e$d r7 = androidx.compose.ui.node.e.d.LookaheadLayingOut
                r2.b = r7
                androidx.compose.ui.node.p r7 = com.amazon.aps.iva.aq.j.K(r4)
                r2.e(r5)
                com.amazon.aps.iva.u1.e1 r7 = r7.getSnapshotObserver()
                androidx.compose.ui.node.f$a$b r8 = new androidx.compose.ui.node.f$a$b
                r8.<init>(r3)
                r7.getClass()
                java.lang.String r9 = "node"
                com.amazon.aps.iva.yb0.j.f(r4, r9)
                androidx.compose.ui.node.e r9 = r4.d
                if (r9 == 0) goto L8d
                com.amazon.aps.iva.u1.a1 r9 = r7.h
                r7.a(r4, r9, r8)
                goto L92
            L8d:
                com.amazon.aps.iva.u1.x0 r9 = r7.e
                r7.a(r4, r9, r8)
            L92:
                r2.b = r6
                boolean r4 = r2.k
                if (r4 == 0) goto L9f
                boolean r3 = r3.h
                if (r3 == 0) goto L9f
                r11.requestLayout()
            L9f:
                r2.h = r5
            La1:
                boolean r2 = r1.d
                if (r2 == 0) goto La7
                r1.e = r0
            La7:
                boolean r0 = r1.b
                if (r0 == 0) goto Lb4
                boolean r0 = r1.f()
                if (r0 == 0) goto Lb4
                r1.h()
            Lb4:
                r11.t = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.f.a.z():void");
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public final class b extends u0 implements c0, com.amazon.aps.iva.u1.b {
        public boolean g;
        public boolean j;
        public boolean k;
        public boolean m;
        public com.amazon.aps.iva.xb0.l<? super g0, q> o;
        public float p;
        public Object r;
        public boolean s;
        public boolean w;
        public float x;
        public int h = Integer.MAX_VALUE;
        public int i = Integer.MAX_VALUE;
        public e.f l = e.f.NotUsed;
        public long n = com.amazon.aps.iva.o2.h.b;
        public boolean q = true;
        public final z t = new z(this);
        public final com.amazon.aps.iva.p0.f<b> u = new com.amazon.aps.iva.p0.f<>(new b[16]);
        public boolean v = true;

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[e.d.values().length];
                try {
                    iArr[e.d.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.d.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
                int[] iArr2 = new int[e.f.values().length];
                try {
                    iArr2[e.f.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[e.f.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                b = iArr2;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* renamed from: androidx.compose.ui.node.f$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0019b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
            public final /* synthetic */ e i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0019b(e eVar) {
                super(0);
                this.i = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
            @Override // com.amazon.aps.iva.xb0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.amazon.aps.iva.kb0.q invoke() {
                /*
                    r9 = this;
                    androidx.compose.ui.node.f$b r0 = androidx.compose.ui.node.f.b.this
                    androidx.compose.ui.node.f r1 = androidx.compose.ui.node.f.this
                    r2 = 0
                    r1.j = r2
                    androidx.compose.ui.node.e r1 = r1.a
                    com.amazon.aps.iva.p0.f r1 = r1.y()
                    int r3 = r1.d
                    r4 = 2147483647(0x7fffffff, float:NaN)
                    if (r3 <= 0) goto L33
                    T[] r1 = r1.b
                    r5 = r2
                L17:
                    r6 = r1[r5]
                    androidx.compose.ui.node.e r6 = (androidx.compose.ui.node.e) r6
                    androidx.compose.ui.node.f r6 = r6.A
                    androidx.compose.ui.node.f$b r6 = r6.n
                    int r7 = r6.i
                    r6.h = r7
                    r6.i = r4
                    androidx.compose.ui.node.e$f r7 = r6.l
                    androidx.compose.ui.node.e$f r8 = androidx.compose.ui.node.e.f.InLayoutBlock
                    if (r7 != r8) goto L2f
                    androidx.compose.ui.node.e$f r7 = androidx.compose.ui.node.e.f.NotUsed
                    r6.l = r7
                L2f:
                    int r5 = r5 + 1
                    if (r5 < r3) goto L17
                L33:
                    androidx.compose.ui.node.i r1 = androidx.compose.ui.node.i.h
                    r0.w(r1)
                    androidx.compose.ui.node.e r1 = r9.i
                    androidx.compose.ui.node.m r1 = r1.z
                    androidx.compose.ui.node.c r1 = r1.b
                    com.amazon.aps.iva.s1.e0 r1 = r1.M0()
                    r1.d()
                    androidx.compose.ui.node.f r1 = androidx.compose.ui.node.f.this
                    androidx.compose.ui.node.e r1 = r1.a
                    com.amazon.aps.iva.p0.f r3 = r1.y()
                    int r5 = r3.d
                    if (r5 <= 0) goto L7a
                    T[] r3 = r3.b
                L53:
                    r6 = r3[r2]
                    androidx.compose.ui.node.e r6 = (androidx.compose.ui.node.e) r6
                    androidx.compose.ui.node.f r7 = r6.A
                    androidx.compose.ui.node.f$b r7 = r7.n
                    int r7 = r7.h
                    int r8 = r6.w()
                    if (r7 == r8) goto L76
                    r1.L()
                    r1.B()
                    int r7 = r6.w()
                    if (r7 != r4) goto L76
                    androidx.compose.ui.node.f r6 = r6.A
                    androidx.compose.ui.node.f$b r6 = r6.n
                    r6.C0()
                L76:
                    int r2 = r2 + 1
                    if (r2 < r5) goto L53
                L7a:
                    androidx.compose.ui.node.j r1 = androidx.compose.ui.node.j.h
                    r0.w(r1)
                    com.amazon.aps.iva.kb0.q r0 = com.amazon.aps.iva.kb0.q.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.f.b.C0019b.invoke():java.lang.Object");
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
            public final /* synthetic */ com.amazon.aps.iva.xb0.l<g0, q> h;
            public final /* synthetic */ f i;
            public final /* synthetic */ long j;
            public final /* synthetic */ float k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(com.amazon.aps.iva.xb0.l<? super g0, q> lVar, f fVar, long j, float f) {
                super(0);
                this.h = lVar;
                this.i = fVar;
                this.j = j;
                this.k = f;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final q invoke() {
                u0.a.C0692a c0692a = u0.a.a;
                long j = this.j;
                float f = this.k;
                com.amazon.aps.iva.xb0.l<g0, q> lVar = this.h;
                f fVar = this.i;
                if (lVar == null) {
                    o a = fVar.a();
                    c0692a.getClass();
                    u0.a.e(a, j, f);
                } else {
                    o a2 = fVar.a();
                    c0692a.getClass();
                    u0.a.j(a2, j, f, lVar);
                }
                return q.a;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.u1.b, q> {
            public static final d h = new d();

            public d() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(com.amazon.aps.iva.u1.b bVar) {
                com.amazon.aps.iva.u1.b bVar2 = bVar;
                com.amazon.aps.iva.yb0.j.f(bVar2, "it");
                bVar2.c().c = false;
                return q.a;
            }
        }

        public b() {
        }

        @Override // com.amazon.aps.iva.u1.b
        public final boolean A() {
            return this.s;
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int C(int i) {
            G0();
            return f.this.a().C(i);
        }

        public final void C0() {
            if (this.s) {
                int i = 0;
                this.s = false;
                com.amazon.aps.iva.p0.f<e> y = f.this.a.y();
                int i2 = y.d;
                if (i2 > 0) {
                    e[] eVarArr = y.b;
                    do {
                        eVarArr[i].A.n.C0();
                        i++;
                    } while (i < i2);
                }
            }
        }

        public final void D0() {
            com.amazon.aps.iva.p0.f<e> y;
            int i;
            boolean z;
            f fVar = f.this;
            if (fVar.m > 0 && (i = (y = fVar.a.y()).d) > 0) {
                e[] eVarArr = y.b;
                int i2 = 0;
                do {
                    e eVar = eVarArr[i2];
                    f fVar2 = eVar.A;
                    if (!fVar2.k && !fVar2.l) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && !fVar2.d) {
                        eVar.T(false);
                    }
                    fVar2.n.D0();
                    i2++;
                } while (i2 < i);
            }
        }

        public final void G0() {
            e.f fVar;
            f fVar2 = f.this;
            e.U(fVar2.a, false, 3);
            e eVar = fVar2.a;
            e v = eVar.v();
            if (v != null && eVar.w == e.f.NotUsed) {
                int i = a.a[v.A.b.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        fVar = v.w;
                    } else {
                        fVar = e.f.InLayoutBlock;
                    }
                } else {
                    fVar = e.f.InMeasureBlock;
                }
                com.amazon.aps.iva.yb0.j.f(fVar, "<set-?>");
                eVar.w = fVar;
            }
        }

        public final void H0() {
            boolean z;
            f fVar = f.this;
            e v = fVar.a.v();
            float f = L().u;
            m mVar = fVar.a.z;
            o oVar = mVar.c;
            while (oVar != mVar.b) {
                com.amazon.aps.iva.yb0.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                androidx.compose.ui.node.d dVar = (androidx.compose.ui.node.d) oVar;
                f += dVar.u;
                oVar = dVar.j;
            }
            boolean z2 = false;
            if (f == this.x) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.x = f;
                if (v != null) {
                    v.L();
                }
                if (v != null) {
                    v.B();
                }
            }
            if (!this.s) {
                if (v != null) {
                    v.B();
                }
                x0();
            }
            if (v != null) {
                if (!this.g) {
                    f fVar2 = v.A;
                    if (fVar2.b == e.d.LayingOut) {
                        if (this.i == Integer.MAX_VALUE) {
                            z2 = true;
                        }
                        if (z2) {
                            int i = fVar2.j;
                            this.i = i;
                            fVar2.j = i + 1;
                        } else {
                            throw new IllegalStateException("Place was called on a node which was placed already".toString());
                        }
                    }
                }
            } else {
                this.i = 0;
            }
            z();
        }

        @Override // com.amazon.aps.iva.u1.b
        public final androidx.compose.ui.node.c L() {
            return f.this.a.z.b;
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int M(int i) {
            G0();
            return f.this.a().M(i);
        }

        public final void M0(long j, float f, com.amazon.aps.iva.xb0.l<? super g0, q> lVar) {
            e.d dVar = e.d.LayingOut;
            f fVar = f.this;
            fVar.b = dVar;
            this.n = j;
            this.p = f;
            this.o = lVar;
            this.k = true;
            p K = com.amazon.aps.iva.aq.j.K(fVar.a);
            if (!fVar.d && this.s) {
                o a2 = fVar.a();
                long j2 = a2.f;
                a2.E1(w.e(((int) (j >> 32)) + ((int) (j2 >> 32)), com.amazon.aps.iva.o2.h.b(j2) + com.amazon.aps.iva.o2.h.b(j)), f, lVar);
                H0();
            } else {
                this.t.g = false;
                fVar.d(false);
                e1 snapshotObserver = K.getSnapshotObserver();
                e eVar = fVar.a;
                c cVar = new c(lVar, fVar, j, f);
                snapshotObserver.getClass();
                com.amazon.aps.iva.yb0.j.f(eVar, "node");
                snapshotObserver.a(eVar, snapshotObserver.f, cVar);
            }
            fVar.b = e.d.Idle;
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int P(int i) {
            G0();
            return f.this.a().P(i);
        }

        public final boolean Q0(long j) {
            boolean z;
            boolean z2;
            f fVar = f.this;
            p K = com.amazon.aps.iva.aq.j.K(fVar.a);
            e eVar = fVar.a;
            e v = eVar.v();
            boolean z3 = true;
            if (!eVar.y && (v == null || !v.y)) {
                z = false;
            } else {
                z = true;
            }
            eVar.y = z;
            if (!eVar.A.c && com.amazon.aps.iva.o2.a.b(this.e, j)) {
                K.f(eVar, false);
                eVar.X();
                return false;
            }
            this.t.f = false;
            w(d.h);
            this.j = true;
            long j2 = fVar.a().d;
            w0(j);
            e.d dVar = fVar.b;
            e.d dVar2 = e.d.Idle;
            if (dVar == dVar2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                e.d dVar3 = e.d.Measuring;
                fVar.b = dVar3;
                fVar.c = false;
                e1 snapshotObserver = com.amazon.aps.iva.aq.j.K(eVar).getSnapshotObserver();
                com.amazon.aps.iva.u1.c0 c0Var = new com.amazon.aps.iva.u1.c0(fVar, j);
                snapshotObserver.getClass();
                snapshotObserver.a(eVar, snapshotObserver.c, c0Var);
                if (fVar.b == dVar3) {
                    fVar.d = true;
                    fVar.e = true;
                    fVar.b = dVar2;
                }
                if (com.amazon.aps.iva.o2.j.a(fVar.a().d, j2) && fVar.a().b == this.b && fVar.a().c == this.c) {
                    z3 = false;
                }
                s0(com.amazon.aps.iva.o2.k.a(fVar.a().b, fVar.a().c));
                return z3;
            }
            throw new IllegalStateException("layout state is not idle before measure starts".toString());
        }

        @Override // com.amazon.aps.iva.s1.c0
        public final u0 V(long j) {
            boolean z;
            f fVar;
            e.f fVar2;
            f fVar3 = f.this;
            e eVar = fVar3.a;
            e.f fVar4 = eVar.w;
            e.f fVar5 = e.f.NotUsed;
            if (fVar4 == fVar5) {
                eVar.k();
            }
            e eVar2 = fVar3.a;
            if (f.b(eVar2)) {
                this.j = true;
                w0(j);
                a aVar = fVar3.o;
                com.amazon.aps.iva.yb0.j.c(aVar);
                com.amazon.aps.iva.yb0.j.f(fVar5, "<set-?>");
                aVar.j = fVar5;
                aVar.V(j);
            }
            e v = eVar2.v();
            if (v != null) {
                if (this.l != fVar5 && !eVar2.y) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int i = a.a[v.A.b.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            fVar2 = e.f.InLayoutBlock;
                        } else {
                            throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + fVar.b);
                        }
                    } else {
                        fVar2 = e.f.InMeasureBlock;
                    }
                    this.l = fVar2;
                } else {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
            } else {
                this.l = fVar5;
            }
            Q0(j);
            return this;
        }

        @Override // com.amazon.aps.iva.s1.g0, com.amazon.aps.iva.s1.l
        public final Object b() {
            return this.r;
        }

        @Override // com.amazon.aps.iva.u1.b
        public final com.amazon.aps.iva.u1.a c() {
            return this.t;
        }

        @Override // com.amazon.aps.iva.s1.l
        public final int d(int i) {
            G0();
            return f.this.a().d(i);
        }

        @Override // com.amazon.aps.iva.s1.g0
        public final int e(com.amazon.aps.iva.s1.a aVar) {
            e.d dVar;
            com.amazon.aps.iva.yb0.j.f(aVar, "alignmentLine");
            f fVar = f.this;
            e v = fVar.a.v();
            e.d dVar2 = null;
            if (v != null) {
                dVar = v.A.b;
            } else {
                dVar = null;
            }
            e.d dVar3 = e.d.Measuring;
            z zVar = this.t;
            if (dVar == dVar3) {
                zVar.c = true;
            } else {
                e v2 = fVar.a.v();
                if (v2 != null) {
                    dVar2 = v2.A.b;
                }
                if (dVar2 == e.d.LayingOut) {
                    zVar.d = true;
                }
            }
            this.m = true;
            int e = fVar.a().e(aVar);
            this.m = false;
            return e;
        }

        @Override // com.amazon.aps.iva.u1.b
        public final com.amazon.aps.iva.u1.b i() {
            f fVar;
            e v = f.this.a.v();
            if (v != null && (fVar = v.A) != null) {
                return fVar.n;
            }
            return null;
        }

        @Override // com.amazon.aps.iva.u1.b
        public final void i0() {
            e.U(f.this.a, false, 3);
        }

        @Override // com.amazon.aps.iva.s1.u0
        public final int k0() {
            return f.this.a().k0();
        }

        @Override // com.amazon.aps.iva.s1.u0
        public final int o0() {
            return f.this.a().o0();
        }

        @Override // com.amazon.aps.iva.s1.u0
        public final void r0(long j, float f, com.amazon.aps.iva.xb0.l<? super g0, q> lVar) {
            boolean a2 = com.amazon.aps.iva.o2.h.a(j, this.n);
            f fVar = f.this;
            if (!a2) {
                if (fVar.l || fVar.k) {
                    fVar.d = true;
                }
                D0();
            }
            if (f.b(fVar.a)) {
                u0.a.C0692a c0692a = u0.a.a;
                a aVar = fVar.o;
                com.amazon.aps.iva.yb0.j.c(aVar);
                e v = fVar.a.v();
                if (v != null) {
                    v.A.i = 0;
                }
                aVar.i = Integer.MAX_VALUE;
                u0.a.d(c0692a, aVar, (int) (j >> 32), com.amazon.aps.iva.o2.h.b(j));
            }
            M0(j, f, lVar);
        }

        @Override // com.amazon.aps.iva.u1.b
        public final void requestLayout() {
            e eVar = f.this.a;
            e.c cVar = e.J;
            eVar.T(false);
        }

        @Override // com.amazon.aps.iva.u1.b
        public final void w(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.u1.b, q> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "block");
            com.amazon.aps.iva.p0.f<e> y = f.this.a.y();
            int i = y.d;
            if (i > 0) {
                e[] eVarArr = y.b;
                int i2 = 0;
                do {
                    lVar.invoke(eVarArr[i2].A.n);
                    i2++;
                } while (i2 < i);
            }
        }

        public final void x0() {
            boolean z = this.s;
            this.s = true;
            e eVar = f.this.a;
            if (!z) {
                f fVar = eVar.A;
                if (fVar.c) {
                    e.U(eVar, true, 2);
                } else if (fVar.f) {
                    e.S(eVar, true, 2);
                }
            }
            m mVar = eVar.z;
            o oVar = mVar.b.j;
            for (o oVar2 = mVar.c; !com.amazon.aps.iva.yb0.j.a(oVar2, oVar) && oVar2 != null; oVar2 = oVar2.j) {
                if (oVar2.y) {
                    oVar2.y1();
                }
            }
            com.amazon.aps.iva.p0.f<e> y = eVar.y();
            int i = y.d;
            if (i > 0) {
                e[] eVarArr = y.b;
                int i2 = 0;
                do {
                    e eVar2 = eVarArr[i2];
                    if (eVar2.w() != Integer.MAX_VALUE) {
                        eVar2.A.n.x0();
                        e.V(eVar2);
                    }
                    i2++;
                } while (i2 < i);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
        @Override // com.amazon.aps.iva.u1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void z() {
            /*
                r11 = this;
                r0 = 1
                r11.w = r0
                com.amazon.aps.iva.u1.z r1 = r11.t
                r1.i()
                androidx.compose.ui.node.f r2 = androidx.compose.ui.node.f.this
                boolean r3 = r2.d
                androidx.compose.ui.node.e r4 = r2.a
                r5 = 0
                if (r3 == 0) goto L3c
                com.amazon.aps.iva.p0.f r3 = r4.y()
                int r6 = r3.d
                if (r6 <= 0) goto L3c
                T[] r3 = r3.b
                r7 = r5
            L1c:
                r8 = r3[r7]
                androidx.compose.ui.node.e r8 = (androidx.compose.ui.node.e) r8
                androidx.compose.ui.node.f r9 = r8.A
                boolean r10 = r9.c
                if (r10 == 0) goto L38
                androidx.compose.ui.node.f$b r9 = r9.n
                androidx.compose.ui.node.e$f r9 = r9.l
                androidx.compose.ui.node.e$f r10 = androidx.compose.ui.node.e.f.InMeasureBlock
                if (r9 != r10) goto L38
                boolean r8 = androidx.compose.ui.node.e.N(r8)
                if (r8 == 0) goto L38
                r8 = 3
                androidx.compose.ui.node.e.U(r4, r5, r8)
            L38:
                int r7 = r7 + 1
                if (r7 < r6) goto L1c
            L3c:
                boolean r3 = r2.e
                if (r3 != 0) goto L50
                boolean r3 = r11.m
                if (r3 != 0) goto L83
                androidx.compose.ui.node.c r3 = r11.L()
                boolean r3 = r3.h
                if (r3 != 0) goto L83
                boolean r3 = r2.d
                if (r3 == 0) goto L83
            L50:
                r2.d = r5
                androidx.compose.ui.node.e$d r3 = r2.b
                androidx.compose.ui.node.e$d r6 = androidx.compose.ui.node.e.d.LayingOut
                r2.b = r6
                r2.e(r5)
                androidx.compose.ui.node.p r6 = com.amazon.aps.iva.aq.j.K(r4)
                com.amazon.aps.iva.u1.e1 r6 = r6.getSnapshotObserver()
                androidx.compose.ui.node.f$b$b r7 = new androidx.compose.ui.node.f$b$b
                r7.<init>(r4)
                r6.getClass()
                com.amazon.aps.iva.u1.x0 r8 = r6.e
                r6.a(r4, r8, r7)
                r2.b = r3
                androidx.compose.ui.node.c r3 = r11.L()
                boolean r3 = r3.h
                if (r3 == 0) goto L81
                boolean r3 = r2.k
                if (r3 == 0) goto L81
                r11.requestLayout()
            L81:
                r2.e = r5
            L83:
                boolean r2 = r1.d
                if (r2 == 0) goto L89
                r1.e = r0
            L89:
                boolean r0 = r1.b
                if (r0 == 0) goto L96
                boolean r0 = r1.f()
                if (r0 == 0) goto L96
                r1.h()
            L96:
                r11.w = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.f.b.z():void");
        }
    }

    public f(e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        this.a = eVar;
        this.b = e.d.Idle;
        this.n = new b();
    }

    public static boolean b(e eVar) {
        e eVar2;
        if (eVar.d != null) {
            e v = eVar.v();
            if (v != null) {
                eVar2 = v.d;
            } else {
                eVar2 = null;
            }
            if (eVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final o a() {
        return this.a.z.c;
    }

    public final void c(int i) {
        boolean z;
        f fVar;
        int i2 = this.m;
        this.m = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            e v = this.a.v();
            if (v != null) {
                fVar = v.A;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                if (i == 0) {
                    fVar.c(fVar.m - 1);
                } else {
                    fVar.c(fVar.m + 1);
                }
            }
        }
    }

    public final void d(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z && !this.k) {
                c(this.m + 1);
            } else if (!z && !this.k) {
                c(this.m - 1);
            }
        }
    }

    public final void e(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.l) {
                c(this.m + 1);
            } else if (!z && !this.l) {
                c(this.m - 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r5.b() == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r0 != true) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r7 = this;
            androidx.compose.ui.node.f$b r0 = r7.n
            java.lang.Object r1 = r0.r
            r2 = 1
            r3 = 0
            androidx.compose.ui.node.f r4 = androidx.compose.ui.node.f.this
            if (r1 != 0) goto L15
            androidx.compose.ui.node.o r1 = r4.a()
            java.lang.Object r1 = r1.b()
            if (r1 != 0) goto L15
            goto L19
        L15:
            boolean r1 = r0.q
            if (r1 != 0) goto L1b
        L19:
            r0 = r3
            goto L28
        L1b:
            r0.q = r3
            androidx.compose.ui.node.o r1 = r4.a()
            java.lang.Object r1 = r1.b()
            r0.r = r1
            r0 = r2
        L28:
            r1 = 3
            androidx.compose.ui.node.e r4 = r7.a
            if (r0 == 0) goto L36
            androidx.compose.ui.node.e r0 = r4.v()
            if (r0 == 0) goto L36
            androidx.compose.ui.node.e.U(r0, r3, r1)
        L36:
            androidx.compose.ui.node.f$a r0 = r7.o
            if (r0 == 0) goto L6f
            java.lang.Object r5 = r0.v
            androidx.compose.ui.node.f r6 = androidx.compose.ui.node.f.this
            if (r5 != 0) goto L52
            androidx.compose.ui.node.o r5 = r6.a()
            androidx.compose.ui.node.k r5 = r5.p1()
            com.amazon.aps.iva.yb0.j.c(r5)
            java.lang.Object r5 = r5.b()
            if (r5 != 0) goto L52
            goto L56
        L52:
            boolean r5 = r0.u
            if (r5 != 0) goto L58
        L56:
            r0 = r3
            goto L6c
        L58:
            r0.u = r3
            androidx.compose.ui.node.o r5 = r6.a()
            androidx.compose.ui.node.k r5 = r5.p1()
            com.amazon.aps.iva.yb0.j.c(r5)
            java.lang.Object r5 = r5.b()
            r0.v = r5
            r0 = r2
        L6c:
            if (r0 != r2) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            if (r2 == 0) goto L8b
            boolean r0 = b(r4)
            if (r0 == 0) goto L82
            androidx.compose.ui.node.e r0 = r4.v()
            if (r0 == 0) goto L8b
            androidx.compose.ui.node.e.U(r0, r3, r1)
            goto L8b
        L82:
            androidx.compose.ui.node.e r0 = r4.v()
            if (r0 == 0) goto L8b
            androidx.compose.ui.node.e.S(r0, r3, r1)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.f.f():void");
    }
}
