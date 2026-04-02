package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;
/* loaded from: classes4.dex */
public final class OnSubscribeReduceSeed<T, R> implements Observable.OnSubscribe<R> {
    final Observable<T> a;
    final R b;
    final Func2<R, ? super T, R> c;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeReduceSeed(Observable<T> observable, R r, Func2<R, ? super T, R> func2) {
        this.a = observable;
        this.b = r;
        this.c = func2;
    }

    public void call(Subscriber<? super R> subscriber) {
        new a(subscriber, this.b, this.c).subscribeTo(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, R> extends DeferredScalarSubscriber<T, R> {
        final Func2<R, ? super T, R> b;

        public a(Subscriber<? super R> subscriber, R r, Func2<R, ? super T, R> func2) {
            super(subscriber);
            this.value = r;
            this.hasValue = true;
            this.b = func2;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                this.value = this.b.call(this.value, t);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                this.actual.onError(th);
            }
        }
    }
}
