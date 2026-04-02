package rx.subjects;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.BackpressureUtils;
/* loaded from: classes4.dex */
public final class PublishSubject<T> extends Subject<T, T> {
    final b<T> b;

    public static <T> PublishSubject<T> create() {
        return new PublishSubject<>(new b());
    }

    protected PublishSubject(b<T> bVar) {
        super(bVar);
        this.b = bVar;
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
        return this.b.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.b.get() == b.b && this.b.c != null;
    }

    public boolean hasCompleted() {
        return this.b.get() == b.b && this.b.c == null;
    }

    public Throwable getThrowable() {
        if (this.b.get() == b.b) {
            return this.b.c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends AtomicReference<a<T>[]> implements Observable.OnSubscribe<T>, Observer<T> {
        static final a[] a = new a[0];
        static final a[] b = new a[0];
        private static final long serialVersionUID = -7568940796666027140L;
        Throwable c;

        public b() {
            lazySet(a);
        }

        @Override // rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber<? super T> subscriber) {
            a<T> aVar = new a<>(this, subscriber);
            subscriber.add(aVar);
            subscriber.setProducer(aVar);
            if (a(aVar)) {
                if (aVar.isUnsubscribed()) {
                    b(aVar);
                    return;
                }
                return;
            }
            Throwable th = this.c;
            if (th != null) {
                subscriber.onError(th);
            } else {
                subscriber.onCompleted();
            }
        }

        boolean a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == b) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        void b(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr != b && aVarArr != a) {
                    int length = aVarArr.length;
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = a;
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
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // rx.Observer
        public void onNext(T t) {
            for (a<T> aVar : get()) {
                aVar.onNext(t);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.c = th;
            ArrayList arrayList = null;
            for (a<T> aVar : getAndSet(b)) {
                try {
                    aVar.onError(th);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(th2);
                }
            }
            Exceptions.throwIfAny(arrayList);
        }

        @Override // rx.Observer
        public void onCompleted() {
            for (a<T> aVar : getAndSet(b)) {
                aVar.onCompleted();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends AtomicLong implements Observer<T>, Producer, Subscription {
        private static final long serialVersionUID = 6451806817170721536L;
        final b<T> a;
        final Subscriber<? super T> b;
        long c;

        public a(b<T> bVar, Subscriber<? super T> subscriber) {
            this.a = bVar;
            this.b = subscriber;
        }

        @Override // rx.Producer
        public void request(long j) {
            long j2;
            if (BackpressureUtils.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j2, BackpressureUtils.addCap(j2, j)));
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.a.b(this);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                long j2 = this.c;
                if (j != j2) {
                    this.c = 1 + j2;
                    this.b.onNext(t);
                    return;
                }
                unsubscribe();
                this.b.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.b.onError(th);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.b.onCompleted();
            }
        }
    }
}
