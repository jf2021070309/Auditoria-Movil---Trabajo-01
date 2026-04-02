package com.amazon.aps.iva.o2;

import com.amazon.aps.iva.ab.r;
/* compiled from: IntSize.kt */
/* loaded from: classes.dex */
public final class k {
    public static final long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long b(long j) {
        return r.d((int) (j >> 32), j.b(j));
    }
}
