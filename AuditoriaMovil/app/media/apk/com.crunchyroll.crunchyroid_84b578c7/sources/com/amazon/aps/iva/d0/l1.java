package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class l1 extends f.c implements com.amazon.aps.iva.u1.x {
    public float o;
    public float p;
    public boolean q;

    /* compiled from: Offset.kt */
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
            l1 l1Var = l1.this;
            boolean z = l1Var.q;
            com.amazon.aps.iva.s1.u0 u0Var = this.i;
            com.amazon.aps.iva.s1.f0 f0Var = this.j;
            if (z) {
                u0.a.g(aVar2, u0Var, f0Var.f0(l1Var.o), f0Var.f0(l1Var.p));
            } else {
                u0.a.c(u0Var, f0Var.f0(l1Var.o), f0Var.f0(l1Var.p), 0.0f);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public l1(float f, float f2, boolean z) {
        this.o = f;
        this.p = f2;
        this.q = z;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.s1.u0 V = c0Var.V(j);
        return f0Var.F0(V.b, V.c, com.amazon.aps.iva.lb0.a0.b, new a(V, f0Var));
    }
}
