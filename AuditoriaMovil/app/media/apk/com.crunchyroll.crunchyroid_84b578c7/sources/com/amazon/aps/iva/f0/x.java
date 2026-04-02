package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.s3;
import com.amazon.aps.iva.o0.y1;
/* compiled from: LazyLayoutNearestRangeState.kt */
/* loaded from: classes.dex */
public final class x implements p3<com.amazon.aps.iva.ec0.j> {
    public final y1 b;
    public int c;

    /* compiled from: LazyLayoutNearestRangeState.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        new a();
    }

    public x(int i) {
        int i2 = (i / 30) * 30;
        this.b = com.amazon.aps.iva.cq.b.b0(com.amazon.aps.iva.aq.j.T(Math.max(i2 - 100, 0), i2 + 30 + 100), s3.a);
        this.c = i;
    }

    @Override // com.amazon.aps.iva.o0.p3
    public final com.amazon.aps.iva.ec0.j getValue() {
        return (com.amazon.aps.iva.ec0.j) this.b.getValue();
    }
}
