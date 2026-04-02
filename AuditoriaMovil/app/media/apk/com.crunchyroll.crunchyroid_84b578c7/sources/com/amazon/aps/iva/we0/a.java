package com.amazon.aps.iva.we0;

import java.util.concurrent.CancellationException;
/* compiled from: FlowExceptions.kt */
/* loaded from: classes4.dex */
public final class a extends CancellationException {
    public final transient com.amazon.aps.iva.ve0.g<?> b;

    public a(com.amazon.aps.iva.ve0.g<?> gVar) {
        super("Flow was aborted, no more elements needed");
        this.b = gVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
