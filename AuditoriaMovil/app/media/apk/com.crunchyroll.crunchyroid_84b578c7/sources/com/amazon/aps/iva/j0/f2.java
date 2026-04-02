package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.j0.k;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: TextFieldPressGestureFilter.kt */
/* loaded from: classes.dex */
public final class f2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ com.amazon.aps.iva.c0.l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(k.C0393k c0393k, com.amazon.aps.iva.c0.l lVar) {
        super(3);
        this.h = c0393k;
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        com.amazon.aps.iva.o0.t1.c(num, fVar, "$this$composed", iVar2, -102778667);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar2.s(773894976);
        iVar2.s(-492369756);
        Object t = iVar2.t();
        i.a.C0550a c0550a = i.a.a;
        if (t == c0550a) {
            com.amazon.aps.iva.o0.n0 n0Var = new com.amazon.aps.iva.o0.n0(com.amazon.aps.iva.o0.x0.g(iVar2));
            iVar2.n(n0Var);
            t = n0Var;
        }
        iVar2.G();
        com.amazon.aps.iva.se0.g0 g0Var = ((com.amazon.aps.iva.o0.n0) t).b;
        iVar2.G();
        iVar2.s(-492369756);
        Object t2 = iVar2.t();
        if (t2 == c0550a) {
            t2 = com.amazon.aps.iva.cq.b.c0(null);
            iVar2.n(t2);
        }
        iVar2.G();
        com.amazon.aps.iva.o0.q1 q1Var = (com.amazon.aps.iva.o0.q1) t2;
        com.amazon.aps.iva.o0.q1 h0 = com.amazon.aps.iva.cq.b.h0(this.h, iVar2);
        iVar2.s(511388516);
        boolean H = iVar2.H(q1Var);
        com.amazon.aps.iva.c0.l lVar = this.i;
        boolean H2 = H | iVar2.H(lVar);
        Object t3 = iVar2.t();
        if (H2 || t3 == c0550a) {
            t3 = new d2(q1Var, lVar);
            iVar2.n(t3);
        }
        iVar2.G();
        com.amazon.aps.iva.o0.x0.a(lVar, (com.amazon.aps.iva.xb0.l) t3, iVar2);
        f.a aVar = f.a.c;
        com.amazon.aps.iva.c0.l lVar2 = this.i;
        com.amazon.aps.iva.a1.f a = com.amazon.aps.iva.p1.l0.a(aVar, lVar2, new e2(g0Var, q1Var, lVar2, h0, null));
        iVar2.G();
        return a;
    }
}
