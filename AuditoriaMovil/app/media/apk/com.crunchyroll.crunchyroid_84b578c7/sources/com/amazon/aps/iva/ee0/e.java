package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.ee0.b1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes4.dex */
public final class e {
    public static final e a = new e();

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.amazon.aps.iva.he0.r.values().length];
            try {
                iArr[com.amazon.aps.iva.he0.r.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.he0.r.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.he0.r.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[b1.b.values().length];
            try {
                iArr2[b1.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[b1.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b1.b.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(com.amazon.aps.iva.he0.n r3, com.amazon.aps.iva.he0.i r4) {
        /*
            boolean r0 = r3.X(r4)
            r1 = 1
            if (r0 != 0) goto L32
            boolean r0 = r4 instanceof com.amazon.aps.iva.he0.d
            r2 = 0
            if (r0 != 0) goto Ld
            goto L2d
        Ld:
            com.amazon.aps.iva.he0.d r4 = (com.amazon.aps.iva.he0.d) r4
            com.amazon.aps.iva.fe0.j r4 = r3.z(r4)
            com.amazon.aps.iva.ee0.j1 r4 = r3.E(r4)
            boolean r0 = r3.g(r4)
            if (r0 != 0) goto L2d
            com.amazon.aps.iva.ee0.u1 r4 = r3.g0(r4)
            com.amazon.aps.iva.ee0.m0 r4 = r3.b0(r4)
            boolean r3 = r3.X(r4)
            if (r3 == 0) goto L2d
            r3 = r1
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ee0.e.a(com.amazon.aps.iva.he0.n, com.amazon.aps.iva.he0.i):boolean");
    }

    public static final boolean b(com.amazon.aps.iva.he0.n nVar, b1 b1Var, com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.i iVar2, boolean z) {
        boolean z2;
        Collection<com.amazon.aps.iva.he0.h> r = nVar.r(iVar);
        if ((r instanceof Collection) && r.isEmpty()) {
            return false;
        }
        for (com.amazon.aps.iva.he0.h hVar : r) {
            if (!com.amazon.aps.iva.yb0.j.a(nVar.D(hVar), nVar.i(iVar2)) && (!z || !i(a, b1Var, iVar2, hVar))) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public static List c(b1 b1Var, com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.l lVar) {
        b1.c I;
        com.amazon.aps.iva.he0.n nVar = b1Var.c;
        nVar.u(iVar, lVar);
        boolean t = nVar.t(lVar);
        com.amazon.aps.iva.lb0.z zVar = com.amazon.aps.iva.lb0.z.b;
        if (!t && nVar.W(iVar)) {
            return zVar;
        }
        if (nVar.B(lVar)) {
            if (nVar.w(nVar.i(iVar), lVar)) {
                m0 p = nVar.p(iVar, com.amazon.aps.iva.he0.b.FOR_SUBTYPING);
                if (p != null) {
                    iVar = p;
                }
                return f1.J(iVar);
            }
            return zVar;
        }
        com.amazon.aps.iva.me0.c cVar = new com.amazon.aps.iva.me0.c();
        b1Var.c();
        ArrayDeque<com.amazon.aps.iva.he0.i> arrayDeque = b1Var.g;
        com.amazon.aps.iva.yb0.j.c(arrayDeque);
        com.amazon.aps.iva.me0.d dVar = b1Var.h;
        com.amazon.aps.iva.yb0.j.c(dVar);
        arrayDeque.push(iVar);
        while (!arrayDeque.isEmpty()) {
            if (dVar.c <= 1000) {
                com.amazon.aps.iva.he0.i pop = arrayDeque.pop();
                com.amazon.aps.iva.yb0.j.e(pop, "current");
                if (dVar.add(pop)) {
                    m0 p2 = nVar.p(pop, com.amazon.aps.iva.he0.b.FOR_SUBTYPING);
                    if (p2 == null) {
                        p2 = pop;
                    }
                    boolean w = nVar.w(nVar.i(p2), lVar);
                    com.amazon.aps.iva.he0.n nVar2 = b1Var.c;
                    if (w) {
                        cVar.add(p2);
                        I = b1.c.C0222c.a;
                    } else if (nVar.m(p2) == 0) {
                        I = b1.c.b.a;
                    } else {
                        I = nVar2.I(p2);
                    }
                    if (!(!com.amazon.aps.iva.yb0.j.a(I, b1.c.C0222c.a))) {
                        I = null;
                    }
                    if (I != null) {
                        for (com.amazon.aps.iva.he0.h hVar : nVar2.M(nVar2.i(pop))) {
                            arrayDeque.add(I.a(b1Var, hVar));
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + iVar + ". Supertypes = " + com.amazon.aps.iva.lb0.x.B0(dVar, null, null, null, null, 63)).toString());
            }
        }
        b1Var.a();
        return cVar;
    }

    public static List d(b1 b1Var, com.amazon.aps.iva.he0.i iVar, com.amazon.aps.iva.he0.l lVar) {
        boolean z;
        List c = c(b1Var, iVar, lVar);
        if (c.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = c.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                com.amazon.aps.iva.he0.n nVar = b1Var.c;
                com.amazon.aps.iva.he0.j j = nVar.j((com.amazon.aps.iva.he0.i) next);
                int f = nVar.f(j);
                int i = 0;
                while (true) {
                    if (i >= f) {
                        break;
                    }
                    if (nVar.n(nVar.g0(nVar.F(j, i))) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                    i++;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            return c;
        }
        return c;
    }

    public static boolean e(b1 b1Var, com.amazon.aps.iva.he0.h hVar, com.amazon.aps.iva.he0.h hVar2) {
        com.amazon.aps.iva.yb0.j.f(b1Var, "state");
        com.amazon.aps.iva.yb0.j.f(hVar, "a");
        com.amazon.aps.iva.yb0.j.f(hVar2, "b");
        if (hVar == hVar2) {
            return true;
        }
        e eVar = a;
        com.amazon.aps.iva.he0.n nVar = b1Var.c;
        if (g(nVar, hVar) && g(nVar, hVar2)) {
            com.amazon.aps.iva.ab.a aVar = b1Var.e;
            com.amazon.aps.iva.he0.h d = b1Var.d(aVar.q(hVar));
            com.amazon.aps.iva.he0.h d2 = b1Var.d(aVar.q(hVar2));
            m0 b = nVar.b(d);
            if (!nVar.w(nVar.D(d), nVar.D(d2))) {
                return false;
            }
            if (nVar.m(b) == 0) {
                if (nVar.q(d) || nVar.q(d2) || nVar.o(b) == nVar.o(nVar.b(d2))) {
                    return true;
                }
                return false;
            }
        }
        if (i(eVar, b1Var, hVar, hVar2) && i(eVar, b1Var, hVar2, hVar)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        return r7.a(r7.D(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.he0.m f(com.amazon.aps.iva.he0.n r7, com.amazon.aps.iva.he0.h r8, com.amazon.aps.iva.he0.i r9) {
        /*
            int r0 = r7.m(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L67
            com.amazon.aps.iva.he0.k r4 = r7.N(r8, r2)
            boolean r5 = r7.g(r4)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L16
            r3 = r4
        L16:
            if (r3 == 0) goto L64
            com.amazon.aps.iva.ee0.u1 r3 = r7.g0(r3)
            if (r3 != 0) goto L1f
            goto L64
        L1f:
            com.amazon.aps.iva.ee0.m0 r4 = r7.b(r3)
            com.amazon.aps.iva.he0.i r4 = r7.Q(r4)
            boolean r4 = r7.A(r4)
            if (r4 == 0) goto L3c
            com.amazon.aps.iva.ee0.m0 r4 = r7.b(r9)
            com.amazon.aps.iva.he0.i r4 = r7.Q(r4)
            boolean r4 = r7.A(r4)
            if (r4 == 0) goto L3c
            goto L3d
        L3c:
            r6 = r1
        L3d:
            boolean r4 = com.amazon.aps.iva.yb0.j.a(r3, r9)
            if (r4 != 0) goto L5b
            if (r6 == 0) goto L54
            com.amazon.aps.iva.ee0.c1 r4 = r7.D(r3)
            com.amazon.aps.iva.ee0.c1 r5 = r7.D(r9)
            boolean r4 = com.amazon.aps.iva.yb0.j.a(r4, r5)
            if (r4 == 0) goto L54
            goto L5b
        L54:
            com.amazon.aps.iva.he0.m r3 = f(r7, r3, r9)
            if (r3 == 0) goto L64
            return r3
        L5b:
            com.amazon.aps.iva.ee0.c1 r8 = r7.D(r8)
            com.amazon.aps.iva.he0.m r7 = r7.a(r8, r2)
            return r7
        L64:
            int r2 = r2 + 1
            goto L6
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ee0.e.f(com.amazon.aps.iva.he0.n, com.amazon.aps.iva.he0.h, com.amazon.aps.iva.he0.i):com.amazon.aps.iva.he0.m");
    }

    public static boolean g(com.amazon.aps.iva.he0.n nVar, com.amazon.aps.iva.he0.h hVar) {
        if (nVar.T(nVar.D(hVar)) && !nVar.Z(hVar) && !nVar.Y(hVar) && !nVar.c(hVar) && com.amazon.aps.iva.yb0.j.a(nVar.i(nVar.b(hVar)), nVar.i(nVar.b0(hVar)))) {
            return true;
        }
        return false;
    }

    public static boolean h(b1 b1Var, com.amazon.aps.iva.he0.j jVar, com.amazon.aps.iva.he0.i iVar) {
        boolean z;
        boolean e;
        com.amazon.aps.iva.yb0.j.f(b1Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(jVar, "capturedSubArguments");
        com.amazon.aps.iva.yb0.j.f(iVar, "superType");
        com.amazon.aps.iva.he0.n nVar = b1Var.c;
        c1 i = nVar.i(iVar);
        int f = nVar.f(jVar);
        int L = nVar.L(i);
        if (f != L || f != nVar.m(iVar)) {
            return false;
        }
        for (int i2 = 0; i2 < L; i2++) {
            com.amazon.aps.iva.he0.k N = nVar.N(iVar, i2);
            if (!nVar.g(N)) {
                u1 g0 = nVar.g0(N);
                com.amazon.aps.iva.he0.k F = nVar.F(jVar, i2);
                nVar.e0(F);
                com.amazon.aps.iva.he0.r rVar = com.amazon.aps.iva.he0.r.INV;
                u1 g02 = nVar.g0(F);
                com.amazon.aps.iva.he0.r a0 = nVar.a0(nVar.a(i, i2));
                com.amazon.aps.iva.he0.r e0 = nVar.e0(N);
                com.amazon.aps.iva.yb0.j.f(a0, "declared");
                com.amazon.aps.iva.yb0.j.f(e0, "useSite");
                if (a0 == rVar) {
                    a0 = e0;
                } else if (e0 != rVar && a0 != e0) {
                    a0 = null;
                }
                if (a0 == null) {
                    return b1Var.a;
                }
                e eVar = a;
                if (a0 == rVar && (j(nVar, g02, g0, i) || j(nVar, g0, g02, i))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    continue;
                } else {
                    int i3 = b1Var.f;
                    if (i3 <= 100) {
                        b1Var.f = i3 + 1;
                        int i4 = a.a[a0.ordinal()];
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    e = i(eVar, b1Var, g0, g02);
                                } else {
                                    throw new com.amazon.aps.iva.kb0.h();
                                }
                            } else {
                                e = i(eVar, b1Var, g02, g0);
                            }
                        } else {
                            e = e(b1Var, g02, g0);
                        }
                        b1Var.f--;
                        if (!e) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + g02).toString());
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x018f, code lost:
        if (r10 != false) goto L360;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0393  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(com.amazon.aps.iva.ee0.e r24, com.amazon.aps.iva.ee0.b1 r25, com.amazon.aps.iva.he0.h r26, com.amazon.aps.iva.he0.h r27) {
        /*
            Method dump skipped, instructions count: 1611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ee0.e.i(com.amazon.aps.iva.ee0.e, com.amazon.aps.iva.ee0.b1, com.amazon.aps.iva.he0.h, com.amazon.aps.iva.he0.h):boolean");
    }

    public static boolean j(com.amazon.aps.iva.he0.n nVar, com.amazon.aps.iva.he0.h hVar, com.amazon.aps.iva.he0.h hVar2, com.amazon.aps.iva.he0.l lVar) {
        com.amazon.aps.iva.he0.q qVar;
        com.amazon.aps.iva.oc0.y0 h0;
        m0 R = nVar.R(hVar);
        if (!(R instanceof com.amazon.aps.iva.he0.d)) {
            return false;
        }
        com.amazon.aps.iva.he0.d dVar = (com.amazon.aps.iva.he0.d) R;
        if (nVar.H(dVar) || !nVar.g(nVar.E(nVar.z(dVar))) || nVar.v(dVar) != com.amazon.aps.iva.he0.b.FOR_SUBTYPING) {
            return false;
        }
        c1 D = nVar.D(hVar2);
        if (D instanceof com.amazon.aps.iva.he0.q) {
            qVar = (com.amazon.aps.iva.he0.q) D;
        } else {
            qVar = null;
        }
        if (qVar == null || (h0 = nVar.h0(qVar)) == null || !nVar.S(h0, lVar)) {
            return false;
        }
        return true;
    }
}
