package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
/* loaded from: classes4.dex */
public final class OperatorSubscribeOn<T> implements Observable.OnSubscribe<T> {
    final Scheduler a;
    final Observable<T> b;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OperatorSubscribeOn(Observable<T> observable, Scheduler scheduler) {
        this.a = scheduler;
        this.b = observable;
    }

    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.a.createWorker();
        subscriber.add(createWorker);
        createWorker.schedule(new AnonymousClass1(subscriber, createWorker));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rx.internal.operators.OperatorSubscribeOn$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements Action0 {
        final /* synthetic */ Subscriber a;
        final /* synthetic */ Scheduler.Worker b;

        AnonymousClass1(Subscriber subscriber, Scheduler.Worker worker) {
            this.a = subscriber;
            this.b = worker;
        }

        @Override // rx.functions.Action0
        public void call() {
            final Thread currentThread = Thread.currentThread();
            OperatorSubscribeOn.this.b.unsafeSubscribe(new Subscriber<T>(this.a) { // from class: rx.internal.operators.OperatorSubscribeOn.1.1
                @Override // rx.Observer
                public void onNext(T t) {
                    AnonymousClass1.this.a.onNext(t);
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    try {
                        AnonymousClass1.this.a.onError(th);
                    } finally {
                        AnonymousClass1.this.b.unsubscribe();
                    }
                }

                @Override // rx.Observer
                public void onCompleted() {
                    try {
                        AnonymousClass1.this.a.onCompleted();
                    } finally {
                        AnonymousClass1.this.b.unsubscribe();
                    }
                }

                @Override // rx.Subscriber
                public void setProducer(final Producer producer) {
                    AnonymousClass1.this.a.setProducer(new Producer() { // from class: rx.internal.operators.OperatorSubscribeOn.1.1.1
                        @Override // rx.Producer
                        public void request(final long j) {
                            if (currentThread == Thread.currentThread()) {
                                producer.request(j);
                            } else {
                                AnonymousClass1.this.b.schedule(new Action0() { // from class: rx.internal.operators.OperatorSubscribeOn.1.1.1.1
                                    @Override // rx.functions.Action0
                                    public void call() {
                                        producer.request(j);
                                    }
                                });
                            }
                        }
                    });
                }
            });
        }
    }
}
