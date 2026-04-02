package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.Observable;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;
/* loaded from: classes4.dex */
public class OnSubscribeSingle<T> implements Single.OnSubscribe<T> {
    private final Observable<T> a;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public OnSubscribeSingle(Observable<T> observable) {
        this.a = observable;
    }

    public void call(final SingleSubscriber<? super T> singleSubscriber) {
        Subscriber<T> subscriber = new Subscriber<T>() { // from class: rx.internal.operators.OnSubscribeSingle.1
            private boolean c;
            private boolean d;
            private T e;

            @Override // rx.Subscriber
            public void onStart() {
                request(2L);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (!this.c) {
                    if (this.d) {
                        singleSubscriber.onSuccess(this.e);
                    } else {
                        singleSubscriber.onError(new NoSuchElementException("Observable emitted no items"));
                    }
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                singleSubscriber.onError(th);
                unsubscribe();
            }

            @Override // rx.Observer
            public void onNext(T t) {
                if (this.d) {
                    this.c = true;
                    singleSubscriber.onError(new IllegalArgumentException("Observable emitted too many elements"));
                    unsubscribe();
                    return;
                }
                this.d = true;
                this.e = t;
            }
        };
        singleSubscriber.add(subscriber);
        this.a.unsafeSubscribe(subscriber);
    }

    public static <T> OnSubscribeSingle<T> create(Observable<T> observable) {
        return new OnSubscribeSingle<>(observable);
    }
}
