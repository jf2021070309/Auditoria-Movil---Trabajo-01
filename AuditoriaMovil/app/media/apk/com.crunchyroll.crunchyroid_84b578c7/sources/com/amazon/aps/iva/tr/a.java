package com.amazon.aps.iva.tr;

import com.amazon.aps.iva.ur.e;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: CommonTaskExecutor.java */
/* loaded from: classes2.dex */
public final class a extends AbstractExecutorService {
    public static final a c = new a();
    public final ScheduledExecutorService b;

    /* compiled from: CommonTaskExecutor.java */
    /* renamed from: com.amazon.aps.iva.tr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class RunnableC0747a<T> implements Runnable {
        public final WeakReference<T> b;
        public final c<T> c;
        public volatile ScheduledFuture<?> d;

        public RunnableC0747a(Object obj) {
            e.b bVar = e.b.a;
            this.d = null;
            this.b = new WeakReference<>(obj);
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            T t = this.b.get();
            if (t != null) {
                ((e.b) this.c).getClass();
                ((e.a) t).run();
            } else if (this.d != null) {
                this.d.cancel(false);
            }
        }
    }

    /* compiled from: CommonTaskExecutor.java */
    /* loaded from: classes2.dex */
    public static final class b extends Thread {
        public final ScheduledExecutorService b;

        public b(ScheduledExecutorService scheduledExecutorService) {
            super("dd-exec-shutdown-hook");
            this.b = scheduledExecutorService;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ScheduledExecutorService scheduledExecutorService = this.b;
            scheduledExecutorService.shutdown();
            try {
                if (!scheduledExecutorService.awaitTermination(5L, TimeUnit.SECONDS)) {
                    scheduledExecutorService.shutdownNow();
                }
            } catch (InterruptedException unused) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    /* compiled from: CommonTaskExecutor.java */
    /* loaded from: classes2.dex */
    public interface c<T> {
    }

    public a() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(com.amazon.aps.iva.tr.b.a);
        this.b = newSingleThreadScheduledExecutor;
        try {
            Runtime.getRuntime().addShutdownHook(new b(newSingleThreadScheduledExecutor));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.b.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.b.shutdownNow();
    }
}
