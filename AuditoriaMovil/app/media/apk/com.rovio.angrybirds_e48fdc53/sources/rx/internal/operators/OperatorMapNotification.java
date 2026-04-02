package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func1;
/* loaded from: classes4.dex */
public final class OperatorMapNotification<T, R> implements Observable.Operator<R, T> {
    final Func1<? super T, ? extends R> a;
    final Func1<? super Throwable, ? extends R> b;
    final Func0<? extends R> c;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorMapNotification(Func1<? super T, ? extends R> func1, Func1<? super Throwable, ? extends R> func12, Func0<? extends R> func0) {
        this.a = func1;
        this.b = func12;
        this.c = func0;
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        final a aVar = new a(subscriber, this.a, this.b, this.c);
        subscriber.add(aVar);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OperatorMapNotification.1
            @Override // rx.Producer
            public void request(long j) {
                aVar.a(j);
            }
        });
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, R> extends Subscriber<T> {
        final Subscriber<? super R> a;
        final Func1<? super T, ? extends R> b;
        final Func1<? super Throwable, ? extends R> c;
        final Func0<? extends R> d;
        final AtomicLong e = new AtomicLong();
        final AtomicLong f = new AtomicLong();
        final AtomicReference<Producer> g = new AtomicReference<>();
        long h;
        R i;

        public a(Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1, Func1<? super Throwable, ? extends R> func12, Func0<? extends R> func0) {
            this.a = subscriber;
            this.b = func1;
            this.c = func12;
            this.d = func0;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                this.h++;
                this.a.onNext((R) this.b.call(t));
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.a, t);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            a();
            try {
                this.i = this.c.call(th);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.a, th);
            }
            b();
        }

        @Override // rx.Observer
        public void onCompleted() {
            a();
            try {
                this.i = this.d.call();
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.a);
            }
            b();
        }

        void a() {
            long j = this.h;
            if (j != 0 && this.g.get() != null) {
                BackpressureUtils.produced(this.e, j);
            }
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            if (this.g.compareAndSet(null, producer)) {
                long andSet = this.f.getAndSet(0L);
                if (andSet != 0) {
                    producer.request(andSet);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Producer already set!");
        }

        void b() {
            long j;
            do {
                j = this.e.get();
                if ((j & Long.MIN_VALUE) != 0) {
                    return;
                }
            } while (!this.e.compareAndSet(j, j | Long.MIN_VALUE));
            if (j != 0 || this.g.get() == null) {
                if (!this.a.isUnsubscribed()) {
                    this.a.onNext((R) this.i);
                }
                if (!this.a.isUnsubscribed()) {
                    this.a.onCompleted();
                }
            }
        }

        void a(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j == 0) {
                return;
            }
            while (true) {
                long j2 = this.e.get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    long j3 = Long.MAX_VALUE & j2;
                    if (this.e.compareAndSet(j2, BackpressureUtils.addCap(j3, j) | Long.MIN_VALUE)) {
                        if (j3 == 0) {
                            if (!this.a.isUnsubscribed()) {
                                this.a.onNext((R) this.i);
                            }
                            if (!this.a.isUnsubscribed()) {
                                this.a.onCompleted();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    if (this.e.compareAndSet(j2, BackpressureUtils.addCap(j2, j))) {
                        AtomicReference<Producer> atomicReference = this.g;
                        Producer producer = atomicReference.get();
                        if (producer != null) {
                            producer.request(j);
                            return;
                        }
                        BackpressureUtils.getAndAddRequest(this.f, j);
                        Producer producer2 = atomicReference.get();
                        if (producer2 != null) {
                            long andSet = this.f.getAndSet(0L);
                            if (andSet != 0) {
                                producer2.request(andSet);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
