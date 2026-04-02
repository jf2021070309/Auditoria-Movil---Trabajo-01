package com.amazon.aps.iva.p1;

import java.util.concurrent.CancellationException;
/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes.dex */
public final class d extends CancellationException {
    public static final d b = new d();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
