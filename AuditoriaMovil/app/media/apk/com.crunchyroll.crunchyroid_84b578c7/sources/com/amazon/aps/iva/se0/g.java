package com.amazon.aps.iva.se0;

import java.util.concurrent.locks.LockSupport;
/* compiled from: Builders.kt */
/* loaded from: classes4.dex */
public final class g<T> extends a<T> {
    public final Thread d;
    public final x0 e;

    public g(com.amazon.aps.iva.ob0.g gVar, Thread thread, x0 x0Var) {
        super(gVar, true);
        this.d = thread;
        this.e = x0Var;
    }

    @Override // com.amazon.aps.iva.se0.o1
    public final void x(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (!com.amazon.aps.iva.yb0.j.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
