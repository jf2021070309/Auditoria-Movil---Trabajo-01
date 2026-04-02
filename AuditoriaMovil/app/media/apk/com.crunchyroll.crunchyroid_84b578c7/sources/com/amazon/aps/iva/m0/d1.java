package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.s1.u0;
/* compiled from: InteractiveComponentSize.kt */
/* loaded from: classes.dex */
public final class d1 implements com.amazon.aps.iva.s1.v {
    public final long c;

    /* compiled from: InteractiveComponentSize.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int h;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, com.amazon.aps.iva.s1.u0 u0Var, int i2) {
            super(1);
            this.h = i;
            this.i = u0Var;
            this.j = i2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            com.amazon.aps.iva.s1.u0 u0Var = this.i;
            u0.a.c(u0Var, com.amazon.aps.iva.ob0.f.a((this.h - u0Var.b) / 2.0f), com.amazon.aps.iva.ob0.f.a((this.j - u0Var.c) / 2.0f), 0.0f);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public d1(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        d1 d1Var;
        if (obj instanceof d1) {
            d1Var = (d1) obj;
        } else {
            d1Var = null;
        }
        if (d1Var == null) {
            return false;
        }
        return com.amazon.aps.iva.o2.g.a(this.c, d1Var.c);
    }

    @Override // com.amazon.aps.iva.s1.v
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.s1.u0 V = c0Var.V(j);
        int i = V.b;
        long j2 = this.c;
        int max = Math.max(i, f0Var.f0(com.amazon.aps.iva.o2.g.c(j2)));
        int max2 = Math.max(V.c, f0Var.f0(com.amazon.aps.iva.o2.g.b(j2)));
        return f0Var.F0(max, max2, com.amazon.aps.iva.lb0.a0.b, new a(max, V, max2));
    }

    public final int hashCode() {
        int i = com.amazon.aps.iva.o2.g.d;
        return Long.hashCode(this.c);
    }
}
