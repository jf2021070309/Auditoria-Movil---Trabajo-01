package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.o0.p3;
/* compiled from: Magnifier.kt */
/* loaded from: classes.dex */
public final class c1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.c> {
    public final /* synthetic */ com.amazon.aps.iva.o2.c h;
    public final /* synthetic */ p3<com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.c, com.amazon.aps.iva.e1.c>> i;
    public final /* synthetic */ com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.e1.c> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.o0.q1 q1Var, com.amazon.aps.iva.o0.q1 q1Var2) {
        super(0);
        this.h = cVar;
        this.i = q1Var;
        this.j = q1Var2;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.e1.c invoke() {
        long j;
        long j2 = this.i.getValue().invoke(this.h).a;
        com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.e1.c> q1Var = this.j;
        if (com.amazon.aps.iva.e1.d.h(q1Var.getValue().a) && com.amazon.aps.iva.e1.d.h(j2)) {
            j = com.amazon.aps.iva.e1.c.f(q1Var.getValue().a, j2);
        } else {
            j = com.amazon.aps.iva.e1.c.d;
        }
        return new com.amazon.aps.iva.e1.c(j);
    }
}
