package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.u1.e;
/* compiled from: Layout.kt */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<x2<com.amazon.aps.iva.u1.e>, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.a1.f h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.amazon.aps.iva.a1.f fVar) {
        super(3);
        this.h = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(x2<com.amazon.aps.iva.u1.e> x2Var, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = x2Var.a;
        com.amazon.aps.iva.o0.i iVar3 = iVar;
        num.intValue();
        com.amazon.aps.iva.yb0.j.f(iVar2, "$this$null");
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        int S = com.amazon.aps.iva.cq.b.S(iVar3);
        com.amazon.aps.iva.a1.f c = com.amazon.aps.iva.a1.e.c(iVar3, this.h);
        iVar2.s(509942095);
        com.amazon.aps.iva.u1.e.o0.getClass();
        com.amazon.aps.iva.cq.b.k0(iVar2, c, e.a.c);
        e.a.C0752a c0752a = e.a.f;
        if (iVar2.e() || !com.amazon.aps.iva.yb0.j.a(iVar2.t(), Integer.valueOf(S))) {
            b2.c(S, iVar2, S, c0752a);
        }
        iVar2.G();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
