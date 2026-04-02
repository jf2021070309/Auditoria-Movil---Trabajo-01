package rx.internal.schedulers;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.util.RxThreadFactory;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class CachedThreadScheduler extends Scheduler implements SchedulerLifecycle {
    static final a c;
    final ThreadFactory d;
    final AtomicReference<a> e = new AtomicReference<>(c);
    private static final TimeUnit f = TimeUnit.SECONDS;
    static final c b = new c(RxThreadFactory.NONE);

    static {
        b.unsubscribe();
        c = new a(null, 0L, null);
        c.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        private final ThreadFactory a;
        private final long b;
        private final ConcurrentLinkedQueue<c> c;
        private final CompositeSubscription d;
        private final ScheduledExecutorService e;
        private final Future<?> f;

        a(final ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledFuture<?> scheduledFuture;
            ScheduledExecutorService scheduledExecutorService = null;
            this.a = threadFactory;
            this.b = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.c = new ConcurrentLinkedQueue<>();
            this.d = new CompositeSubscription();
            if (timeUnit != null) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: rx.internal.schedulers.CachedThreadScheduler.a.1
                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        Thread newThread = threadFactory.newThread(runnable);
                        newThread.setName(newThread.getName() + " (Evictor)");
                        return newThread;
                    }
                });
                NewThreadWorker.tryEnableCancelPolicy(newScheduledThreadPool);
                scheduledExecutorService = newScheduledThreadPool;
                scheduledFuture = newScheduledThreadPool.scheduleWithFixedDelay(new Runnable() { // from class: rx.internal.schedulers.CachedThreadScheduler.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.b();
                    }
                }, this.b, this.b, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.e = scheduledExecutorService;
            this.f = scheduledFuture;
        }

        c a() {
            if (this.d.isUnsubscribed()) {
                return CachedThreadScheduler.b;
            }
            while (!this.c.isEmpty()) {
                c poll = this.c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.a);
            this.d.add(cVar);
            return cVar;
        }

        void a(c cVar) {
            cVar.a(c() + this.b);
            this.c.offer(cVar);
        }

        void b() {
            if (!this.c.isEmpty()) {
                long c = c();
                Iterator<c> it = this.c.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.a() <= c) {
                        if (this.c.remove(next)) {
                            this.d.remove(next);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        long c() {
            return System.nanoTime();
        }

        void d() {
            try {
                if (this.f != null) {
                    this.f.cancel(true);
                }
                if (this.e != null) {
                    this.e.shutdownNow();
                }
            } finally {
                this.d.unsubscribe();
            }
        }
    }

    public CachedThreadScheduler(ThreadFactory threadFactory) {
        this.d = threadFactory;
        start();
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void start() {
        a aVar = new a(this.d, 60L, f);
        if (!this.e.compareAndSet(c, aVar)) {
            aVar.d();
        }
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        a aVar;
        do {
            aVar = this.e.get();
            if (aVar == c) {
                return;
            }
        } while (!this.e.compareAndSet(aVar, c));
        aVar.d();
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new b(this.e.get());
    }

    /* loaded from: classes4.dex */
    static final class b extends Scheduler.Worker implements Action0 {
        private final a c;
        private final c d;
        private final CompositeSubscription b = new CompositeSubscription();
        final AtomicBoolean a = new AtomicBoolean();

        b(a aVar) {
            this.c = aVar;
            this.d = aVar.a();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.a.compareAndSet(false, true)) {
                this.d.schedule(this);
            }
            this.b.unsubscribe();
        }

        @Override // rx.functions.Action0
        public void call() {
            this.c.a(this.d);
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.b.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return schedule(action0, 0L, null);
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(final Action0 action0, long j, TimeUnit timeUnit) {
            if (this.b.isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            ScheduledAction scheduleActual = this.d.scheduleActual(new Action0() { // from class: rx.internal.schedulers.CachedThreadScheduler.b.1
                @Override // rx.functions.Action0
                public void call() {
                    if (!b.this.isUnsubscribed()) {
                        action0.call();
                    }
                }
            }, j, timeUnit);
            this.b.add(scheduleActual);
            scheduleActual.addParent(this.b);
            return scheduleActual;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends NewThreadWorker {
        private long b;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.b = 0L;
        }

        public long a() {
            return this.b;
        }

        public void a(long j) {
            this.b = j;
        }
    }
}
