package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.b0.g;
import com.amazon.aps.iva.ee0.f1;
/* compiled from: Draggable.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.p1.y, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.q1.c h;
    public final /* synthetic */ com.amazon.aps.iva.ue0.w<g> i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.amazon.aps.iva.q1.c cVar, com.amazon.aps.iva.ue0.a aVar, boolean z) {
        super(1);
        this.h = cVar;
        this.i = aVar;
        this.j = z;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.p1.y yVar) {
        com.amazon.aps.iva.p1.y yVar2 = yVar;
        com.amazon.aps.iva.yb0.j.f(yVar2, "event");
        com.amazon.aps.iva.cq.b.o(this.h, yVar2);
        if (!f1.p(yVar2)) {
            long P = f1.P(yVar2, false);
            yVar2.a();
            if (this.j) {
                P = com.amazon.aps.iva.e1.c.g(P, -1.0f);
            }
            this.i.h(new g.b(P));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
