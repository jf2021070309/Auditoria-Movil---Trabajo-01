package rx.internal.operators;

import java.util.Iterator;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;
import rx.observers.Subscribers;
/* loaded from: classes4.dex */
public final class OperatorZipIterable<T1, T2, R> implements Observable.Operator<R, T1> {
    final Iterable<? extends T2> a;
    final Func2<? super T1, ? super T2, ? extends R> b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorZipIterable(Iterable<? extends T2> iterable, Func2<? super T1, ? super T2, ? extends R> func2) {
        this.a = iterable;
        this.b = func2;
    }

    public Subscriber<? super T1> call(final Subscriber<? super R> subscriber) {
        final Iterator<? extends T2> it = this.a.iterator();
        try {
            if (!it.hasNext()) {
                subscriber.onCompleted();
                return Subscribers.empty();
            }
            return (Subscriber<T1>) new Subscriber<T1>(subscriber) { // from class: rx.internal.operators.OperatorZipIterable.1
                boolean a;

                @Override // rx.Observer
                public void onCompleted() {
                    if (!this.a) {
                        this.a = true;
                        subscriber.onCompleted();
                    }
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    if (this.a) {
                        Exceptions.throwIfFatal(th);
                        return;
                    }
                    this.a = true;
                    subscriber.onError(th);
                }

                @Override // rx.Observer
                public void onNext(T1 t1) {
                    if (!this.a) {
                        try {
                            subscriber.onNext(OperatorZipIterable.this.b.call(t1, (Object) it.next()));
                            if (!it.hasNext()) {
                                onCompleted();
                            }
                        } catch (Throwable th) {
                            Exceptions.throwOrReport(th, this);
                        }
                    }
                }
            };
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
            return Subscribers.empty();
        }
    }
}
