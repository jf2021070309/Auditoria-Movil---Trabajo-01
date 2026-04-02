package rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public class TestScheduler extends Scheduler {
    static long c;
    final Queue<c> b = new PriorityQueue(11, new a());
    long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c {
        final long a;
        final Action0 b;
        final Scheduler.Worker c;
        private final long d;

        c(Scheduler.Worker worker, long j, Action0 action0) {
            long j2 = TestScheduler.c;
            TestScheduler.c = 1 + j2;
            this.d = j2;
            this.a = j;
            this.b = action0;
            this.c = worker;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.a), this.b.toString());
        }
    }

    /* loaded from: classes4.dex */
    static final class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            if (cVar.a == cVar2.a) {
                if (cVar.d < cVar2.d) {
                    return -1;
                }
                return cVar.d > cVar2.d ? 1 : 0;
            } else if (cVar.a >= cVar2.a) {
                return cVar.a > cVar2.a ? 1 : 0;
            } else {
                return -1;
            }
        }
    }

    @Override // rx.Scheduler
    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.d);
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.d + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        a(timeUnit.toNanos(j));
    }

    public void triggerActions() {
        a(this.d);
    }

    private void a(long j) {
        while (!this.b.isEmpty()) {
            c peek = this.b.peek();
            if (peek.a > j) {
                break;
            }
            this.d = peek.a == 0 ? this.d : peek.a;
            this.b.remove();
            if (!peek.c.isUnsubscribed()) {
                peek.b.call();
            }
        }
        this.d = j;
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new b();
    }

    /* loaded from: classes4.dex */
    final class b extends Scheduler.Worker {
        private final BooleanSubscription b = new BooleanSubscription();

        b() {
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.b.unsubscribe();
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.b.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            final c cVar = new c(this, TestScheduler.this.d + timeUnit.toNanos(j), action0);
            TestScheduler.this.b.add(cVar);
            return Subscriptions.create(new Action0() { // from class: rx.schedulers.TestScheduler.b.1
                @Override // rx.functions.Action0
                public void call() {
                    TestScheduler.this.b.remove(cVar);
                }
            });
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            final c cVar = new c(this, 0L, action0);
            TestScheduler.this.b.add(cVar);
            return Subscriptions.create(new Action0() { // from class: rx.schedulers.TestScheduler.b.2
                @Override // rx.functions.Action0
                public void call() {
                    TestScheduler.this.b.remove(cVar);
                }
            });
        }

        @Override // rx.Scheduler.Worker
        public long now() {
            return TestScheduler.this.now();
        }
    }
}
