package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func2;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;
/* loaded from: classes4.dex */
public final class OperatorScan<R, T> implements Observable.Operator<R, T> {
    private static final Object c = new Object();
    final Func2<R, ? super T, R> a;
    private final Func0<R> b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorScan(final R r, Func2<R, ? super T, R> func2) {
        this((Func0) new Func0<R>() { // from class: rx.internal.operators.OperatorScan.1
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public R call() {
                return (R) r;
            }
        }, (Func2) func2);
    }

    public OperatorScan(Func0<R> func0, Func2<R, ? super T, R> func2) {
        this.b = func0;
        this.a = func2;
    }

    public OperatorScan(Func2<R, ? super T, R> func2) {
        this(c, func2);
    }

    public Subscriber<? super T> call(final Subscriber<? super R> subscriber) {
        final R call = this.b.call();
        if (call == c) {
            return (Subscriber<T>) new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorScan.2
                boolean a;
                R b;

                @Override // rx.Observer
                public void onNext(T t) {
                    R r;
                    if (!this.a) {
                        this.a = true;
                        r = t;
                    } else {
                        try {
                            r = OperatorScan.this.a.call(this.b, t);
                        } catch (Throwable th) {
                            Exceptions.throwOrReport(th, subscriber, t);
                            return;
                        }
                    }
                    this.b = r;
                    subscriber.onNext(r);
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    subscriber.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    subscriber.onCompleted();
                }
            };
        }
        final a aVar = new a(call, subscriber);
        Subscriber subscriber2 = (Subscriber<T>) new Subscriber<T>() { // from class: rx.internal.operators.OperatorScan.3
            private R d;

            {
                this.d = (R) call;
            }

            @Override // rx.Observer
            public void onNext(T t) {
                try {
                    R call2 = OperatorScan.this.a.call(this.d, t);
                    this.d = call2;
                    aVar.onNext(call2);
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this, t);
                }
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                aVar.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                aVar.onCompleted();
            }

            @Override // rx.Subscriber
            public void setProducer(Producer producer) {
                aVar.a(producer);
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(aVar);
        return subscriber2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<R> implements Observer<R>, Producer {
        final Subscriber<? super R> a;
        final Queue<Object> b;
        boolean c;
        boolean d;
        long e;
        final AtomicLong f;
        volatile Producer g;
        volatile boolean h;
        Throwable i;

        public a(R r, Subscriber<? super R> subscriber) {
            Queue<Object> spscLinkedAtomicQueue;
            this.a = subscriber;
            if (UnsafeAccess.isUnsafeAvailable()) {
                spscLinkedAtomicQueue = new SpscLinkedQueue<>();
            } else {
                spscLinkedAtomicQueue = new SpscLinkedAtomicQueue<>();
            }
            this.b = spscLinkedAtomicQueue;
            spscLinkedAtomicQueue.offer(NotificationLite.instance().next(r));
            this.f = new AtomicLong();
        }

        @Override // rx.Observer
        public void onNext(R r) {
            this.b.offer(NotificationLite.instance().next(r));
            a();
        }

        boolean a(boolean z, boolean z2, Subscriber<? super R> subscriber) {
            if (subscriber.isUnsubscribed()) {
                return true;
            }
            if (z) {
                Throwable th = this.i;
                if (th != null) {
                    subscriber.onError(th);
                    return true;
                } else if (z2) {
                    subscriber.onCompleted();
                    return true;
                }
            }
            return false;
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.i = th;
            this.h = true;
            a();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.h = true;
            a();
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
            if (j != 0) {
                BackpressureUtils.getAndAddRequest(this.f, j);
                Producer producer = this.g;
                if (producer == null) {
                    synchronized (this.f) {
                        producer = this.g;
                        if (producer == null) {
                            this.e = BackpressureUtils.addCap(this.e, j);
                        }
                    }
                }
                if (producer != null) {
                    producer.request(j);
                }
                a();
            }
        }

        public void a(Producer producer) {
            long j;
            if (producer == null) {
                throw new NullPointerException();
            }
            synchronized (this.f) {
                if (this.g != null) {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
                j = this.e;
                if (j != Long.MAX_VALUE) {
                    j--;
                }
                this.e = 0L;
                this.g = producer;
            }
            if (j > 0) {
                producer.request(j);
            }
            a();
        }

        void a() {
            synchronized (this) {
                if (this.c) {
                    this.d = true;
                    return;
                }
                this.c = true;
                b();
            }
        }

        void b() {
            Subscriber<? super R> subscriber = this.a;
            Queue<Object> queue = this.b;
            NotificationLite instance = NotificationLite.instance();
            AtomicLong atomicLong = this.f;
            long j = atomicLong.get();
            while (!a(this.h, queue.isEmpty(), subscriber)) {
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.h;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!a(z, z2, subscriber)) {
                        if (z2) {
                            break;
                        }
                        Object obj = (Object) instance.getValue(poll);
                        try {
                            subscriber.onNext(obj);
                            j2++;
                        } catch (Throwable th) {
                            Exceptions.throwOrReport(th, subscriber, obj);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    j = BackpressureUtils.produced(atomicLong, j2);
                }
                synchronized (this) {
                    if (!this.d) {
                        this.c = false;
                        return;
                    }
                    this.d = false;
                }
            }
        }
    }
}
