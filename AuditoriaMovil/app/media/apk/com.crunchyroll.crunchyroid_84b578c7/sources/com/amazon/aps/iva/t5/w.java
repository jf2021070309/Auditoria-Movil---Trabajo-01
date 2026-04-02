package com.amazon.aps.iva.t5;

import android.os.SystemClock;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: RunnableFutureTask.java */
/* loaded from: classes.dex */
public abstract class w<R, E extends Exception> implements RunnableFuture<R> {
    public final f b = new f();
    public final f c = new f();
    public final Object d = new Object();
    public Exception e;
    public R f;
    public Thread g;
    public boolean h;

    public final void a() {
        this.c.b();
    }

    public abstract R c() throws Exception;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        synchronized (this.d) {
            if (!this.h) {
                f fVar = this.c;
                synchronized (fVar) {
                    z2 = fVar.a;
                }
                if (!z2) {
                    this.h = true;
                    b();
                    Thread thread = this.g;
                    if (thread != null) {
                        if (z) {
                            thread.interrupt();
                        }
                    } else {
                        this.b.c();
                        this.c.c();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        this.c.a();
        if (!this.h) {
            if (this.e == null) {
                return this.f;
            }
            throw new ExecutionException(this.e);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        f fVar = this.c;
        synchronized (fVar) {
            z = fVar.a;
        }
        return z;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.d) {
            if (this.h) {
                return;
            }
            this.g = Thread.currentThread();
            this.b.c();
            try {
                try {
                    this.f = c();
                    synchronized (this.d) {
                        this.c.c();
                        this.g = null;
                        Thread.interrupted();
                    }
                } catch (Exception e) {
                    this.e = e;
                    synchronized (this.d) {
                        this.c.c();
                        this.g = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.d) {
                    this.c.c();
                    this.g = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        f fVar = this.c;
        synchronized (fVar) {
            if (convert <= 0) {
                z = fVar.a;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = convert + elapsedRealtime;
                if (j2 < elapsedRealtime) {
                    fVar.a();
                } else {
                    while (!fVar.a && elapsedRealtime < j2) {
                        fVar.wait(j2 - elapsedRealtime);
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z = fVar.a;
            }
        }
        if (z) {
            if (!this.h) {
                if (this.e == null) {
                    return this.f;
                }
                throw new ExecutionException(this.e);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }

    public void b() {
    }
}
