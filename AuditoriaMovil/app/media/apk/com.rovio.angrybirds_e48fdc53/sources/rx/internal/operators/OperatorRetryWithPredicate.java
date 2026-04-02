package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func2;
import rx.internal.producers.ProducerArbiter;
import rx.schedulers.Schedulers;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class OperatorRetryWithPredicate<T> implements Observable.Operator<T, Observable<T>> {
    final Func2<Integer, Throwable, Boolean> a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorRetryWithPredicate(Func2<Integer, Throwable, Boolean> func2) {
        this.a = func2;
    }

    public Subscriber<? super Observable<T>> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = Schedulers.trampoline().createWorker();
        subscriber.add(createWorker);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        ProducerArbiter producerArbiter = new ProducerArbiter();
        subscriber.setProducer(producerArbiter);
        return new a(subscriber, this.a, createWorker, serialSubscription, producerArbiter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<Observable<T>> {
        final Subscriber<? super T> a;
        final Func2<Integer, Throwable, Boolean> b;
        final Scheduler.Worker c;
        final SerialSubscription d;
        final ProducerArbiter e;
        final AtomicInteger f = new AtomicInteger();

        public a(Subscriber<? super T> subscriber, Func2<Integer, Throwable, Boolean> func2, Scheduler.Worker worker, SerialSubscription serialSubscription, ProducerArbiter producerArbiter) {
            this.a = subscriber;
            this.b = func2;
            this.c = worker;
            this.d = serialSubscription;
            this.e = producerArbiter;
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.Observer
        /* renamed from: a */
        public void onNext(final Observable<T> observable) {
            this.c.schedule(new Action0() { // from class: rx.internal.operators.OperatorRetryWithPredicate.a.1
                @Override // rx.functions.Action0
                public void call() {
                    a.this.f.incrementAndGet();
                    Subscriber<T> subscriber = new Subscriber<T>() { // from class: rx.internal.operators.OperatorRetryWithPredicate.a.1.1
                        boolean a;

                        @Override // rx.Observer
                        public void onCompleted() {
                            if (!this.a) {
                                this.a = true;
                                a.this.a.onCompleted();
                            }
                        }

                        @Override // rx.Observer
                        public void onError(Throwable th) {
                            if (!this.a) {
                                this.a = true;
                                if (a.this.b.call(Integer.valueOf(a.this.f.get()), th).booleanValue() && !a.this.c.isUnsubscribed()) {
                                    a.this.c.schedule(this);
                                } else {
                                    a.this.a.onError(th);
                                }
                            }
                        }

                        @Override // rx.Observer
                        public void onNext(T t) {
                            if (!this.a) {
                                a.this.a.onNext(t);
                                a.this.e.produced(1L);
                            }
                        }

                        @Override // rx.Subscriber
                        public void setProducer(Producer producer) {
                            a.this.e.setProducer(producer);
                        }
                    };
                    a.this.d.set(subscriber);
                    observable.unsafeSubscribe(subscriber);
                }
            });
        }
    }
}
