package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Func1;
import rx.internal.producers.ProducerArbiter;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.observers.SerializedSubscriber;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class OnSubscribeConcatMap<T, R> implements Observable.OnSubscribe<R> {
    public static final int BOUNDARY = 1;
    public static final int END = 2;
    public static final int IMMEDIATE = 0;
    final Observable<? extends T> a;
    final Func1<? super T, ? extends Observable<? extends R>> b;
    final int c;
    final int d;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeConcatMap(Observable<? extends T> observable, Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2) {
        this.a = observable;
        this.b = func1;
        this.c = i;
        this.d = i2;
    }

    public void call(Subscriber<? super R> subscriber) {
        final c cVar = new c(this.d == 0 ? new SerializedSubscriber<>(subscriber) : subscriber, this.b, this.c, this.d);
        subscriber.add(cVar);
        subscriber.add(cVar.h);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OnSubscribeConcatMap.1
            @Override // rx.Producer
            public void request(long j) {
                cVar.a(j);
            }
        });
        if (!subscriber.isUnsubscribed()) {
            this.a.unsafeSubscribe(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T, R> extends Subscriber<T> {
        final Subscriber<? super R> a;
        final Func1<? super T, ? extends Observable<? extends R>> b;
        final int c;
        final Queue<Object> e;
        final SerialSubscription h;
        volatile boolean i;
        volatile boolean j;
        final ProducerArbiter d = new ProducerArbiter();
        final AtomicInteger f = new AtomicInteger();
        final AtomicReference<Throwable> g = new AtomicReference<>();

        public c(Subscriber<? super R> subscriber, Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2) {
            Queue<Object> spscAtomicArrayQueue;
            this.a = subscriber;
            this.b = func1;
            this.c = i2;
            if (UnsafeAccess.isUnsafeAvailable()) {
                spscAtomicArrayQueue = new SpscArrayQueue<>(i);
            } else {
                spscAtomicArrayQueue = new SpscAtomicArrayQueue<>(i);
            }
            this.e = spscAtomicArrayQueue;
            this.h = new SerialSubscription();
            request(i);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.e.offer(NotificationLite.instance().next(t))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            a();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (ExceptionsUtils.addThrowable(this.g, th)) {
                this.i = true;
                if (this.c == 0) {
                    Throwable terminate = ExceptionsUtils.terminate(this.g);
                    if (!ExceptionsUtils.isTerminated(terminate)) {
                        this.a.onError(terminate);
                    }
                    this.h.unsubscribe();
                    return;
                }
                a();
                return;
            }
            a(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.i = true;
            a();
        }

        void a(long j) {
            if (j > 0) {
                this.d.request(j);
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        void a(R r) {
            this.a.onNext(r);
        }

        void a(Throwable th, long j) {
            if (!ExceptionsUtils.addThrowable(this.g, th)) {
                a(th);
            } else if (this.c == 0) {
                Throwable terminate = ExceptionsUtils.terminate(this.g);
                if (!ExceptionsUtils.isTerminated(terminate)) {
                    this.a.onError(terminate);
                }
                unsubscribe();
            } else {
                if (j != 0) {
                    this.d.produced(j);
                }
                this.j = false;
                a();
            }
        }

        void b(long j) {
            if (j != 0) {
                this.d.produced(j);
            }
            this.j = false;
            a();
        }

        void a(Throwable th) {
            RxJavaHooks.onError(th);
        }

        void a() {
            if (this.f.getAndIncrement() == 0) {
                int i = this.c;
                while (!this.a.isUnsubscribed()) {
                    if (!this.j) {
                        if (i == 1 && this.g.get() != null) {
                            Throwable terminate = ExceptionsUtils.terminate(this.g);
                            if (!ExceptionsUtils.isTerminated(terminate)) {
                                this.a.onError(terminate);
                                return;
                            }
                            return;
                        }
                        boolean z = this.i;
                        Object poll = this.e.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable terminate2 = ExceptionsUtils.terminate(this.g);
                            if (terminate2 == null) {
                                this.a.onCompleted();
                                return;
                            } else if (!ExceptionsUtils.isTerminated(terminate2)) {
                                this.a.onError(terminate2);
                                return;
                            } else {
                                return;
                            }
                        } else if (!z2) {
                            try {
                                Observable<? extends R> call = this.b.call((Object) NotificationLite.instance().getValue(poll));
                                if (call == null) {
                                    b(new NullPointerException("The source returned by the mapper was null"));
                                    return;
                                } else if (call != Observable.empty()) {
                                    if (call instanceof ScalarSynchronousObservable) {
                                        this.j = true;
                                        this.d.setProducer(new a(((ScalarSynchronousObservable) call).get(), this));
                                    } else {
                                        b bVar = new b(this);
                                        this.h.set(bVar);
                                        if (!bVar.isUnsubscribed()) {
                                            this.j = true;
                                            call.unsafeSubscribe(bVar);
                                        } else {
                                            return;
                                        }
                                    }
                                    request(1L);
                                } else {
                                    request(1L);
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                b(th);
                                return;
                            }
                        }
                    }
                    if (this.f.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        void b(Throwable th) {
            unsubscribe();
            if (ExceptionsUtils.addThrowable(this.g, th)) {
                Throwable terminate = ExceptionsUtils.terminate(this.g);
                if (!ExceptionsUtils.isTerminated(terminate)) {
                    this.a.onError(terminate);
                    return;
                }
                return;
            }
            a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T, R> extends Subscriber<R> {
        final c<T, R> a;
        long b;

        public b(c<T, R> cVar) {
            this.a = cVar;
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.a.d.setProducer(producer);
        }

        @Override // rx.Observer
        public void onNext(R r) {
            this.b++;
            this.a.a((c<T, R>) r);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a.a(th, this.b);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.b(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, R> implements Producer {
        final R a;
        final c<T, R> b;
        boolean c;

        public a(R r, c<T, R> cVar) {
            this.a = r;
            this.b = cVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (!this.c && j > 0) {
                this.c = true;
                c<T, R> cVar = this.b;
                cVar.a((c<T, R>) this.a);
                cVar.b(1L);
            }
        }
    }
}
