package com.amazon.aps.iva.m0;
/* compiled from: TextField.kt */
/* loaded from: classes.dex */
public final class s3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.c, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ float h;
    public final /* synthetic */ com.amazon.aps.iva.a0.p i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(float f, com.amazon.aps.iva.a0.p pVar) {
        super(1);
        this.h = f;
        this.i = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.c cVar) {
        com.amazon.aps.iva.h1.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$drawWithContent");
        cVar2.f1();
        float f = this.h;
        if (!com.amazon.aps.iva.o2.e.a(f, 0.0f)) {
            float density = cVar2.getDensity() * f;
            float b = com.amazon.aps.iva.e1.g.b(cVar2.h()) - (density / 2);
            com.amazon.aps.iva.h1.e.K0(cVar2, this.i.b, com.amazon.aps.iva.e1.d.d(0.0f, b), com.amazon.aps.iva.e1.d.d(com.amazon.aps.iva.e1.g.d(cVar2.h()), b), density, 0.0f, 496);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
