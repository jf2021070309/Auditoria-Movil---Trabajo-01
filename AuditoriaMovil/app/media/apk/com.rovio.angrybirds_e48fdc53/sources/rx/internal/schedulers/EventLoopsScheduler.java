package rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.util.RxThreadFactory;
import rx.internal.util.SubscriptionList;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class EventLoopsScheduler extends Scheduler implements SchedulerLifecycle {
    static final int b;
    static final c c;
    static final b d;
    final ThreadFactory e;
    final AtomicReference<b> f = new AtomicReference<>(d);

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        b = intValue;
        c = new c(RxThreadFactory.NONE);
        c.unsubscribe();
        d = new b(null, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {
        final int a;
        final c[] b;
        long c;

        b(ThreadFactory threadFactory, int i) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.a;
            if (i == 0) {
                return EventLoopsScheduler.c;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % i)];
        }

        public void b() {
            for (c cVar : this.b) {
                cVar.unsubscribe();
            }
        }
    }

    public EventLoopsScheduler(ThreadFactory threadFactory) {
        this.e = threadFactory;
        start();
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new a(this.f.get().a());
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void start() {
        b bVar = new b(this.e, b);
        if (!this.f.compareAndSet(d, bVar)) {
            bVar.b();
        }
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        b bVar;
        do {
            bVar = this.f.get();
            if (bVar == d) {
                return;
            }
        } while (!this.f.compareAndSet(bVar, d));
        bVar.b();
    }

    public Subscription scheduleDirect(Action0 action0) {
        return this.f.get().a().scheduleActual(action0, -1L, TimeUnit.NANOSECONDS);
    }

    /* loaded from: classes4.dex */
    static final class a extends Scheduler.Worker {
        private final SubscriptionList a = new SubscriptionList();
        private final CompositeSubscription b = new CompositeSubscription();
        private final SubscriptionList c = new SubscriptionList(this.a, this.b);
        private final c d;

        a(c cVar) {
            this.d = cVar;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.c.unsubscribe();
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(final Action0 action0) {
            return isUnsubscribed() ? Subscriptions.unsubscribed() : this.d.scheduleActual(new Action0() { // from class: rx.internal.schedulers.EventLoopsScheduler.a.1
                @Override // rx.functions.Action0
                public void call() {
                    if (!a.this.isUnsubscribed()) {
                        action0.call();
                    }
                }
            }, 0L, (TimeUnit) null, this.a);
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(final Action0 action0, long j, TimeUnit timeUnit) {
            return isUnsubscribed() ? Subscriptions.unsubscribed() : this.d.scheduleActual(new Action0() { // from class: rx.internal.schedulers.EventLoopsScheduler.a.2
                @Override // rx.functions.Action0
                public void call() {
                    if (!a.this.isUnsubscribed()) {
                        action0.call();
                    }
                }
            }, j, timeUnit, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends NewThreadWorker {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
