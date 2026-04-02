package com.fyber.inneractive.sdk.player.c.k;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class f {
    public int a;
    private long[] b;

    public f() {
        this((byte) 0);
    }

    private f(byte b) {
        this.b = new long[32];
    }

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

    public final long a(int i) {
        if (i < 0 || i >= this.a) {
            throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.a);
        }
        return this.b[i];
    }
}
