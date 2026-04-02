package rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
/* loaded from: classes4.dex */
public final class SingleProducer<T> extends AtomicBoolean implements Producer {
    private static final long serialVersionUID = -3353584923995471404L;
    final Subscriber<? super T> a;
    final T b;

    public SingleProducer(Subscriber<? super T> subscriber, T t) {
        this.a = subscriber;
        this.b = t;
    }

    @Override // rx.Producer
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j != 0 && compareAndSet(false, true)) {
            Subscriber<? super T> subscriber = this.a;
            if (!subscriber.isUnsubscribed()) {
                Object obj = (T) this.b;
                try {
                    subscriber.onNext(obj);
                    if (!subscriber.isUnsubscribed()) {
                        subscriber.onCompleted();
                    }
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, subscriber, obj);
                }
            }
        }
    }
}
