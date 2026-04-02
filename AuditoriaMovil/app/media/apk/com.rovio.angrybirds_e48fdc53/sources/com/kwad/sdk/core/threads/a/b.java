package com.kwad.sdk.core.threads.a;

import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class b extends ThreadPoolExecutor implements c {
    public static volatile boolean avG = false;
    private final ConcurrentHashMap<Runnable, Long> avH;
    private long avI;
    private int avJ;

    public b(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        this.avH = new ConcurrentHashMap<>();
        this.avI = 0L;
        this.avJ = 0;
    }

    public b(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.avH = new ConcurrentHashMap<>();
        this.avI = 0L;
        this.avJ = 0;
    }

    @Override // com.kwad.sdk.core.threads.a.c
    public final long Dk() {
        return this.avI;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (avG && this.avH.containsKey(runnable) && this.avH.get(runnable) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.avH.get(runnable).longValue();
            if (elapsedRealtime >= 0 && elapsedRealtime < 1800000) {
                long j = this.avI;
                int i = this.avJ;
                this.avI = ((j * i) + elapsedRealtime) / (i + 1);
                this.avJ = i + 1;
            }
            this.avH.remove(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (avG) {
            this.avH.put(runnable, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        super.execute(runnable);
    }
}
