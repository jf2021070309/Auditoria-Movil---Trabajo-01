package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.v1.d1;
/* compiled from: TextFieldSelectionManager.android.kt */
/* loaded from: classes.dex */
public final class i0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ c0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(c0 c0Var) {
        super(3);
        this.h = c0Var;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.a1.f a;
        com.amazon.aps.iva.a1.f fVar2 = fVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        t1.c(num, fVar2, "$this$composed", iVar2, 1980580247);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        com.amazon.aps.iva.o2.c cVar = (com.amazon.aps.iva.o2.c) iVar2.i(d1.e);
        iVar2.s(-492369756);
        Object t = iVar2.t();
        i.a.C0550a c0550a = i.a.a;
        if (t == c0550a) {
            t = com.amazon.aps.iva.cq.b.c0(new com.amazon.aps.iva.o2.j(0L));
            iVar2.n(t);
        }
        iVar2.G();
        q1 q1Var = (q1) t;
        e0 e0Var = new e0(this.h, q1Var);
        iVar2.s(511388516);
        boolean H = iVar2.H(q1Var) | iVar2.H(cVar);
        Object t2 = iVar2.t();
        if (H || t2 == c0550a) {
            t2 = new h0(cVar, q1Var);
            iVar2.n(t2);
        }
        iVar2.G();
        com.amazon.aps.iva.xb0.l lVar = (com.amazon.aps.iva.xb0.l) t2;
        com.amazon.aps.iva.z.n nVar = p.a;
        com.amazon.aps.iva.yb0.j.f(lVar, "platformMagnifier");
        a = com.amazon.aps.iva.a1.e.a(fVar2, com.amazon.aps.iva.v1.t1.a, new r(e0Var, lVar));
        iVar2.G();
        return a;
    }
}
