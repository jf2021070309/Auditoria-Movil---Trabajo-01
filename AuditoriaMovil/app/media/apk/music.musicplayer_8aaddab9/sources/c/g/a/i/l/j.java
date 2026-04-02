package c.g.a.i.l;

import c.g.a.i.l.f;
/* loaded from: classes.dex */
public class j extends o {
    public j(c.g.a.i.d dVar) {
        super(dVar);
    }

    @Override // c.g.a.i.l.o, c.g.a.i.l.d
    public void a(d dVar) {
        c.g.a.i.a aVar = (c.g.a.i.a) this.f1798b;
        int i2 = aVar.t0;
        int i3 = 0;
        int i4 = -1;
        for (f fVar : this.f1804h.f1784l) {
            int i5 = fVar.f1779g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            this.f1804h.c(i4 + aVar.v0);
        } else {
            this.f1804h.c(i3 + aVar.v0);
        }
    }

    @Override // c.g.a.i.l.o
    public void d() {
        c.g.a.i.d dVar = this.f1798b;
        if (dVar instanceof c.g.a.i.a) {
            f fVar = this.f1804h;
            fVar.f1774b = true;
            c.g.a.i.a aVar = (c.g.a.i.a) dVar;
            int i2 = aVar.t0;
            boolean z = aVar.u0;
            int i3 = 0;
            if (i2 == 0) {
                fVar.f1777e = f.a.LEFT;
                while (i3 < aVar.s0) {
                    c.g.a.i.d dVar2 = aVar.r0[i3];
                    if (z || dVar2.i0 != 8) {
                        f fVar2 = dVar2.f1743d.f1804h;
                        fVar2.f1783k.add(this.f1804h);
                        this.f1804h.f1784l.add(fVar2);
                    }
                    i3++;
                }
                m(this.f1798b.f1743d.f1804h);
                m(this.f1798b.f1743d.f1805i);
            } else if (i2 == 1) {
                fVar.f1777e = f.a.RIGHT;
                while (i3 < aVar.s0) {
                    c.g.a.i.d dVar3 = aVar.r0[i3];
                    if (z || dVar3.i0 != 8) {
                        f fVar3 = dVar3.f1743d.f1805i;
                        fVar3.f1783k.add(this.f1804h);
                        this.f1804h.f1784l.add(fVar3);
                    }
                    i3++;
                }
                m(this.f1798b.f1743d.f1804h);
                m(this.f1798b.f1743d.f1805i);
            } else if (i2 == 2) {
                fVar.f1777e = f.a.TOP;
                while (i3 < aVar.s0) {
                    c.g.a.i.d dVar4 = aVar.r0[i3];
                    if (z || dVar4.i0 != 8) {
                        f fVar4 = dVar4.f1744e.f1804h;
                        fVar4.f1783k.add(this.f1804h);
                        this.f1804h.f1784l.add(fVar4);
                    }
                    i3++;
                }
                m(this.f1798b.f1744e.f1804h);
                m(this.f1798b.f1744e.f1805i);
            } else if (i2 != 3) {
            } else {
                fVar.f1777e = f.a.BOTTOM;
                while (i3 < aVar.s0) {
                    c.g.a.i.d dVar5 = aVar.r0[i3];
                    if (z || dVar5.i0 != 8) {
                        f fVar5 = dVar5.f1744e.f1805i;
                        fVar5.f1783k.add(this.f1804h);
                        this.f1804h.f1784l.add(fVar5);
                    }
                    i3++;
                }
                m(this.f1798b.f1744e.f1804h);
                m(this.f1798b.f1744e.f1805i);
            }
        }
    }

    @Override // c.g.a.i.l.o
    public void e() {
        c.g.a.i.d dVar = this.f1798b;
        if (dVar instanceof c.g.a.i.a) {
            int i2 = ((c.g.a.i.a) dVar).t0;
            if (i2 == 0 || i2 == 1) {
                dVar.a0 = this.f1804h.f1779g;
            } else {
                dVar.b0 = this.f1804h.f1779g;
            }
        }
    }

    @Override // c.g.a.i.l.o
    public void f() {
        this.f1799c = null;
        this.f1804h.b();
    }

    @Override // c.g.a.i.l.o
    public boolean k() {
        return false;
    }

    public final void m(f fVar) {
        this.f1804h.f1783k.add(fVar);
        fVar.f1784l.add(this.f1804h);
    }
}
