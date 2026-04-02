package rx.subjects;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.internal.operators.BackpressureUtils;
import rx.internal.operators.NotificationLite;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
/* loaded from: classes4.dex */
public final class UnicastSubject<T> extends Subject<T, T> {
    final a<T> b;

    public static <T> UnicastSubject<T> create() {
        return create(16);
    }

    public static <T> UnicastSubject<T> create(int i) {
        return new UnicastSubject<>(new a(i, null));
    }

    public static <T> UnicastSubject<T> create(int i, Action0 action0) {
        return new UnicastSubject<>(new a(i, action0));
    }

    private UnicastSubject(a<T> aVar) {
        super(aVar);
        this.b = aVar;
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.b.onNext(t);
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.b.onError(th);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.b.onCompleted();
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.b.a.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends AtomicLong implements Observable.OnSubscribe<T>, Observer<T>, Producer, Subscription {
        private static final long serialVersionUID = -9044104859202255786L;
        final Queue<Object> b;
        final AtomicReference<Action0> d;
        Throwable e;
        volatile boolean f;
        boolean g;
        boolean h;
        volatile boolean i;
        final NotificationLite<T> c = NotificationLite.instance();
        final AtomicReference<Subscriber<? super T>> a = new AtomicReference<>();

        public a(int i, Action0 action0) {
            Queue<Object> spscLinkedQueue;
            this.d = action0 != null ? new AtomicReference<>(action0) : null;
            if (i > 1) {
                spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscUnboundedArrayQueue<>(i) : new SpscUnboundedAtomicArrayQueue<>(i);
            } else {
                spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue<>() : new SpscLinkedAtomicQueue<>();
            }
            this.b = spscLinkedQueue;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.f) {
                if (!this.i) {
                    boolean z = false;
                    synchronized (this) {
                        if (!this.i) {
                            this.b.offer(this.c.next(t));
                            z = true;
                        }
                    }
                    if (z) {
                        a();
                        return;
                    }
                }
                Subscriber<? super T> subscriber = this.a.get();
                try {
                    subscriber.onNext(t);
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, subscriber, t);
                }
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            boolean z;
            if (!this.f) {
                b();
                this.e = th;
                this.f = true;
                if (!this.i) {
                    synchronized (this) {
                        z = this.i ? false : true;
                    }
                    if (z) {
                        a();
                        return;
                    }
                }
                this.a.get().onError(th);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            boolean z;
            if (!this.f) {
                b();
                this.f = true;
                if (!this.i) {
                    synchronized (this) {
                        z = this.i ? false : true;
                    }
                    if (z) {
                        a();
                        return;
                    }
                }
                this.a.get().onCompleted();
            }
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (j > 0) {
                BackpressureUtils.getAndAddRequest(this, j);
                a();
            } else if (this.f) {
                a();
            }
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber<? super T> subscriber) {
            if (this.a.compareAndSet(null, subscriber)) {
                subscriber.add(this);
                subscriber.setProducer(this);
                return;
            }
            subscriber.onError(new IllegalStateException("Only a single subscriber is allowed"));
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
            if (r1 == false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
            if (r8.isEmpty() == false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
            r10.i = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
            r10.g = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void a() {
            /*
                r10 = this;
                monitor-enter(r10)
                boolean r0 = r10.g     // Catch: java.lang.Throwable -> L74
                if (r0 == 0) goto La
                r0 = 1
                r10.h = r0     // Catch: java.lang.Throwable -> L74
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L74
            L9:
                return
            La:
                r0 = 1
                r10.g = r0     // Catch: java.lang.Throwable -> L74
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L74
                java.util.Queue<java.lang.Object> r8 = r10.b
            L10:
                java.util.concurrent.atomic.AtomicReference<rx.Subscriber<? super T>> r0 = r10.a
                java.lang.Object r0 = r0.get()
                rx.Subscriber r0 = (rx.Subscriber) r0
                r1 = 0
                if (r0 == 0) goto L5c
                boolean r1 = r10.f
                boolean r2 = r8.isEmpty()
                boolean r1 = r10.a(r1, r2, r0)
                if (r1 != 0) goto L9
                long r4 = r10.get()
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 != 0) goto L77
                r1 = 1
            L35:
                r2 = 0
                r6 = r4
                r4 = r2
            L39:
                r2 = 0
                int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r2 == 0) goto L50
                boolean r3 = r10.f
                java.lang.Object r9 = r8.poll()
                if (r9 != 0) goto L79
                r2 = 1
            L48:
                boolean r3 = r10.a(r3, r2, r0)
                if (r3 != 0) goto L9
                if (r2 == 0) goto L7b
            L50:
                if (r1 != 0) goto L5c
                r2 = 0
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 == 0) goto L5c
                long r2 = -r4
                r10.addAndGet(r2)
            L5c:
                monitor-enter(r10)
                boolean r0 = r10.h     // Catch: java.lang.Throwable -> L71
                if (r0 != 0) goto L9c
                if (r1 == 0) goto L6c
                boolean r0 = r8.isEmpty()     // Catch: java.lang.Throwable -> L71
                if (r0 == 0) goto L6c
                r0 = 1
                r10.i = r0     // Catch: java.lang.Throwable -> L71
            L6c:
                r0 = 0
                r10.g = r0     // Catch: java.lang.Throwable -> L71
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L71
                goto L9
            L71:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L71
                throw r0
            L74:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L74
                throw r0
            L77:
                r1 = 0
                goto L35
            L79:
                r2 = 0
                goto L48
            L7b:
                rx.internal.operators.NotificationLite<T> r2 = r10.c
                java.lang.Object r2 = r2.getValue(r9)
                r0.onNext(r2)     // Catch: java.lang.Throwable -> L8c
                r2 = 1
                long r6 = r6 - r2
                r2 = 1
                long r2 = r2 + r4
                r4 = r2
                goto L39
            L8c:
                r1 = move-exception
                r8.clear()
                rx.exceptions.Exceptions.throwIfFatal(r1)
                java.lang.Throwable r1 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r1, r2)
                r0.onError(r1)
                goto L9
            L9c:
                r0 = 0
                r10.h = r0     // Catch: java.lang.Throwable -> L71
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L71
                goto L10
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.subjects.UnicastSubject.a.a():void");
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            b();
            this.f = true;
            synchronized (this) {
                if (!this.g) {
                    this.g = true;
                    this.b.clear();
                }
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.f;
        }

        boolean a(boolean z, boolean z2, Subscriber<? super T> subscriber) {
            if (subscriber.isUnsubscribed()) {
                this.b.clear();
                return true;
            }
            if (z) {
                Throwable th = this.e;
                if (th != null) {
                    this.b.clear();
                    subscriber.onError(th);
                    return true;
                } else if (z2) {
                    subscriber.onCompleted();
                    return true;
                }
            }
            return false;
        }

        void b() {
            Action0 action0;
            AtomicReference<Action0> atomicReference = this.d;
            if (atomicReference != null && (action0 = atomicReference.get()) != null && atomicReference.compareAndSet(action0, null)) {
                action0.call();
            }
        }
    }
}
