package com.applovin.impl.sdk.utils;

import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class n {
    private final com.applovin.impl.sdk.m a;

    /* renamed from: b  reason: collision with root package name */
    private Timer f4367b;

    /* renamed from: c  reason: collision with root package name */
    private long f4368c;

    /* renamed from: d  reason: collision with root package name */
    private long f4369d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f4370e;

    /* renamed from: f  reason: collision with root package name */
    private long f4371f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f4372g = new Object();

    private n(com.applovin.impl.sdk.m mVar, Runnable runnable) {
        this.a = mVar;
        this.f4370e = runnable;
    }

    public static n a(long j2, com.applovin.impl.sdk.m mVar, Runnable runnable) {
        if (j2 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j2 + ".");
        } else if (runnable != null) {
            n nVar = new n(mVar, runnable);
            nVar.f4368c = System.currentTimeMillis();
            nVar.f4369d = j2;
            try {
                Timer timer = new Timer();
                nVar.f4367b = timer;
                timer.schedule(nVar.e(), j2);
            } catch (OutOfMemoryError e2) {
                mVar.B().b("Timer", "Failed to create timer due to OOM error", e2);
            }
            return nVar;
        } else {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
    }

    private TimerTask e() {
        return new TimerTask() { // from class: com.applovin.impl.sdk.utils.n.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    n.this.f4370e.run();
                    synchronized (n.this.f4372g) {
                        n.this.f4367b = null;
                    }
                } catch (Throwable th) {
                    try {
                        if (n.this.a != null) {
                            n.this.a.B().b("Timer", "Encountered error while executing timed task", th);
                        }
                        synchronized (n.this.f4372g) {
                            n.this.f4367b = null;
                        }
                    } catch (Throwable th2) {
                        synchronized (n.this.f4372g) {
                            n.this.f4367b = null;
                            throw th2;
                        }
                    }
                }
            }
        };
    }

    public long a() {
        if (this.f4367b != null) {
            return this.f4369d - (System.currentTimeMillis() - this.f4368c);
        }
        return this.f4369d - this.f4371f;
    }

    public void b() {
        synchronized (this.f4372g) {
            Timer timer = this.f4367b;
            if (timer != null) {
                timer.cancel();
                this.f4371f = Math.max(1L, System.currentTimeMillis() - this.f4368c);
                this.f4367b = null;
            }
        }
    }

    public void c() {
        synchronized (this.f4372g) {
            long j2 = this.f4371f;
            if (j2 > 0) {
                long j3 = this.f4369d - j2;
                this.f4369d = j3;
                if (j3 < 0) {
                    this.f4369d = 0L;
                }
                Timer timer = new Timer();
                this.f4367b = timer;
                timer.schedule(e(), this.f4369d);
                this.f4368c = System.currentTimeMillis();
                this.f4371f = 0L;
            }
        }
    }

    public void d() {
        synchronized (this.f4372g) {
            Timer timer = this.f4367b;
            if (timer != null) {
                timer.cancel();
                this.f4367b = null;
                this.f4371f = 0L;
            }
        }
    }
}
