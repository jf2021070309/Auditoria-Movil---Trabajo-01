package rx.internal.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.GenericScheduledExecutorService;
import rx.internal.schedulers.SchedulerLifecycle;
import rx.internal.util.unsafe.MpmcArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public abstract class ObjectPool<T> implements SchedulerLifecycle {
    Queue<T> a;
    final int b;
    final int c;
    private final long d;
    private final AtomicReference<Future<?>> e;

    protected abstract T createObject();

    public ObjectPool() {
        this(0, 0, 67L);
    }

    private ObjectPool(int i, int i2, long j) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = new AtomicReference<>();
        a(i);
        start();
    }

    public T borrowObject() {
        T poll = this.a.poll();
        if (poll == null) {
            return createObject();
        }
        return poll;
    }

    public void returnObject(T t) {
        if (t != null) {
            this.a.offer(t);
        }
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        Future<?> andSet = this.e.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void start() {
        while (this.e.get() == null) {
            try {
                ScheduledFuture<?> scheduleAtFixedRate = GenericScheduledExecutorService.getInstance().scheduleAtFixedRate(new Runnable() { // from class: rx.internal.util.ObjectPool.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public void run() {
                        int i = 0;
                        int size = ObjectPool.this.a.size();
                        if (size < ObjectPool.this.b) {
                            int i2 = ObjectPool.this.c - size;
                            while (i < i2) {
                                ObjectPool.this.a.add(ObjectPool.this.createObject());
                                i++;
                            }
                        } else if (size > ObjectPool.this.c) {
                            int i3 = size - ObjectPool.this.c;
                            while (i < i3) {
                                ObjectPool.this.a.poll();
                                i++;
                            }
                        }
                    }
                }, this.d, this.d, TimeUnit.SECONDS);
                if (!this.e.compareAndSet(null, scheduleAtFixedRate)) {
                    scheduleAtFixedRate.cancel(false);
                } else {
                    return;
                }
            } catch (RejectedExecutionException e) {
                RxJavaHooks.onError(e);
                return;
            }
        }
    }

    private void a(int i) {
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.a = new MpmcArrayQueue(Math.max(this.c, 1024));
        } else {
            this.a = new ConcurrentLinkedQueue();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.a.add(createObject());
        }
    }
}
