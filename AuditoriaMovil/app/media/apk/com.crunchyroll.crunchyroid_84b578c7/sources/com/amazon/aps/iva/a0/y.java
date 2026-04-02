package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.p3;
/* compiled from: Indication.kt */
/* loaded from: classes.dex */
public final class y implements q0 {
    public static final y a = new y();

    /* compiled from: Indication.kt */
    /* loaded from: classes.dex */
    public static final class a implements r0 {
        public final p3<Boolean> b;
        public final p3<Boolean> c;
        public final p3<Boolean> d;

        public a(com.amazon.aps.iva.o0.q1 q1Var, com.amazon.aps.iva.o0.q1 q1Var2, com.amazon.aps.iva.o0.q1 q1Var3) {
            com.amazon.aps.iva.yb0.j.f(q1Var, "isPressed");
            com.amazon.aps.iva.yb0.j.f(q1Var2, "isHovered");
            com.amazon.aps.iva.yb0.j.f(q1Var3, "isFocused");
            this.b = q1Var;
            this.c = q1Var2;
            this.d = q1Var3;
        }

        @Override // com.amazon.aps.iva.a0.r0
        public final void a(com.amazon.aps.iva.h1.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
            cVar.f1();
            if (this.b.getValue().booleanValue()) {
                com.amazon.aps.iva.h1.e.H(cVar, com.amazon.aps.iva.f1.x.b(com.amazon.aps.iva.f1.x.b, 0.3f), 0L, cVar.h(), 0.0f, null, 122);
            } else if (this.c.getValue().booleanValue() || this.d.getValue().booleanValue()) {
                com.amazon.aps.iva.h1.e.H(cVar, com.amazon.aps.iva.f1.x.b(com.amazon.aps.iva.f1.x.b, 0.1f), 0L, cVar.h(), 0.0f, null, 122);
            }
        }
    }

    @Override // com.amazon.aps.iva.a0.q0
    public final r0 a(com.amazon.aps.iva.c0.k kVar, com.amazon.aps.iva.o0.i iVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "interactionSource");
        iVar.s(1683566979);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.s(-1692965168);
        iVar.s(-492369756);
        Object t = iVar.t();
        Object obj = i.a.a;
        if (t == obj) {
            t = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
            iVar.n(t);
        }
        iVar.G();
        com.amazon.aps.iva.o0.q1 q1Var = (com.amazon.aps.iva.o0.q1) t;
        iVar.s(511388516);
        boolean H = iVar.H(kVar) | iVar.H(q1Var);
        Object t2 = iVar.t();
        if (H || t2 == obj) {
            t2 = new com.amazon.aps.iva.c0.q(kVar, q1Var, null);
            iVar.n(t2);
        }
        iVar.G();
        com.amazon.aps.iva.o0.x0.c(kVar, (com.amazon.aps.iva.xb0.p) t2, iVar);
        iVar.G();
        iVar.s(1206586544);
        iVar.s(-492369756);
        Object t3 = iVar.t();
        if (t3 == obj) {
            t3 = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
            iVar.n(t3);
        }
        iVar.G();
        com.amazon.aps.iva.o0.q1 q1Var2 = (com.amazon.aps.iva.o0.q1) t3;
        iVar.s(511388516);
        boolean H2 = iVar.H(kVar) | iVar.H(q1Var2);
        Object t4 = iVar.t();
        if (H2 || t4 == obj) {
            t4 = new com.amazon.aps.iva.c0.i(kVar, q1Var2, null);
            iVar.n(t4);
        }
        iVar.G();
        com.amazon.aps.iva.o0.x0.c(kVar, (com.amazon.aps.iva.xb0.p) t4, iVar);
        iVar.G();
        com.amazon.aps.iva.o0.q1 m = com.amazon.aps.iva.aq.j.m(kVar, iVar, 0);
        iVar.s(1157296644);
        boolean H3 = iVar.H(kVar);
        Object t5 = iVar.t();
        if (H3 || t5 == obj) {
            t5 = new a(q1Var, q1Var2, m);
            iVar.n(t5);
        }
        iVar.G();
        a aVar = (a) t5;
        iVar.G();
        return aVar;
    }
}
