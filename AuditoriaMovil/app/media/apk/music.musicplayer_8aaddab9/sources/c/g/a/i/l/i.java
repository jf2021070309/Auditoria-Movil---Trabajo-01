package c.g.a.i.l;
/* loaded from: classes.dex */
public class i extends o {
    public i(c.g.a.i.d dVar) {
        super(dVar);
        dVar.f1743d.f();
        dVar.f1744e.f();
        this.f1802f = ((c.g.a.i.f) dVar).v0;
    }

    @Override // c.g.a.i.l.o, c.g.a.i.l.d
    public void a(d dVar) {
        f fVar = this.f1804h;
        if (fVar.f1775c && !fVar.f1782j) {
            this.f1804h.c((int) ((fVar.f1784l.get(0).f1779g * ((c.g.a.i.f) this.f1798b).r0) + 0.5f));
        }
    }

    @Override // c.g.a.i.l.o
    public void d() {
        c.g.a.i.d dVar = this.f1798b;
        c.g.a.i.f fVar = (c.g.a.i.f) dVar;
        int i2 = fVar.s0;
        int i3 = fVar.t0;
        if (fVar.v0 == 1) {
            if (i2 != -1) {
                this.f1804h.f1784l.add(dVar.V.f1743d.f1804h);
                this.f1798b.V.f1743d.f1804h.f1783k.add(this.f1804h);
                this.f1804h.f1778f = i2;
            } else if (i3 != -1) {
                this.f1804h.f1784l.add(dVar.V.f1743d.f1805i);
                this.f1798b.V.f1743d.f1805i.f1783k.add(this.f1804h);
                this.f1804h.f1778f = -i3;
            } else {
                f fVar2 = this.f1804h;
                fVar2.f1774b = true;
                fVar2.f1784l.add(dVar.V.f1743d.f1805i);
                this.f1798b.V.f1743d.f1805i.f1783k.add(this.f1804h);
            }
            m(this.f1798b.f1743d.f1804h);
            m(this.f1798b.f1743d.f1805i);
            return;
        }
        if (i2 != -1) {
            this.f1804h.f1784l.add(dVar.V.f1744e.f1804h);
            this.f1798b.V.f1744e.f1804h.f1783k.add(this.f1804h);
            this.f1804h.f1778f = i2;
        } else if (i3 != -1) {
            this.f1804h.f1784l.add(dVar.V.f1744e.f1805i);
            this.f1798b.V.f1744e.f1805i.f1783k.add(this.f1804h);
            this.f1804h.f1778f = -i3;
        } else {
            f fVar3 = this.f1804h;
            fVar3.f1774b = true;
            fVar3.f1784l.add(dVar.V.f1744e.f1805i);
            this.f1798b.V.f1744e.f1805i.f1783k.add(this.f1804h);
        }
        m(this.f1798b.f1744e.f1804h);
        m(this.f1798b.f1744e.f1805i);
    }

    @Override // c.g.a.i.l.o
    public void e() {
        c.g.a.i.d dVar = this.f1798b;
        if (((c.g.a.i.f) dVar).v0 == 1) {
            dVar.a0 = this.f1804h.f1779g;
        } else {
            dVar.b0 = this.f1804h.f1779g;
        }
    }

    @Override // c.g.a.i.l.o
    public void f() {
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
