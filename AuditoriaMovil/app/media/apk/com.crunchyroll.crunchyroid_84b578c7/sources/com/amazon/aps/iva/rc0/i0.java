package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.pc0.h;
/* compiled from: PackageFragmentDescriptorImpl.kt */
/* loaded from: classes4.dex */
public abstract class i0 extends q implements com.amazon.aps.iva.oc0.f0 {
    public final com.amazon.aps.iva.nd0.c f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.amazon.aps.iva.oc0.c0 c0Var, com.amazon.aps.iva.nd0.c cVar) {
        super(c0Var, h.a.a, cVar.g(), com.amazon.aps.iva.oc0.t0.a);
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        this.f = cVar;
        this.g = "package " + cVar + " of " + c0Var;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.k(this, d);
    }

    @Override // com.amazon.aps.iva.oc0.f0
    public final com.amazon.aps.iva.nd0.c c() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.oc0.n
    public com.amazon.aps.iva.oc0.t0 g() {
        return com.amazon.aps.iva.oc0.t0.a;
    }

    @Override // com.amazon.aps.iva.rc0.p
    public String toString() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.c0 d() {
        com.amazon.aps.iva.oc0.k d = super.d();
        com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (com.amazon.aps.iva.oc0.c0) d;
    }
}
