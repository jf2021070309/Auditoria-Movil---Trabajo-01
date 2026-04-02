package com.amazon.aps.iva.n7;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.e0;
/* compiled from: VbriSeeker.java */
/* loaded from: classes.dex */
public final class f implements e {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public f(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // com.amazon.aps.iva.n7.e
    public final long a(long j) {
        return this.a[g0.f(this.b, j, true)];
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final d0.a d(long j) {
        long[] jArr = this.a;
        int f = g0.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        e0 e0Var = new e0(j2, jArr2[f]);
        if (j2 < j && f != jArr.length - 1) {
            int i = f + 1;
            return new d0.a(e0Var, new e0(jArr[i], jArr2[i]));
        }
        return new d0.a(e0Var, e0Var);
    }

    @Override // com.amazon.aps.iva.n7.e
    public final long e() {
        return this.d;
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
