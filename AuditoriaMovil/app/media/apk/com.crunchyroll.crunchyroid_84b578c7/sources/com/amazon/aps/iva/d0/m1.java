package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class m1 extends f.c implements com.amazon.aps.iva.u1.x {
    public com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.o2.c, com.amazon.aps.iva.o2.h> o;
    public boolean p;

    /* compiled from: Offset.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.s1.f0 i;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.u0 u0Var) {
            super(1);
            this.i = f0Var;
            this.j = u0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            m1 m1Var = m1.this;
            long j = m1Var.o.invoke(this.i).a;
            if (m1Var.p) {
                int b = com.amazon.aps.iva.o2.h.b(j);
                u0.a.h(aVar2, this.j, (int) (j >> 32), b);
            } else {
                u0.a.i(aVar2, this.j, (int) (j >> 32), com.amazon.aps.iva.o2.h.b(j), null, 12);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public m1(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.o2.c, com.amazon.aps.iva.o2.h> lVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(lVar, "offset");
        this.o = lVar;
        this.p = z;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        com.amazon.aps.iva.s1.u0 V = c0Var.V(j);
        return f0Var.F0(V.b, V.c, com.amazon.aps.iva.lb0.a0.b, new a(f0Var, V));
    }
}
