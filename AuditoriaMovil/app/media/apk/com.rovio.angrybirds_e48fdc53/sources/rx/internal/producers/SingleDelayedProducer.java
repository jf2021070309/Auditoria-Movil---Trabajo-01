package rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
/* loaded from: classes4.dex */
public final class SingleDelayedProducer<T> extends AtomicInteger implements Producer {
    private static final long serialVersionUID = -2873467947112093874L;
    final Subscriber<? super T> a;
    T b;

    public SingleDelayedProducer(Subscriber<? super T> subscriber) {
        this.a = subscriber;
    }

    @Override // rx.Producer
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j != 0) {
            do {
                int i = get();
                if (i != 0) {
                    if (i == 1 && compareAndSet(1, 3)) {
                        a(this.a, this.b);
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public void setValue(T t) {
        do {
            int i = get();
            if (i == 0) {
                this.b = t;
            } else if (i == 2 && compareAndSet(2, 3)) {
                a(this.a, t);
                return;
            } else {
                return;
            }
        } while (!compareAndSet(0, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void a(Subscriber<? super T> subscriber, T t) {
        if (!subscriber.isUnsubscribed()) {
            try {
                subscriber.onNext(t);
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onCompleted();
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, subscriber, t);
            }
        }
    }
}
