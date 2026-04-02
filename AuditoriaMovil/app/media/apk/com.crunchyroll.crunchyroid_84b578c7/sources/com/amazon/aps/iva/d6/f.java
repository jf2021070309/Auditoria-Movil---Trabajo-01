package com.amazon.aps.iva.d6;

import com.amazon.aps.iva.e6.i;
import com.amazon.aps.iva.t5.g0;
/* compiled from: DashWrappingSegmentIndex.java */
/* loaded from: classes.dex */
public final class f implements d {
    public final com.amazon.aps.iva.x6.g b;
    public final long c;

    public f(com.amazon.aps.iva.x6.g gVar, long j) {
        this.b = gVar;
        this.c = j;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long a(long j) {
        return this.b.e[(int) j] - this.c;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long b(long j, long j2) {
        return this.b.d[(int) j];
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long c(long j, long j2) {
        return 0L;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long d(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final i e(long j) {
        com.amazon.aps.iva.x6.g gVar = this.b;
        int i = (int) j;
        return new i(null, gVar.c[i], gVar.b[i]);
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long f(long j, long j2) {
        return g0.f(this.b.e, j + this.c, true);
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long g(long j) {
        return this.b.a;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final boolean j() {
        return true;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long k() {
        return 0L;
    }

    @Override // com.amazon.aps.iva.d6.d
    public final long l(long j, long j2) {
        return this.b.a;
    }
}
