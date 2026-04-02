package rx.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class TrampolineScheduler extends Scheduler {
    public static final TrampolineScheduler INSTANCE = new TrampolineScheduler();

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new a();
    }

    private TrampolineScheduler() {
    }

    /* loaded from: classes4.dex */
    static final class a extends Scheduler.Worker implements Subscription {
        final AtomicInteger a = new AtomicInteger();
        final PriorityBlockingQueue<b> b = new PriorityBlockingQueue<>();
        private final BooleanSubscription c = new BooleanSubscription();
        private final AtomicInteger d = new AtomicInteger();

        a() {
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return a(action0, now());
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            long now = now() + timeUnit.toMillis(j);
            return a(new rx.internal.schedulers.b(action0, this, now), now);
        }

        private Subscription a(Action0 action0, long j) {
            if (this.c.isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            final b bVar = new b(action0, Long.valueOf(j), this.a.incrementAndGet());
            this.b.add(bVar);
            if (this.d.getAndIncrement() == 0) {
                do {
                    b poll = this.b.poll();
                    if (poll != null) {
                        poll.a.call();
                    }
                } while (this.d.decrementAndGet() > 0);
                return Subscriptions.unsubscribed();
            }
            return Subscriptions.create(new Action0() { // from class: rx.internal.schedulers.TrampolineScheduler.a.1
                @Override // rx.functions.Action0
                public void call() {
                    a.this.b.remove(bVar);
                }
            });
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.c.unsubscribe();
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b implements Comparable<b> {
        final Action0 a;
        final Long b;
        final int c;

        b(Action0 action0, Long l, int i) {
            this.a = action0;
            this.b = l;
            this.c = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            int compareTo = this.b.compareTo(bVar.b);
            if (compareTo == 0) {
                return TrampolineScheduler.a(this.c, bVar.c);
            }
            return compareTo;
        }
    }

    static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
