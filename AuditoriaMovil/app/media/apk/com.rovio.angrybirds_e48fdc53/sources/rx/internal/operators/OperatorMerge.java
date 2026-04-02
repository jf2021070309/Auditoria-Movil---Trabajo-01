package rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.atomic.SpscExactAtomicArrayQueue;
import rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import rx.internal.util.unsafe.Pow2;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.subscriptions.CompositeSubscription;
/* loaded from: classes4.dex */
public final class OperatorMerge<T> implements Observable.Operator<T, Observable<? extends T>> {
    final boolean a;
    final int b;

    @Override // rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b {
        static final OperatorMerge<Object> a = new OperatorMerge<>(false, Integer.MAX_VALUE);

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a {
        static final OperatorMerge<Object> a = new OperatorMerge<>(true, Integer.MAX_VALUE);

        a() {
        }
    }

    public static <T> OperatorMerge<T> instance(boolean z) {
        return z ? (OperatorMerge<T>) a.a : (OperatorMerge<T>) b.a;
    }

    public static <T> OperatorMerge<T> instance(boolean z, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxConcurrent > 0 required but it was " + i);
        }
        return i == Integer.MAX_VALUE ? instance(z) : new OperatorMerge<>(z, i);
    }

    OperatorMerge(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public Subscriber<Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        e eVar = new e(subscriber, this.a, this.b);
        d<T> dVar = new d<>(eVar);
        eVar.d = dVar;
        subscriber.add(eVar);
        subscriber.setProducer(dVar);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1214379189873595503L;
        final e<T> a;

        public d(e<T> eVar) {
            this.a = eVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j > 0) {
                if (get() != Long.MAX_VALUE) {
                    BackpressureUtils.getAndAddRequest(this, j);
                    this.a.d();
                }
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
        }

        public long a(int i) {
            return addAndGet(-i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e<T> extends Subscriber<Observable<? extends T>> {
        static final c<?>[] q = new c[0];
        final Subscriber<? super T> a;
        final boolean b;
        final int c;
        d<T> d;
        volatile Queue<Object> e;
        volatile CompositeSubscription f;
        volatile ConcurrentLinkedQueue<Throwable> g;
        volatile boolean i;
        boolean j;
        boolean k;
        long n;
        long o;
        int p;
        final int r;
        int s;
        final NotificationLite<T> h = NotificationLite.instance();
        final Object l = new Object();
        volatile c<?>[] m = q;

        @Override // rx.Observer
        public /* synthetic */ void onNext(Object obj) {
            a((Observable) ((Observable) obj));
        }

        public e(Subscriber<? super T> subscriber, boolean z, int i) {
            this.a = subscriber;
            this.b = z;
            this.c = i;
            if (i == Integer.MAX_VALUE) {
                this.r = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
                return;
            }
            this.r = Math.max(1, i >> 1);
            request(i);
        }

        Queue<Throwable> a() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.g;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    concurrentLinkedQueue = this.g;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.g = concurrentLinkedQueue;
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        CompositeSubscription b() {
            boolean z;
            CompositeSubscription compositeSubscription = this.f;
            if (compositeSubscription == null) {
                synchronized (this) {
                    CompositeSubscription compositeSubscription2 = this.f;
                    if (compositeSubscription2 != null) {
                        compositeSubscription = compositeSubscription2;
                        z = false;
                    } else {
                        CompositeSubscription compositeSubscription3 = new CompositeSubscription();
                        this.f = compositeSubscription3;
                        compositeSubscription = compositeSubscription3;
                        z = true;
                    }
                }
                if (z) {
                    add(compositeSubscription);
                }
            }
            return compositeSubscription;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void a(Observable<? extends T> observable) {
            if (observable != null) {
                if (observable == Observable.empty()) {
                    c();
                } else if (observable instanceof ScalarSynchronousObservable) {
                    a((e<T>) ((ScalarSynchronousObservable) observable).get());
                } else {
                    long j = this.n;
                    this.n = 1 + j;
                    c cVar = new c(this, j);
                    a(cVar);
                    observable.unsafeSubscribe(cVar);
                    d();
                }
            }
        }

        void c() {
            int i = this.s + 1;
            if (i == this.r) {
                this.s = 0;
                a(i);
                return;
            }
            this.s = i;
        }

        private void g() {
            ArrayList arrayList = new ArrayList(this.g);
            if (arrayList.size() == 1) {
                this.a.onError((Throwable) arrayList.get(0));
            } else {
                this.a.onError(new CompositeException(arrayList));
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            a().offer(th);
            this.i = true;
            d();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.i = true;
            d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void a(c<T> cVar) {
            b().add(cVar);
            synchronized (this.l) {
                c<?>[] cVarArr = this.m;
                int length = cVarArr.length;
                c<?>[] cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
                this.m = cVarArr2;
            }
        }

        void b(c<T> cVar) {
            int i = 0;
            RxRingBuffer rxRingBuffer = cVar.d;
            if (rxRingBuffer != null) {
                rxRingBuffer.release();
            }
            this.f.remove(cVar);
            synchronized (this.l) {
                c<?>[] cVarArr = this.m;
                int length = cVarArr.length;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (cVar.equals(cVarArr[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        this.m = q;
                        return;
                    }
                    c<?>[] cVarArr2 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, i);
                    System.arraycopy(cVarArr, i + 1, cVarArr2, i, (length - i) - 1);
                    this.m = cVarArr2;
                }
            }
        }

        void a(c<T> cVar, T t) {
            boolean z = false;
            long j = this.d.get();
            if (j != 0) {
                synchronized (this) {
                    j = this.d.get();
                    if (!this.j && j != 0) {
                        this.j = true;
                        z = true;
                    }
                }
            }
            if (z) {
                RxRingBuffer rxRingBuffer = cVar.d;
                if (rxRingBuffer == null || rxRingBuffer.isEmpty()) {
                    a(cVar, t, j);
                    return;
                }
                b(cVar, t);
                e();
                return;
            }
            b(cVar, t);
            d();
        }

        protected void b(c<T> cVar, T t) {
            RxRingBuffer rxRingBuffer = cVar.d;
            if (rxRingBuffer == null) {
                rxRingBuffer = RxRingBuffer.getSpscInstance();
                cVar.add(rxRingBuffer);
                cVar.d = rxRingBuffer;
            }
            try {
                rxRingBuffer.onNext(this.h.next(t));
            } catch (IllegalStateException e) {
                if (!cVar.isUnsubscribed()) {
                    cVar.unsubscribe();
                    cVar.onError(e);
                }
            } catch (MissingBackpressureException e2) {
                cVar.unsubscribe();
                cVar.onError(e2);
            }
        }

        protected void a(c<T> cVar, T t, long j) {
            try {
                this.a.onNext(t);
                if (j != Long.MAX_VALUE) {
                    try {
                        this.d.a(1);
                    } catch (Throwable th) {
                        if (0 == 0) {
                            synchronized (this) {
                                this.j = false;
                            }
                        }
                        throw th;
                    }
                }
                cVar.a(1L);
                synchronized (this) {
                    if (!this.k) {
                        this.j = false;
                        return;
                    }
                    this.k = false;
                    e();
                }
            }
        }

        public void a(long j) {
            request(j);
        }

        void a(T t) {
            boolean z = false;
            long j = this.d.get();
            if (j != 0) {
                synchronized (this) {
                    j = this.d.get();
                    if (!this.j && j != 0) {
                        this.j = true;
                        z = true;
                    }
                }
            }
            if (z) {
                Queue<Object> queue = this.e;
                if (queue == null || queue.isEmpty()) {
                    a((e<T>) t, j);
                    return;
                }
                b((e<T>) t);
                e();
                return;
            }
            b((e<T>) t);
            d();
        }

        protected void b(T t) {
            Queue<Object> queue = this.e;
            if (queue == null) {
                int i = this.c;
                if (i == Integer.MAX_VALUE) {
                    queue = new SpscUnboundedAtomicArrayQueue<>(RxRingBuffer.SIZE);
                } else if (Pow2.isPowerOfTwo(i)) {
                    if (UnsafeAccess.isUnsafeAvailable()) {
                        queue = new SpscArrayQueue<>(i);
                    } else {
                        queue = new SpscAtomicArrayQueue<>(i);
                    }
                } else {
                    queue = new SpscExactAtomicArrayQueue<>(i);
                }
                this.e = queue;
            }
            if (!queue.offer(this.h.next(t))) {
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t));
            }
        }

        protected void a(T t, long j) {
            try {
                this.a.onNext(t);
                if (j != Long.MAX_VALUE) {
                    this.d.a(1);
                }
                int i = this.s + 1;
                if (i == this.r) {
                    this.s = 0;
                    a(i);
                } else {
                    this.s = i;
                }
                synchronized (this) {
                    try {
                        if (!this.k) {
                            this.j = false;
                        } else {
                            this.k = false;
                            e();
                        }
                    }
                }
            } catch (Throwable th) {
                if (0 == 0) {
                    synchronized (this) {
                        this.j = false;
                    }
                }
                throw th;
            }
        }

        void d() {
            synchronized (this) {
                if (this.j) {
                    this.k = true;
                    return;
                }
                this.j = true;
                e();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x0176 A[Catch: all -> 0x0078, TryCatch #4 {all -> 0x0078, blocks: (B:3:0x0001, B:4:0x0005, B:7:0x000c, B:15:0x002e, B:45:0x0086, B:53:0x00b6, B:25:0x004d, B:28:0x0060, B:31:0x0068, B:33:0x006e, B:54:0x00bf, B:35:0x0074, B:57:0x00c7, B:59:0x00d3, B:73:0x0108, B:75:0x010e, B:79:0x0118, B:81:0x011e, B:118:0x019c, B:120:0x01a2, B:85:0x0128, B:86:0x0130, B:90:0x013e, B:93:0x014a, B:95:0x0150, B:97:0x015d, B:101:0x0168, B:103:0x0176, B:105:0x017e, B:67:0x00e5, B:114:0x0191, B:117:0x0198, B:69:0x00ef, B:46:0x008e, B:121:0x01aa, B:106:0x017f, B:108:0x0185, B:109:0x018b, B:137:0x01de, B:138:0x01e2), top: B:146:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01ec  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x017e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0005 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00c7 A[Catch: all -> 0x0078, TryCatch #4 {all -> 0x0078, blocks: (B:3:0x0001, B:4:0x0005, B:7:0x000c, B:15:0x002e, B:45:0x0086, B:53:0x00b6, B:25:0x004d, B:28:0x0060, B:31:0x0068, B:33:0x006e, B:54:0x00bf, B:35:0x0074, B:57:0x00c7, B:59:0x00d3, B:73:0x0108, B:75:0x010e, B:79:0x0118, B:81:0x011e, B:118:0x019c, B:120:0x01a2, B:85:0x0128, B:86:0x0130, B:90:0x013e, B:93:0x014a, B:95:0x0150, B:97:0x015d, B:101:0x0168, B:103:0x0176, B:105:0x017e, B:67:0x00e5, B:114:0x0191, B:117:0x0198, B:69:0x00ef, B:46:0x008e, B:121:0x01aa, B:106:0x017f, B:108:0x0185, B:109:0x018b, B:137:0x01de, B:138:0x01e2), top: B:146:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void e() {
            /*
                Method dump skipped, instructions count: 499
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorMerge.e.e():void");
        }

        boolean f() {
            if (this.a.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.g;
            if (!this.b && concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                try {
                    g();
                    return true;
                } finally {
                    unsubscribe();
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> extends Subscriber<T> {
        static final int f = RxRingBuffer.SIZE / 4;
        final e<T> a;
        final long b;
        volatile boolean c;
        volatile RxRingBuffer d;
        int e;

        public c(e<T> eVar, long j) {
            this.a = eVar;
            this.b = j;
        }

        @Override // rx.Subscriber
        public void onStart() {
            this.e = RxRingBuffer.SIZE;
            request(RxRingBuffer.SIZE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.a.a((c<c<T>>) this, (c<T>) t);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.c = true;
            this.a.a().offer(th);
            this.a.d();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.c = true;
            this.a.d();
        }

        public void a(long j) {
            int i = this.e - ((int) j);
            if (i > f) {
                this.e = i;
                return;
            }
            this.e = RxRingBuffer.SIZE;
            int i2 = RxRingBuffer.SIZE - i;
            if (i2 > 0) {
                request(i2);
            }
        }
    }
}
