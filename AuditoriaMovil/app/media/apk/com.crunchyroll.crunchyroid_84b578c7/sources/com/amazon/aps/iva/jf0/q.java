package com.amazon.aps.iva.jf0;
/* compiled from: KotlinExtensions.kt */
/* loaded from: classes4.dex */
public final class q implements d<Object> {
    public final /* synthetic */ com.amazon.aps.iva.se0.m a;

    public q(com.amazon.aps.iva.se0.n nVar) {
        this.a = nVar;
    }

    @Override // com.amazon.aps.iva.jf0.d
    public final void onFailure(b<Object> bVar, Throwable th) {
        com.amazon.aps.iva.yb0.j.g(bVar, "call");
        com.amazon.aps.iva.yb0.j.g(th, "t");
        this.a.resumeWith(com.amazon.aps.iva.ab.x.H(th));
    }

    @Override // com.amazon.aps.iva.jf0.d
    public final void onResponse(b<Object> bVar, a0<Object> a0Var) {
        com.amazon.aps.iva.yb0.j.g(bVar, "call");
        com.amazon.aps.iva.yb0.j.g(a0Var, "response");
        this.a.resumeWith(a0Var);
    }
}
