package com.amazon.aps.iva.oc0;
/* compiled from: DescriptorVisibility.kt */
/* loaded from: classes4.dex */
public abstract class p extends r {
    public final g1 a;

    public p(g1 g1Var) {
        com.amazon.aps.iva.yb0.j.f(g1Var, "delegate");
        this.a = g1Var;
    }

    @Override // com.amazon.aps.iva.oc0.r
    public final g1 a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.oc0.r
    public final String b() {
        return this.a.b();
    }

    @Override // com.amazon.aps.iva.oc0.r
    public final r d() {
        return q.g(this.a.c());
    }
}
