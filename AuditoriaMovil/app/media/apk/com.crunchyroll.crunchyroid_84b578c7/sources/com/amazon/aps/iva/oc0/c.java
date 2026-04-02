package com.amazon.aps.iva.oc0;

import com.amazon.aps.iva.ee0.v1;
import java.util.List;
/* compiled from: typeParameterUtils.kt */
/* loaded from: classes4.dex */
public final class c implements y0 {
    public final y0 b;
    public final k c;
    public final int d;

    public c(y0 y0Var, k kVar, int i) {
        com.amazon.aps.iva.yb0.j.f(kVar, "declarationDescriptor");
        this.b = y0Var;
        this.c = kVar;
        this.d = i;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(m<R, D> mVar, D d) {
        return (R) this.b.D0(mVar, d);
    }

    @Override // com.amazon.aps.iva.oc0.y0
    public final com.amazon.aps.iva.de0.l K() {
        return this.b.K();
    }

    @Override // com.amazon.aps.iva.oc0.y0
    public final boolean O() {
        return true;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final k d() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.oc0.n
    public final t0 g() {
        return this.b.g();
    }

    @Override // com.amazon.aps.iva.pc0.a
    public final com.amazon.aps.iva.pc0.h getAnnotations() {
        return this.b.getAnnotations();
    }

    @Override // com.amazon.aps.iva.oc0.y0
    public final int getIndex() {
        return this.b.getIndex() + this.d;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.nd0.f getName() {
        return this.b.getName();
    }

    @Override // com.amazon.aps.iva.oc0.y0
    public final List<com.amazon.aps.iva.ee0.e0> getUpperBounds() {
        return this.b.getUpperBounds();
    }

    @Override // com.amazon.aps.iva.oc0.y0, com.amazon.aps.iva.oc0.h
    public final com.amazon.aps.iva.ee0.c1 h() {
        return this.b.h();
    }

    @Override // com.amazon.aps.iva.oc0.y0
    public final v1 i() {
        return this.b.i();
    }

    @Override // com.amazon.aps.iva.oc0.h
    public final com.amazon.aps.iva.ee0.m0 m() {
        return this.b.m();
    }

    public final String toString() {
        return this.b + "[inner-copy]";
    }

    @Override // com.amazon.aps.iva.oc0.y0
    public final boolean w() {
        return this.b.w();
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final y0 a() {
        y0 a = this.b.a();
        com.amazon.aps.iva.yb0.j.e(a, "originalDescriptor.original");
        return a;
    }
}
