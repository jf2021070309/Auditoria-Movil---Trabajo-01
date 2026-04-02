package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.se0.y0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* compiled from: DefaultExecutor.kt */
/* loaded from: classes4.dex */
public final class k0 extends y0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final k0 i;
    public static final long j;

    static {
        Long l;
        k0 k0Var = new k0();
        i = k0Var;
        k0Var.M(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        j = timeUnit.toNanos(l.longValue());
    }

    @Override // com.amazon.aps.iva.se0.z0
    public final Thread c0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // com.amazon.aps.iva.se0.y0, com.amazon.aps.iva.se0.o0
    public final t0 h(long j2, Runnable runnable, com.amazon.aps.iva.ob0.g gVar) {
        long j3 = 0;
        if (j2 > 0) {
            if (j2 >= 9223372036854L) {
                j3 = Long.MAX_VALUE;
            } else {
                j3 = 1000000 * j2;
            }
        }
        if (j3 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            y0.b bVar = new y0.b(runnable, j3 + nanoTime);
            w0(nanoTime, bVar);
            return bVar;
        }
        return w1.b;
    }

    @Override // com.amazon.aps.iva.se0.z0
    public final void j0(long j2, y0.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // com.amazon.aps.iva.se0.y0
    public final void l0(Runnable runnable) {
        boolean z;
        if (debugStatus == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            super.l0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        g2.a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 != 2 && i2 != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z2 = true;
                }
            }
            if (!z2) {
                _thread = null;
                x0();
                if (!u0()) {
                    c0();
                    return;
                }
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long Z = Z();
                if (Z == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = j + nanoTime;
                    }
                    long j3 = j2 - nanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        x0();
                        if (!u0()) {
                            c0();
                            return;
                        }
                        return;
                    } else if (Z > j3) {
                        Z = j3;
                    }
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (Z > 0) {
                    int i3 = debugStatus;
                    if (i3 != 2 && i3 != 3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        _thread = null;
                        x0();
                        if (!u0()) {
                            c0();
                            return;
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, Z);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            x0();
            if (!u0()) {
                c0();
            }
            throw th;
        }
    }

    @Override // com.amazon.aps.iva.se0.y0, com.amazon.aps.iva.se0.x0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void x0() {
        boolean z;
        int i2 = debugStatus;
        if (i2 != 2 && i2 != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        debugStatus = 3;
        v0();
        notifyAll();
    }
}
