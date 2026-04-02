package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.internal.producers.ProducerArbiter;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class OperatorSwitchIfEmpty<T> implements Observable.Operator<T, T> {
    private final Observable<? extends T> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorSwitchIfEmpty(Observable<? extends T> observable) {
        this.a = observable;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerialSubscription serialSubscription = new SerialSubscription();
        ProducerArbiter producerArbiter = new ProducerArbiter();
        b bVar = new b(subscriber, serialSubscription, producerArbiter, this.a);
        serialSubscription.set(bVar);
        subscriber.add(serialSubscription);
        subscriber.setProducer(producerArbiter);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends Subscriber<T> {
        private boolean a = true;
        private final Subscriber<? super T> b;
        private final SerialSubscription c;
        private final ProducerArbiter d;
        private final Observable<? extends T> e;

        b(Subscriber<? super T> subscriber, SerialSubscription serialSubscription, ProducerArbiter producerArbiter, Observable<? extends T> observable) {
            this.b = subscriber;
            this.c = serialSubscription;
            this.d = producerArbiter;
            this.e = observable;
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.d.setProducer(producer);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.a) {
                this.b.onCompleted();
            } else if (!this.b.isUnsubscribed()) {
                a();
            }
        }

        private void a() {
            a aVar = new a(this.b, this.d);
            this.c.set(aVar);
            this.e.unsafeSubscribe(aVar);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.a = false;
            this.b.onNext(t);
            this.d.produced(1L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> {
        private final ProducerArbiter a;
        private final Subscriber<? super T> b;

        a(Subscriber<? super T> subscriber, ProducerArbiter producerArbiter) {
            this.b = subscriber;
            this.a = producerArbiter;
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.a.setProducer(producer);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.b.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.b.onNext(t);
            this.a.produced(1L);
        }
    }
}
