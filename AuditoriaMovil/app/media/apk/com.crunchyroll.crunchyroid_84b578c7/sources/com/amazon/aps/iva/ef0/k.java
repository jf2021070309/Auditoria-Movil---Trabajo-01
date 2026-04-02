package com.amazon.aps.iva.ef0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
/* compiled from: ForwardingSink.kt */
/* loaded from: classes4.dex */
public abstract class k implements b0 {
    private final b0 delegate;

    public k(b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "delegate");
        this.delegate = b0Var;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final b0 m12deprecated_delegate() {
        return this.delegate;
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final b0 delegate() {
        return this.delegate;
    }

    @Override // com.amazon.aps.iva.ef0.b0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public e0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // com.amazon.aps.iva.ef0.b0
    public void write(e eVar, long j) throws IOException {
        com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
        this.delegate.write(eVar, j);
    }
}
