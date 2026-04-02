package com.amazon.aps.iva.b0;
/* compiled from: Draggable.kt */
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.y, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.q1.c h;
    public final /* synthetic */ com.amazon.aps.iva.yb0.c0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.amazon.aps.iva.q1.c cVar, com.amazon.aps.iva.yb0.c0 c0Var) {
        super(2);
        this.h = cVar;
        this.i = c0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.p1.y yVar, com.amazon.aps.iva.e1.c cVar) {
        com.amazon.aps.iva.p1.y yVar2 = yVar;
        long j = cVar.a;
        com.amazon.aps.iva.yb0.j.f(yVar2, "event");
        com.amazon.aps.iva.cq.b.o(this.h, yVar2);
        yVar2.a();
        this.i.b = j;
        return com.amazon.aps.iva.kb0.q.a;
    }
}
