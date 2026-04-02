package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: Padding.kt */
/* loaded from: classes.dex */
public final class n1 extends f.c implements com.amazon.aps.iva.u1.x {
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    /* compiled from: Padding.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 i;
        public final /* synthetic */ com.amazon.aps.iva.s1.f0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.s1.u0 u0Var, com.amazon.aps.iva.s1.f0 f0Var) {
            super(1);
            this.i = u0Var;
            this.j = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            n1 n1Var = n1.this;
            boolean z = n1Var.s;
            com.amazon.aps.iva.s1.u0 u0Var = this.i;
            com.amazon.aps.iva.s1.f0 f0Var = this.j;
            if (z) {
                u0.a.g(aVar2, u0Var, f0Var.f0(n1Var.o), f0Var.f0(n1Var.p));
            } else {
                u0.a.c(u0Var, f0Var.f0(n1Var.o), f0Var.f0(n1Var.p), 0.0f);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public n1(float f, float f2, float f3, float f4, boolean z) {
        this.o = f;
        this.p = f2;
        this.q = f3;
        this.r = f4;
        this.s = z;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        int f0 = f0Var.f0(this.q) + f0Var.f0(this.o);
        int f02 = f0Var.f0(this.r) + f0Var.f0(this.p);
        com.amazon.aps.iva.s1.u0 V = c0Var.V(com.amazon.aps.iva.o2.b.h(-f0, j, -f02));
        return f0Var.F0(com.amazon.aps.iva.o2.b.f(V.b + f0, j), com.amazon.aps.iva.o2.b.e(V.c + f02, j), com.amazon.aps.iva.lb0.a0.b, new a(V, f0Var));
    }
}
