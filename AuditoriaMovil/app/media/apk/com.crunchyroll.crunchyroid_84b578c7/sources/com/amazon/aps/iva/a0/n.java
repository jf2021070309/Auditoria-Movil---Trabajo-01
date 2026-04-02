package com.amazon.aps.iva.a0;
/* compiled from: Border.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.c, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.f1.m0 h;
    public final /* synthetic */ com.amazon.aps.iva.f1.s i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.amazon.aps.iva.f1.m0 m0Var, com.amazon.aps.iva.f1.s sVar) {
        super(1);
        this.h = m0Var;
        this.i = sVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.c cVar) {
        com.amazon.aps.iva.h1.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$onDrawWithContent");
        cVar2.f1();
        com.amazon.aps.iva.h1.e.E(cVar2, this.h, this.i, 0.0f, null, 60);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
