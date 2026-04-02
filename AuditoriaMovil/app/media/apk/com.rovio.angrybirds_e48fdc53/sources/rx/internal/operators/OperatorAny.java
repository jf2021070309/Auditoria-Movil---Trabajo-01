package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.internal.producers.SingleDelayedProducer;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OperatorAny<T> implements Observable.Operator<Boolean, T> {
    final Func1<? super T, Boolean> a;
    final boolean b;

    public OperatorAny(Func1<? super T, Boolean> func1, boolean z) {
        this.a = func1;
        this.b = z;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super Boolean> subscriber) {
        final SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        Subscriber subscriber2 = (Subscriber<T>) new Subscriber<T>() { // from class: rx.internal.operators.OperatorAny.1
            boolean a;
            boolean b;

            @Override // rx.Observer
            public void onNext(T t) {
                if (!this.b) {
                    this.a = true;
                    try {
                        if (OperatorAny.this.a.call(t).booleanValue()) {
                            this.b = true;
                            singleDelayedProducer.setValue(Boolean.valueOf(!OperatorAny.this.b));
                            unsubscribe();
                        }
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, this, t);
                    }
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                if (!this.b) {
                    this.b = true;
                    subscriber.onError(th);
                    return;
                }
                RxJavaHooks.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (!this.b) {
                    this.b = true;
                    if (this.a) {
                        singleDelayedProducer.setValue(false);
                    } else {
                        singleDelayedProducer.setValue(Boolean.valueOf(OperatorAny.this.b));
                    }
                }
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(singleDelayedProducer);
        return subscriber2;
    }
}
