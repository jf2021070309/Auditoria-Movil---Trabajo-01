package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
/* loaded from: classes4.dex */
public final class OnSubscribeTimerOnce implements Observable.OnSubscribe<Long> {
    final long a;
    final TimeUnit b;
    final Scheduler c;

    public OnSubscribeTimerOnce(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    @Override // rx.functions.Action1
    public void call(final Subscriber<? super Long> subscriber) {
        Scheduler.Worker createWorker = this.c.createWorker();
        subscriber.add(createWorker);
        createWorker.schedule(new Action0() { // from class: rx.internal.operators.OnSubscribeTimerOnce.1
            @Override // rx.functions.Action0
            public void call() {
                try {
                    subscriber.onNext(0L);
                    subscriber.onCompleted();
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, subscriber);
                }
            }
        }, this.a, this.b);
    }
}
