package com.amazon.aps.iva.y;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.z.a1;
import com.amazon.aps.iva.z.m1;
import com.amazon.aps.iva.z.n1;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class q0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ com.amazon.aps.iva.z.a1<f0> h;
    public final /* synthetic */ p3<f1> i;
    public final /* synthetic */ p3<f1> j;
    public final /* synthetic */ String k = "Built-in";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.amazon.aps.iva.z.a1 a1Var, q1 q1Var, q1 q1Var2) {
        super(3);
        this.h = a1Var;
        this.i = q1Var;
        this.j = q1Var2;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.a1.f fVar2 = fVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        t1.c(num, fVar2, "$this$composed", iVar2, 158379472);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar2.s(1157296644);
        com.amazon.aps.iva.z.a1<f0> a1Var = this.h;
        boolean H = iVar2.H(a1Var);
        Object t = iVar2.t();
        i.a.C0550a c0550a = i.a.a;
        if (H || t == c0550a) {
            t = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
            iVar2.n(t);
        }
        iVar2.G();
        q1 q1Var = (q1) t;
        f0 b = a1Var.b();
        f0 d = a1Var.d();
        p3<f1> p3Var = this.j;
        p3<f1> p3Var2 = this.i;
        if (b == d && !a1Var.e()) {
            q1Var.setValue(Boolean.FALSE);
        } else if (p3Var2.getValue() != null || p3Var.getValue() != null) {
            q1Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) q1Var.getValue()).booleanValue()) {
            int i = com.amazon.aps.iva.o2.h.c;
            m1 m1Var = n1.g;
            iVar2.s(-492369756);
            Object t2 = iVar2.t();
            if (t2 == c0550a) {
                t2 = this.k + " slide";
                iVar2.n(t2);
            }
            iVar2.G();
            a1.a a = com.amazon.aps.iva.z.j1.a(a1Var, m1Var, (String) t2, iVar2, 0);
            iVar2.s(1157296644);
            boolean H2 = iVar2.H(a1Var);
            Object t3 = iVar2.t();
            if (H2 || t3 == c0550a) {
                t3 = new g1(a, p3Var2, p3Var);
                iVar2.n(t3);
            }
            iVar2.G();
            fVar2 = fVar2.o((g1) t3);
        }
        iVar2.G();
        return fVar2;
    }
}
