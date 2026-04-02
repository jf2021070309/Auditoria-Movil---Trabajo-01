package com.amazon.aps.iva.ef0;

import com.google.android.gms.cast.MediaStatus;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: AsyncTimeout.kt */
/* loaded from: classes4.dex */
public class c extends e0 {
    public static final a Companion = new a();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static c head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private c next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static c a() throws InterruptedException {
            c cVar = c.head;
            com.amazon.aps.iva.yb0.j.c(cVar);
            c cVar2 = cVar.next;
            if (cVar2 != null) {
                long remainingNanos = cVar2.remainingNanos(System.nanoTime());
                if (remainingNanos <= 0) {
                    c cVar3 = c.head;
                    com.amazon.aps.iva.yb0.j.c(cVar3);
                    cVar3.next = cVar2.next;
                    cVar2.next = null;
                    return cVar2;
                }
                c.condition.await(remainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            long nanoTime = System.nanoTime();
            c.condition.await(c.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            c cVar4 = c.head;
            com.amazon.aps.iva.yb0.j.c(cVar4);
            if (cVar4.next == null && System.nanoTime() - nanoTime >= c.IDLE_TIMEOUT_NANOS) {
                return c.head;
            }
            return null;
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes4.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            c a;
            while (true) {
                try {
                    c.Companion.getClass();
                    reentrantLock = c.lock;
                    reentrantLock.lock();
                    a = a.a();
                } catch (InterruptedException unused) {
                }
                if (a == c.head) {
                    c.head = null;
                    reentrantLock.unlock();
                    return;
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                reentrantLock.unlock();
                if (a != null) {
                    a.timedOut();
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: com.amazon.aps.iva.ef0.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0223c implements b0 {
        public final /* synthetic */ b0 c;

        public C0223c(b0 b0Var) {
            this.c = b0Var;
        }

        @Override // com.amazon.aps.iva.ef0.b0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            b0 b0Var = this.c;
            c cVar = c.this;
            cVar.enter();
            try {
                b0Var.close();
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                if (!cVar.exit()) {
                    return;
                }
                throw cVar.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!cVar.exit()) {
                    throw e;
                }
                throw cVar.access$newTimeoutException(e);
            } finally {
                cVar.exit();
            }
        }

        @Override // com.amazon.aps.iva.ef0.b0, java.io.Flushable
        public final void flush() {
            b0 b0Var = this.c;
            c cVar = c.this;
            cVar.enter();
            try {
                b0Var.flush();
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                if (!cVar.exit()) {
                    return;
                }
                throw cVar.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!cVar.exit()) {
                    throw e;
                }
                throw cVar.access$newTimeoutException(e);
            } finally {
                cVar.exit();
            }
        }

        @Override // com.amazon.aps.iva.ef0.b0
        public final e0 timeout() {
            return c.this;
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.c + ')';
        }

        @Override // com.amazon.aps.iva.ef0.b0
        public final void write(e eVar, long j) {
            com.amazon.aps.iva.yb0.j.f(eVar, FirebaseAnalytics.Param.SOURCE);
            com.amazon.aps.iva.ef0.b.b(eVar.c, 0L, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    y yVar = eVar.b;
                    com.amazon.aps.iva.yb0.j.c(yVar);
                    while (true) {
                        if (j2 >= MediaStatus.COMMAND_FOLLOW) {
                            break;
                        }
                        j2 += yVar.c - yVar.b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            yVar = yVar.f;
                            com.amazon.aps.iva.yb0.j.c(yVar);
                        }
                    }
                    b0 b0Var = this.c;
                    c cVar = c.this;
                    cVar.enter();
                    try {
                        b0Var.write(eVar, j2);
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                        if (!cVar.exit()) {
                            j -= j2;
                        } else {
                            throw cVar.access$newTimeoutException(null);
                        }
                    } catch (IOException e) {
                        if (!cVar.exit()) {
                            throw e;
                        }
                        throw cVar.access$newTimeoutException(e);
                    } finally {
                        cVar.exit();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes4.dex */
    public static final class d implements d0 {
        public final /* synthetic */ d0 c;

        public d(d0 d0Var) {
            this.c = d0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            d0 d0Var = this.c;
            c cVar = c.this;
            cVar.enter();
            try {
                d0Var.close();
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                if (!cVar.exit()) {
                    return;
                }
                throw cVar.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!cVar.exit()) {
                    throw e;
                }
                throw cVar.access$newTimeoutException(e);
            } finally {
                cVar.exit();
            }
        }

        @Override // com.amazon.aps.iva.ef0.d0
        public final long read(e eVar, long j) {
            com.amazon.aps.iva.yb0.j.f(eVar, "sink");
            d0 d0Var = this.c;
            c cVar = c.this;
            cVar.enter();
            try {
                long read = d0Var.read(eVar, j);
                if (!cVar.exit()) {
                    return read;
                }
                throw cVar.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!cVar.exit()) {
                    throw e;
                }
                throw cVar.access$newTimeoutException(e);
            } finally {
                cVar.exit();
            }
        }

        @Override // com.amazon.aps.iva.ef0.d0
        public final e0 timeout() {
            return c.this;
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.c + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        com.amazon.aps.iva.yb0.j.e(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        int i = (timeoutNanos > 0L ? 1 : (timeoutNanos == 0L ? 0 : -1));
        if (i == 0 && !hasDeadline) {
            return;
        }
        a aVar = Companion;
        aVar.getClass();
        aVar.getClass();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (!this.inQueue) {
                this.inQueue = true;
                if (head == null) {
                    head = new c();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (i != 0 && hasDeadline) {
                    this.timeoutAt = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (i != 0) {
                    this.timeoutAt = timeoutNanos + nanoTime;
                } else if (hasDeadline) {
                    this.timeoutAt = deadlineNanoTime();
                } else {
                    throw new AssertionError();
                }
                long remainingNanos = remainingNanos(nanoTime);
                c cVar = head;
                com.amazon.aps.iva.yb0.j.c(cVar);
                while (cVar.next != null) {
                    c cVar2 = cVar.next;
                    com.amazon.aps.iva.yb0.j.c(cVar2);
                    if (remainingNanos < cVar2.remainingNanos(nanoTime)) {
                        break;
                    }
                    cVar = cVar.next;
                    com.amazon.aps.iva.yb0.j.c(cVar);
                }
                this.next = cVar.next;
                cVar.next = this;
                if (cVar == head) {
                    Companion.getClass();
                    condition.signal();
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean exit() {
        a aVar = Companion;
        aVar.getClass();
        aVar.getClass();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.inQueue) {
                this.inQueue = false;
                for (c cVar = head; cVar != null; cVar = cVar.next) {
                    if (cVar.next == this) {
                        cVar.next = this.next;
                        this.next = null;
                        return false;
                    }
                }
                reentrantLock.unlock();
                return true;
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final b0 sink(b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "sink");
        return new C0223c(b0Var);
    }

    public final d0 source(d0 d0Var) {
        com.amazon.aps.iva.yb0.j.f(d0Var, FirebaseAnalytics.Param.SOURCE);
        return new d(d0Var);
    }

    public final <T> T withTimeout(com.amazon.aps.iva.xb0.a<? extends T> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "block");
        enter();
        try {
            T invoke = aVar.invoke();
            if (!exit()) {
                return invoke;
            }
            throw access$newTimeoutException(null);
        } catch (IOException e) {
            if (!exit()) {
                throw e;
            }
            throw access$newTimeoutException(e);
        } finally {
            exit();
        }
    }

    public void timedOut() {
    }
}
