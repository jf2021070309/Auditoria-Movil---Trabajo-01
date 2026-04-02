package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
/* loaded from: classes4.dex */
public final class OperatorOnBackpressureLatest<T> implements Observable.Operator<T, T> {
    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        static final OperatorOnBackpressureLatest<Object> a = new OperatorOnBackpressureLatest<>();

        a() {
        }
    }

    public static <T> OperatorOnBackpressureLatest<T> instance() {
        return (OperatorOnBackpressureLatest<T>) a.a;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber);
        c<? super T> cVar = new c<>(bVar);
        bVar.b = cVar;
        subscriber.add(cVar);
        subscriber.add(bVar);
        subscriber.setProducer(bVar);
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends AtomicLong implements Observer<T>, Producer, Subscription {
        static final Object h = new Object();
        private static final long serialVersionUID = -1364393685005146274L;
        final Subscriber<? super T> a;
        c<? super T> b;
        final AtomicReference<Object> c = new AtomicReference<>(h);
        Throwable d;
        volatile boolean e;
        boolean f;
        boolean g;

        public b(Subscriber<? super T> subscriber) {
            this.a = subscriber;
            lazySet(-4611686018427387904L);
        }

        @Override // rx.Producer
        public void request(long j) {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        if (j2 == -4611686018427387904L) {
                            j3 = j;
                        } else {
                            j3 = j2 + j;
                            if (j3 < 0) {
                                j3 = Long.MAX_VALUE;
                            }
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                if (j2 == -4611686018427387904L) {
                    this.b.a(Long.MAX_VALUE);
                }
                a();
            }
        }

        long a(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 >= 0) {
                    j3 = j2 - j;
                } else {
                    return j2;
                }
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.c.lazySet(t);
            a();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.d = th;
            this.e = true;
            a();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.e = true;
            a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0064, code lost:
            r8.f = false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void a() {
            /*
                r8 = this;
                r1 = 1
                r2 = 0
                monitor-enter(r8)
                boolean r0 = r8.f     // Catch: java.lang.Throwable -> L28
                if (r0 == 0) goto Lc
                r0 = 1
                r8.g = r0     // Catch: java.lang.Throwable -> L28
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            Lb:
                return
            Lc:
                r0 = 1
                r8.f = r0     // Catch: java.lang.Throwable -> L28
                r0 = 0
                r8.g = r0     // Catch: java.lang.Throwable -> L28
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            L13:
                long r4 = r8.get()     // Catch: java.lang.Throwable -> L7c
                r6 = -9223372036854775808
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 != 0) goto L2b
            L1d:
                if (r1 != 0) goto Lb
                monitor-enter(r8)
                r0 = 0
                r8.f = r0     // Catch: java.lang.Throwable -> L25
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L25
                goto Lb
            L25:
                r0 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L25
                throw r0
            L28:
                r0 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
                throw r0
            L2b:
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r8.c     // Catch: java.lang.Throwable -> L7c
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L7c
                r6 = 0
                int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r3 <= 0) goto L4e
                java.lang.Object r3 = rx.internal.operators.OperatorOnBackpressureLatest.b.h     // Catch: java.lang.Throwable -> L7c
                if (r0 == r3) goto L4e
                rx.Subscriber<? super T> r3 = r8.a     // Catch: java.lang.Throwable -> L7c
                r3.onNext(r0)     // Catch: java.lang.Throwable -> L7c
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3 = r8.c     // Catch: java.lang.Throwable -> L7c
                java.lang.Object r4 = rx.internal.operators.OperatorOnBackpressureLatest.b.h     // Catch: java.lang.Throwable -> L7c
                r3.compareAndSet(r0, r4)     // Catch: java.lang.Throwable -> L7c
                r4 = 1
                r8.a(r4)     // Catch: java.lang.Throwable -> L7c
                java.lang.Object r0 = rx.internal.operators.OperatorOnBackpressureLatest.b.h     // Catch: java.lang.Throwable -> L7c
            L4e:
                java.lang.Object r3 = rx.internal.operators.OperatorOnBackpressureLatest.b.h     // Catch: java.lang.Throwable -> L7c
                if (r0 != r3) goto L5f
                boolean r0 = r8.e     // Catch: java.lang.Throwable -> L7c
                if (r0 == 0) goto L5f
                java.lang.Throwable r0 = r8.d     // Catch: java.lang.Throwable -> L7c
                if (r0 == 0) goto L76
                rx.Subscriber<? super T> r3 = r8.a     // Catch: java.lang.Throwable -> L7c
                r3.onError(r0)     // Catch: java.lang.Throwable -> L7c
            L5f:
                monitor-enter(r8)     // Catch: java.lang.Throwable -> L7c
                boolean r0 = r8.g     // Catch: java.lang.Throwable -> L83
                if (r0 != 0) goto L7e
                r0 = 0
                r8.f = r0     // Catch: java.lang.Throwable -> L83
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L69
                goto L1d
            L69:
                r0 = move-exception
            L6a:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L69
                throw r0     // Catch: java.lang.Throwable -> L6c
            L6c:
                r0 = move-exception
                r2 = r1
            L6e:
                if (r2 != 0) goto L75
                monitor-enter(r8)
                r1 = 0
                r8.f = r1     // Catch: java.lang.Throwable -> L86
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L86
            L75:
                throw r0
            L76:
                rx.Subscriber<? super T> r0 = r8.a     // Catch: java.lang.Throwable -> L7c
                r0.onCompleted()     // Catch: java.lang.Throwable -> L7c
                goto L5f
            L7c:
                r0 = move-exception
                goto L6e
            L7e:
                r0 = 0
                r8.g = r0     // Catch: java.lang.Throwable -> L83
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L83
                goto L13
            L83:
                r0 = move-exception
                r1 = r2
                goto L6a
            L86:
                r0 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L86
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorOnBackpressureLatest.b.a():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> extends Subscriber<T> {
        private final b<T> a;

        c(b<T> bVar) {
            this.a = bVar;
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(0L);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.a.onCompleted();
        }

        void a(long j) {
            request(j);
        }
    }
}
