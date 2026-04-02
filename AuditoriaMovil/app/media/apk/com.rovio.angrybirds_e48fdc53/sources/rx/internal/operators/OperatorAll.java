package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.internal.producers.SingleDelayedProducer;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OperatorAll<T> implements Observable.Operator<Boolean, T> {
    final Func1<? super T, Boolean> a;

    public OperatorAll(Func1<? super T, Boolean> func1) {
        this.a = func1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super Boolean> subscriber) {
        final SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        Subscriber subscriber2 = (Subscriber<T>) new Subscriber<T>() { // from class: rx.internal.operators.OperatorAll.1
            boolean a;

            @Override // rx.Observer
            public void onNext(T t) {
                if (!this.a) {
                    try {
                        if (!OperatorAll.this.a.call(t).booleanValue()) {
                            this.a = true;
                            singleDelayedProducer.setValue(false);
                            unsubscribe();
                        }
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, this, t);
                    }
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                if (!this.a) {
                    this.a = true;
                    subscriber.onError(th);
                    return;
                }
                RxJavaHooks.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (!this.a) {
                    this.a = true;
                    singleDelayedProducer.setValue(true);
                }
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(singleDelayedProducer);
        return subscriber2;
    }
}
