package com.amazon.aps.iva.k20;

import com.amazon.aps.iva.t20.e;
import com.amazon.aps.iva.xw.x;
/* compiled from: CancellationRescueFlowRouter.kt */
/* loaded from: classes2.dex */
public final class g implements i {
    public final com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.h.c<k>, k, com.amazon.aps.iva.kb0.q> a;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> b;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> c;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> d;
    public final com.amazon.aps.iva.h.c<k> e;

    public g(q qVar, x xVar, h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "startFlow");
        this.a = hVar;
        this.b = e.h;
        this.c = d.h;
        this.d = f.h;
        this.e = xVar.invoke(qVar, new c(this));
    }

    @Override // com.amazon.aps.iva.k20.i
    public final void a(e.d dVar, e.C0728e c0728e, e.f fVar) {
        this.b = dVar;
        this.c = c0728e;
        this.d = fVar;
    }

    @Override // com.amazon.aps.iva.k20.i
    public final void b(k kVar, com.amazon.aps.iva.t20.f fVar, com.amazon.aps.iva.t20.g gVar, com.amazon.aps.iva.t20.h hVar) {
        this.b = fVar;
        this.c = gVar;
        this.d = hVar;
        this.a.invoke(this.e, kVar);
    }
}
