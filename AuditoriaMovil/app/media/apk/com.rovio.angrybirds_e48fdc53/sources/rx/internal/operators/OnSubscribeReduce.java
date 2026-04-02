package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OnSubscribeReduce<T> implements Observable.OnSubscribe<T> {
    final Observable<T> a;
    final Func2<T, T, T> b;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeReduce(Observable<T> observable, Func2<T, T, T> func2) {
        this.a = observable;
        this.b = func2;
    }

    public void call(Subscriber<? super T> subscriber) {
        final a aVar = new a(subscriber, this.b);
        subscriber.add(aVar);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OnSubscribeReduce.1
            @Override // rx.Producer
            public void request(long j) {
                aVar.a(j);
            }
        });
        this.a.unsafeSubscribe(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> {
        static final Object d = new Object();
        final Subscriber<? super T> a;
        final Func2<T, T, T> b;
        T c = (T) d;
        boolean e;

        public a(Subscriber<? super T> subscriber, Func2<T, T, T> func2) {
            this.a = subscriber;
            this.b = func2;
            request(0L);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.e) {
                T t2 = this.c;
                if (t2 == d) {
                    this.c = t;
                    return;
                }
                try {
                    this.c = this.b.call(t2, t);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    unsubscribe();
                    onError(th);
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (!this.e) {
                this.e = true;
                this.a.onError(th);
                return;
            }
            RxJavaHooks.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.e) {
                this.e = true;
                T t = this.c;
                if (t != d) {
                    this.a.onNext(t);
                    this.a.onCompleted();
                    return;
                }
                this.a.onError(new NoSuchElementException());
            }
        }

        void a(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j != 0) {
                request(Long.MAX_VALUE);
            }
        }
    }
}
