package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.internal.util.LinkedArrayList;
import rx.subscriptions.SerialSubscription;
/* loaded from: classes4.dex */
public final class CachedObservable<T> extends Observable<T> {
    private final a<T> b;

    public static <T> CachedObservable<T> from(Observable<? extends T> observable) {
        return from(observable, 16);
    }

    public static <T> CachedObservable<T> from(Observable<? extends T> observable, int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacityHint > 0 required");
        }
        a aVar = new a(observable, i);
        return new CachedObservable<>(new b(aVar), aVar);
    }

    private CachedObservable(Observable.OnSubscribe<T> onSubscribe, a<T> aVar) {
        super(onSubscribe);
        this.b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends LinkedArrayList implements Observer<T> {
        static final c<?>[] d = new c[0];
        final Observable<? extends T> a;
        final SerialSubscription b;
        volatile c<?>[] c;
        final NotificationLite<T> e;
        volatile boolean f;
        boolean g;

        public a(Observable<? extends T> observable, int i) {
            super(i);
            this.a = observable;
            this.c = d;
            this.e = NotificationLite.instance();
            this.b = new SerialSubscription();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void a(c<T> cVar) {
            synchronized (this.b) {
                c<?>[] cVarArr = this.c;
                int length = cVarArr.length;
                c<?>[] cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
                this.c = cVarArr2;
            }
        }

        public void b(c<T> cVar) {
            int i = 0;
            synchronized (this.b) {
                c<?>[] cVarArr = this.c;
                int length = cVarArr.length;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (cVarArr[i].equals(cVar)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        this.c = d;
                        return;
                    }
                    c<?>[] cVarArr2 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, i);
                    System.arraycopy(cVarArr, i + 1, cVarArr2, i, (length - i) - 1);
                    this.c = cVarArr2;
                }
            }
        }

        public void a() {
            Subscriber<T> subscriber = new Subscriber<T>() { // from class: rx.internal.operators.CachedObservable.a.1
                @Override // rx.Observer
                public void onNext(T t) {
                    a.this.onNext(t);
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    a.this.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    a.this.onCompleted();
                }
            };
            this.b.set(subscriber);
            this.a.unsafeSubscribe(subscriber);
            this.f = true;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.g) {
                add(this.e.next(t));
                b();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (!this.g) {
                this.g = true;
                add(this.e.error(th));
                this.b.unsubscribe();
                b();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.g) {
                this.g = true;
                add(this.e.completed());
                this.b.unsubscribe();
                b();
            }
        }

        void b() {
            for (c<?> cVar : this.c) {
                cVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends AtomicBoolean implements Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -2817751667698696782L;
        final a<T> a;

        public b(a<T> aVar) {
            this.a = aVar;
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber<? super T> subscriber) {
            c<T> cVar = new c<>(subscriber, this.a);
            this.a.a(cVar);
            subscriber.add(cVar);
            subscriber.setProducer(cVar);
            if (!get() && compareAndSet(false, true)) {
                this.a.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = -2557562030197141021L;
        final Subscriber<? super T> a;
        final a<T> b;
        Object[] c;
        int d;
        int e;
        boolean f;
        boolean g;

        public c(Subscriber<? super T> subscriber, a<T> aVar) {
            this.a = subscriber;
            this.b = aVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 >= 0) {
                    j3 = j2 + j;
                    if (j3 < 0) {
                        j3 = Long.MAX_VALUE;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(j2, j3));
            a();
        }

        public long a(long j) {
            return addAndGet(-j);
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (get() >= 0 && getAndSet(-1L) >= 0) {
                this.b.b(this);
            }
        }

        public void a() {
            synchronized (this) {
                if (this.f) {
                    this.g = true;
                    return;
                }
                this.f = true;
                try {
                    NotificationLite<T> notificationLite = this.b.e;
                    Subscriber<? super T> subscriber = this.a;
                    while (true) {
                        long j = get();
                        if (j >= 0) {
                            int size = this.b.size();
                            if (size != 0) {
                                Object[] objArr = this.c;
                                if (objArr == null) {
                                    objArr = this.b.head();
                                    this.c = objArr;
                                }
                                int length = objArr.length - 1;
                                int i = this.e;
                                int i2 = this.d;
                                if (j == 0) {
                                    Object obj = objArr[i2];
                                    if (notificationLite.isCompleted(obj)) {
                                        subscriber.onCompleted();
                                        unsubscribe();
                                        return;
                                    } else if (notificationLite.isError(obj)) {
                                        subscriber.onError(notificationLite.getError(obj));
                                        unsubscribe();
                                        return;
                                    }
                                } else if (j > 0) {
                                    int i3 = i;
                                    int i4 = 0;
                                    int i5 = i2;
                                    Object[] objArr2 = objArr;
                                    while (i3 < size && j > 0) {
                                        if (!subscriber.isUnsubscribed()) {
                                            if (i5 == length) {
                                                objArr2 = (Object[]) objArr2[length];
                                                i5 = 0;
                                            }
                                            if (notificationLite.accept(subscriber, objArr2[i5])) {
                                                unsubscribe();
                                                return;
                                            }
                                            i3++;
                                            j--;
                                            i4++;
                                            i5++;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (!subscriber.isUnsubscribed()) {
                                        this.e = i3;
                                        this.d = i5;
                                        this.c = objArr2;
                                        a(i4);
                                    } else {
                                        return;
                                    }
                                }
                            }
                            synchronized (this) {
                                if (!this.g) {
                                    this.f = false;
                                    return;
                                }
                                this.g = false;
                            }
                        } else {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    if (0 == 0) {
                        synchronized (this) {
                            this.f = false;
                        }
                    }
                    throw th;
                }
            }
        }
    }
}
