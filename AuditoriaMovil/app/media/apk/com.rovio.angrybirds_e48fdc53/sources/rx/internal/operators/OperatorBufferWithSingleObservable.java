package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.observers.SerializedSubscriber;
import rx.observers.Subscribers;
/* loaded from: classes4.dex */
public final class OperatorBufferWithSingleObservable<T, TClosing> implements Observable.Operator<List<T>, T> {
    final Func0<? extends Observable<? extends TClosing>> a;
    final int b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorBufferWithSingleObservable(Func0<? extends Observable<? extends TClosing>> func0, int i) {
        this.a = func0;
        this.b = i;
    }

    public OperatorBufferWithSingleObservable(final Observable<? extends TClosing> observable, int i) {
        this.a = new Func0<Observable<? extends TClosing>>() { // from class: rx.internal.operators.OperatorBufferWithSingleObservable.1
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            /* renamed from: a */
            public Observable<? extends TClosing> call() {
                return observable;
            }
        };
        this.b = i;
    }

    public Subscriber<? super T> call(Subscriber<? super List<T>> subscriber) {
        try {
            Observable<? extends TClosing> call = this.a.call();
            final a aVar = new a(new SerializedSubscriber(subscriber));
            Subscriber<TClosing> subscriber2 = new Subscriber<TClosing>() { // from class: rx.internal.operators.OperatorBufferWithSingleObservable.2
                @Override // rx.Observer
                public void onNext(TClosing tclosing) {
                    aVar.a();
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    aVar.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    aVar.onCompleted();
                }
            };
            subscriber.add(subscriber2);
            subscriber.add(aVar);
            call.unsafeSubscribe(subscriber2);
            return aVar;
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
            return Subscribers.empty();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class a extends Subscriber<T> {
        final Subscriber<? super List<T>> a;
        List<T> b;
        boolean c;

        public a(Subscriber<? super List<T>> subscriber) {
            this.a = subscriber;
            this.b = new ArrayList(OperatorBufferWithSingleObservable.this.b);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            synchronized (this) {
                if (!this.c) {
                    this.b.add(t);
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                if (!this.c) {
                    this.c = true;
                    this.b = null;
                    this.a.onError(th);
                    unsubscribe();
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                synchronized (this) {
                    if (!this.c) {
                        this.c = true;
                        List<T> list = this.b;
                        this.b = null;
                        this.a.onNext(list);
                        this.a.onCompleted();
                        unsubscribe();
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.a);
            }
        }

        void a() {
            synchronized (this) {
                if (!this.c) {
                    List<T> list = this.b;
                    this.b = new ArrayList(OperatorBufferWithSingleObservable.this.b);
                    try {
                        this.a.onNext(list);
                    } finally {
                    }
                }
            }
        }
    }
}
