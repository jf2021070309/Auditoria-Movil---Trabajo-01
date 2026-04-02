package rx.internal.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.functions.FuncN;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.plugins.RxJavaHooks;
/* loaded from: classes4.dex */
public final class OnSubscribeCombineLatest<T, R> implements Observable.OnSubscribe<R> {
    final Observable<? extends T>[] a;
    final Iterable<? extends Observable<? extends T>> b;
    final FuncN<? extends R> c;
    final int d;
    final boolean e;

    @Override // rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public OnSubscribeCombineLatest(Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN) {
        this(null, iterable, funcN, RxRingBuffer.SIZE, false);
    }

    public OnSubscribeCombineLatest(Observable<? extends T>[] observableArr, Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN, int i, boolean z) {
        this.a = observableArr;
        this.b = iterable;
        this.c = funcN;
        this.d = i;
        this.e = z;
    }

    public void call(Subscriber<? super R> subscriber) {
        int length;
        Observable<? extends T>[] observableArr;
        Observable<? extends T>[] observableArr2;
        Observable<? extends T>[] observableArr3 = this.a;
        if (observableArr3 == null) {
            if (this.b instanceof List) {
                List list = (List) this.b;
                Observable<? extends T>[] observableArr4 = (Observable[]) list.toArray(new Observable[list.size()]);
                length = observableArr4.length;
                observableArr = observableArr4;
            } else {
                int i = 0;
                Observable<? extends T>[] observableArr5 = new Observable[8];
                for (Observable<? extends T> observable : this.b) {
                    if (i == observableArr5.length) {
                        observableArr2 = new Observable[(i >> 2) + i];
                        System.arraycopy(observableArr5, 0, observableArr2, 0, i);
                    } else {
                        observableArr2 = observableArr5;
                    }
                    observableArr2[i] = observable;
                    i++;
                    observableArr5 = observableArr2;
                }
                observableArr = observableArr5;
                length = i;
            }
        } else {
            length = observableArr3.length;
            observableArr = observableArr3;
        }
        if (length == 0) {
            subscriber.onCompleted();
        } else {
            new b(subscriber, this.c, length, this.d, this.e).a(observableArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T, R> extends AtomicInteger implements Producer, Subscription {
        static final Object n = new Object();
        private static final long serialVersionUID = 8567835998786448817L;
        final Subscriber<? super R> a;
        final FuncN<? extends R> b;
        final a<T, R>[] c;
        final int d;
        final Object[] e;
        final SpscLinkedArrayQueue<Object> f;
        final boolean g;
        volatile boolean h;
        volatile boolean i;
        final AtomicLong j;
        final AtomicReference<Throwable> k;
        int l;
        int m;

        public b(Subscriber<? super R> subscriber, FuncN<? extends R> funcN, int i, int i2, boolean z) {
            this.a = subscriber;
            this.b = funcN;
            this.d = i2;
            this.g = z;
            this.e = new Object[i];
            Arrays.fill(this.e, n);
            this.c = new a[i];
            this.f = new SpscLinkedArrayQueue<>(i2);
            this.j = new AtomicLong();
            this.k = new AtomicReference<>();
        }

        public void a(Observable<? extends T>[] observableArr) {
            a<T, R>[] aVarArr = this.c;
            int length = aVarArr.length;
            for (int i = 0; i < length; i++) {
                aVarArr[i] = new a<>(this, i);
            }
            lazySet(0);
            this.a.add(this);
            this.a.setProducer(this);
            for (int i2 = 0; i2 < length && !this.h; i2++) {
                observableArr[i2].subscribe((Subscriber<? super Object>) aVarArr[i2]);
            }
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
            if (j != 0) {
                BackpressureUtils.getAndAddRequest(this.j, j);
                a();
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (!this.h) {
                this.h = true;
                if (getAndIncrement() == 0) {
                    a(this.f);
                }
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.h;
        }

        void a(Queue<?> queue) {
            queue.clear();
            for (a<T, R> aVar : this.c) {
                aVar.unsubscribe();
            }
        }

        void a(Object obj, int i) {
            int i2;
            boolean z;
            boolean z2 = false;
            a<T, R> aVar = this.c[i];
            synchronized (this) {
                int length = this.e.length;
                Object obj2 = this.e[i];
                int i3 = this.l;
                if (obj2 == n) {
                    i3++;
                    this.l = i3;
                }
                int i4 = i3;
                int i5 = this.m;
                if (obj == null) {
                    int i6 = i5 + 1;
                    this.m = i6;
                    i2 = i6;
                } else {
                    this.e[i] = aVar.c.getValue(obj);
                    i2 = i5;
                }
                z = i4 == length;
                if (i2 == length || (obj == null && obj2 == n)) {
                    z2 = true;
                }
                if (!z2) {
                    if (obj != null && z) {
                        this.f.offer(aVar, this.e.clone());
                    } else if (obj == null && this.k.get() != null && (obj2 == n || !this.g)) {
                        this.i = true;
                    }
                } else {
                    this.i = true;
                }
            }
            if (!z && obj != null) {
                aVar.a(1L);
            } else {
                a();
            }
        }

        void a() {
            long j;
            if (getAndIncrement() == 0) {
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f;
                Subscriber<? super R> subscriber = this.a;
                boolean z = this.g;
                AtomicLong atomicLong = this.j;
                int i = 1;
                while (true) {
                    int i2 = i;
                    if (!a(this.i, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue, z)) {
                        long j2 = atomicLong.get();
                        long j3 = 0;
                        while (true) {
                            j = j3;
                            if (j == j2) {
                                break;
                            }
                            boolean z2 = this.i;
                            a aVar = (a) spscLinkedArrayQueue.peek();
                            boolean z3 = aVar == null;
                            if (!a(z2, z3, subscriber, spscLinkedArrayQueue, z)) {
                                if (z3) {
                                    break;
                                }
                                spscLinkedArrayQueue.poll();
                                Object[] objArr = (Object[]) spscLinkedArrayQueue.poll();
                                if (objArr == null) {
                                    this.h = true;
                                    a(spscLinkedArrayQueue);
                                    subscriber.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                                    return;
                                }
                                try {
                                    subscriber.onNext((R) this.b.call(objArr));
                                    aVar.a(1L);
                                    j3 = 1 + j;
                                } catch (Throwable th) {
                                    this.h = true;
                                    a(spscLinkedArrayQueue);
                                    subscriber.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (j != 0 && j2 != Long.MAX_VALUE) {
                            BackpressureUtils.produced(atomicLong, j);
                        }
                        i = addAndGet(-i2);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        boolean a(boolean z, boolean z2, Subscriber<?> subscriber, Queue<?> queue, boolean z3) {
            if (this.h) {
                a(queue);
                return true;
            }
            if (z) {
                if (z3) {
                    if (z2) {
                        Throwable th = this.k.get();
                        if (th != null) {
                            subscriber.onError(th);
                        } else {
                            subscriber.onCompleted();
                        }
                        return true;
                    }
                } else {
                    Throwable th2 = this.k.get();
                    if (th2 != null) {
                        a(queue);
                        subscriber.onError(th2);
                        return true;
                    } else if (z2) {
                        subscriber.onCompleted();
                        return true;
                    }
                }
            }
            return false;
        }

        void a(Throwable th) {
            Throwable th2;
            Throwable th3;
            AtomicReference<Throwable> atomicReference = this.k;
            do {
                th2 = atomicReference.get();
                if (th2 == null) {
                    th3 = th;
                } else if (th2 instanceof CompositeException) {
                    ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
                    arrayList.add(th);
                    th3 = new CompositeException(arrayList);
                } else {
                    th3 = new CompositeException(Arrays.asList(th2, th));
                }
            } while (!atomicReference.compareAndSet(th2, th3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, R> extends Subscriber<T> {
        final b<T, R> a;
        final int b;
        final NotificationLite<T> c = NotificationLite.instance();
        boolean d;

        public a(b<T, R> bVar, int i) {
            this.a = bVar;
            this.b = i;
            request(bVar.d);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.d) {
                this.a.a(this.c.next(t), this.b);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.d) {
                RxJavaHooks.onError(th);
                return;
            }
            this.a.a(th);
            this.d = true;
            this.a.a(null, this.b);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.d) {
                this.d = true;
                this.a.a(null, this.b);
            }
        }

        public void a(long j) {
            request(j);
        }
    }
}
