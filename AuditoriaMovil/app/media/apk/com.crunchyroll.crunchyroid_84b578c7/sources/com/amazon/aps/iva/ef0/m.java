package com.amazon.aps.iva.ef0;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: ForwardingTimeout.kt */
/* loaded from: classes4.dex */
public final class m extends e0 {
    public e0 a;

    public m(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "delegate");
        this.a = e0Var;
    }

    @Override // com.amazon.aps.iva.ef0.e0
    public final e0 clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override // com.amazon.aps.iva.ef0.e0
    public final e0 clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override // com.amazon.aps.iva.ef0.e0
    public final long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override // com.amazon.aps.iva.ef0.e0
    public final boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override // com.amazon.aps.iva.ef0.e0
    public final void throwIfReached() throws IOException {
        this.a.throwIfReached();
    }

    @Override // com.amazon.aps.iva.ef0.e0
    public final e0 timeout(long j, TimeUnit timeUnit) {
        com.amazon.aps.iva.yb0.j.f(timeUnit, "unit");
        return this.a.timeout(j, timeUnit);
    }

    @Override // com.amazon.aps.iva.ef0.e0
    public final long timeoutNanos() {
        return this.a.timeoutNanos();
    }

    @Override // com.amazon.aps.iva.ef0.e0
    public final e0 deadlineNanoTime(long j) {
        return this.a.deadlineNanoTime(j);
    }
}
