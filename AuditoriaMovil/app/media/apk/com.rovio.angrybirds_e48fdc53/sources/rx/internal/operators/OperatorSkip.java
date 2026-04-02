package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
/* loaded from: classes4.dex */
public final class OperatorSkip<T> implements Observable.Operator<T, T> {
    final int a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorSkip(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + i);
        }
        this.a = i;
    }

    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return (Subscriber<T>) new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkip.1
            int a;

            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                if (this.a >= OperatorSkip.this.a) {
                    subscriber.onNext(t);
                } else {
                    this.a++;
                }
            }

            @Override // rx.Subscriber
            public void setProducer(Producer producer) {
                subscriber.setProducer(producer);
                producer.request(OperatorSkip.this.a);
            }
        };
    }
}
