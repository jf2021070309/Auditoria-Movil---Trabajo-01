package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
/* loaded from: classes4.dex */
public final class OnSubscribePublishMulticast<T> extends AtomicInteger implements Observable.OnSubscribe<T>, Observer<T>, Subscription {
    static final b<?>[] i = new b[0];
    static final b<?>[] j = new b[0];
    private static final long serialVersionUID = -3741892510772238743L;
    final Queue<T> a;
    final int b;
    final boolean c;
    final a<T> d;
    volatile boolean e;
    Throwable f;
    volatile Producer g;
    volatile b<T>[] h;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnSubscribePublishMulticast(int i2, boolean z) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("prefetch > 0 required but it was " + i2);
        }
        this.b = i2;
        this.c = z;
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.a = new SpscArrayQueue(i2);
        } else {
            this.a = new SpscAtomicArrayQueue(i2);
        }
        this.h = i;
        this.d = new a<>(this);
    }

    public void call(Subscriber<? super T> subscriber) {
        b<T> bVar = new b<>(subscriber, this);
        subscriber.add(bVar);
        subscriber.setProducer(bVar);
        if (a((b) bVar)) {
            if (bVar.isUnsubscribed()) {
                b(bVar);
                return;
            } else {
                a();
                return;
            }
        }
        Throwable th = this.f;
        if (th != null) {
            subscriber.onError(th);
        } else {
            subscriber.onCompleted();
        }
    }

    @Override // rx.Observer
    public void onNext(T t) {
        if (!this.a.offer(t)) {
            this.d.unsubscribe();
            this.f = new MissingBackpressureException("Queue full?!");
            this.e = true;
        }
        a();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.f = th;
        this.e = true;
        a();
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.e = true;
        a();
    }

    void a(Producer producer) {
        this.g = producer;
        producer.request(this.b);
    }

    void a() {
        if (getAndIncrement() == 0) {
            Queue<T> queue = this.a;
            int i2 = 0;
            do {
                b<T>[] bVarArr = this.h;
                int length = bVarArr.length;
                int length2 = bVarArr.length;
                long j2 = Long.MAX_VALUE;
                int i3 = 0;
                while (i3 < length2) {
                    i3++;
                    j2 = Math.min(j2, bVarArr[i3].get());
                }
                if (length != 0) {
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z = this.e;
                        T poll = queue.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2)) {
                            if (z2) {
                                break;
                            }
                            for (b<T> bVar : bVarArr) {
                                bVar.a.onNext(poll);
                            }
                            j3 = 1 + j3;
                        } else {
                            return;
                        }
                    }
                    if (j3 != j2 || !a(this.e, queue.isEmpty())) {
                        if (j3 != 0) {
                            Producer producer = this.g;
                            if (producer != null) {
                                producer.request(j3);
                            }
                            for (b<T> bVar2 : bVarArr) {
                                BackpressureUtils.produced(bVar2, j3);
                            }
                        }
                    } else {
                        return;
                    }
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }
    }

    boolean a(boolean z, boolean z2) {
        int i2 = 0;
        if (z) {
            if (this.c) {
                if (z2) {
                    b<T>[] b2 = b();
                    Throwable th = this.f;
                    if (th != null) {
                        int length = b2.length;
                        while (i2 < length) {
                            b2[i2].a.onError(th);
                            i2++;
                        }
                        return true;
                    }
                    int length2 = b2.length;
                    while (i2 < length2) {
                        b2[i2].a.onCompleted();
                        i2++;
                    }
                    return true;
                }
            } else {
                Throwable th2 = this.f;
                if (th2 != null) {
                    this.a.clear();
                    b<T>[] b3 = b();
                    int length3 = b3.length;
                    while (i2 < length3) {
                        b3[i2].a.onError(th2);
                        i2++;
                    }
                    return true;
                } else if (z2) {
                    b<T>[] b4 = b();
                    int length4 = b4.length;
                    while (i2 < length4) {
                        b4[i2].a.onCompleted();
                        i2++;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    b<T>[] b() {
        b<T>[] bVarArr;
        b<T>[] bVarArr2 = this.h;
        if (bVarArr2 != j) {
            synchronized (this) {
                bVarArr = this.h;
                if (bVarArr != j) {
                    this.h = j;
                }
            }
            return bVarArr;
        }
        return bVarArr2;
    }

    boolean a(b<T> bVar) {
        boolean z = false;
        if (this.h != j) {
            synchronized (this) {
                b<T>[] bVarArr = this.h;
                if (bVarArr != j) {
                    int length = bVarArr.length;
                    b<T>[] bVarArr2 = new b[length + 1];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    bVarArr2[length] = bVar;
                    this.h = bVarArr2;
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(b<T> bVar) {
        b<?>[] bVarArr;
        int i2 = 0;
        b<T>[] bVarArr2 = this.h;
        if (bVarArr2 != j && bVarArr2 != i) {
            synchronized (this) {
                b<T>[] bVarArr3 = this.h;
                if (bVarArr3 != j && bVarArr3 != i) {
                    int i3 = -1;
                    int length = bVarArr3.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (bVarArr3[i2] == bVar) {
                            i3 = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i3 >= 0) {
                        if (length == 1) {
                            bVarArr = i;
                        } else {
                            bVarArr = new b[length - 1];
                            System.arraycopy(bVarArr3, 0, bVarArr, 0, i3);
                            System.arraycopy(bVarArr3, i3 + 1, bVarArr, i3, (length - i3) - 1);
                        }
                        this.h = bVarArr;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends Subscriber<T> {
        final OnSubscribePublishMulticast<T> a;

        public a(OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.a = onSubscribePublishMulticast;
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

        @Override // rx.Subscriber
        public void setProducer(Producer producer) {
            this.a.a(producer);
        }
    }

    public Subscriber<T> subscriber() {
        return this.d;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.d.unsubscribe();
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.d.isUnsubscribed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = 960704844171597367L;
        final Subscriber<? super T> a;
        final OnSubscribePublishMulticast<T> b;
        final AtomicBoolean c = new AtomicBoolean();

        public b(Subscriber<? super T> subscriber, OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.a = subscriber;
            this.b = onSubscribePublishMulticast;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j != 0) {
                BackpressureUtils.getAndAddRequest(this, j);
                this.b.a();
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.c.get();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.c.compareAndSet(false, true)) {
                this.b.b(this);
            }
        }
    }
}
