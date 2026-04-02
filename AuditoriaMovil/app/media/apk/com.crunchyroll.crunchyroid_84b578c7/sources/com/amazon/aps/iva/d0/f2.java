package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class f2 extends f.c implements com.amazon.aps.iva.u1.x {
    public r o;
    public boolean p;
    public com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o2.j, ? super com.amazon.aps.iva.o2.l, com.amazon.aps.iva.o2.h> q;

    /* compiled from: Size.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int i;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 j;
        public final /* synthetic */ int k;
        public final /* synthetic */ com.amazon.aps.iva.s1.f0 l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, com.amazon.aps.iva.s1.u0 u0Var, int i2, com.amazon.aps.iva.s1.f0 f0Var) {
            super(1);
            this.i = i;
            this.j = u0Var;
            this.k = i2;
            this.l = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o2.j, ? super com.amazon.aps.iva.o2.l, com.amazon.aps.iva.o2.h> pVar = f2.this.q;
            com.amazon.aps.iva.s1.u0 u0Var = this.j;
            u0.a.e(u0Var, pVar.invoke(new com.amazon.aps.iva.o2.j(com.amazon.aps.iva.o2.k.a(this.i - u0Var.b, this.k - u0Var.c)), this.l.getLayoutDirection()).a, 0.0f);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public f2(r rVar, boolean z, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o2.j, ? super com.amazon.aps.iva.o2.l, com.amazon.aps.iva.o2.h> pVar) {
        com.amazon.aps.iva.yb0.j.f(rVar, "direction");
        com.amazon.aps.iva.yb0.j.f(pVar, "alignmentCallback");
        this.o = rVar;
        this.p = z;
        this.q = pVar;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        int j2;
        int h;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        r rVar = this.o;
        r rVar2 = r.Vertical;
        int i = 0;
        if (rVar != rVar2) {
            j2 = 0;
        } else {
            j2 = com.amazon.aps.iva.o2.a.j(j);
        }
        r rVar3 = this.o;
        r rVar4 = r.Horizontal;
        if (rVar3 == rVar4) {
            i = com.amazon.aps.iva.o2.a.i(j);
        }
        int i2 = Integer.MAX_VALUE;
        if (this.o != rVar2 && this.p) {
            h = Integer.MAX_VALUE;
        } else {
            h = com.amazon.aps.iva.o2.a.h(j);
        }
        if (this.o == rVar4 || !this.p) {
            i2 = com.amazon.aps.iva.o2.a.g(j);
        }
        com.amazon.aps.iva.s1.u0 V = c0Var.V(com.amazon.aps.iva.o2.b.a(j2, h, i, i2));
        int j3 = com.amazon.aps.iva.aq.j.j(V.b, com.amazon.aps.iva.o2.a.j(j), com.amazon.aps.iva.o2.a.h(j));
        int j4 = com.amazon.aps.iva.aq.j.j(V.c, com.amazon.aps.iva.o2.a.i(j), com.amazon.aps.iva.o2.a.g(j));
        return f0Var.F0(j3, j4, com.amazon.aps.iva.lb0.a0.b, new a(j3, V, j4, f0Var));
    }
}
