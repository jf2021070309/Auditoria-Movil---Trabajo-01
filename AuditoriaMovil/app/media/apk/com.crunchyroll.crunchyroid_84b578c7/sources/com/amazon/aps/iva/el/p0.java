package com.amazon.aps.iva.el;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ve0.u0;
/* compiled from: PlayerViewViewModel.kt */
/* loaded from: classes2.dex */
public final class p0 extends com.amazon.aps.iva.ez.b implements k0, com.amazon.aps.iva.cl.a, com.amazon.aps.iva.tk.a {
    public final com.amazon.aps.iva.i5.v<h0> b;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> c;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> d;
    public final androidx.lifecycle.c e;
    public final u0<com.amazon.aps.iva.kj.e> f;
    public final androidx.lifecycle.c g;
    public final com.amazon.aps.iva.i5.u h;
    public final androidx.lifecycle.c i;
    public final androidx.lifecycle.c j;

    public p0(com.amazon.aps.iva.cj.h hVar, z zVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.i5.v<h0> vVar = new com.amazon.aps.iva.i5.v<>(h0.MINIMIZED);
        this.b = vVar;
        this.c = new com.amazon.aps.iva.i5.v<>();
        this.d = new com.amazon.aps.iva.i5.v<>();
        this.e = com.amazon.aps.iva.i5.j.b(hVar.getState(), com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        this.f = hVar.m();
        this.g = com.amazon.aps.iva.i5.j.b(com.amazon.aps.iva.dg.b.m(new n0(hVar.getState())), com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        this.h = com.amazon.aps.iva.i5.d0.a(com.amazon.aps.iva.i5.d0.b(vVar, l0.h));
        this.i = com.amazon.aps.iva.i5.j.b(com.amazon.aps.iva.dg.b.m(new com.amazon.aps.iva.ve0.c0(hVar.g(), hVar.getState(), new m0(null))), com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        this.j = com.amazon.aps.iva.i5.j.b(com.amazon.aps.iva.dg.b.m(new o0(hVar.d(), zVar)), com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
    }

    @Override // com.amazon.aps.iva.cl.a, com.amazon.aps.iva.tk.a
    public final com.amazon.aps.iva.i5.u D() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.el.k0
    public final void J0(h0 h0Var) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "state");
        this.b.k(h0Var);
    }

    @Override // com.amazon.aps.iva.cl.a
    public final androidx.lifecycle.c N() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.cl.a
    public final androidx.lifecycle.c S4() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.cl.a
    public final androidx.lifecycle.c V1() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.el.k0
    public final void Z2() {
        this.d.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.kb0.q.a));
    }

    @Override // com.amazon.aps.iva.el.k0
    public final LiveData getSizeState() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.el.k0
    public final void v8() {
        this.b.k(h0.MINIMIZED);
        this.c.k(new com.amazon.aps.iva.ez.d<>(com.amazon.aps.iva.kb0.q.a));
    }
}
