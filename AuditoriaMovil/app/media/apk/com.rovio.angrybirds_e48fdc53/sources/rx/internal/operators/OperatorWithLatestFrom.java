package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;
import rx.observers.SerializedSubscriber;
/* loaded from: classes4.dex */
public final class OperatorWithLatestFrom<T, U, R> implements Observable.Operator<R, T> {
    static final Object c = new Object();
    final Func2<? super T, ? super U, ? extends R> a;
    final Observable<? extends U> b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorWithLatestFrom(Observable<? extends U> observable, Func2<? super T, ? super U, ? extends R> func2) {
        this.b = observable;
        this.a = func2;
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        final SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber, false);
        subscriber.add(serializedSubscriber);
        final AtomicReference atomicReference = new AtomicReference(c);
        Subscriber subscriber2 = (Subscriber<T>) new Subscriber<T>(serializedSubscriber, true) { // from class: rx.internal.operators.OperatorWithLatestFrom.1
            @Override // rx.Observer
            public void onNext(T t) {
                Object obj = atomicReference.get();
                if (obj != OperatorWithLatestFrom.c) {
                    try {
                        serializedSubscriber.onNext(OperatorWithLatestFrom.this.a.call(t, obj));
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, this);
                    }
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                serializedSubscriber.onError(th);
                serializedSubscriber.unsubscribe();
            }

            @Override // rx.Observer
            public void onCompleted() {
                serializedSubscriber.onCompleted();
                serializedSubscriber.unsubscribe();
            }
        };
        Subscriber<U> subscriber3 = new Subscriber<U>() { // from class: rx.internal.operators.OperatorWithLatestFrom.2
            @Override // rx.Observer
            public void onNext(U u) {
                atomicReference.set(u);
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                serializedSubscriber.onError(th);
                serializedSubscriber.unsubscribe();
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (atomicReference.get() == OperatorWithLatestFrom.c) {
                    serializedSubscriber.onCompleted();
                    serializedSubscriber.unsubscribe();
                }
            }
        };
        serializedSubscriber.add(subscriber2);
        serializedSubscriber.add(subscriber3);
        this.b.unsafeSubscribe(subscriber3);
        return subscriber2;
    }
}
