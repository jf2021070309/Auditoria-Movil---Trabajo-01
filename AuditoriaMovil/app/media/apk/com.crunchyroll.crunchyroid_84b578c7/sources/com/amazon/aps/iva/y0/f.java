package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.y0.m;
/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class f extends h {
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, k kVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar) {
        super(i, kVar);
        com.amazon.aps.iva.yb0.j.f(kVar, "invalid");
        this.e = lVar;
        this.f = 1;
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void c() {
        if (!this.c) {
            l(this);
            super.c();
        }
    }

    @Override // com.amazon.aps.iva.y0.h
    public final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> f() {
        return this.e;
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
        this.f++;
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void l(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "snapshot");
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void n(h0 h0Var) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "state");
        m.a aVar = m.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // com.amazon.aps.iva.y0.h
    public final h t(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar) {
        m.d(this);
        return new d(this.b, this.a, lVar, this);
    }

    @Override // com.amazon.aps.iva.y0.h
    public final void m() {
    }
}
