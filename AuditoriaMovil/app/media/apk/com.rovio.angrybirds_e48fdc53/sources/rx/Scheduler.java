package rx;

import java.util.concurrent.TimeUnit;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.schedulers.SchedulerWhen;
import rx.internal.subscriptions.SequentialSubscription;
/* loaded from: classes4.dex */
public abstract class Scheduler {
    static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    public abstract Worker createWorker();

    /* loaded from: classes4.dex */
    public static abstract class Worker implements Subscription {
        public abstract Subscription schedule(Action0 action0);

        public abstract Subscription schedule(Action0 action0, long j, TimeUnit timeUnit);

        public Subscription schedulePeriodically(final Action0 action0, long j, long j2, TimeUnit timeUnit) {
            final long nanos = timeUnit.toNanos(j2);
            final long nanos2 = TimeUnit.MILLISECONDS.toNanos(now());
            final long nanos3 = nanos2 + timeUnit.toNanos(j);
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            final SequentialSubscription sequentialSubscription2 = new SequentialSubscription(sequentialSubscription);
            sequentialSubscription.replace(schedule(new Action0() { // from class: rx.Scheduler.Worker.1
                long a;
                long b;
                long c;

                {
                    this.b = nanos2;
                    this.c = nanos3;
                }

                @Override // rx.functions.Action0
                public void call() {
                    long j3;
                    action0.call();
                    if (!sequentialSubscription2.isUnsubscribed()) {
                        long nanos4 = TimeUnit.MILLISECONDS.toNanos(Worker.this.now());
                        if (Scheduler.a + nanos4 < this.b || nanos4 >= this.b + nanos + Scheduler.a) {
                            j3 = nanos + nanos4;
                            long j4 = nanos;
                            long j5 = this.a + 1;
                            this.a = j5;
                            this.c = j3 - (j4 * j5);
                        } else {
                            long j6 = this.c;
                            long j7 = this.a + 1;
                            this.a = j7;
                            j3 = j6 + (j7 * nanos);
                        }
                        this.b = nanos4;
                        sequentialSubscription2.replace(Worker.this.schedule(this, j3 - nanos4, TimeUnit.NANOSECONDS));
                    }
                }
            }, j, timeUnit));
            return sequentialSubscription2;
        }

        public long now() {
            return System.currentTimeMillis();
        }
    }

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends Scheduler & Subscription> S when(Func1<Observable<Observable<Completable>>, Completable> func1) {
        return new SchedulerWhen(func1, this);
    }
}
