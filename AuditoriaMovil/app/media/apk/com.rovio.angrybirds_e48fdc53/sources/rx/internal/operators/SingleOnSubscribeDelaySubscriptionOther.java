package rx.internal.operators;

import rx.Observable;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class SingleOnSubscribeDelaySubscriptionOther<T> implements Single.OnSubscribe<T> {
    final Single<? extends T> a;
    final Observable<?> b;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public SingleOnSubscribeDelaySubscriptionOther(Single<? extends T> single, Observable<?> observable) {
        this.a = single;
        this.b = observable;
    }

    public void call(final SingleSubscriber<? super T> singleSubscriber) {
        final SingleSubscriber<T> singleSubscriber2 = new SingleSubscriber<T>() { // from class: rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther.1
            @Override // rx.SingleSubscriber
            public void onSuccess(T t) {
                singleSubscriber.onSuccess(t);
            }

            @Override // rx.SingleSubscriber
            public void onError(Throwable th) {
                singleSubscriber.onError(th);
            }
        };
        final SerialSubscription serialSubscription = new SerialSubscription();
        singleSubscriber.add(serialSubscription);
        Subscriber<? super Object> subscriber = new Subscriber<Object>() { // from class: rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther.2
            boolean a;

            @Override // rx.Observer
            public void onNext(Object obj) {
                onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                if (this.a) {
                    RxJavaHooks.onError(th);
                    return;
                }
                this.a = true;
                singleSubscriber2.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (!this.a) {
                    this.a = true;
                    serialSubscription.set(singleSubscriber2);
                    SingleOnSubscribeDelaySubscriptionOther.this.a.subscribe(singleSubscriber2);
                }
            }
        };
        serialSubscription.set(subscriber);
        this.b.subscribe(subscriber);
    }
}
