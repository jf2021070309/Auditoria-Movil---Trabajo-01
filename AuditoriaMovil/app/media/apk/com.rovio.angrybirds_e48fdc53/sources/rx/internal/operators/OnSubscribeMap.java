package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OnSubscribeMap<T, R> implements Observable.OnSubscribe<R> {
    final Observable<T> a;
    final Func1<? super T, ? extends R> b;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeMap(Observable<T> observable, Func1<? super T, ? extends R> func1) {
        this.a = observable;
        this.b = func1;
    }

    public void call(Subscriber<? super R> subscriber) {
        a aVar = new a(subscriber, this.b);
        subscriber.add(aVar);
        this.a.unsafeSubscribe(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, R> extends Subscriber<T> {
        final Subscriber<? super R> a;
        final Func1<? super T, ? extends R> b;
        boolean c;

        public a(Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1) {
            this.a = subscriber;
            this.b = func1;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                this.a.onNext(this.b.call(t));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.c) {
                RxJavaHooks.onError(th);
                return;
            }
            this.c = true;
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.c) {
                this.a.onCompleted();
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.a.setProducer(producer);
        }
    }
}
