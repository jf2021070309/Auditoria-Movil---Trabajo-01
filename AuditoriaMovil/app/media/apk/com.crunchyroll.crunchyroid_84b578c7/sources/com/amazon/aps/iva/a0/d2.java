package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: Scroll.kt */
/* loaded from: classes.dex */
public final class d2 extends f.c implements com.amazon.aps.iva.u1.x {
    public c2 o;
    public boolean p;
    public boolean q;

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int i;
        public final /* synthetic */ com.amazon.aps.iva.s1.u0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, com.amazon.aps.iva.s1.u0 u0Var) {
            super(1);
            this.i = i;
            this.j = u0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            int i;
            int i2;
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            d2 d2Var = d2.this;
            int a = d2Var.o.a();
            int i3 = 0;
            int i4 = this.i;
            int j = com.amazon.aps.iva.aq.j.j(a, 0, i4);
            if (d2Var.p) {
                i = j - i4;
            } else {
                i = -j;
            }
            boolean z = d2Var.q;
            if (z) {
                i2 = 0;
            } else {
                i2 = i;
            }
            if (z) {
                i3 = i;
            }
            u0.a.h(aVar2, this.j, i2, i3);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public d2(c2 c2Var, boolean z, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(c2Var, "scrollerState");
        this.o = c2Var;
        this.p = z;
        this.q = z2;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int b(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (this.q) {
            return lVar.M(Integer.MAX_VALUE);
        }
        return lVar.M(i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int c(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (this.q) {
            return lVar.d(i);
        }
        return lVar.d(Integer.MAX_VALUE);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int d(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (this.q) {
            return lVar.C(i);
        }
        return lVar.C(Integer.MAX_VALUE);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int e(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (this.q) {
            return lVar.P(Integer.MAX_VALUE);
        }
        return lVar.P(i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        com.amazon.aps.iva.b0.f0 f0Var2;
        int g;
        int i;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        if (this.q) {
            f0Var2 = com.amazon.aps.iva.b0.f0.Vertical;
        } else {
            f0Var2 = com.amazon.aps.iva.b0.f0.Horizontal;
        }
        com.amazon.aps.iva.ab.x.y(j, f0Var2);
        int i2 = Integer.MAX_VALUE;
        if (this.q) {
            g = Integer.MAX_VALUE;
        } else {
            g = com.amazon.aps.iva.o2.a.g(j);
        }
        if (this.q) {
            i2 = com.amazon.aps.iva.o2.a.h(j);
        }
        com.amazon.aps.iva.s1.u0 V = c0Var.V(com.amazon.aps.iva.o2.a.a(j, 0, i2, 0, g, 5));
        int i3 = V.b;
        int h = com.amazon.aps.iva.o2.a.h(j);
        if (i3 > h) {
            i3 = h;
        }
        int i4 = V.c;
        int g2 = com.amazon.aps.iva.o2.a.g(j);
        if (i4 > g2) {
            i4 = g2;
        }
        int i5 = V.c - i4;
        int i6 = V.b - i3;
        if (!this.q) {
            i5 = i6;
        }
        c2 c2Var = this.o;
        c2Var.d.e(i5);
        if (c2Var.a() > i5) {
            c2Var.a.e(i5);
        }
        c2 c2Var2 = this.o;
        if (this.q) {
            i = i4;
        } else {
            i = i3;
        }
        c2Var2.b.e(i);
        return f0Var.F0(i3, i4, com.amazon.aps.iva.lb0.a0.b, new a(i5, V));
    }
}
