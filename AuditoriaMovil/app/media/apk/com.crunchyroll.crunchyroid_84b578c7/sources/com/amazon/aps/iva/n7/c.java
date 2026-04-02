package com.amazon.aps.iva.n7;

import android.util.Pair;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.e0;
/* compiled from: MlltSeeker.java */
/* loaded from: classes.dex */
public final class c implements e {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? g0.Q(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair b(long[] jArr, long[] jArr2, long j) {
        double d;
        int f = g0.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // com.amazon.aps.iva.n7.e
    public final long a(long j) {
        return g0.Q(((Long) b(this.a, this.b, j).second).longValue());
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final d0.a d(long j) {
        Pair b = b(this.b, this.a, g0.e0(g0.j(j, 0L, this.c)));
        e0 e0Var = new e0(g0.Q(((Long) b.first).longValue()), ((Long) b.second).longValue());
        return new d0.a(e0Var, e0Var);
    }

    @Override // com.amazon.aps.iva.n7.e
    public final long e() {
        return -1L;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final boolean f() {
        return true;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final long i() {
        return this.c;
    }
}
