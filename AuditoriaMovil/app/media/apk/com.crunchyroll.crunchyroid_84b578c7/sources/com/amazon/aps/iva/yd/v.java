package com.amazon.aps.iva.yd;
/* compiled from: EmailMandatoryRouter.kt */
/* loaded from: classes.dex */
public final class v implements r {
    public final com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.h.c<g>, g, com.amazon.aps.iva.kb0.q> a;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> b;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> c;
    public final com.amazon.aps.iva.h.c<g> d;

    public v(d dVar, com.amazon.aps.iva.xb0.p pVar, q qVar) {
        com.amazon.aps.iva.yb0.j.f(qVar, "startFlow");
        this.a = qVar;
        this.b = u.h;
        this.c = t.h;
        this.d = (com.amazon.aps.iva.h.c) pVar.invoke(dVar, new s(this));
    }

    @Override // com.amazon.aps.iva.yd.r
    public final void a(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // com.amazon.aps.iva.yd.r
    public final void b(g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "input");
        this.a.invoke(this.d, gVar);
    }
}
