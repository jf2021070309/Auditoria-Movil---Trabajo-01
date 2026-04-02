package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.y0.m;
/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class d extends h {
    public final h e;
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> f;

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2) {
            super(1);
            this.h = lVar;
            this.i = lVar2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
            com.amazon.aps.iva.yb0.j.f(obj, "state");
            this.h.invoke(obj);
            this.i.invoke(obj);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, k kVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, h hVar) {
        super(i, kVar);
        com.amazon.aps.iva.yb0.j.f(kVar, "invalid");
        com.amazon.aps.iva.yb0.j.f(hVar, "parent");
        this.e = hVar;
        hVar.k(this);
        if (lVar != null) {
            com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> f = hVar.f();
            if (f != null) {
                lVar = new a(lVar, f);
            }
        } else {
            lVar = hVar.f();
        }
        this.f = lVar;
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void c() {
        if (!this.c) {
            int i = this.b;
            h hVar = this.e;
            if (i != hVar.d()) {
                a();
            }
            hVar.l(this);
            super.c();
        }
    }

    @Override // com.amazon.aps.iva.y0.h
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> f() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.y0.h
    public final boolean g() {
        return true;
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
    public final void n(h0 h0Var) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "state");
        m.a aVar = m.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // com.amazon.aps.iva.y0.h
    public final h t(com.amazon.aps.iva.xb0.l lVar) {
        return new d(this.b, this.a, lVar, this.e);
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void m() {
    }
}
