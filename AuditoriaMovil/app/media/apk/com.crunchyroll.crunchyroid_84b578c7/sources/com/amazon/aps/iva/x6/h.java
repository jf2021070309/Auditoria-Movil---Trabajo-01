package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.x6.d0;
/* compiled from: ConstantBitrateSeekMap.java */
/* loaded from: classes.dex */
public class h implements d0 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public h(int i, int i2, long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
            return;
        }
        long j3 = j - j2;
        this.d = j3;
        this.f = ((Math.max(0L, j3) * 8) * 1000000) / i;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final d0.a d(long j) {
        long j2 = this.d;
        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        long j3 = this.b;
        if (i == 0 && !this.g) {
            e0 e0Var = new e0(0L, j3);
            return new d0.a(e0Var, e0Var);
        }
        int i2 = this.e;
        long j4 = this.c;
        long j5 = (((i2 * j) / 8000000) / j4) * j4;
        if (i != 0) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = ((Math.max(0L, max - j3) * 8) * 1000000) / i2;
        e0 e0Var2 = new e0(max2, max);
        if (i != 0 && max2 < j) {
            long j6 = j4 + max;
            if (j6 < this.a) {
                return new d0.a(e0Var2, new e0(((Math.max(0L, j6 - j3) * 8) * 1000000) / i2, j6));
            }
        }
        return new d0.a(e0Var2, e0Var2);
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final boolean f() {
        if (this.d == -1 && !this.g) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final long i() {
        return this.f;
    }
}
