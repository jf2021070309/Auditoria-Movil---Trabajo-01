package com.amazon.aps.iva.a8;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.e0;
/* compiled from: WavSeekMap.java */
/* loaded from: classes.dex */
public final class d implements d0 {
    public final b a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public d(b bVar, int i, long j, long j2) {
        this.a = bVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / bVar.c;
        this.d = j3;
        this.e = b(j3);
    }

    public final long b(long j) {
        return g0.X(j * this.b, 1000000L, this.a.b);
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final d0.a d(long j) {
        b bVar = this.a;
        long j2 = (bVar.b * j) / (this.b * 1000000);
        long j3 = this.d;
        long j4 = g0.j(j2, 0L, j3 - 1);
        long j5 = this.c;
        long b = b(j4);
        e0 e0Var = new e0(b, (bVar.c * j4) + j5);
        if (b < j && j4 != j3 - 1) {
            long j6 = j4 + 1;
            return new d0.a(e0Var, new e0(b(j6), (bVar.c * j6) + j5));
        }
        return new d0.a(e0Var, e0Var);
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final boolean f() {
        return true;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final long i() {
        return this.e;
    }
}
