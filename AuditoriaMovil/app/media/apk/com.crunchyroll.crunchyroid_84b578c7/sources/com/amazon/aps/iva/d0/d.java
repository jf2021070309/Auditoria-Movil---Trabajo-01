package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.s1.u0;
/* compiled from: AspectRatio.kt */
/* loaded from: classes.dex */
public final class d extends f.c implements com.amazon.aps.iva.u1.x {
    public float o;
    public boolean p;

    /* compiled from: AspectRatio.kt */
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

    public d(float f, boolean z) {
        this.o = f;
        this.p = z;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int b(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (i != Integer.MAX_VALUE) {
            return com.amazon.aps.iva.ob0.f.a(i * this.o);
        }
        return lVar.M(i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int c(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (i != Integer.MAX_VALUE) {
            return com.amazon.aps.iva.ob0.f.a(i / this.o);
        }
        return lVar.d(i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int d(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (i != Integer.MAX_VALUE) {
            return com.amazon.aps.iva.ob0.f.a(i / this.o);
        }
        return lVar.C(i);
    }

    @Override // com.amazon.aps.iva.u1.x
    public final int e(com.amazon.aps.iva.s1.m mVar, com.amazon.aps.iva.s1.l lVar, int i) {
        com.amazon.aps.iva.yb0.j.f(mVar, "<this>");
        if (i != Integer.MAX_VALUE) {
            return com.amazon.aps.iva.ob0.f.a(i * this.o);
        }
        return lVar.P(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (com.amazon.aps.iva.o2.j.a(r5, 0) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
        if (com.amazon.aps.iva.o2.j.a(r5, 0) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
        r5 = 0;
     */
    @Override // com.amazon.aps.iva.u1.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.s1.e0 f(com.amazon.aps.iva.s1.f0 r8, com.amazon.aps.iva.s1.c0 r9, long r10) {
        /*
            r7 = this;
            java.lang.String r0 = "$this$measure"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            boolean r0 = r7.p
            r1 = 0
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L6c
            long r5 = r7.u1(r10, r4)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto L19
            goto Lc5
        L19:
            long r5 = r7.t1(r10, r4)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto L25
            goto Lc5
        L25:
            long r5 = r7.w1(r10, r4)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto L31
            goto Lc5
        L31:
            long r5 = r7.v1(r10, r4)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto L3d
            goto Lc5
        L3d:
            long r5 = r7.u1(r10, r3)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto L49
            goto Lc5
        L49:
            long r5 = r7.t1(r10, r3)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto L55
            goto Lc5
        L55:
            long r5 = r7.w1(r10, r3)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto L61
            goto Lc5
        L61:
            long r5 = r7.v1(r10, r3)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto Lc4
            goto Lc5
        L6c:
            long r5 = r7.t1(r10, r4)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto L77
            goto Lc5
        L77:
            long r5 = r7.u1(r10, r4)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto L82
            goto Lc5
        L82:
            long r5 = r7.v1(r10, r4)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto L8d
            goto Lc5
        L8d:
            long r5 = r7.w1(r10, r4)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto L98
            goto Lc5
        L98:
            long r5 = r7.t1(r10, r3)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto La3
            goto Lc5
        La3:
            long r5 = r7.u1(r10, r3)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto Lae
            goto Lc5
        Lae:
            long r5 = r7.v1(r10, r3)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto Lb9
            goto Lc5
        Lb9:
            long r5 = r7.w1(r10, r3)
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto Lc4
            goto Lc5
        Lc4:
            r5 = r1
        Lc5:
            boolean r0 = com.amazon.aps.iva.o2.j.a(r5, r1)
            if (r0 != 0) goto Ld8
            r10 = 32
            long r10 = r5 >> r10
            int r10 = (int) r10
            int r11 = com.amazon.aps.iva.o2.j.b(r5)
            long r10 = com.amazon.aps.iva.o2.a.C0554a.c(r10, r11)
        Ld8:
            com.amazon.aps.iva.s1.u0 r9 = r9.V(r10)
            int r10 = r9.b
            int r11 = r9.c
            com.amazon.aps.iva.d0.d$a r0 = new com.amazon.aps.iva.d0.d$a
            r0.<init>(r9)
            com.amazon.aps.iva.lb0.a0 r9 = com.amazon.aps.iva.lb0.a0.b
            com.amazon.aps.iva.s1.e0 r8 = r8.F0(r10, r11, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d0.d.f(com.amazon.aps.iva.s1.f0, com.amazon.aps.iva.s1.c0, long):com.amazon.aps.iva.s1.e0");
    }

    public final long t1(long j, boolean z) {
        int a2;
        int g = com.amazon.aps.iva.o2.a.g(j);
        if (g != Integer.MAX_VALUE && (a2 = com.amazon.aps.iva.ob0.f.a(g * this.o)) > 0) {
            long a3 = com.amazon.aps.iva.o2.k.a(a2, g);
            if (!z || com.amazon.aps.iva.o2.b.g(j, a3)) {
                return a3;
            }
            return 0L;
        }
        return 0L;
    }

    public final long u1(long j, boolean z) {
        int a2;
        int h = com.amazon.aps.iva.o2.a.h(j);
        if (h != Integer.MAX_VALUE && (a2 = com.amazon.aps.iva.ob0.f.a(h / this.o)) > 0) {
            long a3 = com.amazon.aps.iva.o2.k.a(h, a2);
            if (!z || com.amazon.aps.iva.o2.b.g(j, a3)) {
                return a3;
            }
            return 0L;
        }
        return 0L;
    }

    public final long v1(long j, boolean z) {
        int i = com.amazon.aps.iva.o2.a.i(j);
        int a2 = com.amazon.aps.iva.ob0.f.a(i * this.o);
        if (a2 > 0) {
            long a3 = com.amazon.aps.iva.o2.k.a(a2, i);
            if (!z || com.amazon.aps.iva.o2.b.g(j, a3)) {
                return a3;
            }
            return 0L;
        }
        return 0L;
    }

    public final long w1(long j, boolean z) {
        int j2 = com.amazon.aps.iva.o2.a.j(j);
        int a2 = com.amazon.aps.iva.ob0.f.a(j2 / this.o);
        if (a2 > 0) {
            long a3 = com.amazon.aps.iva.o2.k.a(j2, a2);
            if (!z || com.amazon.aps.iva.o2.b.g(j, a3)) {
                return a3;
            }
            return 0L;
        }
        return 0L;
    }
}
