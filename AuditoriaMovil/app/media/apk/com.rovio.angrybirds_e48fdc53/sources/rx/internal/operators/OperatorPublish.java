package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.SynchronizedQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.observables.ConnectableObservable;
import rx.subscriptions.Subscriptions;
/* loaded from: classes4.dex */
public final class OperatorPublish<T> extends ConnectableObservable<T> {
    final Observable<? extends T> b;
    final AtomicReference<b<T>> c;

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable) {
        final AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new Observable.OnSubscribe<T>() { // from class: rx.internal.operators.OperatorPublish.1
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(Subscriber<? super T> subscriber) {
                while (true) {
                    b bVar = (b) atomicReference.get();
                    if (bVar == null || bVar.isUnsubscribed()) {
                        b bVar2 = new b(atomicReference);
                        bVar2.a();
                        if (atomicReference.compareAndSet(bVar, bVar2)) {
                            bVar = bVar2;
                        } else {
                            continue;
                        }
                    }
                    a<T> aVar = new a<>(bVar, subscriber);
                    if (bVar.a(aVar)) {
                        subscriber.add(aVar);
                        subscriber.setProducer(aVar);
                        return;
                    }
                }
            }
        }, observable, atomicReference);
    }

    public static <T, R> Observable<R> create(Observable<? extends T> observable, Func1<? super Observable<T>, ? extends Observable<R>> func1) {
        return create(observable, func1, false);
    }

    public static <T, R> Observable<R> create(final Observable<? extends T> observable, final Func1<? super Observable<T>, ? extends Observable<R>> func1, final boolean z) {
        return create(new Observable.OnSubscribe<R>() { // from class: rx.internal.operators.OperatorPublish.2
            @Override // rx.functions.Action1
            /* renamed from: a */
            public void call(final Subscriber<? super R> subscriber) {
                final OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(RxRingBuffer.SIZE, z);
                Subscriber<R> subscriber2 = new Subscriber<R>() { // from class: rx.internal.operators.OperatorPublish.2.1
                    @Override // rx.Observer
                    public void onNext(R r) {
                        subscriber.onNext(r);
                    }

                    @Override // rx.Observer
                    public void onError(Throwable th) {
                        onSubscribePublishMulticast.unsubscribe();
                        subscriber.onError(th);
                    }

                    @Override // rx.Observer
                    public void onCompleted() {
                        onSubscribePublishMulticast.unsubscribe();
                        subscriber.onCompleted();
                    }

                    @Override // rx.Subscriber
                    public void setProducer(Producer producer) {
                        subscriber.setProducer(producer);
                    }
                };
                subscriber.add(onSubscribePublishMulticast);
                subscriber.add(subscriber2);
                ((Observable) func1.call(Observable.create(onSubscribePublishMulticast))).unsafeSubscribe(subscriber2);
                observable.unsafeSubscribe(onSubscribePublishMulticast.subscriber());
            }
        });
    }

    private OperatorPublish(Observable.OnSubscribe<T> onSubscribe, Observable<? extends T> observable, AtomicReference<b<T>> atomicReference) {
        super(onSubscribe);
        this.b = observable;
        this.c = atomicReference;
    }

    @Override // rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        b<T> bVar;
        while (true) {
            bVar = this.c.get();
            if (bVar != null && !bVar.isUnsubscribed()) {
                break;
            }
            b<T> bVar2 = new b<>(this.c);
            bVar2.a();
            if (this.c.compareAndSet(bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z = !bVar.h.get() && bVar.h.compareAndSet(false, true);
        action1.call(bVar);
        if (z) {
            this.b.unsafeSubscribe(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends Subscriber<T> implements Subscription {
        static final a[] e = new a[0];
        static final a[] f = new a[0];
        final Queue<Object> a;
        final NotificationLite<T> b;
        final AtomicReference<b<T>> c;
        volatile Object d;
        final AtomicReference<a[]> g;
        final AtomicBoolean h;
        boolean i;
        boolean j;

        public b(AtomicReference<b<T>> atomicReference) {
            this.a = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(RxRingBuffer.SIZE) : new SynchronizedQueue<>(RxRingBuffer.SIZE);
            this.b = NotificationLite.instance();
            this.g = new AtomicReference<>(e);
            this.c = atomicReference;
            this.h = new AtomicBoolean();
        }

        void a() {
            add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorPublish.b.1
                @Override // rx.functions.Action0
                public void call() {
                    b.this.g.getAndSet(b.f);
                    b.this.c.compareAndSet(b.this, null);
                }
            }));
        }

        @Override // rx.Subscriber
        public void onStart() {
            request(RxRingBuffer.SIZE);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.a.offer(this.b.next(t))) {
                onError(new MissingBackpressureException());
            } else {
                b();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.d == null) {
                this.d = this.b.error(th);
                b();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.d == null) {
                this.d = this.b.completed();
                b();
            }
        }

        boolean a(a<T> aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            if (aVar == null) {
                throw new NullPointerException();
            }
            do {
                aVarArr = this.g.get();
                if (aVarArr == f) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.g.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        void b(a<T> aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.g.get();
                if (aVarArr != e && aVarArr != f) {
                    int i = -1;
                    int length = aVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2].equals(aVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = e;
                        } else {
                            aVarArr2 = new a[length - 1];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.g.compareAndSet(aVarArr, aVarArr2));
        }

        boolean a(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (this.b.isCompleted(obj)) {
                    if (z) {
                        this.c.compareAndSet(this, null);
                        try {
                            a[] andSet = this.g.getAndSet(f);
                            int length = andSet.length;
                            while (i < length) {
                                andSet[i].b.onCompleted();
                                i++;
                            }
                            return true;
                        } finally {
                        }
                    }
                } else {
                    Throwable error = this.b.getError(obj);
                    this.c.compareAndSet(this, null);
                    try {
                        a[] andSet2 = this.g.getAndSet(f);
                        int length2 = andSet2.length;
                        while (i < length2) {
                            andSet2[i].b.onError(error);
                            i++;
                        }
                        return true;
                    } finally {
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Queue, java.util.Queue<java.lang.Object>] */
        /* JADX WARN: Type inference failed for: r3v13, types: [int] */
        void b() {
            int i;
            boolean z;
            synchronized (this) {
                if (this.i) {
                    this.j = true;
                    return;
                }
                this.i = true;
                this.j = false;
                boolean z2 = false;
                while (true) {
                    try {
                        Object obj = this.d;
                        ?? r3 = this.a;
                        boolean isEmpty = r3.isEmpty();
                        boolean z3 = r3;
                        if (!a(obj, isEmpty)) {
                            try {
                                if (!isEmpty) {
                                    a[] aVarArr = this.g.get();
                                    int length = aVarArr.length;
                                    int i2 = 0;
                                    long j = Long.MAX_VALUE;
                                    for (a aVar : aVarArr) {
                                        long j2 = aVar.get();
                                        if (j2 >= 0) {
                                            j = Math.min(j, j2);
                                        } else if (j2 == Long.MIN_VALUE) {
                                            i2++;
                                        }
                                    }
                                    if (length != i2) {
                                        int i3 = 0;
                                        while (true) {
                                            i = i3;
                                            boolean z4 = isEmpty;
                                            if (i >= j) {
                                                z = z4;
                                                break;
                                            }
                                            Object obj2 = this.d;
                                            Object poll = this.a.poll();
                                            isEmpty = poll == null;
                                            if (!a(obj2, isEmpty)) {
                                                if (isEmpty) {
                                                    z = isEmpty;
                                                    break;
                                                }
                                                T value = this.b.getValue(poll);
                                                for (a aVar2 : aVarArr) {
                                                    if (aVar2.get() > 0) {
                                                        aVar2.b.onNext(value);
                                                        aVar2.a(1L);
                                                    }
                                                }
                                                i3 = i + 1;
                                            } else {
                                                return;
                                            }
                                        }
                                        if (i > 0) {
                                            request(i);
                                        }
                                        ?? r32 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                                        z3 = r32;
                                        z3 = r32;
                                        if (r32 != 0 && !z) {
                                        }
                                    } else if (!a(this.d, this.a.poll() == null)) {
                                        request(1L);
                                    } else {
                                        return;
                                    }
                                }
                                synchronized (this) {
                                    try {
                                        if (!this.j) {
                                            this.i = false;
                                            return;
                                        }
                                        this.j = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        z3 = false;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                                z2 = z3;
                                if (!z2) {
                                    synchronized (this) {
                                        this.i = false;
                                    }
                                }
                                throw th;
                            }
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        final b<T> a;
        final Subscriber<? super T> b;

        public a(b<T> bVar, Subscriber<? super T> subscriber) {
            this.a = bVar;
            this.b = subscriber;
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
                        if (j2 < 0 || j != 0) {
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
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                this.a.b();
            }
        }

        public long a(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j2 = get();
                if (j2 == -4611686018427387904L) {
                    throw new IllegalStateException("Produced without request");
                }
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j3 = j2 - j;
                if (j3 < 0) {
                    throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + ")");
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
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.a.b(this);
                this.a.b();
            }
        }
    }
}
