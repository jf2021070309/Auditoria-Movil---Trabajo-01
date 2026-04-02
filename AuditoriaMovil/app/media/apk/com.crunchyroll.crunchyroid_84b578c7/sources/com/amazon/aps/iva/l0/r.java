package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.o0.x0;
/* compiled from: SelectionMagnifier.kt */
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.c> h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.c>, com.amazon.aps.iva.a1.f> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e0 e0Var, com.amazon.aps.iva.xb0.l lVar) {
        super(3);
        this.h = e0Var;
        this.i = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        t1.c(num, fVar, "$this$composed", iVar2, 759876635);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar2.s(-1589795249);
        iVar2.s(-492369756);
        Object t = iVar2.t();
        Object obj = i.a.a;
        if (t == obj) {
            t = com.amazon.aps.iva.cq.b.M(this.h);
            iVar2.n(t);
        }
        iVar2.G();
        p3 p3Var = (p3) t;
        iVar2.s(-492369756);
        Object t2 = iVar2.t();
        if (t2 == obj) {
            t2 = new com.amazon.aps.iva.z.b(new com.amazon.aps.iva.e1.c(((com.amazon.aps.iva.e1.c) p3Var.getValue()).a), p.b, new com.amazon.aps.iva.e1.c(p.c), 8);
            iVar2.n(t2);
        }
        iVar2.G();
        com.amazon.aps.iva.z.b bVar2 = (com.amazon.aps.iva.z.b) t2;
        x0.c(com.amazon.aps.iva.kb0.q.a, new s(p3Var, bVar2, null), iVar2);
        com.amazon.aps.iva.z.l<T, V> lVar = bVar2.c;
        iVar2.G();
        iVar2.s(1157296644);
        boolean H = iVar2.H(lVar);
        Object t3 = iVar2.t();
        if (H || t3 == obj) {
            t3 = new q(lVar);
            iVar2.n(t3);
        }
        iVar2.G();
        com.amazon.aps.iva.a1.f fVar2 = (com.amazon.aps.iva.a1.f) this.i.invoke(t3);
        iVar2.G();
        return fVar2;
    }
}
