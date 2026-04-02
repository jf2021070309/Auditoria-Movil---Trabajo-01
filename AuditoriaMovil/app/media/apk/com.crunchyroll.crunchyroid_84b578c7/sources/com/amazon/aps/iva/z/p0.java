package com.amazon.aps.iva.z;

import java.util.concurrent.CancellationException;
/* compiled from: InternalMutatorMutex.kt */
/* loaded from: classes.dex */
public final class p0 extends CancellationException {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i) {
        super("Mutation interrupted");
        this.b = i;
        if (i != 1) {
        } else {
            super("Pointer input was reset");
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
