package androidx.compose.ui.node;

import androidx.compose.ui.node.e;
import androidx.compose.ui.node.f;
import androidx.compose.ui.node.p;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.d0;
import com.amazon.aps.iva.u1.s0;
import com.amazon.aps.iva.u1.t0;
import java.util.Arrays;
/* compiled from: MeasureAndLayoutDelegate.kt */
/* loaded from: classes.dex */
public final class l {
    public final e a;
    public final com.amazon.aps.iva.u1.n b;
    public boolean c;
    public final t0 d;
    public final com.amazon.aps.iva.p0.f<p.a> e;
    public final long f;
    public final com.amazon.aps.iva.p0.f<a> g;
    public com.amazon.aps.iva.o2.a h;

    /* compiled from: MeasureAndLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final e a;
        public final boolean b;
        public final boolean c;

        public a(e eVar, boolean z, boolean z2) {
            com.amazon.aps.iva.yb0.j.f(eVar, "node");
            this.a = eVar;
            this.b = z;
            this.c = z2;
        }
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

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
                iArr[e.d.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.d.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.d.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e, Boolean> {
        public final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(1);
            this.h = z;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(e eVar) {
            boolean z;
            e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "it");
            boolean z2 = this.h;
            f fVar = eVar2.A;
            if (z2) {
                z = fVar.f;
            } else {
                z = fVar.c;
            }
            return Boolean.valueOf(z);
        }
    }

    public l(e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "root");
        this.a = eVar;
        this.b = new com.amazon.aps.iva.u1.n();
        this.d = new t0();
        this.e = new com.amazon.aps.iva.p0.f<>(new p.a[16]);
        this.f = 1L;
        this.g = new com.amazon.aps.iva.p0.f<>(new a[16]);
    }

    public static boolean e(e eVar) {
        boolean z;
        d0 d0Var;
        if (!eVar.A.f) {
            return false;
        }
        if (eVar.u() != e.f.InMeasureBlock) {
            f.a aVar = eVar.A.o;
            if (aVar != null && (d0Var = aVar.q) != null && d0Var.f()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void a(boolean z) {
        t0 t0Var = this.d;
        if (z) {
            t0Var.getClass();
            e eVar = this.a;
            com.amazon.aps.iva.yb0.j.f(eVar, "rootNode");
            com.amazon.aps.iva.p0.f<e> fVar = t0Var.a;
            fVar.f();
            fVar.b(eVar);
            eVar.H = true;
        }
        s0 s0Var = s0.b;
        com.amazon.aps.iva.p0.f<e> fVar2 = t0Var.a;
        fVar2.getClass();
        e[] eVarArr = fVar2.b;
        int i = fVar2.d;
        com.amazon.aps.iva.yb0.j.f(eVarArr, "<this>");
        Arrays.sort(eVarArr, 0, i, s0Var);
        int i2 = fVar2.d;
        if (i2 > 0) {
            int i3 = i2 - 1;
            e[] eVarArr2 = fVar2.b;
            do {
                e eVar2 = eVarArr2[i3];
                if (eVar2.H) {
                    t0.a(eVar2);
                }
                i3--;
            } while (i3 >= 0);
            fVar2.f();
        }
        fVar2.f();
    }

    public final boolean b(e eVar, com.amazon.aps.iva.o2.a aVar) {
        com.amazon.aps.iva.o2.a aVar2;
        boolean M0;
        e eVar2 = eVar.d;
        if (eVar2 == null) {
            return false;
        }
        f fVar = eVar.A;
        if (aVar != null) {
            if (eVar2 != null) {
                f.a aVar3 = fVar.o;
                com.amazon.aps.iva.yb0.j.c(aVar3);
                M0 = aVar3.M0(aVar.a);
            }
            M0 = false;
        } else {
            f.a aVar4 = fVar.o;
            if (aVar4 != null) {
                aVar2 = aVar4.m;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && eVar2 != null) {
                com.amazon.aps.iva.yb0.j.c(aVar4);
                M0 = aVar4.M0(aVar2.a);
            }
            M0 = false;
        }
        e v = eVar.v();
        if (M0 && v != null) {
            if (v.d == null) {
                o(v, false);
            } else if (eVar.u() == e.f.InMeasureBlock) {
                m(v, false);
            } else if (eVar.u() == e.f.InLayoutBlock) {
                l(v, false);
            }
        }
        return M0;
    }

    public final boolean c(e eVar, com.amazon.aps.iva.o2.a aVar) {
        boolean N;
        if (aVar != null) {
            N = eVar.M(aVar);
        } else {
            N = e.N(eVar);
        }
        e v = eVar.v();
        if (N && v != null) {
            e.f fVar = eVar.A.n.l;
            if (fVar == e.f.InMeasureBlock) {
                o(v, false);
            } else if (fVar == e.f.InLayoutBlock) {
                n(v, false);
            }
        }
        return N;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(androidx.compose.ui.node.e r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "layoutNode"
            com.amazon.aps.iva.yb0.j.f(r10, r0)
            com.amazon.aps.iva.u1.n r0 = r9.b
            java.lang.Object r1 = r0.c
            com.amazon.aps.iva.u1.m r1 = (com.amazon.aps.iva.u1.m) r1
            com.amazon.aps.iva.u1.l1<androidx.compose.ui.node.e> r1 = r1.c
            boolean r1 = r1.isEmpty()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.b
            com.amazon.aps.iva.u1.m r1 = (com.amazon.aps.iva.u1.m) r1
            com.amazon.aps.iva.u1.l1<androidx.compose.ui.node.e> r1 = r1.c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L23
            r1 = r3
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L27
            return
        L27:
            boolean r1 = r9.c
            if (r1 == 0) goto Lb6
            androidx.compose.ui.node.l$c r1 = new androidx.compose.ui.node.l$c
            r1.<init>(r11)
            java.lang.Object r4 = r1.invoke(r10)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ r3
            if (r4 == 0) goto Laa
            com.amazon.aps.iva.p0.f r4 = r10.y()
            int r5 = r4.d
            java.lang.Object r6 = r0.b
            java.lang.Object r0 = r0.c
            if (r5 <= 0) goto L89
            T[] r4 = r4.b
        L4b:
            r7 = r4[r2]
            androidx.compose.ui.node.e r7 = (androidx.compose.ui.node.e) r7
            java.lang.Object r8 = r1.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L76
            java.lang.String r8 = "node"
            com.amazon.aps.iva.yb0.j.f(r7, r8)
            if (r11 == 0) goto L6a
            r8 = r6
            com.amazon.aps.iva.u1.m r8 = (com.amazon.aps.iva.u1.m) r8
            boolean r8 = r8.d(r7)
            goto L71
        L6a:
            r8 = r0
            com.amazon.aps.iva.u1.m r8 = (com.amazon.aps.iva.u1.m) r8
            boolean r8 = r8.d(r7)
        L71:
            if (r8 == 0) goto L76
            r9.j(r7, r11)
        L76:
            java.lang.Object r8 = r1.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L85
            r9.d(r7, r11)
        L85:
            int r2 = r2 + 1
            if (r2 < r5) goto L4b
        L89:
            java.lang.Object r1 = r1.invoke(r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto La9
            if (r11 == 0) goto L9e
            com.amazon.aps.iva.u1.m r6 = (com.amazon.aps.iva.u1.m) r6
            boolean r11 = r6.d(r10)
            goto La4
        L9e:
            com.amazon.aps.iva.u1.m r0 = (com.amazon.aps.iva.u1.m) r0
            boolean r11 = r0.d(r10)
        La4:
            if (r11 == 0) goto La9
            r9.j(r10, r3)
        La9:
            return
        Laa:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Failed requirement."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lb6:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.l.d(androidx.compose.ui.node.e, boolean):void");
    }

    public final boolean f(com.amazon.aps.iva.xb0.a<q> aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.u1.m mVar;
        com.amazon.aps.iva.u1.n nVar = this.b;
        e eVar = this.a;
        if (eVar.F()) {
            if (eVar.G()) {
                if (!this.c) {
                    int i = 0;
                    if (this.h != null) {
                        this.c = true;
                        try {
                            if (((com.amazon.aps.iva.u1.m) nVar.c).c.isEmpty() && ((com.amazon.aps.iva.u1.m) nVar.b).c.isEmpty()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean z4 = !z2;
                            Object obj = nVar.c;
                            if (z4) {
                                z = false;
                                while (true) {
                                    boolean isEmpty = ((com.amazon.aps.iva.u1.m) obj).c.isEmpty();
                                    Object obj2 = nVar.b;
                                    if (isEmpty && ((com.amazon.aps.iva.u1.m) obj2).c.isEmpty()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!(!z3)) {
                                        break;
                                    }
                                    boolean z5 = !((com.amazon.aps.iva.u1.m) obj2).c.isEmpty();
                                    if (z5) {
                                        mVar = (com.amazon.aps.iva.u1.m) obj2;
                                    } else {
                                        mVar = (com.amazon.aps.iva.u1.m) obj;
                                    }
                                    e c2 = mVar.c();
                                    boolean j = j(c2, z5);
                                    if (c2 == eVar && j) {
                                        z = true;
                                    }
                                }
                                if (aVar != null) {
                                    aVar.invoke();
                                }
                            } else {
                                z = false;
                            }
                            this.c = false;
                        } catch (Throwable th) {
                            this.c = false;
                            throw th;
                        }
                    } else {
                        z = false;
                    }
                    com.amazon.aps.iva.p0.f<p.a> fVar = this.e;
                    int i2 = fVar.d;
                    if (i2 > 0) {
                        p.a[] aVarArr = fVar.b;
                        do {
                            aVarArr[i].f();
                            i++;
                        } while (i < i2);
                        fVar.f();
                        return z;
                    }
                    fVar.f();
                    return z;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final void g(e eVar, long j) {
        int i;
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        e eVar2 = this.a;
        if (!com.amazon.aps.iva.yb0.j.a(eVar, eVar2)) {
            if (eVar2.F()) {
                if (eVar2.G()) {
                    if (!this.c) {
                        ?? r1 = 0;
                        if (this.h != null) {
                            this.c = true;
                            try {
                                this.b.f(eVar);
                                boolean b2 = b(eVar, new com.amazon.aps.iva.o2.a(j));
                                c(eVar, new com.amazon.aps.iva.o2.a(j));
                                f fVar = eVar.A;
                                if ((b2 || fVar.g) && com.amazon.aps.iva.yb0.j.a(eVar.H(), Boolean.TRUE)) {
                                    eVar.I();
                                }
                                if (fVar.d && eVar.G()) {
                                    eVar.Q();
                                    t0 t0Var = this.d;
                                    t0Var.getClass();
                                    t0Var.a.b(eVar);
                                    eVar.H = true;
                                }
                            } finally {
                                this.c = false;
                            }
                        }
                        com.amazon.aps.iva.p0.f<p.a> fVar2 = this.e;
                        int i2 = fVar2.d;
                        if (i2 > 0) {
                            p.a[] aVarArr = fVar2.b;
                            do {
                                aVarArr[r1].f();
                                i = r1 + 1;
                                r1 = i;
                            } while (i < i2);
                            fVar2.f();
                            return;
                        }
                        fVar2.f();
                        return;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void h() {
        e eVar = this.a;
        if (eVar.F()) {
            if (eVar.G()) {
                if (!this.c) {
                    if (this.h != null) {
                        this.c = true;
                        try {
                            i(eVar);
                            return;
                        } finally {
                            this.c = false;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void i(e eVar) {
        boolean z;
        k(eVar);
        com.amazon.aps.iva.p0.f<e> y = eVar.y();
        int i = y.d;
        if (i > 0) {
            e[] eVarArr = y.b;
            int i2 = 0;
            do {
                e eVar2 = eVarArr[i2];
                f.b bVar = eVar2.A.n;
                if (bVar.l != e.f.InMeasureBlock && !bVar.t.f()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i(eVar2);
                }
                i2++;
            } while (i2 < i);
            k(eVar);
        }
        k(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(androidx.compose.ui.node.e r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.l.j(androidx.compose.ui.node.e, boolean):boolean");
    }

    public final void k(e eVar) {
        com.amazon.aps.iva.o2.a aVar;
        f fVar = eVar.A;
        if (!fVar.c && !fVar.f) {
            return;
        }
        if (eVar == this.a) {
            aVar = this.h;
            com.amazon.aps.iva.yb0.j.c(aVar);
        } else {
            aVar = null;
        }
        if (eVar.A.f) {
            b(eVar, aVar);
        }
        c(eVar, aVar);
    }

    public final boolean l(e eVar, boolean z) {
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        f fVar = eVar.A;
        int i = b.a[fVar.b.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 3) {
                return false;
            }
            if (i != 4 && i != 5) {
                throw new com.amazon.aps.iva.kb0.h();
            }
        }
        if ((fVar.f || fVar.g) && !z) {
            return false;
        }
        fVar.g = true;
        fVar.h = true;
        fVar.d = true;
        fVar.e = true;
        if (com.amazon.aps.iva.yb0.j.a(eVar.H(), Boolean.TRUE)) {
            e v = eVar.v();
            if (v != null && v.A.f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (v != null && v.A.g) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    this.b.e(eVar, true);
                }
            }
        }
        if (this.c) {
            return false;
        }
        return true;
    }

    public final boolean m(e eVar, boolean z) {
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        if (eVar.d != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f fVar = eVar.A;
            int i = b.a[fVar.b.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    if (i == 5) {
                        if (!fVar.f || z) {
                            fVar.f = true;
                            fVar.c = true;
                            if (com.amazon.aps.iva.yb0.j.a(eVar.H(), Boolean.TRUE) || e(eVar)) {
                                e v = eVar.v();
                                if (v != null && v.A.f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    this.b.e(eVar, true);
                                }
                            }
                            if (!this.c) {
                                return true;
                            }
                        }
                    } else {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                } else {
                    this.g.b(new a(eVar, true, z));
                }
            }
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }

    public final boolean n(e eVar, boolean z) {
        boolean z2;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        f fVar = eVar.A;
        int i = b.a[fVar.b.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            if (i == 5) {
                if (z || (!fVar.c && !fVar.d)) {
                    fVar.d = true;
                    fVar.e = true;
                    if (eVar.G()) {
                        e v = eVar.v();
                        if (v != null && v.A.d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            if (v != null && v.A.c) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                this.b.e(eVar, false);
                            }
                        }
                    }
                    if (!this.c) {
                        return true;
                    }
                }
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
        if (r7 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(androidx.compose.ui.node.e r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "layoutNode"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            androidx.compose.ui.node.f r0 = r6.A
            androidx.compose.ui.node.e$d r1 = r0.b
            int[] r2 = androidx.compose.ui.node.l.b.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L7a
            r4 = 2
            if (r1 == r4) goto L7a
            r4 = 3
            if (r1 == r4) goto L70
            r4 = 4
            if (r1 == r4) goto L70
            r4 = 5
            if (r1 != r4) goto L6a
            boolean r1 = r0.c
            if (r1 == 0) goto L28
            if (r7 != 0) goto L28
            goto L7a
        L28:
            r0.c = r2
            boolean r7 = r6.G()
            if (r7 != 0) goto L4f
            boolean r7 = r0.c
            if (r7 == 0) goto L4c
            androidx.compose.ui.node.f$b r7 = r0.n
            androidx.compose.ui.node.e$f r0 = r7.l
            androidx.compose.ui.node.e$f r1 = androidx.compose.ui.node.e.f.InMeasureBlock
            if (r0 == r1) goto L47
            com.amazon.aps.iva.u1.z r7 = r7.t
            boolean r7 = r7.f()
            if (r7 == 0) goto L45
            goto L47
        L45:
            r7 = r3
            goto L48
        L47:
            r7 = r2
        L48:
            if (r7 == 0) goto L4c
            r7 = r2
            goto L4d
        L4c:
            r7 = r3
        L4d:
            if (r7 == 0) goto L65
        L4f:
            androidx.compose.ui.node.e r7 = r6.v()
            if (r7 == 0) goto L5d
            androidx.compose.ui.node.f r7 = r7.A
            boolean r7 = r7.c
            if (r7 != r2) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            if (r7 != 0) goto L65
            com.amazon.aps.iva.u1.n r7 = r5.b
            r7.e(r6, r3)
        L65:
            boolean r6 = r5.c
            if (r6 != 0) goto L7a
            goto L7b
        L6a:
            com.amazon.aps.iva.kb0.h r6 = new com.amazon.aps.iva.kb0.h
            r6.<init>()
            throw r6
        L70:
            androidx.compose.ui.node.l$a r0 = new androidx.compose.ui.node.l$a
            r0.<init>(r6, r3, r7)
            com.amazon.aps.iva.p0.f<androidx.compose.ui.node.l$a> r6 = r5.g
            r6.b(r0)
        L7a:
            r2 = r3
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.l.o(androidx.compose.ui.node.e, boolean):boolean");
    }

    public final void p(long j) {
        boolean b2;
        com.amazon.aps.iva.o2.a aVar = this.h;
        boolean z = false;
        if (aVar == null) {
            b2 = false;
        } else {
            b2 = com.amazon.aps.iva.o2.a.b(aVar.a, j);
        }
        if (!b2) {
            if (!this.c) {
                this.h = new com.amazon.aps.iva.o2.a(j);
                e eVar = this.a;
                e eVar2 = eVar.d;
                f fVar = eVar.A;
                if (eVar2 != null) {
                    fVar.f = true;
                }
                fVar.c = true;
                if (eVar2 != null) {
                    z = true;
                }
                this.b.e(eVar, z);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
