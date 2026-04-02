package rx.internal.operators;

import java.util.concurrent.TimeoutException;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.internal.producers.ProducerArbiter;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class a<T> implements Observable.Operator<T, T> {
    final InterfaceC0379a<T> a;
    final b<T> b;
    final Observable<? extends T> c;
    final Scheduler d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rx.internal.operators.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0379a<T> extends Func3<c<T>, Long, Scheduler.Worker, Subscription> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface b<T> extends Func4<c<T>, Long, T, Scheduler.Worker, Subscription> {
    }

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InterfaceC0379a<T> interfaceC0379a, b<T> bVar, Observable<? extends T> observable, Scheduler scheduler) {
        this.a = interfaceC0379a;
        this.b = bVar;
        this.c = observable;
        this.d = scheduler;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.d.createWorker();
        subscriber.add(createWorker);
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        serializedSubscriber.add(serialSubscription);
        c cVar = new c(serializedSubscriber, this.b, serialSubscription, this.c, createWorker);
        serializedSubscriber.add(cVar);
        serializedSubscriber.setProducer(cVar.f);
        serialSubscription.set(this.a.call(cVar, 0L, createWorker));
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> extends Subscriber<T> {
        final SerialSubscription a;
        final SerializedSubscriber<T> b;
        final b<T> c;
        final Observable<? extends T> d;
        final Scheduler.Worker e;
        final ProducerArbiter f = new ProducerArbiter();
        boolean g;
        long h;

        c(SerializedSubscriber<T> serializedSubscriber, b<T> bVar, SerialSubscription serialSubscription, Observable<? extends T> observable, Scheduler.Worker worker) {
            this.b = serializedSubscriber;
            this.c = bVar;
            this.a = serialSubscription;
            this.d = observable;
            this.e = worker;
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.f.setProducer(producer);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long j;
            boolean z = false;
            synchronized (this) {
                if (!this.g) {
                    j = this.h + 1;
                    this.h = j;
                    z = true;
                } else {
                    j = this.h;
                }
            }
            if (z) {
                this.b.onNext(t);
                this.a.set(this.c.call(this, Long.valueOf(j), t, this.e));
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            boolean z = true;
            synchronized (this) {
                if (this.g) {
                    z = false;
                } else {
                    this.g = true;
                }
            }
            if (z) {
                this.a.unsubscribe();
                this.b.onError(th);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            boolean z = true;
            synchronized (this) {
                if (this.g) {
                    z = false;
                } else {
                    this.g = true;
                }
            }
            if (z) {
                this.a.unsubscribe();
                this.b.onCompleted();
            }
        }

        public void a(long j) {
            boolean z = true;
            synchronized (this) {
                if (j != this.h || this.g) {
                    z = false;
                } else {
                    this.g = true;
                }
            }
            if (z) {
                if (this.d == null) {
                    this.b.onError(new TimeoutException());
                    return;
                }
                Subscriber<T> subscriber = new Subscriber<T>() { // from class: rx.internal.operators.a.c.1
                    @Override // rx.Observer
                    public void onNext(T t) {
                        c.this.b.onNext(t);
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th) {
                        c.this.b.onError(th);
                    }

                    @Override // rx.Observer
                    public void onCompleted() {
                        c.this.b.onCompleted();
                    }

                    @Override // rx.Subscriber
                    public void setProducer(Producer producer) {
                        c.this.f.setProducer(producer);
                    }
                };
                this.d.unsafeSubscribe(subscriber);
                this.a.set(subscriber);
            }
        }
    }
}
