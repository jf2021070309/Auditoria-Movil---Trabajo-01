package com.amazon.aps.iva.y0;
/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class k0 extends b {
    public final b o;
    public final boolean p;
    public final boolean q;

    public k0(b bVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2, boolean z, boolean z2) {
        super(0, k.f, m.l(lVar, (bVar == null || (r1 = bVar.e) == null) ? m.j.get().e : r1, z), m.b(lVar2, (bVar == null || (r1 = bVar.f) == null) ? m.j.get().f : r1));
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar3;
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar4;
        this.o = bVar;
        this.p = z;
        this.q = z2;
    }

    @Override // com.amazon.aps.iva.y0.b
    public final b A(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2) {
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> l = m.l(lVar, this.e, true);
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> b = m.b(lVar2, this.f);
        if (!this.p) {
            return new k0(C().A(null, b), l, b, false, true);
        }
        return C().A(l, b);
    }

    public final b C() {
        b bVar = this.o;
        if (bVar == null) {
            a aVar = m.j.get();
            com.amazon.aps.iva.yb0.j.e(aVar, "currentGlobalSnapshot.get()");
            return aVar;
        }
        return bVar;
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final void c() {
        b bVar;
        this.c = true;
        if (this.q && (bVar = this.o) != null) {
            bVar.c();
        }
    }

    @Override // com.amazon.aps.iva.y0.h
    public final int d() {
        return C().d();
    }

    @Override // com.amazon.aps.iva.y0.h
    public final k e() {
        return C().e();
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final boolean g() {
        return C().g();
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final int h() {
        return C().h();
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final void k(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "snapshot");
        x.a();
        throw null;
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final void l(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "snapshot");
        x.a();
        throw null;
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final void m() {
        C().m();
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final void n(h0 h0Var) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "state");
        C().n(h0Var);
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void q(int i) {
        x.a();
        throw null;
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void r(k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "value");
        x.a();
        throw null;
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final void s(int i) {
        C().s(i);
    }

    @Override // com.amazon.aps.iva.y0.b, com.amazon.aps.iva.y0.h
    public final h t(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> l = m.l(lVar, this.e, true);
        if (!this.p) {
            return m.h(C().t(null), l, true);
        }
        return C().t(l);
    }

    @Override // com.amazon.aps.iva.y0.b
    public final i v() {
        return C().v();
    }

    @Override // com.amazon.aps.iva.y0.b
    public final com.amazon.aps.iva.p0.c<h0> w() {
        return C().w();
    }

    @Override // com.amazon.aps.iva.y0.b
    public final void z(com.amazon.aps.iva.p0.c<h0> cVar) {
        x.a();
        throw null;
    }
}
