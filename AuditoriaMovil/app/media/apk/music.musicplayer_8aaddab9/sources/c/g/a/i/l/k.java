package c.g.a.i.l;

import c.g.a.i.c;
import c.g.a.i.d;
import c.g.a.i.l.f;
import c.g.a.i.l.o;
/* loaded from: classes.dex */
public class k extends o {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f1788k = new int[2];

    public k(c.g.a.i.d dVar) {
        super(dVar);
        this.f1804h.f1777e = f.a.LEFT;
        this.f1805i.f1777e = f.a.RIGHT;
        this.f1802f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x028a, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // c.g.a.i.l.o, c.g.a.i.l.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(c.g.a.i.l.d r17) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.a.i.l.k.a(c.g.a.i.l.d):void");
    }

    @Override // c.g.a.i.l.o
    public void d() {
        c.g.a.i.d dVar;
        c.g.a.i.d dVar2;
        c.g.a.i.d dVar3;
        c.g.a.i.d dVar4 = this.f1798b;
        if (dVar4.a) {
            this.f1801e.c(dVar4.u());
        }
        if (this.f1801e.f1782j) {
            d.a aVar = this.f1800d;
            d.a aVar2 = d.a.MATCH_PARENT;
            if (aVar == aVar2 && (dVar = this.f1798b.V) != null && (dVar.m() == d.a.FIXED || dVar.m() == aVar2)) {
                b(this.f1804h, dVar.f1743d.f1804h, this.f1798b.J.d());
                b(this.f1805i, dVar.f1743d.f1805i, -this.f1798b.L.d());
                return;
            }
        } else {
            d.a m2 = this.f1798b.m();
            this.f1800d = m2;
            if (m2 != d.a.MATCH_CONSTRAINT) {
                d.a aVar3 = d.a.MATCH_PARENT;
                if (m2 == aVar3 && (dVar3 = this.f1798b.V) != null && (dVar3.m() == d.a.FIXED || dVar3.m() == aVar3)) {
                    int u = (dVar3.u() - this.f1798b.J.d()) - this.f1798b.L.d();
                    b(this.f1804h, dVar3.f1743d.f1804h, this.f1798b.J.d());
                    b(this.f1805i, dVar3.f1743d.f1805i, -this.f1798b.L.d());
                    this.f1801e.c(u);
                    return;
                } else if (this.f1800d == d.a.FIXED) {
                    this.f1801e.c(this.f1798b.u());
                }
            }
        }
        g gVar = this.f1801e;
        if (gVar.f1782j) {
            c.g.a.i.d dVar5 = this.f1798b;
            if (dVar5.a) {
                c.g.a.i.c[] cVarArr = dVar5.R;
                if (cVarArr[0].f1737f != null && cVarArr[1].f1737f != null) {
                    if (dVar5.B()) {
                        this.f1804h.f1778f = this.f1798b.R[0].d();
                        this.f1805i.f1778f = -this.f1798b.R[1].d();
                        return;
                    }
                    f h2 = h(this.f1798b.R[0]);
                    if (h2 != null) {
                        f fVar = this.f1804h;
                        int d2 = this.f1798b.R[0].d();
                        fVar.f1784l.add(h2);
                        fVar.f1778f = d2;
                        h2.f1783k.add(fVar);
                    }
                    f h3 = h(this.f1798b.R[1]);
                    if (h3 != null) {
                        f fVar2 = this.f1805i;
                        fVar2.f1784l.add(h3);
                        fVar2.f1778f = -this.f1798b.R[1].d();
                        h3.f1783k.add(fVar2);
                    }
                    this.f1804h.f1774b = true;
                    this.f1805i.f1774b = true;
                    return;
                } else if (cVarArr[0].f1737f != null) {
                    f h4 = h(cVarArr[0]);
                    if (h4 != null) {
                        f fVar3 = this.f1804h;
                        int d3 = this.f1798b.R[0].d();
                        fVar3.f1784l.add(h4);
                        fVar3.f1778f = d3;
                        h4.f1783k.add(fVar3);
                        b(this.f1805i, this.f1804h, this.f1801e.f1779g);
                        return;
                    }
                    return;
                } else if (cVarArr[1].f1737f == null) {
                    if ((dVar5 instanceof c.g.a.i.g) || dVar5.V == null || dVar5.i(c.a.CENTER).f1737f != null) {
                        return;
                    }
                    c.g.a.i.d dVar6 = this.f1798b;
                    b(this.f1804h, dVar6.V.f1743d.f1804h, dVar6.v());
                    b(this.f1805i, this.f1804h, this.f1801e.f1779g);
                    return;
                } else {
                    f h5 = h(cVarArr[1]);
                    if (h5 != null) {
                        f fVar4 = this.f1805i;
                        fVar4.f1784l.add(h5);
                        fVar4.f1778f = -this.f1798b.R[1].d();
                        h5.f1783k.add(fVar4);
                        b(this.f1804h, this.f1805i, -this.f1801e.f1779g);
                        return;
                    }
                    return;
                }
            }
        }
        if (this.f1800d == d.a.MATCH_CONSTRAINT) {
            c.g.a.i.d dVar7 = this.f1798b;
            int i2 = dVar7.r;
            if (i2 == 2) {
                c.g.a.i.d dVar8 = dVar7.V;
                if (dVar8 != null) {
                    g gVar2 = dVar8.f1744e.f1801e;
                    gVar.f1784l.add(gVar2);
                    gVar2.f1783k.add(this.f1801e);
                    g gVar3 = this.f1801e;
                    gVar3.f1774b = true;
                    gVar3.f1783k.add(this.f1804h);
                    this.f1801e.f1783k.add(this.f1805i);
                }
            } else if (i2 == 3) {
                if (dVar7.s == 3) {
                    this.f1804h.a = this;
                    this.f1805i.a = this;
                    m mVar = dVar7.f1744e;
                    mVar.f1804h.a = this;
                    mVar.f1805i.a = this;
                    gVar.a = this;
                    if (dVar7.C()) {
                        this.f1801e.f1784l.add(this.f1798b.f1744e.f1801e);
                        this.f1798b.f1744e.f1801e.f1783k.add(this.f1801e);
                        m mVar2 = this.f1798b.f1744e;
                        mVar2.f1801e.a = this;
                        this.f1801e.f1784l.add(mVar2.f1804h);
                        this.f1801e.f1784l.add(this.f1798b.f1744e.f1805i);
                        this.f1798b.f1744e.f1804h.f1783k.add(this.f1801e);
                        this.f1798b.f1744e.f1805i.f1783k.add(this.f1801e);
                    } else if (this.f1798b.B()) {
                        this.f1798b.f1744e.f1801e.f1784l.add(this.f1801e);
                        this.f1801e.f1783k.add(this.f1798b.f1744e.f1801e);
                    } else {
                        this.f1798b.f1744e.f1801e.f1784l.add(this.f1801e);
                    }
                } else {
                    g gVar4 = dVar7.f1744e.f1801e;
                    gVar.f1784l.add(gVar4);
                    gVar4.f1783k.add(this.f1801e);
                    this.f1798b.f1744e.f1804h.f1783k.add(this.f1801e);
                    this.f1798b.f1744e.f1805i.f1783k.add(this.f1801e);
                    g gVar5 = this.f1801e;
                    gVar5.f1774b = true;
                    gVar5.f1783k.add(this.f1804h);
                    this.f1801e.f1783k.add(this.f1805i);
                    this.f1804h.f1784l.add(this.f1801e);
                    this.f1805i.f1784l.add(this.f1801e);
                }
            }
        }
        c.g.a.i.d dVar9 = this.f1798b;
        c.g.a.i.c[] cVarArr2 = dVar9.R;
        if (cVarArr2[0].f1737f != null && cVarArr2[1].f1737f != null) {
            if (dVar9.B()) {
                this.f1804h.f1778f = this.f1798b.R[0].d();
                this.f1805i.f1778f = -this.f1798b.R[1].d();
                return;
            }
            f h6 = h(this.f1798b.R[0]);
            f h7 = h(this.f1798b.R[1]);
            if (h6 != null) {
                h6.f1783k.add(this);
                if (h6.f1782j) {
                    a(this);
                }
            }
            if (h7 != null) {
                h7.f1783k.add(this);
                if (h7.f1782j) {
                    a(this);
                }
            }
            this.f1806j = o.a.CENTER;
        } else if (cVarArr2[0].f1737f != null) {
            f h8 = h(cVarArr2[0]);
            if (h8 != null) {
                f fVar5 = this.f1804h;
                int d4 = this.f1798b.R[0].d();
                fVar5.f1784l.add(h8);
                fVar5.f1778f = d4;
                h8.f1783k.add(fVar5);
                c(this.f1805i, this.f1804h, 1, this.f1801e);
            }
        } else if (cVarArr2[1].f1737f == null) {
            if ((dVar9 instanceof c.g.a.i.g) || (dVar2 = dVar9.V) == null) {
                return;
            }
            b(this.f1804h, dVar2.f1743d.f1804h, dVar9.v());
            c(this.f1805i, this.f1804h, 1, this.f1801e);
        } else {
            f h9 = h(cVarArr2[1]);
            if (h9 != null) {
                f fVar6 = this.f1805i;
                fVar6.f1784l.add(h9);
                fVar6.f1778f = -this.f1798b.R[1].d();
                h9.f1783k.add(fVar6);
                c(this.f1804h, this.f1805i, -1, this.f1801e);
            }
        }
    }

    @Override // c.g.a.i.l.o
    public void e() {
        f fVar = this.f1804h;
        if (fVar.f1782j) {
            this.f1798b.a0 = fVar.f1779g;
        }
    }

    @Override // c.g.a.i.l.o
    public void f() {
        this.f1799c = null;
        this.f1804h.b();
        this.f1805i.b();
        this.f1801e.b();
        this.f1803g = false;
    }

    @Override // c.g.a.i.l.o
    public boolean k() {
        return this.f1800d != d.a.MATCH_CONSTRAINT || this.f1798b.r == 0;
    }

    public final void m(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else if (i6 != 1) {
                return;
            } else {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7 && i8 <= i8) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i7 > i7 || i10 > i8) {
        } else {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    public void n() {
        this.f1803g = false;
        this.f1804h.b();
        this.f1804h.f1782j = false;
        this.f1805i.b();
        this.f1805i.f1782j = false;
        this.f1801e.f1782j = false;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("HorizontalRun ");
        y.append(this.f1798b.j0);
        return y.toString();
    }
}
