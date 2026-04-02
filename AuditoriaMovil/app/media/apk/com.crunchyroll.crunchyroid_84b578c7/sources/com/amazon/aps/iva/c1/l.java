package com.amazon.aps.iva.c1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.s1.c0;
import com.amazon.aps.iva.s1.e0;
import com.amazon.aps.iva.s1.f0;
import com.amazon.aps.iva.s1.u0;
import com.amazon.aps.iva.u1.o;
import com.amazon.aps.iva.u1.x;
/* compiled from: PainterModifier.kt */
/* loaded from: classes.dex */
public final class l extends f.c implements x, o {
    public com.amazon.aps.iva.i1.c o;
    public boolean p;
    public com.amazon.aps.iva.a1.a q;
    public com.amazon.aps.iva.s1.f r;
    public float s;
    public y t;

    /* compiled from: PainterModifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, q> {
        public final /* synthetic */ u0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0 u0Var) {
            super(1);
            this.h = u0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(u0.a aVar) {
            u0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$layout");
            u0.a.g(aVar2, this.h, 0, 0);
            return q.a;
        }
    }

    public l(com.amazon.aps.iva.i1.c cVar, boolean z, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.s1.f fVar, float f, y yVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "painter");
        com.amazon.aps.iva.yb0.j.f(aVar, "alignment");
        com.amazon.aps.iva.yb0.j.f(fVar, "contentScale");
        this.o = cVar;
        this.p = z;
        this.q = aVar;
        this.r = fVar;
        this.s = f;
        this.t = yVar;
    }

    public static boolean u1(long j) {
        boolean z;
        if (com.amazon.aps.iva.e1.g.a(j, com.amazon.aps.iva.e1.g.c)) {
            return false;
        }
        float b = com.amazon.aps.iva.e1.g.b(j);
        if (!Float.isInfinite(b) && !Float.isNaN(b)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public static boolean v1(long j) {
        boolean z;
        if (com.amazon.aps.iva.e1.g.a(j, com.amazon.aps.iva.e1.g.c)) {
            return false;
        }
        float d = com.amazon.aps.iva.e1.g.d(j);
        if (!Float.isInfinite(d) && !Float.isNaN(d)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int b(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (t1()) {
            long w1 = w1(com.amazon.aps.iva.o2.b.b(0, i, 7));
            return Math.max(com.amazon.aps.iva.o2.a.j(w1), lVar.M(i));
        }
        return lVar.M(i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int c(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (t1()) {
            long w1 = w1(com.amazon.aps.iva.o2.b.b(i, 0, 13));
            return Math.max(com.amazon.aps.iva.o2.a.i(w1), lVar.d(i));
        }
        return lVar.d(i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int d(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (t1()) {
            long w1 = w1(com.amazon.aps.iva.o2.b.b(i, 0, 13));
            return Math.max(com.amazon.aps.iva.o2.a.i(w1), lVar.C(i));
        }
        return lVar.C(i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int e(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (t1()) {
            long w1 = w1(com.amazon.aps.iva.o2.b.b(0, i, 7));
            return Math.max(com.amazon.aps.iva.o2.a.j(w1), lVar.P(i));
        }
        return lVar.P(i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final e0 f(f0 f0Var, c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        u0 V = c0Var.V(w1(j));
        return f0Var.F0(V.b, V.c, a0.b, new a(V));
    }

    public final boolean t1() {
        boolean z;
        if (!this.p) {
            return false;
        }
        long mo16getIntrinsicSizeNHjbRc = this.o.mo16getIntrinsicSizeNHjbRc();
        int i = com.amazon.aps.iva.e1.g.d;
        if (mo16getIntrinsicSizeNHjbRc != com.amazon.aps.iva.e1.g.c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.o + ", sizeToIntrinsics=" + this.p + ", alignment=" + this.q + ", alpha=" + this.s + ", colorFilter=" + this.t + ')';
    }

    @Override // com.amazon.aps.iva.u1.o
    public final void w(com.amazon.aps.iva.h1.c cVar) {
        float d;
        float b;
        boolean z;
        long j;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        long mo16getIntrinsicSizeNHjbRc = this.o.mo16getIntrinsicSizeNHjbRc();
        if (v1(mo16getIntrinsicSizeNHjbRc)) {
            d = com.amazon.aps.iva.e1.g.d(mo16getIntrinsicSizeNHjbRc);
        } else {
            d = com.amazon.aps.iva.e1.g.d(cVar.h());
        }
        if (u1(mo16getIntrinsicSizeNHjbRc)) {
            b = com.amazon.aps.iva.e1.g.b(mo16getIntrinsicSizeNHjbRc);
        } else {
            b = com.amazon.aps.iva.e1.g.b(cVar.h());
        }
        long d2 = r.d(d, b);
        boolean z2 = true;
        if (com.amazon.aps.iva.e1.g.d(cVar.h()) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (com.amazon.aps.iva.e1.g.b(cVar.h()) != 0.0f) {
                z2 = false;
            }
            if (!z2) {
                j = r.o(d2, this.r.a(d2, cVar.h()));
                long j2 = j;
                long a2 = this.q.a(com.amazon.aps.iva.o2.k.a(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.d(j2)), com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.b(j2))), com.amazon.aps.iva.o2.k.a(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.d(cVar.h())), com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.b(cVar.h()))), cVar.getLayoutDirection());
                float f = (int) (a2 >> 32);
                float b2 = com.amazon.aps.iva.o2.h.b(a2);
                cVar.R0().a.g(f, b2);
                this.o.m18drawx_KDEd0(cVar, j2, this.s, this.t);
                cVar.R0().a.g(-f, -b2);
                cVar.f1();
            }
        }
        j = com.amazon.aps.iva.e1.g.b;
        long j22 = j;
        long a22 = this.q.a(com.amazon.aps.iva.o2.k.a(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.d(j22)), com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.b(j22))), com.amazon.aps.iva.o2.k.a(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.d(cVar.h())), com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.b(cVar.h()))), cVar.getLayoutDirection());
        float f2 = (int) (a22 >> 32);
        float b22 = com.amazon.aps.iva.o2.h.b(a22);
        cVar.R0().a.g(f2, b22);
        this.o.m18drawx_KDEd0(cVar, j22, this.s, this.t);
        cVar.R0().a.g(-f2, -b22);
        cVar.f1();
    }

    public final long w1(long j) {
        boolean z;
        boolean z2;
        int j2;
        int i;
        float d;
        float b;
        boolean z3;
        boolean z4 = true;
        if (com.amazon.aps.iva.o2.a.d(j) && com.amazon.aps.iva.o2.a.c(j)) {
            z = true;
        } else {
            z = false;
        }
        if (com.amazon.aps.iva.o2.a.f(j) && com.amazon.aps.iva.o2.a.e(j)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!t1() && z) || z2) {
            return com.amazon.aps.iva.o2.a.a(j, com.amazon.aps.iva.o2.a.h(j), 0, com.amazon.aps.iva.o2.a.g(j), 0, 10);
        }
        long mo16getIntrinsicSizeNHjbRc = this.o.mo16getIntrinsicSizeNHjbRc();
        if (v1(mo16getIntrinsicSizeNHjbRc)) {
            j2 = com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.d(mo16getIntrinsicSizeNHjbRc));
        } else {
            j2 = com.amazon.aps.iva.o2.a.j(j);
        }
        if (u1(mo16getIntrinsicSizeNHjbRc)) {
            i = com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.b(mo16getIntrinsicSizeNHjbRc));
        } else {
            i = com.amazon.aps.iva.o2.a.i(j);
        }
        long d2 = r.d(com.amazon.aps.iva.o2.b.f(j2, j), com.amazon.aps.iva.o2.b.e(i, j));
        if (t1()) {
            if (!v1(this.o.mo16getIntrinsicSizeNHjbRc())) {
                d = com.amazon.aps.iva.e1.g.d(d2);
            } else {
                d = com.amazon.aps.iva.e1.g.d(this.o.mo16getIntrinsicSizeNHjbRc());
            }
            if (!u1(this.o.mo16getIntrinsicSizeNHjbRc())) {
                b = com.amazon.aps.iva.e1.g.b(d2);
            } else {
                b = com.amazon.aps.iva.e1.g.b(this.o.mo16getIntrinsicSizeNHjbRc());
            }
            long d3 = r.d(d, b);
            if (com.amazon.aps.iva.e1.g.d(d2) == 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                if (com.amazon.aps.iva.e1.g.b(d2) != 0.0f) {
                    z4 = false;
                }
                if (!z4) {
                    d2 = r.o(d3, this.r.a(d3, d2));
                }
            }
            d2 = com.amazon.aps.iva.e1.g.b;
        }
        return com.amazon.aps.iva.o2.a.a(j, com.amazon.aps.iva.o2.b.f(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.d(d2)), j), 0, com.amazon.aps.iva.o2.b.e(com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.b(d2)), j), 0, 10);
    }
}
