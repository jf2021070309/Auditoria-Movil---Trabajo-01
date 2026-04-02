package com.amazon.aps.iva.o6;

import com.amazon.aps.iva.a6.s1;
import com.amazon.aps.iva.o6.e;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.q5.v;
import java.io.IOException;
/* compiled from: ClippingMediaPeriod.java */
/* loaded from: classes.dex */
public final class d implements u, u.a {
    public final u b;
    public u.a c;
    public a[] d = new a[0];
    public long e;
    public long f;
    public long g;
    public e.b h;

    /* compiled from: ClippingMediaPeriod.java */
    /* loaded from: classes.dex */
    public final class a implements h0 {
        public final h0 b;
        public boolean c;

        public a(h0 h0Var) {
            this.b = h0Var;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final void a() throws IOException {
            this.b.a();
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final boolean g() {
            if (!d.this.g() && this.b.g()) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final int m(com.amazon.aps.iva.u1.g0 g0Var, com.amazon.aps.iva.z5.f fVar, int i) {
            d dVar = d.this;
            if (dVar.g()) {
                return -3;
            }
            if (this.c) {
                fVar.b = 4;
                return -4;
            }
            long s = dVar.s();
            int m = this.b.m(g0Var, fVar, i);
            if (m == -5) {
                com.amazon.aps.iva.q5.v vVar = (com.amazon.aps.iva.q5.v) g0Var.c;
                vVar.getClass();
                int i2 = vVar.C;
                int i3 = vVar.D;
                if (i2 != 0 || i3 != 0) {
                    if (dVar.f != 0) {
                        i2 = 0;
                    }
                    if (dVar.g != Long.MIN_VALUE) {
                        i3 = 0;
                    }
                    v.a a = vVar.a();
                    a.A = i2;
                    a.B = i3;
                    g0Var.c = a.a();
                }
                return -5;
            }
            long j = dVar.g;
            if (j != Long.MIN_VALUE && ((m == -4 && fVar.f >= j) || (m == -3 && s == Long.MIN_VALUE && !fVar.e))) {
                fVar.k();
                fVar.b = 4;
                this.c = true;
                return -4;
            }
            return m;
        }

        @Override // com.amazon.aps.iva.o6.h0
        public final int o(long j) {
            if (d.this.g()) {
                return -3;
            }
            return this.b.o(j);
        }
    }

    public d(u uVar, boolean z, long j, long j2) {
        long j3;
        this.b = uVar;
        if (z) {
            j3 = j;
        } else {
            j3 = -9223372036854775807L;
        }
        this.e = j3;
        this.f = j;
        this.g = j2;
    }

    @Override // com.amazon.aps.iva.o6.i0.a
    public final void a(u uVar) {
        u.a aVar = this.c;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long b(long j, s1 s1Var) {
        long j2;
        long j3 = this.f;
        if (j == j3) {
            return j3;
        }
        long j4 = com.amazon.aps.iva.t5.g0.j(s1Var.a, 0L, j - j3);
        long j5 = s1Var.b;
        long j6 = this.g;
        if (j6 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j6 - j;
        }
        long j7 = com.amazon.aps.iva.t5.g0.j(j5, 0L, j2);
        if (j4 != s1Var.a || j7 != s1Var.b) {
            s1Var = new s1(j4, j7);
        }
        return this.b.b(j, s1Var);
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long c() {
        long c = this.b.c();
        if (c != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || c < j) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.amazon.aps.iva.o6.u.a
    public final void d(u uVar) {
        if (this.h != null) {
            return;
        }
        u.a aVar = this.c;
        aVar.getClass();
        aVar.d(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 > r6) goto L18;
     */
    @Override // com.amazon.aps.iva.o6.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.e = r0
            com.amazon.aps.iva.o6.d$a[] r0 = r5.d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.c = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            com.amazon.aps.iva.o6.u r0 = r5.b
            long r0 = r0.e(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            com.amazon.aps.iva.cq.b.C(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o6.d.e(long):long");
    }

    public final boolean g() {
        if (this.e != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r1 > r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // com.amazon.aps.iva.o6.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(com.amazon.aps.iva.s6.r[] r16, boolean[] r17, com.amazon.aps.iva.o6.h0[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            com.amazon.aps.iva.o6.d$a[] r1 = new com.amazon.aps.iva.o6.d.a[r1]
            r0.d = r1
            int r1 = r9.length
            com.amazon.aps.iva.o6.h0[] r10 = new com.amazon.aps.iva.o6.h0[r1]
            r11 = 0
            r1 = r11
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L24
            com.amazon.aps.iva.o6.d$a[] r2 = r0.d
            r3 = r9[r1]
            com.amazon.aps.iva.o6.d$a r3 = (com.amazon.aps.iva.o6.d.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1f
            com.amazon.aps.iva.o6.h0 r12 = r3.b
        L1f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L24:
            com.amazon.aps.iva.o6.u r1 = r0.b
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.h(r2, r3, r4, r5, r6)
            boolean r3 = r15.g()
            r4 = 1
            if (r3 == 0) goto L66
            long r5 = r0.f
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L66
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L61
            int r3 = r8.length
            r5 = r11
        L48:
            if (r5 >= r3) goto L61
            r6 = r8[r5]
            if (r6 == 0) goto L5e
            com.amazon.aps.iva.q5.v r6 = r6.r()
            java.lang.String r7 = r6.m
            java.lang.String r6 = r6.j
            boolean r6 = com.amazon.aps.iva.q5.g0.a(r7, r6)
            if (r6 != 0) goto L5e
            r3 = r4
            goto L62
        L5e:
            int r5 = r5 + 1
            goto L48
        L61:
            r3 = r11
        L62:
            if (r3 == 0) goto L66
            r5 = r1
            goto L6b
        L66:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6b:
            r0.e = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L85
            long r5 = r0.f
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L84
            long r5 = r0.g
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L85
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L84
            goto L85
        L84:
            r4 = r11
        L85:
            com.amazon.aps.iva.cq.b.C(r4)
        L88:
            int r3 = r9.length
            if (r11 >= r3) goto Lae
            r3 = r10[r11]
            if (r3 != 0) goto L94
            com.amazon.aps.iva.o6.d$a[] r3 = r0.d
            r3[r11] = r12
            goto La5
        L94:
            com.amazon.aps.iva.o6.d$a[] r4 = r0.d
            r5 = r4[r11]
            if (r5 == 0) goto L9e
            com.amazon.aps.iva.o6.h0 r5 = r5.b
            if (r5 == r3) goto La5
        L9e:
            com.amazon.aps.iva.o6.d$a r5 = new com.amazon.aps.iva.o6.d$a
            r5.<init>(r3)
            r4[r11] = r5
        La5:
            com.amazon.aps.iva.o6.d$a[] r3 = r0.d
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L88
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o6.d.h(com.amazon.aps.iva.s6.r[], boolean[], com.amazon.aps.iva.o6.h0[], boolean[], long):long");
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean isLoading() {
        return this.b.isLoading();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long j() {
        boolean z;
        if (g()) {
            long j = this.e;
            this.e = -9223372036854775807L;
            long j2 = j();
            if (j2 != -9223372036854775807L) {
                return j2;
            }
            return j;
        }
        long j3 = this.b.j();
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z2 = true;
        if (j3 >= this.f) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        long j4 = this.g;
        if (j4 != Long.MIN_VALUE && j3 > j4) {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.C(z2);
        return j3;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void k(u.a aVar, long j) {
        this.c = aVar;
        this.b.k(this, j);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void n() throws IOException {
        e.b bVar = this.h;
        if (bVar == null) {
            this.b.n();
            return;
        }
        throw bVar;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean p(long j) {
        return this.b.p(j);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final o0 q() {
        return this.b.q();
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long s() {
        long s = this.b.s();
        if (s != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || s < j) {
                return s;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void t(long j, boolean z) {
        this.b.t(j, z);
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final void v(long j) {
        this.b.v(j);
    }
}
