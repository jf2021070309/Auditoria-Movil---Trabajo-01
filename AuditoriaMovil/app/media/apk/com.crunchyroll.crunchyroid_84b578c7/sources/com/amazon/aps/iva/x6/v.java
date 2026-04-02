package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.w;
/* compiled from: FlacSeekTableSeekMap.java */
/* loaded from: classes.dex */
public final class v implements d0 {
    public final w a;
    public final long b;

    public v(w wVar, long j) {
        this.a = wVar;
        this.b = j;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final d0.a d(long j) {
        long j2;
        w wVar = this.a;
        com.amazon.aps.iva.cq.b.D(wVar.k);
        w.a aVar = wVar.k;
        long[] jArr = aVar.a;
        int f = com.amazon.aps.iva.t5.g0.f(jArr, com.amazon.aps.iva.t5.g0.j((wVar.e * j) / 1000000, 0L, wVar.j - 1), false);
        long j3 = 0;
        if (f == -1) {
            j2 = 0;
        } else {
            j2 = jArr[f];
        }
        long[] jArr2 = aVar.b;
        if (f != -1) {
            j3 = jArr2[f];
        }
        int i = wVar.e;
        long j4 = (j2 * 1000000) / i;
        long j5 = this.b;
        e0 e0Var = new e0(j4, j3 + j5);
        if (j4 != j && f != jArr.length - 1) {
            int i2 = f + 1;
            return new d0.a(e0Var, new e0((jArr[i2] * 1000000) / i, j5 + jArr2[i2]));
        }
        return new d0.a(e0Var, e0Var);
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final boolean f() {
        return true;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final long i() {
        return this.a.b();
    }
}
