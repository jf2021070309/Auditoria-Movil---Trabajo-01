package com.amazon.aps.iva.a0;

import android.view.View;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.p3;
/* compiled from: Magnifier.kt */
/* loaded from: classes.dex */
public final class d1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.c, com.amazon.aps.iva.e1.c> h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.c, com.amazon.aps.iva.e1.c> i;
    public final /* synthetic */ float j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.g, com.amazon.aps.iva.kb0.q> k;
    public final /* synthetic */ r1 l;
    public final /* synthetic */ f1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.amazon.aps.iva.l0.f0 f0Var, com.amazon.aps.iva.xb0.l lVar, float f, com.amazon.aps.iva.xb0.l lVar2, r1 r1Var, f1 f1Var) {
        super(3);
        this.h = f0Var;
        this.i = lVar;
        this.j = f;
        this.k = lVar2;
        this.l = r1Var;
        this.m = f1Var;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.a1.f fVar2 = fVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        com.amazon.aps.iva.o0.t1.c(num, fVar2, "$this$composed", iVar2, -454877003);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        View view = (View) iVar2.i(androidx.compose.ui.platform.d.f);
        com.amazon.aps.iva.o2.c cVar = (com.amazon.aps.iva.o2.c) iVar2.i(com.amazon.aps.iva.v1.d1.e);
        iVar2.s(-492369756);
        Object t = iVar2.t();
        Object obj = i.a.a;
        if (t == obj) {
            t = com.amazon.aps.iva.cq.b.c0(new com.amazon.aps.iva.e1.c(com.amazon.aps.iva.e1.c.d));
            iVar2.n(t);
        }
        iVar2.G();
        com.amazon.aps.iva.o0.q1 q1Var = (com.amazon.aps.iva.o0.q1) t;
        com.amazon.aps.iva.o0.q1 h0 = com.amazon.aps.iva.cq.b.h0(this.h, iVar2);
        com.amazon.aps.iva.o0.q1 h02 = com.amazon.aps.iva.cq.b.h0(this.i, iVar2);
        float f = this.j;
        com.amazon.aps.iva.o0.q1 h03 = com.amazon.aps.iva.cq.b.h0(Float.valueOf(f), iVar2);
        com.amazon.aps.iva.o0.q1 h04 = com.amazon.aps.iva.cq.b.h0(this.k, iVar2);
        iVar2.s(-492369756);
        Object t2 = iVar2.t();
        if (t2 == obj) {
            t2 = com.amazon.aps.iva.cq.b.M(new c1(cVar, h0, q1Var));
            iVar2.n(t2);
        }
        iVar2.G();
        p3 p3Var = (p3) t2;
        iVar2.s(-492369756);
        Object t3 = iVar2.t();
        if (t3 == obj) {
            t3 = com.amazon.aps.iva.cq.b.M(new b1(p3Var));
            iVar2.n(t3);
        }
        iVar2.G();
        p3 p3Var2 = (p3) t3;
        iVar2.s(-492369756);
        Object t4 = iVar2.t();
        if (t4 == obj) {
            t4 = com.amazon.aps.iva.ab.t.g(1, 0, com.amazon.aps.iva.ue0.e.DROP_OLDEST, 2);
            iVar2.n(t4);
        }
        iVar2.G();
        com.amazon.aps.iva.ve0.f0 f0Var = (com.amazon.aps.iva.ve0.f0) t4;
        if (this.l.b()) {
            f = 0.0f;
        }
        Float valueOf = Float.valueOf(f);
        f1 f1Var = f1.h;
        f1 f1Var2 = this.m;
        com.amazon.aps.iva.o0.x0.e(new Object[]{view, cVar, valueOf, f1Var2, Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(f1Var2, f1Var))}, new w0(this.l, this.m, view, cVar, this.j, f0Var, h04, p3Var2, p3Var, h02, q1Var, h03, null), iVar2);
        iVar2.s(1157296644);
        boolean H = iVar2.H(q1Var);
        Object t5 = iVar2.t();
        if (H || t5 == obj) {
            t5 = new x0(q1Var);
            iVar2.n(t5);
        }
        iVar2.G();
        com.amazon.aps.iva.a1.f a = androidx.compose.ui.draw.a.a(androidx.compose.ui.layout.c.a(fVar2, (com.amazon.aps.iva.xb0.l) t5), new y0(f0Var));
        iVar2.s(1157296644);
        boolean H2 = iVar2.H(p3Var);
        Object t6 = iVar2.t();
        if (H2 || t6 == obj) {
            t6 = new a1(p3Var);
            iVar2.n(t6);
        }
        iVar2.G();
        com.amazon.aps.iva.a1.f a2 = com.amazon.aps.iva.a2.o.a(a, false, (com.amazon.aps.iva.xb0.l) t6);
        iVar2.G();
        return a2;
    }
}
