package com.amazon.aps.iva.y0;
/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class l0 extends h {
    public final h e;
    public final boolean f;
    public final boolean g;
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> h;

    public l0(h hVar, com.amazon.aps.iva.xb0.l lVar, boolean z) {
        super(0, k.f);
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2;
        this.e = hVar;
        this.f = false;
        this.g = z;
        this.h = m.l(lVar, (hVar == null || (lVar2 = hVar.f()) == null) ? m.j.get().e : lVar2, false);
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void c() {
        h hVar;
        this.c = true;
        if (this.g && (hVar = this.e) != null) {
            hVar.c();
        }
    }

    @Override // com.amazon.aps.iva.y0.h
    public final int d() {
        return u().d();
    }

    @Override // com.amazon.aps.iva.y0.h
    public final k e() {
        return u().e();
    }

    @Override // com.amazon.aps.iva.y0.h
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> f() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.y0.h
    public final boolean g() {
        return u().g();
    }

    @Override // com.amazon.aps.iva.y0.h
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> i() {
        return null;
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void k(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "snapshot");
        x.a();
        throw null;
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void l(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "snapshot");
        x.a();
        throw null;
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void m() {
        u().m();
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void n(h0 h0Var) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "state");
        u().n(h0Var);
    }

    @Override // com.amazon.aps.iva.y0.h
    public final h t(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> l = m.l(lVar, this.h, true);
        if (!this.f) {
            return m.h(u().t(null), l, true);
        }
        return u().t(l);
    }

    public final h u() {
        h hVar = this.e;
        if (hVar == null) {
            a aVar = m.j.get();
            com.amazon.aps.iva.yb0.j.e(aVar, "currentGlobalSnapshot.get()");
            return aVar;
        }
        return hVar;
    }
}
