package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OperatorMapPair<T, U, R> implements Observable.Operator<Observable<? extends R>, T> {
    final Func1<? super T, ? extends Observable<? extends U>> a;
    final Func2<? super T, ? super U, ? extends R> b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public static <T, U> Func1<T, Observable<U>> convertSelector(final Func1<? super T, ? extends Iterable<? extends U>> func1) {
        return new Func1<T, Observable<U>>() { // from class: rx.internal.operators.OperatorMapPair.1
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Observable<U> call(T t) {
                return Observable.from((Iterable) Func1.this.call(t));
            }
        };
    }

    public OperatorMapPair(Func1<? super T, ? extends Observable<? extends U>> func1, Func2<? super T, ? super U, ? extends R> func2) {
        this.a = func1;
        this.b = func2;
    }

    public Subscriber<? super T> call(Subscriber<? super Observable<? extends R>> subscriber) {
        a aVar = new a(subscriber, this.a, this.b);
        subscriber.add(aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, U, R> extends Subscriber<T> {
        final Subscriber<? super Observable<? extends R>> a;
        final Func1<? super T, ? extends Observable<? extends U>> b;
        final Func2<? super T, ? super U, ? extends R> c;
        boolean d;

        public a(Subscriber<? super Observable<? extends R>> subscriber, Func1<? super T, ? extends Observable<? extends U>> func1, Func2<? super T, ? super U, ? extends R> func2) {
            this.a = subscriber;
            this.b = func1;
            this.c = func2;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                this.a.onNext(this.b.call(t).map(new b(t, this.c)));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.d) {
                RxJavaHooks.onError(th);
                return;
            }
            this.d = true;
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.d) {
                this.a.onCompleted();
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.a.setProducer(producer);
        }
    }

    /* loaded from: classes4.dex */
    static final class b<T, U, R> implements Func1<U, R> {
        final T a;
        final Func2<? super T, ? super U, ? extends R> b;

        public b(T t, Func2<? super T, ? super U, ? extends R> func2) {
            this.a = t;
            this.b = func2;
        }

        @Override // rx.functions.Func1
        public R call(U u) {
            return this.b.call((T) this.a, u);
        }
    }
}
