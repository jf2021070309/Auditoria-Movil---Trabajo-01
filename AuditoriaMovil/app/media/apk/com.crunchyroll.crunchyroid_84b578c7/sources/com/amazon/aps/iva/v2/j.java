package com.amazon.aps.iva.v2;
/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public final class j extends p {
    public j(com.amazon.aps.iva.u2.e eVar) {
        super(eVar);
        eVar.d.f();
        eVar.e.f();
        this.f = ((com.amazon.aps.iva.u2.h) eVar).w0;
    }

    @Override // com.amazon.aps.iva.v2.p, com.amazon.aps.iva.v2.d
    public final void a(d dVar) {
        f fVar = this.h;
        if (!fVar.c || fVar.j) {
            return;
        }
        fVar.d((int) ((((f) fVar.l.get(0)).g * ((com.amazon.aps.iva.u2.h) this.b).s0) + 0.5f));
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void d() {
        com.amazon.aps.iva.u2.e eVar = this.b;
        com.amazon.aps.iva.u2.h hVar = (com.amazon.aps.iva.u2.h) eVar;
        int i = hVar.t0;
        int i2 = hVar.u0;
        int i3 = hVar.w0;
        f fVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                fVar.l.add(eVar.W.d.h);
                this.b.W.d.h.k.add(fVar);
                fVar.f = i;
            } else if (i2 != -1) {
                fVar.l.add(eVar.W.d.i);
                this.b.W.d.i.k.add(fVar);
                fVar.f = -i2;
            } else {
                fVar.b = true;
                fVar.l.add(eVar.W.d.i);
                this.b.W.d.i.k.add(fVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            fVar.l.add(eVar.W.e.h);
            this.b.W.e.h.k.add(fVar);
            fVar.f = i;
        } else if (i2 != -1) {
            fVar.l.add(eVar.W.e.i);
            this.b.W.e.i.k.add(fVar);
            fVar.f = -i2;
        } else {
            fVar.b = true;
            fVar.l.add(eVar.W.e.i);
            this.b.W.e.i.k.add(fVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void e() {
        com.amazon.aps.iva.u2.e eVar = this.b;
        int i = ((com.amazon.aps.iva.u2.h) eVar).w0;
        f fVar = this.h;
        if (i == 1) {
            eVar.b0 = fVar.g;
        } else {
            eVar.c0 = fVar.g;
        }
    }

    @Override // com.amazon.aps.iva.v2.p
    public final void f() {
        this.h.c();
    }

    @Override // com.amazon.aps.iva.v2.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.k.add(fVar);
        fVar.l.add(fVar2);
    }
}
