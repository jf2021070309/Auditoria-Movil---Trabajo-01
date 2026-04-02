package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
/* loaded from: classes4.dex */
public abstract class DeferredScalarSubscriber<T, R> extends Subscriber<T> {
    final AtomicInteger a = new AtomicInteger();
    protected final Subscriber<? super R> actual;
    protected boolean hasValue;
    protected R value;

    public DeferredScalarSubscriber(Subscriber<? super R> subscriber) {
        this.actual = subscriber;
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.value = null;
        this.actual.onError(th);
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            complete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void complete() {
        this.actual.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void complete(R r) {
        Subscriber<? super R> subscriber = this.actual;
        do {
            int i = this.a.get();
            if (i != 2 && i != 3 && !subscriber.isUnsubscribed()) {
                if (i == 1) {
                    subscriber.onNext(r);
                    if (!subscriber.isUnsubscribed()) {
                        subscriber.onCompleted();
                    }
                    this.a.lazySet(3);
                    return;
                }
                this.value = r;
            } else {
                return;
            }
        } while (!this.a.compareAndSet(0, 2));
    }

    final void a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }
        if (j != 0) {
            Subscriber<? super R> subscriber = this.actual;
            do {
                int i = this.a.get();
                if (i != 1 && i != 3 && !subscriber.isUnsubscribed()) {
                    if (i == 2) {
                        if (this.a.compareAndSet(2, 3)) {
                            subscriber.onNext((R) this.value);
                            if (!subscriber.isUnsubscribed()) {
                                subscriber.onCompleted();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.a.compareAndSet(0, 1));
        }
    }

    @Override // rx.Subscriber
    public final void setProducer(Producer producer) {
        producer.request(Long.MAX_VALUE);
    }

    public final void subscribeTo(Observable<? extends T> observable) {
        a();
        observable.unsafeSubscribe(this);
    }

    final void a() {
        Subscriber<? super R> subscriber = this.actual;
        subscriber.add(this);
        subscriber.setProducer(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a implements Producer {
        final DeferredScalarSubscriber<?, ?> a;

        public a(DeferredScalarSubscriber<?, ?> deferredScalarSubscriber) {
            this.a = deferredScalarSubscriber;
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.a(j);
        }
    }
}
