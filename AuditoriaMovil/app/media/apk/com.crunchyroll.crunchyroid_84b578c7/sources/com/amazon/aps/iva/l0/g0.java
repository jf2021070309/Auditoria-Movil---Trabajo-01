package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.o0.q1;
/* compiled from: TextFieldSelectionManager.android.kt */
/* loaded from: classes.dex */
public final class g0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.g, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.o2.c h;
    public final /* synthetic */ q1<com.amazon.aps.iva.o2.j> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.amazon.aps.iva.o2.c cVar, q1<com.amazon.aps.iva.o2.j> q1Var) {
        super(1);
        this.h = cVar;
        this.i = q1Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o2.g gVar) {
        long j = gVar.a;
        float c = com.amazon.aps.iva.o2.g.c(j);
        com.amazon.aps.iva.o2.c cVar = this.h;
        this.i.setValue(new com.amazon.aps.iva.o2.j(com.amazon.aps.iva.o2.k.a(cVar.f0(c), cVar.f0(com.amazon.aps.iva.o2.g.b(j)))));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
