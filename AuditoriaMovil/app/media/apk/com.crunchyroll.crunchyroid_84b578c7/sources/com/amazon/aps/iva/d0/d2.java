package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class d2 extends f.c implements com.amazon.aps.iva.u1.x {
    public float o;
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

    public d2(float f, float f2) {
        this.o = f;
        this.p = f2;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int b(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        int i2;
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        int M = lVar.M(i);
        if (!com.amazon.aps.iva.o2.e.a(this.o, Float.NaN)) {
            i2 = mVar.f0(this.o);
        } else {
            i2 = 0;
        }
        if (M < i2) {
            return i2;
        }
        return M;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int c(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        int i2;
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        int d = lVar.d(i);
        if (!com.amazon.aps.iva.o2.e.a(this.p, Float.NaN)) {
            i2 = mVar.f0(this.p);
        } else {
            i2 = 0;
        }
        if (d < i2) {
            return i2;
        }
        return d;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int d(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        int i2;
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        int C = lVar.C(i);
        if (!com.amazon.aps.iva.o2.e.a(this.p, Float.NaN)) {
            i2 = mVar.f0(this.p);
        } else {
            i2 = 0;
        }
        if (C < i2) {
            return i2;
        }
        return C;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int e(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        int i2;
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        int P = lVar.P(i);
        if (!com.amazon.aps.iva.o2.e.a(this.o, Float.NaN)) {
            i2 = mVar.f0(this.o);
        } else {
            i2 = 0;
        }
        if (P < i2) {
            return i2;
        }
        return P;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        int j2;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        int i = 0;
        if (!com.amazon.aps.iva.o2.e.a(this.o, Float.NaN) && com.amazon.aps.iva.o2.a.j(j) == 0) {
            j2 = f0Var.f0(this.o);
            int h = com.amazon.aps.iva.o2.a.h(j);
            if (j2 > h) {
                j2 = h;
            }
            if (j2 < 0) {
                j2 = 0;
            }
        } else {
            j2 = com.amazon.aps.iva.o2.a.j(j);
        }
        int h2 = com.amazon.aps.iva.o2.a.h(j);
        if (!com.amazon.aps.iva.o2.e.a(this.p, Float.NaN) && com.amazon.aps.iva.o2.a.i(j) == 0) {
            int f0 = f0Var.f0(this.p);
            int g = com.amazon.aps.iva.o2.a.g(j);
            if (f0 > g) {
                f0 = g;
            }
            if (f0 >= 0) {
                i = f0;
            }
        } else {
            i = com.amazon.aps.iva.o2.a.i(j);
        }
        com.amazon.aps.iva.s1.u0 V = c0Var.V(com.amazon.aps.iva.o2.b.a(j2, h2, i, com.amazon.aps.iva.o2.a.g(j)));
        return f0Var.F0(V.b, V.c, com.amazon.aps.iva.lb0.a0.b, new a(V));
    }
}
