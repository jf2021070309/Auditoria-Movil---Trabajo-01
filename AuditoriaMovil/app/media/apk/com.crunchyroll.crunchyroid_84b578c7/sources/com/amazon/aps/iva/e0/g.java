package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.s1.w0;
/* compiled from: LazyListBeyondBoundsModifier.kt */
/* loaded from: classes.dex */
public final class g implements com.amazon.aps.iva.f0.h {
    public final g0 a;
    public final int b;

    public g(g0 g0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "state");
        this.a = g0Var;
        this.b = i;
    }

    @Override // com.amazon.aps.iva.f0.h
    public final int b() {
        return ((y) this.a.b.getValue()).a();
    }

    @Override // com.amazon.aps.iva.f0.h
    public final void c() {
        w0 w0Var = this.a.k;
        if (w0Var != null) {
            w0Var.d();
        }
    }

    @Override // com.amazon.aps.iva.f0.h
    public final boolean d() {
        return !((y) this.a.b.getValue()).b().isEmpty();
    }

    @Override // com.amazon.aps.iva.f0.h
    public final int e() {
        return Math.max(0, this.a.a.a.t() - this.b);
    }

    @Override // com.amazon.aps.iva.f0.h
    public final int f() {
        return Math.min(b() - 1, ((j) com.amazon.aps.iva.lb0.x.D0(((y) this.a.b.getValue()).b())).getIndex() + this.b);
    }
}
