package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: Padding.kt */
/* loaded from: classes.dex */
public final class q1 extends f.c implements com.amazon.aps.iva.u1.x {
    public o1 o;

    /* compiled from: Padding.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 h;
        public final /* synthetic */ com.amazon.aps.iva.s1.f0 i;
        public final /* synthetic */ q1 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.s1.u0 u0Var, com.amazon.aps.iva.s1.f0 f0Var, q1 q1Var) {
            super(1);
            this.h = u0Var;
            this.i = f0Var;
            this.j = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            q1 q1Var = this.j;
            o1 o1Var = q1Var.o;
            com.amazon.aps.iva.s1.f0 f0Var = this.i;
            u0.a.c(this.h, f0Var.f0(o1Var.b(f0Var.getLayoutDirection())), f0Var.f0(q1Var.o.d()), 0.0f);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public q1(o1 o1Var) {
        com.amazon.aps.iva.yb0.j.f(o1Var, "paddingValues");
        this.o = o1Var;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        boolean z = false;
        float f = 0;
        if (Float.compare(this.o.b(f0Var.getLayoutDirection()), f) >= 0 && Float.compare(this.o.d(), f) >= 0 && Float.compare(this.o.c(f0Var.getLayoutDirection()), f) >= 0 && Float.compare(this.o.a(), f) >= 0) {
            z = true;
        }
        if (z) {
            int f0 = f0Var.f0(this.o.c(f0Var.getLayoutDirection())) + f0Var.f0(this.o.b(f0Var.getLayoutDirection()));
            int f02 = f0Var.f0(this.o.a()) + f0Var.f0(this.o.d());
            com.amazon.aps.iva.s1.u0 V = c0Var.V(com.amazon.aps.iva.o2.b.h(-f0, j, -f02));
            return f0Var.F0(com.amazon.aps.iva.o2.b.f(V.b + f0, j), com.amazon.aps.iva.o2.b.e(V.c + f02, j), com.amazon.aps.iva.lb0.a0.b, new a(V, f0Var, this));
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }
}
