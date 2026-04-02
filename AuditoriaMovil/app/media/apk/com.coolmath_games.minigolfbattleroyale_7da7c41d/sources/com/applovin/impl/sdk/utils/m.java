package com.applovin.impl.sdk.utils;

import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class m {
    private final com.applovin.impl.sdk.k a;
    private Timer b;
    private long c;
    private long d;
    private final Runnable e;
    private long f;
    private final Object g = new Object();

    private m(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.a = kVar;
        this.e = runnable;
    }

    public static m a(long j, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        } else if (runnable != null) {
            m mVar = new m(kVar, runnable);
            mVar.c = System.currentTimeMillis();
            mVar.d = j;
            try {
                Timer timer = new Timer();
                mVar.b = timer;
                timer.schedule(mVar.e(), j);
            } catch (OutOfMemoryError e) {
                kVar.z().b("Timer", "Failed to create timer due to OOM error", e);
            }
            return mVar;
        } else {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
    }

    private TimerTask e() {
        return new TimerTask() { // from class: com.applovin.impl.sdk.utils.m.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    m.this.e.run();
                    synchronized (m.this.g) {
                        m.this.b = null;
                    }
                } catch (Throwable th) {
                    try {
                        if (m.this.a != null) {
                            m.this.a.z().b("Timer", "Encountered error while executing timed task", th);
                        }
                        synchronized (m.this.g) {
                            m.this.b = null;
                        }
                    } catch (Throwable th2) {
                        synchronized (m.this.g) {
                            m.this.b = null;
                            throw th2;
                        }
                    }
                }
            }
        };
    }

    public long a() {
        if (this.b != null) {
            return this.d - (System.currentTimeMillis() - this.c);
        }
        return this.d - this.f;
    }

    public void b() {
        synchronized (this.g) {
            if (this.b != null) {
                this.b.cancel();
                this.f = Math.max(1L, System.currentTimeMillis() - this.c);
                this.b = null;
            }
        }
    }

    public void c() {
        synchronized (this.g) {
            if (this.f > 0) {
                long j = this.d - this.f;
                this.d = j;
                if (j < 0) {
                    this.d = 0L;
                }
                Timer timer = new Timer();
                this.b = timer;
                timer.schedule(e(), this.d);
                this.c = System.currentTimeMillis();
                this.f = 0L;
            }
        }
    }

    public void d() {
        synchronized (this.g) {
            if (this.b != null) {
                this.b.cancel();
                this.b = null;
                this.f = 0L;
            }
        }
    }
}
