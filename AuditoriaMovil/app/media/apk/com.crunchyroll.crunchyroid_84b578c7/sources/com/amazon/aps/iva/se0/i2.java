package com.amazon.aps.iva.se0;
/* compiled from: Timeout.kt */
/* loaded from: classes4.dex */
public final class i2<U, T extends U> extends com.amazon.aps.iva.xe0.p<T> implements Runnable {
    public final long e;

    public i2(long j, j2 j2Var) {
        super(j2Var, j2Var.getContext());
        this.e = j;
    }

    @Override // com.amazon.aps.iva.se0.a, com.amazon.aps.iva.se0.o1
    public final String j0() {
        return super.j0() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        D(new h2(com.amazon.aps.iva.c.b.b(new StringBuilder("Timed out waiting for "), this.e, " ms"), this));
    }
}
