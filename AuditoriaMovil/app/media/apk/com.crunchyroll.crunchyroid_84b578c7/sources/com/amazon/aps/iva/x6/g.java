package com.amazon.aps.iva.x6;

import com.amazon.aps.iva.x6.d0;
import java.util.Arrays;
/* compiled from: ChunkIndex.java */
/* loaded from: classes.dex */
public final class g implements d0 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final d0.a d(long j) {
        long[] jArr = this.e;
        int f = com.amazon.aps.iva.t5.g0.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.c;
        e0 e0Var = new e0(j2, jArr2[f]);
        if (j2 < j && f != this.a - 1) {
            int i = f + 1;
            return new d0.a(e0Var, new e0(jArr[i], jArr2[i]));
        }
        return new d0.a(e0Var, e0Var);
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final boolean f() {
        return true;
    }

    @Override // com.amazon.aps.iva.x6.d0
    public final long i() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
