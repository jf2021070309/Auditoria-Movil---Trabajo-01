package com.amazon.aps.iva.ef0;

import com.amazon.aps.iva.j0.j0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
/* compiled from: Timeout.kt */
/* loaded from: classes4.dex */
public class e0 {
    public static final b Companion = new b();
    public static final e0 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* compiled from: Timeout.kt */
    /* loaded from: classes4.dex */
    public static final class b {
    }

    public final void awaitSignal(Condition condition) throws InterruptedIOException {
        com.amazon.aps.iva.yb0.j.f(condition, "condition");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                condition.await(timeoutNanos, TimeUnit.NANOSECONDS);
                j = System.nanoTime() - nanoTime;
            }
            if (j < timeoutNanos) {
                return;
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public e0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public e0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final e0 deadline(long j, TimeUnit timeUnit) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(timeUnit, "unit");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return deadlineNanoTime(timeUnit.toNanos(j) + System.nanoTime());
        }
        throw new IllegalArgumentException(j0.f("duration <= 0: ", j).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(e0 e0Var, com.amazon.aps.iva.xb0.a<? extends T> aVar) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "other");
        com.amazon.aps.iva.yb0.j.f(aVar, "block");
        long timeoutNanos = timeoutNanos();
        b bVar = Companion;
        long timeoutNanos2 = e0Var.timeoutNanos();
        long timeoutNanos3 = timeoutNanos();
        bVar.getClass();
        if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
            timeoutNanos2 = timeoutNanos3;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(timeoutNanos2, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (e0Var.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), e0Var.deadlineNanoTime()));
            }
            try {
                T invoke = aVar.invoke();
                timeout(timeoutNanos, timeUnit);
                if (e0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                return invoke;
            } catch (Throwable th) {
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (e0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                throw th;
            }
        }
        if (e0Var.hasDeadline()) {
            deadlineNanoTime(e0Var.deadlineNanoTime());
        }
        try {
            T invoke2 = aVar.invoke();
            timeout(timeoutNanos, timeUnit);
            if (e0Var.hasDeadline()) {
                clearDeadline();
            }
            return invoke2;
        } catch (Throwable th2) {
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (e0Var.hasDeadline()) {
                clearDeadline();
            }
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public e0 timeout(long j, TimeUnit timeUnit) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(timeUnit, "unit");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(j0.f("timeout < 0: ", j).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        com.amazon.aps.iva.yb0.j.f(obj, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j2 = timeoutNanos / 1000000;
                obj.wait(j2, (int) (timeoutNanos - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j < timeoutNanos) {
                return;
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public e0 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }

    /* compiled from: Timeout.kt */
    /* loaded from: classes4.dex */
    public static final class a extends e0 {
        @Override // com.amazon.aps.iva.ef0.e0
        public final e0 timeout(long j, TimeUnit timeUnit) {
            com.amazon.aps.iva.yb0.j.f(timeUnit, "unit");
            return this;
        }

        @Override // com.amazon.aps.iva.ef0.e0
        public final void throwIfReached() {
        }

        @Override // com.amazon.aps.iva.ef0.e0
        public final e0 deadlineNanoTime(long j) {
            return this;
        }
    }
}
