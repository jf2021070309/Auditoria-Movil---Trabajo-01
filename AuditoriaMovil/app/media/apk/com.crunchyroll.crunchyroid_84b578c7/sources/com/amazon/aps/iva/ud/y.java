package com.amazon.aps.iva.ud;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.p4.n;
/* compiled from: ContinueWatchingMedium.kt */
/* loaded from: classes.dex */
public final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.y4.o, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.sd.a> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.sd.a> aVar) {
        super(3);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.y4.o oVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.y4.o oVar2 = oVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        num.intValue();
        com.amazon.aps.iva.yb0.j.f(oVar2, "$this$Row");
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.sd.a> aVar = this.h;
        n.a aVar2 = n.a.b;
        float f = 138;
        s.a(aVar.get(0), com.amazon.aps.iva.ff0.b.J(com.amazon.aps.iva.ff0.b.w(oVar2.a(), f), f), false, 0.0f, iVar2, 0, 12);
        com.amazon.aps.iva.y4.q.a(com.amazon.aps.iva.ff0.b.J(aVar2, 12), iVar2, 0, 0);
        if (aVar.size() > 1) {
            s.a(aVar.get(1), com.amazon.aps.iva.ff0.b.J(com.amazon.aps.iva.ff0.b.w(oVar2.a(), f), f), true, 0.0f, iVar2, 384, 8);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
