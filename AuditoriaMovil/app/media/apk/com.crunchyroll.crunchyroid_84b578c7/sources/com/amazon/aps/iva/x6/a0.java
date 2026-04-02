package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.x6.d0;
/* compiled from: IndexSeekMap.java */
/* loaded from: classes.dex */
public final class a0 implements d0 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public a0(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        int length = jArr2.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d = z2;
        if (z2 && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.a = jArr;
            this.b = jArr2;
        }
        this.c = j;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final d0.a d(long j) {
        if (!this.d) {
            e0 e0Var = e0.c;
            return new d0.a(e0Var, e0Var);
        }
        long[] jArr = this.b;
        int f = com.amazon.aps.iva.t5.g0.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.a;
        e0 e0Var2 = new e0(j2, jArr2[f]);
        if (j2 != j && f != jArr.length - 1) {
            int i = f + 1;
            return new d0.a(e0Var2, new e0(jArr[i], jArr2[i]));
        }
        return new d0.a(e0Var2, e0Var2);
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final boolean f() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final long i() {
        return this.c;
    }
}
