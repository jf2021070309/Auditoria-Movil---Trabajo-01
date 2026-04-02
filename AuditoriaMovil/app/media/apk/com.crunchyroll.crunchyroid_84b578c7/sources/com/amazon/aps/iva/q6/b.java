package com.amazon.aps.iva.q6;

import java.util.NoSuchElementException;
/* compiled from: BaseMediaChunkIterator.java */
/* loaded from: classes.dex */
public abstract class b implements n {
    public final long b;
    public final long c;
    public long d;

    public b(long j, long j2) {
        this.b = j;
        this.c = j2;
        this.d = j - 1;
    }

    public final void c() {
        long j = this.d;
        if (j >= this.b && j <= this.c) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // com.amazon.aps.iva.q6.n
    public final boolean next() {
        boolean z;
        long j = this.d + 1;
        this.d = j;
        if (j > this.c) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
