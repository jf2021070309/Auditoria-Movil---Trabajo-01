package c.g.a.i.l;

import c.g.a.i.c;
import c.g.a.i.d;
import c.g.a.i.l.f;
import c.g.a.i.l.o;
/* loaded from: classes.dex */
public class m extends o {

    /* renamed from: k  reason: collision with root package name */
    public f f1791k;

    /* renamed from: l  reason: collision with root package name */
    public g f1792l;

    public m(c.g.a.i.d dVar) {
        super(dVar);
        f fVar = new f(this);
        this.f1791k = fVar;
        this.f1792l = null;
        this.f1804h.f1777e = f.a.TOP;
        this.f1805i.f1777e = f.a.BOTTOM;
        fVar.f1777e = f.a.BASELINE;
        this.f1802f = 1;
    }

    @Override // c.g.a.i.l.o, c.g.a.i.l.d
    public void a(d dVar) {
        g gVar;
        float f2;
        float f3;
        float f4;
        int i2;
        int ordinal = this.f1806j.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal == 3) {
            c.g.a.i.d dVar2 = this.f1798b;
            l(dVar2.K, dVar2.M, 1);
            return;
        }
        g gVar2 = this.f1801e;
        if (gVar2.f1775c && !gVar2.f1782j && this.f1800d == d.a.MATCH_CONSTRAINT) {
            c.g.a.i.d dVar3 = this.f1798b;
            int i3 = dVar3.s;
            if (i3 == 2) {
                c.g.a.i.d dVar4 = dVar3.V;
                if (dVar4 != null) {
                    if (dVar4.f1744e.f1801e.f1782j) {
                        gVar2.c((int) ((gVar.f1779g * dVar3.z) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                g gVar3 = dVar3.f1743d.f1801e;
                if (gVar3.f1782j) {
                    int i4 = dVar3.Z;
                    if (i4 == -1) {
                        f2 = gVar3.f1779g;
                        f3 = dVar3.Y;
                    } else if (i4 == 0) {
                        f4 = gVar3.f1779g * dVar3.Y;
                        i2 = (int) (f4 + 0.5f);
                        gVar2.c(i2);
                    } else if (i4 != 1) {
                        i2 = 0;
                        gVar2.c(i2);
                    } else {
                        f2 = gVar3.f1779g;
                        f3 = dVar3.Y;
                    }
                    f4 = f2 / f3;
                    i2 = (int) (f4 + 0.5f);
                    gVar2.c(i2);
                }
            }
        }
        f fVar = this.f1804h;
        if (fVar.f1775c) {
            f fVar2 = this.f1805i;
            if (fVar2.f1775c) {
                if (fVar.f1782j && fVar2.f1782j && this.f1801e.f1782j) {
                    return;
                }
                if (!this.f1801e.f1782j && this.f1800d == d.a.MATCH_CONSTRAINT) {
                    c.g.a.i.d dVar5 = this.f1798b;
                    if (dVar5.r == 0 && !dVar5.C()) {
                        int i5 = this.f1804h.f1784l.get(0).f1779g;
                        f fVar3 = this.f1804h;
                        int i6 = i5 + fVar3.f1778f;
                        int i7 = this.f1805i.f1784l.get(0).f1779g + this.f1805i.f1778f;
                        fVar3.c(i6);
                        this.f1805i.c(i7);
                        this.f1801e.c(i7 - i6);
                        return;
                    }
                }
                if (!this.f1801e.f1782j && this.f1800d == d.a.MATCH_CONSTRAINT && this.a == 1 && this.f1804h.f1784l.size() > 0 && this.f1805i.f1784l.size() > 0) {
                    int i8 = (this.f1805i.f1784l.get(0).f1779g + this.f1805i.f1778f) - (this.f1804h.f1784l.get(0).f1779g + this.f1804h.f1778f);
                    g gVar4 = this.f1801e;
                    int i9 = gVar4.f1785m;
                    if (i8 < i9) {
                        gVar4.c(i8);
                    } else {
                        gVar4.c(i9);
                    }
                }
                if (this.f1801e.f1782j && this.f1804h.f1784l.size() > 0 && this.f1805i.f1784l.size() > 0) {
                    f fVar4 = this.f1804h.f1784l.get(0);
                    f fVar5 = this.f1805i.f1784l.get(0);
                    int i10 = fVar4.f1779g;
                    f fVar6 = this.f1804h;
                    int i11 = fVar6.f1778f + i10;
                    int i12 = fVar5.f1779g;
                    int i13 = this.f1805i.f1778f + i12;
                    float f5 = this.f1798b.g0;
                    if (fVar4 == fVar5) {
                        f5 = 0.5f;
                    } else {
                        i10 = i11;
                        i12 = i13;
                    }
                    fVar6.c((int) ((((i12 - i10) - this.f1801e.f1779g) * f5) + i10 + 0.5f));
                    this.f1805i.c(this.f1804h.f1779g + this.f1801e.f1779g);
                }
            }
        }
    }

    @Override // c.g.a.i.l.o
    public void d() {
        c.g.a.i.d dVar;
        c.g.a.i.d dVar2;
        c.g.a.i.d dVar3;
        c.g.a.i.d dVar4 = this.f1798b;
        if (dVar4.a) {
            this.f1801e.c(dVar4.l());
        }
        if (!this.f1801e.f1782j) {
            this.f1800d = this.f1798b.t();
            if (this.f1798b.E) {
                this.f1792l = new a(this);
            }
            d.a aVar = this.f1800d;
            if (aVar != d.a.MATCH_CONSTRAINT) {
                if (aVar == d.a.MATCH_PARENT && (dVar3 = this.f1798b.V) != null && dVar3.t() == d.a.FIXED) {
                    int l2 = (dVar3.l() - this.f1798b.K.d()) - this.f1798b.M.d();
                    b(this.f1804h, dVar3.f1744e.f1804h, this.f1798b.K.d());
                    b(this.f1805i, dVar3.f1744e.f1805i, -this.f1798b.M.d());
                    this.f1801e.c(l2);
                    return;
                } else if (this.f1800d == d.a.FIXED) {
                    this.f1801e.c(this.f1798b.l());
                }
            }
        } else if (this.f1800d == d.a.MATCH_PARENT && (dVar = this.f1798b.V) != null && dVar.t() == d.a.FIXED) {
            b(this.f1804h, dVar.f1744e.f1804h, this.f1798b.K.d());
            b(this.f1805i, dVar.f1744e.f1805i, -this.f1798b.M.d());
            return;
        }
        g gVar = this.f1801e;
        boolean z = gVar.f1782j;
        if (z) {
            c.g.a.i.d dVar5 = this.f1798b;
            if (dVar5.a) {
                c.g.a.i.c[] cVarArr = dVar5.R;
                if (cVarArr[2].f1737f != null && cVarArr[3].f1737f != null) {
                    if (dVar5.C()) {
                        this.f1804h.f1778f = this.f1798b.R[2].d();
                        this.f1805i.f1778f = -this.f1798b.R[3].d();
                    } else {
                        f h2 = h(this.f1798b.R[2]);
                        if (h2 != null) {
                            f fVar = this.f1804h;
                            int d2 = this.f1798b.R[2].d();
                            fVar.f1784l.add(h2);
                            fVar.f1778f = d2;
                            h2.f1783k.add(fVar);
                        }
                        f h3 = h(this.f1798b.R[3]);
                        if (h3 != null) {
                            f fVar2 = this.f1805i;
                            fVar2.f1784l.add(h3);
                            fVar2.f1778f = -this.f1798b.R[3].d();
                            h3.f1783k.add(fVar2);
                        }
                        this.f1804h.f1774b = true;
                        this.f1805i.f1774b = true;
                    }
                    c.g.a.i.d dVar6 = this.f1798b;
                    if (dVar6.E) {
                        b(this.f1791k, this.f1804h, dVar6.c0);
                        return;
                    }
                    return;
                } else if (cVarArr[2].f1737f != null) {
                    f h4 = h(cVarArr[2]);
                    if (h4 != null) {
                        f fVar3 = this.f1804h;
                        int d3 = this.f1798b.R[2].d();
                        fVar3.f1784l.add(h4);
                        fVar3.f1778f = d3;
                        h4.f1783k.add(fVar3);
                        b(this.f1805i, this.f1804h, this.f1801e.f1779g);
                        c.g.a.i.d dVar7 = this.f1798b;
                        if (dVar7.E) {
                            b(this.f1791k, this.f1804h, dVar7.c0);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (cVarArr[3].f1737f != null) {
                    f h5 = h(cVarArr[3]);
                    if (h5 != null) {
                        f fVar4 = this.f1805i;
                        fVar4.f1784l.add(h5);
                        fVar4.f1778f = -this.f1798b.R[3].d();
                        h5.f1783k.add(fVar4);
                        b(this.f1804h, this.f1805i, -this.f1801e.f1779g);
                    }
                    c.g.a.i.d dVar8 = this.f1798b;
                    if (dVar8.E) {
                        b(this.f1791k, this.f1804h, dVar8.c0);
                        return;
                    }
                    return;
                } else if (cVarArr[4].f1737f != null) {
                    f h6 = h(cVarArr[4]);
                    if (h6 != null) {
                        f fVar5 = this.f1791k;
                        fVar5.f1784l.add(h6);
                        fVar5.f1778f = 0;
                        h6.f1783k.add(fVar5);
                        b(this.f1804h, this.f1791k, -this.f1798b.c0);
                        b(this.f1805i, this.f1804h, this.f1801e.f1779g);
                        return;
                    }
                    return;
                } else if ((dVar5 instanceof c.g.a.i.g) || dVar5.V == null || dVar5.i(c.a.CENTER).f1737f != null) {
                    return;
                } else {
                    c.g.a.i.d dVar9 = this.f1798b;
                    b(this.f1804h, dVar9.V.f1744e.f1804h, dVar9.w());
                    b(this.f1805i, this.f1804h, this.f1801e.f1779g);
                    c.g.a.i.d dVar10 = this.f1798b;
                    if (dVar10.E) {
                        b(this.f1791k, this.f1804h, dVar10.c0);
                        return;
                    }
                    return;
                }
            }
        }
        if (z || this.f1800d != d.a.MATCH_CONSTRAINT) {
            gVar.f1783k.add(this);
            if (gVar.f1782j) {
                a(this);
            }
        } else {
            c.g.a.i.d dVar11 = this.f1798b;
            int i2 = dVar11.s;
            if (i2 == 2) {
                c.g.a.i.d dVar12 = dVar11.V;
                if (dVar12 != null) {
                    g gVar2 = dVar12.f1744e.f1801e;
                    gVar.f1784l.add(gVar2);
                    gVar2.f1783k.add(this.f1801e);
                    g gVar3 = this.f1801e;
                    gVar3.f1774b = true;
                    gVar3.f1783k.add(this.f1804h);
                    this.f1801e.f1783k.add(this.f1805i);
                }
            } else if (i2 == 3 && !dVar11.C()) {
                c.g.a.i.d dVar13 = this.f1798b;
                if (dVar13.r != 3) {
                    g gVar4 = dVar13.f1743d.f1801e;
                    this.f1801e.f1784l.add(gVar4);
                    gVar4.f1783k.add(this.f1801e);
                    g gVar5 = this.f1801e;
                    gVar5.f1774b = true;
                    gVar5.f1783k.add(this.f1804h);
                    this.f1801e.f1783k.add(this.f1805i);
                }
            }
        }
        c.g.a.i.d dVar14 = this.f1798b;
        c.g.a.i.c[] cVarArr2 = dVar14.R;
        if (cVarArr2[2].f1737f != null && cVarArr2[3].f1737f != null) {
            if (dVar14.C()) {
                this.f1804h.f1778f = this.f1798b.R[2].d();
                this.f1805i.f1778f = -this.f1798b.R[3].d();
            } else {
                f h7 = h(this.f1798b.R[2]);
                f h8 = h(this.f1798b.R[3]);
                if (h7 != null) {
                    h7.f1783k.add(this);
                    if (h7.f1782j) {
                        a(this);
                    }
                }
                if (h8 != null) {
                    h8.f1783k.add(this);
                    if (h8.f1782j) {
                        a(this);
                    }
                }
                this.f1806j = o.a.CENTER;
            }
            if (this.f1798b.E) {
                c(this.f1791k, this.f1804h, 1, this.f1792l);
            }
        } else if (cVarArr2[2].f1737f != null) {
            f h9 = h(cVarArr2[2]);
            if (h9 != null) {
                f fVar6 = this.f1804h;
                int d4 = this.f1798b.R[2].d();
                fVar6.f1784l.add(h9);
                fVar6.f1778f = d4;
                h9.f1783k.add(fVar6);
                c(this.f1805i, this.f1804h, 1, this.f1801e);
                if (this.f1798b.E) {
                    c(this.f1791k, this.f1804h, 1, this.f1792l);
                }
                d.a aVar2 = this.f1800d;
                d.a aVar3 = d.a.MATCH_CONSTRAINT;
                if (aVar2 == aVar3) {
                    c.g.a.i.d dVar15 = this.f1798b;
                    if (dVar15.Y > 0.0f) {
                        k kVar = dVar15.f1743d;
                        if (kVar.f1800d == aVar3) {
                            kVar.f1801e.f1783k.add(this.f1801e);
                            this.f1801e.f1784l.add(this.f1798b.f1743d.f1801e);
                            this.f1801e.a = this;
                        }
                    }
                }
            }
        } else if (cVarArr2[3].f1737f != null) {
            f h10 = h(cVarArr2[3]);
            if (h10 != null) {
                f fVar7 = this.f1805i;
                fVar7.f1784l.add(h10);
                fVar7.f1778f = -this.f1798b.R[3].d();
                h10.f1783k.add(fVar7);
                c(this.f1804h, this.f1805i, -1, this.f1801e);
                if (this.f1798b.E) {
                    c(this.f1791k, this.f1804h, 1, this.f1792l);
                }
            }
        } else if (cVarArr2[4].f1737f != null) {
            f h11 = h(cVarArr2[4]);
            if (h11 != null) {
                f fVar8 = this.f1791k;
                fVar8.f1784l.add(h11);
                fVar8.f1778f = 0;
                h11.f1783k.add(fVar8);
                c(this.f1804h, this.f1791k, -1, this.f1792l);
                c(this.f1805i, this.f1804h, 1, this.f1801e);
            }
        } else if (!(dVar14 instanceof c.g.a.i.g) && (dVar2 = dVar14.V) != null) {
            b(this.f1804h, dVar2.f1744e.f1804h, dVar14.w());
            c(this.f1805i, this.f1804h, 1, this.f1801e);
            if (this.f1798b.E) {
                c(this.f1791k, this.f1804h, 1, this.f1792l);
            }
            d.a aVar4 = this.f1800d;
            d.a aVar5 = d.a.MATCH_CONSTRAINT;
            if (aVar4 == aVar5) {
                c.g.a.i.d dVar16 = this.f1798b;
                if (dVar16.Y > 0.0f) {
                    k kVar2 = dVar16.f1743d;
                    if (kVar2.f1800d == aVar5) {
                        kVar2.f1801e.f1783k.add(this.f1801e);
                        this.f1801e.f1784l.add(this.f1798b.f1743d.f1801e);
                        this.f1801e.a = this;
                    }
                }
            }
        }
        if (this.f1801e.f1784l.size() == 0) {
            this.f1801e.f1775c = true;
        }
    }

    @Override // c.g.a.i.l.o
    public void e() {
        f fVar = this.f1804h;
        if (fVar.f1782j) {
            this.f1798b.b0 = fVar.f1779g;
        }
    }

    @Override // c.g.a.i.l.o
    public void f() {
        this.f1799c = null;
        this.f1804h.b();
        this.f1805i.b();
        this.f1791k.b();
        this.f1801e.b();
        this.f1803g = false;
    }

    @Override // c.g.a.i.l.o
    public boolean k() {
        return this.f1800d != d.a.MATCH_CONSTRAINT || this.f1798b.s == 0;
    }

    public void m() {
        this.f1803g = false;
        this.f1804h.b();
        this.f1804h.f1782j = false;
        this.f1805i.b();
        this.f1805i.f1782j = false;
        this.f1791k.b();
        this.f1791k.f1782j = false;
        this.f1801e.f1782j = false;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VerticalRun ");
        y.append(this.f1798b.j0);
        return y.toString();
    }
}
