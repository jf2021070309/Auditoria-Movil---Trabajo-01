package com.amazon.aps.iva.v2;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.u2.e;
import com.amazon.aps.iva.v2.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public final class e {
    public final com.amazon.aps.iva.u2.f a;
    public final com.amazon.aps.iva.u2.f d;
    public b.InterfaceC0780b f;
    public final b.a g;
    public final ArrayList<m> h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList<p> e = new ArrayList<>();

    public e(com.amazon.aps.iva.u2.f fVar) {
        new ArrayList();
        this.f = null;
        this.g = new b.a();
        this.h = new ArrayList<>();
        this.a = fVar;
        this.d = fVar;
    }

    public final void a(f fVar, int i, int i2, ArrayList arrayList, m mVar) {
        p pVar = fVar.d;
        if (pVar.c == null) {
            com.amazon.aps.iva.u2.f fVar2 = this.a;
            if (pVar != fVar2.d && pVar != fVar2.e) {
                if (mVar == null) {
                    mVar = new m(pVar);
                    arrayList.add(mVar);
                }
                pVar.c = mVar;
                mVar.b.add(pVar);
                f fVar3 = pVar.h;
                Iterator it = fVar3.k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        a((f) dVar, i, 0, arrayList, mVar);
                    }
                }
                f fVar4 = pVar.i;
                Iterator it2 = fVar4.k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i, 1, arrayList, mVar);
                    }
                }
                if (i == 1 && (pVar instanceof n)) {
                    Iterator it3 = ((n) pVar).k.k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i, 2, arrayList, mVar);
                        }
                    }
                }
                Iterator it4 = fVar3.l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i, 0, arrayList, mVar);
                }
                Iterator it5 = fVar4.l.iterator();
                while (it5.hasNext()) {
                    a((f) it5.next(), i, 1, arrayList, mVar);
                }
                if (i == 1 && (pVar instanceof n)) {
                    Iterator it6 = ((n) pVar).k.l.iterator();
                    while (it6.hasNext()) {
                        a((f) it6.next(), i, 2, arrayList, mVar);
                    }
                }
            }
        }
    }

    public final void b(com.amazon.aps.iva.u2.f fVar) {
        int i;
        e.b bVar;
        e.b bVar2;
        e.b bVar3;
        Iterator<com.amazon.aps.iva.u2.e> it = fVar.s0.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.u2.e next = it.next();
            e.b[] bVarArr = next.V;
            e.b bVar4 = bVarArr[0];
            e.b bVar5 = bVarArr[1];
            if (next.j0 == 8) {
                next.a = true;
            } else {
                float f = next.x;
                if (f < 1.0f && bVar4 == e.b.MATCH_CONSTRAINT) {
                    next.s = 2;
                }
                float f2 = next.A;
                if (f2 < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    next.t = 2;
                }
                if (next.Z > 0.0f) {
                    e.b bVar6 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar6 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        next.s = 3;
                    } else if (bVar5 == bVar6 && (bVar4 == e.b.WRAP_CONTENT || bVar4 == e.b.FIXED)) {
                        next.t = 3;
                    } else if (bVar4 == bVar6 && bVar5 == bVar6) {
                        if (next.s == 0) {
                            next.s = 3;
                        }
                        if (next.t == 0) {
                            next.t = 3;
                        }
                    }
                }
                e.b bVar7 = e.b.MATCH_CONSTRAINT;
                com.amazon.aps.iva.u2.d dVar = next.M;
                com.amazon.aps.iva.u2.d dVar2 = next.K;
                if (bVar4 == bVar7 && next.s == 1 && (dVar2.f == null || dVar.f == null)) {
                    bVar4 = e.b.WRAP_CONTENT;
                }
                com.amazon.aps.iva.u2.d dVar3 = next.N;
                com.amazon.aps.iva.u2.d dVar4 = next.L;
                if (bVar5 == bVar7 && next.t == 1 && (dVar4.f == null || dVar3.f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar8 = bVar5;
                l lVar = next.d;
                lVar.d = bVar4;
                int i2 = next.s;
                lVar.a = i2;
                n nVar = next.e;
                nVar.d = bVar8;
                int i3 = next.t;
                nVar.a = i3;
                e.b bVar9 = e.b.MATCH_PARENT;
                if ((bVar4 != bVar9 && bVar4 != e.b.FIXED && bVar4 != e.b.WRAP_CONTENT) || (bVar8 != bVar9 && bVar8 != e.b.FIXED && bVar8 != e.b.WRAP_CONTENT)) {
                    e.b[] bVarArr2 = fVar.V;
                    com.amazon.aps.iva.u2.d[] dVarArr = next.S;
                    if (bVar4 == bVar7 && (bVar8 == (bVar3 = e.b.WRAP_CONTENT) || bVar8 == e.b.FIXED)) {
                        if (i2 == 3) {
                            if (bVar8 == bVar3) {
                                f(next, bVar3, 0, bVar3, 0);
                            }
                            int l = next.l();
                            e.b bVar10 = e.b.FIXED;
                            f(next, bVar10, (int) ((l * next.Z) + 0.5f), bVar10, l);
                            next.d.e.d(next.r());
                            next.e.e.d(next.l());
                            next.a = true;
                        } else if (i2 == 1) {
                            f(next, bVar3, 0, bVar8, 0);
                            next.d.e.m = next.r();
                        } else {
                            bVar = bVar8;
                            if (i2 == 2) {
                                e.b bVar11 = bVarArr2[0];
                                e.b bVar12 = e.b.FIXED;
                                if (bVar11 == bVar12 || bVar11 == bVar9) {
                                    f(next, bVar12, (int) ((f * fVar.r()) + 0.5f), bVar, next.l());
                                    next.d.e.d(next.r());
                                    next.e.e.d(next.l());
                                    next.a = true;
                                }
                            } else if (dVarArr[0].f == null || dVarArr[1].f == null) {
                                f(next, bVar3, 0, bVar, 0);
                                next.d.e.d(next.r());
                                next.e.e.d(next.l());
                                next.a = true;
                            }
                        }
                    } else {
                        bVar = bVar8;
                    }
                    if (bVar == bVar7 && (bVar4 == (bVar2 = e.b.WRAP_CONTENT) || bVar4 == e.b.FIXED)) {
                        if (i3 == 3) {
                            if (bVar4 == bVar2) {
                                f(next, bVar2, 0, bVar2, 0);
                            }
                            int r = next.r();
                            float f3 = next.Z;
                            if (next.a0 == -1) {
                                f3 = 1.0f / f3;
                            }
                            e.b bVar13 = e.b.FIXED;
                            f(next, bVar13, r, bVar13, (int) ((r * f3) + 0.5f));
                            next.d.e.d(next.r());
                            next.e.e.d(next.l());
                            next.a = true;
                        } else if (i3 == 1) {
                            f(next, bVar4, 0, bVar2, 0);
                            next.e.e.m = next.l();
                        } else if (i3 == 2) {
                            e.b bVar14 = bVarArr2[1];
                            e.b bVar15 = e.b.FIXED;
                            if (bVar14 == bVar15 || bVar14 == bVar9) {
                                f(next, bVar4, next.r(), bVar15, (int) ((f2 * fVar.l()) + 0.5f));
                                next.d.e.d(next.r());
                                next.e.e.d(next.l());
                                next.a = true;
                            }
                        } else if (dVarArr[2].f == null || dVarArr[3].f == null) {
                            f(next, bVar2, 0, bVar, 0);
                            next.d.e.d(next.r());
                            next.e.e.d(next.l());
                            next.a = true;
                        }
                    }
                    if (bVar4 == bVar7 && bVar == bVar7) {
                        if (i2 != 1 && i3 != 1) {
                            if (i3 == 2 && i2 == 2) {
                                e.b bVar16 = bVarArr2[0];
                                e.b bVar17 = e.b.FIXED;
                                if (bVar16 == bVar17 && bVarArr2[1] == bVar17) {
                                    f(next, bVar17, (int) ((f * fVar.r()) + 0.5f), bVar17, (int) ((f2 * fVar.l()) + 0.5f));
                                    next.d.e.d(next.r());
                                    next.e.e.d(next.l());
                                    next.a = true;
                                }
                            }
                        } else {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            f(next, bVar18, 0, bVar18, 0);
                            next.d.e.m = next.r();
                            next.e.e.m = next.l();
                        }
                    }
                } else {
                    int r2 = next.r();
                    if (bVar4 == bVar9) {
                        r2 = (fVar.r() - dVar2.g) - dVar.g;
                        bVar4 = e.b.FIXED;
                    }
                    int l2 = next.l();
                    if (bVar8 == bVar9) {
                        int l3 = (fVar.l() - dVar4.g) - dVar3.g;
                        bVar8 = e.b.FIXED;
                        i = l3;
                    } else {
                        i = l2;
                    }
                    f(next, bVar4, r2, bVar8, i);
                    next.d.e.d(next.r());
                    next.e.e.d(next.l());
                    next.a = true;
                }
            }
        }
    }

    public final void c() {
        ArrayList<p> arrayList = this.e;
        arrayList.clear();
        com.amazon.aps.iva.u2.f fVar = this.d;
        fVar.d.f();
        fVar.e.f();
        arrayList.add(fVar.d);
        arrayList.add(fVar.e);
        Iterator<com.amazon.aps.iva.u2.e> it = fVar.s0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            com.amazon.aps.iva.u2.e next = it.next();
            if (next instanceof com.amazon.aps.iva.u2.h) {
                arrayList.add(new j(next));
            } else {
                if (next.y()) {
                    if (next.b == null) {
                        next.b = new c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.b);
                } else {
                    arrayList.add(next.d);
                }
                if (next.z()) {
                    if (next.c == null) {
                        next.c = new c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.e);
                }
                if (next instanceof com.amazon.aps.iva.u2.j) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.b != fVar) {
                next2.d();
            }
        }
        ArrayList<m> arrayList2 = this.h;
        arrayList2.clear();
        com.amazon.aps.iva.u2.f fVar2 = this.a;
        e(fVar2.d, 0, arrayList2);
        e(fVar2.e, 1, arrayList2);
        this.b = false;
    }

    public final int d(com.amazon.aps.iva.u2.f fVar, int i) {
        long j;
        ArrayList<m> arrayList;
        int i2;
        p pVar;
        p pVar2;
        long max;
        float f;
        long j2;
        com.amazon.aps.iva.u2.f fVar2 = fVar;
        int i3 = i;
        ArrayList<m> arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j3 = 0;
        while (i4 < size) {
            p pVar3 = arrayList2.get(i4).a;
            if (!(pVar3 instanceof c) ? !(i3 != 0 ? (pVar3 instanceof n) : (pVar3 instanceof l)) : ((c) pVar3).f != i3) {
                j = 0;
                arrayList = arrayList2;
                i2 = size;
            } else {
                if (i3 == 0) {
                    pVar = fVar2.d;
                } else {
                    pVar = fVar2.e;
                }
                f fVar3 = pVar.h;
                if (i3 == 0) {
                    pVar2 = fVar2.d;
                } else {
                    pVar2 = fVar2.e;
                }
                f fVar4 = pVar2.i;
                boolean contains = pVar3.h.l.contains(fVar3);
                f fVar5 = pVar3.i;
                boolean contains2 = fVar5.l.contains(fVar4);
                long j4 = pVar3.j();
                f fVar6 = pVar3.h;
                if (contains && contains2) {
                    long b = m.b(fVar6, 0L);
                    long a = m.a(fVar5, 0L);
                    long j5 = b - j4;
                    int i5 = fVar5.f;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j5 >= (-i5)) {
                        j5 += i5;
                    }
                    long j6 = j5;
                    long j7 = fVar6.f;
                    long j8 = ((-a) - j4) - j7;
                    if (j8 >= j7) {
                        j8 -= j7;
                    }
                    com.amazon.aps.iva.u2.e eVar = pVar3.b;
                    if (i3 == 0) {
                        f = eVar.g0;
                    } else if (i3 == 1) {
                        f = eVar.h0;
                    } else {
                        eVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (((float) j6) / (1.0f - f)) + (((float) j8) / f);
                    } else {
                        j2 = 0;
                    }
                    float f2 = (float) j2;
                    j = (fVar6.f + ((((f2 * f) + 0.5f) + j4) + t0.a(1.0f, f, f2, 0.5f))) - fVar5.f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    if (contains) {
                        max = Math.max(m.b(fVar6, fVar6.f), fVar6.f + j4);
                    } else if (contains2) {
                        max = Math.max(-m.a(fVar5, fVar5.f), (-fVar5.f) + j4);
                    } else {
                        j = (pVar3.j() + fVar6.f) - fVar5.f;
                    }
                    j = max;
                }
            }
            j3 = Math.max(j3, j);
            i4++;
            fVar2 = fVar;
            i3 = i;
            arrayList2 = arrayList;
            size = i2;
        }
        return (int) j3;
    }

    public final void e(p pVar, int i, ArrayList<m> arrayList) {
        f fVar;
        Iterator it = pVar.h.k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = pVar.i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i, 0, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).h, i, 0, arrayList, null);
            }
        }
        Iterator it2 = fVar.k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i, 1, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).i, i, 1, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((n) pVar).k.k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, 2, arrayList, null);
                }
            }
        }
    }

    public final void f(com.amazon.aps.iva.u2.e eVar, e.b bVar, int i, e.b bVar2, int i2) {
        boolean z;
        b.a aVar = this.g;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        ((ConstraintLayout.c) this.f).b(eVar, aVar);
        eVar.O(aVar.e);
        eVar.L(aVar.f);
        eVar.F = aVar.h;
        int i3 = aVar.g;
        eVar.d0 = i3;
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        eVar.F = z;
    }

    public final void g() {
        boolean z;
        a aVar;
        Iterator<com.amazon.aps.iva.u2.e> it = this.a.s0.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.u2.e next = it.next();
            if (!next.a) {
                e.b[] bVarArr = next.V;
                boolean z2 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i = next.s;
                int i2 = next.t;
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar != bVar3 && (bVar != e.b.MATCH_CONSTRAINT || i != 1)) {
                    z = false;
                } else {
                    z = true;
                }
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                g gVar = next.d.e;
                boolean z3 = gVar.j;
                g gVar2 = next.e.e;
                boolean z4 = gVar2.j;
                if (z3 && z4) {
                    e.b bVar4 = e.b.FIXED;
                    f(next, bVar4, gVar.g, bVar4, gVar2.g);
                    next.a = true;
                } else if (z3 && z2) {
                    f(next, e.b.FIXED, gVar.g, bVar3, gVar2.g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.e.e.m = next.l();
                    } else {
                        next.e.e.d(next.l());
                        next.a = true;
                    }
                } else if (z4 && z) {
                    f(next, bVar3, gVar.g, e.b.FIXED, gVar2.g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.d.e.m = next.r();
                    } else {
                        next.d.e.d(next.r());
                        next.a = true;
                    }
                }
                if (next.a && (aVar = next.e.l) != null) {
                    aVar.d(next.d0);
                }
            }
        }
    }
}
