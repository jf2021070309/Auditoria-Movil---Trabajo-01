package com.amazon.aps.iva.a6;

import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.k6.s;
import com.amazon.aps.iva.q5.v;
import java.io.IOException;
/* compiled from: BaseRenderer.java */
/* loaded from: classes.dex */
public abstract class e implements o1, p1 {
    public final int c;
    public q1 e;
    public int f;
    public com.amazon.aps.iva.b6.p1 g;
    public int h;
    public com.amazon.aps.iva.o6.h0 i;
    public com.amazon.aps.iva.q5.v[] j;
    public long k;
    public boolean m;
    public boolean n;
    public p1.a o;
    public final Object b = new Object();
    public final com.amazon.aps.iva.u1.g0 d = new com.amazon.aps.iva.u1.g0();
    public long l = Long.MIN_VALUE;

    public e(int i) {
        this.c = i;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public u0 A() {
        return null;
    }

    public final l B(s.b bVar, com.amazon.aps.iva.q5.v vVar) {
        return b(4002, vVar, bVar, false);
    }

    public abstract void C();

    public abstract void E(long j, boolean z) throws l;

    public abstract void J(com.amazon.aps.iva.q5.v[] vVarArr, long j, long j2) throws l;

    public final int K(com.amazon.aps.iva.u1.g0 g0Var, com.amazon.aps.iva.z5.f fVar, int i) {
        com.amazon.aps.iva.o6.h0 h0Var = this.i;
        h0Var.getClass();
        int m = h0Var.m(g0Var, fVar, i);
        if (m == -4) {
            if (fVar.i(4)) {
                this.l = Long.MIN_VALUE;
                if (this.m) {
                    return -4;
                }
                return -3;
            }
            long j = fVar.f + this.k;
            fVar.f = j;
            this.l = Math.max(this.l, j);
        } else if (m == -5) {
            com.amazon.aps.iva.q5.v vVar = (com.amazon.aps.iva.q5.v) g0Var.c;
            vVar.getClass();
            if (vVar.q != Long.MAX_VALUE) {
                v.a a = vVar.a();
                a.o = vVar.q + this.k;
                g0Var.c = a.a();
            }
        }
        return m;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void a() {
        boolean z = true;
        if (this.h != 1) {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        this.d.a();
        this.h = 0;
        this.i = null;
        this.j = null;
        this.m = false;
        C();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.a6.l b(int r13, com.amazon.aps.iva.q5.v r14, java.lang.Exception r15, boolean r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.n
            if (r3 != 0) goto L1d
            r3 = 1
            r1.n = r3
            r3 = 0
            int r4 = r12.c(r14)     // Catch: java.lang.Throwable -> L16 com.amazon.aps.iva.a6.l -> L1b
            r4 = r4 & 7
            r1.n = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.n = r3
            throw r2
        L1b:
            r1.n = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.getName()
            int r7 = r1.f
            com.amazon.aps.iva.a6.l r11 = new com.amazon.aps.iva.a6.l
            r3 = 1
            if (r0 != 0) goto L2b
            r9 = r2
            goto L2c
        L2b:
            r9 = r4
        L2c:
            r2 = r11
            r4 = r15
            r5 = r13
            r8 = r14
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.e.b(int, com.amazon.aps.iva.q5.v, java.lang.Exception, boolean):com.amazon.aps.iva.a6.l");
    }

    @Override // com.amazon.aps.iva.a6.o1
    public boolean d() {
        return h();
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final int getState() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final com.amazon.aps.iva.o6.h0 getStream() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final boolean h() {
        if (this.l == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void j(q1 q1Var, com.amazon.aps.iva.q5.v[] vVarArr, com.amazon.aps.iva.o6.h0 h0Var, long j, boolean z, boolean z2, long j2, long j3) throws l {
        boolean z3;
        if (this.h == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        com.amazon.aps.iva.cq.b.C(z3);
        this.e = q1Var;
        this.h = 1;
        D(z, z2);
        o(vVarArr, h0Var, j2, j3);
        this.m = false;
        this.l = j;
        E(j, z);
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void k() {
        this.m = true;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void m() throws IOException {
        com.amazon.aps.iva.o6.h0 h0Var = this.i;
        h0Var.getClass();
        h0Var.a();
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final boolean n() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void o(com.amazon.aps.iva.q5.v[] vVarArr, com.amazon.aps.iva.o6.h0 h0Var, long j, long j2) throws l {
        com.amazon.aps.iva.cq.b.C(!this.m);
        this.i = h0Var;
        if (this.l == Long.MIN_VALUE) {
            this.l = j;
        }
        this.j = vVarArr;
        this.k = j2;
        J(vVarArr, j, j2);
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final int p() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void release() {
        boolean z;
        if (this.h == 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        F();
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void reset() {
        boolean z;
        if (this.h == 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        this.d.a();
        G();
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void start() throws l {
        boolean z = true;
        if (this.h != 1) {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        this.h = 2;
        H();
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void stop() {
        boolean z;
        if (this.h == 2) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        this.h = 1;
        I();
    }

    @Override // com.amazon.aps.iva.a6.p1
    public int v() throws l {
        return 0;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final long x() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void y(int i, com.amazon.aps.iva.b6.p1 p1Var) {
        this.f = i;
        this.g = p1Var;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void z(long j) throws l {
        this.m = false;
        this.l = j;
        E(j, false);
    }

    public void F() {
    }

    public void G() {
    }

    public void H() throws l {
    }

    public void I() {
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final e r() {
        return this;
    }

    public void D(boolean z, boolean z2) throws l {
    }

    @Override // com.amazon.aps.iva.a6.l1.b
    public void l(int i, Object obj) throws l {
    }
}
