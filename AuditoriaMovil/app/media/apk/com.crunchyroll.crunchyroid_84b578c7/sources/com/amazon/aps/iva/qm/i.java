package com.amazon.aps.iva.qm;
/* compiled from: ProfileActivationFlowRouter.kt */
/* loaded from: classes2.dex */
public final class i implements c {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h.c<com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.kb0.q> a;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> b;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> c;
    public final com.amazon.aps.iva.h.c<com.amazon.aps.iva.kb0.q> d;

    public i(a aVar, b bVar, com.amazon.aps.iva.xb0.p pVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "startFlow");
        this.a = bVar;
        this.b = h.h;
        this.c = g.h;
        this.d = (com.amazon.aps.iva.h.c) pVar.invoke(aVar, new f(this));
    }

    @Override // com.amazon.aps.iva.qm.c
    public final void a(w wVar, x xVar) {
        this.b = wVar;
        this.c = xVar;
        this.a.invoke(this.d);
    }
}
