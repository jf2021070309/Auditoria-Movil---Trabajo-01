package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.Subscribers;
/* loaded from: classes4.dex */
public final class OnSubscribeDelaySubscription<T> implements Observable.OnSubscribe<T> {
    final Observable<? extends T> a;
    final long b;
    final TimeUnit c;
    final Scheduler d;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeDelaySubscription(Observable<? extends T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = observable;
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
    }

    public void call(final Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.d.createWorker();
        subscriber.add(createWorker);
        createWorker.schedule(new Action0() { // from class: rx.internal.operators.OnSubscribeDelaySubscription.1
            @Override // rx.functions.Action0
            public void call() {
                if (!subscriber.isUnsubscribed()) {
                    OnSubscribeDelaySubscription.this.a.unsafeSubscribe(Subscribers.wrap(subscriber));
                }
            }
        }, this.b, this.c);
    }
}
