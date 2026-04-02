package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.observers.Subscribers;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OnSubscribeDelaySubscriptionOther<T, U> implements Observable.OnSubscribe<T> {
    final Observable<? extends T> a;
    final Observable<U> b;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeDelaySubscriptionOther(Observable<? extends T> observable, Observable<U> observable2) {
        this.a = observable;
        this.b = observable2;
    }

    public void call(Subscriber<? super T> subscriber) {
        final SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        final Subscriber wrap = Subscribers.wrap(subscriber);
        Subscriber<U> subscriber2 = new Subscriber<U>() { // from class: rx.internal.operators.OnSubscribeDelaySubscriptionOther.1
            boolean a;

            @Override // rx.Observer
            public void onNext(U u) {
                onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                if (this.a) {
                    RxJavaHooks.onError(th);
                    return;
                }
                this.a = true;
                wrap.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (!this.a) {
                    this.a = true;
                    serialSubscription.set(Subscriptions.unsubscribed());
                    OnSubscribeDelaySubscriptionOther.this.a.unsafeSubscribe(wrap);
                }
            }
        };
        serialSubscription.set(subscriber2);
        this.b.unsafeSubscribe(subscriber2);
    }
}
