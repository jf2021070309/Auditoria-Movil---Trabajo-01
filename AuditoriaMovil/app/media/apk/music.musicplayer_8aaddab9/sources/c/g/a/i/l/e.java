package c.g.a.i.l;

import androidx.constraintlayout.widget.ConstraintLayout;
import c.g.a.i.d;
import c.g.a.i.l.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e {
    public c.g.a.i.e a;

    /* renamed from: d  reason: collision with root package name */
    public c.g.a.i.e f1769d;

    /* renamed from: f  reason: collision with root package name */
    public b.InterfaceC0029b f1771f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f1772g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<l> f1773h;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1767b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1768c = true;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<o> f1770e = new ArrayList<>();

    public e(c.g.a.i.e eVar) {
        new ArrayList();
        this.f1771f = null;
        this.f1772g = new b.a();
        this.f1773h = new ArrayList<>();
        this.a = eVar;
        this.f1769d = eVar;
    }

    public final void a(f fVar, int i2, int i3, f fVar2, ArrayList<l> arrayList, l lVar) {
        o oVar = fVar.f1776d;
        if (oVar.f1799c == null) {
            c.g.a.i.e eVar = this.a;
            if (oVar == eVar.f1743d || oVar == eVar.f1744e) {
                return;
            }
            if (lVar == null) {
                lVar = new l(oVar, i3);
                arrayList.add(lVar);
            }
            oVar.f1799c = lVar;
            lVar.f1790c.add(oVar);
            for (d dVar : oVar.f1804h.f1783k) {
                if (dVar instanceof f) {
                    a((f) dVar, i2, 0, fVar2, arrayList, lVar);
                }
            }
            for (d dVar2 : oVar.f1805i.f1783k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i2, 1, fVar2, arrayList, lVar);
                }
            }
            if (i2 == 1 && (oVar instanceof m)) {
                for (d dVar3 : ((m) oVar).f1791k.f1783k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i2, 2, fVar2, arrayList, lVar);
                    }
                }
            }
            for (f fVar3 : oVar.f1804h.f1784l) {
                a(fVar3, i2, 0, fVar2, arrayList, lVar);
            }
            for (f fVar4 : oVar.f1805i.f1784l) {
                a(fVar4, i2, 1, fVar2, arrayList, lVar);
            }
            if (i2 == 1 && (oVar instanceof m)) {
                for (f fVar5 : ((m) oVar).f1791k.f1784l) {
                    a(fVar5, i2, 2, fVar2, arrayList, lVar);
                }
            }
        }
    }

    public final boolean b(c.g.a.i.e eVar) {
        int i2;
        d.a aVar;
        int i3;
        d.a aVar2;
        d.a aVar3;
        d.a aVar4;
        Iterator<c.g.a.i.d> it = eVar.r0.iterator();
        while (it.hasNext()) {
            c.g.a.i.d next = it.next();
            d.a[] aVarArr = next.U;
            d.a aVar5 = aVarArr[0];
            d.a aVar6 = aVarArr[1];
            if (next.i0 == 8) {
                next.a = true;
            } else {
                float f2 = next.w;
                if (f2 < 1.0f && aVar5 == d.a.MATCH_CONSTRAINT) {
                    next.r = 2;
                }
                float f3 = next.z;
                if (f3 < 1.0f && aVar6 == d.a.MATCH_CONSTRAINT) {
                    next.s = 2;
                }
                if (next.Y > 0.0f) {
                    d.a aVar7 = d.a.MATCH_CONSTRAINT;
                    if (aVar5 == aVar7 && (aVar6 == d.a.WRAP_CONTENT || aVar6 == d.a.FIXED)) {
                        next.r = 3;
                    } else if (aVar6 == aVar7 && (aVar5 == d.a.WRAP_CONTENT || aVar5 == d.a.FIXED)) {
                        next.s = 3;
                    } else if (aVar5 == aVar7 && aVar6 == aVar7) {
                        if (next.r == 0) {
                            next.r = 3;
                        }
                        if (next.s == 0) {
                            next.s = 3;
                        }
                    }
                }
                d.a aVar8 = d.a.MATCH_CONSTRAINT;
                if (aVar5 == aVar8 && next.r == 1 && (next.J.f1737f == null || next.L.f1737f == null)) {
                    aVar5 = d.a.WRAP_CONTENT;
                }
                d.a aVar9 = aVar5;
                if (aVar6 == aVar8 && next.s == 1 && (next.K.f1737f == null || next.M.f1737f == null)) {
                    aVar6 = d.a.WRAP_CONTENT;
                }
                d.a aVar10 = aVar6;
                k kVar = next.f1743d;
                kVar.f1800d = aVar9;
                int i4 = next.r;
                kVar.a = i4;
                m mVar = next.f1744e;
                mVar.f1800d = aVar10;
                int i5 = next.s;
                mVar.a = i5;
                d.a aVar11 = d.a.MATCH_PARENT;
                if ((aVar9 == aVar11 || aVar9 == d.a.FIXED || aVar9 == d.a.WRAP_CONTENT) && (aVar10 == aVar11 || aVar10 == d.a.FIXED || aVar10 == d.a.WRAP_CONTENT)) {
                    int u = next.u();
                    if (aVar9 == aVar11) {
                        i2 = (eVar.u() - next.J.f1738g) - next.L.f1738g;
                        aVar = d.a.FIXED;
                    } else {
                        i2 = u;
                        aVar = aVar9;
                    }
                    int l2 = next.l();
                    if (aVar10 == aVar11) {
                        i3 = (eVar.l() - next.K.f1738g) - next.M.f1738g;
                        aVar2 = d.a.FIXED;
                    } else {
                        i3 = l2;
                        aVar2 = aVar10;
                    }
                    f(next, aVar, i2, aVar2, i3);
                    next.f1743d.f1801e.c(next.u());
                    next.f1744e.f1801e.c(next.l());
                    next.a = true;
                } else {
                    if (aVar9 == aVar8 && (aVar10 == (aVar4 = d.a.WRAP_CONTENT) || aVar10 == d.a.FIXED)) {
                        if (i4 == 3) {
                            if (aVar10 == aVar4) {
                                f(next, aVar4, 0, aVar4, 0);
                            }
                            int l3 = next.l();
                            d.a aVar12 = d.a.FIXED;
                            f(next, aVar12, (int) ((l3 * next.Y) + 0.5f), aVar12, l3);
                            next.f1743d.f1801e.c(next.u());
                            next.f1744e.f1801e.c(next.l());
                            next.a = true;
                        } else if (i4 == 1) {
                            f(next, aVar4, 0, aVar10, 0);
                            next.f1743d.f1801e.f1785m = next.u();
                        } else if (i4 == 2) {
                            d.a[] aVarArr2 = eVar.U;
                            d.a aVar13 = aVarArr2[0];
                            d.a aVar14 = d.a.FIXED;
                            if (aVar13 == aVar14 || aVarArr2[0] == aVar11) {
                                f(next, aVar14, (int) ((f2 * eVar.u()) + 0.5f), aVar10, next.l());
                                next.f1743d.f1801e.c(next.u());
                                next.f1744e.f1801e.c(next.l());
                                next.a = true;
                            }
                        } else {
                            c.g.a.i.c[] cVarArr = next.R;
                            if (cVarArr[0].f1737f == null || cVarArr[1].f1737f == null) {
                                f(next, aVar4, 0, aVar10, 0);
                                next.f1743d.f1801e.c(next.u());
                                next.f1744e.f1801e.c(next.l());
                                next.a = true;
                            }
                        }
                    }
                    if (aVar10 == aVar8 && (aVar9 == (aVar3 = d.a.WRAP_CONTENT) || aVar9 == d.a.FIXED)) {
                        if (i5 == 3) {
                            if (aVar9 == aVar3) {
                                f(next, aVar3, 0, aVar3, 0);
                            }
                            int u2 = next.u();
                            float f4 = next.Y;
                            if (next.Z == -1) {
                                f4 = 1.0f / f4;
                            }
                            d.a aVar15 = d.a.FIXED;
                            f(next, aVar15, u2, aVar15, (int) ((u2 * f4) + 0.5f));
                            next.f1743d.f1801e.c(next.u());
                            next.f1744e.f1801e.c(next.l());
                            next.a = true;
                        } else if (i5 == 1) {
                            f(next, aVar9, 0, aVar3, 0);
                            next.f1744e.f1801e.f1785m = next.l();
                        } else if (i5 == 2) {
                            d.a[] aVarArr3 = eVar.U;
                            d.a aVar16 = aVarArr3[1];
                            d.a aVar17 = d.a.FIXED;
                            if (aVar16 == aVar17 || aVarArr3[1] == aVar11) {
                                f(next, aVar9, next.u(), aVar17, (int) ((f3 * eVar.l()) + 0.5f));
                                next.f1743d.f1801e.c(next.u());
                                next.f1744e.f1801e.c(next.l());
                                next.a = true;
                            }
                        } else {
                            c.g.a.i.c[] cVarArr2 = next.R;
                            if (cVarArr2[2].f1737f == null || cVarArr2[3].f1737f == null) {
                                f(next, aVar3, 0, aVar10, 0);
                                next.f1743d.f1801e.c(next.u());
                                next.f1744e.f1801e.c(next.l());
                                next.a = true;
                            }
                        }
                    }
                    if (aVar9 == aVar8 && aVar10 == aVar8) {
                        if (i4 == 1 || i5 == 1) {
                            d.a aVar18 = d.a.WRAP_CONTENT;
                            f(next, aVar18, 0, aVar18, 0);
                            next.f1743d.f1801e.f1785m = next.u();
                            next.f1744e.f1801e.f1785m = next.l();
                        } else if (i5 == 2 && i4 == 2) {
                            d.a[] aVarArr4 = eVar.U;
                            d.a aVar19 = aVarArr4[0];
                            d.a aVar20 = d.a.FIXED;
                            if (aVar19 == aVar20 && aVarArr4[1] == aVar20) {
                                f(next, aVar20, (int) ((f2 * eVar.u()) + 0.5f), aVar20, (int) ((f3 * eVar.l()) + 0.5f));
                                next.f1743d.f1801e.c(next.u());
                                next.f1744e.f1801e.c(next.l());
                                next.a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList<o> arrayList = this.f1770e;
        arrayList.clear();
        this.f1769d.f1743d.f();
        this.f1769d.f1744e.f();
        arrayList.add(this.f1769d.f1743d);
        arrayList.add(this.f1769d.f1744e);
        Iterator<c.g.a.i.d> it = this.f1769d.r0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            c.g.a.i.d next = it.next();
            if (next instanceof c.g.a.i.f) {
                arrayList.add(new i(next));
            } else {
                if (next.B()) {
                    if (next.f1741b == null) {
                        next.f1741b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f1741b);
                } else {
                    arrayList.add(next.f1743d);
                }
                if (next.C()) {
                    if (next.f1742c == null) {
                        next.f1742c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f1742c);
                } else {
                    arrayList.add(next.f1744e);
                }
                if (next instanceof c.g.a.i.h) {
                    arrayList.add(new j(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<o> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<o> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o next2 = it3.next();
            if (next2.f1798b != this.f1769d) {
                next2.d();
            }
        }
        this.f1773h.clear();
        l.a = 0;
        e(this.a.f1743d, 0, this.f1773h);
        e(this.a.f1744e, 1, this.f1773h);
        this.f1767b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(c.g.a.i.e r18, int r19) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.a.i.l.e.d(c.g.a.i.e, int):int");
    }

    public final void e(o oVar, int i2, ArrayList<l> arrayList) {
        for (d dVar : oVar.f1804h.f1783k) {
            if (dVar instanceof f) {
                a((f) dVar, i2, 0, oVar.f1805i, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).f1804h, i2, 0, oVar.f1805i, arrayList, null);
            }
        }
        for (d dVar2 : oVar.f1805i.f1783k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, 1, oVar.f1804h, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).f1805i, i2, 1, oVar.f1804h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (d dVar3 : ((m) oVar).f1791k.f1783k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void f(c.g.a.i.d dVar, d.a aVar, int i2, d.a aVar2, int i3) {
        b.a aVar3 = this.f1772g;
        aVar3.a = aVar;
        aVar3.f1756b = aVar2;
        aVar3.f1757c = i2;
        aVar3.f1758d = i3;
        ((ConstraintLayout.b) this.f1771f).b(dVar, aVar3);
        dVar.T(this.f1772g.f1759e);
        dVar.O(this.f1772g.f1760f);
        b.a aVar4 = this.f1772g;
        dVar.E = aVar4.f1762h;
        dVar.L(aVar4.f1761g);
    }

    public void g() {
        g gVar;
        Iterator<c.g.a.i.d> it = this.a.r0.iterator();
        while (it.hasNext()) {
            c.g.a.i.d next = it.next();
            if (!next.a) {
                d.a[] aVarArr = next.U;
                boolean z = false;
                d.a aVar = aVarArr[0];
                d.a aVar2 = aVarArr[1];
                int i2 = next.r;
                int i3 = next.s;
                d.a aVar3 = d.a.WRAP_CONTENT;
                boolean z2 = aVar == aVar3 || (aVar == d.a.MATCH_CONSTRAINT && i2 == 1);
                if (aVar2 == aVar3 || (aVar2 == d.a.MATCH_CONSTRAINT && i3 == 1)) {
                    z = true;
                }
                g gVar2 = next.f1743d.f1801e;
                boolean z3 = gVar2.f1782j;
                g gVar3 = next.f1744e.f1801e;
                boolean z4 = gVar3.f1782j;
                if (z3 && z4) {
                    d.a aVar4 = d.a.FIXED;
                    f(next, aVar4, gVar2.f1779g, aVar4, gVar3.f1779g);
                    next.a = true;
                } else if (z3 && z) {
                    f(next, d.a.FIXED, gVar2.f1779g, aVar3, gVar3.f1779g);
                    if (aVar2 == d.a.MATCH_CONSTRAINT) {
                        next.f1744e.f1801e.f1785m = next.l();
                    } else {
                        next.f1744e.f1801e.c(next.l());
                        next.a = true;
                    }
                } else if (z4 && z2) {
                    f(next, aVar3, gVar2.f1779g, d.a.FIXED, gVar3.f1779g);
                    if (aVar == d.a.MATCH_CONSTRAINT) {
                        next.f1743d.f1801e.f1785m = next.u();
                    } else {
                        next.f1743d.f1801e.c(next.u());
                        next.a = true;
                    }
                }
                if (next.a && (gVar = next.f1744e.f1792l) != null) {
                    gVar.c(next.c0);
                }
            }
        }
    }
}
