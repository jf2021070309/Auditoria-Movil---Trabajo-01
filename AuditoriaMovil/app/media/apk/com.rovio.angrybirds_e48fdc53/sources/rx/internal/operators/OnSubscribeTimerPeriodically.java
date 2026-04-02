package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
/* loaded from: classes4.dex */
public final class OnSubscribeTimerPeriodically implements Observable.OnSubscribe<Long> {
    final long a;
    final long b;
    final TimeUnit c;
    final Scheduler d;

    public OnSubscribeTimerPeriodically(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = scheduler;
    }

    @Override // rx.functions.Action1
    public void call(final Subscriber<? super Long> subscriber) {
        final Scheduler.Worker createWorker = this.d.createWorker();
        subscriber.add(createWorker);
        createWorker.schedulePeriodically(new Action0() { // from class: rx.internal.operators.OnSubscribeTimerPeriodically.1
            long a;

            @Override // rx.functions.Action0
            public void call() {
                try {
                    Subscriber subscriber2 = subscriber;
                    long j = this.a;
                    this.a = 1 + j;
                    subscriber2.onNext(Long.valueOf(j));
                } catch (Throwable th) {
                    try {
                        createWorker.unsubscribe();
                    } finally {
                        Exceptions.throwOrReport(th, subscriber);
                    }
                }
            }
        }, this.a, this.b, this.c);
    }
}
