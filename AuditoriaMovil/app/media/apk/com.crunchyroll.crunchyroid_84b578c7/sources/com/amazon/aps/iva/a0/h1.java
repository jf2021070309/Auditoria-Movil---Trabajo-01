package com.amazon.aps.iva.a0;

import java.util.concurrent.CancellationException;
/* compiled from: MutatorMutex.kt */
/* loaded from: classes.dex */
public final class h1 extends CancellationException {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i) {
        super("Mutation interrupted");
        this.b = i;
        if (i != 1) {
        } else {
            super("The coroutine scope left the composition");
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.b) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                return this;
            default:
                setStackTrace(new StackTraceElement[0]);
                return this;
        }
    }
}
