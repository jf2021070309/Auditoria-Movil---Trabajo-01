package com.amazon.aps.iva.a1;

import java.util.concurrent.CancellationException;
/* compiled from: Modifier.kt */
/* loaded from: classes.dex */
public final class g extends CancellationException {
    public g() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
