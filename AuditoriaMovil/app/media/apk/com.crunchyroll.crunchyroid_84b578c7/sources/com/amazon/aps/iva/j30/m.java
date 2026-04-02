package com.amazon.aps.iva.j30;
/* compiled from: UpsellV2FlowRouter.kt */
/* loaded from: classes2.dex */
public final class m implements f {
    public final com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.h.c<g>, g, com.amazon.aps.iva.kb0.q> a;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> b;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> c;
    public final com.amazon.aps.iva.h.c<g> d;

    public m(y yVar, com.amazon.aps.iva.xw.x xVar, e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "startFlow");
        this.a = eVar;
        this.b = l.h;
        this.c = k.h;
        this.d = xVar.invoke(yVar, new j(this));
    }

    @Override // com.amazon.aps.iva.j30.f
    public final void a(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar, "onSkipped");
        com.amazon.aps.iva.yb0.j.f(aVar2, "onSubscriptionComplete");
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // com.amazon.aps.iva.j30.f
    public final void b(g gVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        if (aVar != null) {
            this.b = aVar;
        }
        if (aVar2 != null) {
            this.c = aVar2;
        }
        this.a.invoke(this.d, gVar);
    }
}
