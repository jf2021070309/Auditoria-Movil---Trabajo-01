package rx.internal.operators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OperatorEagerConcatMap<T, R> implements Observable.Operator<R, T> {
    final Func1<? super T, ? extends Observable<? extends R>> a;
    final int b;
    private final int c;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public OperatorEagerConcatMap(Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2) {
        this.a = func1;
        this.b = i;
        this.c = i2;
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        c cVar = new c(this.a, this.b, this.c, subscriber);
        cVar.a();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AtomicLong implements Producer {
        private static final long serialVersionUID = -657299606803478389L;
        final c<?, ?> a;

        public b(c<?, ?> cVar) {
            this.a = cVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalStateException("n >= 0 required but it was " + j);
            }
            if (j > 0) {
                BackpressureUtils.getAndAddRequest(this, j);
                this.a.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T, R> extends Subscriber<T> {
        final Func1<? super T, ? extends Observable<? extends R>> a;
        final int b;
        final Subscriber<? super R> c;
        volatile boolean e;
        Throwable f;
        volatile boolean g;
        private b i;
        final Queue<a<R>> d = new LinkedList();
        final AtomicInteger h = new AtomicInteger();

        public c(Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2, Subscriber<? super R> subscriber) {
            this.a = func1;
            this.b = i;
            this.c = subscriber;
            request(i2 == Integer.MAX_VALUE ? Long.MAX_VALUE : i2);
        }

        void a() {
            this.i = new b(this);
            add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorEagerConcatMap.c.1
                @Override // rx.functions.Action0
                public void call() {
                    c.this.g = true;
                    if (c.this.h.getAndIncrement() == 0) {
                        c.this.b();
                    }
                }
            }));
            this.c.add(this);
            this.c.setProducer(this.i);
        }

        void b() {
            ArrayList<Subscription> arrayList;
            synchronized (this.d) {
                arrayList = new ArrayList(this.d);
                this.d.clear();
            }
            for (Subscription subscription : arrayList) {
                subscription.unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                Observable<? extends R> call = this.a.call(t);
                if (!this.g) {
                    a<R> aVar = new a<>(this, this.b);
                    synchronized (this.d) {
                        if (!this.g) {
                            this.d.add(aVar);
                            if (!this.g) {
                                call.unsafeSubscribe(aVar);
                                c();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.c, t);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f = th;
            this.e = true;
            c();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.e = true;
            c();
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
            if (r2 == 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
            if (r10 == Long.MAX_VALUE) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
            rx.internal.operators.BackpressureUtils.produced(r6, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
            if (r4 != false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
            r0.a(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0092, code lost:
            if (r4 != false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0013, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void c() {
            /*
                r14 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r14.h
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto L9
            L8:
                return
            L9:
                r0 = 1
                rx.internal.operators.OperatorEagerConcatMap$b r6 = r14.i
                rx.Subscriber<? super R> r7 = r14.c
                rx.internal.operators.NotificationLite r8 = rx.internal.operators.NotificationLite.instance()
                r1 = r0
            L13:
                boolean r0 = r14.g
                if (r0 == 0) goto L1b
                r14.b()
                goto L8
            L1b:
                boolean r3 = r14.e
                java.util.Queue<rx.internal.operators.OperatorEagerConcatMap$a<R>> r2 = r14.d
                monitor-enter(r2)
                java.util.Queue<rx.internal.operators.OperatorEagerConcatMap$a<R>> r0 = r14.d     // Catch: java.lang.Throwable -> L39
                java.lang.Object r0 = r0.peek()     // Catch: java.lang.Throwable -> L39
                rx.internal.operators.OperatorEagerConcatMap$a r0 = (rx.internal.operators.OperatorEagerConcatMap.a) r0     // Catch: java.lang.Throwable -> L39
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
                if (r0 != 0) goto L3c
                r2 = 1
            L2c:
                if (r3 == 0) goto L44
                java.lang.Throwable r3 = r14.f
                if (r3 == 0) goto L3e
                r14.b()
                r7.onError(r3)
                goto L8
            L39:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
                throw r0
            L3c:
                r2 = 0
                goto L2c
            L3e:
                if (r2 == 0) goto L44
                r7.onCompleted()
                goto L8
            L44:
                if (r2 != 0) goto L94
                long r10 = r6.get()
                r2 = 0
                java.util.Queue<java.lang.Object> r9 = r0.b
                r4 = 0
            L4f:
                boolean r12 = r0.d
                java.lang.Object r13 = r9.peek()
                if (r13 != 0) goto L65
                r5 = 1
            L58:
                if (r12 == 0) goto La3
                java.lang.Throwable r12 = r0.e
                if (r12 == 0) goto L67
                r14.b()
                r7.onError(r12)
                goto L8
            L65:
                r5 = 0
                goto L58
            L67:
                if (r5 == 0) goto La3
                java.util.Queue<rx.internal.operators.OperatorEagerConcatMap$a<R>> r4 = r14.d
                monitor-enter(r4)
                java.util.Queue<rx.internal.operators.OperatorEagerConcatMap$a<R>> r5 = r14.d     // Catch: java.lang.Throwable -> La0
                r5.poll()     // Catch: java.lang.Throwable -> La0
                monitor-exit(r4)     // Catch: java.lang.Throwable -> La0
                r0.unsubscribe()
                r4 = 1
                r12 = 1
                r14.request(r12)
            L7b:
                r12 = 0
                int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r5 == 0) goto L92
                r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r5 == 0) goto L8d
                rx.internal.operators.BackpressureUtils.produced(r6, r2)
            L8d:
                if (r4 != 0) goto L92
                r0.a(r2)
            L92:
                if (r4 != 0) goto L13
            L94:
                java.util.concurrent.atomic.AtomicInteger r0 = r14.h
                int r1 = -r1
                int r0 = r0.addAndGet(r1)
                if (r0 == 0) goto L8
                r1 = r0
                goto L13
            La0:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> La0
                throw r0
            La3:
                if (r5 != 0) goto L7b
                int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r5 == 0) goto L7b
                r9.poll()
                java.lang.Object r5 = r8.getValue(r13)     // Catch: java.lang.Throwable -> Lb7
                r7.onNext(r5)     // Catch: java.lang.Throwable -> Lb7
                r12 = 1
                long r2 = r2 + r12
                goto L4f
            Lb7:
                r0 = move-exception
                rx.exceptions.Exceptions.throwOrReport(r0, r7, r13)
                goto L8
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorEagerConcatMap.c.c():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> {
        final c<?, T> a;
        final Queue<Object> b;
        final NotificationLite<T> c;
        volatile boolean d;
        Throwable e;

        public a(c<?, T> cVar, int i) {
            Queue<Object> spscAtomicArrayQueue;
            this.a = cVar;
            if (UnsafeAccess.isUnsafeAvailable()) {
                spscAtomicArrayQueue = new SpscArrayQueue<>(i);
            } else {
                spscAtomicArrayQueue = new SpscAtomicArrayQueue<>(i);
            }
            this.b = spscAtomicArrayQueue;
            this.c = NotificationLite.instance();
            request(i);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.b.offer(this.c.next(t));
            this.a.c();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.e = th;
            this.d = true;
            this.a.c();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.d = true;
            this.a.c();
        }

        void a(long j) {
            request(j);
        }
    }
}
