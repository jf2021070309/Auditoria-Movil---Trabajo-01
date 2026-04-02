package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Notification;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.producers.ProducerArbiter;
import rx.observers.Subscribers;
import rx.schedulers.Schedulers;
import rx.subjects.BehaviorSubject;
import rx.subjects.SerializedSubject;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class OnSubscribeRedo<T> implements Observable.OnSubscribe<T> {
    static final Func1<Observable<? extends Notification<?>>, Observable<?>> d = new Func1<Observable<? extends Notification<?>>, Observable<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.1
        @Override // rx.functions.Func1
        /* renamed from: a */
        public Observable<?> call(Observable<? extends Notification<?>> observable) {
            return observable.map(new Func1<Notification<?>, Notification<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.1.1
                @Override // rx.functions.Func1
                /* renamed from: a */
                public Notification<?> call(Notification<?> notification) {
                    return Notification.createOnNext(null);
                }
            });
        }
    };
    final Observable<T> a;
    final boolean b;
    final boolean c;
    private final Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> e;
    private final Scheduler f;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    /* loaded from: classes4.dex */
    public static final class RedoFinite implements Func1<Observable<? extends Notification<?>>, Observable<?>> {
        final long a;

        public RedoFinite(long j) {
            this.a = j;
        }

        @Override // rx.functions.Func1
        public Observable<?> call(Observable<? extends Notification<?>> observable) {
            return observable.map(new Func1<Notification<?>, Notification<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.RedoFinite.1
                int a;

                @Override // rx.functions.Func1
                /* renamed from: a */
                public Notification<?> call(Notification<?> notification) {
                    if (RedoFinite.this.a != 0) {
                        this.a++;
                        if (this.a <= RedoFinite.this.a) {
                            return Notification.createOnNext(Integer.valueOf(this.a));
                        }
                        return notification;
                    }
                    return notification;
                }
            }).dematerialize();
        }
    }

    /* loaded from: classes4.dex */
    public static final class RetryWithPredicate implements Func1<Observable<? extends Notification<?>>, Observable<? extends Notification<?>>> {
        final Func2<Integer, Throwable, Boolean> a;

        public RetryWithPredicate(Func2<Integer, Throwable, Boolean> func2) {
            this.a = func2;
        }

        @Override // rx.functions.Func1
        public Observable<? extends Notification<?>> call(Observable<? extends Notification<?>> observable) {
            return observable.scan(Notification.createOnNext(0), new Func2<Notification<Integer>, Notification<?>, Notification<Integer>>() { // from class: rx.internal.operators.OnSubscribeRedo.RetryWithPredicate.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // rx.functions.Func2
                /* renamed from: a */
                public Notification<Integer> call(Notification<Integer> notification, Notification<?> notification2) {
                    int intValue = notification.getValue().intValue();
                    if (RetryWithPredicate.this.a.call(Integer.valueOf(intValue), notification2.getThrowable()).booleanValue()) {
                        return Notification.createOnNext(Integer.valueOf(intValue + 1));
                    }
                    return notification2;
                }
            });
        }
    }

    public static <T> Observable<T> retry(Observable<T> observable) {
        return retry(observable, d);
    }

    public static <T> Observable<T> retry(Observable<T> observable, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("count >= 0 expected");
        }
        return j == 0 ? observable : retry(observable, new RedoFinite(j));
    }

    public static <T> Observable<T> retry(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1) {
        return Observable.create(new OnSubscribeRedo(observable, func1, true, false, Schedulers.trampoline()));
    }

    public static <T> Observable<T> retry(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.create(new OnSubscribeRedo(observable, func1, true, false, scheduler));
    }

    public static <T> Observable<T> repeat(Observable<T> observable) {
        return repeat(observable, Schedulers.trampoline());
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Scheduler scheduler) {
        return repeat(observable, d, scheduler);
    }

    public static <T> Observable<T> repeat(Observable<T> observable, long j) {
        return repeat(observable, j, Schedulers.trampoline());
    }

    public static <T> Observable<T> repeat(Observable<T> observable, long j, Scheduler scheduler) {
        if (j == 0) {
            return Observable.empty();
        }
        if (j < 0) {
            throw new IllegalArgumentException("count >= 0 expected");
        }
        return repeat(observable, new RedoFinite(j - 1), scheduler);
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1) {
        return Observable.create(new OnSubscribeRedo(observable, func1, false, true, Schedulers.trampoline()));
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.create(new OnSubscribeRedo(observable, func1, false, true, scheduler));
    }

    public static <T> Observable<T> redo(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.create(new OnSubscribeRedo(observable, func1, false, false, scheduler));
    }

    private OnSubscribeRedo(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, boolean z, boolean z2, Scheduler scheduler) {
        this.a = observable;
        this.e = func1;
        this.b = z;
        this.c = z2;
        this.f = scheduler;
    }

    public void call(final Subscriber<? super T> subscriber) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final AtomicLong atomicLong = new AtomicLong();
        final Scheduler.Worker createWorker = this.f.createWorker();
        subscriber.add(createWorker);
        final SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        final SerializedSubject<T, T> serialized = BehaviorSubject.create().toSerialized();
        serialized.subscribe((Subscriber) Subscribers.empty());
        final ProducerArbiter producerArbiter = new ProducerArbiter();
        final Action0 action0 = new Action0() { // from class: rx.internal.operators.OnSubscribeRedo.2
            @Override // rx.functions.Action0
            public void call() {
                if (!subscriber.isUnsubscribed()) {
                    Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.internal.operators.OnSubscribeRedo.2.1
                        boolean a;

                        @Override // rx.Observer
                        public void onCompleted() {
                            if (!this.a) {
                                this.a = true;
                                unsubscribe();
                                serialized.onNext(Notification.createOnCompleted());
                            }
                        }

                        @Override // rx.Observer
                        public void onError(Throwable th) {
                            if (!this.a) {
                                this.a = true;
                                unsubscribe();
                                serialized.onNext(Notification.createOnError(th));
                            }
                        }

                        @Override // rx.Observer
                        public void onNext(T t) {
                            if (!this.a) {
                                subscriber.onNext(t);
                                a();
                                producerArbiter.produced(1L);
                            }
                        }

                        private void a() {
                            long j;
                            do {
                                j = atomicLong.get();
                                if (j == Long.MAX_VALUE) {
                                    return;
                                }
                            } while (!atomicLong.compareAndSet(j, j - 1));
                        }

                        @Override // rx.Subscriber
                        public void setProducer(Producer producer) {
                            producerArbiter.setProducer(producer);
                        }
                    };
                    serialSubscription.set(subscriber2);
                    OnSubscribeRedo.this.a.unsafeSubscribe(subscriber2);
                }
            }
        };
        final Observable<?> call = this.e.call(serialized.lift(new Observable.Operator<Notification<?>, Notification<?>>() { // from class: rx.internal.operators.OnSubscribeRedo.3
            @Override // rx.functions.Func1
            /* renamed from: a */
            public Subscriber<? super Notification<?>> call(final Subscriber<? super Notification<?>> subscriber2) {
                return new Subscriber<Notification<?>>(subscriber2) { // from class: rx.internal.operators.OnSubscribeRedo.3.1
                    @Override // rx.Observer
                    public void onCompleted() {
                        subscriber2.onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th) {
                        subscriber2.onError(th);
                    }

                    @Override // rx.Observer
                    /* renamed from: a */
                    public void onNext(Notification<?> notification) {
                        if (notification.isOnCompleted() && OnSubscribeRedo.this.b) {
                            subscriber2.onCompleted();
                        } else if (notification.isOnError() && OnSubscribeRedo.this.c) {
                            subscriber2.onError(notification.getThrowable());
                        } else {
                            subscriber2.onNext(notification);
                        }
                    }

                    @Override // rx.Subscriber
                    public void setProducer(Producer producer) {
                        producer.request(Long.MAX_VALUE);
                    }
                };
            }
        }));
        createWorker.schedule(new Action0() { // from class: rx.internal.operators.OnSubscribeRedo.4
            @Override // rx.functions.Action0
            public void call() {
                call.unsafeSubscribe(new Subscriber<Object>(subscriber) { // from class: rx.internal.operators.OnSubscribeRedo.4.1
                    @Override // rx.Observer
                    public void onCompleted() {
                        subscriber.onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th) {
                        subscriber.onError(th);
                    }

                    @Override // rx.Observer
                    public void onNext(Object obj) {
                        if (!subscriber.isUnsubscribed()) {
                            if (atomicLong.get() > 0) {
                                createWorker.schedule(action0);
                            } else {
                                atomicBoolean.compareAndSet(false, true);
                            }
                        }
                    }

                    @Override // rx.Subscriber
                    public void setProducer(Producer producer) {
                        producer.request(Long.MAX_VALUE);
                    }
                });
            }
        });
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OnSubscribeRedo.5
            @Override // rx.Producer
            public void request(long j) {
                if (j > 0) {
                    BackpressureUtils.getAndAddRequest(atomicLong, j);
                    producerArbiter.request(j);
                    if (atomicBoolean.compareAndSet(true, false)) {
                        createWorker.schedule(action0);
                    }
                }
            }
        });
    }
}
