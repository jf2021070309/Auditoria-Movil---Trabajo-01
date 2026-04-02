package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action2;
import rx.functions.Func0;
/* loaded from: classes4.dex */
public final class OnSubscribeCollect<T, R> implements Observable.OnSubscribe<R> {
    final Observable<T> a;
    final Func0<R> b;
    final Action2<R, ? super T> c;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeCollect(Observable<T> observable, Func0<R> func0, Action2<R, ? super T> action2) {
        this.a = observable;
        this.b = func0;
        this.c = action2;
    }

    public void call(Subscriber<? super R> subscriber) {
        try {
            new a(subscriber, this.b.call(), this.c).subscribeTo(this.a);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, R> extends DeferredScalarSubscriberSafe<T, R> {
        final Action2<R, ? super T> b;

        public a(Subscriber<? super R> subscriber, R r, Action2<R, ? super T> action2) {
            super(subscriber);
            this.value = r;
            this.hasValue = true;
            this.b = action2;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.done) {
                try {
                    this.b.call(this.value, t);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    unsubscribe();
                    onError(th);
                }
            }
        }
    }
}
