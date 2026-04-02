package com.amazon.aps.iva.t5;

import java.util.Arrays;
/* compiled from: LongArray.java */
/* loaded from: classes.dex */
public final class q {
    public int a;
    public long[] b = new long[32];

    public final void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public final long b(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Invalid index ", i, ", size is ");
        d.append(this.a);
        throw new IndexOutOfBoundsException(d.toString());
    }
}
