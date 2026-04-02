package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OnSubscribeLift<T, R> implements Observable.OnSubscribe<R> {
    final Observable.OnSubscribe<T> a;
    final Observable.Operator<? extends R, ? super T> b;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeLift(Observable.OnSubscribe<T> onSubscribe, Observable.Operator<? extends R, ? super T> operator) {
        this.a = onSubscribe;
        this.b = operator;
    }

    public void call(Subscriber<? super R> subscriber) {
        try {
            Subscriber<? super T> call = RxJavaHooks.onObservableLift(this.b).call(subscriber);
            call.onStart();
            this.a.call(call);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }
}
