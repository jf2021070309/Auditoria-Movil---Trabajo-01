package com.amazon.aps.iva.n7;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.e0;
/* compiled from: XingSeeker.java */
/* loaded from: classes.dex */
public final class g implements e {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public g(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    @Override // com.amazon.aps.iva.n7.e
    public final long a(long j) {
        long j2;
        double d;
        long j3 = j - this.a;
        if (f() && j3 > this.b) {
            long[] jArr = this.f;
            com.amazon.aps.iva.cq.b.D(jArr);
            double d2 = (j3 * 256.0d) / this.d;
            int f = g0.f(jArr, (long) d2, true);
            long j4 = this.c;
            long j5 = (f * j4) / 100;
            long j6 = jArr[f];
            int i = f + 1;
            long j7 = (j4 * i) / 100;
            if (f == 99) {
                j2 = 256;
            } else {
                j2 = jArr[i];
            }
            if (j6 == j2) {
                d = 0.0d;
            } else {
                d = (d2 - j6) / (j2 - j6);
            }
            return Math.round(d * (j7 - j5)) + j5;
        }
        return 0L;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final d0.a d(long j) {
        double d;
        double d2;
        boolean f = f();
        int i = this.b;
        long j2 = this.a;
        if (!f) {
            e0 e0Var = new e0(0L, j2 + i);
            return new d0.a(e0Var, e0Var);
        }
        long j3 = g0.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d = 256.0d;
                d4 = 256.0d;
                double d5 = d4 / d;
                long j4 = this.d;
                e0 e0Var2 = new e0(j3, j2 + g0.j(Math.round(d5 * j4), i, j4 - 1));
                return new d0.a(e0Var2, e0Var2);
            }
            int i2 = (int) d3;
            long[] jArr = this.f;
            com.amazon.aps.iva.cq.b.D(jArr);
            double d6 = jArr[i2];
            if (i2 == 99) {
                d2 = 256.0d;
            } else {
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d6) * (d3 - i2)) + d6;
        }
        d = 256.0d;
        double d52 = d4 / d;
        long j42 = this.d;
        e0 e0Var22 = new e0(j3, j2 + g0.j(Math.round(d52 * j42), i, j42 - 1));
        return new d0.a(e0Var22, e0Var22);
    }

    @Override // com.amazon.aps.iva.n7.e
    public final long e() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final boolean f() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final long i() {
        return this.c;
    }
}
