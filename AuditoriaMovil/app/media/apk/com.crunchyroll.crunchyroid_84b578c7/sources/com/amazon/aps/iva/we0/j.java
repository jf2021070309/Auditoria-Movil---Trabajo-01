package com.amazon.aps.iva.we0;

import java.util.concurrent.CancellationException;
/* compiled from: FlowExceptions.kt */
/* loaded from: classes4.dex */
public final class j extends CancellationException {
    public j() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
