package rx.internal.operators;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.functions.Action0;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OperatorSwitch<T> implements Observable.Operator<T, Observable<? extends T>> {
    final boolean a;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        static final OperatorSwitch<Object> a = new OperatorSwitch<>(false);

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {
        static final OperatorSwitch<Object> a = new OperatorSwitch<>(true);

        b() {
        }
    }

    public static <T> OperatorSwitch<T> instance(boolean z) {
        return z ? (OperatorSwitch<T>) b.a : (OperatorSwitch<T>) a.a;
    }

    OperatorSwitch(boolean z) {
        this.a = z;
    }

    public Subscriber<? super Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        d dVar = new d(subscriber, this.a);
        subscriber.add(dVar);
        dVar.a();
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d<T> extends Subscriber<Observable<? extends T>> {
        static final Throwable n = new Throwable("Terminal error");
        final Subscriber<? super T> a;
        final boolean c;
        boolean g;
        boolean h;
        long i;
        Producer j;
        volatile boolean k;
        Throwable l;
        boolean m;
        final SerialSubscription b = new SerialSubscription();
        final AtomicLong d = new AtomicLong();
        final SpscLinkedArrayQueue<Object> e = new SpscLinkedArrayQueue<>(RxRingBuffer.SIZE);
        final NotificationLite<T> f = NotificationLite.instance();

        d(Subscriber<? super T> subscriber, boolean z) {
            this.a = subscriber;
            this.c = z;
        }

        void a() {
            this.a.add(this.b);
            this.a.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorSwitch.d.1
                @Override // rx.functions.Action0
                public void call() {
                    d.this.b();
                }
            }));
            this.a.setProducer(new Producer() { // from class: rx.internal.operators.OperatorSwitch.d.2
                @Override // rx.Producer
                public void request(long j) {
                    if (j > 0) {
                        d.this.b(j);
                    } else if (j < 0) {
                        throw new IllegalArgumentException("n >= 0 expected but it was " + j);
                    }
                }
            });
        }

        void b() {
            synchronized (this) {
                this.j = null;
            }
        }

        @Override // rx.Observer
        /* renamed from: a */
        public void onNext(Observable<? extends T> observable) {
            c cVar;
            long incrementAndGet = this.d.incrementAndGet();
            Subscription subscription = this.b.get();
            if (subscription != null) {
                subscription.unsubscribe();
            }
            synchronized (this) {
                cVar = new c(incrementAndGet, this);
                this.m = true;
                this.j = null;
            }
            this.b.set(cVar);
            observable.unsafeSubscribe(cVar);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            boolean a;
            synchronized (this) {
                a = a(th);
            }
            if (a) {
                this.k = true;
                c();
                return;
            }
            b(th);
        }

        boolean a(Throwable th) {
            Throwable th2 = this.l;
            if (th2 == n) {
                return false;
            }
            if (th2 == null) {
                this.l = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
                arrayList.add(th);
                this.l = new CompositeException(arrayList);
            } else {
                this.l = new CompositeException(th2, th);
            }
            return true;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.k = true;
            c();
        }

        void a(T t, c<T> cVar) {
            synchronized (this) {
                if (this.d.get() == ((c) cVar).a) {
                    this.e.offer(cVar, this.f.next(t));
                    c();
                }
            }
        }

        void a(Throwable th, long j) {
            boolean z;
            synchronized (this) {
                if (this.d.get() == j) {
                    z = a(th);
                    this.m = false;
                    this.j = null;
                } else {
                    z = true;
                }
            }
            if (z) {
                c();
            } else {
                b(th);
            }
        }

        void a(long j) {
            synchronized (this) {
                if (this.d.get() == j) {
                    this.m = false;
                    this.j = null;
                    c();
                }
            }
        }

        void b(Throwable th) {
            RxJavaHooks.onError(th);
        }

        void a(Producer producer, long j) {
            synchronized (this) {
                if (this.d.get() == j) {
                    long j2 = this.i;
                    this.j = producer;
                    producer.request(j2);
                }
            }
        }

        void b(long j) {
            Producer producer;
            synchronized (this) {
                producer = this.j;
                this.i = BackpressureUtils.addCap(this.i, j);
            }
            if (producer != null) {
                producer.request(j);
            }
            c();
        }

        void c() {
            long j;
            synchronized (this) {
                if (this.g) {
                    this.h = true;
                    return;
                }
                this.g = true;
                boolean z = this.m;
                long j2 = this.i;
                Throwable th = this.l;
                if (th != null && th != n && !this.c) {
                    this.l = n;
                }
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.e;
                AtomicLong atomicLong = this.d;
                Subscriber<? super T> subscriber = this.a;
                boolean z2 = this.k;
                while (true) {
                    long j3 = j2;
                    long j4 = 0;
                    while (j4 != j3) {
                        if (!subscriber.isUnsubscribed()) {
                            boolean isEmpty = spscLinkedArrayQueue.isEmpty();
                            if (!a(z2, z, th, spscLinkedArrayQueue, subscriber, isEmpty)) {
                                if (isEmpty) {
                                    break;
                                }
                                Object obj = (T) this.f.getValue(spscLinkedArrayQueue.poll());
                                if (atomicLong.get() == ((c) spscLinkedArrayQueue.poll()).a) {
                                    subscriber.onNext(obj);
                                    j = 1 + j4;
                                } else {
                                    j = j4;
                                }
                                j4 = j;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j4 != j3 || (!subscriber.isUnsubscribed() && !a(this.k, z, th, spscLinkedArrayQueue, subscriber, spscLinkedArrayQueue.isEmpty()))) {
                        synchronized (this) {
                            j2 = this.i;
                            if (j2 != Long.MAX_VALUE) {
                                j2 -= j4;
                                this.i = j2;
                            }
                            if (!this.h) {
                                this.g = false;
                                return;
                            }
                            this.h = false;
                            z2 = this.k;
                            z = this.m;
                            th = this.l;
                            if (th != null && th != n && !this.c) {
                                this.l = n;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        protected boolean a(boolean z, boolean z2, Throwable th, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue, Subscriber<? super T> subscriber, boolean z3) {
            if (this.c) {
                if (z && !z2 && z3) {
                    if (th != null) {
                        subscriber.onError(th);
                        return true;
                    }
                    subscriber.onCompleted();
                    return true;
                }
            } else if (th != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th);
                return true;
            } else if (z && !z2 && z3) {
                subscriber.onCompleted();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> extends Subscriber<T> {
        private final long a;
        private final d<T> b;

        c(long j, d<T> dVar) {
            this.a = j;
            this.b = dVar;
        }

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.b.a(producer, this.a);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.b.a((d<T>) t, (c<d<T>>) this);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.b.a(th, this.a);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.b.a(this.a);
        }
    }
}
