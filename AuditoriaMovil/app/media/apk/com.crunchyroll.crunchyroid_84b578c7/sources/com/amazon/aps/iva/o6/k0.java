package com.amazon.aps.iva.o6;

import android.net.Uri;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.r0;
/* compiled from: SinglePeriodTimeline.java */
/* loaded from: classes.dex */
public final class k0 extends r0 {
    public static final Object t = new Object();
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final Object q;
    public final com.amazon.aps.iva.q5.b0 r;
    public final b0.f s;

    static {
        b0.b bVar = new b0.b();
        bVar.a = "SinglePeriodTimeline";
        bVar.b = Uri.EMPTY;
        bVar.a();
    }

    public k0(long j, boolean z, boolean z2, com.amazon.aps.iva.q5.b0 b0Var) {
        this(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, b0Var, z2 ? b0Var.d : null);
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final int c(Object obj) {
        if (t.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final r0.b h(int i, r0.b bVar, boolean z) {
        Object obj;
        com.amazon.aps.iva.cq.b.x(i, 1);
        if (z) {
            obj = t;
        } else {
            obj = null;
        }
        bVar.k(null, obj, this.j, -this.l);
        return bVar;
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final int j() {
        return 1;
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final Object n(int i) {
        com.amazon.aps.iva.cq.b.x(i, 1);
        return t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r1 > r3) goto L11;
     */
    @Override // com.amazon.aps.iva.q5.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.q5.r0.d p(int r24, com.amazon.aps.iva.q5.r0.d r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = r24
            com.amazon.aps.iva.cq.b.x(r2, r1)
            boolean r13 = r0.o
            long r1 = r0.m
            if (r13 == 0) goto L2c
            boolean r3 = r0.p
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r26 > r3 ? 1 : (r26 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.k
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L24
            goto L2a
        L24:
            long r1 = r1 + r26
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
        L2a:
            r15 = r5
            goto L2d
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r3 = com.amazon.aps.iva.q5.r0.d.s
            com.amazon.aps.iva.q5.b0 r4 = r0.r
            java.lang.Object r5 = r0.q
            long r6 = r0.g
            long r8 = r0.h
            long r10 = r0.i
            boolean r12 = r0.n
            com.amazon.aps.iva.q5.b0$f r14 = r0.s
            long r1 = r0.k
            r17 = r1
            r19 = 0
            r20 = 0
            long r1 = r0.l
            r21 = r1
            r2 = r25
            r2.c(r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20, r21)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o6.k0.p(int, com.amazon.aps.iva.q5.r0$d, long):com.amazon.aps.iva.q5.r0$d");
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final int q() {
        return 1;
    }

    public k0(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, com.amazon.aps.iva.h6.j jVar, com.amazon.aps.iva.q5.b0 b0Var, b0.f fVar) {
        this.g = j;
        this.h = j2;
        this.i = -9223372036854775807L;
        this.j = j3;
        this.k = j4;
        this.l = j5;
        this.m = j6;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = jVar;
        b0Var.getClass();
        this.r = b0Var;
        this.s = fVar;
    }
}
