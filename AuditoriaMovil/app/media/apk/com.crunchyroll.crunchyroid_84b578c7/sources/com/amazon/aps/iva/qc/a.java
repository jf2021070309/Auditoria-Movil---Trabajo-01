package com.amazon.aps.iva.qc;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: GlideExecutor.java */
/* loaded from: classes.dex */
public final class a implements ExecutorService {
    public static final long c = TimeUnit.SECONDS.toMillis(10);
    public static volatile int d;
    public final ExecutorService b;

    /* compiled from: GlideExecutor.java */
    /* renamed from: com.amazon.aps.iva.qc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ThreadFactoryC0640a implements ThreadFactory {

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.amazon.aps.iva.qc.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0641a extends Thread {
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new C0641a(runnable);
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {
        public final ThreadFactory a;
        public final String b;
        public final c c;
        public final boolean d;
        public final AtomicInteger e = new AtomicInteger();

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.amazon.aps.iva.qc.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0642a implements Runnable {
            public final /* synthetic */ Runnable b;

            public RunnableC0642a(Runnable runnable) {
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                if (bVar.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.b.run();
                } catch (Throwable th) {
                    bVar.c.a(th);
                }
            }
        }

        public b(ThreadFactoryC0640a threadFactoryC0640a, String str, c cVar, boolean z) {
            this.a = threadFactoryC0640a;
            this.b = str;
            this.c = cVar;
            this.d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = this.a.newThread(new RunnableC0642a(runnable));
            newThread.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
            return newThread;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes.dex */
    public interface c {
        public static final C0643a a = new C0643a();

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.amazon.aps.iva.qc.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0643a implements c {
            @Override // com.amazon.aps.iva.qc.a.c
            public final void a(Throwable th) {
                Log.isLoggable("GlideExecutor", 6);
            }
        }

        void a(Throwable th);
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.b = threadPoolExecutor;
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
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.b.invokeAny(collection);
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

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.b.submit(runnable);
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.b.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.b.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.b.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.b.submit(callable);
    }
}
