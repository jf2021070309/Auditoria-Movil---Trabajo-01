package rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.producers.SingleProducer;
import rx.internal.schedulers.EventLoopsScheduler;
import rx.observers.Subscribers;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class ScalarSynchronousObservable<T> extends Observable<T> {
    static final boolean c = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();
    final T b;

    static <T> Producer a(Subscriber<? super T> subscriber, T t) {
        return c ? new SingleProducer(subscriber, t) : new d(subscriber, t);
    }

    public static <T> ScalarSynchronousObservable<T> create(T t) {
        return new ScalarSynchronousObservable<>(t);
    }

    protected ScalarSynchronousObservable(T t) {
        super(RxJavaHooks.onCreate(new a(t)));
        this.b = t;
    }

    public T get() {
        return this.b;
    }

    public Observable<T> scalarScheduleOn(final Scheduler scheduler) {
        Func1<Action0, Subscription> func1;
        if (scheduler instanceof EventLoopsScheduler) {
            final EventLoopsScheduler eventLoopsScheduler = (EventLoopsScheduler) scheduler;
            func1 = new Func1<Action0, Subscription>() { // from class: rx.internal.util.ScalarSynchronousObservable.1
                @Override // rx.functions.Func1
                /* renamed from: a */
                public Subscription call(Action0 action0) {
                    return eventLoopsScheduler.scheduleDirect(action0);
                }
            };
        } else {
            func1 = new Func1<Action0, Subscription>() { // from class: rx.internal.util.ScalarSynchronousObservable.2
                @Override // rx.functions.Func1
                /* renamed from: a */
                public Subscription call(final Action0 action0) {
                    final Scheduler.Worker createWorker = scheduler.createWorker();
                    createWorker.schedule(new Action0() { // from class: rx.internal.util.ScalarSynchronousObservable.2.1
                        @Override // rx.functions.Action0
                        public void call() {
                            try {
                                action0.call();
                            } finally {
                                createWorker.unsubscribe();
                            }
                        }
                    });
                    return createWorker;
                }
            };
        }
        return create((Observable.OnSubscribe) new b(this.b, func1));
    }

    /* loaded from: classes4.dex */
    static final class a<T> implements Observable.OnSubscribe<T> {
        final T a;

        a(T t) {
            this.a = t;
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber<? super T> subscriber) {
            subscriber.setProducer(ScalarSynchronousObservable.a(subscriber, this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> implements Observable.OnSubscribe<T> {
        final T a;
        final Func1<Action0, Subscription> b;

        b(T t, Func1<Action0, Subscription> func1) {
            this.a = t;
            this.b = func1;
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber<? super T> subscriber) {
            subscriber.setProducer(new c(subscriber, this.a, this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> extends AtomicBoolean implements Producer, Action0 {
        private static final long serialVersionUID = -2466317989629281651L;
        final Subscriber<? super T> a;
        final T b;
        final Func1<Action0, Subscription> c;

        public c(Subscriber<? super T> subscriber, T t, Func1<Action0, Subscription> func1) {
            this.a = subscriber;
            this.b = t;
            this.c = func1;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j != 0 && compareAndSet(false, true)) {
                this.a.add(this.c.call(this));
            }
        }

        @Override // rx.functions.Action0
        public void call() {
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

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.b + ", " + get() + "]";
        }
    }

    public <R> Observable<R> scalarFlatMap(final Func1<? super T, ? extends Observable<? extends R>> func1) {
        return create((Observable.OnSubscribe) new Observable.OnSubscribe<R>() { // from class: rx.internal.util.ScalarSynchronousObservable.3
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(Subscriber<? super R> subscriber) {
                Observable observable = (Observable) func1.call(ScalarSynchronousObservable.this.b);
                if (observable instanceof ScalarSynchronousObservable) {
                    subscriber.setProducer(ScalarSynchronousObservable.a(subscriber, ((ScalarSynchronousObservable) observable).b));
                } else {
                    observable.unsafeSubscribe(Subscribers.wrap(subscriber));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d<T> implements Producer {
        final Subscriber<? super T> a;
        final T b;
        boolean c;

        public d(Subscriber<? super T> subscriber, T t) {
            this.a = subscriber;
            this.b = t;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (!this.c) {
                if (j < 0) {
                    throw new IllegalStateException("n >= required but it was " + j);
                }
                if (j != 0) {
                    this.c = true;
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
    }
}
