package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class s extends f.c implements com.amazon.aps.iva.u1.x {
    public r o;
    public float p;

    /* compiled from: Size.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.s1.u0 u0Var) {
            super(1);
            this.h = u0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            u0.a.g(aVar2, this.h, 0, 0);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public s(r rVar, float f) {
        com.amazon.aps.iva.yb0.j.f(rVar, "direction");
        this.o = rVar;
        this.p = f;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        int j2;
        int h;
        int g;
        int i;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        if (com.amazon.aps.iva.o2.a.d(j) && this.o != r.Vertical) {
            j2 = com.amazon.aps.iva.aq.j.j(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.o2.a.h(j) * this.p), com.amazon.aps.iva.o2.a.j(j), com.amazon.aps.iva.o2.a.h(j));
            h = j2;
        } else {
            j2 = com.amazon.aps.iva.o2.a.j(j);
            h = com.amazon.aps.iva.o2.a.h(j);
        }
        if (com.amazon.aps.iva.o2.a.c(j) && this.o != r.Horizontal) {
            i = com.amazon.aps.iva.aq.j.j(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.o2.a.g(j) * this.p), com.amazon.aps.iva.o2.a.i(j), com.amazon.aps.iva.o2.a.g(j));
            g = i;
        } else {
            int i2 = com.amazon.aps.iva.o2.a.i(j);
            g = com.amazon.aps.iva.o2.a.g(j);
            i = i2;
        }
        com.amazon.aps.iva.s1.u0 V = c0Var.V(com.amazon.aps.iva.o2.b.a(j2, h, i, g));
        return f0Var.F0(V.b, V.c, com.amazon.aps.iva.lb0.a0.b, new a(V));
    }
}
