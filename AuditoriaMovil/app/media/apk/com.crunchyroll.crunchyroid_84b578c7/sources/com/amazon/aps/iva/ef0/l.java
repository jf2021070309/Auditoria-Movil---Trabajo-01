package com.amazon.aps.iva.ef0;

import java.io.IOException;
/* compiled from: ForwardingSource.kt */
/* loaded from: classes4.dex */
public abstract class l implements d0 {
    private final d0 delegate;

    public l(d0 d0Var) {
        com.amazon.aps.iva.yb0.j.f(d0Var, "delegate");
        this.delegate = d0Var;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final d0 m13deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final d0 delegate() {
        return this.delegate;
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public long read(e eVar, long j) throws IOException {
        com.amazon.aps.iva.yb0.j.f(eVar, "sink");
        return this.delegate.read(eVar, j);
    }

    @Override // com.amazon.aps.iva.ef0.d0
    public e0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
