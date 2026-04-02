package i.a;

import i.a.u0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes2.dex */
public final class h0 extends u0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: g  reason: collision with root package name */
    public static final h0 f8996g;

    /* renamed from: h  reason: collision with root package name */
    public static final long f8997h;

    static {
        Long l2;
        h0 h0Var = new h0();
        f8996g = h0Var;
        h0Var.k0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f8997h = timeUnit.toNanos(l2.longValue());
    }

    @Override // i.a.u0, i.a.l0
    public p0 H(long j2, Runnable runnable, h.m.f fVar) {
        long a = w0.a(j2);
        if (a < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            u0.b bVar = new u0.b(a + nanoTime, runnable);
            u0(nanoTime, bVar);
            return bVar;
        }
        return r1.a;
    }

    @Override // i.a.v0
    public Thread n0() {
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

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        boolean r0;
        y1 y1Var = y1.a;
        y1.f9180b.set(this);
        try {
            synchronized (this) {
                if (w0()) {
                    z = false;
                } else {
                    z = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (!z) {
                if (r0) {
                    return;
                }
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long s0 = s0();
                if (s0 == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = f8997h + nanoTime;
                    }
                    long j3 = j2 - nanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        v0();
                        if (r0()) {
                            return;
                        }
                        n0();
                        return;
                    }
                    s0 = e.j.d.w.q(s0, j3);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (s0 > 0) {
                    if (w0()) {
                        _thread = null;
                        v0();
                        if (r0()) {
                            return;
                        }
                        n0();
                        return;
                    }
                    LockSupport.parkNanos(this, s0);
                }
            }
        } finally {
            _thread = null;
            v0();
            if (!r0()) {
                n0();
            }
        }
    }

    public final synchronized void v0() {
        if (w0()) {
            debugStatus = 3;
            t0();
            notifyAll();
        }
    }

    public final boolean w0() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }
}
