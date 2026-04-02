package com.amazon.aps.iva.se0;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: Executors.kt */
/* loaded from: classes4.dex */
public final class c1 extends b1 implements o0 {
    public final Executor c;

    public c1(ExecutorService executorService) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.c = executorService;
        Method method2 = com.amazon.aps.iva.xe0.b.a;
        try {
            if (executorService instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executorService;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = com.amazon.aps.iva.xe0.b.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.c;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c1) && ((c1) obj).c == this.c) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.se0.o0
    public final t0 h(long j, Runnable runnable, com.amazon.aps.iva.ob0.g gVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                com.amazon.aps.iva.a60.b.j(gVar, com.amazon.aps.iva.e.z.h("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            return new s0(scheduledFuture);
        }
        return k0.i.h(j, runnable, gVar);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final String toString() {
        return this.c.toString();
    }

    @Override // com.amazon.aps.iva.se0.o0
    public final void v(long j, n nVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new b2(this, nVar), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                com.amazon.aps.iva.a60.b.j(nVar.f, com.amazon.aps.iva.e.z.h("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            nVar.w(new j(scheduledFuture, 0));
        } else {
            k0.i.v(j, nVar);
        }
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final void x(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            com.amazon.aps.iva.a60.b.j(gVar, com.amazon.aps.iva.e.z.h("The task was rejected", e));
            r0.b.x(gVar, runnable);
        }
    }
}
