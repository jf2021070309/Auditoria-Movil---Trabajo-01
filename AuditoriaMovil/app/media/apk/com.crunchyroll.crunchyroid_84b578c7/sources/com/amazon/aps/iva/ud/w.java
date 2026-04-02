package com.amazon.aps.iva.ud;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.p4.n;
/* compiled from: ContinueWatchingLarge.kt */
/* loaded from: classes.dex */
public final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.y4.o, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.sd.a h;
    public final /* synthetic */ int i;
    public final /* synthetic */ com.amazon.aps.iva.sd.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i, com.amazon.aps.iva.sd.a aVar, com.amazon.aps.iva.sd.a aVar2) {
        super(3);
        this.h = aVar;
        this.i = i;
        this.j = aVar2;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.y4.o oVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.y4.o oVar2 = oVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        num.intValue();
        com.amazon.aps.iva.yb0.j.f(oVar2, "$this$Row");
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        com.amazon.aps.iva.sd.a aVar = this.h;
        if (aVar != null) {
            n.a aVar2 = n.a.b;
            float f = 138;
            com.amazon.aps.iva.p4.n J = com.amazon.aps.iva.ff0.b.J(com.amazon.aps.iva.ff0.b.w(oVar2.a(), f), f);
            int i = this.i;
            s.a(aVar, J, false, 0.0f, iVar2, i & 14, 12);
            com.amazon.aps.iva.y4.q.a(com.amazon.aps.iva.ff0.b.J(aVar2, 12), iVar2, 0, 0);
            com.amazon.aps.iva.sd.a aVar3 = this.j;
            if (aVar3 != null) {
                s.a(aVar3, com.amazon.aps.iva.ff0.b.J(com.amazon.aps.iva.ff0.b.w(oVar2.a(), f), f), false, 0.0f, iVar2, (i >> 3) & 14, 12);
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
