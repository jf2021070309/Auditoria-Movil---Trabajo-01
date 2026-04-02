package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.observers.Subscribers;
/* loaded from: classes4.dex */
public final class OnSubscribeDelaySubscriptionWithSelector<T, U> implements Observable.OnSubscribe<T> {
    final Observable<? extends T> a;
    final Func0<? extends Observable<U>> b;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeDelaySubscriptionWithSelector(Observable<? extends T> observable, Func0<? extends Observable<U>> func0) {
        this.a = observable;
        this.b = func0;
    }

    public void call(final Subscriber<? super T> subscriber) {
        try {
            this.b.call().take(1).unsafeSubscribe((Subscriber<U>) new Subscriber<U>() { // from class: rx.internal.operators.OnSubscribeDelaySubscriptionWithSelector.1
                @Override // rx.Observer
                public void onCompleted() {
                    OnSubscribeDelaySubscriptionWithSelector.this.a.unsafeSubscribe(Subscribers.wrap(subscriber));
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    subscriber.onError(th);
                }

                @Override // rx.Observer
                public void onNext(U u) {
                }
            });
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
        }
    }
}
