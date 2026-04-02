package com.flurry.sdk;

import com.flurry.sdk.md;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class kn<T extends md> {
    private static final String a = kn.class.getSimpleName();
    private final kf<Object, T> b = new kf<>();
    private final HashMap<T, Object> c = new HashMap<>();
    private final HashMap<T, Future<?>> d = new HashMap<>();
    private final ThreadPoolExecutor e;

    public kn(String str, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        this.e = new ThreadPoolExecutor(timeUnit, blockingQueue) { // from class: com.flurry.sdk.kn.1
            @Override // java.util.concurrent.ThreadPoolExecutor
            protected final void beforeExecute(Thread thread, Runnable runnable) {
                super.beforeExecute(thread, runnable);
                final md a2 = kn.a(runnable);
                if (a2 != null) {
                    new mc() { // from class: com.flurry.sdk.kn.1.1
                        @Override // com.flurry.sdk.mc
                        public final void a() {
                        }
                    }.run();
                }
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            protected final void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                final md a2 = kn.a(runnable);
                if (a2 != null) {
                    synchronized (kn.this.d) {
                        kn.this.d.remove(a2);
                    }
                    kn.this.a((kn) a2);
                    new mc() { // from class: com.flurry.sdk.kn.1.2
                        @Override // com.flurry.sdk.mc
                        public final void a() {
                        }
                    }.run();
                }
            }

            @Override // java.util.concurrent.AbstractExecutorService
            protected final <V> RunnableFuture<V> newTaskFor(Runnable runnable, V v) {
                km kmVar = new km(runnable, v);
                synchronized (kn.this.d) {
                    kn.this.d.put((md) runnable, kmVar);
                }
                return kmVar;
            }

            @Override // java.util.concurrent.AbstractExecutorService
            protected final <V> RunnableFuture<V> newTaskFor(Callable<V> callable) {
                throw new UnsupportedOperationException("Callable not supported");
            }
        };
        this.e.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy() { // from class: com.flurry.sdk.kn.2
            @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                super.rejectedExecution(runnable, threadPoolExecutor);
                final md a2 = kn.a(runnable);
                if (a2 != null) {
                    synchronized (kn.this.d) {
                        kn.this.d.remove(a2);
                    }
                    kn.this.a((kn) a2);
                    new mc() { // from class: com.flurry.sdk.kn.2.1
                        @Override // com.flurry.sdk.mc
                        public final void a() {
                        }
                    }.run();
                }
            }
        });
        this.e.setThreadFactory(new lt(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(T t) {
        b(this.c.get(t), t);
    }

    private synchronized void b(Object obj, T t) {
        this.b.b(obj, t);
        this.c.remove(t);
    }

    public final synchronized void a(Object obj, T t) {
        if (obj != null && t != null) {
            c(obj, t);
            this.e.submit(t);
        }
    }

    private synchronized void c(Object obj, T t) {
        this.b.a((kf<Object, T>) obj, t);
        this.c.put(t, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void a(Object obj) {
        if (obj != null) {
            HashSet<md> hashSet = new HashSet();
            hashSet.addAll(this.b.a((kf<Object, T>) obj));
            for (md mdVar : hashSet) {
                b((kn<T>) mdVar);
            }
        }
    }

    private synchronized void b(final T t) {
        Future<?> remove;
        if (t != null) {
            synchronized (this.d) {
                remove = this.d.remove(t);
            }
            a((kn<T>) t);
            if (remove != null) {
                remove.cancel(true);
            }
            new mc() { // from class: com.flurry.sdk.kn.3
                @Override // com.flurry.sdk.mc
                public final void a() {
                    t.h();
                }
            }.run();
        }
    }

    public final synchronized long b(Object obj) {
        return obj == null ? 0L : this.b.a((kf<Object, T>) obj).size();
    }

    static /* synthetic */ md a(Runnable runnable) {
        if (runnable instanceof km) {
            return (md) ((km) runnable).a();
        }
        if (runnable instanceof md) {
            return (md) runnable;
        }
        ko.a(6, a, "Unknown runnable class: " + runnable.getClass().getName());
        return null;
    }
}
