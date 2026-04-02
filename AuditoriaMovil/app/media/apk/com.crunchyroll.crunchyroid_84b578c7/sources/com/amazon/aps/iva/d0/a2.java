package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class a2 extends f.c implements com.amazon.aps.iva.u1.x {
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

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

    public a2(float f, float f2, float f3, float f4, boolean z) {
        this.o = f;
        this.p = f2;
        this.q = f3;
        this.r = f4;
        this.s = z;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int b(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        long t1 = t1(mVar);
        if (com.amazon.aps.iva.o2.a.f(t1)) {
            return com.amazon.aps.iva.o2.a.h(t1);
        }
        return com.amazon.aps.iva.o2.b.f(lVar.M(i), t1);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int c(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        long t1 = t1(mVar);
        if (com.amazon.aps.iva.o2.a.e(t1)) {
            return com.amazon.aps.iva.o2.a.g(t1);
        }
        return com.amazon.aps.iva.o2.b.e(lVar.d(i), t1);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int d(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        long t1 = t1(mVar);
        if (com.amazon.aps.iva.o2.a.e(t1)) {
            return com.amazon.aps.iva.o2.a.g(t1);
        }
        return com.amazon.aps.iva.o2.b.e(lVar.C(i), t1);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int e(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        long t1 = t1(mVar);
        if (com.amazon.aps.iva.o2.a.f(t1)) {
            return com.amazon.aps.iva.o2.a.h(t1);
        }
        return com.amazon.aps.iva.o2.b.f(lVar.P(i), t1);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 f0Var, com.amazon.aps.iva.s1.c0 c0Var, long j) {
        int j2;
        int h;
        int i;
        int g;
        long a2;
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        long t1 = t1(f0Var);
        if (this.s) {
            a2 = com.amazon.aps.iva.o2.b.d(j, t1);
        } else {
            if (!com.amazon.aps.iva.o2.e.a(this.o, Float.NaN)) {
                j2 = com.amazon.aps.iva.o2.a.j(t1);
            } else {
                j2 = com.amazon.aps.iva.o2.a.j(j);
                int h2 = com.amazon.aps.iva.o2.a.h(t1);
                if (j2 > h2) {
                    j2 = h2;
                }
            }
            if (!com.amazon.aps.iva.o2.e.a(this.q, Float.NaN)) {
                h = com.amazon.aps.iva.o2.a.h(t1);
            } else {
                h = com.amazon.aps.iva.o2.a.h(j);
                int j3 = com.amazon.aps.iva.o2.a.j(t1);
                if (h < j3) {
                    h = j3;
                }
            }
            if (!com.amazon.aps.iva.o2.e.a(this.p, Float.NaN)) {
                i = com.amazon.aps.iva.o2.a.i(t1);
            } else {
                i = com.amazon.aps.iva.o2.a.i(j);
                int g2 = com.amazon.aps.iva.o2.a.g(t1);
                if (i > g2) {
                    i = g2;
                }
            }
            if (!com.amazon.aps.iva.o2.e.a(this.r, Float.NaN)) {
                g = com.amazon.aps.iva.o2.a.g(t1);
            } else {
                g = com.amazon.aps.iva.o2.a.g(j);
                int i2 = com.amazon.aps.iva.o2.a.i(t1);
                if (g < i2) {
                    g = i2;
                }
            }
            a2 = com.amazon.aps.iva.o2.b.a(j2, h, i, g);
        }
        com.amazon.aps.iva.s1.u0 V = c0Var.V(a2);
        return f0Var.F0(V.b, V.c, com.amazon.aps.iva.lb0.a0.b, new a(V));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r5 != Integer.MAX_VALUE) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long t1(com.amazon.aps.iva.o2.c r8) {
        /*
            r7 = this;
            float r0 = r7.q
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = com.amazon.aps.iva.o2.e.a(r0, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L18
            float r0 = r7.q
            int r0 = r8.f0(r0)
            if (r0 >= 0) goto L19
            r0 = r3
            goto L19
        L18:
            r0 = r2
        L19:
            float r4 = r7.r
            boolean r4 = com.amazon.aps.iva.o2.e.a(r4, r1)
            if (r4 != 0) goto L2b
            float r4 = r7.r
            int r4 = r8.f0(r4)
            if (r4 >= 0) goto L2c
            r4 = r3
            goto L2c
        L2b:
            r4 = r2
        L2c:
            float r5 = r7.o
            boolean r5 = com.amazon.aps.iva.o2.e.a(r5, r1)
            if (r5 != 0) goto L43
            float r5 = r7.o
            int r5 = r8.f0(r5)
            if (r5 <= r0) goto L3d
            r5 = r0
        L3d:
            if (r5 >= 0) goto L40
            r5 = r3
        L40:
            if (r5 == r2) goto L43
            goto L44
        L43:
            r5 = r3
        L44:
            float r6 = r7.p
            boolean r1 = com.amazon.aps.iva.o2.e.a(r6, r1)
            if (r1 != 0) goto L5b
            float r1 = r7.p
            int r8 = r8.f0(r1)
            if (r8 <= r4) goto L55
            r8 = r4
        L55:
            if (r8 >= 0) goto L58
            r8 = r3
        L58:
            if (r8 == r2) goto L5b
            r3 = r8
        L5b:
            long r0 = com.amazon.aps.iva.o2.b.a(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d0.a2.t1(com.amazon.aps.iva.o2.c):long");
    }
}
