package com.amazon.aps.iva.p1;

import java.util.concurrent.CancellationException;
/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes.dex */
public final class o extends CancellationException {
    public o(long j) {
        super("Timed out waiting for " + j + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
